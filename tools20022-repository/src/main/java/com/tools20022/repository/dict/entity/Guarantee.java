package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Asset;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.codeset.GuarantyTypeCode;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.entity.Trade;
import com.tools20022.repository.dict.entity.GuaranteePartyRole;

/**
 * Partial or full coverage of amounts by a party other than the debtor.
 */
public class Guarantee extends Asset {

	private CurrencyAndAmount CoveredAmount;
	private DateTimePeriod EffectivePeriod;
	private GuarantyTypeCode GuaranteeType;
	private PercentageRate CoveredPercentage;
	private Document Document;
	private Trade GuaranteedTrade;
	private CurrencyAndAmount ExcessAmount;
	private GuaranteePartyRole GuaranteePartyRole;

	public CurrencyAndAmount getCoveredAmount() {
		return CoveredAmount;
	}

	public void setCoveredAmount(CurrencyAndAmount CoveredAmount) {
		this.CoveredAmount = CoveredAmount;
	}

	public DateTimePeriod getEffectivePeriod() {
		return EffectivePeriod;
	}

	public void setEffectivePeriod(DateTimePeriod EffectivePeriod) {
		this.EffectivePeriod = EffectivePeriod;
	}

	public GuarantyTypeCode getGuaranteeType() {
		return GuaranteeType;
	}

	public void setGuaranteeType(GuarantyTypeCode GuaranteeType) {
		this.GuaranteeType = GuaranteeType;
	}

	public PercentageRate getCoveredPercentage() {
		return CoveredPercentage;
	}

	public void setCoveredPercentage(PercentageRate CoveredPercentage) {
		this.CoveredPercentage = CoveredPercentage;
	}

	public Document getDocument() {
		return Document;
	}

	public void setDocument(Document Document) {
		this.Document = Document;
	}

	public Trade getGuaranteedTrade() {
		return GuaranteedTrade;
	}

	public void setGuaranteedTrade(Trade GuaranteedTrade) {
		this.GuaranteedTrade = GuaranteedTrade;
	}

	public CurrencyAndAmount getExcessAmount() {
		return ExcessAmount;
	}

	public void setExcessAmount(CurrencyAndAmount ExcessAmount) {
		this.ExcessAmount = ExcessAmount;
	}

	public GuaranteePartyRole getGuaranteePartyRole() {
		return GuaranteePartyRole;
	}

	public void setGuaranteePartyRole(GuaranteePartyRole GuaranteePartyRole) {
		this.GuaranteePartyRole = GuaranteePartyRole;
	}
}