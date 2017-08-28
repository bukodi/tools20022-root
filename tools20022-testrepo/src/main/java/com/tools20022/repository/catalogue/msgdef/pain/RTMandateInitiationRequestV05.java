package com.tools20022.repository.catalogue.msgdef.pain;


import com.tools20022.metamodel.MMMessageDefinition;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.catalogue.area.RTPaymentsInitiationLatestVersion;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.repository.dict.msg.RTGroupHeader47;
import com.tools20022.repository.dict.msg.RTMandate10;
import com.tools20022.repository.dict.msg.RTSupplementaryData1;
import java.util.Arrays;/**
 * Scope
The MandateInitiationRequest message is sent by the initiator of the request to his agent. The initiator can either be the debtor or the creditor.
The MandateInitiationRequest message is forwarded by the agent of the initiator to the agent of the counterparty.
The MandateInitiationRequest message is used to setup the instruction that allows the debtor agent to accept instructions from the creditor, through the creditor agent, to debit the account of the debtor.
Usage
The MandateInitiationRequest message can contain one or more request(s) to setup a specific mandate.
The messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.
The message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.
The MandateInitiationRequest message can be used in domestic and cross-border scenarios.
 */
public class RTMandateInitiationRequestV05 extends MMMessageDefinition {

	private final static AtomicReference<RTMandateInitiationRequestV05> repoTypeRef = new AtomicReference<>();
	/**
	 * An instance of MessageDefinitionIdentifier.
	 */
	public final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			super.version = "05";
			super.businessArea = "pain";
			super.flavour = "001";
			super.messageFunctionality = "009";
		}
	};
	/**
	 * Set of characteristics to identify the message and parties playing a role in the mandate initiation, but which are not part of the mandate.
	 */
	public final MMMessageBuildingBlock blockGroupHeader = new MMMessageBuildingBlock() {
		{
			super.complexType_lazy = () -> RTGroupHeader47.repoType();
			super.xmlTag = "GrpHdr";
			super.name = "GroupHeader";
			super.definition = "Set of characteristics to identify the message and parties playing a role in the mandate initiation, but which are not part of the mandate.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Set of elements used to provide the details of the mandate signed between the (ultimate) creditor and the (ultimate) debtor.
	 */
	public final MMMessageBuildingBlock blockMandate = new MMMessageBuildingBlock() {
		{
			super.complexType_lazy = () -> RTMandate10.repoType();
			super.xmlTag = "Mndt";
			super.name = "Mandate";
			super.definition = "Set of elements used to provide the details of the mandate signed between the (ultimate) creditor and the (ultimate) debtor.";
			super.minOccurs = 1;
		}
	};
	/**
	 * Additional information that cannot be captured in the structured elements and/or any other specific block.
	 */
	public final MMMessageBuildingBlock blockSupplementaryData = new MMMessageBuildingBlock() {
		{
			super.complexType_lazy = () -> RTSupplementaryData1.repoType();
			super.xmlTag = "SplmtryData";
			super.name = "SupplementaryData";
			super.definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			super.minOccurs = 0;
		}
	};

	public static RTMandateInitiationRequestV05 repoType() {
		repoTypeRef.compareAndSet(null, new RTMandateInitiationRequestV05());
		return repoTypeRef.get();
	}

	private RTMandateInitiationRequestV05() {
		super.businessArea_lazy = () -> RTPaymentsInitiationLatestVersion
				.repoType();
		super.rootElement = "Document";
		super.xmlTag = "MndtInitnReq";
		super.messageDefinitionIdentifier = identifier;
		super.messageBuildingBlock = Arrays.asList(blockGroupHeader,
				blockMandate, blockSupplementaryData);
		super.name = "MandateInitiationRequestV05";
		super.definition = "Scope\r\nThe MandateInitiationRequest message is sent by the initiator of the request to his agent. The initiator can either be the debtor or the creditor.\r\nThe MandateInitiationRequest message is forwarded by the agent of the initiator to the agent of the counterparty.\r\nThe MandateInitiationRequest message is used to setup the instruction that allows the debtor agent to accept instructions from the creditor, through the creditor agent, to debit the account of the debtor.\r\nUsage\r\nThe MandateInitiationRequest message can contain one or more request(s) to setup a specific mandate.\r\nThe messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.\r\nThe MandateInitiationRequest message can be used in domestic and cross-border scenarios.";
		super.constraint = Arrays.asList();
	} }