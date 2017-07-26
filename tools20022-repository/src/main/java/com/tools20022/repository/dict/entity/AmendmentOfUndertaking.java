package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.Undertaking;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Modification of an undertaking such as an guarantee or standby letter of
 * credit.
 */
public class AmendmentOfUndertaking {

	private ISODateTime DateOfIssuance;
	private CurrencyAndAmount ChangeOfAmount;
	private Undertaking Undertaking;
	private YesNoIndicator BeneficiaryConsentRequestIndicator;
	private Max35Text AmendmentIdentification;

	public ISODateTime getDateOfIssuance() {
		return DateOfIssuance;
	}

	public void setDateOfIssuance(ISODateTime DateOfIssuance) {
		this.DateOfIssuance = DateOfIssuance;
	}

	public CurrencyAndAmount getChangeOfAmount() {
		return ChangeOfAmount;
	}

	public void setChangeOfAmount(CurrencyAndAmount ChangeOfAmount) {
		this.ChangeOfAmount = ChangeOfAmount;
	}

	public Undertaking getUndertaking() {
		return Undertaking;
	}

	public void setUndertaking(Undertaking Undertaking) {
		this.Undertaking = Undertaking;
	}

	public YesNoIndicator getBeneficiaryConsentRequestIndicator() {
		return BeneficiaryConsentRequestIndicator;
	}

	public void setBeneficiaryConsentRequestIndicator(
			YesNoIndicator BeneficiaryConsentRequestIndicator) {
		this.BeneficiaryConsentRequestIndicator = BeneficiaryConsentRequestIndicator;
	}

	public Max35Text getAmendmentIdentification() {
		return AmendmentIdentification;
	}

	public void setAmendmentIdentification(Max35Text AmendmentIdentification) {
		this.AmendmentIdentification = AmendmentIdentification;
	}
}