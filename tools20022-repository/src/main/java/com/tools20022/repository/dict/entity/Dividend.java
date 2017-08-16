package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.EventFrequencyCode;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.RateAndAmount;
import com.tools20022.repository.dict.codeset.DividendRateTypeCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.codeset.DividendTypeCode;
import com.tools20022.repository.dict.entity.CashProceedsDefinition;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.entity.Tax;
import com.tools20022.repository.dict.entity.Distribution;
import com.tools20022.repository.dict.codeset.CorporateActionFrequencyTypeCode;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.codeset.FrequencyCode;

/**
 * Distribution of earnings to shareholders, paid for in cash, stock, scrip
 * issue or, rarely, in kind, for example, in company products or property. The
 * dividend amount is decided by the board of directors.
 */
public class Dividend extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private EventFrequencyCode DividendFrequency;
	private PercentageRate AnnualTotalDividendRate;
	private RateAndAmount FinalDividend;
	private RateAndAmount FullyFrankedRateAndAmount;
	private RateAndAmount GrossDividend;
	private DividendRateTypeCode RateType;
	private RateAndAmount NetDividend;
	private RateAndAmount ProvisionalDividend;
	private ISODateTime DividendRankingDate;
	private CurrencyAndAmount ManufacturedDividendAmount;
	private CurrencyAndAmount UnfrankedAmount;
	private CurrencyAndAmount NotionalDividendPayableAmount;
	private PercentageRate Rate;
	private ISODateTime ExDividendDate;
	private Security Security;
	private DividendTypeCode Type;
	private CashProceedsDefinition CashProceeds;
	private PaymentObligation Obligation;
	private Tax Tax;
	private Distribution RelatedDistribution;
	private CorporateActionFrequencyTypeCode DividendFrequenceType;
	private PercentageRate DividendRatio;
	private ISODate PaymentDate;
	private FrequencyCode PaymentFrequency;
	private ISODate ReinvestmentDate;
	private CurrencyAndAmount Value;

	public EventFrequencyCode getDividendFrequency() {
		return DividendFrequency;
	}

	public void setDividendFrequency(EventFrequencyCode DividendFrequency) {
		this.DividendFrequency = DividendFrequency;
	}

	public PercentageRate getAnnualTotalDividendRate() {
		return AnnualTotalDividendRate;
	}

	public void setAnnualTotalDividendRate(
			PercentageRate AnnualTotalDividendRate) {
		this.AnnualTotalDividendRate = AnnualTotalDividendRate;
	}

	public RateAndAmount getFinalDividend() {
		return FinalDividend;
	}

	public void setFinalDividend(RateAndAmount FinalDividend) {
		this.FinalDividend = FinalDividend;
	}

	public RateAndAmount getFullyFrankedRateAndAmount() {
		return FullyFrankedRateAndAmount;
	}

	public void setFullyFrankedRateAndAmount(
			RateAndAmount FullyFrankedRateAndAmount) {
		this.FullyFrankedRateAndAmount = FullyFrankedRateAndAmount;
	}

	public RateAndAmount getGrossDividend() {
		return GrossDividend;
	}

	public void setGrossDividend(RateAndAmount GrossDividend) {
		this.GrossDividend = GrossDividend;
	}

	public DividendRateTypeCode getRateType() {
		return RateType;
	}

	public void setRateType(DividendRateTypeCode RateType) {
		this.RateType = RateType;
	}

	public RateAndAmount getNetDividend() {
		return NetDividend;
	}

	public void setNetDividend(RateAndAmount NetDividend) {
		this.NetDividend = NetDividend;
	}

	public RateAndAmount getProvisionalDividend() {
		return ProvisionalDividend;
	}

	public void setProvisionalDividend(RateAndAmount ProvisionalDividend) {
		this.ProvisionalDividend = ProvisionalDividend;
	}

	public ISODateTime getDividendRankingDate() {
		return DividendRankingDate;
	}

	public void setDividendRankingDate(ISODateTime DividendRankingDate) {
		this.DividendRankingDate = DividendRankingDate;
	}

	public CurrencyAndAmount getManufacturedDividendAmount() {
		return ManufacturedDividendAmount;
	}

	public void setManufacturedDividendAmount(
			CurrencyAndAmount ManufacturedDividendAmount) {
		this.ManufacturedDividendAmount = ManufacturedDividendAmount;
	}

	public CurrencyAndAmount getUnfrankedAmount() {
		return UnfrankedAmount;
	}

	public void setUnfrankedAmount(CurrencyAndAmount UnfrankedAmount) {
		this.UnfrankedAmount = UnfrankedAmount;
	}

	public CurrencyAndAmount getNotionalDividendPayableAmount() {
		return NotionalDividendPayableAmount;
	}

	public void setNotionalDividendPayableAmount(
			CurrencyAndAmount NotionalDividendPayableAmount) {
		this.NotionalDividendPayableAmount = NotionalDividendPayableAmount;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}

	public ISODateTime getExDividendDate() {
		return ExDividendDate;
	}

	public void setExDividendDate(ISODateTime ExDividendDate) {
		this.ExDividendDate = ExDividendDate;
	}

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public DividendTypeCode getType() {
		return Type;
	}

	public void setType(DividendTypeCode Type) {
		this.Type = Type;
	}

	public CashProceedsDefinition getCashProceeds() {
		return CashProceeds;
	}

	public void setCashProceeds(CashProceedsDefinition CashProceeds) {
		this.CashProceeds = CashProceeds;
	}

	public PaymentObligation getObligation() {
		return Obligation;
	}

	public void setObligation(PaymentObligation Obligation) {
		this.Obligation = Obligation;
	}

	public Tax getTax() {
		return Tax;
	}

	public void setTax(Tax Tax) {
		this.Tax = Tax;
	}

	public Distribution getRelatedDistribution() {
		return RelatedDistribution;
	}

	public void setRelatedDistribution(Distribution RelatedDistribution) {
		this.RelatedDistribution = RelatedDistribution;
	}

	public CorporateActionFrequencyTypeCode getDividendFrequenceType() {
		return DividendFrequenceType;
	}

	public void setDividendFrequenceType(
			CorporateActionFrequencyTypeCode DividendFrequenceType) {
		this.DividendFrequenceType = DividendFrequenceType;
	}

	public PercentageRate getDividendRatio() {
		return DividendRatio;
	}

	public void setDividendRatio(PercentageRate DividendRatio) {
		this.DividendRatio = DividendRatio;
	}

	public ISODate getPaymentDate() {
		return PaymentDate;
	}

	public void setPaymentDate(ISODate PaymentDate) {
		this.PaymentDate = PaymentDate;
	}

	public FrequencyCode getPaymentFrequency() {
		return PaymentFrequency;
	}

	public void setPaymentFrequency(FrequencyCode PaymentFrequency) {
		this.PaymentFrequency = PaymentFrequency;
	}

	public ISODate getReinvestmentDate() {
		return ReinvestmentDate;
	}

	public void setReinvestmentDate(ISODate ReinvestmentDate) {
		this.ReinvestmentDate = ReinvestmentDate;
	}

	public CurrencyAndAmount getValue() {
		return Value;
	}

	public void setValue(CurrencyAndAmount Value) {
		this.Value = Value;
	}
}