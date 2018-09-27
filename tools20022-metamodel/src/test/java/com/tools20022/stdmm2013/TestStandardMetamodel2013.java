package com.tools20022.stdmm2013;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.function.Consumer;

import org.junit.Test;

import com.tools20022.core.metamodel.Metamodel;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.StandardMetamodel2013;

public class TestStandardMetamodel2013 {

	static Metamodel metamodel = StandardMetamodel2013.metamodel(); 

	static HashSet<MetamodelAttribute<?, ?>> skipAttrs = new HashSet<>();
	
	static {
		skipAttrs.add(MMModelEntity.nextVersionsAttribute);
		skipAttrs.add(MMModelEntity.previousVersionAttribute);
		skipAttrs.add(MMRepositoryConcept.semanticMarkupsAttribute);
		skipAttrs.add(MMRepositoryConcept.docletsAttribute);		
	}

	
	@Test
	public void listAllRefs() throws Exception {
		for( MetamodelType<? extends MMModelEntity> mmType : metamodel.getAllTypes() ) {
			for( MetamodelAttribute<? extends MMModelEntity, ?> mmAttr : mmType.getDeclaredAttributes() ) {
				if( mmAttr.getReferencedType() == null )
					continue;
				if( mmAttr.isContainer() )
					continue;
				if( mmAttr.isDerived() )
					continue;

				System.out.println( mmAttr.getDeclaringType().getName() + "." + mmAttr.getName() + " : " + mmAttr.getReferencedType().getName()) ;
			}
		}
	}
	
	@Test
	public void testPathsFromMMMesageDefinition() {
		
		Consumer<ArrayList<MetamodelAttribute<?, ?>>> endOfPathHandler = path-> {
			String tab = "";
			for( MetamodelAttribute<?, ?> step : path ) {
				System.out.println( tab + step.getDeclaringType().getName() + "." + step.getName() );
				tab += "  ";
			}
		};
		
		MetamodelType<MMMessageDefinition> mmMsgDef = metamodel.getTypeByClass(MMMessageDefinition.class);
				
		for( MetamodelAttribute<? super MMMessageDefinition, ?> mmAttr : mmMsgDef.getAllAttributes() ) {
			if( mmAttr.getReferencedType() == null )
				continue;
			if( mmAttr.isContainer() )
				continue;
						
			ArrayList<MetamodelAttribute<?, ?>> path = new ArrayList<>(100);
			path.add(mmAttr);
			extendPath(path, endOfPathHandler);
		}
		
	}
	
	
	private void extendPath( ArrayList<MetamodelAttribute<?, ?>> path, Consumer<ArrayList<MetamodelAttribute<?, ?>>> endOfPathHandler ) {
		MetamodelType<?> lastType = path.get(path.size()-1).getReferencedType();
		HashSet<String> typeNamesInPath = new HashSet<>();
		path.forEach(a-> typeNamesInPath.add( a.getDeclaringType().getName() ) );
		typeNamesInPath.add(lastType.getName());
		
		for( MetamodelAttribute<?, ?> mmAttr : lastType.getAllAttributes() ) {
			if( mmAttr.isContainer() )
				continue;
			if( skipAttrs.contains(mmAttr))
				continue;
			
			MetamodelType<?> refType = mmAttr.getReferencedType(); 
			if( refType == null )
				continue;		
			
			if( typeNamesInPath.contains(refType.getName()))
				continue;
						
			path.add(mmAttr);
			extendPath(path, endOfPathHandler);
			path.remove(path.size()-1);			
		}
		endOfPathHandler.accept( path );
	}
	
	
	
	

}
