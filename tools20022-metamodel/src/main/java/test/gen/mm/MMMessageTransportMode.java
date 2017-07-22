package test.gen.mm;

import test.gen.mm.MMTopLevelCatalogueEntry;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMDeliveryAssurance;
import test.gen.mm.MMDurability;
import test.gen.mm.MMMessageCasting;
import test.gen.mm.MMMessageDeliveryOrder;
import test.gen.mm.MMMessageValidationLevel;
import test.gen.mm.MMMessageValidationOnOff;
import test.gen.mm.MMMessageValidationResults;
import test.gen.mm.MMReceiverAsynchronicity;
import test.gen.mm.MMSenderAsynchronicity;
import test.gen.mm.MMBusinessTransaction;
import java.util.List;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import test.gen.mm.MMBusinessProcessCatalogue;
import java.util.Optional;
import test.gen.mm.MMSemanticMarkup;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * group of settings for the values for the MessageTransportCharacteristics
 * properties
 */
public class MMMessageTransportMode implements MMTopLevelCatalogueEntry {

	private GeneratedMetamodelBean container;
	private String boundedCommunicationDelay;
	private String maximumClockVariation;
	private Integer maximumMessageSize;
	private String messageDeliveryWindow;
	private String messageSendingWindow;
	private MMDeliveryAssurance deliveryAssurance;
	private MMDurability durability;
	private MMMessageCasting messageCasting;
	private MMMessageDeliveryOrder messageDeliveryOrder;
	private MMMessageValidationLevel messageValidationLevel;
	private MMMessageValidationOnOff messageValidationOnOff;
	private MMMessageValidationResults messageValidationResults;
	private MMReceiverAsynchronicity receiverAsynchronicity;
	private MMSenderAsynchronicity senderAsynchronicity;
	private List<MMBusinessTransaction> businessTransaction;
	private MMBusinessProcessCatalogue businessProcessCatalogue;
	private String name;
	private Optional<String> definition;
	private List<MMSemanticMarkup> semanticMarkup;
	private List<MMDoclet> doclet;
	private List<String> example;
	private List<MMConstraint> constraint;
	private MMRegistrationStatus registrationStatus;
	private Optional<Date> removalDate;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	public static interface Members extends MMTopLevelCatalogueEntry.Members {
		/**
		 * the maximum duration of time within which a TransportMessage must be
		 * delivered
		 */
		MetamodelAttribute<MMMessageTransportMode, String> boundedCommunicationDelay = newAttribute();
		/**
		 * clocks must maintain a maximum (inclusive) variance from UTC for the
		 * supported MessageTransportMode
		 */
		MetamodelAttribute<MMMessageTransportMode, String> maximumClockVariation = newAttribute();
		/**
		 * the maximum size of a TransportMessage in kilobytes (any positive
		 * integer greater than zero).
		 */
		MetamodelAttribute<MMMessageTransportMode, Integer> maximumMessageSize = newAttribute();
		/**
		 * the MessageDeliveryOrder is relaxed by a rolling window of time in
		 * which the Transport Messages may be delivered out of order whereby
		 * for each TransportMessage delivered it defines the maximum duration
		 * of time it may be out of sequence within
		 */
		MetamodelAttribute<MMMessageTransportMode, String> messageDeliveryWindow = newAttribute();
		/**
		 * the Choreography is relaxed by a rolling window of time in which the
		 * Business Messages may be sent out of order whereby for each Business
		 * Message sent it defines the maximum duration of time it may be out of
		 * sequence with
		 */
		MetamodelAttribute<MMMessageTransportMode, String> messageSendingWindow = newAttribute();
		/**
		 * the degree to which the sending MessagingEndpoint is assured that a
		 * TransportMessage will be delivered
		 */
		MetamodelAttribute<MMMessageTransportMode, MMDeliveryAssurance> deliveryAssurance = newAttribute();
		/**
		 * whether the MessageTransportSystem safely retains a TransportMessage
		 * until it has been received by the destination MessagingEndpoint
		 */
		MetamodelAttribute<MMMessageTransportMode, MMDurability> durability = newAttribute();
		/**
		 * specifies how receiving MessagingEndpoints may be addressed in a
		 * TransportMessage
		 */
		MetamodelAttribute<MMMessageTransportMode, MMMessageCasting> messageCasting = newAttribute();
		/**
		 * indicates to what extent Transport Messages from a sending
		 * MessagingEndpoint arrive in the order in which they were sent at the
		 * receiving MessagingEndpoints
		 */
		MetamodelAttribute<MMMessageTransportMode, MMMessageDeliveryOrder> messageDeliveryOrder = newAttribute();
		/**
		 * the level of validation the MessageTransportSystem has tested the
		 * message
		 */
		MetamodelAttribute<MMMessageTransportMode, MMMessageValidationLevel> messageValidationLevel = newAttribute();
		/**
		 * specifies whether the MessageTransportSystem validates the
		 * MessageInstance with respect to SyntaxMessageScheme, Constraints, the
		 * MarketPractices, and the MessageChoreography
		 */
		MetamodelAttribute<MMMessageTransportMode, MMMessageValidationOnOff> messageValidationOnOff = newAttribute();
		/**
		 * specifies how the MessageTransport System acts upon the results of
		 * MessageValidationOnOff
		 */
		MetamodelAttribute<MMMessageTransportMode, MMMessageValidationResults> messageValidationResults = newAttribute();
		/**
		 * indicates whether a receiving MessagingEndpoint blocks the sending
		 * and receipt of other Transport Messages until it sends a response to
		 * this TransportMessage
		 */
		MetamodelAttribute<MMMessageTransportMode, MMReceiverAsynchronicity> receiverAsynchronicity = newAttribute();
		/**
		 * indicates whether a sending MessagingEndpoint blocks after sending a
		 * TransportMessage to the MessageTransportSystem while waiting for a
		 * response from a MessagingEndpoint
		 */
		MetamodelAttribute<MMMessageTransportMode, MMSenderAsynchronicity> senderAsynchronicity = newAttribute();
		/**
		 * specifies the BusinessTransaction for which a set of
		 * MessageTransportMode characteristics apply
		 */
		MetamodelAttribute<MMMessageTransportMode, List<MMBusinessTransaction>> businessTransaction = newAttribute();
	}

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