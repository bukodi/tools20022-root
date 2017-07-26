package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementConfirmationV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AdditionalParameters21;
import java.util.Optional;
import com.tools20022.repository.dict.choice.PartyIdentification92Choice;
import com.tools20022.repository.dict.msg.SecuritiesAccount24;
import com.tools20022.repository.dict.choice.SafekeepingPlaceFormat10Choice;
import com.tools20022.repository.dict.msg.SecurityIdentification19;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes63;
import com.tools20022.repository.dict.msg.IntraPositionDetails41;
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
 */
@PreviousVersion(IntraPositionMovementConfirmationV05.class)
public class IntraPositionMovementConfirmationV06 {

	private Optional<AdditionalParameters21> AdditionalParameters;
	private Optional<PartyIdentification92Choice> AccountOwner;
	private SecuritiesAccount24 SafekeepingAccount;
	private Optional<SafekeepingPlaceFormat10Choice> SafekeepingPlace;
	private SecurityIdentification19 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes63> FinancialInstrumentAttributes;
	private IntraPositionDetails41 IntraPositionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<AdditionalParameters21> getAdditionalParameters() {
		return AdditionalParameters;
	}

	public void setAdditionalParameters(
			Optional<AdditionalParameters21> AdditionalParameters) {
		this.AdditionalParameters = AdditionalParameters;
	}

	public Optional<PartyIdentification92Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification92Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount24 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount24 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<SafekeepingPlaceFormat10Choice> getSafekeepingPlace() {
		return SafekeepingPlace;
	}

	public void setSafekeepingPlace(
			Optional<SafekeepingPlaceFormat10Choice> SafekeepingPlace) {
		this.SafekeepingPlace = SafekeepingPlace;
	}

	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification19 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public Optional<FinancialInstrumentAttributes63> getFinancialInstrumentAttributes() {
		return FinancialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(
			Optional<FinancialInstrumentAttributes63> FinancialInstrumentAttributes) {
		this.FinancialInstrumentAttributes = FinancialInstrumentAttributes;
	}

	public IntraPositionDetails41 getIntraPositionDetails() {
		return IntraPositionDetails;
	}

	public void setIntraPositionDetails(
			IntraPositionDetails41 IntraPositionDetails) {
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