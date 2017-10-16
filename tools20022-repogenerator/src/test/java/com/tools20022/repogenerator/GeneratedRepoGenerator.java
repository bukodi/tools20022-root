package com.tools20022.repogenerator;

import com.tools20022.generators.GenerationResult;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.List;
import java.util.Optional;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.MMAddress;
import com.tools20022.metamodel.struct.MMAddress_;
import com.tools20022.metamodel.MMBroadcastList;
import com.tools20022.metamodel.struct.MMBroadcastList_;
import com.tools20022.metamodel.MMMessagingEndpoint;
import com.tools20022.metamodel.struct.MMMessagingEndpoint_;
import com.tools20022.metamodel.MMMessageTransportSystem;
import com.tools20022.metamodel.struct.MMMessageTransportSystem_;
import com.tools20022.metamodel.MMTransportMessage;
import com.tools20022.metamodel.struct.MMTransportMessage_;
import com.tools20022.metamodel.MMMessageInstance;
import com.tools20022.metamodel.struct.MMMessageInstance_;
import com.tools20022.metamodel.MMSyntaxMessageScheme;
import com.tools20022.metamodel.struct.MMSyntaxMessageScheme_;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.struct.MMSemanticMarkup_;
import com.tools20022.metamodel.MMSemanticMarkupElement;
import com.tools20022.metamodel.struct.MMSemanticMarkupElement_;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.struct.MMDoclet_;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.struct.MMConstraint_;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.struct.MMBusinessProcessCatalogue_;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.struct.MMRepository_;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.struct.MMDataDictionary_;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.struct.MMMessageDefinition_;
import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.struct.MMMessageSet_;
import com.tools20022.metamodel.MMSyntax;
import com.tools20022.metamodel.struct.MMSyntax_;
import com.tools20022.metamodel.MMEncoding;
import com.tools20022.metamodel.struct.MMEncoding_;
import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.struct.MMBusinessArea_;
import com.tools20022.metamodel.MMXor;
import com.tools20022.metamodel.struct.MMXor_;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.struct.MMBusinessComponent_;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.struct.MMMessageBuildingBlock_;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.struct.MMBusinessAssociationEnd_;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.struct.MMMessageComponent_;
import com.tools20022.metamodel.MMMessageChoreography;
import com.tools20022.metamodel.struct.MMMessageChoreography_;
import com.tools20022.metamodel.MMBusinessTransaction;
import com.tools20022.metamodel.struct.MMBusinessTransaction_;
import com.tools20022.metamodel.MMBusinessProcess;
import com.tools20022.metamodel.struct.MMBusinessProcess_;
import com.tools20022.metamodel.MMBusinessRole;
import com.tools20022.metamodel.struct.MMBusinessRole_;
import com.tools20022.metamodel.MMParticipant;
import com.tools20022.metamodel.struct.MMParticipant_;
import com.tools20022.metamodel.MMReceive;
import com.tools20022.metamodel.struct.MMReceive_;
import com.tools20022.metamodel.MMMessageTransmission;
import com.tools20022.metamodel.struct.MMMessageTransmission_;
import com.tools20022.metamodel.MMSend;
import com.tools20022.metamodel.struct.MMSend_;
import com.tools20022.metamodel.MMMessageTransportMode;
import com.tools20022.metamodel.struct.MMMessageTransportMode_;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.struct.MMMessageDefinitionIdentifier_;
import com.tools20022.metamodel.MMConversation;
import com.tools20022.metamodel.struct.MMConversation_;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.struct.MMMessageAssociationEnd_;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.struct.MMMessageAttribute_;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.struct.MMBusinessAttribute_;
import com.tools20022.metamodel.MMText;
import com.tools20022.metamodel.struct.MMText_;
import com.tools20022.metamodel.MMString;
import com.tools20022.metamodel.struct.MMString_;
import com.tools20022.metamodel.MMIdentifierSet;
import com.tools20022.metamodel.struct.MMIdentifierSet_;
import com.tools20022.metamodel.MMIndicator;
import com.tools20022.metamodel.struct.MMIndicator_;
import com.tools20022.metamodel.MMBoolean;
import com.tools20022.metamodel.struct.MMBoolean_;
import com.tools20022.metamodel.MMRate;
import com.tools20022.metamodel.struct.MMRate_;
import com.tools20022.metamodel.MMDecimal;
import com.tools20022.metamodel.struct.MMDecimal_;
import com.tools20022.metamodel.MMExternalSchema;
import com.tools20022.metamodel.struct.MMExternalSchema_;
import com.tools20022.metamodel.MMQuantity;
import com.tools20022.metamodel.struct.MMQuantity_;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.struct.MMCode_;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.struct.MMCodeSet_;
import com.tools20022.metamodel.MMAmount;
import com.tools20022.metamodel.struct.MMAmount_;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.struct.MMChoiceComponent_;
import com.tools20022.metamodel.MMEndPointCategory;
import com.tools20022.metamodel.struct.MMEndPointCategory_;
import com.tools20022.metamodel.MMBinary;
import com.tools20022.metamodel.struct.MMBinary_;
import com.tools20022.metamodel.MMDate;
import com.tools20022.metamodel.struct.MMDate_;
import com.tools20022.metamodel.MMDateTime;
import com.tools20022.metamodel.struct.MMDateTime_;
import com.tools20022.metamodel.MMDay;
import com.tools20022.metamodel.struct.MMDay_;
import com.tools20022.metamodel.MMDuration;
import com.tools20022.metamodel.struct.MMDuration_;
import com.tools20022.metamodel.MMMonth;
import com.tools20022.metamodel.struct.MMMonth_;
import com.tools20022.metamodel.MMMonthDay;
import com.tools20022.metamodel.struct.MMMonthDay_;
import com.tools20022.metamodel.MMTime;
import com.tools20022.metamodel.struct.MMTime_;
import com.tools20022.metamodel.MMYear;
import com.tools20022.metamodel.struct.MMYear_;
import com.tools20022.metamodel.MMYearMonth;
import com.tools20022.metamodel.struct.MMYearMonth_;
import com.tools20022.metamodel.MMUserDefined;
import com.tools20022.metamodel.struct.MMUserDefined_;
import com.tools20022.metamodel.MMIndustryMessageSet;
import com.tools20022.metamodel.struct.MMIndustryMessageSet_;
import com.tools20022.metamodel.MMConvergenceDocumentation;
import com.tools20022.metamodel.struct.MMConvergenceDocumentation_;
import com.tools20022.metamodel.MMISO15022MessageSet;
import com.tools20022.metamodel.struct.MMISO15022MessageSet_;
import com.tools20022.metamodel.MMSchemaType;
import com.tools20022.metamodel.struct.MMSchemaType_;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.MMMessageElement;
import com.tools20022.metamodel.MMMessageConstruct;
import com.tools20022.metamodel.MMConstruct;
import com.tools20022.metamodel.MMMultiplicityEntity;
import com.tools20022.metamodel.MMLogicalType;
import com.tools20022.metamodel.MMMessageConcept;
import com.tools20022.metamodel.MMBusinessElementType;
import com.tools20022.metamodel.MMBusinessConcept;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMMessageElementContainer;
import com.tools20022.metamodel.MMAbstractDateTimeConcept;

public class GeneratedRepoGenerator {

	protected <MB extends GeneratedMetamodelBean, T> GenerationResult defaultOptionalAttribute(
			MetamodelAttribute<MB, Optional<T>> mmAttr, Optional<T> optValue) {
		return null;
	}

	protected <MB extends GeneratedMetamodelBean, T> GenerationResult defaultMandatoryAttribute(
			MetamodelAttribute<MB, T> mmAttr, T value) {
		return null;
	}

	protected <MB extends GeneratedMetamodelBean, T> GenerationResult defaultMultivalueAttribute(
			MetamodelAttribute<MB, List<T>> mmAttr, List<T> values) {
		return null;
	}

	GenerationResult generateMMAddress(GenerationResult containerGen,
			MMAddress mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(MMAddress_.endpoint, mmBean.getEndpoint());
		defaultMultivalueAttribute(MMAddress_.broadCastList,
				mmBean.getBroadCastList());
		return gen;
	}

	GenerationResult generateMMBroadcastList(GenerationResult containerGen,
			MMBroadcastList mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(MMBroadcastList_.address,
				mmBean.getAddress());
		return gen;
	}

	GenerationResult generateMMMessagingEndpoint(GenerationResult containerGen,
			MMMessagingEndpoint mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(MMMessagingEndpoint_.location,
				mmBean.getLocation());
		defaultMultivalueAttribute(MMMessagingEndpoint_.receivedMessage,
				mmBean.getReceivedMessage());
		defaultMandatoryAttribute(MMMessagingEndpoint_.transportSystem,
				mmBean.getTransportSystem());
		defaultMultivalueAttribute(MMMessagingEndpoint_.sentMessage,
				mmBean.getSentMessage());
		return gen;
	}

	GenerationResult generateMMMessageTransportSystem(
			GenerationResult containerGen, MMMessageTransportSystem mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(MMMessageTransportSystem_.endpoint,
				mmBean.getEndpoint());
		return gen;
	}

	GenerationResult generateMMTransportMessage(GenerationResult containerGen,
			MMTransportMessage mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(MMTransportMessage_.messageInstance,
				mmBean.getMessageInstance());
		defaultMandatoryAttribute(MMTransportMessage_.sender,
				mmBean.getSender());
		defaultMultivalueAttribute(MMTransportMessage_.receiver,
				mmBean.getReceiver());
		return gen;
	}

	GenerationResult generateMMMessageInstance(GenerationResult containerGen,
			MMMessageInstance mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(MMMessageInstance_.transportMessage,
				mmBean.getTransportMessage());
		defaultMandatoryAttribute(MMMessageInstance_.specification,
				mmBean.getSpecification());
		return gen;
	}

	GenerationResult generateMMSyntaxMessageScheme(
			GenerationResult containerGen, MMSyntaxMessageScheme mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultOptionalAttribute(MMSyntaxMessageScheme_.messageDefinitionTrace,
				mmBean.getMessageDefinitionTrace());
		return gen;
	}

	GenerationResult generateMMSemanticMarkup(GenerationResult containerGen,
			MMSemanticMarkup mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultOptionalAttribute(MMSemanticMarkup_.type, mmBean.getType());
		defaultMultivalueAttribute(MMSemanticMarkup_.elements,
				mmBean.getElements());
		return gen;
	}

	GenerationResult generateMMSemanticMarkupElement(
			GenerationResult containerGen, MMSemanticMarkupElement mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultOptionalAttribute(MMSemanticMarkupElement_.name,
				mmBean.getName());
		defaultOptionalAttribute(MMSemanticMarkupElement_.value,
				mmBean.getValue());
		return gen;
	}

	GenerationResult generateMMDoclet(GenerationResult containerGen,
			MMDoclet mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultOptionalAttribute(MMDoclet_.type, mmBean.getType());
		defaultOptionalAttribute(MMDoclet_.content, mmBean.getContent());
		return gen;
	}

	GenerationResult generateMMConstraint(GenerationResult containerGen,
			MMConstraint mmBean) {
		GenerationResult gen = null;
		implementMMRepositoryConcept(gen, mmBean);
		defaultMandatoryAttribute(MMConstraint_.owner, mmBean.getOwner());
		defaultOptionalAttribute(MMConstraint_.expression,
				mmBean.getExpression());
		defaultOptionalAttribute(MMConstraint_.expressionLanguage,
				mmBean.getExpressionLanguage());
		return gen;
	}

	GenerationResult generateMMBusinessProcessCatalogue(
			GenerationResult containerGen, MMBusinessProcessCatalogue mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(
				MMBusinessProcessCatalogue_.topLevelCatalogueEntry,
				mmBean.getTopLevelCatalogueEntry());
		defaultMandatoryAttribute(MMBusinessProcessCatalogue_.repository,
				mmBean.getRepository());
		return gen;
	}

	GenerationResult generateMMRepository(GenerationResult containerGen,
			MMRepository mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(MMRepository_.businessProcessCatalogue,
				mmBean.getBusinessProcessCatalogue());
		defaultMandatoryAttribute(MMRepository_.dataDictionary,
				mmBean.getDataDictionary());
		return gen;
	}

	GenerationResult generateMMDataDictionary(GenerationResult containerGen,
			MMDataDictionary mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(MMDataDictionary_.topLevelDictionaryEntry,
				mmBean.getTopLevelDictionaryEntry());
		defaultMandatoryAttribute(MMDataDictionary_.repository,
				mmBean.getRepository());
		return gen;
	}

	GenerationResult generateMMMessageDefinition(GenerationResult containerGen,
			MMMessageDefinition mmBean) {
		GenerationResult gen = null;
		implementMMRepositoryType(gen, mmBean);
		defaultMultivalueAttribute(MMMessageDefinition_.derivation,
				mmBean.getDerivation());
		defaultMultivalueAttribute(MMMessageDefinition_.messageSet,
				mmBean.getMessageSet());
		defaultOptionalAttribute(MMMessageDefinition_.xmlName,
				mmBean.getXmlName());
		defaultMandatoryAttribute(MMMessageDefinition_.rootElement,
				mmBean.getRootElement());
		defaultOptionalAttribute(MMMessageDefinition_.xmlTag,
				mmBean.getXmlTag());
		defaultMultivalueAttribute(MMMessageDefinition_.choreography,
				mmBean.getChoreography());
		defaultMandatoryAttribute(MMMessageDefinition_.businessArea,
				mmBean.getBusinessArea());
		defaultMultivalueAttribute(MMMessageDefinition_.trace,
				mmBean.getTrace());
		defaultMultivalueAttribute(MMMessageDefinition_.xors, mmBean.getXors());
		defaultMandatoryAttribute(
				MMMessageDefinition_.messageDefinitionIdentifier,
				mmBean.getMessageDefinitionIdentifier());
		defaultMultivalueAttribute(MMMessageDefinition_.messageBuildingBlock,
				mmBean.getMessageBuildingBlock());
		return gen;
	}

	GenerationResult generateMMMessageSet(GenerationResult containerGen,
			MMMessageSet mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultMultivalueAttribute(MMMessageSet_.validEncoding,
				mmBean.getValidEncoding());
		defaultMultivalueAttribute(MMMessageSet_.generatedSyntax,
				mmBean.getGeneratedSyntax());
		defaultMultivalueAttribute(MMMessageSet_.messageDefinition,
				mmBean.getMessageDefinition());
		return gen;
	}

	GenerationResult generateMMSyntax(GenerationResult containerGen,
			MMSyntax mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(MMSyntax_.generatedFor,
				mmBean.getGeneratedFor());
		defaultMultivalueAttribute(MMSyntax_.possibleEncodings,
				mmBean.getPossibleEncodings());
		return gen;
	}

	GenerationResult generateMMEncoding(GenerationResult containerGen,
			MMEncoding mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(MMEncoding_.syntax, mmBean.getSyntax());
		defaultMultivalueAttribute(MMEncoding_.messageSet,
				mmBean.getMessageSet());
		return gen;
	}

	GenerationResult generateMMBusinessArea(GenerationResult containerGen,
			MMBusinessArea mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultMandatoryAttribute(MMBusinessArea_.code, mmBean.getCode());
		defaultMultivalueAttribute(MMBusinessArea_.messageDefinition,
				mmBean.getMessageDefinition());
		return gen;
	}

	GenerationResult generateMMXor(GenerationResult containerGen, MMXor mmBean) {
		GenerationResult gen = null;
		implementMMRepositoryConcept(gen, mmBean);
		defaultOptionalAttribute(MMXor_.messageComponent,
				mmBean.getMessageComponent());
		defaultMultivalueAttribute(MMXor_.impactedElements,
				mmBean.getImpactedElements());
		defaultOptionalAttribute(MMXor_.messageDefinition,
				mmBean.getMessageDefinition());
		defaultMultivalueAttribute(MMXor_.impactedMessageBuildingBlocks,
				mmBean.getImpactedMessageBuildingBlocks());
		return gen;
	}

	GenerationResult generateMMBusinessComponent(GenerationResult containerGen,
			MMBusinessComponent mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMBusinessConcept(gen, mmBean);
		defaultOptionalAttribute(MMBusinessComponent_.superType,
				mmBean.getSuperType());
		defaultMultivalueAttribute(MMBusinessComponent_.element,
				mmBean.getElement());
		defaultMultivalueAttribute(MMBusinessComponent_.subType,
				mmBean.getSubType());
		defaultMultivalueAttribute(MMBusinessComponent_.derivationComponent,
				mmBean.getDerivationComponent());
		defaultMultivalueAttribute(MMBusinessComponent_.derivationElement,
				mmBean.getDerivationElement());
		defaultMultivalueAttribute(MMBusinessComponent_.associationDomain,
				mmBean.getAssociationDomain());
		return gen;
	}

	GenerationResult generateMMMessageBuildingBlock(
			GenerationResult containerGen, MMMessageBuildingBlock mmBean) {
		GenerationResult gen = null;
		implementMMMessageConstruct(gen, mmBean);
		defaultOptionalAttribute(MMMessageBuildingBlock_.complexType,
				mmBean.getComplexType());
		defaultOptionalAttribute(MMMessageBuildingBlock_.simpleType,
				mmBean.getSimpleType());
		return gen;
	}

	GenerationResult generateMMBusinessAssociationEnd(
			GenerationResult containerGen, MMBusinessAssociationEnd mmBean) {
		GenerationResult gen = null;
		implementMMBusinessElement(gen, mmBean);
		defaultMandatoryAttribute(MMBusinessAssociationEnd_.type,
				mmBean.getType());
		defaultOptionalAttribute(MMBusinessAssociationEnd_.opposite,
				mmBean.getOpposite());
		defaultMandatoryAttribute(MMBusinessAssociationEnd_.aggregation,
				mmBean.getAggregation());
		return gen;
	}

	GenerationResult generateMMMessageComponent(GenerationResult containerGen,
			MMMessageComponent mmBean) {
		GenerationResult gen = null;
		implementMMMessageElementContainer(gen, mmBean);
		defaultMultivalueAttribute(MMMessageComponent_.xors, mmBean.getXors());
		return gen;
	}

	GenerationResult generateMMMessageChoreography(
			GenerationResult containerGen, MMMessageChoreography mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultMultivalueAttribute(MMMessageChoreography_.messageDefinition,
				mmBean.getMessageDefinition());
		defaultOptionalAttribute(
				MMMessageChoreography_.businessTransactionTrace,
				mmBean.getBusinessTransactionTrace());
		return gen;
	}

	GenerationResult generateMMBusinessTransaction(
			GenerationResult containerGen, MMBusinessTransaction mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultMultivalueAttribute(MMBusinessTransaction_.trace,
				mmBean.getTrace());
		defaultMultivalueAttribute(MMBusinessTransaction_.participant,
				mmBean.getParticipant());
		defaultMultivalueAttribute(MMBusinessTransaction_.transmission,
				mmBean.getTransmission());
		defaultMultivalueAttribute(MMBusinessTransaction_.subTransaction,
				mmBean.getSubTransaction());
		defaultMandatoryAttribute(MMBusinessTransaction_.businessProcessTrace,
				mmBean.getBusinessProcessTrace());
		defaultOptionalAttribute(MMBusinessTransaction_.parentTransaction,
				mmBean.getParentTransaction());
		defaultMandatoryAttribute(MMBusinessTransaction_.messageTransportMode,
				mmBean.getMessageTransportMode());
		return gen;
	}

	GenerationResult generateMMBusinessProcess(GenerationResult containerGen,
			MMBusinessProcess mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultMultivalueAttribute(MMBusinessProcess_.extender,
				mmBean.getExtender());
		defaultMultivalueAttribute(MMBusinessProcess_.extended,
				mmBean.getExtended());
		defaultMultivalueAttribute(MMBusinessProcess_.includer,
				mmBean.getIncluder());
		defaultMultivalueAttribute(MMBusinessProcess_.businessRole,
				mmBean.getBusinessRole());
		defaultMultivalueAttribute(MMBusinessProcess_.included,
				mmBean.getIncluded());
		defaultMultivalueAttribute(MMBusinessProcess_.businessProcessTrace,
				mmBean.getBusinessProcessTrace());
		return gen;
	}

	GenerationResult generateMMBusinessRole(GenerationResult containerGen,
			MMBusinessRole mmBean) {
		GenerationResult gen = null;
		implementMMRepositoryConcept(gen, mmBean);
		defaultMandatoryAttribute(MMBusinessRole_.businessProcess,
				mmBean.getBusinessProcess());
		defaultMultivalueAttribute(MMBusinessRole_.businessRoleTrace,
				mmBean.getBusinessRoleTrace());
		return gen;
	}

	GenerationResult generateMMParticipant(GenerationResult containerGen,
			MMParticipant mmBean) {
		GenerationResult gen = null;
		implementMMRepositoryConcept(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		defaultMultivalueAttribute(MMParticipant_.receives,
				mmBean.getReceives());
		defaultMultivalueAttribute(MMParticipant_.sends, mmBean.getSends());
		defaultMandatoryAttribute(MMParticipant_.businessRoleTrace,
				mmBean.getBusinessRoleTrace());
		defaultMandatoryAttribute(MMParticipant_.businessTransaction,
				mmBean.getBusinessTransaction());
		return gen;
	}

	GenerationResult generateMMReceive(GenerationResult containerGen,
			MMReceive mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(MMReceive_.messageTransmission,
				mmBean.getMessageTransmission());
		defaultMandatoryAttribute(MMReceive_.receiver, mmBean.getReceiver());
		return gen;
	}

	GenerationResult generateMMMessageTransmission(
			GenerationResult containerGen, MMMessageTransmission mmBean) {
		GenerationResult gen = null;
		implementMMRepositoryConcept(gen, mmBean);
		defaultMultivalueAttribute(MMMessageTransmission_.derivation,
				mmBean.getDerivation());
		defaultMultivalueAttribute(MMMessageTransmission_.receive,
				mmBean.getReceive());
		defaultMandatoryAttribute(MMMessageTransmission_.send, mmBean.getSend());
		defaultMandatoryAttribute(
				MMMessageTransmission_.messageTypeDescription,
				mmBean.getMessageTypeDescription());
		defaultMandatoryAttribute(MMMessageTransmission_.businessTransaction,
				mmBean.getBusinessTransaction());
		return gen;
	}

	GenerationResult generateMMSend(GenerationResult containerGen, MMSend mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(MMSend_.messageTransmission,
				mmBean.getMessageTransmission());
		defaultMandatoryAttribute(MMSend_.sender, mmBean.getSender());
		return gen;
	}

	GenerationResult generateMMMessageTransportMode(
			GenerationResult containerGen, MMMessageTransportMode mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultMandatoryAttribute(MMMessageTransportMode_.durability,
				mmBean.getDurability());
		defaultMultivalueAttribute(MMMessageTransportMode_.businessTransaction,
				mmBean.getBusinessTransaction());
		defaultMandatoryAttribute(MMMessageTransportMode_.messageSendingWindow,
				mmBean.getMessageSendingWindow());
		defaultMandatoryAttribute(MMMessageTransportMode_.messageCasting,
				mmBean.getMessageCasting());
		defaultMandatoryAttribute(MMMessageTransportMode_.deliveryAssurance,
				mmBean.getDeliveryAssurance());
		defaultMandatoryAttribute(MMMessageTransportMode_.messageDeliveryOrder,
				mmBean.getMessageDeliveryOrder());
		defaultMandatoryAttribute(
				MMMessageTransportMode_.maximumClockVariation,
				mmBean.getMaximumClockVariation());
		defaultMandatoryAttribute(
				MMMessageTransportMode_.messageValidationLevel,
				mmBean.getMessageValidationLevel());
		defaultMandatoryAttribute(
				MMMessageTransportMode_.boundedCommunicationDelay,
				mmBean.getBoundedCommunicationDelay());
		defaultMandatoryAttribute(
				MMMessageTransportMode_.messageDeliveryWindow,
				mmBean.getMessageDeliveryWindow());
		defaultMandatoryAttribute(MMMessageTransportMode_.senderAsynchronicity,
				mmBean.getSenderAsynchronicity());
		defaultMandatoryAttribute(
				MMMessageTransportMode_.receiverAsynchronicity,
				mmBean.getReceiverAsynchronicity());
		defaultMandatoryAttribute(
				MMMessageTransportMode_.messageValidationResults,
				mmBean.getMessageValidationResults());
		defaultMandatoryAttribute(MMMessageTransportMode_.maximumMessageSize,
				mmBean.getMaximumMessageSize());
		defaultMandatoryAttribute(
				MMMessageTransportMode_.messageValidationOnOff,
				mmBean.getMessageValidationOnOff());
		return gen;
	}

	GenerationResult generateMMMessageDefinitionIdentifier(
			GenerationResult containerGen, MMMessageDefinitionIdentifier mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(MMMessageDefinitionIdentifier_.businessArea,
				mmBean.getBusinessArea());
		defaultMandatoryAttribute(MMMessageDefinitionIdentifier_.flavour,
				mmBean.getFlavour());
		defaultMandatoryAttribute(MMMessageDefinitionIdentifier_.version,
				mmBean.getVersion());
		defaultMandatoryAttribute(
				MMMessageDefinitionIdentifier_.messageFunctionality,
				mmBean.getMessageFunctionality());
		return gen;
	}

	GenerationResult generateMMConversation(GenerationResult containerGen,
			MMConversation mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		return gen;
	}

	GenerationResult generateMMMessageAssociationEnd(
			GenerationResult containerGen, MMMessageAssociationEnd mmBean) {
		GenerationResult gen = null;
		implementMMMessageElement(gen, mmBean);
		defaultMandatoryAttribute(MMMessageAssociationEnd_.type,
				mmBean.getType());
		defaultMandatoryAttribute(MMMessageAssociationEnd_.isComposite,
				mmBean.isIsComposite());
		return gen;
	}

	GenerationResult generateMMMessageAttribute(GenerationResult containerGen,
			MMMessageAttribute mmBean) {
		GenerationResult gen = null;
		implementMMMessageElement(gen, mmBean);
		defaultOptionalAttribute(MMMessageAttribute_.complexType,
				mmBean.getComplexType());
		defaultOptionalAttribute(MMMessageAttribute_.simpleType,
				mmBean.getSimpleType());
		return gen;
	}

	GenerationResult generateMMBusinessAttribute(GenerationResult containerGen,
			MMBusinessAttribute mmBean) {
		GenerationResult gen = null;
		implementMMBusinessElement(gen, mmBean);
		defaultOptionalAttribute(MMBusinessAttribute_.complexType,
				mmBean.getComplexType());
		defaultOptionalAttribute(MMBusinessAttribute_.simpleType,
				mmBean.getSimpleType());
		return gen;
	}

	GenerationResult generateMMText(GenerationResult containerGen, MMText mmBean) {
		GenerationResult gen = null;
		return gen;
	}

	GenerationResult generateMMString(GenerationResult containerGen,
			MMString mmBean) {
		GenerationResult gen = null;
		implementMMDataType(gen, mmBean);
		defaultOptionalAttribute(MMString_.length, mmBean.getLength());
		defaultOptionalAttribute(MMString_.pattern, mmBean.getPattern());
		defaultOptionalAttribute(MMString_.minLength, mmBean.getMinLength());
		defaultOptionalAttribute(MMString_.maxLength, mmBean.getMaxLength());
		return gen;
	}

	GenerationResult generateMMIdentifierSet(GenerationResult containerGen,
			MMIdentifierSet mmBean) {
		GenerationResult gen = null;
		defaultMandatoryAttribute(MMIdentifierSet_.identificationScheme,
				mmBean.getIdentificationScheme());
		return gen;
	}

	GenerationResult generateMMIndicator(GenerationResult containerGen,
			MMIndicator mmBean) {
		GenerationResult gen = null;
		defaultMandatoryAttribute(MMIndicator_.meaningWhenFalse,
				mmBean.getMeaningWhenFalse());
		defaultMandatoryAttribute(MMIndicator_.meaningWhenTrue,
				mmBean.getMeaningWhenTrue());
		return gen;
	}

	GenerationResult generateMMBoolean(GenerationResult containerGen,
			MMBoolean mmBean) {
		GenerationResult gen = null;
		implementMMDataType(gen, mmBean);
		defaultOptionalAttribute(MMBoolean_.pattern, mmBean.getPattern());
		return gen;
	}

	GenerationResult generateMMRate(GenerationResult containerGen, MMRate mmBean) {
		GenerationResult gen = null;
		defaultMandatoryAttribute(MMRate_.baseValue, mmBean.getBaseValue());
		defaultOptionalAttribute(MMRate_.baseUnitCode, mmBean.getBaseUnitCode());
		return gen;
	}

	GenerationResult generateMMDecimal(GenerationResult containerGen,
			MMDecimal mmBean) {
		GenerationResult gen = null;
		implementMMDataType(gen, mmBean);
		defaultOptionalAttribute(MMDecimal_.pattern, mmBean.getPattern());
		defaultOptionalAttribute(MMDecimal_.minInclusive,
				mmBean.getMinInclusive());
		defaultOptionalAttribute(MMDecimal_.minExclusive,
				mmBean.getMinExclusive());
		defaultOptionalAttribute(MMDecimal_.maxInclusive,
				mmBean.getMaxInclusive());
		defaultOptionalAttribute(MMDecimal_.maxExclusive,
				mmBean.getMaxExclusive());
		defaultOptionalAttribute(MMDecimal_.totalDigits,
				mmBean.getTotalDigits());
		defaultOptionalAttribute(MMDecimal_.fractionDigits,
				mmBean.getFractionDigits());
		return gen;
	}

	GenerationResult generateMMExternalSchema(GenerationResult containerGen,
			MMExternalSchema mmBean) {
		GenerationResult gen = null;
		implementMMMessageComponentType(gen, mmBean);
		defaultMandatoryAttribute(MMExternalSchema_.processContent,
				mmBean.getProcessContent());
		defaultMultivalueAttribute(MMExternalSchema_.namespaceList,
				mmBean.getNamespaceList());
		return gen;
	}

	GenerationResult generateMMQuantity(GenerationResult containerGen,
			MMQuantity mmBean) {
		GenerationResult gen = null;
		defaultOptionalAttribute(MMQuantity_.unitCode, mmBean.getUnitCode());
		return gen;
	}

	GenerationResult generateMMCode(GenerationResult containerGen, MMCode mmBean) {
		GenerationResult gen = null;
		implementMMRepositoryConcept(gen, mmBean);
		defaultMandatoryAttribute(MMCode_.owner, mmBean.getOwner());
		defaultOptionalAttribute(MMCode_.codeName, mmBean.getCodeName());
		return gen;
	}

	GenerationResult generateMMCodeSet(GenerationResult containerGen,
			MMCodeSet mmBean) {
		GenerationResult gen = null;
		defaultMultivalueAttribute(MMCodeSet_.code, mmBean.getCode());
		defaultMultivalueAttribute(MMCodeSet_.derivation,
				mmBean.getDerivation());
		defaultOptionalAttribute(MMCodeSet_.trace, mmBean.getTrace());
		defaultOptionalAttribute(MMCodeSet_.identificationScheme,
				mmBean.getIdentificationScheme());
		return gen;
	}

	GenerationResult generateMMAmount(GenerationResult containerGen,
			MMAmount mmBean) {
		GenerationResult gen = null;
		defaultOptionalAttribute(MMAmount_.currencyIdentifierSet,
				mmBean.getCurrencyIdentifierSet());
		return gen;
	}

	GenerationResult generateMMChoiceComponent(GenerationResult containerGen,
			MMChoiceComponent mmBean) {
		GenerationResult gen = null;
		implementMMMessageElementContainer(gen, mmBean);
		return gen;
	}

	GenerationResult generateMMEndPointCategory(GenerationResult containerGen,
			MMEndPointCategory mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		defaultMultivalueAttribute(MMEndPointCategory_.endPoints,
				mmBean.getEndPoints());
		return gen;
	}

	GenerationResult generateMMBinary(GenerationResult containerGen,
			MMBinary mmBean) {
		GenerationResult gen = null;
		implementMMDataType(gen, mmBean);
		defaultOptionalAttribute(MMBinary_.length, mmBean.getLength());
		defaultOptionalAttribute(MMBinary_.pattern, mmBean.getPattern());
		defaultOptionalAttribute(MMBinary_.minLength, mmBean.getMinLength());
		defaultOptionalAttribute(MMBinary_.maxLength, mmBean.getMaxLength());
		return gen;
	}

	GenerationResult generateMMDate(GenerationResult containerGen, MMDate mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	GenerationResult generateMMDateTime(GenerationResult containerGen,
			MMDateTime mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	GenerationResult generateMMDay(GenerationResult containerGen, MMDay mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	GenerationResult generateMMDuration(GenerationResult containerGen,
			MMDuration mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	GenerationResult generateMMMonth(GenerationResult containerGen,
			MMMonth mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	GenerationResult generateMMMonthDay(GenerationResult containerGen,
			MMMonthDay mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	GenerationResult generateMMTime(GenerationResult containerGen, MMTime mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	GenerationResult generateMMYear(GenerationResult containerGen, MMYear mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	GenerationResult generateMMYearMonth(GenerationResult containerGen,
			MMYearMonth mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	GenerationResult generateMMUserDefined(GenerationResult containerGen,
			MMUserDefined mmBean) {
		GenerationResult gen = null;
		implementMMMessageComponentType(gen, mmBean);
		defaultMandatoryAttribute(MMUserDefined_.processContents,
				mmBean.getProcessContents());
		defaultMandatoryAttribute(MMUserDefined_.namespace,
				mmBean.getNamespace());
		defaultOptionalAttribute(MMUserDefined_.namespaceList,
				mmBean.getNamespaceList());
		return gen;
	}

	GenerationResult generateMMIndustryMessageSet(
			GenerationResult containerGen, MMIndustryMessageSet mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		return gen;
	}

	GenerationResult generateMMConvergenceDocumentation(
			GenerationResult containerGen, MMConvergenceDocumentation mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		return gen;
	}

	GenerationResult generateMMISO15022MessageSet(
			GenerationResult containerGen, MMISO15022MessageSet mmBean) {
		GenerationResult gen = null;
		return gen;
	}

	GenerationResult generateMMSchemaType(GenerationResult containerGen,
			MMSchemaType mmBean) {
		GenerationResult gen = null;
		implementMMDataType(gen, mmBean);
		defaultMandatoryAttribute(MMSchemaType_.kind, mmBean.getKind());
		return gen;
	}

	void implementMMModelEntity(GenerationResult gen, MMModelEntity mmBean) {
	}

	void implementMMTopLevelCatalogueEntry(GenerationResult gen,
			MMTopLevelCatalogueEntry mmBean) {
		implementMMRepositoryConcept(gen, mmBean);
	}

	void implementMMRepositoryConcept(GenerationResult gen,
			MMRepositoryConcept mmBean) {
		implementMMModelEntity(gen, mmBean);
	}

	void implementMMTopLevelDictionaryEntry(GenerationResult gen,
			MMTopLevelDictionaryEntry mmBean) {
		implementMMRepositoryConcept(gen, mmBean);
	}

	void implementMMRepositoryType(GenerationResult gen, MMRepositoryType mmBean) {
		implementMMRepositoryConcept(gen, mmBean);
	}

	void implementMMMessageElement(GenerationResult gen, MMMessageElement mmBean) {
		implementMMMessageConstruct(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
	}

	void implementMMMessageConstruct(GenerationResult gen,
			MMMessageConstruct mmBean) {
		implementMMConstruct(gen, mmBean);
	}

	void implementMMConstruct(GenerationResult gen, MMConstruct mmBean) {
		implementMMRepositoryConcept(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
	}

	void implementMMMultiplicityEntity(GenerationResult gen,
			MMMultiplicityEntity mmBean) {
	}

	void implementMMLogicalType(GenerationResult gen, MMLogicalType mmBean) {
		implementMMRepositoryType(gen, mmBean);
	}

	void implementMMMessageConcept(GenerationResult gen, MMMessageConcept mmBean) {
		implementMMModelEntity(gen, mmBean);
	}

	void implementMMBusinessElementType(GenerationResult gen,
			MMBusinessElementType mmBean) {
		implementMMRepositoryType(gen, mmBean);
	}

	void implementMMBusinessConcept(GenerationResult gen,
			MMBusinessConcept mmBean) {
		implementMMModelEntity(gen, mmBean);
	}

	void implementMMBusinessElement(GenerationResult gen,
			MMBusinessElement mmBean) {
		implementMMConstruct(gen, mmBean);
		implementMMBusinessConcept(gen, mmBean);
	}

	void implementMMMessageComponentType(GenerationResult gen,
			MMMessageComponentType mmBean) {
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
	}

	void implementMMDataType(GenerationResult gen, MMDataType mmBean) {
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
	}

	void implementMMMessageElementContainer(GenerationResult gen,
			MMMessageElementContainer mmBean) {
		implementMMMessageComponentType(gen, mmBean);
	}

	void implementMMAbstractDateTimeConcept(GenerationResult gen,
			MMAbstractDateTimeConcept mmBean) {
		implementMMDataType(gen, mmBean);
	}
}