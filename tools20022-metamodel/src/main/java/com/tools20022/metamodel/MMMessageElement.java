package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMMessageConstruct;
import com.tools20022.metamodel.MMMessageConcept;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Optional;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMMessageElementContainer;
import com.tools20022.core.metamodel.Container;

/**
 * Characteristic of a MessageComponent / ChoiceComponent, having a unique
 * meaning within the scope of that MessageComponent / ChoiceComponent
 */
public interface MMMessageElement extends MMMessageConstruct, MMMessageConcept {

	public static MetamodelType<MMMessageElement> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageElement.class);
	}

	/**
	 * a property of a MessageElement indicating whether it has a semantic
	 * relationship to a BusinessComponent / BusinessElement, i.e. whether it is
	 * derived from a BusinessComponent / BusinessElement
	 */
	@Derived
	public boolean isIsTechnical();

	/**
	 * the trace of a MessageElement to the BusinessComponent from which it is
	 * derived
	 * 
	 * @see MMBusinessComponent#getDerivationElement()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "derivationElement")
	public Optional<MMBusinessComponent> getBusinessComponentTrace();

	/**
	 * The trace of a MessageElement to the BusinessElement from which the
	 * MessageElement is derived
	 * 
	 * @see MMBusinessElement#getDerivation()
	 */
	@Opposite(bean = MMBusinessElement.class, attribute = "derivation")
	public Optional<MMBusinessElement> getBusinessElementTrace();

	/**
	 * the MessageComponent that describes the context within which the
	 * MessageElement is defined
	 * 
	 * @see MMMessageElementContainer#getMessageElement()
	 */
	@Opposite(bean = MMMessageElementContainer.class, attribute = "messageElement")
	@Container
	public MMMessageElementContainer getComponentContext();

	/**
	 * a Property of a MessageElement specifying whether a MessageElement can be
	 * computed using other MessageElements, but that is shown for clarity even
	 * though it adds no semantic information
	 */
	public boolean isIsDerived();
}