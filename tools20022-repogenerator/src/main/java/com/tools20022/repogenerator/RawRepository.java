package com.tools20022.repogenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import com.tools20022.core.metamodel.Metamodel;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMRepositoryConcept;

// TODO: replace this with a XMIBackedRepository class
public class RawRepository {

	private final Metamodel metamodel;

	private final HashMap<MetamodelType<?>, LinkedHashSet<MMModelEntity>> objectsByType = new HashMap<>();

	public class IncominRef {
		public final MMModelEntity sourceObj;
		public final MetamodelAttribute<?, ?> mmAttr;

		private IncominRef(MMModelEntity mmSource, MetamodelAttribute<?, ?> mmAttr) {
			this.sourceObj = mmSource;
			this.mmAttr = mmAttr;
		}
		
		public MMModelEntity getTarget() {
			return (MMModelEntity) mmAttr.get(sourceObj);
		}
	}

	private final HashMap<MMModelEntity, Set<IncominRef>> incomingRefs = new HashMap<>();

	private final MMRepository rootObject;

	RawRepository(Metamodel metamodel, MMRepository rootObject) {
		this.metamodel = metamodel;
		this.rootObject = rootObject;
	}

	public Metamodel getMetamodel() {
		return metamodel;
	}

	public MMRepository getRootObject() {
		return rootObject;
	}

	void addObjects(Set<MMModelEntity> repoObjects) {
		for (MMModelEntity repoObject : repoObjects) {
			MetamodelType<? extends MMModelEntity> mmType = repoObject.getMetamodel();
			objectsByType.computeIfAbsent(mmType, x -> new LinkedHashSet<>()).add(repoObject);
		}

		/*** Build incomingRefs ***/
		for (MMModelEntity repoObject : repoObjects) {
			MetamodelType<? extends MMModelEntity> mt = repoObject.getMetamodel();
			for (MetamodelAttribute<?, ?> ma : mt.getAllAttributes()) {
				if (ma.getReferencedType() == null)
					continue;
				Object value = ma.get(repoObject);
				if (value instanceof MMModelEntity) {
					addIncomingRef(repoObject, ma, value);
				} else if (value instanceof Collection<?>) {
					Collection<?> list = (Collection<?>) value;
					for (Object elem : list) {
						addIncomingRef(repoObject, ma, elem);
					}
				} else if (value instanceof Optional<?>) {
					if (((Optional<?>) value).isPresent()) {
						Object v = ((Optional<?>) value).get();
						addIncomingRef(repoObject, ma, v);
					}
				} else {
					throw new RuntimeException("Invalid object type: " + value);
				}
			}
		}
	}

	private void addIncomingRef(MMModelEntity source, MetamodelAttribute<?, ?> ma, Object targetObj) {
		if (!(targetObj instanceof MMModelEntity)) {
			return;
		}
		MMModelEntity target = (MMModelEntity) targetObj;
		IncominRef ref = new IncominRef(source, ma);
		incomingRefs.computeIfAbsent(target, x -> new HashSet<>()).add(ref);
	}

	@SuppressWarnings("unchecked")
	public <B extends MMModelEntity> Stream<B> listObjects(MetamodelType<B> mmtype) {
		LinkedHashSet<B> objs = (LinkedHashSet<B>) objectsByType.get(mmtype);
		if (objs == null)
			return Stream.empty();
		else
			return objs.stream();
	}

	public Stream<? extends MMModelEntity> listObjects() {
		return objectsByType.values().stream().flatMap(l -> l.stream());
	}

	@SuppressWarnings("unchecked")
	public <B extends MMModelEntity> List<? extends B> getObjects(Class<B> mmClass) {
		MetamodelType<B> mmType = metamodel.getTypeByClass(mmClass);
		List<B> repoObjects = new ArrayList<>();
		Set<? extends MetamodelType<? extends B>> subTypes = mmType.getSubTypes(true, true);
		for (MetamodelType<? extends B> subType : subTypes) {
			LinkedHashSet<MMModelEntity> objects = objectsByType.get(subType);
			if (objects == null)
				continue;
			for (MMModelEntity obj : objects) {
				repoObjects.add((B) obj);
			}
		}
		return repoObjects;
	}

	public int getCountByType(MetamodelType<?> mmType) {
		LinkedHashSet<MMModelEntity> set = objectsByType.get(mmType);
		return set == null ? 0 : set.size();
	}

	public Set<IncominRef> getIncomingRefs(MMModelEntity obj) {
		return incomingRefs.computeIfAbsent(obj, x -> Collections.emptySet());
	}

	public Stream<? extends MMModelEntity> listContent(MMModelEntity container, boolean includeThis,
			boolean recursive) {
		Stream<? extends MMModelEntity> subTreeStream;
		if (recursive) {
			subTreeStream = listContent(container, false, false).flatMap(c -> listContent(c, true, true));
		} else {
			// Collect direct content
			subTreeStream = listDirectContent(container);
		}

		if (includeThis) {
			subTreeStream = Stream.concat(Stream.of(container), subTreeStream);
		}

		return subTreeStream;

	}

	private Stream<? extends MMModelEntity> listDirectContent(MMModelEntity mmContainer) {
		List<MMModelEntity> ret = new ArrayList<>();
		for (MetamodelAttribute<?, ?> mmAttr : mmContainer.getMetamodel().getAllAttributes()) {
			if (mmAttr.getReferencedType() == null || mmAttr.isDerived() || !mmAttr.isContainment())
				continue;

			Object value = mmAttr.get(mmContainer);
			if (value == null)
				continue;

			if (value instanceof MMModelEntity) {
				ret.add((MMModelEntity) value);
			} else if (value instanceof Optional<?> && ((Optional<?>) value).isPresent()) {
				Object value2 = ((Optional<?>) value).get();
				if (value2 instanceof MMModelEntity)
					ret.add((MMModelEntity) value2);
			} else if (value instanceof List) {
				for (Object elem : (List<?>) value) {
					if (elem instanceof MMModelEntity)
						ret.add((MMModelEntity) elem);
				}
			} else {
				throw new IllegalStateException("Invalid value in " + mmContainer + " in attribute " + mmAttr);
			}
		}
		;
		return ret.stream();
	}

	public <T extends MMRepositoryConcept> T findObjectByTypeAndName(Class<T> type, String name) {
		MetamodelType<T> mmType = metamodel.getTypeByClass(type);
		for (MMModelEntity obj : objectsByType.get(mmType)) {
			if (!(obj instanceof MMRepositoryConcept))
				continue;
			String objName = ((MMRepositoryConcept) obj).getName();
			if (name.equals(objName)) {
				return (T) obj;
			}
		}
		throw new NoSuchElementException("type=" + type.getSimpleName() + ", name=" + name);
	}
	
	public Set<IncominRef> whereUsed( MMModelEntity repoObj ) {
		return incomingRefs.computeIfAbsent(repoObj, x->Collections.emptySet());
	}

	public Set<IncominRef> whereUsedWithoutContainment( MMModelEntity repoObj ) {
		Set<IncominRef> ret = new HashSet<>();
		for( IncominRef ir : incomingRefs.computeIfAbsent(repoObj, x->Collections.emptySet()) ) {
			if( ir.mmAttr.isContainer()  )
				continue;
			ret.add(ir);
		}
		return ret;
	}
}
