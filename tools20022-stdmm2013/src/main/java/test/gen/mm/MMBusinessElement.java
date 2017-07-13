package test.gen.mm;

import test.gen.mm.MMConstruct;
import test.gen.mm.MMBusinessConcept;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageElement;
import java.util.List;
import test.gen.mm.MMBusinessElementType;
import test.gen.mm.MMBusinessComponent;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;

/**
 * Property of a BusinessComponent that has a distinctive meaning within the
 * scope of that BusinessComponent.
 */
public interface MMBusinessElement extends MMConstruct, MMBusinessConcept {

	public static interface Members
			extends
				MMConstruct.Members,
				MMBusinessConcept.Members {
		/**
		 * Specifies whether a BusinessElement can be computed using other
		 * BusinessElements, but that is shown for clarity even though it adds
		 * no semantic information.
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