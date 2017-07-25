package com.tools20022.repogenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepository;

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

}
