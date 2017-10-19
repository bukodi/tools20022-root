package com.tools20022.metamodel;

import com.tools20022.core.metamodel.ReflectionBasedMetamodel;
import com.tools20022.metamodel.*;

public class StandardMetamodel2013 extends ReflectionBasedMetamodel {

	private static final StandardMetamodel2013 metamodel = new StandardMetamodel2013();

	private StandardMetamodel2013() {
		registerEnumsFromClasses(MMRegistrationStatus.class, MMAggregation.class, MMDeliveryAssurance.class, MMDurability.class, MMMessageCasting.class, MMMessageDeliveryOrder.class, MMMessageValidationLevel.class,
				MMMessageValidationOnOff.class, MMMessageValidationResults.class, MMReceiverAsynchronicity.class, MMSenderAsynchronicity.class, MMProcessContent.class, MMNamespace.class, MMSchemaTypeKind.class, MMISO20022Version.class);
		registerTypesFromClasses(MMAddress.class, MMModelEntity.class, MMBroadcastList.class, MMMessagingEndpoint.class, MMMessageTransportSystem.class, MMTransportMessage.class, MMMessageInstance.class, MMSyntaxMessageScheme.class,
				MMTopLevelCatalogueEntry.class, MMRepositoryConcept.class, MMSemanticMarkup.class, MMSemanticMarkupElement.class, MMDoclet.class, MMConstraint.class, MMBusinessProcessCatalogue.class, MMRepository.class,
				MMDataDictionary.class, MMTopLevelDictionaryEntry.class, MMMessageDefinition.class, MMRepositoryType.class, MMMessageSet.class, MMSyntax.class, MMEncoding.class, MMBusinessArea.class, MMXor.class, MMMessageElement.class,
				MMMessageConstruct.class, MMConstruct.class, MMMultiplicityEntity.class, MMLogicalType.class, MMMessageConcept.class, MMBusinessComponent.class, MMBusinessElementType.class, MMBusinessConcept.class, MMBusinessElement.class,
				MMMessageComponentType.class, MMMessageBuildingBlock.class, MMDataType.class, MMBusinessAssociationEnd.class, MMMessageElementContainer.class, MMMessageComponent.class, MMMessageChoreography.class,
				MMBusinessTransaction.class, MMBusinessProcess.class, MMBusinessRole.class, MMParticipant.class, MMReceive.class, MMMessageTransmission.class, MMSend.class, MMMessageTransportMode.class, MMMessageDefinitionIdentifier.class,
				MMConversation.class, MMMessageAssociationEnd.class, MMMessageAttribute.class, MMBusinessAttribute.class, MMText.class, MMString.class, MMIdentifierSet.class, MMIndicator.class, MMBoolean.class, MMRate.class,
				MMDecimal.class, MMExternalSchema.class, MMQuantity.class, MMCode.class, MMCodeSet.class, MMAmount.class, MMChoiceComponent.class, MMAbstractDateTimeConcept.class, MMEndPointCategory.class, MMBinary.class, MMDate.class,
				MMDateTime.class, MMDay.class, MMDuration.class, MMMonth.class, MMMonthDay.class, MMTime.class, MMYear.class, MMYearMonth.class, MMUserDefined.class, MMIndustryMessageSet.class, MMConvergenceDocumentation.class,
				MMISO15022MessageSet.class, MMSchemaType.class);
	}

	public static StandardMetamodel2013 metamodel() {
		return metamodel;
	}
}