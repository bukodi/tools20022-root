package test.gen.mm;

import com.tools20022.core.metamodel.ReflectionBasedMetamodel;
import test.gen.mm.MMRegistrationStatus;
import test.gen.mm.MMAggregation;
import test.gen.mm.MMDeliveryAssurance;
import test.gen.mm.MMDurability;
import test.gen.mm.MMMessageCasting;
import test.gen.mm.MMMessageDeliveryOrder;
import test.gen.mm.MMMessageValidationLevel;
import test.gen.mm.MMMessageValidationOnOff;
import test.gen.mm.MMMessageValidationResults;
import test.gen.mm.MMReceiverAsynchronicity;
import test.gen.mm.MMSenderAsynchronicity;
import test.gen.mm.MMProcessContent;
import test.gen.mm.MMNamespace;
import test.gen.mm.MMSchemaTypeKind;
import test.gen.mm.MMISO20022Version;
import test.gen.mm.MMAddress;
import test.gen.mm.MMModelEntity;
import test.gen.mm.MMBroadcastList;
import test.gen.mm.MMMessagingEndpoint;
import test.gen.mm.MMMessageTransportSystem;
import test.gen.mm.MMTransportMessage;
import test.gen.mm.MMMessageInstance;
import test.gen.mm.MMSyntaxMessageScheme;
import test.gen.mm.MMTopLevelCatalogueEntry;
import test.gen.mm.MMRepositoryConcept;
import test.gen.mm.MMSemanticMarkup;
import test.gen.mm.MMSemanticMarkupElement;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMBusinessProcessCatalogue;
import test.gen.mm.MMRepository;
import test.gen.mm.MMDataDictionary;
import test.gen.mm.MMTopLevelDictionaryEntry;
import test.gen.mm.MMMessageDefinition;
import test.gen.mm.MMRepositoryType;
import test.gen.mm.MMMessageSet;
import test.gen.mm.MMSyntax;
import test.gen.mm.MMEncoding;
import test.gen.mm.MMBusinessArea;
import test.gen.mm.MMXor;
import test.gen.mm.MMMessageElement;
import test.gen.mm.MMMessageConstruct;
import test.gen.mm.MMConstruct;
import test.gen.mm.MMMultiplicityEntity;
import test.gen.mm.MMLogicalType;
import test.gen.mm.MMMessageConcept;
import test.gen.mm.MMBusinessComponent;
import test.gen.mm.MMBusinessElementType;
import test.gen.mm.MMBusinessConcept;
import test.gen.mm.MMBusinessElement;
import test.gen.mm.MMMessageComponentType;
import test.gen.mm.MMMessageBuildingBlock;
import test.gen.mm.MMDataType;
import test.gen.mm.MMBusinessAssociationEnd;
import test.gen.mm.MMMessageElementContainer;
import test.gen.mm.MMMessageComponent;
import test.gen.mm.MMMessageChoreography;
import test.gen.mm.MMBusinessTransaction;
import test.gen.mm.MMBusinessProcess;
import test.gen.mm.MMBusinessRole;
import test.gen.mm.MMParticipant;
import test.gen.mm.MMReceive;
import test.gen.mm.MMMessageTransmission;
import test.gen.mm.MMSend;
import test.gen.mm.MMMessageTransportMode;
import test.gen.mm.MMMessageDefinitionIdentifier;
import test.gen.mm.MMConversation;
import test.gen.mm.MMMessageAssociationEnd;
import test.gen.mm.MMMessageAttribute;
import test.gen.mm.MMBusinessAttribute;
import test.gen.mm.MMText;
import test.gen.mm.MMString;
import test.gen.mm.MMIdentifierSet;
import test.gen.mm.MMIndicator;
import test.gen.mm.MMBoolean;
import test.gen.mm.MMRate;
import test.gen.mm.MMDecimal;
import test.gen.mm.MMExternalSchema;
import test.gen.mm.MMQuantity;
import test.gen.mm.MMCode;
import test.gen.mm.MMCodeSet;
import test.gen.mm.MMAmount;
import test.gen.mm.MMChoiceComponent;
import test.gen.mm.MMAbstractDateTimeConcept;
import test.gen.mm.MMEndPointCategory;
import test.gen.mm.MMBinary;
import test.gen.mm.MMDate;
import test.gen.mm.MMDateTime;
import test.gen.mm.MMDay;
import test.gen.mm.MMDuration;
import test.gen.mm.MMMonth;
import test.gen.mm.MMMonthDay;
import test.gen.mm.MMTime;
import test.gen.mm.MMYear;
import test.gen.mm.MMYearMonth;
import test.gen.mm.MMUserDefined;
import test.gen.mm.MMIndustryMessageSet;
import test.gen.mm.MMConvergenceDocumentation;
import test.gen.mm.MMISO15022MessageSet;
import test.gen.mm.MMSchemaType;

public class StandardMetamodel2013 extends ReflectionBasedMetamodel {

	private static final StandardMetamodel2013 metamodel = new StandardMetamodel2013();

	private StandardMetamodel2013() {
		registerEnumsFromClasses(MMRegistrationStatus.class,
				MMAggregation.class, MMDeliveryAssurance.class,
				MMDurability.class, MMMessageCasting.class,
				MMMessageDeliveryOrder.class, MMMessageValidationLevel.class,
				MMMessageValidationOnOff.class,
				MMMessageValidationResults.class,
				MMReceiverAsynchronicity.class, MMSenderAsynchronicity.class,
				MMProcessContent.class, MMNamespace.class,
				MMSchemaTypeKind.class, MMISO20022Version.class);
		registerTypesFromClasses(MMAddress.class, MMModelEntity.class,
				MMBroadcastList.class, MMMessagingEndpoint.class,
				MMMessageTransportSystem.class, MMTransportMessage.class,
				MMMessageInstance.class, MMSyntaxMessageScheme.class,
				MMTopLevelCatalogueEntry.class, MMRepositoryConcept.class,
				MMSemanticMarkup.class, MMSemanticMarkupElement.class,
				MMDoclet.class, MMConstraint.class,
				MMBusinessProcessCatalogue.class, MMRepository.class,
				MMDataDictionary.class, MMTopLevelDictionaryEntry.class,
				MMMessageDefinition.class, MMRepositoryType.class,
				MMMessageSet.class, MMSyntax.class, MMEncoding.class,
				MMBusinessArea.class, MMXor.class, MMMessageElement.class,
				MMMessageConstruct.class, MMConstruct.class,
				MMMultiplicityEntity.class, MMLogicalType.class,
				MMMessageConcept.class, MMBusinessComponent.class,
				MMBusinessElementType.class, MMBusinessConcept.class,
				MMBusinessElement.class, MMMessageComponentType.class,
				MMMessageBuildingBlock.class, MMDataType.class,
				MMBusinessAssociationEnd.class,
				MMMessageElementContainer.class, MMMessageComponent.class,
				MMMessageChoreography.class, MMBusinessTransaction.class,
				MMBusinessProcess.class, MMBusinessRole.class,
				MMParticipant.class, MMReceive.class,
				MMMessageTransmission.class, MMSend.class,
				MMMessageTransportMode.class,
				MMMessageDefinitionIdentifier.class, MMConversation.class,
				MMMessageAssociationEnd.class, MMMessageAttribute.class,
				MMBusinessAttribute.class, MMText.class, MMString.class,
				MMIdentifierSet.class, MMIndicator.class, MMBoolean.class,
				MMRate.class, MMDecimal.class, MMExternalSchema.class,
				MMQuantity.class, MMCode.class, MMCodeSet.class,
				MMAmount.class, MMChoiceComponent.class,
				MMAbstractDateTimeConcept.class, MMEndPointCategory.class,
				MMBinary.class, MMDate.class, MMDateTime.class, MMDay.class,
				MMDuration.class, MMMonth.class, MMMonthDay.class,
				MMTime.class, MMYear.class, MMYearMonth.class,
				MMUserDefined.class, MMIndustryMessageSet.class,
				MMConvergenceDocumentation.class, MMISO15022MessageSet.class,
				MMSchemaType.class);
	}

	public static StandardMetamodel2013 metamodel() {
		return metamodel;
	}
}