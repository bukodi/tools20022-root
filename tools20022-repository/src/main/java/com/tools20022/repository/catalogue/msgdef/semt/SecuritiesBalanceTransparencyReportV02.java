package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.PartyIdentification100;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement59;
import com.tools20022.repository.dict.msg.SafekeepingAccount7;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The SecuritiesBalanceTransparencyReport message is sent by an account
 * servicer, such as a custodian, central securities depository or international
 * central securities depository, to the account owner to provide holdings
 * information for the accounts that it services, to disclose underlying details
 * of holdings on an omnibus account that the sender owns or operates at the
 * receiver. The receiver may also be a custodian, central securities
 * depository, international central securities depository, and the ultimate
 * receiver may be a registrar, transfer agent, fund company, official agent of
 * the reported instrument(s) and/or other parties. The
 * SecuritiesBalanceTransparencyReport message provides transparency of holdings
 * through layers of custody chains in a consolidated statement, to allow for an
 * efficient gathering of investor data, which, in turn, may be used to measure
 * marketing effectiveness, validation of compliance with prospectuses and
 * regulatory requirements, and the calculation of trailer fees and other
 * retrocessions. Usage The SecuritiesBalanceTransparencyReport message is used
 * to provide aggregated holdings information and a breakdown of holdings
 * information. A sender of the SecuritiesBalanceTransparencyReport message will
 * identify its own safekeeping account (for example, an omnibus account in the
 * ledger of the receiver) and holdings information at the level of account(s)
 * for which the sender is the account servicer (that is, in the ledger of the
 * sender). When relevant, the sender will aggregate its holdings information
 * with holdings information of one or more sub levels and sub-sub levels of
 * accounts, that is, with holdings information the sender has received from the
 * owner(s) of the account(s) for which the sender is the account servicer. A
 * sender of the SecuritiesBalanceTransparencyReport message may also use it to
 * send statements to its account owning customers, and these can be enrichments
 * of statements that the respective account owners have previously provided to
 * the sender. Ultimately, the statement reaches the relevant fund company, for
 * example, the transfer agent, that may use it for obtaining information about
 * the custodians, distributors and commercial agreement references associated
 * with holdings on an omnibus account at the ultimate place of safekeeping, for
 * example, a central securities depository (CSD) or a register of shareholders.
 * When the message is sent by the owner of the account specified in
 * SafekeepingAccountAndHoldings/AccountIdentification, the message will
 * disclose holding details of the underlying owner(s) of the sender’s holdings
 * with the receiver. This direction is commonly referred to as ‘downstream’.
 * When the sender is the account servicer of an account owned by the receiver,
 * for example, the account in AccountSubLevel1/AccountIdentification or
 * AccountSubLevel2/AccountIdentification, the message is providing a statement
 * of the receiver’s holdings with sender. This direction is commonly referred
 * to as ‘upstream’, and the safekeeping account should identify the ultimate
 * place of safekeeping (for example, an account in a transfer agent's register
 * of shareholders).
 */
public class SecuritiesBalanceTransparencyReportV02 {

	private MessageIdentification1 MessageIdentification;
	private PartyIdentification100 SenderIdentification;
	private Optional<PartyIdentification100> ReceiverIdentification;
	private Pagination Pagination;
	private Statement59 StatementGeneralDetails;
	private Optional<SafekeepingAccount7> SafekeepingAccountAndHoldings;
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

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement59 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement59 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public Optional<SafekeepingAccount7> getSafekeepingAccountAndHoldings() {
		return SafekeepingAccountAndHoldings;
	}

	public void setSafekeepingAccountAndHoldings(
			Optional<SafekeepingAccount7> SafekeepingAccountAndHoldings) {
		this.SafekeepingAccountAndHoldings = SafekeepingAccountAndHoldings;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}