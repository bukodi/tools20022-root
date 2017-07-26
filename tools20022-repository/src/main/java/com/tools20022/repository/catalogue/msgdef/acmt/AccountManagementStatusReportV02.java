package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountManagementStatusReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.List;
import com.tools20022.repository.dict.msg.AccountManagementStatusAndReason1;

/**
 * Scope An account servicer, eg, a registrar, transfer agent or custodian bank
 * sends the AccountManagementStatusReport message to an account owner or its
 * designated agent, eg, an investor to report on the receipt or the processing
 * status of a previously received AccountOpeningInstruction or
 * AccountModificationInstruction or GetAccountDetails message. Usage The
 * AccountManagementStatusReport message is used to provide the processing
 * status of a previously received AccountOpeningInstruction or of an
 * AccountModificationInstruction message. The AccountManagementStatusReport
 * message is also used by an account servicer to reject an
 * AccountOpeningInstruction or AccountModificationInstruction or
 * GetAccountDetails message when the message is not compliant with the agreed
 * SLA or when the account cannot be uniquely identified. The account owner may
 * report that the status of the instruction is either rejected, accepted, that
 * the instruction is being processed or that the instruction has been forwarded
 * to the next intermediary party for further processing.
 */
@NextVersion(AccountManagementStatusReportV03.class)
public class AccountManagementStatusReportV02 {

	private MessageIdentification1 MessageIdentification;
	private List<AdditionalReference3> RelatedReference;
	private AccountManagementStatusAndReason1 StatusReport;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public List<AdditionalReference3> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(List<AdditionalReference3> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public AccountManagementStatusAndReason1 getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(AccountManagementStatusAndReason1 StatusReport) {
		this.StatusReport = StatusReport;
	}
}