package test.repository.catalogue.msgdef.pain;

import com.tools20022.metamodel.MMMessageDefinition;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.catalogue.area.RTPaymentsInitiationLatestVersion;
import java.util.Arrays;

public class RTMandateInitiationRequestV05 extends MMMessageDefinition {

	private final static AtomicReference<RTMandateInitiationRequestV05> repoTypeRef = new AtomicReference<>();

	public static RTMandateInitiationRequestV05 repoType() {
		repoTypeRef.compareAndSet(null, new RTMandateInitiationRequestV05());
		return repoTypeRef.get();
	}

	private RTMandateInitiationRequestV05() {
		super.businessArea_lazy = () -> RTPaymentsInitiationLatestVersion
				.repoType();
		super.xmlTag = "MndtInitnReq";
		super.rootElement = "Document";
		super.messageBuildingBlock = Arrays.asList();
		super.constraint = Arrays.asList();
		super.name = "MandateInitiationRequestV05";
		super.definition = "Scope\r\nThe MandateInitiationRequest message is sent by the initiator of the request to his agent. The initiator can either be the debtor or the creditor.\r\nThe MandateInitiationRequest message is forwarded by the agent of the initiator to the agent of the counterparty.\r\nThe MandateInitiationRequest message is used to setup the instruction that allows the debtor agent to accept instructions from the creditor, through the creditor agent, to debit the account of the debtor.\r\nUsage\r\nThe MandateInitiationRequest message can contain one or more request(s) to setup a specific mandate.\r\nThe messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.\r\nThe MandateInitiationRequest message can be used in domestic and cross-border scenarios.";
	}
}