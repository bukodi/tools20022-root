package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementInstructionV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Identification14;
import java.util.Optional;
import com.tools20022.repository.dict.choice.NumberCount1Choice;
import com.tools20022.repository.dict.msg.Linkages36;
import com.tools20022.repository.dict.choice.PartyIdentification92Choice;
import com.tools20022.repository.dict.msg.SecuritiesAccount24;
import com.tools20022.repository.dict.choice.SafekeepingPlaceFormat10Choice;
import com.tools20022.repository.dict.msg.SecurityIdentification19;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes63;
import com.tools20022.repository.dict.msg.IntraPositionDetails33;
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
@PreviousVersion(IntraPositionMovementInstructionV03.class)
public class IntraPositionMovementInstructionV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Max35Text TransactionIdentification;
	private Optional<Identification14> CorporateActionEventIdentification;
	private Optional<NumberCount1Choice> NumberCounts;
	private Optional<Linkages36> Linkages;
	private Optional<PartyIdentification92Choice> AccountOwner;
	private SecuritiesAccount24 SafekeepingAccount;
	private Optional<SafekeepingPlaceFormat10Choice> SafekeepingPlace;
	private SecurityIdentification19 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes63> FinancialInstrumentAttributes;
	private IntraPositionDetails33 IntraPositionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<Identification14> getCorporateActionEventIdentification() {
		return CorporateActionEventIdentification;
	}

	public void setCorporateActionEventIdentification(
			Optional<Identification14> CorporateActionEventIdentification) {
		this.CorporateActionEventIdentification = CorporateActionEventIdentification;
	}

	public Optional<NumberCount1Choice> getNumberCounts() {
		return NumberCounts;
	}

	public void setNumberCounts(Optional<NumberCount1Choice> NumberCounts) {
		this.NumberCounts = NumberCounts;
	}

	public Optional<Linkages36> getLinkages() {
		return Linkages;
	}

	public void setLinkages(Optional<Linkages36> Linkages) {
		this.Linkages = Linkages;
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

	public IntraPositionDetails33 getIntraPositionDetails() {
		return IntraPositionDetails;
	}

	public void setIntraPositionDetails(
			IntraPositionDetails33 IntraPositionDetails) {
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