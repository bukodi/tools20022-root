package com.tools20022.repogenerator.resulttypes;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.generators.GenerationResult;

public class AttrResult extends GenerationResult {

	public final TypeResult containerGen;
	public final MetamodelAttribute<?, ?> mmAttr;
	public String initializationSource;
	public String valueAsJavaDoc;
	
	protected AttrResult(TypeResult containerGen, MetamodelAttribute<?, ?> mmAttr) {
		super(containerGen.ctx);
		this.containerGen = containerGen;
		this.mmAttr = mmAttr;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

}
