package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementConditionsModificationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.choice.PartyIdentification13Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.msg.RequestDetails1;
import com.tools20022.repository.dict.msg.AdditionalInformation3;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope An account owner sends a
 * SecuritiesSettlementConditionsModificationRequest to an account servicer to
 * request the modification of a processing indicator or another non-matching
 * information. The account owner/servicer relationship may be: - a central
 * securities depository participant which has an account with a central
 * securities depository. It could also be, if agreed in a service level
 * agreement: - a global custodian which has an account with its local agent
 * (sub-custodian), or - an investment management institution which manage a
 * fund account opened at a custodian, or - a broker which has an account with a
 * custodian, or - a central securities depository which has an account with a
 * custodian, another central securities depository or another settlement market
 * infrastructure. Usage The message may also be used to: - re-send a message
 * previously sent (the sub-function of the message is Duplicate), - provide a
 * third party with a copy of a message for information (the sub-function of the
 * message is Copy), - re-send to a third party a copy of a message for
 * information (the sub-function of the message is Copy Duplicate). This message
 * cannot be used to request the modification of trade or event details. The use
 * of AdditionalInformation and its fields must be pre-agreed between account
 * servicer and account owner. The fields in that sequence cannot be used to
 * amend a trade or event detail unless authorised by country market practice.
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@NextVersion(SecuritiesSettlementConditionsModificationRequestV02.class)
public class SecuritiesSettlementConditionsModificationRequestV01 {

	private DocumentIdentification11 Identification;
	private Optional<PartyIdentification13Choice> AccountOwner;
	private SecuritiesAccount13 SafekeepingAccount;
	private RequestDetails1 RequestDetails;
	private Optional<AdditionalInformation3> AdditionalInformation;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<Extension2> Extension;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public Optional<PartyIdentification13Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification13Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount13 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount13 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public RequestDetails1 getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(RequestDetails1 RequestDetails) {
		this.RequestDetails = RequestDetails;
	}

	public Optional<AdditionalInformation3> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<AdditionalInformation3> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
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