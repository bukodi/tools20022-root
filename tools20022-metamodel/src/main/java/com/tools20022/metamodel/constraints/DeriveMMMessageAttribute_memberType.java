package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMMessageAttribute;
import java.util.function.Function;
import com.tools20022.metamodel.MMRepositoryType;

/**
 * Calculate derived attribute {@link MMMessageAttribute#getMemberType()}
 */
public class DeriveMMMessageAttribute_memberType
		implements
			Function<MMMessageAttribute, MMRepositoryType> {

	/**
	 * The type of this Member
	 */
	@Override
	public MMRepositoryType apply(MMMessageAttribute mmBean) {
		if( mmBean.getSimpleType().isPresent() ) {
			return mmBean.getSimpleType().get();			
		} else if( mmBean.getComplexType().isPresent() ) {
			return mmBean.getComplexType().get();			
		} else {
			throw new IllegalStateException("Both simpleType and complexType absent");
		}
	}
}