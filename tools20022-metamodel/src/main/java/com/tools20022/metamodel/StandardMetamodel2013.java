package com.tools20022.metamodel;

import com.tools20022.core.metamodel.ReflectionBasedMetamodel;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMDeliveryAssurance;
import com.tools20022.metamodel.MMDurability;
import com.tools20022.metamodel.MMMessageCasting;
import com.tools20022.metamodel.MMMessageDeliveryOrder;
import com.tools20022.metamodel.MMMessageValidationLevel;
import com.tools20022.metamodel.MMMessageValidationOnOff;
import com.tools20022.metamodel.MMMessageValidationResults;
import com.tools20022.metamodel.MMReceiverAsynchronicity;
import com.tools20022.metamodel.MMSenderAsynchronicity;
import com.tools20022.metamodel.MMProcessContent;
import com.tools20022.metamodel.MMNamespace;
import com.tools20022.metamodel.MMSchemaTypeKind;
import com.tools20022.metamodel.MMISO20022Version;
import com.tools20022.metamodel.MMAddress;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMBroadcastList;
import com.tools20022.metamodel.MMMessagingEndpoint;
import com.tools20022.metamodel.MMMessageTransportSystem;
import com.tools20022.metamodel.MMTransportMessage;
import com.tools20022.metamodel.MMMessageInstance;
import com.tools20022.metamodel.MMSyntaxMessageScheme;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMSemanticMarkupElement;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMSyntax;
import com.tools20022.metamodel.MMEncoding;
import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMXor;
import com.tools20022.metamodel.MMMessageElement;
import com.tools20022.metamodel.MMMessageConstruct;
import com.tools20022.metamodel.MMConstruct;
import com.tools20022.metamodel.MMMultiplicityEntity;
import com.tools20022.metamodel.MMLogicalType;
import com.tools20022.metamodel.MMMessageConcept;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessElementType;
import com.tools20022.metamodel.MMBusinessConcept;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMMessageElementContainer;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMMessageChoreography;
import com.tools20022.metamodel.MMBusinessTransaction;
import com.tools20022.metamodel.MMBusinessProcess;
import com.tools20022.metamodel.MMBusinessRole;
import com.tools20022.metamodel.MMParticipant;
import com.tools20022.metamodel.MMReceive;
import com.tools20022.metamodel.MMMessageTransmission;
import com.tools20022.metamodel.MMSend;
import com.tools20022.metamodel.MMMessageTransportMode;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMConversation;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMText;
import com.tools20022.metamodel.MMString;
import com.tools20022.metamodel.MMIdentifierSet;
import com.tools20022.metamodel.MMIndicator;
import com.tools20022.metamodel.MMBoolean;
import com.tools20022.metamodel.MMRate;
import com.tools20022.metamodel.MMDecimal;
import com.tools20022.metamodel.MMExternalSchema;
import com.tools20022.metamodel.MMQuantity;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMAmount;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMAbstractDateTimeConcept;
import com.tools20022.metamodel.MMEndPointCategory;
import com.tools20022.metamodel.MMBinary;
import com.tools20022.metamodel.MMDate;
import com.tools20022.metamodel.MMDateTime;
import com.tools20022.metamodel.MMDay;
import com.tools20022.metamodel.MMDuration;
import com.tools20022.metamodel.MMMonth;
import com.tools20022.metamodel.MMMonthDay;
import com.tools20022.metamodel.MMTime;
import com.tools20022.metamodel.MMYear;
import com.tools20022.metamodel.MMYearMonth;
import com.tools20022.metamodel.MMUserDefined;
import com.tools20022.metamodel.MMIndustryMessageSet;
import com.tools20022.metamodel.MMConvergenceDocumentation;
import com.tools20022.metamodel.MMISO15022MessageSet;
import com.tools20022.metamodel.MMSchemaType;

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