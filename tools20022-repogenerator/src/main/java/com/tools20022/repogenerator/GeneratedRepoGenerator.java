package com.tools20022.repogenerator;

import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.metamodel.*;
import com.tools20022.metamodel.struct.*;
import com.tools20022.repogenerator.BaseRepoGenerator;
import com.tools20022.repogenerator.resulttypes.MainTypeResult;
import com.tools20022.repogenerator.resulttypes.SubTypeResult;
import com.tools20022.repogenerator.resulttypes.TypeResult;

public abstract class GeneratedRepoGenerator extends BaseRepoGenerator {

	@Override
	public abstract void accept(RawRepository repo,
			GenerationContext<RawRepository> ctx);

	protected MainTypeResult generateMMAddress(MMAddress mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMAddress_.broadCastList,
				mmBean.getBroadCastList());
		defaultAttribute(gen, MMAddress_.endpoint, mmBean.getEndpoint());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMBroadcastList(MMBroadcastList mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMBroadcastList_.address, mmBean.getAddress());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessagingEndpoint(
			MainTypeResult containerGen, MMMessagingEndpoint mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMMessagingEndpoint_.location,
				mmBean.getLocation());
		defaultAttribute(gen, MMMessagingEndpoint_.sentMessage,
				mmBean.getSentMessage());
		defaultAttribute(gen, MMMessagingEndpoint_.receivedMessage,
				mmBean.getReceivedMessage());
		defaultAttribute(gen, MMMessagingEndpoint_.transportSystem,
				mmBean.getTransportSystem());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessageTransportSystem(
			MMMessageTransportSystem mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		for (MMMessagingEndpoint mmChild : mmBean.getEndpoint()) {
			generateMMMessagingEndpoint(gen, mmChild);
		}
		defaultAttribute(gen, MMMessageTransportSystem_.endpoint,
				mmBean.getEndpoint());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMTransportMessage(
			MMTransportMessage mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMTransportMessage_.receiver,
				mmBean.getReceiver());
		defaultAttribute(gen, MMTransportMessage_.sender, mmBean.getSender());
		defaultAttribute(gen, MMTransportMessage_.messageInstance,
				mmBean.getMessageInstance());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessageInstance(MMMessageInstance mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMMessageInstance_.specification,
				mmBean.getSpecification());
		defaultAttribute(gen, MMMessageInstance_.transportMessage,
				mmBean.getTransportMessage());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMSyntaxMessageScheme(
			SubTypeResult containerGen, MMSyntaxMessageScheme mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMSyntaxMessageScheme_.messageDefinitionTrace,
				mmBean.getMessageDefinitionTrace());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMSemanticMarkup(
			MainTypeResult containerGen, MMSemanticMarkup mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		for (MMSemanticMarkupElement mmChild : mmBean.getElements()) {
			generateMMSemanticMarkupElement(gen, mmChild);
		}
		defaultAttribute(gen, MMSemanticMarkup_.type, mmBean.getType());
		defaultAttribute(gen, MMSemanticMarkup_.elements, mmBean.getElements());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMSemanticMarkupElement(
			MainTypeResult containerGen, MMSemanticMarkupElement mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMSemanticMarkupElement_.name, mmBean.getName());
		defaultAttribute(gen, MMSemanticMarkupElement_.value, mmBean.getValue());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMDoclet(MainTypeResult containerGen,
			MMDoclet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMDoclet_.type, mmBean.getType());
		defaultAttribute(gen, MMDoclet_.content, mmBean.getContent());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMConstraint(MainTypeResult containerGen,
			MMConstraint mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMConstraint_.owner, mmBean.getOwner());
		defaultAttribute(gen, MMConstraint_.expression, mmBean.getExpression());
		defaultAttribute(gen, MMConstraint_.expressionLanguage,
				mmBean.getExpressionLanguage());
		gen.flush();
		return gen;
	}

	protected SubTypeResult generateMMBusinessProcessCatalogue(
			MainTypeResult containerGen, MMBusinessProcessCatalogue mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMModelEntity(gen, mmBean);
		for (MMTopLevelCatalogueEntry mmChild : mmBean
				.getTopLevelCatalogueEntry()) {
			generateMMTopLevelCatalogueEntry(gen, mmChild);
		}
		defaultAttribute(gen, MMBusinessProcessCatalogue_.repository,
				mmBean.getRepository());
		defaultAttribute(gen,
				MMBusinessProcessCatalogue_.topLevelCatalogueEntry,
				mmBean.getTopLevelCatalogueEntry());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMRepository(MMRepository mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		generateMMBusinessProcessCatalogue(gen,
				mmBean.getBusinessProcessCatalogue());
		generateMMDataDictionary(gen, mmBean.getDataDictionary());
		defaultAttribute(gen, MMRepository_.businessProcessCatalogue,
				mmBean.getBusinessProcessCatalogue());
		defaultAttribute(gen, MMRepository_.dataDictionary,
				mmBean.getDataDictionary());
		gen.flush();
		return gen;
	}

	protected SubTypeResult generateMMDataDictionary(
			MainTypeResult containerGen, MMDataDictionary mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMModelEntity(gen, mmBean);
		for (MMTopLevelDictionaryEntry mmChild : mmBean
				.getTopLevelDictionaryEntry()) {
			generateMMTopLevelDictionaryEntry(gen, mmChild);
		}
		defaultAttribute(gen, MMDataDictionary_.repository,
				mmBean.getRepository());
		defaultAttribute(gen, MMDataDictionary_.topLevelDictionaryEntry,
				mmBean.getTopLevelDictionaryEntry());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessageDefinition(
			MainTypeResult containerGen, MMMessageDefinition mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		for (MMXor mmChild : mmBean.getXors()) {
			generateMMXorInMessageDefinition(gen, mmChild);
		}
		for (MMMessageBuildingBlock mmChild : mmBean.getMessageBuildingBlock()) {
			generateMMMessageBuildingBlock(gen, mmChild);
		}
		generateMMMessageDefinitionIdentifier(gen,
				mmBean.getMessageDefinitionIdentifier());
		defaultAttribute(gen, MMMessageDefinition_.messageSet,
				mmBean.getMessageSet());
		defaultAttribute(gen, MMMessageDefinition_.xors, mmBean.getXors());
		defaultAttribute(gen, MMMessageDefinition_.rootElement,
				mmBean.getRootElement());
		defaultAttribute(gen, MMMessageDefinition_.choreography,
				mmBean.getChoreography());
		defaultAttribute(gen, MMMessageDefinition_.xmlTag, mmBean.getXmlTag());
		defaultAttribute(gen, MMMessageDefinition_.trace, mmBean.getTrace());
		defaultAttribute(gen, MMMessageDefinition_.derivation,
				mmBean.getDerivation());
		defaultAttribute(gen, MMMessageDefinition_.businessArea,
				mmBean.getBusinessArea());
		defaultAttribute(gen, MMMessageDefinition_.xmlName, mmBean.getXmlName());
		defaultAttribute(gen, MMMessageDefinition_.messageBuildingBlock,
				mmBean.getMessageBuildingBlock());
		defaultAttribute(gen, MMMessageDefinition_.messageDefinitionIdentifier,
				mmBean.getMessageDefinitionIdentifier());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessageSet(SubTypeResult containerGen,
			MMMessageSet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMMessageSet_.messageDefinition,
				mmBean.getMessageDefinition());
		defaultAttribute(gen, MMMessageSet_.validEncoding,
				mmBean.getValidEncoding());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMSyntax(MMSyntax mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMSyntax_.possibleEncodings,
				mmBean.getPossibleEncodings());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMEncoding(MMEncoding mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMEncoding_.messageSet, mmBean.getMessageSet());
		defaultAttribute(gen, MMEncoding_.syntax, mmBean.getSyntax());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMBusinessArea(SubTypeResult containerGen,
			MMBusinessArea mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		for (MMMessageDefinition mmChild : mmBean.getMessageDefinition()) {
			generateMMMessageDefinition(gen, mmChild);
		}
		defaultAttribute(gen, MMBusinessArea_.messageDefinition,
				mmBean.getMessageDefinition());
		defaultAttribute(gen, MMBusinessArea_.code, mmBean.getCode());
		gen.flush();
		return gen;
	}

	protected SubTypeResult generateMMXorInMessageDefinition(
			MainTypeResult containerGen, MMXor mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMXor_.impactedElements,
				mmBean.getImpactedElements());
		defaultAttribute(gen, MMXor_.messageDefinition,
				mmBean.getMessageDefinition());
		defaultAttribute(gen, MMXor_.impactedMessageBuildingBlocks,
				mmBean.getImpactedMessageBuildingBlocks());
		defaultAttribute(gen, MMXor_.messageComponent,
				mmBean.getMessageComponent());
		gen.flush();
		return gen;
	}

	protected SubTypeResult generateMMXorInMessageComponent(
			MainTypeResult containerGen, MMXor mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMXor_.impactedElements,
				mmBean.getImpactedElements());
		defaultAttribute(gen, MMXor_.messageDefinition,
				mmBean.getMessageDefinition());
		defaultAttribute(gen, MMXor_.impactedMessageBuildingBlocks,
				mmBean.getImpactedMessageBuildingBlocks());
		defaultAttribute(gen, MMXor_.messageComponent,
				mmBean.getMessageComponent());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMBusinessComponent(
			SubTypeResult containerGen, MMBusinessComponent mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMBusinessConcept(gen, mmBean);
		for (MMBusinessElement mmChild : mmBean.getElement()) {
			generateMMBusinessElement(gen, mmChild);
		}
		defaultAttribute(gen, MMBusinessComponent_.derivationElement,
				mmBean.getDerivationElement());
		defaultAttribute(gen, MMBusinessComponent_.derivationComponent,
				mmBean.getDerivationComponent());
		defaultAttribute(gen, MMBusinessComponent_.associationDomain,
				mmBean.getAssociationDomain());
		defaultAttribute(gen, MMBusinessComponent_.subType, mmBean.getSubType());
		defaultAttribute(gen, MMBusinessComponent_.element, mmBean.getElement());
		defaultAttribute(gen, MMBusinessComponent_.superType,
				mmBean.getSuperType());
		gen.flush();
		return gen;
	}

	protected SubTypeResult generateMMMessageBuildingBlock(
			MainTypeResult containerGen, MMMessageBuildingBlock mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMMessageConstruct(gen, mmBean);
		implementMMConstruct(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		defaultAttribute(gen, MMMessageBuildingBlock_.simpleType,
				mmBean.getSimpleType());
		defaultAttribute(gen, MMMessageBuildingBlock_.complexType,
				mmBean.getComplexType());
		gen.flush();
		return gen;
	}

	protected SubTypeResult generateMMBusinessAssociationEnd(
			MainTypeResult containerGen, MMBusinessAssociationEnd mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMBusinessElement(gen, mmBean);
		implementMMConstruct(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		implementMMBusinessConcept(gen, mmBean);
		defaultAttribute(gen, MMBusinessAssociationEnd_.type, mmBean.getType());
		defaultAttribute(gen, MMBusinessAssociationEnd_.opposite,
				mmBean.getOpposite());
		defaultAttribute(gen, MMBusinessAssociationEnd_.aggregation,
				mmBean.getAggregation());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessageComponent(
			SubTypeResult containerGen, MMMessageComponent mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMMessageElementContainer(gen, mmBean);
		implementMMMessageComponentType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
		for (MMXor mmChild : mmBean.getXors()) {
			generateMMXorInMessageComponent(gen, mmChild);
		}
		defaultAttribute(gen, MMMessageComponent_.xors, mmBean.getXors());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessageChoreography(
			SubTypeResult containerGen, MMMessageChoreography mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMMessageChoreography_.messageDefinition,
				mmBean.getMessageDefinition());
		defaultAttribute(gen, MMMessageChoreography_.businessTransactionTrace,
				mmBean.getBusinessTransactionTrace());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMBusinessTransaction(
			SubTypeResult containerGen, MMBusinessTransaction mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		for (MMMessageTransmission mmChild : mmBean.getTransmission()) {
			generateMMMessageTransmission(gen, mmChild);
		}
		for (MMParticipant mmChild : mmBean.getParticipant()) {
			generateMMParticipant(gen, mmChild);
		}
		defaultAttribute(gen, MMBusinessTransaction_.trace, mmBean.getTrace());
		defaultAttribute(gen, MMBusinessTransaction_.businessProcessTrace,
				mmBean.getBusinessProcessTrace());
		defaultAttribute(gen, MMBusinessTransaction_.parentTransaction,
				mmBean.getParentTransaction());
		defaultAttribute(gen, MMBusinessTransaction_.subTransaction,
				mmBean.getSubTransaction());
		defaultAttribute(gen, MMBusinessTransaction_.messageTransportMode,
				mmBean.getMessageTransportMode());
		defaultAttribute(gen, MMBusinessTransaction_.transmission,
				mmBean.getTransmission());
		defaultAttribute(gen, MMBusinessTransaction_.participant,
				mmBean.getParticipant());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMBusinessProcess(
			SubTypeResult containerGen, MMBusinessProcess mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		for (MMBusinessRole mmChild : mmBean.getBusinessRole()) {
			generateMMBusinessRole(gen, mmChild);
		}
		defaultAttribute(gen, MMBusinessProcess_.businessProcessTrace,
				mmBean.getBusinessProcessTrace());
		defaultAttribute(gen, MMBusinessProcess_.included, mmBean.getIncluded());
		defaultAttribute(gen, MMBusinessProcess_.businessRole,
				mmBean.getBusinessRole());
		defaultAttribute(gen, MMBusinessProcess_.extender, mmBean.getExtender());
		defaultAttribute(gen, MMBusinessProcess_.includer, mmBean.getIncluder());
		defaultAttribute(gen, MMBusinessProcess_.extended, mmBean.getExtended());
		gen.flush();
		return gen;
	}

	protected SubTypeResult generateMMBusinessRole(MainTypeResult containerGen,
			MMBusinessRole mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMBusinessRole_.businessRoleTrace,
				mmBean.getBusinessRoleTrace());
		defaultAttribute(gen, MMBusinessRole_.businessProcess,
				mmBean.getBusinessProcess());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMParticipant(MainTypeResult containerGen,
			MMParticipant mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		defaultAttribute(gen, MMParticipant_.sends, mmBean.getSends());
		defaultAttribute(gen, MMParticipant_.businessRoleTrace,
				mmBean.getBusinessRoleTrace());
		defaultAttribute(gen, MMParticipant_.businessTransaction,
				mmBean.getBusinessTransaction());
		defaultAttribute(gen, MMParticipant_.receives, mmBean.getReceives());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMReceive(MainTypeResult containerGen,
			MMReceive mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMReceive_.receiver, mmBean.getReceiver());
		defaultAttribute(gen, MMReceive_.messageTransmission,
				mmBean.getMessageTransmission());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessageTransmission(
			MainTypeResult containerGen, MMMessageTransmission mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		for (MMReceive mmChild : mmBean.getReceive()) {
			generateMMReceive(gen, mmChild);
		}
		generateMMSend(gen, mmBean.getSend());
		defaultAttribute(gen, MMMessageTransmission_.derivation,
				mmBean.getDerivation());
		defaultAttribute(gen, MMMessageTransmission_.businessTransaction,
				mmBean.getBusinessTransaction());
		defaultAttribute(gen, MMMessageTransmission_.messageTypeDescription,
				mmBean.getMessageTypeDescription());
		defaultAttribute(gen, MMMessageTransmission_.receive,
				mmBean.getReceive());
		defaultAttribute(gen, MMMessageTransmission_.send, mmBean.getSend());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMSend(MainTypeResult containerGen,
			MMSend mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMSend_.sender, mmBean.getSender());
		defaultAttribute(gen, MMSend_.messageTransmission,
				mmBean.getMessageTransmission());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessageTransportMode(
			SubTypeResult containerGen, MMMessageTransportMode mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMMessageTransportMode_.businessTransaction,
				mmBean.getBusinessTransaction());
		defaultAttribute(gen,
				MMMessageTransportMode_.boundedCommunicationDelay,
				mmBean.getBoundedCommunicationDelay());
		defaultAttribute(gen, MMMessageTransportMode_.messageValidationOnOff,
				mmBean.getMessageValidationOnOff());
		defaultAttribute(gen, MMMessageTransportMode_.messageCasting,
				mmBean.getMessageCasting());
		defaultAttribute(gen, MMMessageTransportMode_.receiverAsynchronicity,
				mmBean.getReceiverAsynchronicity());
		defaultAttribute(gen, MMMessageTransportMode_.deliveryAssurance,
				mmBean.getDeliveryAssurance());
		defaultAttribute(gen, MMMessageTransportMode_.maximumMessageSize,
				mmBean.getMaximumMessageSize());
		defaultAttribute(gen, MMMessageTransportMode_.maximumClockVariation,
				mmBean.getMaximumClockVariation());
		defaultAttribute(gen, MMMessageTransportMode_.messageDeliveryOrder,
				mmBean.getMessageDeliveryOrder());
		defaultAttribute(gen, MMMessageTransportMode_.messageDeliveryWindow,
				mmBean.getMessageDeliveryWindow());
		defaultAttribute(gen, MMMessageTransportMode_.messageValidationLevel,
				mmBean.getMessageValidationLevel());
		defaultAttribute(gen, MMMessageTransportMode_.messageValidationResults,
				mmBean.getMessageValidationResults());
		defaultAttribute(gen, MMMessageTransportMode_.messageSendingWindow,
				mmBean.getMessageSendingWindow());
		defaultAttribute(gen, MMMessageTransportMode_.senderAsynchronicity,
				mmBean.getSenderAsynchronicity());
		defaultAttribute(gen, MMMessageTransportMode_.durability,
				mmBean.getDurability());
		gen.flush();
		return gen;
	}

	protected SubTypeResult generateMMMessageDefinitionIdentifier(
			MainTypeResult containerGen, MMMessageDefinitionIdentifier mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMMessageDefinitionIdentifier_.businessArea,
				mmBean.getBusinessArea());
		defaultAttribute(gen,
				MMMessageDefinitionIdentifier_.messageFunctionality,
				mmBean.getMessageFunctionality());
		defaultAttribute(gen, MMMessageDefinitionIdentifier_.version,
				mmBean.getVersion());
		defaultAttribute(gen, MMMessageDefinitionIdentifier_.flavour,
				mmBean.getFlavour());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMConversation(MMConversation mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected SubTypeResult generateMMMessageAssociationEnd(
			MainTypeResult containerGen, MMMessageAssociationEnd mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMMessageElement(gen, mmBean);
		implementMMMessageConstruct(gen, mmBean);
		implementMMConstruct(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
		defaultAttribute(gen, MMMessageAssociationEnd_.type, mmBean.getType());
		defaultAttribute(gen, MMMessageAssociationEnd_.isComposite,
				mmBean.isIsComposite());
		gen.flush();
		return gen;
	}

	protected SubTypeResult generateMMMessageAttribute(
			MainTypeResult containerGen, MMMessageAttribute mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMMessageElement(gen, mmBean);
		implementMMMessageConstruct(gen, mmBean);
		implementMMConstruct(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
		defaultAttribute(gen, MMMessageAttribute_.simpleType,
				mmBean.getSimpleType());
		defaultAttribute(gen, MMMessageAttribute_.complexType,
				mmBean.getComplexType());
		gen.flush();
		return gen;
	}

	protected SubTypeResult generateMMBusinessAttribute(
			MainTypeResult containerGen, MMBusinessAttribute mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMBusinessElement(gen, mmBean);
		implementMMConstruct(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		implementMMBusinessConcept(gen, mmBean);
		defaultAttribute(gen, MMBusinessAttribute_.simpleType,
				mmBean.getSimpleType());
		defaultAttribute(gen, MMBusinessAttribute_.complexType,
				mmBean.getComplexType());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMText(SubTypeResult containerGen,
			MMText mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMString(SubTypeResult containerGen,
			MMString mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMString_.length, mmBean.getLength());
		defaultAttribute(gen, MMString_.minLength, mmBean.getMinLength());
		defaultAttribute(gen, MMString_.maxLength, mmBean.getMaxLength());
		defaultAttribute(gen, MMString_.pattern, mmBean.getPattern());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMIdentifierSet(
			SubTypeResult containerGen, MMIdentifierSet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMIdentifierSet_.identificationScheme,
				mmBean.getIdentificationScheme());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMIndicator(SubTypeResult containerGen,
			MMIndicator mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMIndicator_.meaningWhenFalse,
				mmBean.getMeaningWhenFalse());
		defaultAttribute(gen, MMIndicator_.meaningWhenTrue,
				mmBean.getMeaningWhenTrue());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMBoolean(SubTypeResult containerGen,
			MMBoolean mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMBoolean_.pattern, mmBean.getPattern());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMRate(SubTypeResult containerGen,
			MMRate mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMRate_.baseUnitCode, mmBean.getBaseUnitCode());
		defaultAttribute(gen, MMRate_.baseValue, mmBean.getBaseValue());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMDecimal(SubTypeResult containerGen,
			MMDecimal mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMDecimal_.fractionDigits,
				mmBean.getFractionDigits());
		defaultAttribute(gen, MMDecimal_.maxExclusive, mmBean.getMaxExclusive());
		defaultAttribute(gen, MMDecimal_.minExclusive, mmBean.getMinExclusive());
		defaultAttribute(gen, MMDecimal_.minInclusive, mmBean.getMinInclusive());
		defaultAttribute(gen, MMDecimal_.maxInclusive, mmBean.getMaxInclusive());
		defaultAttribute(gen, MMDecimal_.totalDigits, mmBean.getTotalDigits());
		defaultAttribute(gen, MMDecimal_.pattern, mmBean.getPattern());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMExternalSchema(
			SubTypeResult containerGen, MMExternalSchema mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMMessageComponentType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
		defaultAttribute(gen, MMExternalSchema_.processContent,
				mmBean.getProcessContent());
		defaultAttribute(gen, MMExternalSchema_.namespaceList,
				mmBean.getNamespaceList());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMQuantity(SubTypeResult containerGen,
			MMQuantity mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMQuantity_.unitCode, mmBean.getUnitCode());
		gen.flush();
		return gen;
	}

	protected SubTypeResult generateMMCode(MainTypeResult containerGen,
			MMCode mmBean) {
		SubTypeResult gen = defaultSubType(mmBean, containerGen);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMCode_.owner, mmBean.getOwner());
		defaultAttribute(gen, MMCode_.codeName, mmBean.getCodeName());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMCodeSet(SubTypeResult containerGen,
			MMCodeSet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		for (MMCode mmChild : mmBean.getCode()) {
			generateMMCode(gen, mmChild);
		}
		defaultAttribute(gen, MMCodeSet_.trace, mmBean.getTrace());
		defaultAttribute(gen, MMCodeSet_.derivation, mmBean.getDerivation());
		defaultAttribute(gen, MMCodeSet_.code, mmBean.getCode());
		defaultAttribute(gen, MMCodeSet_.identificationScheme,
				mmBean.getIdentificationScheme());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMAmount(SubTypeResult containerGen,
			MMAmount mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMAmount_.currencyIdentifierSet,
				mmBean.getCurrencyIdentifierSet());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMChoiceComponent(
			SubTypeResult containerGen, MMChoiceComponent mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMMessageElementContainer(gen, mmBean);
		implementMMMessageComponentType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMEndPointCategory(
			SubTypeResult containerGen, MMEndPointCategory mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMEndPointCategory_.endPoints,
				mmBean.getEndPoints());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMBinary(SubTypeResult containerGen,
			MMBinary mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMBinary_.length, mmBean.getLength());
		defaultAttribute(gen, MMBinary_.minLength, mmBean.getMinLength());
		defaultAttribute(gen, MMBinary_.maxLength, mmBean.getMaxLength());
		defaultAttribute(gen, MMBinary_.pattern, mmBean.getPattern());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMDate(SubTypeResult containerGen,
			MMDate mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMDateTime(SubTypeResult containerGen,
			MMDateTime mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMDay(SubTypeResult containerGen,
			MMDay mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMDuration(SubTypeResult containerGen,
			MMDuration mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMonth(SubTypeResult containerGen,
			MMMonth mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMonthDay(SubTypeResult containerGen,
			MMMonthDay mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMTime(SubTypeResult containerGen,
			MMTime mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMYear(SubTypeResult containerGen,
			MMYear mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMYearMonth(SubTypeResult containerGen,
			MMYearMonth mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMAbstractDateTimeConcept(gen, mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMUserDefined(SubTypeResult containerGen,
			MMUserDefined mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMMessageComponentType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
		defaultAttribute(gen, MMUserDefined_.processContents,
				mmBean.getProcessContents());
		defaultAttribute(gen, MMUserDefined_.namespaceList,
				mmBean.getNamespaceList());
		defaultAttribute(gen, MMUserDefined_.namespace, mmBean.getNamespace());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMIndustryMessageSet(
			SubTypeResult containerGen, MMIndustryMessageSet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMConvergenceDocumentation(
			SubTypeResult containerGen, MMConvergenceDocumentation mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMISO15022MessageSet(
			SubTypeResult containerGen, MMISO15022MessageSet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMSchemaType(SubTypeResult containerGen,
			MMSchemaType mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMSchemaType_.kind, mmBean.getKind());
		gen.flush();
		return gen;
	}

	protected void implementMMModelEntity(TypeResult gen, MMModelEntity mmBean) {
		defaultAttribute(gen, MMModelEntity_.objectIdentifier,
				mmBean.getObjectIdentifier());
		defaultAttribute(gen, MMModelEntity_.previousVersion,
				mmBean.getPreviousVersion());
		defaultAttribute(gen, MMModelEntity_.nextVersions,
				mmBean.getNextVersions());
	}

	protected void implementMMTopLevelCatalogueEntry(TypeResult gen,
			MMTopLevelCatalogueEntry mmBean) {
		defaultAttribute(gen,
				MMTopLevelCatalogueEntry_.businessProcessCatalogue,
				mmBean.getBusinessProcessCatalogue());
	}

	protected void implementMMRepositoryConcept(TypeResult gen,
			MMRepositoryConcept mmBean) {
		defaultAttribute(gen, MMRepositoryConcept_.name, mmBean.getName());
		defaultAttribute(gen, MMRepositoryConcept_.definition,
				mmBean.getDefinition());
		defaultAttribute(gen, MMRepositoryConcept_.semanticMarkup,
				mmBean.getSemanticMarkup());
		defaultAttribute(gen, MMRepositoryConcept_.registrationStatus,
				mmBean.getRegistrationStatus());
		defaultAttribute(gen, MMRepositoryConcept_.doclet, mmBean.getDoclet());
		defaultAttribute(gen, MMRepositoryConcept_.constraint,
				mmBean.getConstraint());
		defaultAttribute(gen, MMRepositoryConcept_.removalDate,
				mmBean.getRemovalDate());
		defaultAttribute(gen, MMRepositoryConcept_.example, mmBean.getExample());
	}

	protected void implementMMTopLevelDictionaryEntry(TypeResult gen,
			MMTopLevelDictionaryEntry mmBean) {
		defaultAttribute(gen, MMTopLevelDictionaryEntry_.dataDictionary,
				mmBean.getDataDictionary());
	}

	protected void implementMMRepositoryType(TypeResult gen,
			MMRepositoryType mmBean) {
	}

	protected void implementMMMessageElement(TypeResult gen,
			MMMessageElement mmBean) {
		defaultAttribute(gen, MMMessageElement_.componentContext,
				mmBean.getComponentContext());
		defaultAttribute(gen, MMMessageElement_.businessComponentTrace,
				mmBean.getBusinessComponentTrace());
		defaultAttribute(gen, MMMessageElement_.businessElementTrace,
				mmBean.getBusinessElementTrace());
		defaultAttribute(gen, MMMessageElement_.isDerived, mmBean.isIsDerived());
	}

	protected void implementMMMessageConstruct(TypeResult gen,
			MMMessageConstruct mmBean) {
		defaultAttribute(gen, MMMessageConstruct_.xmlTag, mmBean.getXmlTag());
	}

	protected void implementMMConstruct(TypeResult gen, MMConstruct mmBean) {
	}

	protected void implementMMMultiplicityEntity(TypeResult gen,
			MMMultiplicityEntity mmBean) {
		defaultAttribute(gen, MMMultiplicityEntity_.minOccurs,
				mmBean.getMinOccurs());
		defaultAttribute(gen, MMMultiplicityEntity_.maxOccurs,
				mmBean.getMaxOccurs());
	}

	protected void implementMMLogicalType(TypeResult gen, MMLogicalType mmBean) {
	}

	protected void implementMMMessageConcept(TypeResult gen,
			MMMessageConcept mmBean) {
	}

	protected void implementMMBusinessElementType(TypeResult gen,
			MMBusinessElementType mmBean) {
	}

	protected void implementMMBusinessConcept(TypeResult gen,
			MMBusinessConcept mmBean) {
	}

	protected void implementMMBusinessElement(TypeResult gen,
			MMBusinessElement mmBean) {
		defaultAttribute(gen, MMBusinessElement_.derivation,
				mmBean.getDerivation());
		defaultAttribute(gen, MMBusinessElement_.elementContext,
				mmBean.getElementContext());
		defaultAttribute(gen, MMBusinessElement_.isDerived,
				mmBean.isIsDerived());
	}

	protected void implementMMMessageComponentType(TypeResult gen,
			MMMessageComponentType mmBean) {
		defaultAttribute(gen, MMMessageComponentType_.trace, mmBean.getTrace());
		defaultAttribute(gen, MMMessageComponentType_.messageBuildingBlock,
				mmBean.getMessageBuildingBlock());
	}

	protected void implementMMDataType(TypeResult gen, MMDataType mmBean) {
	}

	protected void implementMMMessageElementContainer(MainTypeResult gen,
			MMMessageElementContainer mmBean) {
		for (MMMessageElement mmChild : mmBean.getMessageElement()) {
			generateMMMessageElement(gen, mmChild);
		}
		defaultAttribute(gen, MMMessageElementContainer_.messageElement,
				mmBean.getMessageElement());
	}

	protected void implementMMAbstractDateTimeConcept(TypeResult gen,
			MMAbstractDateTimeConcept mmBean) {
		defaultAttribute(gen, MMAbstractDateTimeConcept_.maxExclusive,
				mmBean.getMaxExclusive());
		defaultAttribute(gen, MMAbstractDateTimeConcept_.minExclusive,
				mmBean.getMinExclusive());
		defaultAttribute(gen, MMAbstractDateTimeConcept_.minInclusive,
				mmBean.getMinInclusive());
		defaultAttribute(gen, MMAbstractDateTimeConcept_.maxInclusive,
				mmBean.getMaxInclusive());
		defaultAttribute(gen, MMAbstractDateTimeConcept_.pattern,
				mmBean.getPattern());
	}

	protected GenerationResult generateMMTopLevelCatalogueEntry(
			SubTypeResult gen, MMTopLevelCatalogueEntry mmBean) {
		if (MMSyntaxMessageScheme.class.equals(mmBean.getClass())) {
			return generateMMSyntaxMessageScheme(gen,
					(MMSyntaxMessageScheme) mmBean);
		} else if (MMMessageSet.class.equals(mmBean.getClass())) {
			return generateMMMessageSet(gen, (MMMessageSet) mmBean);
		} else if (MMBusinessArea.class.equals(mmBean.getClass())) {
			return generateMMBusinessArea(gen, (MMBusinessArea) mmBean);
		} else if (MMMessageChoreography.class.equals(mmBean.getClass())) {
			return generateMMMessageChoreography(gen,
					(MMMessageChoreography) mmBean);
		} else if (MMBusinessTransaction.class.equals(mmBean.getClass())) {
			return generateMMBusinessTransaction(gen,
					(MMBusinessTransaction) mmBean);
		} else if (MMBusinessProcess.class.equals(mmBean.getClass())) {
			return generateMMBusinessProcess(gen, (MMBusinessProcess) mmBean);
		} else if (MMMessageTransportMode.class.equals(mmBean.getClass())) {
			return generateMMMessageTransportMode(gen,
					(MMMessageTransportMode) mmBean);
		} else if (MMIndustryMessageSet.class.equals(mmBean.getClass())) {
			return generateMMIndustryMessageSet(gen,
					(MMIndustryMessageSet) mmBean);
		} else if (MMISO15022MessageSet.class.equals(mmBean.getClass())) {
			return generateMMISO15022MessageSet(gen,
					(MMISO15022MessageSet) mmBean);
		} else if (MMConvergenceDocumentation.class.equals(mmBean.getClass())) {
			return generateMMConvergenceDocumentation(gen,
					(MMConvergenceDocumentation) mmBean);
		} else {
			throw new IllegalArgumentException("Invalid type hierarchy: "
					+ mmBean.getClass());
		}
	}

	protected GenerationResult generateMMTopLevelDictionaryEntry(
			SubTypeResult gen, MMTopLevelDictionaryEntry mmBean) {
		if (MMBusinessComponent.class.equals(mmBean.getClass())) {
			return generateMMBusinessComponent(gen,
					(MMBusinessComponent) mmBean);
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
			throw new IllegalArgumentException("Invalid type hierarchy: "
					+ mmBean.getClass());
		}
	}

	protected GenerationResult generateMMBusinessElement(MainTypeResult gen,
			MMBusinessElement mmBean) {
		if (MMBusinessAssociationEnd.class.equals(mmBean.getClass())) {
			return generateMMBusinessAssociationEnd(gen,
					(MMBusinessAssociationEnd) mmBean);
		} else if (MMBusinessAttribute.class.equals(mmBean.getClass())) {
			return generateMMBusinessAttribute(gen,
					(MMBusinessAttribute) mmBean);
		} else {
			throw new IllegalArgumentException("Invalid type hierarchy: "
					+ mmBean.getClass());
		}
	}

	protected GenerationResult generateMMMessageElement(MainTypeResult gen,
			MMMessageElement mmBean) {
		if (MMMessageAssociationEnd.class.equals(mmBean.getClass())) {
			return generateMMMessageAssociationEnd(gen,
					(MMMessageAssociationEnd) mmBean);
		} else if (MMMessageAttribute.class.equals(mmBean.getClass())) {
			return generateMMMessageAttribute(gen, (MMMessageAttribute) mmBean);
		} else {
			throw new IllegalArgumentException("Invalid type hierarchy: "
					+ mmBean.getClass());
		}
	}
}