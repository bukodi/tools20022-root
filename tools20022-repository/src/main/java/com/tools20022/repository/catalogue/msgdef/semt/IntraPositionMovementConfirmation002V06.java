package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementConfirmation002V05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AdditionalParameters25;
import java.util.Optional;
import com.tools20022.repository.dict.choice.PartyIdentification103Choice;
import com.tools20022.repository.dict.msg.SecuritiesAccount27;
import com.tools20022.repository.dict.choice.SafekeepingPlaceFormat17Choice;
import com.tools20022.repository.dict.msg.SecurityIdentification20;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes75;
import com.tools20022.repository.dict.msg.IntraPositionDetails43;
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
@PreviousVersion(IntraPositionMovementConfirmation002V05.class)
public class IntraPositionMovementConfirmation002V06 {

	private Optional<AdditionalParameters25> AdditionalParameters;
	private Optional<PartyIdentification103Choice> AccountOwner;
	private SecuritiesAccount27 SafekeepingAccount;
	private Optional<SafekeepingPlaceFormat17Choice> SafekeepingPlace;
	private SecurityIdentification20 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes75> FinancialInstrumentAttributes;
	private IntraPositionDetails43 IntraPositionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<AdditionalParameters25> getAdditionalParameters() {
		return AdditionalParameters;
	}

	public void setAdditionalParameters(
			Optional<AdditionalParameters25> AdditionalParameters) {
		this.AdditionalParameters = AdditionalParameters;
	}

	public Optional<PartyIdentification103Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification103Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount27 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount27 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<SafekeepingPlaceFormat17Choice> getSafekeepingPlace() {
		return SafekeepingPlace;
	}

	public void setSafekeepingPlace(
			Optional<SafekeepingPlaceFormat17Choice> SafekeepingPlace) {
		this.SafekeepingPlace = SafekeepingPlace;
	}

	public SecurityIdentification20 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification20 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public Optional<FinancialInstrumentAttributes75> getFinancialInstrumentAttributes() {
		return FinancialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(
			Optional<FinancialInstrumentAttributes75> FinancialInstrumentAttributes) {
		this.FinancialInstrumentAttributes = FinancialInstrumentAttributes;
	}

	public IntraPositionDetails43 getIntraPositionDetails() {
		return IntraPositionDetails;
	}

	public void setIntraPositionDetails(
			IntraPositionDetails43 IntraPositionDetails) {
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