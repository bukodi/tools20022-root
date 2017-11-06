package com.tools20022.repogenerator;

import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.metamodel.*;
import com.tools20022.metamodel.struct.*;
import com.tools20022.repogenerator.BaseRepoGenerator;
import com.tools20022.repogenerator.resulttypes.MainTypeResult;
import com.tools20022.repogenerator.resulttypes.PropertyResult;
import com.tools20022.repogenerator.resulttypes.StaticFieldResult;
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
		defaultAttribute(gen, MMMessagingEndpoint_.transportSystem,
				mmBean.getTransportSystem());
		defaultAttribute(gen, MMMessagingEndpoint_.receivedMessage,
				mmBean.getReceivedMessage());
		defaultAttribute(gen, MMMessagingEndpoint_.sentMessage,
				mmBean.getSentMessage());
		defaultAttribute(gen, MMMessagingEndpoint_.location,
				mmBean.getLocation());
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
		defaultAttribute(gen, MMTransportMessage_.sender, mmBean.getSender());
		defaultAttribute(gen, MMTransportMessage_.messageInstance,
				mmBean.getMessageInstance());
		defaultAttribute(gen, MMTransportMessage_.receiver,
				mmBean.getReceiver());
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
			StaticFieldResult containerGen, MMSyntaxMessageScheme mmBean) {
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
		defaultAttribute(gen, MMSemanticMarkup_.elements, mmBean.getElements());
		defaultAttribute(gen, MMSemanticMarkup_.type, mmBean.getType());
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

	protected StaticFieldResult generateMMBusinessProcessCatalogue(
			MainTypeResult containerGen, MMBusinessProcessCatalogue mmBean) {
		StaticFieldResult gen = defaultStaticFieldResult(mmBean, containerGen);
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

	protected StaticFieldResult generateMMDataDictionary(
			MainTypeResult containerGen, MMDataDictionary mmBean) {
		StaticFieldResult gen = defaultStaticFieldResult(mmBean, containerGen);
		implementMMModelEntity(gen, mmBean);
		for (MMTopLevelDictionaryEntry mmChild : mmBean
				.getTopLevelDictionaryEntry()) {
			generateMMTopLevelDictionaryEntry(gen, mmChild);
		}
		defaultAttribute(gen, MMDataDictionary_.topLevelDictionaryEntry,
				mmBean.getTopLevelDictionaryEntry());
		defaultAttribute(gen, MMDataDictionary_.repository,
				mmBean.getRepository());
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
		defaultAttribute(gen, MMMessageDefinition_.businessArea,
				mmBean.getBusinessArea());
		defaultAttribute(gen, MMMessageDefinition_.messageSet,
				mmBean.getMessageSet());
		defaultAttribute(gen, MMMessageDefinition_.xmlName, mmBean.getXmlName());
		defaultAttribute(gen, MMMessageDefinition_.xmlTag, mmBean.getXmlTag());
		defaultAttribute(gen, MMMessageDefinition_.xors, mmBean.getXors());
		defaultAttribute(gen, MMMessageDefinition_.rootElement,
				mmBean.getRootElement());
		defaultAttribute(gen, MMMessageDefinition_.messageBuildingBlock,
				mmBean.getMessageBuildingBlock());
		defaultAttribute(gen, MMMessageDefinition_.choreography,
				mmBean.getChoreography());
		defaultAttribute(gen, MMMessageDefinition_.trace, mmBean.getTrace());
		defaultAttribute(gen, MMMessageDefinition_.messageDefinitionIdentifier,
				mmBean.getMessageDefinitionIdentifier());
		defaultAttribute(gen, MMMessageDefinition_.derivation,
				mmBean.getDerivation());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessageSet(
			StaticFieldResult containerGen, MMMessageSet mmBean) {
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

	protected MainTypeResult generateMMBusinessArea(
			StaticFieldResult containerGen, MMBusinessArea mmBean) {
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

	protected StaticFieldResult generateMMXorInMessageDefinition(
			MainTypeResult containerGen, MMXor mmBean) {
		StaticFieldResult gen = defaultStaticFieldResult(mmBean, containerGen);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMXor_.messageComponent,
				mmBean.getMessageComponent());
		defaultAttribute(gen, MMXor_.messageDefinition,
				mmBean.getMessageDefinition());
		defaultAttribute(gen, MMXor_.impactedElements,
				mmBean.getImpactedElements());
		defaultAttribute(gen, MMXor_.impactedMessageBuildingBlocks,
				mmBean.getImpactedMessageBuildingBlocks());
		gen.flush();
		return gen;
	}

	protected StaticFieldResult generateMMXorInMessageComponent(
			MainTypeResult containerGen, MMXor mmBean) {
		StaticFieldResult gen = defaultStaticFieldResult(mmBean, containerGen);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMXor_.messageComponent,
				mmBean.getMessageComponent());
		defaultAttribute(gen, MMXor_.messageDefinition,
				mmBean.getMessageDefinition());
		defaultAttribute(gen, MMXor_.impactedElements,
				mmBean.getImpactedElements());
		defaultAttribute(gen, MMXor_.impactedMessageBuildingBlocks,
				mmBean.getImpactedMessageBuildingBlocks());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMBusinessComponent(
			StaticFieldResult containerGen, MMBusinessComponent mmBean) {
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
		defaultAttribute(gen, MMBusinessComponent_.subType, mmBean.getSubType());
		defaultAttribute(gen, MMBusinessComponent_.superType,
				mmBean.getSuperType());
		defaultAttribute(gen, MMBusinessComponent_.element, mmBean.getElement());
		defaultAttribute(gen, MMBusinessComponent_.derivationComponent,
				mmBean.getDerivationComponent());
		defaultAttribute(gen, MMBusinessComponent_.associationDomain,
				mmBean.getAssociationDomain());
		gen.flush();
		return gen;
	}

	protected PropertyResult generateMMMessageBuildingBlock(
			MainTypeResult containerGen, MMMessageBuildingBlock mmBean) {
		PropertyResult gen = defaultPropertyResult(mmBean, containerGen);
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

	protected PropertyResult generateMMBusinessAssociationEnd(
			MainTypeResult containerGen, MMBusinessAssociationEnd mmBean) {
		PropertyResult gen = defaultPropertyResult(mmBean, containerGen);
		implementMMBusinessElement(gen, mmBean);
		implementMMConstruct(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		implementMMBusinessConcept(gen, mmBean);
		defaultAttribute(gen, MMBusinessAssociationEnd_.opposite,
				mmBean.getOpposite());
		defaultAttribute(gen, MMBusinessAssociationEnd_.aggregation,
				mmBean.getAggregation());
		defaultAttribute(gen, MMBusinessAssociationEnd_.type, mmBean.getType());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessageComponent(
			StaticFieldResult containerGen, MMMessageComponent mmBean) {
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
			StaticFieldResult containerGen, MMMessageChoreography mmBean) {
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
			StaticFieldResult containerGen, MMBusinessTransaction mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		for (MMParticipant mmChild : mmBean.getParticipant()) {
			generateMMParticipant(gen, mmChild);
		}
		for (MMMessageTransmission mmChild : mmBean.getTransmission()) {
			generateMMMessageTransmission(gen, mmChild);
		}
		defaultAttribute(gen, MMBusinessTransaction_.trace, mmBean.getTrace());
		defaultAttribute(gen, MMBusinessTransaction_.businessProcessTrace,
				mmBean.getBusinessProcessTrace());
		defaultAttribute(gen, MMBusinessTransaction_.participant,
				mmBean.getParticipant());
		defaultAttribute(gen, MMBusinessTransaction_.transmission,
				mmBean.getTransmission());
		defaultAttribute(gen, MMBusinessTransaction_.messageTransportMode,
				mmBean.getMessageTransportMode());
		defaultAttribute(gen, MMBusinessTransaction_.subTransaction,
				mmBean.getSubTransaction());
		defaultAttribute(gen, MMBusinessTransaction_.parentTransaction,
				mmBean.getParentTransaction());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMBusinessProcess(
			StaticFieldResult containerGen, MMBusinessProcess mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		for (MMBusinessRole mmChild : mmBean.getBusinessRole()) {
			generateMMBusinessRole(gen, mmChild);
		}
		defaultAttribute(gen, MMBusinessProcess_.extended, mmBean.getExtended());
		defaultAttribute(gen, MMBusinessProcess_.included, mmBean.getIncluded());
		defaultAttribute(gen, MMBusinessProcess_.includer, mmBean.getIncluder());
		defaultAttribute(gen, MMBusinessProcess_.businessRole,
				mmBean.getBusinessRole());
		defaultAttribute(gen, MMBusinessProcess_.businessProcessTrace,
				mmBean.getBusinessProcessTrace());
		defaultAttribute(gen, MMBusinessProcess_.extender, mmBean.getExtender());
		gen.flush();
		return gen;
	}

	protected StaticFieldResult generateMMBusinessRole(
			MainTypeResult containerGen, MMBusinessRole mmBean) {
		StaticFieldResult gen = defaultStaticFieldResult(mmBean, containerGen);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMBusinessRole_.businessProcess,
				mmBean.getBusinessProcess());
		defaultAttribute(gen, MMBusinessRole_.businessRoleTrace,
				mmBean.getBusinessRoleTrace());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMParticipant(MainTypeResult containerGen,
			MMParticipant mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		defaultAttribute(gen, MMParticipant_.businessRoleTrace,
				mmBean.getBusinessRoleTrace());
		defaultAttribute(gen, MMParticipant_.businessTransaction,
				mmBean.getBusinessTransaction());
		defaultAttribute(gen, MMParticipant_.receives, mmBean.getReceives());
		defaultAttribute(gen, MMParticipant_.sends, mmBean.getSends());
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
		generateMMSend(gen, mmBean.getSend());
		for (MMReceive mmChild : mmBean.getReceive()) {
			generateMMReceive(gen, mmChild);
		}
		defaultAttribute(gen, MMMessageTransmission_.derivation,
				mmBean.getDerivation());
		defaultAttribute(gen, MMMessageTransmission_.businessTransaction,
				mmBean.getBusinessTransaction());
		defaultAttribute(gen, MMMessageTransmission_.messageTypeDescription,
				mmBean.getMessageTypeDescription());
		defaultAttribute(gen, MMMessageTransmission_.send, mmBean.getSend());
		defaultAttribute(gen, MMMessageTransmission_.receive,
				mmBean.getReceive());
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
			StaticFieldResult containerGen, MMMessageTransportMode mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen,
				MMMessageTransportMode_.boundedCommunicationDelay,
				mmBean.getBoundedCommunicationDelay());
		defaultAttribute(gen, MMMessageTransportMode_.maximumClockVariation,
				mmBean.getMaximumClockVariation());
		defaultAttribute(gen, MMMessageTransportMode_.maximumMessageSize,
				mmBean.getMaximumMessageSize());
		defaultAttribute(gen, MMMessageTransportMode_.messageDeliveryWindow,
				mmBean.getMessageDeliveryWindow());
		defaultAttribute(gen, MMMessageTransportMode_.messageSendingWindow,
				mmBean.getMessageSendingWindow());
		defaultAttribute(gen, MMMessageTransportMode_.deliveryAssurance,
				mmBean.getDeliveryAssurance());
		defaultAttribute(gen, MMMessageTransportMode_.durability,
				mmBean.getDurability());
		defaultAttribute(gen, MMMessageTransportMode_.messageCasting,
				mmBean.getMessageCasting());
		defaultAttribute(gen, MMMessageTransportMode_.messageDeliveryOrder,
				mmBean.getMessageDeliveryOrder());
		defaultAttribute(gen, MMMessageTransportMode_.messageValidationLevel,
				mmBean.getMessageValidationLevel());
		defaultAttribute(gen, MMMessageTransportMode_.messageValidationOnOff,
				mmBean.getMessageValidationOnOff());
		defaultAttribute(gen, MMMessageTransportMode_.messageValidationResults,
				mmBean.getMessageValidationResults());
		defaultAttribute(gen, MMMessageTransportMode_.receiverAsynchronicity,
				mmBean.getReceiverAsynchronicity());
		defaultAttribute(gen, MMMessageTransportMode_.senderAsynchronicity,
				mmBean.getSenderAsynchronicity());
		defaultAttribute(gen, MMMessageTransportMode_.businessTransaction,
				mmBean.getBusinessTransaction());
		gen.flush();
		return gen;
	}

	protected StaticFieldResult generateMMMessageDefinitionIdentifier(
			MainTypeResult containerGen, MMMessageDefinitionIdentifier mmBean) {
		StaticFieldResult gen = defaultStaticFieldResult(mmBean, containerGen);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMMessageDefinitionIdentifier_.businessArea,
				mmBean.getBusinessArea());
		defaultAttribute(gen,
				MMMessageDefinitionIdentifier_.messageFunctionality,
				mmBean.getMessageFunctionality());
		defaultAttribute(gen, MMMessageDefinitionIdentifier_.flavour,
				mmBean.getFlavour());
		defaultAttribute(gen, MMMessageDefinitionIdentifier_.version,
				mmBean.getVersion());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMConversation(MMConversation mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected PropertyResult generateMMMessageAssociationEnd(
			MainTypeResult containerGen, MMMessageAssociationEnd mmBean) {
		PropertyResult gen = defaultPropertyResult(mmBean, containerGen);
		implementMMMessageElement(gen, mmBean);
		implementMMMessageConstruct(gen, mmBean);
		implementMMConstruct(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
		defaultAttribute(gen, MMMessageAssociationEnd_.isComposite,
				mmBean.isIsComposite());
		defaultAttribute(gen, MMMessageAssociationEnd_.type, mmBean.getType());
		gen.flush();
		return gen;
	}

	protected PropertyResult generateMMMessageAttribute(
			MainTypeResult containerGen, MMMessageAttribute mmBean) {
		PropertyResult gen = defaultPropertyResult(mmBean, containerGen);
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

	protected PropertyResult generateMMBusinessAttribute(
			MainTypeResult containerGen, MMBusinessAttribute mmBean) {
		PropertyResult gen = defaultPropertyResult(mmBean, containerGen);
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

	protected MainTypeResult generateMMText(StaticFieldResult containerGen,
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

	protected MainTypeResult generateMMString(StaticFieldResult containerGen,
			MMString mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMString_.minLength, mmBean.getMinLength());
		defaultAttribute(gen, MMString_.maxLength, mmBean.getMaxLength());
		defaultAttribute(gen, MMString_.pattern, mmBean.getPattern());
		defaultAttribute(gen, MMString_.length, mmBean.getLength());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMIdentifierSet(
			StaticFieldResult containerGen, MMIdentifierSet mmBean) {
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

	protected MainTypeResult generateMMIndicator(
			StaticFieldResult containerGen, MMIndicator mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMIndicator_.meaningWhenTrue,
				mmBean.getMeaningWhenTrue());
		defaultAttribute(gen, MMIndicator_.meaningWhenFalse,
				mmBean.getMeaningWhenFalse());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMBoolean(StaticFieldResult containerGen,
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

	protected MainTypeResult generateMMRate(StaticFieldResult containerGen,
			MMRate mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMRate_.baseValue, mmBean.getBaseValue());
		defaultAttribute(gen, MMRate_.baseUnitCode, mmBean.getBaseUnitCode());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMDecimal(StaticFieldResult containerGen,
			MMDecimal mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMDecimal_.minInclusive, mmBean.getMinInclusive());
		defaultAttribute(gen, MMDecimal_.minExclusive, mmBean.getMinExclusive());
		defaultAttribute(gen, MMDecimal_.maxInclusive, mmBean.getMaxInclusive());
		defaultAttribute(gen, MMDecimal_.maxExclusive, mmBean.getMaxExclusive());
		defaultAttribute(gen, MMDecimal_.totalDigits, mmBean.getTotalDigits());
		defaultAttribute(gen, MMDecimal_.fractionDigits,
				mmBean.getFractionDigits());
		defaultAttribute(gen, MMDecimal_.pattern, mmBean.getPattern());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMExternalSchema(
			StaticFieldResult containerGen, MMExternalSchema mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMMessageComponentType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
		defaultAttribute(gen, MMExternalSchema_.namespaceList,
				mmBean.getNamespaceList());
		defaultAttribute(gen, MMExternalSchema_.processContent,
				mmBean.getProcessContent());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMQuantity(StaticFieldResult containerGen,
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

	protected StaticFieldResult generateMMCode(MainTypeResult containerGen,
			MMCode mmBean) {
		StaticFieldResult gen = defaultStaticFieldResult(mmBean, containerGen);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMCode_.owner, mmBean.getOwner());
		defaultAttribute(gen, MMCode_.codeName, mmBean.getCodeName());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMCodeSet(StaticFieldResult containerGen,
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

	protected MainTypeResult generateMMAmount(StaticFieldResult containerGen,
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
			StaticFieldResult containerGen, MMChoiceComponent mmBean) {
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
			StaticFieldResult containerGen, MMEndPointCategory mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMEndPointCategory_.endPoints,
				mmBean.getEndPoints());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMBinary(StaticFieldResult containerGen,
			MMBinary mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMBinary_.minLength, mmBean.getMinLength());
		defaultAttribute(gen, MMBinary_.maxLength, mmBean.getMaxLength());
		defaultAttribute(gen, MMBinary_.pattern, mmBean.getPattern());
		defaultAttribute(gen, MMBinary_.length, mmBean.getLength());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMDate(StaticFieldResult containerGen,
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

	protected MainTypeResult generateMMDateTime(StaticFieldResult containerGen,
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

	protected MainTypeResult generateMMDay(StaticFieldResult containerGen,
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

	protected MainTypeResult generateMMDuration(StaticFieldResult containerGen,
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

	protected MainTypeResult generateMMMonth(StaticFieldResult containerGen,
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

	protected MainTypeResult generateMMMonthDay(StaticFieldResult containerGen,
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

	protected MainTypeResult generateMMTime(StaticFieldResult containerGen,
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

	protected MainTypeResult generateMMYear(StaticFieldResult containerGen,
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

	protected MainTypeResult generateMMYearMonth(
			StaticFieldResult containerGen, MMYearMonth mmBean) {
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

	protected MainTypeResult generateMMUserDefined(
			StaticFieldResult containerGen, MMUserDefined mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMMessageComponentType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
		defaultAttribute(gen, MMUserDefined_.namespaceList,
				mmBean.getNamespaceList());
		defaultAttribute(gen, MMUserDefined_.namespace, mmBean.getNamespace());
		defaultAttribute(gen, MMUserDefined_.processContents,
				mmBean.getProcessContents());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMIndustryMessageSet(
			StaticFieldResult containerGen, MMIndustryMessageSet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMConvergenceDocumentation(
			StaticFieldResult containerGen, MMConvergenceDocumentation mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMISO15022MessageSet(
			StaticFieldResult containerGen, MMISO15022MessageSet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMSchemaType(
			StaticFieldResult containerGen, MMSchemaType mmBean) {
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
		defaultAttribute(gen, MMModelEntity_.nextVersions,
				mmBean.getNextVersions());
		defaultAttribute(gen, MMModelEntity_.previousVersion,
				mmBean.getPreviousVersion());
		defaultAttribute(gen, MMModelEntity_.objectIdentifier,
				mmBean.getObjectIdentifier());
	}

	protected void implementMMTopLevelCatalogueEntry(TypeResult gen,
			MMTopLevelCatalogueEntry mmBean) {
		defaultAttribute(gen,
				MMTopLevelCatalogueEntry_.businessProcessCatalogue,
				mmBean.getBusinessProcessCatalogue());
	}

	protected void implementMMRepositoryConcept(TypeResult gen,
			MMRepositoryConcept mmBean) {
		defaultAttribute(gen, MMRepositoryConcept_.semanticMarkup,
				mmBean.getSemanticMarkup());
		defaultAttribute(gen, MMRepositoryConcept_.doclet, mmBean.getDoclet());
		defaultAttribute(gen, MMRepositoryConcept_.example, mmBean.getExample());
		defaultAttribute(gen, MMRepositoryConcept_.constraint,
				mmBean.getConstraint());
		defaultAttribute(gen, MMRepositoryConcept_.registrationStatus,
				mmBean.getRegistrationStatus());
		defaultAttribute(gen, MMRepositoryConcept_.removalDate,
				mmBean.getRemovalDate());
		defaultAttribute(gen, MMRepositoryConcept_.name, mmBean.getName());
		defaultAttribute(gen, MMRepositoryConcept_.definition,
				mmBean.getDefinition());
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
		defaultAttribute(gen, MMMessageElement_.businessComponentTrace,
				mmBean.getBusinessComponentTrace());
		defaultAttribute(gen, MMMessageElement_.businessElementTrace,
				mmBean.getBusinessElementTrace());
		defaultAttribute(gen, MMMessageElement_.componentContext,
				mmBean.getComponentContext());
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
		defaultAttribute(gen, MMMultiplicityEntity_.maxOccurs,
				mmBean.getMaxOccurs());
		defaultAttribute(gen, MMMultiplicityEntity_.minOccurs,
				mmBean.getMinOccurs());
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
		defaultAttribute(gen, MMMessageComponentType_.messageBuildingBlock,
				mmBean.getMessageBuildingBlock());
		defaultAttribute(gen, MMMessageComponentType_.trace, mmBean.getTrace());
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
		defaultAttribute(gen, MMAbstractDateTimeConcept_.minInclusive,
				mmBean.getMinInclusive());
		defaultAttribute(gen, MMAbstractDateTimeConcept_.minExclusive,
				mmBean.getMinExclusive());
		defaultAttribute(gen, MMAbstractDateTimeConcept_.maxInclusive,
				mmBean.getMaxInclusive());
		defaultAttribute(gen, MMAbstractDateTimeConcept_.maxExclusive,
				mmBean.getMaxExclusive());
		defaultAttribute(gen, MMAbstractDateTimeConcept_.pattern,
				mmBean.getPattern());
	}

	protected GenerationResult generateMMTopLevelCatalogueEntry(
			StaticFieldResult gen, MMTopLevelCatalogueEntry mmBean) {
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
			StaticFieldResult gen, MMTopLevelDictionaryEntry mmBean) {
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