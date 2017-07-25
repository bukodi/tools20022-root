package test.gen.mm.struct;

import test.gen.mm.struct.MMConstruct_;
import test.gen.mm.struct.MMBusinessConcept_;
import test.gen.mm.MMBusinessElement;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageElement;
import java.util.List;
import test.gen.mm.MMBusinessElementType;
import test.gen.mm.MMBusinessComponent;

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