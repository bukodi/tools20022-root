package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMDeliveryAssurance;
import com.tools20022.metamodel.MMDurability;
import com.tools20022.metamodel.MMMessageCasting;
import com.tools20022.metamodel.MMMessageDeliveryOrder;
import com.tools20022.metamodel.MMMessageValidationLevel;
import com.tools20022.metamodel.MMMessageValidationOnOff;
import com.tools20022.metamodel.MMMessageValidationResults;
import com.tools20022.metamodel.MMReceiverAsynchronicity;
import com.tools20022.metamodel.MMSenderAsynchronicity;
import com.tools20022.metamodel.MMBusinessTransaction;
import java.util.List;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import java.util.Optional;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * group of settings for the values for the MessageTransportCharacteristics
 * properties
 */
public class MMMessageTransportMode implements MMTopLevelCatalogueEntry {

	private GeneratedMetamodelBean container;
	protected String boundedCommunicationDelay;
	protected String maximumClockVariation;
	protected Integer maximumMessageSize;
	protected String messageDeliveryWindow;
	protected String messageSendingWindow;
	protected MMDeliveryAssurance deliveryAssurance;
	protected MMDurability durability;
	protected MMMessageCasting messageCasting;
	protected MMMessageDeliveryOrder messageDeliveryOrder;
	protected MMMessageValidationLevel messageValidationLevel;
	protected MMMessageValidationOnOff messageValidationOnOff;
	protected MMMessageValidationResults messageValidationResults;
	protected MMReceiverAsynchronicity receiverAsynchronicity;
	protected MMSenderAsynchronicity senderAsynchronicity;
	protected List<MMBusinessTransaction> businessTransaction;
	protected MMBusinessProcessCatalogue businessProcessCatalogue;
	protected String name;
	protected Optional<String> definition;
	protected List<MMSemanticMarkup> semanticMarkup;
	protected List<MMDoclet> doclet;
	protected List<String> example;
	protected List<MMConstraint> constraint;
	protected MMRegistrationStatus registrationStatus;
	protected Optional<Date> removalDate;
	protected List<MMModelEntity> nextVersions;
	protected Optional<MMModelEntity> previousVersion;
	protected Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMMessageTransportMode> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageTransportMode> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageTransportMode.class);
	}

	/**
	 * the maximum duration of time within which a TransportMessage must be
	 * delivered
	 */
	public String getBoundedCommunicationDelay() {
		return boundedCommunicationDelay;
	}

	/**
	 * clocks must maintain a maximum (inclusive) variance from UTC for the
	 * supported MessageTransportMode
	 */
	public String getMaximumClockVariation() {
		return maximumClockVariation;
	}

	/**
	 * the maximum size of a TransportMessage in kilobytes (any positive integer
	 * greater than zero).
	 */
	public Integer getMaximumMessageSize() {
		return maximumMessageSize;
	}

	/**
	 * the MessageDeliveryOrder is relaxed by a rolling window of time in which
	 * the Transport Messages may be delivered out of order whereby for each
	 * TransportMessage delivered it defines the maximum duration of time it may
	 * be out of sequence within
	 */
	public String getMessageDeliveryWindow() {
		return messageDeliveryWindow;
	}

	/**
	 * the Choreography is relaxed by a rolling window of time in which the
	 * Business Messages may be sent out of order whereby for each Business
	 * Message sent it defines the maximum duration of time it may be out of
	 * sequence with
	 */
	public String getMessageSendingWindow() {
		return messageSendingWindow;
	}

	/**
	 * the degree to which the sending MessagingEndpoint is assured that a
	 * TransportMessage will be delivered
	 */
	public MMDeliveryAssurance getDeliveryAssurance() {
		return deliveryAssurance;
	}

	/**
	 * whether the MessageTransportSystem safely retains a TransportMessage
	 * until it has been received by the destination MessagingEndpoint
	 */
	public MMDurability getDurability() {
		return durability;
	}

	/**
	 * specifies how receiving MessagingEndpoints may be addressed in a
	 * TransportMessage
	 */
	public MMMessageCasting getMessageCasting() {
		return messageCasting;
	}

	/**
	 * indicates to what extent Transport Messages from a sending
	 * MessagingEndpoint arrive in the order in which they were sent at the
	 * receiving MessagingEndpoints
	 */
	public MMMessageDeliveryOrder getMessageDeliveryOrder() {
		return messageDeliveryOrder;
	}

	/**
	 * the level of validation the MessageTransportSystem has tested the message
	 */
	public MMMessageValidationLevel getMessageValidationLevel() {
		return messageValidationLevel;
	}

	/**
	 * specifies whether the MessageTransportSystem validates the
	 * MessageInstance with respect to SyntaxMessageScheme, Constraints, the
	 * MarketPractices, and the MessageChoreography
	 */
	public MMMessageValidationOnOff getMessageValidationOnOff() {
		return messageValidationOnOff;
	}

	/**
	 * specifies how the MessageTransport System acts upon the results of
	 * MessageValidationOnOff
	 */
	public MMMessageValidationResults getMessageValidationResults() {
		return messageValidationResults;
	}

	/**
	 * indicates whether a receiving MessagingEndpoint blocks the sending and
	 * receipt of other Transport Messages until it sends a response to this
	 * TransportMessage
	 */
	public MMReceiverAsynchronicity getReceiverAsynchronicity() {
		return receiverAsynchronicity;
	}

	/**
	 * indicates whether a sending MessagingEndpoint blocks after sending a
	 * TransportMessage to the MessageTransportSystem while waiting for a
	 * response from a MessagingEndpoint
	 */
	public MMSenderAsynchronicity getSenderAsynchronicity() {
		return senderAsynchronicity;
	}

	/**
	 * specifies the BusinessTransaction for which a set of MessageTransportMode
	 * characteristics apply
	 * 
	 * @see MMBusinessTransaction#getMessageTransportMode()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "messageTransportMode")
	public List<MMBusinessTransaction> getBusinessTransaction() {
		return businessTransaction;
	}

	@Override
	public MMBusinessProcessCatalogue getBusinessProcessCatalogue() {
		return businessProcessCatalogue;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Optional<String> getDefinition() {
		return definition;
	}

	@Override
	public List<MMSemanticMarkup> getSemanticMarkup() {
		return semanticMarkup;
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet;
	}

	@Override
	public List<String> getExample() {
		return example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint;
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate;
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions;
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion;
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier;
	}
}