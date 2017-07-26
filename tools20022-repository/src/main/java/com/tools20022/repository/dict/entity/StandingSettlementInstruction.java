package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Settlement;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.SettlementStandingInstructionDatabaseCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.CollateralAgreement;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.SSIDatabaseProvider;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.Asset;

/**
 * Settlement instruction database information.
 */
public class StandingSettlementInstruction {

	private Settlement Settlement;
	private YesNoIndicator FXStandingInstruction;
	private SettlementStandingInstructionDatabaseCode SettlementStandingInstructionDatabase;
	private Max35Text Identification;
	private CollateralAgreement RelatedCollateralAgreement;
	private Max350Text SSIDatabaseName;
	private SSIDatabaseProvider SSIDatabaseProvider;
	private DateTimePeriod ValidityPeriod;
	private CurrencyCode Currency;
	private Asset Asset;

	public Settlement getSettlement() {
		return Settlement;
	}

	public void setSettlement(Settlement Settlement) {
		this.Settlement = Settlement;
	}

	public YesNoIndicator getFXStandingInstruction() {
		return FXStandingInstruction;
	}

	public void setFXStandingInstruction(YesNoIndicator FXStandingInstruction) {
		this.FXStandingInstruction = FXStandingInstruction;
	}

	public SettlementStandingInstructionDatabaseCode getSettlementStandingInstructionDatabase() {
		return SettlementStandingInstructionDatabase;
	}

	public void setSettlementStandingInstructionDatabase(
			SettlementStandingInstructionDatabaseCode SettlementStandingInstructionDatabase) {
		this.SettlementStandingInstructionDatabase = SettlementStandingInstructionDatabase;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public CollateralAgreement getRelatedCollateralAgreement() {
		return RelatedCollateralAgreement;
	}

	public void setRelatedCollateralAgreement(
			CollateralAgreement RelatedCollateralAgreement) {
		this.RelatedCollateralAgreement = RelatedCollateralAgreement;
	}

	public Max350Text getSSIDatabaseName() {
		return SSIDatabaseName;
	}

	public void setSSIDatabaseName(Max350Text SSIDatabaseName) {
		this.SSIDatabaseName = SSIDatabaseName;
	}

	public SSIDatabaseProvider getSSIDatabaseProvider() {
		return SSIDatabaseProvider;
	}

	public void setSSIDatabaseProvider(SSIDatabaseProvider SSIDatabaseProvider) {
		this.SSIDatabaseProvider = SSIDatabaseProvider;
	}

	public DateTimePeriod getValidityPeriod() {
		return ValidityPeriod;
	}

	public void setValidityPeriod(DateTimePeriod ValidityPeriod) {
		this.ValidityPeriod = ValidityPeriod;
	}

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}

	public Asset getAsset() {
		return Asset;
	}

	public void setAsset(Asset Asset) {
		this.Asset = Asset;
	}
}