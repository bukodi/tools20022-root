package com.tools20022.repogenerator;

import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.metamodel.*;
import com.tools20022.repogenerator.BaseRepoGenerator;
import com.tools20022.repogenerator.resulttypes.*;

public abstract class GeneratedRepoGenerator extends BaseRepoGenerator {

	@Override
	public abstract void accept(RawRepository repo,
			GenerationContext<RawRepository> ctx);

	protected MainTypeResult generateMMAddress(MMAddress mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMAddress.broadCastListAttribute,
				mmBean.getBroadCastList());
		defaultAttribute(gen, MMAddress.endpointAttribute, mmBean.getEndpoint());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMBroadcastList(MMBroadcastList mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMBroadcastList.addressAttribute,
				mmBean.getAddress());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessagingEndpoint(
			MainTypeResult containerGen, MMMessagingEndpoint mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMMessagingEndpoint.transportSystemAttribute,
				mmBean.getTransportSystem());
		defaultAttribute(gen, MMMessagingEndpoint.receivedMessageAttribute,
				mmBean.getReceivedMessage());
		defaultAttribute(gen, MMMessagingEndpoint.sentMessageAttribute,
				mmBean.getSentMessage());
		defaultAttribute(gen, MMMessagingEndpoint.locationAttribute,
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
		defaultAttribute(gen, MMMessageTransportSystem.endpointAttribute,
				mmBean.getEndpoint());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMTransportMessage(
			MMTransportMessage mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMTransportMessage.senderAttribute,
				mmBean.getSender());
		defaultAttribute(gen, MMTransportMessage.messageInstanceAttribute,
				mmBean.getMessageInstance());
		defaultAttribute(gen, MMTransportMessage.receiverAttribute,
				mmBean.getReceiver());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessageInstance(MMMessageInstance mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMMessageInstance.specificationAttribute,
				mmBean.getSpecification());
		defaultAttribute(gen, MMMessageInstance.transportMessageAttribute,
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
		defaultAttribute(gen,
				MMSyntaxMessageScheme.messageDefinitionTraceAttribute,
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
		defaultAttribute(gen, MMSemanticMarkup.elementsAttribute,
				mmBean.getElements());
		defaultAttribute(gen, MMSemanticMarkup.typeAttribute, mmBean.getType());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMSemanticMarkupElement(
			MainTypeResult containerGen, MMSemanticMarkupElement mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMSemanticMarkupElement.nameAttribute,
				mmBean.getName());
		defaultAttribute(gen, MMSemanticMarkupElement.valueAttribute,
				mmBean.getValue());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMDoclet(MainTypeResult containerGen,
			MMDoclet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMDoclet.typeAttribute, mmBean.getType());
		defaultAttribute(gen, MMDoclet.contentAttribute, mmBean.getContent());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMConstraint(MainTypeResult containerGen,
			MMConstraint mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMConstraint.ownerAttribute, mmBean.getOwner());
		defaultAttribute(gen, MMConstraint.expressionAttribute,
				mmBean.getExpression());
		defaultAttribute(gen, MMConstraint.expressionLanguageAttribute,
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
		defaultAttribute(gen, MMBusinessProcessCatalogue.repositoryAttribute,
				mmBean.getRepository());
		defaultAttribute(gen,
				MMBusinessProcessCatalogue.topLevelCatalogueEntryAttribute,
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
		defaultAttribute(gen, MMRepository.businessProcessCatalogueAttribute,
				mmBean.getBusinessProcessCatalogue());
		defaultAttribute(gen, MMRepository.dataDictionaryAttribute,
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
		defaultAttribute(gen,
				MMDataDictionary.topLevelDictionaryEntryAttribute,
				mmBean.getTopLevelDictionaryEntry());
		defaultAttribute(gen, MMDataDictionary.repositoryAttribute,
				mmBean.getRepository());
		gen.flush();
		return gen;
	}

	protected JaxbMainTypeResult generateMMMessageDefinition(
			MainTypeResult containerGen, MMMessageDefinition mmBean) {
		JaxbMainTypeResult gen = defaultJaxbMainType(mmBean);
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
		defaultAttribute(gen, MMMessageDefinition.businessAreaAttribute,
				mmBean.getBusinessArea());
		defaultAttribute(gen, MMMessageDefinition.messageSetAttribute,
				mmBean.getMessageSet());
		defaultAttribute(gen, MMMessageDefinition.xmlNameAttribute,
				mmBean.getXmlName());
		defaultAttribute(gen, MMMessageDefinition.xmlTagAttribute,
				mmBean.getXmlTag());
		defaultAttribute(gen, MMMessageDefinition.xorsAttribute,
				mmBean.getXors());
		defaultAttribute(gen, MMMessageDefinition.rootElementAttribute,
				mmBean.getRootElement());
		defaultAttribute(gen,
				MMMessageDefinition.messageBuildingBlockAttribute,
				mmBean.getMessageBuildingBlock());
		defaultAttribute(gen, MMMessageDefinition.choreographyAttribute,
				mmBean.getChoreography());
		defaultAttribute(gen, MMMessageDefinition.traceAttribute,
				mmBean.getTrace());
		defaultAttribute(gen,
				MMMessageDefinition.messageDefinitionIdentifierAttribute,
				mmBean.getMessageDefinitionIdentifier());
		defaultAttribute(gen, MMMessageDefinition.derivationAttribute,
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
		defaultAttribute(gen, MMMessageSet.validEncodingAttribute,
				mmBean.getValidEncoding());
		defaultAttribute(gen, MMMessageSet.messageDefinitionAttribute,
				mmBean.getMessageDefinition());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMSyntax(MMSyntax mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMSyntax.possibleEncodingsAttribute,
				mmBean.getPossibleEncodings());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMEncoding(MMEncoding mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMEncoding.messageSetAttribute,
				mmBean.getMessageSet());
		defaultAttribute(gen, MMEncoding.syntaxAttribute, mmBean.getSyntax());
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
		defaultAttribute(gen, MMBusinessArea.messageDefinitionAttribute,
				mmBean.getMessageDefinition());
		defaultAttribute(gen, MMBusinessArea.codeAttribute, mmBean.getCode());
		gen.flush();
		return gen;
	}

	protected StaticFieldResult generateMMXorInMessageDefinition(
			JaxbMainTypeResult containerGen, MMXor mmBean) {
		StaticFieldResult gen = defaultStaticFieldResult(mmBean, containerGen);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMXor.messageDefinitionAttribute,
				mmBean.getMessageDefinition());
		defaultAttribute(gen, MMXor.messageComponentAttribute,
				mmBean.getMessageComponent());
		defaultAttribute(gen, MMXor.impactedElementsAttribute,
				mmBean.getImpactedElements());
		defaultAttribute(gen, MMXor.impactedMessageBuildingBlocksAttribute,
				mmBean.getImpactedMessageBuildingBlocks());
		gen.flush();
		return gen;
	}

	protected StaticFieldResult generateMMXorInMessageComponent(
			JaxbMainTypeResult containerGen, MMXor mmBean) {
		StaticFieldResult gen = defaultStaticFieldResult(mmBean, containerGen);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMXor.messageDefinitionAttribute,
				mmBean.getMessageDefinition());
		defaultAttribute(gen, MMXor.messageComponentAttribute,
				mmBean.getMessageComponent());
		defaultAttribute(gen, MMXor.impactedElementsAttribute,
				mmBean.getImpactedElements());
		defaultAttribute(gen, MMXor.impactedMessageBuildingBlocksAttribute,
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
		defaultAttribute(gen, MMBusinessComponent.subTypeAttribute,
				mmBean.getSubType());
		defaultAttribute(gen, MMBusinessComponent.superTypeAttribute,
				mmBean.getSuperType());
		defaultAttribute(gen, MMBusinessComponent.elementAttribute,
				mmBean.getElement());
		defaultAttribute(gen, MMBusinessComponent.derivationComponentAttribute,
				mmBean.getDerivationComponent());
		defaultAttribute(gen, MMBusinessComponent.associationDomainAttribute,
				mmBean.getAssociationDomain());
		defaultAttribute(gen, MMBusinessComponent.derivationElementAttribute,
				mmBean.getDerivationElement());
		gen.flush();
		return gen;
	}

	protected JaxbPropertyResult generateMMMessageBuildingBlock(
			JaxbMainTypeResult containerGen, MMMessageBuildingBlock mmBean) {
		JaxbPropertyResult gen = defaultJaxbPropertyResult(mmBean, containerGen);
		implementMMMessageConstruct(gen, mmBean);
		implementMMConstruct(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		defaultAttribute(gen, MMMessageBuildingBlock.simpleTypeAttribute,
				mmBean.getSimpleType());
		defaultAttribute(gen, MMMessageBuildingBlock.complexTypeAttribute,
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
		defaultAttribute(gen, MMBusinessAssociationEnd.oppositeAttribute,
				mmBean.getOpposite());
		defaultAttribute(gen, MMBusinessAssociationEnd.aggregationAttribute,
				mmBean.getAggregation());
		defaultAttribute(gen, MMBusinessAssociationEnd.typeAttribute,
				mmBean.getType());
		gen.flush();
		return gen;
	}

	protected JaxbMainTypeResult generateMMMessageComponent(
			StaticFieldResult containerGen, MMMessageComponent mmBean) {
		JaxbMainTypeResult gen = defaultJaxbMainType(mmBean);
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
		defaultAttribute(gen, MMMessageComponent.xorsAttribute,
				mmBean.getXors());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessageChoreography(
			StaticFieldResult containerGen, MMMessageChoreography mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMMessageChoreography.messageDefinitionAttribute,
				mmBean.getMessageDefinition());
		defaultAttribute(gen,
				MMMessageChoreography.businessTransactionTraceAttribute,
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
		defaultAttribute(gen, MMBusinessTransaction.traceAttribute,
				mmBean.getTrace());
		defaultAttribute(gen,
				MMBusinessTransaction.businessProcessTraceAttribute,
				mmBean.getBusinessProcessTrace());
		defaultAttribute(gen, MMBusinessTransaction.participantAttribute,
				mmBean.getParticipant());
		defaultAttribute(gen, MMBusinessTransaction.transmissionAttribute,
				mmBean.getTransmission());
		defaultAttribute(gen,
				MMBusinessTransaction.messageTransportModeAttribute,
				mmBean.getMessageTransportMode());
		defaultAttribute(gen, MMBusinessTransaction.subTransactionAttribute,
				mmBean.getSubTransaction());
		defaultAttribute(gen, MMBusinessTransaction.parentTransactionAttribute,
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
		defaultAttribute(gen, MMBusinessProcess.businessProcessTraceAttribute,
				mmBean.getBusinessProcessTrace());
		defaultAttribute(gen, MMBusinessProcess.extenderAttribute,
				mmBean.getExtender());
		defaultAttribute(gen, MMBusinessProcess.extendedAttribute,
				mmBean.getExtended());
		defaultAttribute(gen, MMBusinessProcess.includedAttribute,
				mmBean.getIncluded());
		defaultAttribute(gen, MMBusinessProcess.includerAttribute,
				mmBean.getIncluder());
		defaultAttribute(gen, MMBusinessProcess.businessRoleAttribute,
				mmBean.getBusinessRole());
		gen.flush();
		return gen;
	}

	protected StaticFieldResult generateMMBusinessRole(
			MainTypeResult containerGen, MMBusinessRole mmBean) {
		StaticFieldResult gen = defaultStaticFieldResult(mmBean, containerGen);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMBusinessRole.businessProcessAttribute,
				mmBean.getBusinessProcess());
		defaultAttribute(gen, MMBusinessRole.businessRoleTraceAttribute,
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
		defaultAttribute(gen, MMParticipant.businessTransactionAttribute,
				mmBean.getBusinessTransaction());
		defaultAttribute(gen, MMParticipant.receivesAttribute,
				mmBean.getReceives());
		defaultAttribute(gen, MMParticipant.sendsAttribute, mmBean.getSends());
		defaultAttribute(gen, MMParticipant.businessRoleTraceAttribute,
				mmBean.getBusinessRoleTrace());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMReceive(MainTypeResult containerGen,
			MMReceive mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMReceive.receiverAttribute, mmBean.getReceiver());
		defaultAttribute(gen, MMReceive.messageTransmissionAttribute,
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
		defaultAttribute(gen, MMMessageTransmission.derivationAttribute,
				mmBean.getDerivation());
		defaultAttribute(gen,
				MMMessageTransmission.businessTransactionAttribute,
				mmBean.getBusinessTransaction());
		defaultAttribute(gen,
				MMMessageTransmission.messageTypeDescriptionAttribute,
				mmBean.getMessageTypeDescription());
		defaultAttribute(gen, MMMessageTransmission.sendAttribute,
				mmBean.getSend());
		defaultAttribute(gen, MMMessageTransmission.receiveAttribute,
				mmBean.getReceive());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMSend(MainTypeResult containerGen,
			MMSend mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMSend.senderAttribute, mmBean.getSender());
		defaultAttribute(gen, MMSend.messageTransmissionAttribute,
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
				MMMessageTransportMode.businessTransactionAttribute,
				mmBean.getBusinessTransaction());
		defaultAttribute(gen,
				MMMessageTransportMode.boundedCommunicationDelayAttribute,
				mmBean.getBoundedCommunicationDelay());
		defaultAttribute(gen,
				MMMessageTransportMode.maximumClockVariationAttribute,
				mmBean.getMaximumClockVariation());
		defaultAttribute(gen,
				MMMessageTransportMode.maximumMessageSizeAttribute,
				mmBean.getMaximumMessageSize());
		defaultAttribute(gen,
				MMMessageTransportMode.messageDeliveryWindowAttribute,
				mmBean.getMessageDeliveryWindow());
		defaultAttribute(gen,
				MMMessageTransportMode.messageSendingWindowAttribute,
				mmBean.getMessageSendingWindow());
		defaultAttribute(gen,
				MMMessageTransportMode.deliveryAssuranceAttribute,
				mmBean.getDeliveryAssurance());
		defaultAttribute(gen, MMMessageTransportMode.durabilityAttribute,
				mmBean.getDurability());
		defaultAttribute(gen, MMMessageTransportMode.messageCastingAttribute,
				mmBean.getMessageCasting());
		defaultAttribute(gen,
				MMMessageTransportMode.messageDeliveryOrderAttribute,
				mmBean.getMessageDeliveryOrder());
		defaultAttribute(gen,
				MMMessageTransportMode.messageValidationLevelAttribute,
				mmBean.getMessageValidationLevel());
		defaultAttribute(gen,
				MMMessageTransportMode.messageValidationOnOffAttribute,
				mmBean.getMessageValidationOnOff());
		defaultAttribute(gen,
				MMMessageTransportMode.messageValidationResultsAttribute,
				mmBean.getMessageValidationResults());
		defaultAttribute(gen,
				MMMessageTransportMode.receiverAsynchronicityAttribute,
				mmBean.getReceiverAsynchronicity());
		defaultAttribute(gen,
				MMMessageTransportMode.senderAsynchronicityAttribute,
				mmBean.getSenderAsynchronicity());
		gen.flush();
		return gen;
	}

	protected StaticFieldResult generateMMMessageDefinitionIdentifier(
			JaxbMainTypeResult containerGen,
			MMMessageDefinitionIdentifier mmBean) {
		StaticFieldResult gen = defaultStaticFieldResult(mmBean, containerGen);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen,
				MMMessageDefinitionIdentifier.businessAreaAttribute,
				mmBean.getBusinessArea());
		defaultAttribute(gen,
				MMMessageDefinitionIdentifier.messageFunctionalityAttribute,
				mmBean.getMessageFunctionality());
		defaultAttribute(gen, MMMessageDefinitionIdentifier.flavourAttribute,
				mmBean.getFlavour());
		defaultAttribute(gen, MMMessageDefinitionIdentifier.versionAttribute,
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

	protected JaxbPropertyResult generateMMMessageAssociationEnd(
			JaxbMainTypeResult containerGen, MMMessageAssociationEnd mmBean) {
		JaxbPropertyResult gen = defaultJaxbPropertyResult(mmBean, containerGen);
		implementMMMessageElement(gen, mmBean);
		implementMMMessageConstruct(gen, mmBean);
		implementMMConstruct(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
		defaultAttribute(gen, MMMessageAssociationEnd.isCompositeAttribute,
				mmBean.isIsComposite());
		defaultAttribute(gen, MMMessageAssociationEnd.typeAttribute,
				mmBean.getType());
		gen.flush();
		return gen;
	}

	protected JaxbPropertyResult generateMMMessageAttribute(
			JaxbMainTypeResult containerGen, MMMessageAttribute mmBean) {
		JaxbPropertyResult gen = defaultJaxbPropertyResult(mmBean, containerGen);
		implementMMMessageElement(gen, mmBean);
		implementMMMessageConstruct(gen, mmBean);
		implementMMConstruct(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMMultiplicityEntity(gen, mmBean);
		implementMMMessageConcept(gen, mmBean);
		defaultAttribute(gen, MMMessageAttribute.simpleTypeAttribute,
				mmBean.getSimpleType());
		defaultAttribute(gen, MMMessageAttribute.complexTypeAttribute,
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
		defaultAttribute(gen, MMBusinessAttribute.simpleTypeAttribute,
				mmBean.getSimpleType());
		defaultAttribute(gen, MMBusinessAttribute.complexTypeAttribute,
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
		defaultAttribute(gen, MMText.minLengthAttribute, mmBean.getMinLength());
		defaultAttribute(gen, MMText.maxLengthAttribute, mmBean.getMaxLength());
		defaultAttribute(gen, MMText.patternAttribute, mmBean.getPattern());
		defaultAttribute(gen, MMText.lengthAttribute, mmBean.getLength());
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
		defaultAttribute(gen, MMString.minLengthAttribute,
				mmBean.getMinLength());
		defaultAttribute(gen, MMString.maxLengthAttribute,
				mmBean.getMaxLength());
		defaultAttribute(gen, MMString.patternAttribute, mmBean.getPattern());
		defaultAttribute(gen, MMString.lengthAttribute, mmBean.getLength());
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
		defaultAttribute(gen, MMIdentifierSet.identificationSchemeAttribute,
				mmBean.getIdentificationScheme());
		defaultAttribute(gen, MMIdentifierSet.minLengthAttribute,
				mmBean.getMinLength());
		defaultAttribute(gen, MMIdentifierSet.maxLengthAttribute,
				mmBean.getMaxLength());
		defaultAttribute(gen, MMIdentifierSet.patternAttribute,
				mmBean.getPattern());
		defaultAttribute(gen, MMIdentifierSet.lengthAttribute,
				mmBean.getLength());
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
		defaultAttribute(gen, MMIndicator.meaningWhenTrueAttribute,
				mmBean.getMeaningWhenTrue());
		defaultAttribute(gen, MMIndicator.meaningWhenFalseAttribute,
				mmBean.getMeaningWhenFalse());
		defaultAttribute(gen, MMIndicator.patternAttribute, mmBean.getPattern());
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
		defaultAttribute(gen, MMBoolean.patternAttribute, mmBean.getPattern());
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
		defaultAttribute(gen, MMRate.baseValueAttribute, mmBean.getBaseValue());
		defaultAttribute(gen, MMRate.baseUnitCodeAttribute,
				mmBean.getBaseUnitCode());
		defaultAttribute(gen, MMRate.patternAttribute, mmBean.getPattern());
		defaultAttribute(gen, MMRate.minInclusiveAttribute,
				mmBean.getMinInclusive());
		defaultAttribute(gen, MMRate.minExclusiveAttribute,
				mmBean.getMinExclusive());
		defaultAttribute(gen, MMRate.maxInclusiveAttribute,
				mmBean.getMaxInclusive());
		defaultAttribute(gen, MMRate.maxExclusiveAttribute,
				mmBean.getMaxExclusive());
		defaultAttribute(gen, MMRate.totalDigitsAttribute,
				mmBean.getTotalDigits());
		defaultAttribute(gen, MMRate.fractionDigitsAttribute,
				mmBean.getFractionDigits());
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
		defaultAttribute(gen, MMDecimal.patternAttribute, mmBean.getPattern());
		defaultAttribute(gen, MMDecimal.minInclusiveAttribute,
				mmBean.getMinInclusive());
		defaultAttribute(gen, MMDecimal.minExclusiveAttribute,
				mmBean.getMinExclusive());
		defaultAttribute(gen, MMDecimal.maxInclusiveAttribute,
				mmBean.getMaxInclusive());
		defaultAttribute(gen, MMDecimal.maxExclusiveAttribute,
				mmBean.getMaxExclusive());
		defaultAttribute(gen, MMDecimal.totalDigitsAttribute,
				mmBean.getTotalDigits());
		defaultAttribute(gen, MMDecimal.fractionDigitsAttribute,
				mmBean.getFractionDigits());
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
		defaultAttribute(gen, MMExternalSchema.namespaceListAttribute,
				mmBean.getNamespaceList());
		defaultAttribute(gen, MMExternalSchema.processContentAttribute,
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
		defaultAttribute(gen, MMQuantity.unitCodeAttribute,
				mmBean.getUnitCode());
		defaultAttribute(gen, MMQuantity.patternAttribute, mmBean.getPattern());
		defaultAttribute(gen, MMQuantity.minInclusiveAttribute,
				mmBean.getMinInclusive());
		defaultAttribute(gen, MMQuantity.minExclusiveAttribute,
				mmBean.getMinExclusive());
		defaultAttribute(gen, MMQuantity.maxInclusiveAttribute,
				mmBean.getMaxInclusive());
		defaultAttribute(gen, MMQuantity.maxExclusiveAttribute,
				mmBean.getMaxExclusive());
		defaultAttribute(gen, MMQuantity.totalDigitsAttribute,
				mmBean.getTotalDigits());
		defaultAttribute(gen, MMQuantity.fractionDigitsAttribute,
				mmBean.getFractionDigits());
		gen.flush();
		return gen;
	}

	protected StaticFieldResult generateMMCode(MainTypeResult containerGen,
			MMCode mmBean) {
		StaticFieldResult gen = defaultStaticFieldResult(mmBean, containerGen);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMCode.ownerAttribute, mmBean.getOwner());
		defaultAttribute(gen, MMCode.codeNameAttribute, mmBean.getCodeName());
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
		defaultAttribute(gen, MMCodeSet.traceAttribute, mmBean.getTrace());
		defaultAttribute(gen, MMCodeSet.derivationAttribute,
				mmBean.getDerivation());
		defaultAttribute(gen, MMCodeSet.codeAttribute, mmBean.getCode());
		defaultAttribute(gen, MMCodeSet.identificationSchemeAttribute,
				mmBean.getIdentificationScheme());
		defaultAttribute(gen, MMCodeSet.minLengthAttribute,
				mmBean.getMinLength());
		defaultAttribute(gen, MMCodeSet.maxLengthAttribute,
				mmBean.getMaxLength());
		defaultAttribute(gen, MMCodeSet.patternAttribute, mmBean.getPattern());
		defaultAttribute(gen, MMCodeSet.lengthAttribute, mmBean.getLength());
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
		defaultAttribute(gen, MMAmount.currencyIdentifierSetAttribute,
				mmBean.getCurrencyIdentifierSet());
		defaultAttribute(gen, MMAmount.patternAttribute, mmBean.getPattern());
		defaultAttribute(gen, MMAmount.minInclusiveAttribute,
				mmBean.getMinInclusive());
		defaultAttribute(gen, MMAmount.minExclusiveAttribute,
				mmBean.getMinExclusive());
		defaultAttribute(gen, MMAmount.maxInclusiveAttribute,
				mmBean.getMaxInclusive());
		defaultAttribute(gen, MMAmount.maxExclusiveAttribute,
				mmBean.getMaxExclusive());
		defaultAttribute(gen, MMAmount.totalDigitsAttribute,
				mmBean.getTotalDigits());
		defaultAttribute(gen, MMAmount.fractionDigitsAttribute,
				mmBean.getFractionDigits());
		gen.flush();
		return gen;
	}

	protected JaxbMainTypeResult generateMMChoiceComponent(
			StaticFieldResult containerGen, MMChoiceComponent mmBean) {
		JaxbMainTypeResult gen = defaultJaxbMainType(mmBean);
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
		defaultAttribute(gen, MMEndPointCategory.endPointsAttribute,
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
		defaultAttribute(gen, MMBinary.minLengthAttribute,
				mmBean.getMinLength());
		defaultAttribute(gen, MMBinary.maxLengthAttribute,
				mmBean.getMaxLength());
		defaultAttribute(gen, MMBinary.patternAttribute, mmBean.getPattern());
		defaultAttribute(gen, MMBinary.lengthAttribute, mmBean.getLength());
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
		defaultAttribute(gen, MMUserDefined.namespaceListAttribute,
				mmBean.getNamespaceList());
		defaultAttribute(gen, MMUserDefined.namespaceAttribute,
				mmBean.getNamespace());
		defaultAttribute(gen, MMUserDefined.processContentsAttribute,
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
		defaultAttribute(gen, MMSchemaType.kindAttribute, mmBean.getKind());
		gen.flush();
		return gen;
	}

	protected void implementMMModelEntity(TypeResult gen, MMModelEntity mmBean) {
		defaultAttribute(gen, MMModelEntity.nextVersionsAttribute,
				mmBean.getNextVersions());
		defaultAttribute(gen, MMModelEntity.previousVersionAttribute,
				mmBean.getPreviousVersion());
		defaultAttribute(gen, MMModelEntity.objectIdentifierAttribute,
				mmBean.getObjectIdentifier());
	}

	protected void implementMMTopLevelCatalogueEntry(TypeResult gen,
			MMTopLevelCatalogueEntry mmBean) {
		defaultAttribute(gen,
				MMTopLevelCatalogueEntry.businessProcessCatalogueAttribute,
				mmBean.getBusinessProcessCatalogue());
	}

	protected void implementMMRepositoryConcept(TypeResult gen,
			MMRepositoryConcept mmBean) {
		defaultAttribute(gen, MMRepositoryConcept.semanticMarkupAttribute,
				mmBean.getSemanticMarkup());
		defaultAttribute(gen, MMRepositoryConcept.docletAttribute,
				mmBean.getDoclet());
		defaultAttribute(gen, MMRepositoryConcept.exampleAttribute,
				mmBean.getExample());
		defaultAttribute(gen, MMRepositoryConcept.constraintAttribute,
				mmBean.getConstraint());
		defaultAttribute(gen, MMRepositoryConcept.registrationStatusAttribute,
				mmBean.getRegistrationStatus());
		defaultAttribute(gen, MMRepositoryConcept.removalDateAttribute,
				mmBean.getRemovalDate());
		defaultAttribute(gen, MMRepositoryConcept.nameAttribute,
				mmBean.getName());
		defaultAttribute(gen, MMRepositoryConcept.definitionAttribute,
				mmBean.getDefinition());
	}

	protected void implementMMTopLevelDictionaryEntry(TypeResult gen,
			MMTopLevelDictionaryEntry mmBean) {
		defaultAttribute(gen,
				MMTopLevelDictionaryEntry.dataDictionaryAttribute,
				mmBean.getDataDictionary());
	}

	protected void implementMMRepositoryType(TypeResult gen,
			MMRepositoryType mmBean) {
	}

	protected void implementMMMessageElement(TypeResult gen,
			MMMessageElement mmBean) {
		defaultAttribute(gen, MMMessageElement.businessComponentTraceAttribute,
				mmBean.getBusinessComponentTrace());
		defaultAttribute(gen, MMMessageElement.businessElementTraceAttribute,
				mmBean.getBusinessElementTrace());
		defaultAttribute(gen, MMMessageElement.componentContextAttribute,
				mmBean.getComponentContext());
		defaultAttribute(gen, MMMessageElement.isDerivedAttribute,
				mmBean.isIsDerived());
	}

	protected void implementMMMessageConstruct(TypeResult gen,
			MMMessageConstruct mmBean) {
		defaultAttribute(gen, MMMessageConstruct.xmlTagAttribute,
				mmBean.getXmlTag());
	}

	protected void implementMMConstruct(TypeResult gen, MMConstruct mmBean) {
	}

	protected void implementMMMultiplicityEntity(TypeResult gen,
			MMMultiplicityEntity mmBean) {
		defaultAttribute(gen, MMMultiplicityEntity.maxOccursAttribute,
				mmBean.getMaxOccurs());
		defaultAttribute(gen, MMMultiplicityEntity.minOccursAttribute,
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
		defaultAttribute(gen, MMBusinessElement.derivationAttribute,
				mmBean.getDerivation());
		defaultAttribute(gen, MMBusinessElement.elementContextAttribute,
				mmBean.getElementContext());
		defaultAttribute(gen, MMBusinessElement.isDerivedAttribute,
				mmBean.isIsDerived());
	}

	protected void implementMMMessageComponentType(TypeResult gen,
			MMMessageComponentType mmBean) {
		defaultAttribute(gen,
				MMMessageComponentType.messageBuildingBlockAttribute,
				mmBean.getMessageBuildingBlock());
		defaultAttribute(gen, MMMessageComponentType.traceAttribute,
				mmBean.getTrace());
	}

	protected void implementMMDataType(TypeResult gen, MMDataType mmBean) {
	}

	protected void implementMMMessageElementContainer(JaxbMainTypeResult gen,
			MMMessageElementContainer mmBean) {
		for (MMMessageElement mmChild : mmBean.getMessageElement()) {
			generateMMMessageElement(gen, mmChild);
		}
		defaultAttribute(gen,
				MMMessageElementContainer.messageElementAttribute,
				mmBean.getMessageElement());
	}

	protected void implementMMAbstractDateTimeConcept(TypeResult gen,
			MMAbstractDateTimeConcept mmBean) {
		defaultAttribute(gen, MMAbstractDateTimeConcept.patternAttribute,
				mmBean.getPattern());
		defaultAttribute(gen, MMAbstractDateTimeConcept.minInclusiveAttribute,
				mmBean.getMinInclusive());
		defaultAttribute(gen, MMAbstractDateTimeConcept.minExclusiveAttribute,
				mmBean.getMinExclusive());
		defaultAttribute(gen, MMAbstractDateTimeConcept.maxInclusiveAttribute,
				mmBean.getMaxInclusive());
		defaultAttribute(gen, MMAbstractDateTimeConcept.maxExclusiveAttribute,
				mmBean.getMaxExclusive());
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

	protected GenerationResult generateMMMessageElement(JaxbMainTypeResult gen,
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