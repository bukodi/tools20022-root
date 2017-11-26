package com.tools20022.repogenerator.resulttypes;

import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMDataType;

public class DataTypeResult extends MainTypeResult {

	public DataTypeResult(GenerationContext<?> ctx, MMDataType mmBean, StructuredName baseName) {
		super(ctx, mmBean, baseName);
	}

	@Override
	public void flush() {
		super.flush();
	}
	
	

}
