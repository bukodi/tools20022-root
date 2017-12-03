package com.tools20022.repogenerator.resulttypes;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.repogenerator.RawRepository;

public class DataTypeResult extends MainTypeResult {

	public DataTypeResult(GenerationContext<RawRepository,GeneratedMetamodelBean> ctx, MMDataType mmBean, StructuredName baseName) {
		super(ctx, mmBean, baseName);
	}

	@Override
	public void flush() {
		super.flush();
	}
	
	

}
