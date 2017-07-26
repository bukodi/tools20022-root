package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementInstructionV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementInstructionV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Identification1;
import java.util.Optional;
import com.tools20022.repository.dict.choice.NumberCount1Choice;
import com.tools20022.repository.dict.msg.Linkages19;
import com.tools20022.repository.dict.choice.PartyIdentification36Choice;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.choice.SafekeepingPlaceFormat3Choice;
import com.tools20022.repository.dict.msg.SecurityIdentification14;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes36;
import com.tools20022.repository.dict.msg.IntraPositionDetails21;
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
 * elements in the Business Application Header. ISO 15022 - 20022 Coexistence
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards
 * will coexist for a certain number of years. Until this coexistence period
 * ends, the usage of certain data types is restricted to ensure
 * interoperability between ISO 15022 and 20022 users. Compliance to these rules
 * is mandatory in a coexistence environment. The coexistence restrictions are
 * described in a Textual Rule linked to the Message Items they concern. These
 * coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 */
@PreviousVersion(IntraPositionMovementInstructionV02.class)
@NextVersion(IntraPositionMovementInstructionV04.class)
public class IntraPositionMovementInstructionV03 {

	private Max35Text TransactionIdentification;
	private Optional<Identification1> CorporateActionEventIdentification;
	private Optional<NumberCount1Choice> NumberCounts;
	private Optional<Linkages19> Linkages;
	private Optional<PartyIdentification36Choice> AccountOwner;
	private SecuritiesAccount13 SafekeepingAccount;
	private Optional<SafekeepingPlaceFormat3Choice> SafekeepingPlace;
	private SecurityIdentification14 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes36> FinancialInstrumentAttributes;
	private IntraPositionDetails21 IntraPositionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<Identification1> getCorporateActionEventIdentification() {
		return CorporateActionEventIdentification;
	}

	public void setCorporateActionEventIdentification(
			Optional<Identification1> CorporateActionEventIdentification) {
		this.CorporateActionEventIdentification = CorporateActionEventIdentification;
	}

	public Optional<NumberCount1Choice> getNumberCounts() {
		return NumberCounts;
	}

	public void setNumberCounts(Optional<NumberCount1Choice> NumberCounts) {
		this.NumberCounts = NumberCounts;
	}

	public Optional<Linkages19> getLinkages() {
		return Linkages;
	}

	public void setLinkages(Optional<Linkages19> Linkages) {
		this.Linkages = Linkages;
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

	public IntraPositionDetails21 getIntraPositionDetails() {
		return IntraPositionDetails;
	}

	public void setIntraPositionDetails(
			IntraPositionDetails21 IntraPositionDetails) {
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