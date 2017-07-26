package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementConditionModificationStatusAdviceV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.Identification1;
import com.tools20022.repository.dict.choice.PartyIdentification13Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.msg.RequestDetails1;
import com.tools20022.repository.dict.choice.ProcessingStatus5Choice;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope An account servicer sends a
 * SecuritiesSettlementConditionsModificationStatusAdvice to an account owner to
 * advise the status of a modification request previously instructed by the
 * account owner.
 * 
 * The account servicer/owner relationship may be: - a central securities
 * depository or another settlement market infrastructure acting on behalf of
 * their participants - an agent (sub-custodian) acting on behalf of their
 * global custodian customer, or - a custodian acting on behalf of an investment
 * management institution or a broker/dealer.
 * 
 * Usage A SecuritiesSettlementConditionsModificatioRequest may contain requests
 * on multiple transactions. However, one
 * SecuritiesSettlementConditionsModificationStatusAdvice must be sent per
 * transaction modified unless the
 * SecuritiesSettlementConditionsModificationRequest is rejected as a whole.
 * 
 * The message may also be used to: - re-send a message previously sent (the
 * sub-function of the message is Duplicate) - provide a third party with a copy
 * of a message for information (the sub-function of the message is Copy) -
 * re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate). ISO 15022 - 20022 Coexistence
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards
 * will coexist for a certain number of years. Until this coexistence period
 * ends, the usage of certain data types is restricted to ensure
 * interoperability between ISO 15022 and 20022 users. Compliance to these rules
 * is mandatory in a coexistence environment. The coexistence restrictions are
 * described in a Textual Rule linked to the Message Items they concern. These
 * coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 */
@NextVersion(SecuritiesSettlementConditionModificationStatusAdviceV02.class)
public class SecuritiesSettlementConditionModificationStatusAdviceV01 {

	private DocumentIdentification11 Identification;
	private Identification1 RequestReference;
	private Optional<PartyIdentification13Choice> AccountOwner;
	private Optional<SecuritiesAccount13> SafekeepingAccount;
	private Optional<RequestDetails1> RequestDetails;
	private ProcessingStatus5Choice ProcessingStatus;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<Extension2> Extension;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public Identification1 getRequestReference() {
		return RequestReference;
	}

	public void setRequestReference(Identification1 RequestReference) {
		this.RequestReference = RequestReference;
	}

	public Optional<PartyIdentification13Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification13Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public Optional<SecuritiesAccount13> getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(
			Optional<SecuritiesAccount13> SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<RequestDetails1> getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(Optional<RequestDetails1> RequestDetails) {
		this.RequestDetails = RequestDetails;
	}

	public ProcessingStatus5Choice getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(ProcessingStatus5Choice ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<PartyIdentification10Choice> getMessageOriginator() {
		return MessageOriginator;
	}

	public void setMessageOriginator(
			Optional<PartyIdentification10Choice> MessageOriginator) {
		this.MessageOriginator = MessageOriginator;
	}

	public Optional<PartyIdentification10Choice> getMessageRecipient() {
		return MessageRecipient;
	}

	public void setMessageRecipient(
			Optional<PartyIdentification10Choice> MessageRecipient) {
		this.MessageRecipient = MessageRecipient;
	}

	public Optional<Extension2> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension2> Extension) {
		this.Extension = Extension;
	}
}