package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementConditionsModificationRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementConditionsModificationRequestV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.PartyIdentification36Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.msg.RequestDetails6;
import com.tools20022.repository.dict.msg.AdditionalInformation7;
import com.tools20022.repository.dict.msg.SupplementaryData1;

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
 * previously sent, - provide a third party with a copy of a message for
 * information, - re-send to a third party a copy of a message for information.
 * using the relevant elements in the Business Application Header. This message
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
@PreviousVersion(SecuritiesSettlementConditionsModificationRequestV01.class)
@NextVersion(SecuritiesSettlementConditionsModificationRequestV03.class)
public class SecuritiesSettlementConditionsModificationRequestV02 {

	private Optional<PartyIdentification36Choice> AccountOwner;
	private SecuritiesAccount13 SafekeepingAccount;
	private RequestDetails6 RequestDetails;
	private Optional<AdditionalInformation7> AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

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

	public RequestDetails6 getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(RequestDetails6 RequestDetails) {
		this.RequestDetails = RequestDetails;
	}

	public Optional<AdditionalInformation7> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<AdditionalInformation7> AdditionalInformation) {
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