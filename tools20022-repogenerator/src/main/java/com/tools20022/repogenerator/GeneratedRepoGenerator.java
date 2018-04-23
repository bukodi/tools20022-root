package com.tools20022.repogenerator;

import com.tools20022.generators.GenerationContext;
import com.tools20022.metamodel.*;
import com.tools20022.repogenerator.BaseRepoGenerator;
import com.tools20022.repogenerator.resulttypes.*;

public abstract class GeneratedRepoGenerator extends BaseRepoGenerator {

	protected GeneratedRepoGenerator(
			GenerationContext<RawRepository, MMModelEntity> ctx) {
		super(ctx);
	}

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
			MMMessagingEndpoint mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMMessagingEndpoint.sentMessageAttribute,
				mmBean.getSentMessage());
		defaultAttribute(gen, MMMessagingEndpoint.transportSystemAttribute,
				mmBean.getTransportSystem());
		defaultAttribute(gen, MMMessagingEndpoint.receivedMessageAttribute,
				mmBean.getReceivedMessage());
		defaultAttribute(gen, MMMessagingEndpoint.locationAttribute,
				mmBean.getLocation());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessageTransportSystem(
			MMMessageTransportSystem mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
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
			MMSyntaxMessageScheme mmBean) {
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

	protected MainTypeResult generateMMSemanticMarkup(MMSemanticMarkup mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMSemanticMarkup.elementsAttribute,
				mmBean.getElements());
		defaultAttribute(gen, MMSemanticMarkup.typeAttribute, mmBean.getType());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMSemanticMarkupElement(
			MMSemanticMarkupElement mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMSemanticMarkupElement.nameAttribute,
				mmBean.getName());
		defaultAttribute(gen, MMSemanticMarkupElement.valueAttribute,
				mmBean.getValue());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMDoclet(MMDoclet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMDoclet.typeAttribute, mmBean.getType());
		defaultAttribute(gen, MMDoclet.contentAttribute, mmBean.getContent());
		gen.flush();
		return gen;
	}

	protected StaticFieldResult generateMMConstraint(
			MainTypeResult containerGen, MMConstraint mmBean) {
		StaticFieldResult gen = defaultStaticFieldResult(mmBean, containerGen);
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
		defaultAttribute(gen, MMDataDictionary.repositoryAttribute,
				mmBean.getRepository());
		defaultAttribute(gen,
				MMDataDictionary.topLevelDictionaryEntryAttribute,
				mmBean.getTopLevelDictionaryEntry());
		gen.flush();
		return gen;
	}

	protected JaxbMainTypeResult generateMMMessageDefinition(
			MMMessageDefinition mmBean) {
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

	protected MainTypeResult generateMMMessageSet(MMMessageSet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMMessageSet.messageDefinitionAttribute,
				mmBean.getMessageDefinition());
		defaultAttribute(gen, MMMessageSet.validEncodingAttribute,
				mmBean.getValidEncoding());
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

	protected MainTypeResult generateMMBusinessArea(MMBusinessArea mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
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
			MMBusinessComponent mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMBusinessConcept(gen, mmBean);
		defaultAttribute(gen, MMBusinessComponent.elementAttribute,
				mmBean.getElement());
		defaultAttribute(gen, MMBusinessComponent.subTypeAttribute,
				mmBean.getSubType());
		defaultAttribute(gen, MMBusinessComponent.superTypeAttribute,
				mmBean.getSuperType());
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
			MMMessageComponent mmBean) {
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
			MMMessageChoreography mmBean) {
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
			MMBusinessTransaction mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
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

	protected MainTypeResult generateMMBusinessProcess(MMBusinessProcess mmBean) {
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

	protected MainTypeResult generateMMParticipant(MMParticipant mmBean) {
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

	protected MainTypeResult generateMMReceive(MMReceive mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMReceive.receiverAttribute, mmBean.getReceiver());
		defaultAttribute(gen, MMReceive.messageTransmissionAttribute,
				mmBean.getMessageTransmission());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessageTransmission(
			MMMessageTransmission mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
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

	protected MainTypeResult generateMMSend(MMSend mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMSend.senderAttribute, mmBean.getSender());
		defaultAttribute(gen, MMSend.messageTransmissionAttribute,
				mmBean.getMessageTransmission());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMMessageTransportMode(
			MMMessageTransportMode mmBean) {
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

	protected DataTypeResult generateMMText(MMText mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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

	protected DataTypeResult generateMMString(MMString mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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

	protected DataTypeResult generateMMIdentifierSet(MMIdentifierSet mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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

	protected DataTypeResult generateMMIndicator(MMIndicator mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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

	protected DataTypeResult generateMMBoolean(MMBoolean mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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

	protected DataTypeResult generateMMRate(MMRate mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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
		defaultAttribute(gen, MMRate.patternAttribute, mmBean.getPattern());
		gen.flush();
		return gen;
	}

	protected DataTypeResult generateMMDecimal(MMDecimal mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
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
		defaultAttribute(gen, MMDecimal.patternAttribute, mmBean.getPattern());
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMExternalSchema(MMExternalSchema mmBean) {
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

	protected DataTypeResult generateMMQuantity(MMQuantity mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMQuantity.unitCodeAttribute,
				mmBean.getUnitCode());
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
		defaultAttribute(gen, MMQuantity.patternAttribute, mmBean.getPattern());
		gen.flush();
		return gen;
	}

	protected EnumConstantResult generateMMCode(EnumTypeResult containerGen,
			MMCode mmBean) {
		EnumConstantResult gen = defaultEnumConstant(mmBean, containerGen);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMCode.ownerAttribute, mmBean.getOwner());
		defaultAttribute(gen, MMCode.codeNameAttribute, mmBean.getCodeName());
		gen.flush();
		return gen;
	}

	protected EnumTypeResult generateMMCodeSet(MMCodeSet mmBean) {
		EnumTypeResult gen = defaultEnumType(mmBean);
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

	protected DataTypeResult generateMMAmount(MMAmount mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
		implementMMDataType(gen, mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMLogicalType(gen, mmBean);
		defaultAttribute(gen, MMAmount.currencyIdentifierSetAttribute,
				mmBean.getCurrencyIdentifierSet());
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
		defaultAttribute(gen, MMAmount.patternAttribute, mmBean.getPattern());
		gen.flush();
		return gen;
	}

	protected JaxbMainTypeResult generateMMChoiceComponent(
			MMChoiceComponent mmBean) {
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
			MMEndPointCategory mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMEndPointCategory.endPointsAttribute,
				mmBean.getEndPoints());
		gen.flush();
		return gen;
	}

	protected DataTypeResult generateMMBinary(MMBinary mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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

	protected DataTypeResult generateMMDate(MMDate mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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

	protected DataTypeResult generateMMDateTime(MMDateTime mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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

	protected DataTypeResult generateMMDay(MMDay mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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

	protected DataTypeResult generateMMDuration(MMDuration mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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

	protected DataTypeResult generateMMMonth(MMMonth mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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

	protected DataTypeResult generateMMMonthDay(MMMonthDay mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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

	protected DataTypeResult generateMMTime(MMTime mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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

	protected DataTypeResult generateMMYear(MMYear mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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

	protected DataTypeResult generateMMYearMonth(MMYearMonth mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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

	protected MainTypeResult generateMMUserDefined(MMUserDefined mmBean) {
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
			MMIndustryMessageSet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMConvergenceDocumentation(
			MMConvergenceDocumentation mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected MainTypeResult generateMMISO15022MessageSet(
			MMISO15022MessageSet mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		implementMMTopLevelCatalogueEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		gen.flush();
		return gen;
	}

	protected DataTypeResult generateMMSchemaType(MMSchemaType mmBean) {
		DataTypeResult gen = defaultDataType(mmBean);
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
		defaultAttribute(gen, MMBusinessElement.isDerivedAttribute,
				mmBean.isIsDerived());
		defaultAttribute(gen, MMBusinessElement.elementContextAttribute,
				mmBean.getElementContext());
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
		defaultAttribute(gen, MMAbstractDateTimeConcept.minInclusiveAttribute,
				mmBean.getMinInclusive());
		defaultAttribute(gen, MMAbstractDateTimeConcept.minExclusiveAttribute,
				mmBean.getMinExclusive());
		defaultAttribute(gen, MMAbstractDateTimeConcept.maxInclusiveAttribute,
				mmBean.getMaxInclusive());
		defaultAttribute(gen, MMAbstractDateTimeConcept.maxExclusiveAttribute,
				mmBean.getMaxExclusive());
		defaultAttribute(gen, MMAbstractDateTimeConcept.patternAttribute,
				mmBean.getPattern());
	}

	protected MainTypeResult generateMMTopLevelCatalogueEntry(
			StaticFieldResult gen, MMTopLevelCatalogueEntry mmBean) {
		throw new RuntimeException("Empty switch: " + mmBean.getClass());
	}

	protected MainTypeResult generateMMTopLevelDictionaryEntry(
			StaticFieldResult gen, MMTopLevelDictionaryEntry mmBean) {
		throw new RuntimeException("Empty switch: " + mmBean.getClass());
	}

	protected PropertyResult generateMMBusinessElement(MainTypeResult gen,
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

	protected JaxbPropertyResult generateMMMessageElement(
			JaxbMainTypeResult gen, MMMessageElement mmBean) {
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

	protected MainTypeResult generateMainResultType(MMModelEntity mmBean) {
		if (MMAddress.class.equals(mmBean.getClass())) {
			return generateMMAddress((MMAddress) mmBean);
		} else if (MMBroadcastList.class.equals(mmBean.getClass())) {
			return generateMMBroadcastList((MMBroadcastList) mmBean);
		} else if (MMMessagingEndpoint.class.equals(mmBean.getClass())) {
			return generateMMMessagingEndpoint((MMMessagingEndpoint) mmBean);
		} else if (MMMessageTransportSystem.class.equals(mmBean.getClass())) {
			return generateMMMessageTransportSystem((MMMessageTransportSystem) mmBean);
		} else if (MMTransportMessage.class.equals(mmBean.getClass())) {
			return generateMMTransportMessage((MMTransportMessage) mmBean);
		} else if (MMMessageInstance.class.equals(mmBean.getClass())) {
			return generateMMMessageInstance((MMMessageInstance) mmBean);
		} else if (MMSyntaxMessageScheme.class.equals(mmBean.getClass())) {
			return generateMMSyntaxMessageScheme((MMSyntaxMessageScheme) mmBean);
		} else if (MMSemanticMarkup.class.equals(mmBean.getClass())) {
			return generateMMSemanticMarkup((MMSemanticMarkup) mmBean);
		} else if (MMSemanticMarkupElement.class.equals(mmBean.getClass())) {
			return generateMMSemanticMarkupElement((MMSemanticMarkupElement) mmBean);
		} else if (MMDoclet.class.equals(mmBean.getClass())) {
			return generateMMDoclet((MMDoclet) mmBean);
		} else if (MMRepository.class.equals(mmBean.getClass())) {
			return generateMMRepository((MMRepository) mmBean);
		} else if (MMMessageDefinition.class.equals(mmBean.getClass())) {
			return generateMMMessageDefinition((MMMessageDefinition) mmBean);
		} else if (MMMessageSet.class.equals(mmBean.getClass())) {
			return generateMMMessageSet((MMMessageSet) mmBean);
		} else if (MMSyntax.class.equals(mmBean.getClass())) {
			return generateMMSyntax((MMSyntax) mmBean);
		} else if (MMEncoding.class.equals(mmBean.getClass())) {
			return generateMMEncoding((MMEncoding) mmBean);
		} else if (MMBusinessArea.class.equals(mmBean.getClass())) {
			return generateMMBusinessArea((MMBusinessArea) mmBean);
		} else if (MMBusinessComponent.class.equals(mmBean.getClass())) {
			return generateMMBusinessComponent((MMBusinessComponent) mmBean);
		} else if (MMMessageComponent.class.equals(mmBean.getClass())) {
			return generateMMMessageComponent((MMMessageComponent) mmBean);
		} else if (MMMessageChoreography.class.equals(mmBean.getClass())) {
			return generateMMMessageChoreography((MMMessageChoreography) mmBean);
		} else if (MMBusinessTransaction.class.equals(mmBean.getClass())) {
			return generateMMBusinessTransaction((MMBusinessTransaction) mmBean);
		} else if (MMBusinessProcess.class.equals(mmBean.getClass())) {
			return generateMMBusinessProcess((MMBusinessProcess) mmBean);
		} else if (MMParticipant.class.equals(mmBean.getClass())) {
			return generateMMParticipant((MMParticipant) mmBean);
		} else if (MMReceive.class.equals(mmBean.getClass())) {
			return generateMMReceive((MMReceive) mmBean);
		} else if (MMMessageTransmission.class.equals(mmBean.getClass())) {
			return generateMMMessageTransmission((MMMessageTransmission) mmBean);
		} else if (MMSend.class.equals(mmBean.getClass())) {
			return generateMMSend((MMSend) mmBean);
		} else if (MMMessageTransportMode.class.equals(mmBean.getClass())) {
			return generateMMMessageTransportMode((MMMessageTransportMode) mmBean);
		} else if (MMConversation.class.equals(mmBean.getClass())) {
			return generateMMConversation((MMConversation) mmBean);
		} else if (MMText.class.equals(mmBean.getClass())) {
			return generateMMText((MMText) mmBean);
		} else if (MMString.class.equals(mmBean.getClass())) {
			return generateMMString((MMString) mmBean);
		} else if (MMIdentifierSet.class.equals(mmBean.getClass())) {
			return generateMMIdentifierSet((MMIdentifierSet) mmBean);
		} else if (MMIndicator.class.equals(mmBean.getClass())) {
			return generateMMIndicator((MMIndicator) mmBean);
		} else if (MMBoolean.class.equals(mmBean.getClass())) {
			return generateMMBoolean((MMBoolean) mmBean);
		} else if (MMRate.class.equals(mmBean.getClass())) {
			return generateMMRate((MMRate) mmBean);
		} else if (MMDecimal.class.equals(mmBean.getClass())) {
			return generateMMDecimal((MMDecimal) mmBean);
		} else if (MMExternalSchema.class.equals(mmBean.getClass())) {
			return generateMMExternalSchema((MMExternalSchema) mmBean);
		} else if (MMQuantity.class.equals(mmBean.getClass())) {
			return generateMMQuantity((MMQuantity) mmBean);
		} else if (MMCodeSet.class.equals(mmBean.getClass())) {
			return generateMMCodeSet((MMCodeSet) mmBean);
		} else if (MMAmount.class.equals(mmBean.getClass())) {
			return generateMMAmount((MMAmount) mmBean);
		} else if (MMChoiceComponent.class.equals(mmBean.getClass())) {
			return generateMMChoiceComponent((MMChoiceComponent) mmBean);
		} else if (MMEndPointCategory.class.equals(mmBean.getClass())) {
			return generateMMEndPointCategory((MMEndPointCategory) mmBean);
		} else if (MMBinary.class.equals(mmBean.getClass())) {
			return generateMMBinary((MMBinary) mmBean);
		} else if (MMDate.class.equals(mmBean.getClass())) {
			return generateMMDate((MMDate) mmBean);
		} else if (MMDateTime.class.equals(mmBean.getClass())) {
			return generateMMDateTime((MMDateTime) mmBean);
		} else if (MMDay.class.equals(mmBean.getClass())) {
			return generateMMDay((MMDay) mmBean);
		} else if (MMDuration.class.equals(mmBean.getClass())) {
			return generateMMDuration((MMDuration) mmBean);
		} else if (MMMonth.class.equals(mmBean.getClass())) {
			return generateMMMonth((MMMonth) mmBean);
		} else if (MMMonthDay.class.equals(mmBean.getClass())) {
			return generateMMMonthDay((MMMonthDay) mmBean);
		} else if (MMTime.class.equals(mmBean.getClass())) {
			return generateMMTime((MMTime) mmBean);
		} else if (MMYear.class.equals(mmBean.getClass())) {
			return generateMMYear((MMYear) mmBean);
		} else if (MMYearMonth.class.equals(mmBean.getClass())) {
			return generateMMYearMonth((MMYearMonth) mmBean);
		} else if (MMUserDefined.class.equals(mmBean.getClass())) {
			return generateMMUserDefined((MMUserDefined) mmBean);
		} else if (MMIndustryMessageSet.class.equals(mmBean.getClass())) {
			return generateMMIndustryMessageSet((MMIndustryMessageSet) mmBean);
		} else if (MMConvergenceDocumentation.class.equals(mmBean.getClass())) {
			return generateMMConvergenceDocumentation((MMConvergenceDocumentation) mmBean);
		} else if (MMISO15022MessageSet.class.equals(mmBean.getClass())) {
			return generateMMISO15022MessageSet((MMISO15022MessageSet) mmBean);
		} else if (MMSchemaType.class.equals(mmBean.getClass())) {
			return generateMMSchemaType((MMSchemaType) mmBean);
		} else {
			throw new IllegalArgumentException("Invalid type hierarchy: "
					+ mmBean.getClass());
		}
	}
}