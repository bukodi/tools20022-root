package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Dividend;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.Index;
import com.tools20022.repository.dict.entity.BiddingConditions;
import com.tools20022.repository.dict.entity.CorporateActionFeesAndCharges;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.SecuritiesTax;
import com.tools20022.repository.dict.entity.Issuance;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.codeset.OperatorCode;
import com.tools20022.repository.dict.entity.YieldCalculation;

/**
 * Specifies the value expressed as a rate or an amount. For example, the value
 * of a tax or a commission.
 */
public class RateAndAmount extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Dividend FinalDividendParameters;
	private Dividend FullyFrankedRateAndAmountDividendParameters;
	private Dividend GrossDividendParameters;
	private CurrencyAndAmount Amount;
	private Index Index;
	private Dividend NetDividendParameters;
	private BiddingConditions MaximumAllowedBiddingConditions;
	private Dividend ProvisionalDividendParameters;
	private CorporateActionFeesAndCharges SolicitationFeeCorporateActionParameters;
	private PercentageRate Rate;
	private BiddingConditions RateBiddingConditions;
	private SecuritiesTax SecuritiesTax;
	private CorporateActionFeesAndCharges EarlySolicitationFeeCorporateActionParameters;
	private Issuance InterestRelatedIssuance;
	private Issuance LossRelatedIssuance;
	private Number AbsoluteValue;
	private OperatorCode Operator;
	private YieldCalculation RelatedYieldCalculation;

	public Dividend getFinalDividendParameters() {
		return FinalDividendParameters;
	}

	public void setFinalDividendParameters(Dividend FinalDividendParameters) {
		this.FinalDividendParameters = FinalDividendParameters;
	}

	public Dividend getFullyFrankedRateAndAmountDividendParameters() {
		return FullyFrankedRateAndAmountDividendParameters;
	}

	public void setFullyFrankedRateAndAmountDividendParameters(
			Dividend FullyFrankedRateAndAmountDividendParameters) {
		this.FullyFrankedRateAndAmountDividendParameters = FullyFrankedRateAndAmountDividendParameters;
	}

	public Dividend getGrossDividendParameters() {
		return GrossDividendParameters;
	}

	public void setGrossDividendParameters(Dividend GrossDividendParameters) {
		this.GrossDividendParameters = GrossDividendParameters;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public Index getIndex() {
		return Index;
	}

	public void setIndex(Index Index) {
		this.Index = Index;
	}

	public Dividend getNetDividendParameters() {
		return NetDividendParameters;
	}

	public void setNetDividendParameters(Dividend NetDividendParameters) {
		this.NetDividendParameters = NetDividendParameters;
	}

	public BiddingConditions getMaximumAllowedBiddingConditions() {
		return MaximumAllowedBiddingConditions;
	}

	public void setMaximumAllowedBiddingConditions(
			BiddingConditions MaximumAllowedBiddingConditions) {
		this.MaximumAllowedBiddingConditions = MaximumAllowedBiddingConditions;
	}

	public Dividend getProvisionalDividendParameters() {
		return ProvisionalDividendParameters;
	}

	public void setProvisionalDividendParameters(
			Dividend ProvisionalDividendParameters) {
		this.ProvisionalDividendParameters = ProvisionalDividendParameters;
	}

	public CorporateActionFeesAndCharges getSolicitationFeeCorporateActionParameters() {
		return SolicitationFeeCorporateActionParameters;
	}

	public void setSolicitationFeeCorporateActionParameters(
			CorporateActionFeesAndCharges SolicitationFeeCorporateActionParameters) {
		this.SolicitationFeeCorporateActionParameters = SolicitationFeeCorporateActionParameters;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}

	public BiddingConditions getRateBiddingConditions() {
		return RateBiddingConditions;
	}

	public void setRateBiddingConditions(BiddingConditions RateBiddingConditions) {
		this.RateBiddingConditions = RateBiddingConditions;
	}

	public SecuritiesTax getSecuritiesTax() {
		return SecuritiesTax;
	}

	public void setSecuritiesTax(SecuritiesTax SecuritiesTax) {
		this.SecuritiesTax = SecuritiesTax;
	}

	public CorporateActionFeesAndCharges getEarlySolicitationFeeCorporateActionParameters() {
		return EarlySolicitationFeeCorporateActionParameters;
	}

	public void setEarlySolicitationFeeCorporateActionParameters(
			CorporateActionFeesAndCharges EarlySolicitationFeeCorporateActionParameters) {
		this.EarlySolicitationFeeCorporateActionParameters = EarlySolicitationFeeCorporateActionParameters;
	}

	public Issuance getInterestRelatedIssuance() {
		return InterestRelatedIssuance;
	}

	public void setInterestRelatedIssuance(Issuance InterestRelatedIssuance) {
		this.InterestRelatedIssuance = InterestRelatedIssuance;
	}

	public Issuance getLossRelatedIssuance() {
		return LossRelatedIssuance;
	}

	public void setLossRelatedIssuance(Issuance LossRelatedIssuance) {
		this.LossRelatedIssuance = LossRelatedIssuance;
	}

	public Number getAbsoluteValue() {
		return AbsoluteValue;
	}

	public void setAbsoluteValue(Number AbsoluteValue) {
		this.AbsoluteValue = AbsoluteValue;
	}

	public OperatorCode getOperator() {
		return Operator;
	}

	public void setOperator(OperatorCode Operator) {
		this.Operator = Operator;
	}

	public YieldCalculation getRelatedYieldCalculation() {
		return RelatedYieldCalculation;
	}

	public void setRelatedYieldCalculation(
			YieldCalculation RelatedYieldCalculation) {
		this.RelatedYieldCalculation = RelatedYieldCalculation;
	}
}