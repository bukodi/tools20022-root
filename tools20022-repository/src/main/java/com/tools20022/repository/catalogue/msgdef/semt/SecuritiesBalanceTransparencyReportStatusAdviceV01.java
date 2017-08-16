package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.PartyIdentification100;
import java.util.Optional;
import com.tools20022.repository.dict.msg.StatementReference1;
import com.tools20022.repository.dict.choice.ReportItemStatus1Choice;
import com.tools20022.repository.dict.msg.NumberOfItemsPerStatus1;
import java.util.List;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * SCOPE
 * 
 * An account owner, such as a custodian, central securities depository,
 * international securities depository or transfer agent, sends the
 * SecuritiesBalanceTransparencyReportStatusAdvice message in response to a
 * SecuritiesBalanceTransparencyReport, to accept or reject the statement of
 * holdings as sent in a SecuritiesBalanceTransparencyReport.
 * 
 * USAGE The SecuritiesBalanceTransparencyReportStatusAdvice is used to accept
 * (Accepted), partially accept (Accepted With Exception) or reject (Rejected) a
 * previously received SecuritiesBalanceTransparencyReport.
 */
public class SecuritiesBalanceTransparencyReportStatusAdviceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private PartyIdentification100 SenderIdentification;
	private Optional<PartyIdentification100> ReceiverIdentification;
	private StatementReference1 RelatedStatement;
	private ReportItemStatus1Choice Status;
	private List<NumberOfItemsPerStatus1> NumberOfItemsPerStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public PartyIdentification100 getSenderIdentification() {
		return SenderIdentification;
	}

	public void setSenderIdentification(
			PartyIdentification100 SenderIdentification) {
		this.SenderIdentification = SenderIdentification;
	}

	public Optional<PartyIdentification100> getReceiverIdentification() {
		return ReceiverIdentification;
	}

	public void setReceiverIdentification(
			Optional<PartyIdentification100> ReceiverIdentification) {
		this.ReceiverIdentification = ReceiverIdentification;
	}

	public StatementReference1 getRelatedStatement() {
		return RelatedStatement;
	}

	public void setRelatedStatement(StatementReference1 RelatedStatement) {
		this.RelatedStatement = RelatedStatement;
	}

	public ReportItemStatus1Choice getStatus() {
		return Status;
	}

	public void setStatus(ReportItemStatus1Choice Status) {
		this.Status = Status;
	}

	public List<NumberOfItemsPerStatus1> getNumberOfItemsPerStatus() {
		return NumberOfItemsPerStatus;
	}

	public void setNumberOfItemsPerStatus(
			List<NumberOfItemsPerStatus1> NumberOfItemsPerStatus) {
		this.NumberOfItemsPerStatus = NumberOfItemsPerStatus;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}