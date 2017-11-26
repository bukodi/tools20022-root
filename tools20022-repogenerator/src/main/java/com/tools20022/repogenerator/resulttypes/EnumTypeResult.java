package com.tools20022.repogenerator.resulttypes;

import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMCodeSet;

public class EnumTypeResult extends MainTypeResult {

	public EnumTypeResult(GenerationContext<?> ctx, MMCodeSet mmBean, StructuredName baseName) {
		super(ctx, mmBean, baseName);
	}

	@Override
	public void flush() {
		super.flush();
	}

}
