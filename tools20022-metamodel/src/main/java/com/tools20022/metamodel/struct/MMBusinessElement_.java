package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMConstruct_;
import com.tools20022.metamodel.struct.MMBusinessConcept_;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMessageElement;
import java.util.List;
import com.tools20022.metamodel.MMBusinessElementType;
import com.tools20022.metamodel.MMBusinessComponent;

public interface MMBusinessElement_ extends MMConstruct_, MMBusinessConcept_ {

	/**
	 * Specifies whether a BusinessElement can be computed using other
	 * BusinessElements, but that is shown for clarity even though it adds no
	 * semantic information.
	 */
	MetamodelAttribute<MMBusinessElement, Boolean> isDerived = newAttribute();
	/**
	 * All of the MessageElements that derive from one BusinessElement in a
	 * specific BusinessComponent.
	 */
	MetamodelAttribute<MMBusinessElement, List<MMMessageElement>> derivation = newAttribute();
	/**
	 * Derived direct reference to the type of the BusinessElement.
	 */
	MetamodelAttribute<MMBusinessElement, MMBusinessElementType> businessElementType = newAttribute();
	/**
	 * The business context in which the BusinessElement is used
	 */
	MetamodelAttribute<MMBusinessElement, MMBusinessComponent> elementContext = newAttribute();
}