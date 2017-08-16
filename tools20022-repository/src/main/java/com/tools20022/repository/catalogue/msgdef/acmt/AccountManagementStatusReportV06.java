package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountManagementStatusReportV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference6;
import java.util.List;
import com.tools20022.repository.dict.msg.AccountManagementStatusAndReason5;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The AccountManagementStatusReport message is sent by an account
 * servicer, for example, a registrar, transfer agent, custodian bank or
 * securities depository to the account owner or its designated agent, for
 * example, an investor to report on the receipt or the processing status of a
 * previously received account management message. Usage The
 * AccountManagementStatusReport message is used to provide the status of a
 * previously received AccountOpeningInstruction, an
 * AccountModificationInstruction or a GetAccountDetails message. It may also be
 * used to report the status of the account. The AccountManagementStatusReport
 * message is also used to reject an AccountOpeningInstruction,
 * AccountModificationInstruction or GetAccountDetails message when the message
 * is not compliant with the agreed SLA or when the account cannot be uniquely
 * identified.
 */
@PreviousVersion(AccountManagementStatusReportV05.class)
public class AccountManagementStatusReportV06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private List<AdditionalReference6> RelatedReference;
	private AccountManagementStatusAndReason5 StatusReport;
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

	public AccountManagementStatusAndReason5 getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(AccountManagementStatusAndReason5 StatusReport) {
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