package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.dict.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.dict.msg.Identification16;
import java.util.Optional;
import com.tools20022.repository.dict.choice.NumberCount1Choice;
import com.tools20022.repository.dict.msg.Linkages42;
import com.tools20022.repository.dict.choice.PartyIdentification103Choice;
import com.tools20022.repository.dict.msg.SecuritiesAccount27;
import com.tools20022.repository.dict.choice.SafekeepingPlaceFormat17Choice;
import com.tools20022.repository.dict.msg.SecurityIdentification20;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes75;
import com.tools20022.repository.dict.msg.IntraPositionDetails36;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account owner sends a IntraPositionMovementInstruction to an account
 * servicer to instruct the movement of securities within its holding from one
 * sub-balance to another, for example, blocking of securities. The account
 * owner/servicer relationship may be: - a global custodian which has an account
 * with its local agent (sub-custodian), or - an investment management
 * institution which manage a fund account opened at a custodian, or - a broker
 * which has an account with a custodian, or - a central securities depository
 * participant which has an account with a central securities depository, or - a
 * central securities depository which has an account with a custodian, another
 * central securities depository or another settlement market infrastructure.
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information. using the relevant
 * elements in the Business Application Header.
 */
public class IntraPositionMovementInstruction002V04 {

	private RestrictedFINXMax16Text TransactionIdentification;
	private Optional<Identification16> CorporateActionEventIdentification;
	private Optional<NumberCount1Choice> NumberCounts;
	private Optional<Linkages42> Linkages;
	private Optional<PartyIdentification103Choice> AccountOwner;
	private SecuritiesAccount27 SafekeepingAccount;
	private Optional<SafekeepingPlaceFormat17Choice> SafekeepingPlace;
	private SecurityIdentification20 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes75> FinancialInstrumentAttributes;
	private IntraPositionDetails36 IntraPositionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public RestrictedFINXMax16Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			RestrictedFINXMax16Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<Identification16> getCorporateActionEventIdentification() {
		return CorporateActionEventIdentification;
	}

	public void setCorporateActionEventIdentification(
			Optional<Identification16> CorporateActionEventIdentification) {
		this.CorporateActionEventIdentification = CorporateActionEventIdentification;
	}

	public Optional<NumberCount1Choice> getNumberCounts() {
		return NumberCounts;
	}

	public void setNumberCounts(Optional<NumberCount1Choice> NumberCounts) {
		this.NumberCounts = NumberCounts;
	}

	public Optional<Linkages42> getLinkages() {
		return Linkages;
	}

	public void setLinkages(Optional<Linkages42> Linkages) {
		this.Linkages = Linkages;
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

	public IntraPositionDetails36 getIntraPositionDetails() {
		return IntraPositionDetails;
	}

	public void setIntraPositionDetails(
			IntraPositionDetails36 IntraPositionDetails) {
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