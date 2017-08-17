package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import java.util.function.Function;
import com.tools20022.metamodel.MMRepositoryType;

/**
 * Calculate derived attribute {@link MMMessageBuildingBlock#getMemberType()}
 */
public class DeriveMMMessageBuildingBlock_memberType
		implements
			Function<MMMessageBuildingBlock, MMRepositoryType> {

	/**
	 * The type of this Member
	 */
	@Override
	public MMRepositoryType apply(MMMessageBuildingBlock mmBean) {
		if( mmBean.getSimpleType().isPresent() ) {
			return mmBean.getSimpleType().get();			
		} else if( mmBean.getComplexType().isPresent() ) {
			return mmBean.getComplexType().get();			
		} else {
			throw new IllegalStateException("Both simpleType and complexType absent");
		}
	}
}