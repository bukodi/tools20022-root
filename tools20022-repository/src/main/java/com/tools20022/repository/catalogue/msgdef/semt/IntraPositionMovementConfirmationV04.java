package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementConfirmationV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementConfirmationV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalParameters10;
import java.util.Optional;
import com.tools20022.repository.dict.choice.PartyIdentification36Choice;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.choice.SafekeepingPlaceFormat3Choice;
import com.tools20022.repository.dict.msg.SecurityIdentification14;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes36;
import com.tools20022.repository.dict.msg.IntraPositionDetails27;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends a IntraPositionMovementConfirmation to an
 * account owner to confirm the movement of securities within its holding from
 * one sub-balance to another, for example, blocking of securities. The account
 * servicer/owner relationship may be: - a central securities depository or
 * another settlement market infrastructure acting on behalf of their
 * participants - an agent (sub-custodian) acting on behalf of their global
 * custodian customer, or - a custodian acting on behalf of an investment
 * management institution or a broker/dealer.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 * 
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(IntraPositionMovementConfirmationV03.class)
@NextVersion(IntraPositionMovementConfirmationV05.class)
public class IntraPositionMovementConfirmationV04 {

	private Optional<AdditionalParameters10> AdditionalParameters;
	private Optional<PartyIdentification36Choice> AccountOwner;
	private SecuritiesAccount13 SafekeepingAccount;
	private Optional<SafekeepingPlaceFormat3Choice> SafekeepingPlace;
	private SecurityIdentification14 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes36> FinancialInstrumentAttributes;
	private IntraPositionDetails27 IntraPositionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<AdditionalParameters10> getAdditionalParameters() {
		return AdditionalParameters;
	}

	public void setAdditionalParameters(
			Optional<AdditionalParameters10> AdditionalParameters) {
		this.AdditionalParameters = AdditionalParameters;
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

	public Optional<SafekeepingPlaceFormat3Choice> getSafekeepingPlace() {
		return SafekeepingPlace;
	}

	public void setSafekeepingPlace(
			Optional<SafekeepingPlaceFormat3Choice> SafekeepingPlace) {
		this.SafekeepingPlace = SafekeepingPlace;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification14 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public Optional<FinancialInstrumentAttributes36> getFinancialInstrumentAttributes() {
		return FinancialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(
			Optional<FinancialInstrumentAttributes36> FinancialInstrumentAttributes) {
		this.FinancialInstrumentAttributes = FinancialInstrumentAttributes;
	}

	public IntraPositionDetails27 getIntraPositionDetails() {
		return IntraPositionDetails;
	}

	public void setIntraPositionDetails(
			IntraPositionDetails27 IntraPositionDetails) {
		this.IntraPositionDetails = IntraPositionDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}