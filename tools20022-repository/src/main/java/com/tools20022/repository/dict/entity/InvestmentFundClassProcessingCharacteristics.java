package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.EventFrequencyCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.codeset.SignatureTypeCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.TimeFrame;
import com.tools20022.repository.dict.entity.InvestmentFundClass;
import com.tools20022.repository.dict.codeset.HoldingTransferableCode;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.Country;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.Max70Text;

/**
 * Processing characteristics linked to the instrument, ie, not to the market.
 */
public class InvestmentFundClassProcessingCharacteristics {

	private EventFrequencyCode ReinvestmentFrequency;
	private YesNoIndicator FrontEndLoadIndicator;
	private YesNoIndicator BackEndLoadIndicator;
	private YesNoIndicator SwitchingFeeIndicator;
	private Max350Text LimitedSubscriptionPeriod;
	private Max350Text LimitedRedemptionPeriod;
	private Number Decimalisation;
	private YesNoIndicator HoldingTransferableIndicator;
	private YesNoIndicator ApplicationForm;
	private SignatureTypeCode SignatureRequired;
	private YesNoIndicator AmountIndicator;
	private YesNoIndicator UnitsIndicator;
	private ISODateTime OrderCutOffDateTime;
	private TimeFrame SettlementCycle;
	private InvestmentFundClass FundClass;
	private HoldingTransferableCode HoldingTransferable;
	private FrequencyCode DealingFrequency;
	private Max350Text LimitedPeriod;
	private Account SettlementAccount;
	private Country Country;
	private ContactPoint LocalMarketAnnex;
	private ISODateTime EffectiveDate;
	private YesNoIndicator SubsequentSubscriptionApplicationForm;
	private YesNoIndicator RedemptionForm;
	private CurrencyCode DealingCurrency;
	private TimeFrame DealingCutOffTimeFrame;
	private ActiveCurrencyAndAmount MinimumHoldingAmount;
	private DecimalNumber MaximumRedemptionUnits;
	private DecimalNumber MinimumHoldingUnits;
	private CurrencyAndAmount MinimumRemainingHoldingAmount;
	private PercentageRate MaximumRedemptionPercentage;
	private CurrencyAndAmount MaximumRedemptionAmount;
	private DecimalNumber MinimumInitialSubscriptionUnits;
	private CurrencyAndAmount MinimumSubscriptionAmount;
	private CurrencyAndAmount MinimumInitialSubscriptionAmount;
	private DecimalNumber MinimumSubscriptionUnits;
	private Max70Text MinimumHoldingPeriod;

	public EventFrequencyCode getReinvestmentFrequency() {
		return ReinvestmentFrequency;
	}

	public void setReinvestmentFrequency(
			EventFrequencyCode ReinvestmentFrequency) {
		this.ReinvestmentFrequency = ReinvestmentFrequency;
	}

	public YesNoIndicator getFrontEndLoadIndicator() {
		return FrontEndLoadIndicator;
	}

	public void setFrontEndLoadIndicator(YesNoIndicator FrontEndLoadIndicator) {
		this.FrontEndLoadIndicator = FrontEndLoadIndicator;
	}

	public YesNoIndicator getBackEndLoadIndicator() {
		return BackEndLoadIndicator;
	}

	public void setBackEndLoadIndicator(YesNoIndicator BackEndLoadIndicator) {
		this.BackEndLoadIndicator = BackEndLoadIndicator;
	}

	public YesNoIndicator getSwitchingFeeIndicator() {
		return SwitchingFeeIndicator;
	}

	public void setSwitchingFeeIndicator(YesNoIndicator SwitchingFeeIndicator) {
		this.SwitchingFeeIndicator = SwitchingFeeIndicator;
	}

	public Max350Text getLimitedSubscriptionPeriod() {
		return LimitedSubscriptionPeriod;
	}

	public void setLimitedSubscriptionPeriod(
			Max350Text LimitedSubscriptionPeriod) {
		this.LimitedSubscriptionPeriod = LimitedSubscriptionPeriod;
	}

	public Max350Text getLimitedRedemptionPeriod() {
		return LimitedRedemptionPeriod;
	}

	public void setLimitedRedemptionPeriod(Max350Text LimitedRedemptionPeriod) {
		this.LimitedRedemptionPeriod = LimitedRedemptionPeriod;
	}

	public Number getDecimalisation() {
		return Decimalisation;
	}

	public void setDecimalisation(Number Decimalisation) {
		this.Decimalisation = Decimalisation;
	}

	public YesNoIndicator getHoldingTransferableIndicator() {
		return HoldingTransferableIndicator;
	}

	public void setHoldingTransferableIndicator(
			YesNoIndicator HoldingTransferableIndicator) {
		this.HoldingTransferableIndicator = HoldingTransferableIndicator;
	}

	public YesNoIndicator getApplicationForm() {
		return ApplicationForm;
	}

	public void setApplicationForm(YesNoIndicator ApplicationForm) {
		this.ApplicationForm = ApplicationForm;
	}

	public SignatureTypeCode getSignatureRequired() {
		return SignatureRequired;
	}

	public void setSignatureRequired(SignatureTypeCode SignatureRequired) {
		this.SignatureRequired = SignatureRequired;
	}

	public YesNoIndicator getAmountIndicator() {
		return AmountIndicator;
	}

	public void setAmountIndicator(YesNoIndicator AmountIndicator) {
		this.AmountIndicator = AmountIndicator;
	}

	public YesNoIndicator getUnitsIndicator() {
		return UnitsIndicator;
	}

	public void setUnitsIndicator(YesNoIndicator UnitsIndicator) {
		this.UnitsIndicator = UnitsIndicator;
	}

	public ISODateTime getOrderCutOffDateTime() {
		return OrderCutOffDateTime;
	}

	public void setOrderCutOffDateTime(ISODateTime OrderCutOffDateTime) {
		this.OrderCutOffDateTime = OrderCutOffDateTime;
	}

	public TimeFrame getSettlementCycle() {
		return SettlementCycle;
	}

	public void setSettlementCycle(TimeFrame SettlementCycle) {
		this.SettlementCycle = SettlementCycle;
	}

	public InvestmentFundClass getFundClass() {
		return FundClass;
	}

	public void setFundClass(InvestmentFundClass FundClass) {
		this.FundClass = FundClass;
	}

	public HoldingTransferableCode getHoldingTransferable() {
		return HoldingTransferable;
	}

	public void setHoldingTransferable(
			HoldingTransferableCode HoldingTransferable) {
		this.HoldingTransferable = HoldingTransferable;
	}

	public FrequencyCode getDealingFrequency() {
		return DealingFrequency;
	}

	public void setDealingFrequency(FrequencyCode DealingFrequency) {
		this.DealingFrequency = DealingFrequency;
	}

	public Max350Text getLimitedPeriod() {
		return LimitedPeriod;
	}

	public void setLimitedPeriod(Max350Text LimitedPeriod) {
		this.LimitedPeriod = LimitedPeriod;
	}

	public Account getSettlementAccount() {
		return SettlementAccount;
	}

	public void setSettlementAccount(Account SettlementAccount) {
		this.SettlementAccount = SettlementAccount;
	}

	public Country getCountry() {
		return Country;
	}

	public void setCountry(Country Country) {
		this.Country = Country;
	}

	public ContactPoint getLocalMarketAnnex() {
		return LocalMarketAnnex;
	}

	public void setLocalMarketAnnex(ContactPoint LocalMarketAnnex) {
		this.LocalMarketAnnex = LocalMarketAnnex;
	}

	public ISODateTime getEffectiveDate() {
		return EffectiveDate;
	}

	public void setEffectiveDate(ISODateTime EffectiveDate) {
		this.EffectiveDate = EffectiveDate;
	}

	public YesNoIndicator getSubsequentSubscriptionApplicationForm() {
		return SubsequentSubscriptionApplicationForm;
	}

	public void setSubsequentSubscriptionApplicationForm(
			YesNoIndicator SubsequentSubscriptionApplicationForm) {
		this.SubsequentSubscriptionApplicationForm = SubsequentSubscriptionApplicationForm;
	}

	public YesNoIndicator getRedemptionForm() {
		return RedemptionForm;
	}

	public void setRedemptionForm(YesNoIndicator RedemptionForm) {
		this.RedemptionForm = RedemptionForm;
	}

	public CurrencyCode getDealingCurrency() {
		return DealingCurrency;
	}

	public void setDealingCurrency(CurrencyCode DealingCurrency) {
		this.DealingCurrency = DealingCurrency;
	}

	public TimeFrame getDealingCutOffTimeFrame() {
		return DealingCutOffTimeFrame;
	}

	public void setDealingCutOffTimeFrame(TimeFrame DealingCutOffTimeFrame) {
		this.DealingCutOffTimeFrame = DealingCutOffTimeFrame;
	}

	public ActiveCurrencyAndAmount getMinimumHoldingAmount() {
		return MinimumHoldingAmount;
	}

	public void setMinimumHoldingAmount(
			ActiveCurrencyAndAmount MinimumHoldingAmount) {
		this.MinimumHoldingAmount = MinimumHoldingAmount;
	}

	public DecimalNumber getMaximumRedemptionUnits() {
		return MaximumRedemptionUnits;
	}

	public void setMaximumRedemptionUnits(DecimalNumber MaximumRedemptionUnits) {
		this.MaximumRedemptionUnits = MaximumRedemptionUnits;
	}

	public DecimalNumber getMinimumHoldingUnits() {
		return MinimumHoldingUnits;
	}

	public void setMinimumHoldingUnits(DecimalNumber MinimumHoldingUnits) {
		this.MinimumHoldingUnits = MinimumHoldingUnits;
	}

	public CurrencyAndAmount getMinimumRemainingHoldingAmount() {
		return MinimumRemainingHoldingAmount;
	}

	public void setMinimumRemainingHoldingAmount(
			CurrencyAndAmount MinimumRemainingHoldingAmount) {
		this.MinimumRemainingHoldingAmount = MinimumRemainingHoldingAmount;
	}

	public PercentageRate getMaximumRedemptionPercentage() {
		return MaximumRedemptionPercentage;
	}

	public void setMaximumRedemptionPercentage(
			PercentageRate MaximumRedemptionPercentage) {
		this.MaximumRedemptionPercentage = MaximumRedemptionPercentage;
	}

	public CurrencyAndAmount getMaximumRedemptionAmount() {
		return MaximumRedemptionAmount;
	}

	public void setMaximumRedemptionAmount(
			CurrencyAndAmount MaximumRedemptionAmount) {
		this.MaximumRedemptionAmount = MaximumRedemptionAmount;
	}

	public DecimalNumber getMinimumInitialSubscriptionUnits() {
		return MinimumInitialSubscriptionUnits;
	}

	public void setMinimumInitialSubscriptionUnits(
			DecimalNumber MinimumInitialSubscriptionUnits) {
		this.MinimumInitialSubscriptionUnits = MinimumInitialSubscriptionUnits;
	}

	public CurrencyAndAmount getMinimumSubscriptionAmount() {
		return MinimumSubscriptionAmount;
	}

	public void setMinimumSubscriptionAmount(
			CurrencyAndAmount MinimumSubscriptionAmount) {
		this.MinimumSubscriptionAmount = MinimumSubscriptionAmount;
	}

	public CurrencyAndAmount getMinimumInitialSubscriptionAmount() {
		return MinimumInitialSubscriptionAmount;
	}

	public void setMinimumInitialSubscriptionAmount(
			CurrencyAndAmount MinimumInitialSubscriptionAmount) {
		this.MinimumInitialSubscriptionAmount = MinimumInitialSubscriptionAmount;
	}

	public DecimalNumber getMinimumSubscriptionUnits() {
		return MinimumSubscriptionUnits;
	}

	public void setMinimumSubscriptionUnits(
			DecimalNumber MinimumSubscriptionUnits) {
		this.MinimumSubscriptionUnits = MinimumSubscriptionUnits;
	}

	public Max70Text getMinimumHoldingPeriod() {
		return MinimumHoldingPeriod;
	}

	public void setMinimumHoldingPeriod(Max70Text MinimumHoldingPeriod) {
		this.MinimumHoldingPeriod = MinimumHoldingPeriod;
	}
}