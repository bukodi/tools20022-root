package com.tools20022.repogenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMRepositoryConcept;

// TODO: replace this with a XMIBackedRepository class
public class RawRepository {

	private final Metamodel metamodel;
	
	private final HashMap<MetamodelType<?>, LinkedHashSet<GeneratedMetamodelBean>> objectsByType = new HashMap<>();

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
		
	void addObject(GeneratedMetamodelBean repoObject ) {
		MetamodelType<? extends GeneratedMetamodelBean> mmType = repoObject.getMetamodel();
		objectsByType.computeIfAbsent(mmType, x->new LinkedHashSet<>()).add(repoObject);
	}

	@SuppressWarnings("unchecked")
	public <B extends GeneratedMetamodelBean> Stream<B> listObjects(MetamodelType<B> mmtype) {
		return (Stream<B>) objectsByType.get(mmtype).stream();
	}

	public Stream<? extends GeneratedMetamodelBean> listObjects() {
		return objectsByType.values().stream().flatMap(l->l.stream());
	}

	@SuppressWarnings("unchecked")
	public <B extends GeneratedMetamodelBean> Stream<? extends B> listObjects(Class<B> mmClass) {
		MetamodelType<B> mmType = metamodel.getTypeByClass(mmClass);
		List<B> repoObjects = new ArrayList<>();
		Set<? extends MetamodelType<? extends B>> subTypes = mmType.getSubTypes(true, true);
		for( MetamodelType<? extends B> subType : subTypes ) {
			LinkedHashSet<GeneratedMetamodelBean> objects = objectsByType.get(subType);
			if( objects == null )
				continue;
			for( GeneratedMetamodelBean obj : objects ) {
				repoObjects.add((B)obj);
			}
		}
		return repoObjects.stream();
		
//		return (Stream<? extends B>) mmType.listSubTypes(true, true).flatMap(st-> ojectsByType.get(st).stream());		 
	}

	public int getCountByType(MetamodelType<?> mmType) {
		LinkedHashSet<GeneratedMetamodelBean> set = objectsByType.get(mmType);
		return set == null ? 0 : set.size();
	}

	public Stream<? extends GeneratedMetamodelBean> listContent( GeneratedMetamodelBean container, boolean includeThis, boolean recursive ) {
		Stream<? extends GeneratedMetamodelBean> subTreeStream;
		if (recursive) {
			subTreeStream = listContent( container,false, false).flatMap(c -> listContent(c, true, true));
		} else {
			// Collect direct content
			subTreeStream = listDirectContent(container);
		}

		if (includeThis) {
			subTreeStream = Stream.concat(Stream.of(container), subTreeStream);
		}

		return subTreeStream;
		
	}

	private Stream<? extends GeneratedMetamodelBean> listDirectContent( GeneratedMetamodelBean mmContainer ) {
		List<GeneratedMetamodelBean> ret = new ArrayList<>();
		for (MetamodelAttribute<?, ?> mmAttr : mmContainer.getMetamodel().getAllAttributes()) {
			if( mmAttr.getReferencedType() == null || mmAttr.isDerived() || ! mmAttr.isContainment() )
				continue;
		
			Object value = mmAttr.get(mmContainer);
			if( value == null )
				continue;
			
			if( value instanceof GeneratedMetamodelBean ) {
				ret.add((GeneratedMetamodelBean) value);
			} else if( value instanceof Optional<?> && ((Optional<?>)value).isPresent()) {
				Object value2 = ((Optional<?>)value).get();
				if( value2 instanceof GeneratedMetamodelBean )
					ret.add((GeneratedMetamodelBean) value2);
			} else if( value instanceof List) {
				for(Object elem : (List<?>)value) {
					if( elem instanceof GeneratedMetamodelBean )
						ret.add((GeneratedMetamodelBean) elem);
				}
			} else {
				throw new IllegalStateException( "Invalid value in " + mmContainer + " in attribute " + mmAttr );
			}
		};
		return ret.stream();
	}
	
	public <T extends MMRepositoryConcept> T findObjectByTypeAndName( Class<T> type, String name ) {
		MetamodelType<T> mmType = metamodel.getTypeByClass(type);
		for( GeneratedMetamodelBean obj : objectsByType.get(mmType) ) {
			if( ! (obj instanceof MMRepositoryConcept ))
				continue;
			String objName = ((MMRepositoryConcept)obj).getName();
			if( name.equals(objName)) {
				return (T)obj;
			}
		}
		throw new NoSuchElementException("type=" + type.getSimpleName()+", name=" + name);
	}
	
}
