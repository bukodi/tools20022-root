package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.datatype.PaymentDirectionIndicator;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.codeset.DistributionPolicyCode;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.codeset.PrePaymentSpeedCode;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.repository.dict.entity.InterestCalculation;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.codeset.DebtInstrumentSeniorityTypeCode;

/**
 * Financial instruments evidencing moneys owed by the issuer to the holder on
 * terms as specified.
 */
public class Debt extends Security
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private PaymentDirectionIndicator PaymentDirectionIndicator;
	private ISODateTime NextCallableDate;
	private ISODateTime PutableDate;
	private ISODateTime DatedDate;
	private ISODateTime FirstPaymentDate;
	private PercentageRate Factor;
	private Max15NumericText PoolNumber;
	private YesNoIndicator VariableRateIndicator;
	private YesNoIndicator CallableIndicator;
	private YesNoIndicator PutableIndicator;
	private PercentageRate YieldToMaturityRate;
	private CurrencyAndAmount AccruedCapitalisationAmount;
	private ISODateTime NextCouponDate;
	private ISODateTime NextFactorDate;
	private YesNoIndicator OddCouponIndicator;
	private Number CPProgram;
	private Max350Text CPRegistrationType;
	private YesNoIndicator ConvertibleIndicator;
	private YesNoIndicator PreFundedIndicator;
	private YesNoIndicator EscrowedIndicator;
	private YesNoIndicator PerpetualIndicator;
	private YesNoIndicator SubordinatedIndicator;
	private YesNoIndicator ExtendibleIndicator;
	private DateTimePeriod ExtendiblePeriod;
	private CurrencyAndAmount OverAllotmentAmount;
	private PercentageRate OverAllotmentRate;
	private YesNoIndicator AmortisableIndicator;
	private DistributionPolicyCode CapitalisedInterest;
	private CurrencyAndAmount ActualDenominationAmount;
	private DecimalNumber Pieces;
	private DecimalNumber PoolsMaximum;
	private DecimalNumber PoolsPerMillion;
	private DecimalNumber PoolsPerLot;
	private DecimalNumber PoolsPerTrade;
	private YesNoIndicator ConstantPrePaymentPenalty;
	private PrePaymentSpeedCode PrePaymentSpeed;
	private PercentageRate ConstantPrePaymentYield;
	private PercentageRate WeightedAverageCoupon;
	private DecimalNumber WeightedAverageLife;
	private DecimalNumber WeightedAverageLoan;
	private DecimalNumber WeightedAverageMaturity;
	private YesNoIndicator InsuredIndicator;
	private YesNoIndicator BankQualified;
	private PercentageRate AutoReinvestment;
	private DateTimePeriod CustomDate;
	private Number LookBack;
	private SecuritiesQuantity MinimumDenomination;
	private Number MaximumSubstitution;
	private SecuritiesQuantity MinimumIncrement;
	private Max350Text Production;
	private YesNoIndicator Restricted;
	private FrequencyCode PriceFrequency;
	private FrequencyCode SubstitutionFrequency;
	private Number SubstitutionLeft;
	private YesNoIndicator WholePool;
	private YesNoIndicator AlternativeMinimumTax;
	private InterestCalculation NextInterest;
	private ISODateTime ExtendibleDate;
	private YesNoIndicator SinkableIndicator;
	private YesNoIndicator Insured;
	private Max35Text Geographics;
	private CurrencyCode PaymentCurrency;
	private SecuritiesPricing DirtyPrice;
	private DebtInstrumentSeniorityTypeCode DebtSeniority;

	public PaymentDirectionIndicator getPaymentDirectionIndicator() {
		return PaymentDirectionIndicator;
	}

	public void setPaymentDirectionIndicator(
			PaymentDirectionIndicator PaymentDirectionIndicator) {
		this.PaymentDirectionIndicator = PaymentDirectionIndicator;
	}

	public ISODateTime getNextCallableDate() {
		return NextCallableDate;
	}

	public void setNextCallableDate(ISODateTime NextCallableDate) {
		this.NextCallableDate = NextCallableDate;
	}

	public ISODateTime getPutableDate() {
		return PutableDate;
	}

	public void setPutableDate(ISODateTime PutableDate) {
		this.PutableDate = PutableDate;
	}

	public ISODateTime getDatedDate() {
		return DatedDate;
	}

	public void setDatedDate(ISODateTime DatedDate) {
		this.DatedDate = DatedDate;
	}

	public ISODateTime getFirstPaymentDate() {
		return FirstPaymentDate;
	}

	public void setFirstPaymentDate(ISODateTime FirstPaymentDate) {
		this.FirstPaymentDate = FirstPaymentDate;
	}

	public PercentageRate getFactor() {
		return Factor;
	}

	public void setFactor(PercentageRate Factor) {
		this.Factor = Factor;
	}

	public Max15NumericText getPoolNumber() {
		return PoolNumber;
	}

	public void setPoolNumber(Max15NumericText PoolNumber) {
		this.PoolNumber = PoolNumber;
	}

	public YesNoIndicator getVariableRateIndicator() {
		return VariableRateIndicator;
	}

	public void setVariableRateIndicator(YesNoIndicator VariableRateIndicator) {
		this.VariableRateIndicator = VariableRateIndicator;
	}

	public YesNoIndicator getCallableIndicator() {
		return CallableIndicator;
	}

	public void setCallableIndicator(YesNoIndicator CallableIndicator) {
		this.CallableIndicator = CallableIndicator;
	}

	public YesNoIndicator getPutableIndicator() {
		return PutableIndicator;
	}

	public void setPutableIndicator(YesNoIndicator PutableIndicator) {
		this.PutableIndicator = PutableIndicator;
	}

	public PercentageRate getYieldToMaturityRate() {
		return YieldToMaturityRate;
	}

	public void setYieldToMaturityRate(PercentageRate YieldToMaturityRate) {
		this.YieldToMaturityRate = YieldToMaturityRate;
	}

	public CurrencyAndAmount getAccruedCapitalisationAmount() {
		return AccruedCapitalisationAmount;
	}

	public void setAccruedCapitalisationAmount(
			CurrencyAndAmount AccruedCapitalisationAmount) {
		this.AccruedCapitalisationAmount = AccruedCapitalisationAmount;
	}

	public ISODateTime getNextCouponDate() {
		return NextCouponDate;
	}

	public void setNextCouponDate(ISODateTime NextCouponDate) {
		this.NextCouponDate = NextCouponDate;
	}

	public ISODateTime getNextFactorDate() {
		return NextFactorDate;
	}

	public void setNextFactorDate(ISODateTime NextFactorDate) {
		this.NextFactorDate = NextFactorDate;
	}

	public YesNoIndicator getOddCouponIndicator() {
		return OddCouponIndicator;
	}

	public void setOddCouponIndicator(YesNoIndicator OddCouponIndicator) {
		this.OddCouponIndicator = OddCouponIndicator;
	}

	public Number getCPProgram() {
		return CPProgram;
	}

	public void setCPProgram(Number CPProgram) {
		this.CPProgram = CPProgram;
	}

	public Max350Text getCPRegistrationType() {
		return CPRegistrationType;
	}

	public void setCPRegistrationType(Max350Text CPRegistrationType) {
		this.CPRegistrationType = CPRegistrationType;
	}

	public YesNoIndicator getConvertibleIndicator() {
		return ConvertibleIndicator;
	}

	public void setConvertibleIndicator(YesNoIndicator ConvertibleIndicator) {
		this.ConvertibleIndicator = ConvertibleIndicator;
	}

	public YesNoIndicator getPreFundedIndicator() {
		return PreFundedIndicator;
	}

	public void setPreFundedIndicator(YesNoIndicator PreFundedIndicator) {
		this.PreFundedIndicator = PreFundedIndicator;
	}

	public YesNoIndicator getEscrowedIndicator() {
		return EscrowedIndicator;
	}

	public void setEscrowedIndicator(YesNoIndicator EscrowedIndicator) {
		this.EscrowedIndicator = EscrowedIndicator;
	}

	public YesNoIndicator getPerpetualIndicator() {
		return PerpetualIndicator;
	}

	public void setPerpetualIndicator(YesNoIndicator PerpetualIndicator) {
		this.PerpetualIndicator = PerpetualIndicator;
	}

	public YesNoIndicator getSubordinatedIndicator() {
		return SubordinatedIndicator;
	}

	public void setSubordinatedIndicator(YesNoIndicator SubordinatedIndicator) {
		this.SubordinatedIndicator = SubordinatedIndicator;
	}

	public YesNoIndicator getExtendibleIndicator() {
		return ExtendibleIndicator;
	}

	public void setExtendibleIndicator(YesNoIndicator ExtendibleIndicator) {
		this.ExtendibleIndicator = ExtendibleIndicator;
	}

	public DateTimePeriod getExtendiblePeriod() {
		return ExtendiblePeriod;
	}

	public void setExtendiblePeriod(DateTimePeriod ExtendiblePeriod) {
		this.ExtendiblePeriod = ExtendiblePeriod;
	}

	public CurrencyAndAmount getOverAllotmentAmount() {
		return OverAllotmentAmount;
	}

	public void setOverAllotmentAmount(CurrencyAndAmount OverAllotmentAmount) {
		this.OverAllotmentAmount = OverAllotmentAmount;
	}

	public PercentageRate getOverAllotmentRate() {
		return OverAllotmentRate;
	}

	public void setOverAllotmentRate(PercentageRate OverAllotmentRate) {
		this.OverAllotmentRate = OverAllotmentRate;
	}

	public YesNoIndicator getAmortisableIndicator() {
		return AmortisableIndicator;
	}

	public void setAmortisableIndicator(YesNoIndicator AmortisableIndicator) {
		this.AmortisableIndicator = AmortisableIndicator;
	}

	public DistributionPolicyCode getCapitalisedInterest() {
		return CapitalisedInterest;
	}

	public void setCapitalisedInterest(
			DistributionPolicyCode CapitalisedInterest) {
		this.CapitalisedInterest = CapitalisedInterest;
	}

	public CurrencyAndAmount getActualDenominationAmount() {
		return ActualDenominationAmount;
	}

	public void setActualDenominationAmount(
			CurrencyAndAmount ActualDenominationAmount) {
		this.ActualDenominationAmount = ActualDenominationAmount;
	}

	public DecimalNumber getPieces() {
		return Pieces;
	}

	public void setPieces(DecimalNumber Pieces) {
		this.Pieces = Pieces;
	}

	public DecimalNumber getPoolsMaximum() {
		return PoolsMaximum;
	}

	public void setPoolsMaximum(DecimalNumber PoolsMaximum) {
		this.PoolsMaximum = PoolsMaximum;
	}

	public DecimalNumber getPoolsPerMillion() {
		return PoolsPerMillion;
	}

	public void setPoolsPerMillion(DecimalNumber PoolsPerMillion) {
		this.PoolsPerMillion = PoolsPerMillion;
	}

	public DecimalNumber getPoolsPerLot() {
		return PoolsPerLot;
	}

	public void setPoolsPerLot(DecimalNumber PoolsPerLot) {
		this.PoolsPerLot = PoolsPerLot;
	}

	public DecimalNumber getPoolsPerTrade() {
		return PoolsPerTrade;
	}

	public void setPoolsPerTrade(DecimalNumber PoolsPerTrade) {
		this.PoolsPerTrade = PoolsPerTrade;
	}

	public YesNoIndicator getConstantPrePaymentPenalty() {
		return ConstantPrePaymentPenalty;
	}

	public void setConstantPrePaymentPenalty(
			YesNoIndicator ConstantPrePaymentPenalty) {
		this.ConstantPrePaymentPenalty = ConstantPrePaymentPenalty;
	}

	public PrePaymentSpeedCode getPrePaymentSpeed() {
		return PrePaymentSpeed;
	}

	public void setPrePaymentSpeed(PrePaymentSpeedCode PrePaymentSpeed) {
		this.PrePaymentSpeed = PrePaymentSpeed;
	}

	public PercentageRate getConstantPrePaymentYield() {
		return ConstantPrePaymentYield;
	}

	public void setConstantPrePaymentYield(
			PercentageRate ConstantPrePaymentYield) {
		this.ConstantPrePaymentYield = ConstantPrePaymentYield;
	}

	public PercentageRate getWeightedAverageCoupon() {
		return WeightedAverageCoupon;
	}

	public void setWeightedAverageCoupon(PercentageRate WeightedAverageCoupon) {
		this.WeightedAverageCoupon = WeightedAverageCoupon;
	}

	public DecimalNumber getWeightedAverageLife() {
		return WeightedAverageLife;
	}

	public void setWeightedAverageLife(DecimalNumber WeightedAverageLife) {
		this.WeightedAverageLife = WeightedAverageLife;
	}

	public DecimalNumber getWeightedAverageLoan() {
		return WeightedAverageLoan;
	}

	public void setWeightedAverageLoan(DecimalNumber WeightedAverageLoan) {
		this.WeightedAverageLoan = WeightedAverageLoan;
	}

	public DecimalNumber getWeightedAverageMaturity() {
		return WeightedAverageMaturity;
	}

	public void setWeightedAverageMaturity(DecimalNumber WeightedAverageMaturity) {
		this.WeightedAverageMaturity = WeightedAverageMaturity;
	}

	public YesNoIndicator getInsuredIndicator() {
		return InsuredIndicator;
	}

	public void setInsuredIndicator(YesNoIndicator InsuredIndicator) {
		this.InsuredIndicator = InsuredIndicator;
	}

	public YesNoIndicator getBankQualified() {
		return BankQualified;
	}

	public void setBankQualified(YesNoIndicator BankQualified) {
		this.BankQualified = BankQualified;
	}

	public PercentageRate getAutoReinvestment() {
		return AutoReinvestment;
	}

	public void setAutoReinvestment(PercentageRate AutoReinvestment) {
		this.AutoReinvestment = AutoReinvestment;
	}

	public DateTimePeriod getCustomDate() {
		return CustomDate;
	}

	public void setCustomDate(DateTimePeriod CustomDate) {
		this.CustomDate = CustomDate;
	}

	public Number getLookBack() {
		return LookBack;
	}

	public void setLookBack(Number LookBack) {
		this.LookBack = LookBack;
	}

	public SecuritiesQuantity getMinimumDenomination() {
		return MinimumDenomination;
	}

	public void setMinimumDenomination(SecuritiesQuantity MinimumDenomination) {
		this.MinimumDenomination = MinimumDenomination;
	}

	public Number getMaximumSubstitution() {
		return MaximumSubstitution;
	}

	public void setMaximumSubstitution(Number MaximumSubstitution) {
		this.MaximumSubstitution = MaximumSubstitution;
	}

	public SecuritiesQuantity getMinimumIncrement() {
		return MinimumIncrement;
	}

	public void setMinimumIncrement(SecuritiesQuantity MinimumIncrement) {
		this.MinimumIncrement = MinimumIncrement;
	}

	public Max350Text getProduction() {
		return Production;
	}

	public void setProduction(Max350Text Production) {
		this.Production = Production;
	}

	public YesNoIndicator getRestricted() {
		return Restricted;
	}

	public void setRestricted(YesNoIndicator Restricted) {
		this.Restricted = Restricted;
	}

	public FrequencyCode getPriceFrequency() {
		return PriceFrequency;
	}

	public void setPriceFrequency(FrequencyCode PriceFrequency) {
		this.PriceFrequency = PriceFrequency;
	}

	public FrequencyCode getSubstitutionFrequency() {
		return SubstitutionFrequency;
	}

	public void setSubstitutionFrequency(FrequencyCode SubstitutionFrequency) {
		this.SubstitutionFrequency = SubstitutionFrequency;
	}

	public Number getSubstitutionLeft() {
		return SubstitutionLeft;
	}

	public void setSubstitutionLeft(Number SubstitutionLeft) {
		this.SubstitutionLeft = SubstitutionLeft;
	}

	public YesNoIndicator getWholePool() {
		return WholePool;
	}

	public void setWholePool(YesNoIndicator WholePool) {
		this.WholePool = WholePool;
	}

	public YesNoIndicator getAlternativeMinimumTax() {
		return AlternativeMinimumTax;
	}

	public void setAlternativeMinimumTax(YesNoIndicator AlternativeMinimumTax) {
		this.AlternativeMinimumTax = AlternativeMinimumTax;
	}

	public InterestCalculation getNextInterest() {
		return NextInterest;
	}

	public void setNextInterest(InterestCalculation NextInterest) {
		this.NextInterest = NextInterest;
	}

	public ISODateTime getExtendibleDate() {
		return ExtendibleDate;
	}

	public void setExtendibleDate(ISODateTime ExtendibleDate) {
		this.ExtendibleDate = ExtendibleDate;
	}

	public YesNoIndicator getSinkableIndicator() {
		return SinkableIndicator;
	}

	public void setSinkableIndicator(YesNoIndicator SinkableIndicator) {
		this.SinkableIndicator = SinkableIndicator;
	}

	public YesNoIndicator getInsured() {
		return Insured;
	}

	public void setInsured(YesNoIndicator Insured) {
		this.Insured = Insured;
	}

	public Max35Text getGeographics() {
		return Geographics;
	}

	public void setGeographics(Max35Text Geographics) {
		this.Geographics = Geographics;
	}

	public CurrencyCode getPaymentCurrency() {
		return PaymentCurrency;
	}

	public void setPaymentCurrency(CurrencyCode PaymentCurrency) {
		this.PaymentCurrency = PaymentCurrency;
	}

	public SecuritiesPricing getDirtyPrice() {
		return DirtyPrice;
	}

	public void setDirtyPrice(SecuritiesPricing DirtyPrice) {
		this.DirtyPrice = DirtyPrice;
	}

	public DebtInstrumentSeniorityTypeCode getDebtSeniority() {
		return DebtSeniority;
	}

	public void setDebtSeniority(DebtInstrumentSeniorityTypeCode DebtSeniority) {
		this.DebtSeniority = DebtSeniority;
	}
}