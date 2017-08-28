package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.msg.RTGroupHeader47;
import com.tools20022.repository.dict.datatype.RTISODateTime;
import com.tools20022.repository.dict.choice.RTAuthorisation1Choice;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.msg.RTPartyIdentification43;
import com.tools20022.repository.dict.msg.RTBranchAndFinancialInstitutionIdentification5;
import java.util.Arrays;
import com.tools20022.repository.catalogue.msgdef.pain.RTMandateInitiationRequestV05;
import com.tools20022.repository.GeneratedRepository;/**
 * Set of characteristics shared by all individual transactions included in the message.
 */
public class RTGroupHeader47 extends MMMessageComponent {

	private final static AtomicReference<RTGroupHeader47> repoTypeRef = new AtomicReference<>();
	/**
	 * Point to point reference, as assigned by the instructing party, and sent to the instructed party, to unambiguously identify the message.
	Usage: The instructing party has to make sure that MessageIdentification is unique per instructed party for a pre-agreed period.
	 */
	public final MMMessageAttribute attrMessageIdentification = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTGroupHeader47.repoType();
			super.xmlTag = "MsgId";
			super.name = "MessageIdentification";
			super.definition = "Point to point reference, as assigned by the instructing party, and sent to the instructed party, to unambiguously identify the message.\nUsage: The instructing party has to make sure that MessageIdentification is unique per instructed party for a pre-agreed period.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Date and time at which the message was created.
	 */
	public final MMMessageAttribute attrCreationDateTime = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTISODateTime.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTGroupHeader47.repoType();
			super.xmlTag = "CreDtTm";
			super.name = "CreationDateTime";
			super.definition = "Date and time at which the message was created.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * User identification or any user key to be used to check the authority of the initiating party.

	Usage: The content is not of a technical nature, but reflects the organisational structure at the initiating side. The authorisation element can typically be used in relay scenarios, payment initiations, payment returns or payment reversals that are initiated on behalf of a party different from the initiating party.
	 */
	public final MMMessageAttribute attrAuthorisation = new MMMessageAttribute() {
		{
			super.complexType_lazy = () -> RTAuthorisation1Choice.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTGroupHeader47.repoType();
			super.xmlTag = "Authstn";
			super.name = "Authorisation";
			super.definition = "User identification or any user key to be used to check the authority of the initiating party.\n\nUsage: The content is not of a technical nature, but reflects the organisational structure at the initiating side. The authorisation element can typically be used in relay scenarios, payment initiations, payment returns or payment reversals that are initiated on behalf of a party different from the initiating party.";
			super.maxOccurs = 2;
			super.minOccurs = 0;
		}
	};
	/**
	 * Party that initiates the mandate message.
	 */
	public final MMMessageAssociationEnd refInitiatingParty = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTPartyIdentification43.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTGroupHeader47.repoType();
			super.xmlTag = "InitgPty";
			super.name = "InitiatingParty";
			super.definition = "Party that initiates the mandate message.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Agent that instructs the next party in the chain to carry out an instruction.

	Usage Rule:
	In case of amendment and cancellation request messages, the instructing agent is the party sending the amendment and cancellation request message and not the party that sent the original mandate initiation request message.
	In case of acceptance report message, the instructing agent is the party sending the acceptance report message and not the party that sent the original mandate request message.
	 */
	public final MMMessageAssociationEnd refInstructingAgent = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTBranchAndFinancialInstitutionIdentification5
					.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTGroupHeader47.repoType();
			super.xmlTag = "InstgAgt";
			super.name = "InstructingAgent";
			super.definition = "Agent that instructs the next party in the chain to carry out an instruction.\n\nUsage Rule:\nIn case of amendment and cancellation request messages, the instructing agent is the party sending the amendment and cancellation request message and not the party that sent the original mandate initiation request message.\nIn case of acceptance report message, the instructing agent is the party sending the acceptance report message and not the party that sent the original mandate request message.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Agent that is instructed by the previous party in the chain to carry out an instruction.

	Usage Rule:
	In case of amendment and cancellation request messages, the instructed agent is the party receiving the amendment and cancellation request message and not the party that received the original mandate initiation request message.
	In case of acceptance report message, the instructed agent is the party receiving the acceptance report message and not the party that received the original mandate request message.
	 */
	public final MMMessageAssociationEnd refInstructedAgent = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTBranchAndFinancialInstitutionIdentification5
					.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTGroupHeader47.repoType();
			super.xmlTag = "InstdAgt";
			super.name = "InstructedAgent";
			super.definition = "Agent that is instructed by the previous party in the chain to carry out an instruction.\n\nUsage Rule:\nIn case of amendment and cancellation request messages, the instructed agent is the party receiving the amendment and cancellation request message and not the party that received the original mandate initiation request message.\nIn case of acceptance report message, the instructed agent is the party receiving the acceptance report message and not the party that received the original mandate request message.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTGroupHeader47 repoType() {
		repoTypeRef.compareAndSet(null, new RTGroupHeader47());
		return repoTypeRef.get();
	}

	private RTGroupHeader47() {
		super.messageElement = Arrays.asList(attrMessageIdentification,
				attrCreationDateTime, attrAuthorisation, refInitiatingParty,
				refInstructingAgent, refInstructedAgent);
		super.messageBuildingBlock_lazy = () -> Arrays
				.asList(RTMandateInitiationRequestV05.repoType().blockGroupHeader);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "GroupHeader47";
		super.definition = "Set of characteristics shared by all individual transactions included in the message.";
	} }