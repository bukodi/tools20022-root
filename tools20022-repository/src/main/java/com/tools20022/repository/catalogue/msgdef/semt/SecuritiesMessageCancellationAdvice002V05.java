package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.dict.choice.References53Choice;
import com.tools20022.repository.dict.msg.PartyIdentification109;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount27;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends a SecuritiesMessageCancellationAdvice to an
 * account owner to inform of the cancellation of a securities message
 * previously sent by an account servicer. The account servicer/owner
 * relationship may be: - a central securities depository or another settlement
 * market infrastructure acting on behalf of their participants - an agent
 * (sub-custodian) acting on behalf of their global custodian customer, or - a
 * custodian acting on behalf of an investment management institution or a
 * broker/dealer.
 * 
 * Usage The previously sent message may be: - a securities settlement
 * transaction confirmation - a report (transactions, pending transactions,
 * allegements, accounting and custody securities balance) - a allegement
 * notification (when sent by mistake or because the counterparty cancelled its
 * instruction) - a portfolio transfer notification - an intra-position movement
 * confirmation - a transaction generation notification
 * 
 * The previously sent message cannot be a status advice message (any). If a
 * status advice should not have been sent, a new status advice with the correct
 * status should be sent, not a cancellation advice. The message may also be
 * used to: - re-send a message previously sent, - provide a third party with a
 * copy of a message for information, - re-send to a third party a copy of a
 * message for information using the relevant elements in the Business
 * Application Header.
 */
public class SecuritiesMessageCancellationAdvice002V05 {

	private References53Choice Reference;
	private Optional<PartyIdentification109> AccountOwner;
	private SecuritiesAccount27 SafekeepingAccount;
	private Optional<SupplementaryData1> SupplementaryData;

	public References53Choice getReference() {
		return Reference;
	}

	public void setReference(References53Choice Reference) {
		this.Reference = Reference;
	}

	public Optional<PartyIdentification109> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification109> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount27 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount27 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}