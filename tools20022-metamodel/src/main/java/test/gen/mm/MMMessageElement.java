package test.gen.mm;

import test.gen.mm.MMMessageConstruct;
import test.gen.mm.MMMessageConcept;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMBusinessComponent;
import java.util.Optional;
import test.gen.mm.MMBusinessElement;
import test.gen.mm.MMMessageElementContainer;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;

/**
 * Characteristic of a MessageComponent / ChoiceComponent, having a unique
 * meaning within the scope of that MessageComponent / ChoiceComponent
 */
public interface MMMessageElement extends MMMessageConstruct, MMMessageConcept {

	public static interface Members
			extends
				MMMessageConstruct.Members,
				MMMessageConcept.Members {
		/**
		 * a property of a MessageElement indicating whether it has a semantic
		 * relationship to a BusinessComponent / BusinessElement, i.e. whether
		 * it is derived from a BusinessComponent / BusinessElement
		 */
		MetamodelAttribute<MMMessageElement, Boolean> isTechnical = newAttribute();
		/**
		 * the trace of a MessageElement to the BusinessComponent from which it
		 * is derived
		 */
		MetamodelAttribute<MMMessageElement, Optional<MMBusinessComponent>> businessComponentTrace = newAttribute();
		/**
		 * The trace of a MessageElement to the BusinessElement from which the
		 * MessageElement is derived
		 */
		MetamodelAttribute<MMMessageElement, Optional<MMBusinessElement>> businessElementTrace = newAttribute();
		/**
		 * the MessageComponent that describes the context within which the
		 * MessageElement is defined
		 */
		MetamodelAttribute<MMMessageElement, MMMessageElementContainer> componentContext = newAttribute();
		/**
		 * a Property of a MessageElement specifying whether a MessageElement
		 * can be computed using other MessageElements, but that is shown for
		 * clarity even though it adds no semantic information
		 */
		MetamodelAttribute<MMMessageElement, Boolean> isDerived = newAttribute();
		/**
		 * A MessageElement may not trace to both a BusinessComponent and a
		 * BusinessElement businessComponentTrace-&gt;size( ) +
		 * businessElementTrace-&gt;size( ) &lt;= 1
		 */
		MetamodelConstraint<MMMessageElement> checkNoMoreThanOneTrace = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
		/**
		 * A trace can only raise the minimum cardinality and can only lower the
		 * maximum cardinality minOccurs &gt;= businessElementTrace.minOccurs
		 * and (businessElementTrace.maxOccurs.oclIsUndefined() or maxOccurs
		 * &lt;= businessElementTrace.maxOccurs)
		 */
		MetamodelConstraint<MMMessageElement> checkCardinalityAlignment = newConstraint(b -> {
			throw new RuntimeException("Not implemented!");
		});
	}

	public static MetamodelType<MMMessageElement> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageElement.class);
	}

	/**
	 * a property of a MessageElement indicating whether it has a semantic
	 * relationship to a BusinessComponent / BusinessElement, i.e. whether it is
	 * derived from a BusinessComponent / BusinessElement
	 */
	boolean isIsTechnical();

	/**
	 * the trace of a MessageElement to the BusinessComponent from which it is
	 * derived
	 * 
	 * @see MMBusinessComponent#getDerivationElement()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "derivationElement")
	Optional<MMBusinessComponent> getBusinessComponentTrace();

	/**
	 * The trace of a MessageElement to the BusinessElement from which the
	 * MessageElement is derived
	 * 
	 * @see MMBusinessElement#getDerivation()
	 */
	@Opposite(bean = MMBusinessElement.class, attribute = "derivation")
	Optional<MMBusinessElement> getBusinessElementTrace();

	/**
	 * the MessageComponent that describes the context within which the
	 * MessageElement is defined
	 * 
	 * @see MMMessageElementContainer#getMessageElement()
	 */
	@Opposite(bean = MMMessageElementContainer.class, attribute = "messageElement")
	@Container
	MMMessageElementContainer getComponentContext();

	/**
	 * a Property of a MessageElement specifying whether a MessageElement can be
	 * computed using other MessageElements, but that is shown for clarity even
	 * though it adds no semantic information
	 */
	boolean isIsDerived();
}