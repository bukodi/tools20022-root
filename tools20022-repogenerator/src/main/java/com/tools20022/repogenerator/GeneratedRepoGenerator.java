package com.tools20022.repogenerator;

import com.tools20022.generators.GenerationResult;
import com.tools20022.metamodel.*;
import com.tools20022.metamodel.struct.*;
import com.tools20022.repogenerator.BaseRepoGenerator;
import com.tools20022.repogenerator.resulttypes.EnumConstantResult;
import com.tools20022.repogenerator.resulttypes.EnumTypeResult;
import com.tools20022.repogenerator.resulttypes.MainTypeResult;
import com.tools20022.repogenerator.resulttypes.SubTypeResult;

public class GeneratedRepoGenerator extends BaseRepoGenerator {

	protected MainTypeResult generateMMAddress(MMAddress mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(gen, MMAddress_.broadCastList, mmBean.getBroadCastList());
		defaultMandatoryAttribute(gen, MMAddress_.endpoint, mmBean.getEndpoint());
		return gen;
	}

	protected MainTypeResult generateMMBroadcastList(MMBroadcastList mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(gen, MMBroadcastList_.address, mmBean.getAddress());
		return gen;
	}

	protected MainTypeResult generateMMMessagingEndpoint(MainTypeResult containerGen, MMMessagingEndpoint mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(gen, MMMessagingEndpoint_.receivedMessage, mmBean.getReceivedMessage());
		defaultMultivalueAttribute(gen, MMMessagingEndpoint_.sentMessage, mmBean.getSentMessage());
		defaultMandatoryAttribute(gen, MMMessagingEndpoint_.transportSystem, mmBean.getTransportSystem());
		defaultMultivalueAttribute(gen, MMMessagingEndpoint_.location, mmBean.getLocation());
		return gen;
	}

	protected MainTypeResult generateMMMessageTransportSystem(MMMessageTransportSystem mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		for (MMMessagingEndpoint mmChild : mmBean.getEndpoint()) {
			generateMMMessagingEndpoint(gen, mmChild);
		}
		defaultMultivalueAttribute(gen, MMMessageTransportSystem_.endpoint, mmBean.getEndpoint());
		return gen;
	}

	protected MainTypeResult generateMMTransportMessage(MMTransportMessage mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMTransportMessage_.sender, mmBean.getSender());
		defaultMandatoryAttribute(gen, MMTransportMessage_.messageInstance, mmBean.getMessageInstance());
		defaultMultivalueAttribute(gen, MMTransportMessage_.receiver, mmBean.getReceiver());
		return gen;
	}

	protected MainTypeResult generateMMMessageInstance(MMMessageInstance mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMMessageInstance_.specification, mmBean.getSpecification());
		defaultMultivalueAttribute(gen, MMMessageInstance_.transportMessage, mmBean.getTransportMessage());
		return gen;
	}

	protected MainTypeResult generateMMSyntaxMessageScheme(SubTypeResult containerGen, MMSyntaxMessageScheme mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultOptionalAttribute(gen, MMSyntaxMessageScheme_.messageDefinitionTrace,
				mmBean.getMessageDefinitionTrace());
		return gen;
	}

	protected MainTypeResult generateMMSemanticMarkup(MainTypeResult containerGen, MMSemanticMarkup mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		for (MMSemanticMarkupElement mmChild : mmBean.getElements()) {
			generateMMSemanticMarkupElement(gen, mmChild);
		}
		defaultMultivalueAttribute(gen, MMSemanticMarkup_.elements, mmBean.getElements());
		defaultOptionalAttribute(gen, MMSemanticMarkup_.type, mmBean.getType());
		return gen;
	}

	protected MainTypeResult generateMMSemanticMarkupElement(MainTypeResult containerGen,
			MMSemanticMarkupElement mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultOptionalAttribute(gen, MMSemanticMarkupElement_.name, mmBean.getName());
		defaultOptionalAttribute(gen, MMSemanticMarkupElement_.value, mmBean.getValue());
		return gen;
	}

	protected MainTypeResult generateMMDoclet(MainTypeResult containerGen, MMDoclet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultOptionalAttribute(gen, MMDoclet_.type, mmBean.getType());
		defaultOptionalAttribute(gen, MMDoclet_.content, mmBean.getContent());
		return gen;
	}

	protected MainTypeResult generateMMConstraint(MainTypeResult containerGen, MMConstraint mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		defaultMandatoryAttribute(gen, MMConstraint_.owner, mmBean.getOwner());
		defaultOptionalAttribute(gen, MMConstraint_.expression, mmBean.getExpression());
		defaultOptionalAttribute(gen, MMConstraint_.expressionLanguage, mmBean.getExpressionLanguage());
		return gen;
	}

	protected SubTypeResult generateMMBusinessProcessCatalogue(MainTypeResult containerGen,
			MMBusinessProcessCatalogue mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMModelEntity(gen, mmBean);
		for (MMTopLevelCatalogueEntry mmChild : mmBean.getTopLevelCatalogueEntry()) {
			generateMMTopLevelCatalogueEntry(gen, mmChild);
		}
		defaultMandatoryAttribute(gen, MMBusinessProcessCatalogue_.repository, mmBean.getRepository());
		defaultMultivalueAttribute(gen, MMBusinessProcessCatalogue_.topLevelCatalogueEntry,
				mmBean.getTopLevelCatalogueEntry());
		return gen;
	}

	protected MainTypeResult generateMMRepository(MMRepository mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		generateMMBusinessProcessCatalogue(gen, mmBean.getBusinessProcessCatalogue());
		generateMMDataDictionary(gen, mmBean.getDataDictionary());
		defaultMandatoryAttribute(gen, MMRepository_.businessProcessCatalogue, mmBean.getBusinessProcessCatalogue());
		defaultMandatoryAttribute(gen, MMRepository_.dataDictionary, mmBean.getDataDictionary());
		return gen;
	}

	protected SubTypeResult generateMMDataDictionary(MainTypeResult containerGen, MMDataDictionary mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMModelEntity(gen, mmBean);
		for (MMTopLevelDictionaryEntry mmChild : mmBean.getTopLevelDictionaryEntry()) {
			generateMMTopLevelDictionaryEntry(gen, mmChild);
		}
		defaultMandatoryAttribute(gen, MMDataDictionary_.repository, mmBean.getRepository());
		defaultMultivalueAttribute(gen, MMDataDictionary_.topLevelDictionaryEntry, mmBean.getTopLevelDictionaryEntry());
		return gen;
	}

	protected MainTypeResult generateMMMessageDefinition(MainTypeResult containerGen, MMMessageDefinition mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMRepositoryType(gen, mmBean);
		for (MMXor mmChild : mmBean.getXors()) {
			generateMMXorInMessageDefinition(gen, mmChild);
		}
		for (MMMessageBuildingBlock mmChild : mmBean.getMessageBuildingBlock()) {
			generateMMMessageBuildingBlock(gen, mmChild);
		}
		generateMMMessageDefinitionIdentifier(gen, mmBean.getMessageDefinitionIdentifier());
		defaultMandatoryAttribute(gen, MMMessageDefinition_.businessArea, mmBean.getBusinessArea());
		defaultMultivalueAttribute(gen, MMMessageDefinition_.messageSet, mmBean.getMessageSet());
		defaultOptionalAttribute(gen, MMMessageDefinition_.xmlName, mmBean.getXmlName());
		defaultOptionalAttribute(gen, MMMessageDefinition_.xmlTag, mmBean.getXmlTag());
		defaultMultivalueAttribute(gen, MMMessageDefinition_.xors, mmBean.getXors());
		defaultMandatoryAttribute(gen, MMMessageDefinition_.rootElement, mmBean.getRootElement());
		defaultMultivalueAttribute(gen, MMMessageDefinition_.messageBuildingBlock, mmBean.getMessageBuildingBlock());
		defaultMultivalueAttribute(gen, MMMessageDefinition_.choreography, mmBean.getChoreography());
		defaultMultivalueAttribute(gen, MMMessageDefinition_.trace, mmBean.getTrace());
		defaultMandatoryAttribute(gen, MMMessageDefinition_.messageDefinitionIdentifier,
				mmBean.getMessageDefinitionIdentifier());
		defaultMultivalueAttribute(gen, MMMessageDefinition_.derivation, mmBean.getDerivation());
		return gen;
	}

	protected MainTypeResult generateMMMessageSet(SubTypeResult containerGen, MMMessageSet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultMultivalueAttribute(gen, MMMessageSet_.messageDefinition, mmBean.getMessageDefinition());
		defaultMultivalueAttribute(gen, MMMessageSet_.validEncoding, mmBean.getValidEncoding());
		defaultMultivalueAttribute(gen, MMMessageSet_.generatedSyntax, mmBean.getGeneratedSyntax());
		return gen;
	}

	protected MainTypeResult generateMMSyntax(MMSyntax mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(gen, MMSyntax_.possibleEncodings, mmBean.getPossibleEncodings());
		defaultMultivalueAttribute(gen, MMSyntax_.generatedFor, mmBean.getGeneratedFor());
		return gen;
	}

	protected MainTypeResult generateMMEncoding(MMEncoding mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(gen, MMEncoding_.messageSet, mmBean.getMessageSet());
		defaultMandatoryAttribute(gen, MMEncoding_.syntax, mmBean.getSyntax());
		return gen;
	}

	protected MainTypeResult generateMMBusinessArea(SubTypeResult containerGen, MMBusinessArea mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		for (MMMessageDefinition mmChild : mmBean.getMessageDefinition()) {
			generateMMMessageDefinition(gen, mmChild);
		}
		defaultMultivalueAttribute(gen, MMBusinessArea_.messageDefinition, mmBean.getMessageDefinition());
		defaultMandatoryAttribute(gen, MMBusinessArea_.code, mmBean.getCode());
		return gen;
	}

	protected SubTypeResult generateMMXorInMessageDefinition(MainTypeResult containerGen, MMXor mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMRepositoryConcept(gen, mmBean);
		defaultOptionalAttribute(gen, MMXor_.messageComponent, mmBean.getMessageComponent());
		defaultOptionalAttribute(gen, MMXor_.messageDefinition, mmBean.getMessageDefinition());
		defaultMultivalueAttribute(gen, MMXor_.impactedElements, mmBean.getImpactedElements());
		defaultMultivalueAttribute(gen, MMXor_.impactedMessageBuildingBlocks,
				mmBean.getImpactedMessageBuildingBlocks());
		return gen;
	}

	protected SubTypeResult generateMMXorInMessageComponent(MainTypeResult containerGen, MMXor mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMRepositoryConcept(gen, mmBean);
		defaultOptionalAttribute(gen, MMXor_.messageComponent, mmBean.getMessageComponent());
		defaultOptionalAttribute(gen, MMXor_.messageDefinition, mmBean.getMessageDefinition());
		defaultMultivalueAttribute(gen, MMXor_.impactedElements, mmBean.getImpactedElements());
		defaultMultivalueAttribute(gen, MMXor_.impactedMessageBuildingBlocks,
				mmBean.getImpactedMessageBuildingBlocks());
		return gen;
	}

	protected MainTypeResult generateMMBusinessComponent(SubTypeResult containerGen, MMBusinessComponent mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMBusinessConcept(gen, mmBean);
		for (MMBusinessElement mmChild : mmBean.getElement()) {
			generateMMBusinessElement(gen, mmChild);
		}
		defaultMultivalueAttribute(gen, MMBusinessComponent_.derivationElement, mmBean.getDerivationElement());
		defaultMultivalueAttribute(gen, MMBusinessComponent_.subType, mmBean.getSubType());
		defaultOptionalAttribute(gen, MMBusinessComponent_.superType, mmBean.getSuperType());
		defaultMultivalueAttribute(gen, MMBusinessComponent_.element, mmBean.getElement());
		defaultMultivalueAttribute(gen, MMBusinessComponent_.derivationComponent, mmBean.getDerivationComponent());
		defaultMultivalueAttribute(gen, MMBusinessComponent_.associationDomain, mmBean.getAssociationDomain());
		return gen;
	}

	protected SubTypeResult generateMMMessageBuildingBlock(MainTypeResult containerGen, MMMessageBuildingBlock mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMMessageConstruct(gen, mmBean);
		defaultOptionalAttribute(gen, MMMessageBuildingBlock_.simpleType, mmBean.getSimpleType());
		defaultOptionalAttribute(gen, MMMessageBuildingBlock_.complexType, mmBean.getComplexType());
		return gen;
	}

	protected SubTypeResult generateMMBusinessAssociationEnd(MainTypeResult containerGen,
			MMBusinessAssociationEnd mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMBusinessElement(gen, mmBean);
		defaultOptionalAttribute(gen, MMBusinessAssociationEnd_.opposite, mmBean.getOpposite());
		defaultMandatoryAttribute(gen, MMBusinessAssociationEnd_.aggregation, mmBean.getAggregation());
		defaultMandatoryAttribute(gen, MMBusinessAssociationEnd_.type, mmBean.getType());
		return gen;
	}

	protected MainTypeResult generateMMMessageComponent(SubTypeResult containerGen, MMMessageComponent mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMMessageElementContainer(gen, mmBean);
		for (MMXor mmChild : mmBean.getXors()) {
			generateMMXorInMessageComponent(gen, mmChild);
		}
		defaultMultivalueAttribute(gen, MMMessageComponent_.xors, mmBean.getXors());
		return gen;
	}

	protected MainTypeResult generateMMMessageChoreography(SubTypeResult containerGen, MMMessageChoreography mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultMultivalueAttribute(gen, MMMessageChoreography_.messageDefinition, mmBean.getMessageDefinition());
		defaultOptionalAttribute(gen, MMMessageChoreography_.businessTransactionTrace,
				mmBean.getBusinessTransactionTrace());
		return gen;
	}

	protected MainTypeResult generateMMBusinessTransaction(SubTypeResult containerGen, MMBusinessTransaction mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		for (MMParticipant mmChild : mmBean.getParticipant()) {
			generateMMParticipant(gen, mmChild);
		}
		for (MMMessageTransmission mmChild : mmBean.getTransmission()) {
			generateMMMessageTransmission(gen, mmChild);
		}
		defaultMultivalueAttribute(gen, MMBusinessTransaction_.trace, mmBean.getTrace());
		defaultMandatoryAttribute(gen, MMBusinessTransaction_.businessProcessTrace, mmBean.getBusinessProcessTrace());
		defaultMultivalueAttribute(gen, MMBusinessTransaction_.participant, mmBean.getParticipant());
		defaultMultivalueAttribute(gen, MMBusinessTransaction_.transmission, mmBean.getTransmission());
		defaultMandatoryAttribute(gen, MMBusinessTransaction_.messageTransportMode, mmBean.getMessageTransportMode());
		defaultMultivalueAttribute(gen, MMBusinessTransaction_.subTransaction, mmBean.getSubTransaction());
		defaultOptionalAttribute(gen, MMBusinessTransaction_.parentTransaction, mmBean.getParentTransaction());
		return gen;
	}

	protected EnumTypeResult generateMMBusinessProcess(SubTypeResult containerGen, MMBusinessProcess mmBean) {
		EnumTypeResult gen = null;
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		for (MMBusinessRole mmChild : mmBean.getBusinessRole()) {
			generateMMBusinessRole(gen, mmChild);
		}
		defaultMultivalueAttribute(gen, MMBusinessProcess_.businessProcessTrace, mmBean.getBusinessProcessTrace());
		defaultMultivalueAttribute(gen, MMBusinessProcess_.extender, mmBean.getExtender());
		defaultMultivalueAttribute(gen, MMBusinessProcess_.extended, mmBean.getExtended());
		defaultMultivalueAttribute(gen, MMBusinessProcess_.included, mmBean.getIncluded());
		defaultMultivalueAttribute(gen, MMBusinessProcess_.includer, mmBean.getIncluder());
		defaultMultivalueAttribute(gen, MMBusinessProcess_.businessRole, mmBean.getBusinessRole());
		return gen;
	}

	protected EnumConstantResult generateMMBusinessRole(EnumTypeResult containerGen, MMBusinessRole mmBean) {
		EnumConstantResult gen = null;
		implementMMRepositoryConcept(gen, mmBean);
		defaultMandatoryAttribute(gen, MMBusinessRole_.businessProcess, mmBean.getBusinessProcess());
		defaultMultivalueAttribute(gen, MMBusinessRole_.businessRoleTrace, mmBean.getBusinessRoleTrace());
		return gen;
	}

	protected MainTypeResult generateMMParticipant(MainTypeResult containerGen, MMParticipant mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMParticipant_.businessRoleTrace, mmBean.getBusinessRoleTrace());
		defaultMandatoryAttribute(gen, MMParticipant_.businessTransaction, mmBean.getBusinessTransaction());
		defaultMultivalueAttribute(gen, MMParticipant_.receives, mmBean.getReceives());
		defaultMultivalueAttribute(gen, MMParticipant_.sends, mmBean.getSends());
		return gen;
	}

	protected MainTypeResult generateMMReceive(MainTypeResult containerGen, MMReceive mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMReceive_.receiver, mmBean.getReceiver());
		defaultMandatoryAttribute(gen, MMReceive_.messageTransmission, mmBean.getMessageTransmission());
		return gen;
	}

	protected MainTypeResult generateMMMessageTransmission(MainTypeResult containerGen, MMMessageTransmission mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		generateMMSend(gen, mmBean.getSend());
		for (MMReceive mmChild : mmBean.getReceive()) {
			generateMMReceive(gen, mmChild);
		}
		defaultMultivalueAttribute(gen, MMMessageTransmission_.derivation, mmBean.getDerivation());
		defaultMandatoryAttribute(gen, MMMessageTransmission_.businessTransaction, mmBean.getBusinessTransaction());
		defaultMandatoryAttribute(gen, MMMessageTransmission_.messageTypeDescription,
				mmBean.getMessageTypeDescription());
		defaultMandatoryAttribute(gen, MMMessageTransmission_.send, mmBean.getSend());
		defaultMultivalueAttribute(gen, MMMessageTransmission_.receive, mmBean.getReceive());
		return gen;
	}

	protected MainTypeResult generateMMSend(MainTypeResult containerGen, MMSend mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMSend_.sender, mmBean.getSender());
		defaultMandatoryAttribute(gen, MMSend_.messageTransmission, mmBean.getMessageTransmission());
		return gen;
	}

	protected MainTypeResult generateMMMessageTransportMode(SubTypeResult containerGen, MMMessageTransportMode mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.boundedCommunicationDelay,
				mmBean.getBoundedCommunicationDelay());
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.maximumClockVariation,
				mmBean.getMaximumClockVariation());
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.maximumMessageSize, mmBean.getMaximumMessageSize());
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.messageDeliveryWindow,
				mmBean.getMessageDeliveryWindow());
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.messageSendingWindow, mmBean.getMessageSendingWindow());
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.deliveryAssurance, mmBean.getDeliveryAssurance());
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.durability, mmBean.getDurability());
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.messageCasting, mmBean.getMessageCasting());
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.messageDeliveryOrder, mmBean.getMessageDeliveryOrder());
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.messageValidationLevel,
				mmBean.getMessageValidationLevel());
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.messageValidationOnOff,
				mmBean.getMessageValidationOnOff());
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.messageValidationResults,
				mmBean.getMessageValidationResults());
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.receiverAsynchronicity,
				mmBean.getReceiverAsynchronicity());
		defaultMandatoryAttribute(gen, MMMessageTransportMode_.senderAsynchronicity, mmBean.getSenderAsynchronicity());
		defaultMultivalueAttribute(gen, MMMessageTransportMode_.businessTransaction, mmBean.getBusinessTransaction());
		return gen;
	}

	protected SubTypeResult generateMMMessageDefinitionIdentifier(MainTypeResult containerGen,
			MMMessageDefinitionIdentifier mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMModelEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMMessageDefinitionIdentifier_.businessArea, mmBean.getBusinessArea());
		defaultMandatoryAttribute(gen, MMMessageDefinitionIdentifier_.messageFunctionality,
				mmBean.getMessageFunctionality());
		defaultMandatoryAttribute(gen, MMMessageDefinitionIdentifier_.flavour, mmBean.getFlavour());
		defaultMandatoryAttribute(gen, MMMessageDefinitionIdentifier_.version, mmBean.getVersion());
		return gen;
	}

	protected MainTypeResult generateMMConversation(MMConversation mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		return gen;
	}

	protected SubTypeResult generateMMMessageAssociationEnd(MainTypeResult containerGen,
			MMMessageAssociationEnd mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMMessageElement(gen, mmBean);
		defaultMandatoryAttribute(gen, MMMessageAssociationEnd_.isComposite, mmBean.isIsComposite());
		defaultMandatoryAttribute(gen, MMMessageAssociationEnd_.type, mmBean.getType());
		return gen;
	}

	protected SubTypeResult generateMMMessageAttribute(MainTypeResult containerGen, MMMessageAttribute mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMMessageElement(gen, mmBean);
		defaultOptionalAttribute(gen, MMMessageAttribute_.simpleType, mmBean.getSimpleType());
		defaultOptionalAttribute(gen, MMMessageAttribute_.complexType, mmBean.getComplexType());
		return gen;
	}

	protected SubTypeResult generateMMBusinessAttribute(MainTypeResult containerGen, MMBusinessAttribute mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMBusinessElement(gen, mmBean);
		defaultOptionalAttribute(gen, MMBusinessAttribute_.simpleType, mmBean.getSimpleType());
		defaultOptionalAttribute(gen, MMBusinessAttribute_.complexType, mmBean.getComplexType());
		return gen;
	}

	protected MainTypeResult generateMMText(SubTypeResult containerGen, MMText mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		return gen;
	}

	protected MainTypeResult generateMMString(SubTypeResult containerGen, MMString mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		defaultOptionalAttribute(gen, MMString_.minLength, mmBean.getMinLength());
		defaultOptionalAttribute(gen, MMString_.maxLength, mmBean.getMaxLength());
		defaultOptionalAttribute(gen, MMString_.pattern, mmBean.getPattern());
		defaultOptionalAttribute(gen, MMString_.length, mmBean.getLength());
		return gen;
	}

	protected MainTypeResult generateMMIdentifierSet(SubTypeResult containerGen, MMIdentifierSet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		defaultMandatoryAttribute(gen, MMIdentifierSet_.identificationScheme, mmBean.getIdentificationScheme());
		return gen;
	}

	protected MainTypeResult generateMMIndicator(SubTypeResult containerGen, MMIndicator mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		defaultMandatoryAttribute(gen, MMIndicator_.meaningWhenTrue, mmBean.getMeaningWhenTrue());
		defaultMandatoryAttribute(gen, MMIndicator_.meaningWhenFalse, mmBean.getMeaningWhenFalse());
		return gen;
	}

	protected MainTypeResult generateMMBoolean(SubTypeResult containerGen, MMBoolean mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		defaultOptionalAttribute(gen, MMBoolean_.pattern, mmBean.getPattern());
		return gen;
	}

	protected MainTypeResult generateMMRate(SubTypeResult containerGen, MMRate mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		defaultMandatoryAttribute(gen, MMRate_.baseValue, mmBean.getBaseValue());
		defaultOptionalAttribute(gen, MMRate_.baseUnitCode, mmBean.getBaseUnitCode());
		return gen;
	}

	protected MainTypeResult generateMMDecimal(SubTypeResult containerGen, MMDecimal mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		defaultOptionalAttribute(gen, MMDecimal_.pattern, mmBean.getPattern());
		defaultOptionalAttribute(gen, MMDecimal_.minInclusive, mmBean.getMinInclusive());
		defaultOptionalAttribute(gen, MMDecimal_.minExclusive, mmBean.getMinExclusive());
		defaultOptionalAttribute(gen, MMDecimal_.maxInclusive, mmBean.getMaxInclusive());
		defaultOptionalAttribute(gen, MMDecimal_.maxExclusive, mmBean.getMaxExclusive());
		defaultOptionalAttribute(gen, MMDecimal_.totalDigits, mmBean.getTotalDigits());
		defaultOptionalAttribute(gen, MMDecimal_.fractionDigits, mmBean.getFractionDigits());
		return gen;
	}

	protected MainTypeResult generateMMExternalSchema(SubTypeResult containerGen, MMExternalSchema mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMMessageComponentType(gen, mmBean);
		defaultMultivalueAttribute(gen, MMExternalSchema_.namespaceList, mmBean.getNamespaceList());
		defaultMandatoryAttribute(gen, MMExternalSchema_.processContent, mmBean.getProcessContent());
		return gen;
	}

	protected MainTypeResult generateMMQuantity(SubTypeResult containerGen, MMQuantity mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		defaultOptionalAttribute(gen, MMQuantity_.unitCode, mmBean.getUnitCode());
		return gen;
	}

	protected EnumConstantResult generateMMCode(EnumTypeResult containerGen, MMCode mmBean) {
		EnumConstantResult gen = null;
		implementMMRepositoryConcept(gen, mmBean);
		defaultMandatoryAttribute(gen, MMCode_.owner, mmBean.getOwner());
		defaultOptionalAttribute(gen, MMCode_.codeName, mmBean.getCodeName());
		return gen;
	}

	protected EnumTypeResult generateMMCodeSet(SubTypeResult containerGen, MMCodeSet mmBean) {
		EnumTypeResult gen = null;
		for (MMCode mmChild : mmBean.getCode()) {
			generateMMCode(gen, mmChild);
		}
		defaultOptionalAttribute(gen, MMCodeSet_.trace, mmBean.getTrace());
		defaultMultivalueAttribute(gen, MMCodeSet_.derivation, mmBean.getDerivation());
		defaultMultivalueAttribute(gen, MMCodeSet_.code, mmBean.getCode());
		defaultOptionalAttribute(gen, MMCodeSet_.identificationScheme, mmBean.getIdentificationScheme());
		return gen;
	}

	protected MainTypeResult generateMMAmount(SubTypeResult containerGen, MMAmount mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		defaultOptionalAttribute(gen, MMAmount_.currencyIdentifierSet, mmBean.getCurrencyIdentifierSet());
		return gen;
	}

	protected MainTypeResult generateMMChoiceComponent(SubTypeResult containerGen, MMChoiceComponent mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMMessageElementContainer(gen, mmBean);
		return gen;
	}

	protected MainTypeResult generateMMEndPointCategory(SubTypeResult containerGen, MMEndPointCategory mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		defaultMultivalueAttribute(gen, MMEndPointCategory_.endPoints, mmBean.getEndPoints());
		return gen;
	}

	protected MainTypeResult generateMMBinary(SubTypeResult containerGen, MMBinary mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		defaultOptionalAttribute(gen, MMBinary_.minLength, mmBean.getMinLength());
		defaultOptionalAttribute(gen, MMBinary_.maxLength, mmBean.getMaxLength());
		defaultOptionalAttribute(gen, MMBinary_.pattern, mmBean.getPattern());
		defaultOptionalAttribute(gen, MMBinary_.length, mmBean.getLength());
		return gen;
	}

	protected MainTypeResult generateMMDate(SubTypeResult containerGen, MMDate mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected MainTypeResult generateMMDateTime(SubTypeResult containerGen, MMDateTime mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected MainTypeResult generateMMDay(SubTypeResult containerGen, MMDay mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected MainTypeResult generateMMDuration(SubTypeResult containerGen, MMDuration mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected MainTypeResult generateMMMonth(SubTypeResult containerGen, MMMonth mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected MainTypeResult generateMMMonthDay(SubTypeResult containerGen, MMMonthDay mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected MainTypeResult generateMMTime(SubTypeResult containerGen, MMTime mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected MainTypeResult generateMMYear(SubTypeResult containerGen, MMYear mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected MainTypeResult generateMMYearMonth(SubTypeResult containerGen, MMYearMonth mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		return gen;
	}

	protected MainTypeResult generateMMUserDefined(SubTypeResult containerGen, MMUserDefined mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMMessageComponentType(gen, mmBean);
		defaultOptionalAttribute(gen, MMUserDefined_.namespaceList, mmBean.getNamespaceList());
		defaultMandatoryAttribute(gen, MMUserDefined_.processContents, mmBean.getProcessContents());
		defaultMandatoryAttribute(gen, MMUserDefined_.namespace, mmBean.getNamespace());
		return gen;
	}

	protected MainTypeResult generateMMIndustryMessageSet(SubTypeResult containerGen, MMIndustryMessageSet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		return gen;
	}

	protected MainTypeResult generateMMConvergenceDocumentation(SubTypeResult containerGen,
			MMConvergenceDocumentation mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		return gen;
	}

	protected MainTypeResult generateMMISO15022MessageSet(SubTypeResult containerGen, MMISO15022MessageSet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		return gen;
	}

	protected MainTypeResult generateMMSchemaType(SubTypeResult containerGen, MMSchemaType mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		defaultMandatoryAttribute(gen, MMSchemaType_.kind, mmBean.getKind());
		return gen;
	}

	protected void implementMMModelEntity(GenerationResult gen, MMModelEntity mmBean) {
		defaultMultivalueAttribute(gen, MMModelEntity_.nextVersions, mmBean.getNextVersions());
		defaultOptionalAttribute(gen, MMModelEntity_.previousVersion, mmBean.getPreviousVersion());
		defaultOptionalAttribute(gen, MMModelEntity_.objectIdentifier, mmBean.getObjectIdentifier());
	}

	protected void implementMMTopLevelCatalogueEntry(GenerationResult gen, MMTopLevelCatalogueEntry mmBean) {
		implementMMRepositoryConcept(gen, mmBean);
		defaultMandatoryAttribute(gen, MMTopLevelCatalogueEntry_.businessProcessCatalogue,
				mmBean.getBusinessProcessCatalogue());
	}

	protected void implementMMRepositoryConcept(GenerationResult gen, MMRepositoryConcept mmBean) {
		implementMMModelEntity(gen, mmBean);
		defaultMultivalueAttribute(gen, MMRepositoryConcept_.semanticMarkup, mmBean.getSemanticMarkup());
		defaultMultivalueAttribute(gen, MMRepositoryConcept_.doclet, mmBean.getDoclet());
		defaultMultivalueAttribute(gen, MMRepositoryConcept_.example, mmBean.getExample());
		defaultMultivalueAttribute(gen, MMRepositoryConcept_.constraint, mmBean.getConstraint());
		defaultMandatoryAttribute(gen, MMRepositoryConcept_.registrationStatus, mmBean.getRegistrationStatus());
		defaultOptionalAttribute(gen, MMRepositoryConcept_.removalDate, mmBean.getRemovalDate());
		defaultMandatoryAttribute(gen, MMRepositoryConcept_.name, mmBean.getName());
		defaultOptionalAttribute(gen, MMRepositoryConcept_.definition, mmBean.getDefinition());
	}

	protected void implementMMTopLevelDictionaryEntry(GenerationResult gen, MMTopLevelDictionaryEntry mmBean) {
		implementMMRepositoryConcept(gen, mmBean);
		defaultMandatoryAttribute(gen, MMTopLevelDictionaryEntry_.dataDictionary, mmBean.getDataDictionary());
	}

	protected void implementMMRepositoryType(GenerationResult gen, MMRepositoryType mmBean) {
		implementMMRepositoryConcept(gen, mmBean);
	}

	protected void implementMMMessageElement(GenerationResult gen, MMMessageElement mmBean) {
		implementMMMessageConstruct(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
		defaultMandatoryAttribute(gen, MMMessageElement_.isTechnical, mmBean.isIsTechnical());
		defaultOptionalAttribute(gen, MMMessageElement_.businessComponentTrace, mmBean.getBusinessComponentTrace());
		defaultOptionalAttribute(gen, MMMessageElement_.businessElementTrace, mmBean.getBusinessElementTrace());
		defaultMandatoryAttribute(gen, MMMessageElement_.componentContext, mmBean.getComponentContext());
		defaultMandatoryAttribute(gen, MMMessageElement_.isDerived, mmBean.isIsDerived());
	}

	protected void implementMMMessageConstruct(GenerationResult gen, MMMessageConstruct mmBean) {
		implementMMConstruct(gen, mmBean);
		defaultOptionalAttribute(gen, MMMessageConstruct_.xmlTag, mmBean.getXmlTag());
		defaultMandatoryAttribute(gen, MMMessageConstruct_.xmlMemberType, mmBean.getXmlMemberType());
	}

	protected void implementMMConstruct(GenerationResult gen, MMConstruct mmBean) {
		implementMMRepositoryConcept(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		defaultMandatoryAttribute(gen, MMConstruct_.memberType, mmBean.getMemberType());
	}

	protected void implementMMMultiplicityEntity(GenerationResult gen, MMMultiplicityEntity mmBean) {
		defaultOptionalAttribute(gen, MMMultiplicityEntity_.maxOccurs, mmBean.getMaxOccurs());
		defaultOptionalAttribute(gen, MMMultiplicityEntity_.minOccurs, mmBean.getMinOccurs());
	}

	protected void implementMMLogicalType(GenerationResult gen, MMLogicalType mmBean) {
		implementMMRepositoryType(gen, mmBean);
	}

	protected void implementMMMessageConcept(GenerationResult gen, MMMessageConcept mmBean) {
		implementMMModelEntity(gen, mmBean);
	}

	protected void implementMMBusinessElementType(GenerationResult gen, MMBusinessElementType mmBean) {
		implementMMRepositoryType(gen, mmBean);
	}

	protected void implementMMBusinessConcept(GenerationResult gen, MMBusinessConcept mmBean) {
		implementMMModelEntity(gen, mmBean);
	}

	protected void implementMMBusinessElement(GenerationResult gen, MMBusinessElement mmBean) {
		implementMMConstruct(gen, mmBean);
		implementMMBusinessConcept(gen, mmBean);
		defaultMultivalueAttribute(gen, MMBusinessElement_.derivation, mmBean.getDerivation());
		defaultMandatoryAttribute(gen, MMBusinessElement_.elementContext, mmBean.getElementContext());
		defaultMandatoryAttribute(gen, MMBusinessElement_.isDerived, mmBean.isIsDerived());
		defaultMandatoryAttribute(gen, MMBusinessElement_.businessElementType, mmBean.getBusinessElementType());
	}

	protected void implementMMMessageComponentType(GenerationResult gen, MMMessageComponentType mmBean) {
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
		defaultMultivalueAttribute(gen, MMMessageComponentType_.messageBuildingBlock, mmBean.getMessageBuildingBlock());
		defaultOptionalAttribute(gen, MMMessageComponentType_.trace, mmBean.getTrace());
		defaultMandatoryAttribute(gen, MMMessageComponentType_.isTechnical, mmBean.isIsTechnical());
	}

	protected void implementMMDataType(GenerationResult gen, MMDataType mmBean) {
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
	}

	protected void implementMMMessageElementContainer(GenerationResult gen, MMMessageElementContainer mmBean) {
		implementMMMessageComponentType(gen, mmBean);
		defaultMultivalueAttribute(gen, MMMessageElementContainer_.messageElement, mmBean.getMessageElement());
	}

	protected void implementMMAbstractDateTimeConcept(GenerationResult gen, MMAbstractDateTimeConcept mmBean) {
		implementMMDataType(gen, mmBean);
		defaultOptionalAttribute(gen, MMAbstractDateTimeConcept_.pattern, mmBean.getPattern());
		defaultOptionalAttribute(gen, MMAbstractDateTimeConcept_.minInclusive, mmBean.getMinInclusive());
		defaultOptionalAttribute(gen, MMAbstractDateTimeConcept_.minExclusive, mmBean.getMinExclusive());
		defaultOptionalAttribute(gen, MMAbstractDateTimeConcept_.maxInclusive, mmBean.getMaxInclusive());
		defaultOptionalAttribute(gen, MMAbstractDateTimeConcept_.maxExclusive, mmBean.getMaxExclusive());
	}

	public GenerationResult generateMMTopLevelCatalogueEntry(SubTypeResult gen, MMTopLevelCatalogueEntry mmBean) {
		if (MMSyntaxMessageScheme.class.equals(mmBean.getClass())) {
			return generateMMSyntaxMessageScheme(gen, (MMSyntaxMessageScheme) mmBean);
		} else if (MMMessageSet.class.equals(mmBean.getClass())) {
			return generateMMMessageSet(gen, (MMMessageSet) mmBean);
		} else if (MMBusinessArea.class.equals(mmBean.getClass())) {
			return generateMMBusinessArea(gen, (MMBusinessArea) mmBean);
		} else if (MMMessageChoreography.class.equals(mmBean.getClass())) {
			return generateMMMessageChoreography(gen, (MMMessageChoreography) mmBean);
		} else if (MMBusinessTransaction.class.equals(mmBean.getClass())) {
			return generateMMBusinessTransaction(gen, (MMBusinessTransaction) mmBean);
		} else if (MMBusinessProcess.class.equals(mmBean.getClass())) {
			return generateMMBusinessProcess(gen, (MMBusinessProcess) mmBean);
		} else if (MMMessageTransportMode.class.equals(mmBean.getClass())) {
			return generateMMMessageTransportMode(gen, (MMMessageTransportMode) mmBean);
		} else if (MMIndustryMessageSet.class.equals(mmBean.getClass())) {
			return generateMMIndustryMessageSet(gen, (MMIndustryMessageSet) mmBean);
		} else if (MMISO15022MessageSet.class.equals(mmBean.getClass())) {
			return generateMMISO15022MessageSet(gen, (MMISO15022MessageSet) mmBean);
		} else if (MMConvergenceDocumentation.class.equals(mmBean.getClass())) {
			return generateMMConvergenceDocumentation(gen, (MMConvergenceDocumentation) mmBean);
		} else {
			throw new IllegalArgumentException("Invalid type hierarchy: " + mmBean.getClass());
		}
	}

	public GenerationResult generateMMTopLevelDictionaryEntry(SubTypeResult gen, MMTopLevelDictionaryEntry mmBean) {
		if (MMBusinessComponent.class.equals(mmBean.getClass())) {
			return generateMMBusinessComponent(gen, (MMBusinessComponent) mmBean);
		} else if (MMMessageComponent.class.equals(mmBean.getClass())) {
			return generateMMMessageComponent(gen, (MMMessageComponent) mmBean);
		} else if (MMChoiceComponent.class.equals(mmBean.getClass())) {
			return generateMMChoiceComponent(gen, (MMChoiceComponent) mmBean);
		} else if (MMExternalSchema.class.equals(mmBean.getClass())) {
			return generateMMExternalSchema(gen, (MMExternalSchema) mmBean);
		} else if (MMUserDefined.class.equals(mmBean.getClass())) {
			return generateMMUserDefined(gen, (MMUserDefined) mmBean);
		} else if (MMString.class.equals(mmBean.getClass())) {
			return generateMMString(gen, (MMString) mmBean);
		} else if (MMText.class.equals(mmBean.getClass())) {
			return generateMMText(gen, (MMText) mmBean);
		} else if (MMIdentifierSet.class.equals(mmBean.getClass())) {
			return generateMMIdentifierSet(gen, (MMIdentifierSet) mmBean);
		} else if (MMCodeSet.class.equals(mmBean.getClass())) {
			return generateMMCodeSet(gen, (MMCodeSet) mmBean);
		} else if (MMBoolean.class.equals(mmBean.getClass())) {
			return generateMMBoolean(gen, (MMBoolean) mmBean);
		} else if (MMIndicator.class.equals(mmBean.getClass())) {
			return generateMMIndicator(gen, (MMIndicator) mmBean);
		} else if (MMDecimal.class.equals(mmBean.getClass())) {
			return generateMMDecimal(gen, (MMDecimal) mmBean);
		} else if (MMRate.class.equals(mmBean.getClass())) {
			return generateMMRate(gen, (MMRate) mmBean);
		} else if (MMQuantity.class.equals(mmBean.getClass())) {
			return generateMMQuantity(gen, (MMQuantity) mmBean);
		} else if (MMAmount.class.equals(mmBean.getClass())) {
			return generateMMAmount(gen, (MMAmount) mmBean);
		} else if (MMDate.class.equals(mmBean.getClass())) {
			return generateMMDate(gen, (MMDate) mmBean);
		} else if (MMDateTime.class.equals(mmBean.getClass())) {
			return generateMMDateTime(gen, (MMDateTime) mmBean);
		} else if (MMDay.class.equals(mmBean.getClass())) {
			return generateMMDay(gen, (MMDay) mmBean);
		} else if (MMDuration.class.equals(mmBean.getClass())) {
			return generateMMDuration(gen, (MMDuration) mmBean);
		} else if (MMMonth.class.equals(mmBean.getClass())) {
			return generateMMMonth(gen, (MMMonth) mmBean);
		} else if (MMMonthDay.class.equals(mmBean.getClass())) {
			return generateMMMonthDay(gen, (MMMonthDay) mmBean);
		} else if (MMTime.class.equals(mmBean.getClass())) {
			return generateMMTime(gen, (MMTime) mmBean);
		} else if (MMYear.class.equals(mmBean.getClass())) {
			return generateMMYear(gen, (MMYear) mmBean);
		} else if (MMYearMonth.class.equals(mmBean.getClass())) {
			return generateMMYearMonth(gen, (MMYearMonth) mmBean);
		} else if (MMBinary.class.equals(mmBean.getClass())) {
			return generateMMBinary(gen, (MMBinary) mmBean);
		} else if (MMSchemaType.class.equals(mmBean.getClass())) {
			return generateMMSchemaType(gen, (MMSchemaType) mmBean);
		} else if (MMEndPointCategory.class.equals(mmBean.getClass())) {
			return generateMMEndPointCategory(gen, (MMEndPointCategory) mmBean);
		} else {
			throw new IllegalArgumentException("Invalid type hierarchy: " + mmBean.getClass());
		}
	}

	public GenerationResult generateMMBusinessElement(MainTypeResult gen, MMBusinessElement mmBean) {
		if (MMBusinessAssociationEnd.class.equals(mmBean.getClass())) {
			return generateMMBusinessAssociationEnd(gen, (MMBusinessAssociationEnd) mmBean);
		} else if (MMBusinessAttribute.class.equals(mmBean.getClass())) {
			return generateMMBusinessAttribute(gen, (MMBusinessAttribute) mmBean);
		} else {
			throw new IllegalArgumentException("Invalid type hierarchy: " + mmBean.getClass());
		}
	}
}