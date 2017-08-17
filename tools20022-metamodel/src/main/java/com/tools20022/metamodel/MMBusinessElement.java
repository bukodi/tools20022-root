package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMConstruct;
import com.tools20022.metamodel.MMBusinessConcept;
import com.tools20022.metamodel.MMMessageElement;
import java.util.List;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMBusinessElementType;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.metamodel.Container;

/**
 * Property of a BusinessComponent that has a distinctive meaning within the
 * scope of that BusinessComponent.
 */
public interface MMBusinessElement extends MMConstruct, MMBusinessConcept {

	public static MetamodelType<MMBusinessElement> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessElement.class);
	}

	/**
	 * Specifies whether a BusinessElement can be computed using other
	 * BusinessElements, but that is shown for clarity even though it adds no
	 * semantic information.
	 */
	boolean isIsDerived();

	/**
	 * All of the MessageElements that derive from one BusinessElement in a
	 * specific BusinessComponent.
	 * 
	 * @see MMMessageElement#getBusinessElementTrace()
	 */
	@Opposite(bean = MMMessageElement.class, attribute = "businessElementTrace")
	List<MMMessageElement> getDerivation();

	/**
	 * Derived direct reference to the type of the BusinessElement.
	 */
	@Derived
	MMBusinessElementType getBusinessElementType();

	/**
	 * The business context in which the BusinessElement is used
	 * 
	 * @see MMBusinessComponent#getElement()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "element")
	@Container
	MMBusinessComponent getElementContext();
}