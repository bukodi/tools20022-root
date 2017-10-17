package com.tools20022.repogenerator;

import com.tools20022.generators.GenerationResult;
import com.tools20022.metamodel.*;
import com.tools20022.metamodel.struct.*;

public class GeneratedRepoGenerator extends BaseRepoGenerator {

	protected GenerationResult generateMMAddress(GenerationResult containerGen,
			MMAddress mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMAddress_.endpoint,
				mmBean.getEndpoint());
		defaultMultivalueAttribute(gen, MMAddress_.broadCastList,
				mmBean.getBroadCastList());
		return gen;
	}

	protected GenerationResult generateMMBroadcastList(
			GenerationResult containerGen, MMBroadcastList mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(gen, MMBroadcastList_.address,
				mmBean.getAddress());
		return gen;
	}

	protected GenerationResult generateMMMessagingEndpoint(
			GenerationResult containerGen, MMMessagingEndpoint mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(gen, MMMessagingEndpoint_.sentMessage,
				mmBean.getSentMessage());
		defaultMandatoryAttribute(gen, MMMessagingEndpoint_.transportSystem,
				mmBean.getTransportSystem());
		defaultMultivalueAttribute(gen, MMMessagingEndpoint_.receivedMessage,
				mmBean.getReceivedMessage());
		defaultMultivalueAttribute(gen, MMMessagingEndpoint_.location,
				mmBean.getLocation());
		return gen;
	}

	protected GenerationResult generateMMMessageTransportSystem(
			GenerationResult containerGen, MMMessageTransportSystem mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(gen, MMMessageTransportSystem_.endpoint,
				mmBean.getEndpoint());
		return gen;
	}

	protected GenerationResult generateMMTransportMessage(
			GenerationResult containerGen, MMTransportMessage mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMTransportMessage_.sender,
				mmBean.getSender());
		defaultMandatoryAttribute(gen, MMTransportMessage_.messageInstance,
				mmBean.getMessageInstance());
		defaultMultivalueAttribute(gen, MMTransportMessage_.receiver,
				mmBean.getReceiver());
		return gen;
	}

	protected GenerationResult generateMMMessageInstance(
			GenerationResult containerGen, MMMessageInstance mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMMessageInstance_.specification,
				mmBean.getSpecification());
		defaultMultivalueAttribute(gen, MMMessageInstance_.transportMessage,
				mmBean.getTransportMessage());
		return gen;
	}

	protected GenerationResult generateMMSyntaxMessageScheme(
			GenerationResult containerGen, MMSyntaxMessageScheme mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultOptionalAttribute(gen,
				MMSyntaxMessageScheme_.messageDefinitionTrace,
				mmBean.getMessageDefinitionTrace());
		return gen;
	}

	protected GenerationResult generateMMSemanticMarkup(
			GenerationResult containerGen, MMSemanticMarkup mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(gen, MMSemanticMarkup_.elements,
				mmBean.getElements());
		defaultOptionalAttribute(gen, MMSemanticMarkup_.type, mmBean.getType());
		return gen;
	}

	protected GenerationResult generateMMSemanticMarkupElement(
			GenerationResult containerGen, MMSemanticMarkupElement mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultOptionalAttribute(gen, MMSemanticMarkupElement_.name,
				mmBean.getName());
		defaultOptionalAttribute(gen, MMSemanticMarkupElement_.value,
				mmBean.getValue());
		return gen;
	}

	protected GenerationResult generateMMDoclet(GenerationResult containerGen,
			MMDoclet mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultOptionalAttribute(gen, MMDoclet_.type, mmBean.getType());
		defaultOptionalAttribute(gen, MMDoclet_.content, mmBean.getContent());
		return gen;
	}

	protected GenerationResult generateMMConstraint(
			GenerationResult containerGen, MMConstraint mmBean) {
		GenerationResult gen = null;
		implementMMRepositoryConcept(gen, mmBean);
		defaultMandatoryAttribute(gen, MMConstraint_.owner, mmBean.getOwner());
		defaultOptionalAttribute(gen, MMConstraint_.expression,
				mmBean.getExpression());
		defaultOptionalAttribute(gen, MMConstraint_.expressionLanguage,
				mmBean.getExpressionLanguage());
		return gen;
	}

	protected GenerationResult generateMMBusinessProcessCatalogue(
			GenerationResult containerGen, MMBusinessProcessCatalogue mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(gen,
				MMBusinessProcessCatalogue_.topLevelCatalogueEntry,
				mmBean.getTopLevelCatalogueEntry());
		defaultMandatoryAttribute(gen, MMBusinessProcessCatalogue_.repository,
				mmBean.getRepository());
		return gen;
	}

	protected GenerationResult generateMMRepository(
			GenerationResult containerGen, MMRepository mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMRepository_.businessProcessCatalogue,
				mmBean.getBusinessProcessCatalogue());
		defaultMandatoryAttribute(gen, MMRepository_.dataDictionary,
				mmBean.getDataDictionary());
		return gen;
	}

	protected GenerationResult generateMMDataDictionary(
			GenerationResult containerGen, MMDataDictionary mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMDataDictionary_.repository,
				mmBean.getRepository());
		defaultMultivalueAttribute(gen,
				MMDataDictionary_.topLevelDictionaryEntry,
				mmBean.getTopLevelDictionaryEntry());
		return gen;
	}

	protected GenerationResult generateMMMessageDefinition(
			GenerationResult containerGen, MMMessageDefinition mmBean) {
		GenerationResult gen = null;
		implementMMRepositoryType(gen, mmBean);
		defaultMandatoryAttribute(gen, MMMessageDefinition_.businessArea,
				mmBean.getBusinessArea());
		defaultMultivalueAttribute(gen, MMMessageDefinition_.messageSet,
				mmBean.getMessageSet());
		defaultOptionalAttribute(gen, MMMessageDefinition_.xmlName,
				mmBean.getXmlName());
		defaultOptionalAttribute(gen, MMMessageDefinition_.xmlTag,
				mmBean.getXmlTag());
		defaultMultivalueAttribute(gen, MMMessageDefinition_.xors,
				mmBean.getXors());
		defaultMandatoryAttribute(gen, MMMessageDefinition_.rootElement,
				mmBean.getRootElement());
		defaultMultivalueAttribute(gen,
				MMMessageDefinition_.messageBuildingBlock,
				mmBean.getMessageBuildingBlock());
		defaultMultivalueAttribute(gen, MMMessageDefinition_.choreography,
				mmBean.getChoreography());
		defaultMultivalueAttribute(gen, MMMessageDefinition_.trace,
				mmBean.getTrace());
		defaultMandatoryAttribute(gen,
				MMMessageDefinition_.messageDefinitionIdentifier,
				mmBean.getMessageDefinitionIdentifier());
		defaultMultivalueAttribute(gen, MMMessageDefinition_.derivation,
				mmBean.getDerivation());
		return gen;
	}

	protected GenerationResult generateMMMessageSet(
			GenerationResult containerGen, MMMessageSet mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultMultivalueAttribute(gen, MMMessageSet_.generatedSyntax,
				mmBean.getGeneratedSyntax());
		defaultMultivalueAttribute(gen, MMMessageSet_.validEncoding,
				mmBean.getValidEncoding());
		defaultMultivalueAttribute(gen, MMMessageSet_.messageDefinition,
				mmBean.getMessageDefinition());
		return gen;
	}

	protected GenerationResult generateMMSyntax(GenerationResult containerGen,
			MMSyntax mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(gen, MMSyntax_.generatedFor,
				mmBean.getGeneratedFor());
		defaultMultivalueAttribute(gen, MMSyntax_.possibleEncodings,
				mmBean.getPossibleEncodings());
		return gen;
	}

	protected GenerationResult generateMMEncoding(
			GenerationResult containerGen, MMEncoding mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(gen, MMEncoding_.messageSet,
				mmBean.getMessageSet());
		defaultMandatoryAttribute(gen, MMEncoding_.syntax, mmBean.getSyntax());
		return gen;
	}

	protected GenerationResult generateMMBusinessArea(
			GenerationResult containerGen, MMBusinessArea mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultMandatoryAttribute(gen, MMBusinessArea_.code, mmBean.getCode());
		defaultMultivalueAttribute(gen, MMBusinessArea_.messageDefinition,
				mmBean.getMessageDefinition());
		return gen;
	}

	protected GenerationResult generateMMXor(GenerationResult containerGen,
			MMXor mmBean) {
		GenerationResult gen = null;
		implementMMRepositoryConcept(gen, mmBean);
		defaultOptionalAttribute(gen, MMXor_.messageComponent,
				mmBean.getMessageComponent());
		defaultMultivalueAttribute(gen, MMXor_.impactedElements,
				mmBean.getImpactedElements());
		defaultMultivalueAttribute(gen, MMXor_.impactedMessageBuildingBlocks,
				mmBean.getImpactedMessageBuildingBlocks());
		defaultOptionalAttribute(gen, MMXor_.messageDefinition,
				mmBean.getMessageDefinition());
		return gen;
	}

	protected GenerationResult generateMMBusinessComponent(
			GenerationResult containerGen, MMBusinessComponent mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMBusinessConcept(gen, mmBean);
		defaultOptionalAttribute(gen, MMBusinessComponent_.superType,
				mmBean.getSuperType());
		defaultMultivalueAttribute(gen, MMBusinessComponent_.element,
				mmBean.getElement());
		defaultMultivalueAttribute(gen, MMBusinessComponent_.subType,
				mmBean.getSubType());
		defaultMultivalueAttribute(gen,
				MMBusinessComponent_.derivationComponent,
				mmBean.getDerivationComponent());
		defaultMultivalueAttribute(gen, MMBusinessComponent_.associationDomain,
				mmBean.getAssociationDomain());
		defaultMultivalueAttribute(gen, MMBusinessComponent_.derivationElement,
				mmBean.getDerivationElement());
		return gen;
	}

	protected GenerationResult generateMMMessageBuildingBlock(
			GenerationResult containerGen, MMMessageBuildingBlock mmBean) {
		GenerationResult gen = null;
		implementMMMessageConstruct(gen, mmBean);
		defaultOptionalAttribute(gen, MMMessageBuildingBlock_.simpleType,
				mmBean.getSimpleType());
		defaultOptionalAttribute(gen, MMMessageBuildingBlock_.complexType,
				mmBean.getComplexType());
		return gen;
	}

	protected GenerationResult generateMMBusinessAssociationEnd(
			GenerationResult containerGen, MMBusinessAssociationEnd mmBean) {
		GenerationResult gen = null;
		implementMMBusinessElement(gen, mmBean);
		defaultOptionalAttribute(gen, MMBusinessAssociationEnd_.opposite,
				mmBean.getOpposite());
		defaultMandatoryAttribute(gen, MMBusinessAssociationEnd_.aggregation,
				mmBean.getAggregation());
		defaultMandatoryAttribute(gen, MMBusinessAssociationEnd_.type,
				mmBean.getType());
		return gen;
	}

	protected GenerationResult generateMMMessageComponent(
			GenerationResult containerGen, MMMessageComponent mmBean) {
		GenerationResult gen = null;
		implementMMMessageElementContainer(gen, mmBean);
		defaultMultivalueAttribute(gen, MMMessageComponent_.xors,
				mmBean.getXors());
		return gen;
	}

	protected GenerationResult generateMMMessageChoreography(
			GenerationResult containerGen, MMMessageChoreography mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultMultivalueAttribute(gen,
				MMMessageChoreography_.messageDefinition,
				mmBean.getMessageDefinition());
		defaultOptionalAttribute(gen,
				MMMessageChoreography_.businessTransactionTrace,
				mmBean.getBusinessTransactionTrace());
		return gen;
	}

	protected GenerationResult generateMMBusinessTransaction(
			GenerationResult containerGen, MMBusinessTransaction mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultMultivalueAttribute(gen, MMBusinessTransaction_.trace,
				mmBean.getTrace());
		defaultMandatoryAttribute(gen,
				MMBusinessTransaction_.businessProcessTrace,
				mmBean.getBusinessProcessTrace());
		defaultMultivalueAttribute(gen, MMBusinessTransaction_.participant,
				mmBean.getParticipant());
		defaultMultivalueAttribute(gen, MMBusinessTransaction_.transmission,
				mmBean.getTransmission());
		defaultMandatoryAttribute(gen,
				MMBusinessTransaction_.messageTransportMode,
				mmBean.getMessageTransportMode());
		defaultMultivalueAttribute(gen, MMBusinessTransaction_.subTransaction,
				mmBean.getSubTransaction());
		defaultOptionalAttribute(gen, MMBusinessTransaction_.parentTransaction,
				mmBean.getParentTransaction());
		return gen;
	}

	protected GenerationResult generateMMBusinessProcess(
			GenerationResult containerGen, MMBusinessProcess mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultMultivalueAttribute(gen,
				MMBusinessProcess_.businessProcessTrace,
				mmBean.getBusinessProcessTrace());
		defaultMultivalueAttribute(gen, MMBusinessProcess_.extender,
				mmBean.getExtender());
		defaultMultivalueAttribute(gen, MMBusinessProcess_.extended,
				mmBean.getExtended());
		defaultMultivalueAttribute(gen, MMBusinessProcess_.included,
				mmBean.getIncluded());
		defaultMultivalueAttribute(gen, MMBusinessProcess_.includer,
				mmBean.getIncluder());
		defaultMultivalueAttribute(gen, MMBusinessProcess_.businessRole,
				mmBean.getBusinessRole());
		return gen;
	}

	protected GenerationResult generateMMBusinessRole(
			GenerationResult containerGen, MMBusinessRole mmBean) {
		GenerationResult gen = null;
		implementMMRepositoryConcept(gen, mmBean);
		defaultMandatoryAttribute(gen, MMBusinessRole_.businessProcess,
				mmBean.getBusinessProcess());
		defaultMultivalueAttribute(gen, MMBusinessRole_.businessRoleTrace,
				mmBean.getBusinessRoleTrace());
		return gen;
	}

	protected GenerationResult generateMMParticipant(
			GenerationResult containerGen, MMParticipant mmBean) {
		GenerationResult gen = null;
		implementMMRepositoryConcept(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMParticipant_.businessRoleTrace,
				mmBean.getBusinessRoleTrace());
		defaultMandatoryAttribute(gen, MMParticipant_.businessTransaction,
				mmBean.getBusinessTransaction());
		defaultMultivalueAttribute(gen, MMParticipant_.receives,
				mmBean.getReceives());
		defaultMultivalueAttribute(gen, MMParticipant_.sends, mmBean.getSends());
		return gen;
	}

	protected GenerationResult generateMMReceive(GenerationResult containerGen,
			MMReceive mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMReceive_.receiver,
				mmBean.getReceiver());
		defaultMandatoryAttribute(gen, MMReceive_.messageTransmission,
				mmBean.getMessageTransmission());
		return gen;
	}

	protected GenerationResult generateMMMessageTransmission(
			GenerationResult containerGen, MMMessageTransmission mmBean) {
		GenerationResult gen = null;
		implementMMRepositoryConcept(gen, mmBean);
		defaultMultivalueAttribute(gen, MMMessageTransmission_.derivation,
				mmBean.getDerivation());
		defaultMandatoryAttribute(gen,
				MMMessageTransmission_.messageTypeDescription,
				mmBean.getMessageTypeDescription());
		defaultMandatoryAttribute(gen, MMMessageTransmission_.send,
				mmBean.getSend());
		defaultMultivalueAttribute(gen, MMMessageTransmission_.receive,
				mmBean.getReceive());
		defaultMandatoryAttribute(gen,
				MMMessageTransmission_.businessTransaction,
				mmBean.getBusinessTransaction());
		return gen;
	}

	protected GenerationResult generateMMSend(GenerationResult containerGen,
			MMSend mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMSend_.sender, mmBean.getSender());
		defaultMandatoryAttribute(gen, MMSend_.messageTransmission,
				mmBean.getMessageTransmission());
		return gen;
	}

	protected GenerationResult generateMMMessageTransportMode(
			GenerationResult containerGen, MMMessageTransportMode mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultMandatoryAttribute(gen,
				MMMessageTransportMode_.boundedCommunicationDelay,
				mmBean.getBoundedCommunicationDelay());
		defaultMandatoryAttribute(gen,
				MMMessageTransportMode_.maximumClockVariation,
				mmBean.getMaximumClockVariation());
		defaultMandatoryAttribute(gen,
				MMMessageTransportMode_.maximumMessageSize,
				mmBean.getMaximumMessageSize());
		defaultMandatoryAttribute(gen,
				MMMessageTransportMode_.messageDeliveryWindow,
				mmBean.getMessageDeliveryWindow());
		defaultMandatoryAttribute(gen,
				MMMessageTransportMode_.messageSendingWindow,
				mmBean.getMessageSendingWindow());
		defaultMandatoryAttribute(gen,
				MMMessageTransportMode_.deliveryAssurance,
				mmBean.getDeliveryAssurance());
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.durability,
				mmBean.getDurability());
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.messageCasting,
				mmBean.getMessageCasting());
		defaultMandatoryAttribute(gen,
				MMMessageTransportMode_.messageDeliveryOrder,
				mmBean.getMessageDeliveryOrder());
		defaultMandatoryAttribute(gen,
				MMMessageTransportMode_.messageValidationLevel,
				mmBean.getMessageValidationLevel());
		defaultMandatoryAttribute(gen,
				MMMessageTransportMode_.messageValidationOnOff,
				mmBean.getMessageValidationOnOff());
		defaultMandatoryAttribute(gen,
				MMMessageTransportMode_.messageValidationResults,
				mmBean.getMessageValidationResults());
		defaultMandatoryAttribute(gen,
				MMMessageTransportMode_.receiverAsynchronicity,
				mmBean.getReceiverAsynchronicity());
		defaultMandatoryAttribute(gen,
				MMMessageTransportMode_.senderAsynchronicity,
				mmBean.getSenderAsynchronicity());
		defaultMultivalueAttribute(gen,
				MMMessageTransportMode_.businessTransaction,
				mmBean.getBusinessTransaction());
		return gen;
	}

	protected GenerationResult generateMMMessageDefinitionIdentifier(
			GenerationResult containerGen, MMMessageDefinitionIdentifier mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(gen,
				MMMessageDefinitionIdentifier_.businessArea,
				mmBean.getBusinessArea());
		defaultMandatoryAttribute(gen,
				MMMessageDefinitionIdentifier_.messageFunctionality,
				mmBean.getMessageFunctionality());
		defaultMandatoryAttribute(gen, MMMessageDefinitionIdentifier_.flavour,
				mmBean.getFlavour());
		defaultMandatoryAttribute(gen, MMMessageDefinitionIdentifier_.version,
				mmBean.getVersion());
		return gen;
	}

	protected GenerationResult generateMMConversation(
			GenerationResult containerGen, MMConversation mmBean) {
		GenerationResult gen = null;
		implementMMModelEntity(gen, mmBean);
		return gen;
	}

	protected GenerationResult generateMMMessageAssociationEnd(
			GenerationResult containerGen, MMMessageAssociationEnd mmBean) {
		GenerationResult gen = null;
		implementMMMessageElement(gen, mmBean);
		defaultMandatoryAttribute(gen, MMMessageAssociationEnd_.isComposite,
				mmBean.isIsComposite());
		defaultMandatoryAttribute(gen, MMMessageAssociationEnd_.type,
				mmBean.getType());
		return gen;
	}

	protected GenerationResult generateMMMessageAttribute(
			GenerationResult containerGen, MMMessageAttribute mmBean) {
		GenerationResult gen = null;
		implementMMMessageElement(gen, mmBean);
		defaultOptionalAttribute(gen, MMMessageAttribute_.simpleType,
				mmBean.getSimpleType());
		defaultOptionalAttribute(gen, MMMessageAttribute_.complexType,
				mmBean.getComplexType());
		return gen;
	}

	protected GenerationResult generateMMBusinessAttribute(
			GenerationResult containerGen, MMBusinessAttribute mmBean) {
		GenerationResult gen = null;
		implementMMBusinessElement(gen, mmBean);
		defaultOptionalAttribute(gen, MMBusinessAttribute_.simpleType,
				mmBean.getSimpleType());
		defaultOptionalAttribute(gen, MMBusinessAttribute_.complexType,
				mmBean.getComplexType());
		return gen;
	}

	protected GenerationResult generateMMText(GenerationResult containerGen,
			MMText mmBean) {
		GenerationResult gen = null;
		return gen;
	}

	protected GenerationResult generateMMString(GenerationResult containerGen,
			MMString mmBean) {
		GenerationResult gen = null;
		implementMMDataType(gen, mmBean);
		defaultOptionalAttribute(gen, MMString_.pattern, mmBean.getPattern());
		defaultOptionalAttribute(gen, MMString_.maxLength,
				mmBean.getMaxLength());
		defaultOptionalAttribute(gen, MMString_.minLength,
				mmBean.getMinLength());
		defaultOptionalAttribute(gen, MMString_.length, mmBean.getLength());
		return gen;
	}

	protected GenerationResult generateMMIdentifierSet(
			GenerationResult containerGen, MMIdentifierSet mmBean) {
		GenerationResult gen = null;
		defaultMandatoryAttribute(gen, MMIdentifierSet_.identificationScheme,
				mmBean.getIdentificationScheme());
		return gen;
	}

	protected GenerationResult generateMMIndicator(
			GenerationResult containerGen, MMIndicator mmBean) {
		GenerationResult gen = null;
		defaultMandatoryAttribute(gen, MMIndicator_.meaningWhenTrue,
				mmBean.getMeaningWhenTrue());
		defaultMandatoryAttribute(gen, MMIndicator_.meaningWhenFalse,
				mmBean.getMeaningWhenFalse());
		return gen;
	}

	protected GenerationResult generateMMBoolean(GenerationResult containerGen,
			MMBoolean mmBean) {
		GenerationResult gen = null;
		implementMMDataType(gen, mmBean);
		defaultOptionalAttribute(gen, MMBoolean_.pattern, mmBean.getPattern());
		return gen;
	}

	protected GenerationResult generateMMRate(GenerationResult containerGen,
			MMRate mmBean) {
		GenerationResult gen = null;
		defaultOptionalAttribute(gen, MMRate_.baseUnitCode,
				mmBean.getBaseUnitCode());
		defaultMandatoryAttribute(gen, MMRate_.baseValue, mmBean.getBaseValue());
		return gen;
	}

	protected GenerationResult generateMMDecimal(GenerationResult containerGen,
			MMDecimal mmBean) {
		GenerationResult gen = null;
		implementMMDataType(gen, mmBean);
		defaultOptionalAttribute(gen, MMDecimal_.pattern, mmBean.getPattern());
		defaultOptionalAttribute(gen, MMDecimal_.minInclusive,
				mmBean.getMinInclusive());
		defaultOptionalAttribute(gen, MMDecimal_.minExclusive,
				mmBean.getMinExclusive());
		defaultOptionalAttribute(gen, MMDecimal_.maxInclusive,
				mmBean.getMaxInclusive());
		defaultOptionalAttribute(gen, MMDecimal_.maxExclusive,
				mmBean.getMaxExclusive());
		defaultOptionalAttribute(gen, MMDecimal_.totalDigits,
				mmBean.getTotalDigits());
		defaultOptionalAttribute(gen, MMDecimal_.fractionDigits,
				mmBean.getFractionDigits());
		return gen;
	}

	protected GenerationResult generateMMExternalSchema(
			GenerationResult containerGen, MMExternalSchema mmBean) {
		GenerationResult gen = null;
		implementMMMessageComponentType(gen, mmBean);
		defaultMultivalueAttribute(gen, MMExternalSchema_.namespaceList,
				mmBean.getNamespaceList());
		defaultMandatoryAttribute(gen, MMExternalSchema_.processContent,
				mmBean.getProcessContent());
		return gen;
	}

	protected GenerationResult generateMMQuantity(
			GenerationResult containerGen, MMQuantity mmBean) {
		GenerationResult gen = null;
		defaultOptionalAttribute(gen, MMQuantity_.unitCode,
				mmBean.getUnitCode());
		return gen;
	}

	protected GenerationResult generateMMCode(GenerationResult containerGen,
			MMCode mmBean) {
		GenerationResult gen = null;
		implementMMRepositoryConcept(gen, mmBean);
		defaultMandatoryAttribute(gen, MMCode_.owner, mmBean.getOwner());
		defaultOptionalAttribute(gen, MMCode_.codeName, mmBean.getCodeName());
		return gen;
	}

	protected GenerationResult generateMMCodeSet(GenerationResult containerGen,
			MMCodeSet mmBean) {
		GenerationResult gen = null;
		defaultMultivalueAttribute(gen, MMCodeSet_.code, mmBean.getCode());
		defaultOptionalAttribute(gen, MMCodeSet_.trace, mmBean.getTrace());
		defaultMultivalueAttribute(gen, MMCodeSet_.derivation,
				mmBean.getDerivation());
		defaultOptionalAttribute(gen, MMCodeSet_.identificationScheme,
				mmBean.getIdentificationScheme());
		return gen;
	}

	protected GenerationResult generateMMAmount(GenerationResult containerGen,
			MMAmount mmBean) {
		GenerationResult gen = null;
		defaultOptionalAttribute(gen, MMAmount_.currencyIdentifierSet,
				mmBean.getCurrencyIdentifierSet());
		return gen;
	}

	protected GenerationResult generateMMChoiceComponent(
			GenerationResult containerGen, MMChoiceComponent mmBean) {
		GenerationResult gen = null;
		implementMMMessageElementContainer(gen, mmBean);
		return gen;
	}

	protected GenerationResult generateMMEndPointCategory(
			GenerationResult containerGen, MMEndPointCategory mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		defaultMultivalueAttribute(gen, MMEndPointCategory_.endPoints,
				mmBean.getEndPoints());
		return gen;
	}

	protected GenerationResult generateMMBinary(GenerationResult containerGen,
			MMBinary mmBean) {
		GenerationResult gen = null;
		implementMMDataType(gen, mmBean);
		defaultOptionalAttribute(gen, MMBinary_.pattern, mmBean.getPattern());
		defaultOptionalAttribute(gen, MMBinary_.maxLength,
				mmBean.getMaxLength());
		defaultOptionalAttribute(gen, MMBinary_.minLength,
				mmBean.getMinLength());
		defaultOptionalAttribute(gen, MMBinary_.length, mmBean.getLength());
		return gen;
	}

	protected GenerationResult generateMMDate(GenerationResult containerGen,
			MMDate mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected GenerationResult generateMMDateTime(
			GenerationResult containerGen, MMDateTime mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected GenerationResult generateMMDay(GenerationResult containerGen,
			MMDay mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected GenerationResult generateMMDuration(
			GenerationResult containerGen, MMDuration mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected GenerationResult generateMMMonth(GenerationResult containerGen,
			MMMonth mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected GenerationResult generateMMMonthDay(
			GenerationResult containerGen, MMMonthDay mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected GenerationResult generateMMTime(GenerationResult containerGen,
			MMTime mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected GenerationResult generateMMYear(GenerationResult containerGen,
			MMYear mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected GenerationResult generateMMYearMonth(
			GenerationResult containerGen, MMYearMonth mmBean) {
		GenerationResult gen = null;
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected GenerationResult generateMMUserDefined(
			GenerationResult containerGen, MMUserDefined mmBean) {
		GenerationResult gen = null;
		implementMMMessageComponentType(gen, mmBean);
		defaultOptionalAttribute(gen, MMUserDefined_.namespaceList,
				mmBean.getNamespaceList());
		defaultMandatoryAttribute(gen, MMUserDefined_.processContents,
				mmBean.getProcessContents());
		defaultMandatoryAttribute(gen, MMUserDefined_.namespace,
				mmBean.getNamespace());
		return gen;
	}

	protected GenerationResult generateMMIndustryMessageSet(
			GenerationResult containerGen, MMIndustryMessageSet mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		return gen;
	}

	protected GenerationResult generateMMConvergenceDocumentation(
			GenerationResult containerGen, MMConvergenceDocumentation mmBean) {
		GenerationResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		return gen;
	}

	protected GenerationResult generateMMISO15022MessageSet(
			GenerationResult containerGen, MMISO15022MessageSet mmBean) {
		GenerationResult gen = null;
		return gen;
	}

	protected GenerationResult generateMMSchemaType(
			GenerationResult containerGen, MMSchemaType mmBean) {
		GenerationResult gen = null;
		implementMMDataType(gen, mmBean);
		defaultMandatoryAttribute(gen, MMSchemaType_.kind, mmBean.getKind());
		return gen;
	}

	protected void implementMMModelEntity(GenerationResult gen,
			MMModelEntity mmBean) {
		defaultMultivalueAttribute(gen, MMModelEntity_.nextVersions,
				mmBean.getNextVersions());
		defaultOptionalAttribute(gen, MMModelEntity_.previousVersion,
				mmBean.getPreviousVersion());
		defaultOptionalAttribute(gen, MMModelEntity_.objectIdentifier,
				mmBean.getObjectIdentifier());
	}

	protected void implementMMTopLevelCatalogueEntry(GenerationResult gen,
			MMTopLevelCatalogueEntry mmBean) {
		implementMMRepositoryConcept(gen, mmBean);
		defaultMandatoryAttribute(gen,
				MMTopLevelCatalogueEntry_.businessProcessCatalogue,
				mmBean.getBusinessProcessCatalogue());
	}

	protected void implementMMRepositoryConcept(GenerationResult gen,
			MMRepositoryConcept mmBean) {
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(gen, MMRepositoryConcept_.doclet,
				mmBean.getDoclet());
		defaultMultivalueAttribute(gen, MMRepositoryConcept_.example,
				mmBean.getExample());
		defaultMultivalueAttribute(gen, MMRepositoryConcept_.constraint,
				mmBean.getConstraint());
		defaultMandatoryAttribute(gen, MMRepositoryConcept_.registrationStatus,
				mmBean.getRegistrationStatus());
		defaultOptionalAttribute(gen, MMRepositoryConcept_.removalDate,
				mmBean.getRemovalDate());
		defaultMultivalueAttribute(gen, MMRepositoryConcept_.semanticMarkup,
				mmBean.getSemanticMarkup());
		defaultMandatoryAttribute(gen, MMRepositoryConcept_.name,
				mmBean.getName());
		defaultOptionalAttribute(gen, MMRepositoryConcept_.definition,
				mmBean.getDefinition());
	}

	protected void implementMMTopLevelDictionaryEntry(GenerationResult gen,
			MMTopLevelDictionaryEntry mmBean) {
		implementMMRepositoryConcept(gen, mmBean);
		defaultMandatoryAttribute(gen,
				MMTopLevelDictionaryEntry_.dataDictionary,
				mmBean.getDataDictionary());
	}

	protected void implementMMRepositoryType(GenerationResult gen,
			MMRepositoryType mmBean) {
		implementMMRepositoryConcept(gen, mmBean);
	}

	protected void implementMMMessageElement(GenerationResult gen,
			MMMessageElement mmBean) {
		implementMMMessageConstruct(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
		defaultMandatoryAttribute(gen, MMMessageElement_.isTechnical,
				mmBean.isIsTechnical());
		defaultOptionalAttribute(gen, MMMessageElement_.businessComponentTrace,
				mmBean.getBusinessComponentTrace());
		defaultOptionalAttribute(gen, MMMessageElement_.businessElementTrace,
				mmBean.getBusinessElementTrace());
		defaultMandatoryAttribute(gen, MMMessageElement_.componentContext,
				mmBean.getComponentContext());
		defaultMandatoryAttribute(gen, MMMessageElement_.isDerived,
				mmBean.isIsDerived());
	}

	protected void implementMMMessageConstruct(GenerationResult gen,
			MMMessageConstruct mmBean) {
		implementMMConstruct(gen, mmBean);
		defaultOptionalAttribute(gen, MMMessageConstruct_.xmlTag,
				mmBean.getXmlTag());
		defaultMandatoryAttribute(gen, MMMessageConstruct_.xmlMemberType,
				mmBean.getXmlMemberType());
	}

	protected void implementMMConstruct(GenerationResult gen, MMConstruct mmBean) {
		implementMMRepositoryConcept(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMConstruct_.memberType,
				mmBean.getMemberType());
	}

	protected void implementMMMultiplicityEntity(GenerationResult gen,
			MMMultiplicityEntity mmBean) {
		defaultOptionalAttribute(gen, MMMultiplicityEntity_.maxOccurs,
				mmBean.getMaxOccurs());
		defaultOptionalAttribute(gen, MMMultiplicityEntity_.minOccurs,
				mmBean.getMinOccurs());
	}

	protected void implementMMLogicalType(GenerationResult gen,
			MMLogicalType mmBean) {
		implementMMRepositoryType(gen, mmBean);
	}

	protected void implementMMMessageConcept(GenerationResult gen,
			MMMessageConcept mmBean) {
		implementMMModelEntity(gen, mmBean);
	}

	protected void implementMMBusinessElementType(GenerationResult gen,
			MMBusinessElementType mmBean) {
		implementMMRepositoryType(gen, mmBean);
	}

	protected void implementMMBusinessConcept(GenerationResult gen,
			MMBusinessConcept mmBean) {
		implementMMModelEntity(gen, mmBean);
	}

	protected void implementMMBusinessElement(GenerationResult gen,
			MMBusinessElement mmBean) {
		implementMMConstruct(gen, mmBean);
		implementMMBusinessConcept(gen, mmBean);
		defaultMandatoryAttribute(gen, MMBusinessElement_.elementContext,
				mmBean.getElementContext());
		defaultMultivalueAttribute(gen, MMBusinessElement_.derivation,
				mmBean.getDerivation());
		defaultMandatoryAttribute(gen, MMBusinessElement_.isDerived,
				mmBean.isIsDerived());
		defaultMandatoryAttribute(gen, MMBusinessElement_.businessElementType,
				mmBean.getBusinessElementType());
	}

	protected void implementMMMessageComponentType(GenerationResult gen,
			MMMessageComponentType mmBean) {
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
		defaultMultivalueAttribute(gen,
				MMMessageComponentType_.messageBuildingBlock,
				mmBean.getMessageBuildingBlock());
		defaultOptionalAttribute(gen, MMMessageComponentType_.trace,
				mmBean.getTrace());
		defaultMandatoryAttribute(gen, MMMessageComponentType_.isTechnical,
				mmBean.isIsTechnical());
	}

	protected void implementMMDataType(GenerationResult gen, MMDataType mmBean) {
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
	}

	protected void implementMMMessageElementContainer(GenerationResult gen,
			MMMessageElementContainer mmBean) {
		implementMMMessageComponentType(gen, mmBean);
		defaultMultivalueAttribute(gen,
				MMMessageElementContainer_.messageElement,
				mmBean.getMessageElement());
	}

	protected void implementMMAbstractDateTimeConcept(GenerationResult gen,
			MMAbstractDateTimeConcept mmBean) {
		implementMMDataType(gen, mmBean);
		defaultOptionalAttribute(gen, MMAbstractDateTimeConcept_.pattern,
				mmBean.getPattern());
		defaultOptionalAttribute(gen, MMAbstractDateTimeConcept_.minInclusive,
				mmBean.getMinInclusive());
		defaultOptionalAttribute(gen, MMAbstractDateTimeConcept_.minExclusive,
				mmBean.getMinExclusive());
		defaultOptionalAttribute(gen, MMAbstractDateTimeConcept_.maxInclusive,
				mmBean.getMaxInclusive());
		defaultOptionalAttribute(gen, MMAbstractDateTimeConcept_.maxExclusive,
				mmBean.getMaxExclusive());
	}
}