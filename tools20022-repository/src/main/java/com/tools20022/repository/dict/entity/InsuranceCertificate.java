package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.codeset.InsuranceClausesCode;
import com.tools20022.repository.dict.entity.Location;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.InsurancePartyRole;
import com.tools20022.repository.dict.entity.ProductDelivery;
import com.tools20022.repository.dict.codeset.InsuranceCode;
import com.tools20022.repository.dict.entity.InvestmentPlan;

/**
 * Formal document used to record a fact and used as proof of the fact that
 * goods have been insured under an insurance policy.
 */
public class InsuranceCertificate extends Document
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ISODate EffectiveDate;
	private CurrencyAndAmount InsuredAmount;
	private Max350Text InsuranceConditions;
	private InsuranceClausesCode InsuranceClauses;
	private Location ClaimsPayableAt;
	private CurrencyCode ClaimsPayableIn;
	private InsurancePartyRole InsurancePartyRole;
	private ProductDelivery ProductDelivery;
	private InsuranceCode InsuranceType;
	private InvestmentPlan RelatedInvestmentPlan;

	public ISODate getEffectiveDate() {
		return EffectiveDate;
	}

	public void setEffectiveDate(ISODate EffectiveDate) {
		this.EffectiveDate = EffectiveDate;
	}

	public CurrencyAndAmount getInsuredAmount() {
		return InsuredAmount;
	}

	public void setInsuredAmount(CurrencyAndAmount InsuredAmount) {
		this.InsuredAmount = InsuredAmount;
	}

	public Max350Text getInsuranceConditions() {
		return InsuranceConditions;
	}

	public void setInsuranceConditions(Max350Text InsuranceConditions) {
		this.InsuranceConditions = InsuranceConditions;
	}

	public InsuranceClausesCode getInsuranceClauses() {
		return InsuranceClauses;
	}

	public void setInsuranceClauses(InsuranceClausesCode InsuranceClauses) {
		this.InsuranceClauses = InsuranceClauses;
	}

	public Location getClaimsPayableAt() {
		return ClaimsPayableAt;
	}

	public void setClaimsPayableAt(Location ClaimsPayableAt) {
		this.ClaimsPayableAt = ClaimsPayableAt;
	}

	public CurrencyCode getClaimsPayableIn() {
		return ClaimsPayableIn;
	}

	public void setClaimsPayableIn(CurrencyCode ClaimsPayableIn) {
		this.ClaimsPayableIn = ClaimsPayableIn;
	}

	public InsurancePartyRole getInsurancePartyRole() {
		return InsurancePartyRole;
	}

	public void setInsurancePartyRole(InsurancePartyRole InsurancePartyRole) {
		this.InsurancePartyRole = InsurancePartyRole;
	}

	public ProductDelivery getProductDelivery() {
		return ProductDelivery;
	}

	public void setProductDelivery(ProductDelivery ProductDelivery) {
		this.ProductDelivery = ProductDelivery;
	}

	public InsuranceCode getInsuranceType() {
		return InsuranceType;
	}

	public void setInsuranceType(InsuranceCode InsuranceType) {
		this.InsuranceType = InsuranceType;
	}

	public InvestmentPlan getRelatedInvestmentPlan() {
		return RelatedInvestmentPlan;
	}

	public void setRelatedInvestmentPlan(InvestmentPlan RelatedInvestmentPlan) {
		this.RelatedInvestmentPlan = RelatedInvestmentPlan;
	}
}