package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountManagementStatusReportV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountManagementStatusReportV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference6;
import java.util.List;
import com.tools20022.repository.dict.msg.AccountManagementStatusAndReason4;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An account servicer, for example, a registrar, transfer agent,
 * custodian bank or securities depository sends the
 * AccountManagementStatusReport message to the account owner or its designated
 * agent, for example, an investor to report on the receipt or the processing
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
@PreviousVersion(AccountManagementStatusReportV04.class)
@NextVersion(AccountManagementStatusReportV06.class)
public class AccountManagementStatusReportV05 {

	private MessageIdentification1 MessageIdentification;
	private List<AdditionalReference6> RelatedReference;
	private AccountManagementStatusAndReason4 StatusReport;
	private Optional<MarketPracticeVersion1> MarketPracticeVersion;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public List<AdditionalReference6> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(List<AdditionalReference6> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public AccountManagementStatusAndReason4 getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(AccountManagementStatusAndReason4 StatusReport) {
		this.StatusReport = StatusReport;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return MarketPracticeVersion;
	}

	public void setMarketPracticeVersion(
			Optional<MarketPracticeVersion1> MarketPracticeVersion) {
		this.MarketPracticeVersion = MarketPracticeVersion;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}