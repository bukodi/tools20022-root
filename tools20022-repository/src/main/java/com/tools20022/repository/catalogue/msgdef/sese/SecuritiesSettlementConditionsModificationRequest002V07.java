package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementConditionsModificationRequest002V06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PartyIdentification119;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount30;
import com.tools20022.repository.dict.msg.RequestDetails16;
import com.tools20022.repository.dict.msg.AdditionalInformation14;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account owner sends a
 * SecuritiesSettlementConditionsModificationRequest to an account servicer to
 * request the modification of a processing indicator or another non-matching
 * information.
 * 
 * The account owner/servicer relationship may be: - a central securities
 * depository participant which has an account with a central securities
 * depository. It could also be, if agreed in a service level agreement: - a
 * global custodian which has an account with its local agent (sub-custodian),
 * or - an investment management institution which manage a fund account opened
 * at a custodian, or - a broker which has an account with a custodian, or - a
 * central securities depository which has an account with a custodian, another
 * central securities depository or another settlement market infrastructure.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 * 
 * In markets where this applies (eg, securities market infrastructures with no
 * pre-settlement matching process), it is used by a party to approve, cancel or
 * reject a transaction instructed by the counterparty.
 * 
 * This message cannot be used to request the modification of trade or event
 * details. The use of AdditionalInformation and its fields must be pre-agreed
 * between account servicer and account owner. The fields in that sequence
 * cannot be used to amend a trade or event detail unless authorised by country
 * market practice.
 */
@PreviousVersion(SecuritiesSettlementConditionsModificationRequest002V06.class)
public class SecuritiesSettlementConditionsModificationRequest002V07 {

	private Optional<PartyIdentification119> AccountOwner;
	private SecuritiesAccount30 SafekeepingAccount;
	private RequestDetails16 RequestDetails;
	private Optional<AdditionalInformation14> AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<PartyIdentification119> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification119> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount30 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount30 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public RequestDetails16 getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(RequestDetails16 RequestDetails) {
		this.RequestDetails = RequestDetails;
	}

	public Optional<AdditionalInformation14> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<AdditionalInformation14> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}