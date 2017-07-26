package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesMessageCancellationAdviceV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesMessageCancellationAdviceV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.References18Choice;
import com.tools20022.repository.dict.choice.PartyIdentification36Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope This version is identical to the previous version. It was created
 * automatically during the 2011/2012 maintenance cycle, at the same time as new
 * versions of other Settlement and Reconciliation messages that were truly
 * impacted by change requests. This should not have been the case. In future
 * releases, SWIFT will ensure that a new version of a message is not created if
 * identical to the previous version. An account servicer sends a
 * SecuritiesMessageCancellationAdvice to an account owner to inform of the
 * cancellation of a securities message previously sent by an account servicer.
 * The account servicer/owner relationship may be: - a central securities
 * depository or another settlement market infrastructure acting on behalf of
 * their participants - an agent (sub-custodian) acting on behalf of their
 * global custodian customer, or - a custodian acting on behalf of an investment
 * management institution or a broker/dealer. Usage The previously sent message
 * may be: - a securities settlement transaction confirmation - a report
 * (transactions, pending transactions, allegements, accounting and custody
 * securities balance) - an allegement notification (when sent by mistake or
 * because the counterparty cancelled its instruction) - a portfolio transfer
 * notification - an intra-position movement confirmation - a transaction
 * generation notification The previously sent message cannot be a status advice
 * message (any). If a status advice should not have been sent, a new status
 * advice with the correct status should be sent, not a cancellation advice. The
 * message may also be used to: - re-send a message previously sent, - provide a
 * third party with a copy of a message for information, - re-send to a third
 * party a copy of a message for information. using the relevant elements in the
 * Business Application Header. ISO 15022 - 20022 Coexistence This ISO 20022
 * message is reversed engineered from ISO 15022. Both standards will coexist
 * for a certain number of years. Until this coexistence period ends, the usage
 * of certain data types is restricted to ensure interoperability between ISO
 * 15022 and 20022 users. Compliance to these rules is mandatory in a
 * coexistence environment. The coexistence restrictions are described in a
 * Textual Rule linked to the Message Items they concern. These coexistence
 * textual rules are clearly identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(SecuritiesMessageCancellationAdviceV02.class)
@NextVersion(SecuritiesMessageCancellationAdviceV04.class)
public class SecuritiesMessageCancellationAdviceV03 {

	private References18Choice Reference;
	private Optional<PartyIdentification36Choice> AccountOwner;
	private SecuritiesAccount13 SafekeepingAccount;
	private Optional<SupplementaryData1> SupplementaryData;

	public References18Choice getReference() {
		return Reference;
	}

	public void setReference(References18Choice Reference) {
		this.Reference = Reference;
	}

	public Optional<PartyIdentification36Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification36Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount13 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount13 SafekeepingAccount) {
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