/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.metamodel;

import com.tools20022.core.metamodel.EMFName;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * group of settings for the values for the MessageTransportCharacteristics
 * properties
 */
public class MMMessageTransportMode implements MMTopLevelCatalogueEntry {

	/**
	 * the maximum duration of time within which a TransportMessage must be
	 * delivered
	 */
	public final static MetamodelAttribute<MMMessageTransportMode, String> boundedCommunicationDelayAttribute = newAttribute();
	/**
	 * clocks must maintain a maximum (inclusive) variance from UTC for the
	 * supported MessageTransportMode
	 */
	public final static MetamodelAttribute<MMMessageTransportMode, String> maximumClockVariationAttribute = newAttribute();
	/**
	 * the maximum size of a TransportMessage in kilobytes (any positive integer
	 * greater than zero).
	 */
	public final static MetamodelAttribute<MMMessageTransportMode, Integer> maximumMessageSizeAttribute = newAttribute();
	/**
	 * the MessageDeliveryOrder is relaxed by a rolling window of time in which
	 * the Transport Messages may be delivered out of order whereby for each
	 * TransportMessage delivered it defines the maximum duration of time it may
	 * be out of sequence within
	 */
	public final static MetamodelAttribute<MMMessageTransportMode, String> messageDeliveryWindowAttribute = newAttribute();
	/**
	 * the Choreography is relaxed by a rolling window of time in which the
	 * Business Messages may be sent out of order whereby for each Business
	 * Message sent it defines the maximum duration of time it may be out of
	 * sequence with
	 */
	public final static MetamodelAttribute<MMMessageTransportMode, String> messageSendingWindowAttribute = newAttribute();
	/**
	 * the degree to which the sending MessagingEndpoint is assured that a
	 * TransportMessage will be delivered
	 */
	public final static MetamodelAttribute<MMMessageTransportMode, MMDeliveryAssurance> deliveryAssuranceAttribute = newAttribute();
	/**
	 * whether the MessageTransportSystem safely retains a TransportMessage
	 * until it has been received by the destination MessagingEndpoint
	 */
	public final static MetamodelAttribute<MMMessageTransportMode, MMDurability> durabilityAttribute = newAttribute();
	/**
	 * specifies how receiving MessagingEndpoints may be addressed in a
	 * TransportMessage
	 */
	public final static MetamodelAttribute<MMMessageTransportMode, MMMessageCasting> messageCastingAttribute = newAttribute();
	/**
	 * indicates to what extent Transport Messages from a sending
	 * MessagingEndpoint arrive in the order in which they were sent at the
	 * receiving MessagingEndpoints
	 */
	public final static MetamodelAttribute<MMMessageTransportMode, MMMessageDeliveryOrder> messageDeliveryOrderAttribute = newAttribute();
	/**
	 * the level of validation the MessageTransportSystem has tested the message
	 */
	public final static MetamodelAttribute<MMMessageTransportMode, MMMessageValidationLevel> messageValidationLevelAttribute = newAttribute();
	/**
	 * specifies whether the MessageTransportSystem validates the
	 * MessageInstance with respect to SyntaxMessageScheme, Constraints, the
	 * MarketPractices, and the MessageChoreography
	 */
	public final static MetamodelAttribute<MMMessageTransportMode, MMMessageValidationOnOff> messageValidationOnOffAttribute = newAttribute();
	/**
	 * specifies how the MessageTransport System acts upon the results of
	 * MessageValidationOnOff
	 */
	public final static MetamodelAttribute<MMMessageTransportMode, MMMessageValidationResults> messageValidationResultsAttribute = newAttribute();
	/**
	 * indicates whether a receiving MessagingEndpoint blocks the sending and
	 * receipt of other Transport Messages until it sends a response to this
	 * TransportMessage
	 */
	public final static MetamodelAttribute<MMMessageTransportMode, MMReceiverAsynchronicity> receiverAsynchronicityAttribute = newAttribute();
	/**
	 * indicates whether a sending MessagingEndpoint blocks after sending a
	 * TransportMessage to the MessageTransportSystem while waiting for a
	 * response from a MessagingEndpoint
	 */
	public final static MetamodelAttribute<MMMessageTransportMode, MMSenderAsynchronicity> senderAsynchronicityAttribute = newAttribute();
	/**
	 * specifies the BusinessTransaction for which a set of MessageTransportMode
	 * characteristics apply
	 */
	public final static MetamodelAttribute<MMMessageTransportMode, List<MMBusinessTransaction>> businessTransactionsAttribute = newAttribute();
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
	protected Supplier<List<MMBusinessTransaction>> businessTransactions_lazy;
	protected Supplier<MMBusinessProcessCatalogue> businessProcessCatalogue_lazy;
	protected String name;
	protected String definition;
	protected Supplier<List<MMSemanticMarkup>> semanticMarkups_lazy;
	protected Supplier<List<MMDoclet>> doclets_lazy;
	protected List<String> examples;
	protected Supplier<List<MMConstraint>> constraints_lazy;
	protected MMRegistrationStatus registrationStatus;
	protected Date removalDate;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMBusinessProcessCatalogue getContainer() {
		return getBusinessProcessCatalogue();
	}

	@Override
	public MetamodelType<? extends MMMessageTransportMode> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageTransportMode> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMMessageTransportMode.class);
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
	@EMFName("businessTransaction")
	public List<MMBusinessTransaction> getBusinessTransactions() {
		return businessTransactions_lazy == null ? Collections.emptyList() : businessTransactions_lazy.get();
	}

	@Override
	public MMBusinessProcessCatalogue getBusinessProcessCatalogue() {
		return businessProcessCatalogue_lazy.get();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Optional<String> getDefinition() {
		return definition == null ? Optional.empty() : Optional.of(definition);
	}

	@Override
	public List<MMSemanticMarkup> getSemanticMarkups() {
		return semanticMarkups_lazy == null ? Collections.emptyList() : semanticMarkups_lazy.get();
	}

	@Override
	public List<MMDoclet> getDoclets() {
		return doclets_lazy == null ? Collections.emptyList() : doclets_lazy.get();
	}

	@Override
	public List<String> getExamples() {
		return examples == null ? Collections.emptyList() : examples;
	}

	@Override
	public List<MMConstraint> getConstraints() {
		return constraints_lazy == null ? Collections.emptyList() : constraints_lazy.get();
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate == null ? Optional.empty() : Optional.of(removalDate);
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null ? Collections.emptyList() : nextVersions_lazy.get();
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion_lazy == null ? Optional.empty() : Optional.of(previousVersion_lazy.get());
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier == null ? Optional.empty() : Optional.of(objectIdentifier);
	}
}