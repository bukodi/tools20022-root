package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementConditionsModificationRequestV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PartyIdentification98;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount19;
import com.tools20022.repository.dict.msg.RequestDetails15;
import com.tools20022.repository.dict.msg.AdditionalInformation13;
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
@PreviousVersion(SecuritiesSettlementConditionsModificationRequestV06.class)
public class SecuritiesSettlementConditionsModificationRequestV07 {

	private Optional<PartyIdentification98> AccountOwner;
	private SecuritiesAccount19 SafekeepingAccount;
	private RequestDetails15 RequestDetails;
	private Optional<AdditionalInformation13> AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<PartyIdentification98> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification98> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount19 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount19 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public RequestDetails15 getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(RequestDetails15 RequestDetails) {
		this.RequestDetails = RequestDetails;
	}

	public Optional<AdditionalInformation13> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<AdditionalInformation13> AdditionalInformation) {
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