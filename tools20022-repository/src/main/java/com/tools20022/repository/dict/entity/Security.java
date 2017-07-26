package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Asset;
import com.tools20022.repository.dict.entity.SecuritiesIdentification;
import com.tools20022.repository.dict.codeset.CountryCode;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.codeset.FormOfSecurityCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.EUSavingsDirectiveCode;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.SecuritiesRelatedFees;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.entity.SecuritiesAccount;
import com.tools20022.repository.dict.entity.TradingMarket;
import com.tools20022.repository.dict.entity.BasicSecuritiesRegistration;
import com.tools20022.repository.dict.entity.SecuritiesRestriction;
import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.Spread;
import com.tools20022.repository.dict.entity.Dividend;
import com.tools20022.repository.dict.entity.SecuritiesBalance;
import com.tools20022.repository.dict.codeset.AppearanceCode;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.datatype.ISOYearMonth;
import com.tools20022.repository.dict.entity.Rating;
import com.tools20022.repository.dict.entity.CouponAttached;
import com.tools20022.repository.dict.entity.Sector;
import com.tools20022.repository.dict.entity.SecuritiesTax;
import com.tools20022.repository.dict.entity.SecuritiesTrade;
import com.tools20022.repository.dict.entity.Jurisdiction;
import com.tools20022.repository.dict.entity.SecuritiesPartyRole;
import com.tools20022.repository.dict.entity.SecuritiesStatus;
import com.tools20022.repository.dict.entity.SecuritiesModification;
import com.tools20022.repository.dict.entity.RedemptionSchedule;
import com.tools20022.repository.dict.entity.SecuritiesSettlement;
import com.tools20022.repository.dict.entity.SecuritiesTransfer;
import com.tools20022.repository.dict.entity.AgentCorporateActionStandingInstruction;
import com.tools20022.repository.dict.entity.Quote;
import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.entity.VariableInterest;
import com.tools20022.repository.dict.entity.SecuritiesConversion;
import com.tools20022.repository.dict.entity.ComponentSecurity;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.codeset.MaturityRedemptionTypeCode;
import com.tools20022.repository.dict.entity.MarginCall;
import com.tools20022.repository.dict.entity.Party;

/**
 * Financial instruments representing a sum of rights of the investor vis-a-vis
 * the issuer.
 */
public class Security extends Asset {

	private SecuritiesIdentification Identification;
	private CountryCode RegisteredDistributionCountry;
	private CurrencyCode DenominationCurrency;
	private FormOfSecurityCode RegistrationForm;
	private YesNoIndicator DematerialisedIndicator;
	private EUSavingsDirectiveCode EUSavingsDirective;
	private SecuritiesQuantity SecuritiesQuantity;
	private SecuritiesRelatedFees Fees;
	private SecuritiesPricing Pricing;
	private SecuritiesAccount SecuritiesAccount;
	private TradingMarket TradingMarket;
	private TradingMarket PlaceOfListing;
	private BasicSecuritiesRegistration Registration;
	private SecuritiesRestriction Restriction;
	private CorporateActionEvent CorporateEvent;
	private YesNoIndicator TemporaryFinancialInstrumentIndicator;
	private ISODateTime AvailableDate;
	private Max350Text DeclarationDetails;
	private Spread Spread;
	private Dividend Dividend;
	private SecuritiesBalance Balance;
	private YesNoIndicator FungibleIndicator;
	private AppearanceCode Appearance;
	private Number NearTermPositionLimit;
	private ISOYearMonth ContractSettlementMonth;
	private Number MinimumTradingPricingIncrement;
	private Rating Rating;
	private CouponAttached CouponAttached;
	private Sector Sector;
	private YesNoIndicator WarrantAttachedOnDelivery;
	private YesNoIndicator StrippableIndicator;
	private ISODateTime FirstDealingDate;
	private SecuritiesTax TaxDetails;
	private SecuritiesTrade SecuritiesTrade;
	private Jurisdiction RegistrationJurisdiction;
	private SecuritiesPartyRole PartyRole;
	private SecuritiesStatus SecurityStatus;
	private SecuritiesModification Modification;
	private RedemptionSchedule RedemptionSchedule;
	private SecuritiesSettlement SecuritiesSettlement;
	private SecuritiesTransfer SecuritiesTransfer;
	private AgentCorporateActionStandingInstruction CorporateActionStandingInstructions;
	private Quote Quote;
	private SecuritiesOrder SecuritiesOrder;
	private VariableInterest RelatedVariableInterest;
	private SecuritiesConversion Conversion;
	private ComponentSecurity ComponentSecurity;
	private YesNoIndicator RecompositionIndicator;
	private Max35Text Series;
	private PercentageRate PercentageOfDebtClaim;
	private PercentageRate CoverRate;
	private MaturityRedemptionTypeCode MaturityRedemption;
	private MarginCall RelatedMarginCall;
	private Party CloseLink;
	private YesNoIndicator PotentialEuroSystemEligibility;
	private SecuritiesQuantity MinimumQuantity;
	private YesNoIndicator RestrictedIndicator;

	public SecuritiesIdentification getIdentification() {
		return Identification;
	}

	public void setIdentification(SecuritiesIdentification Identification) {
		this.Identification = Identification;
	}

	public CountryCode getRegisteredDistributionCountry() {
		return RegisteredDistributionCountry;
	}

	public void setRegisteredDistributionCountry(
			CountryCode RegisteredDistributionCountry) {
		this.RegisteredDistributionCountry = RegisteredDistributionCountry;
	}

	public CurrencyCode getDenominationCurrency() {
		return DenominationCurrency;
	}

	public void setDenominationCurrency(CurrencyCode DenominationCurrency) {
		this.DenominationCurrency = DenominationCurrency;
	}

	public FormOfSecurityCode getRegistrationForm() {
		return RegistrationForm;
	}

	public void setRegistrationForm(FormOfSecurityCode RegistrationForm) {
		this.RegistrationForm = RegistrationForm;
	}

	public YesNoIndicator getDematerialisedIndicator() {
		return DematerialisedIndicator;
	}

	public void setDematerialisedIndicator(
			YesNoIndicator DematerialisedIndicator) {
		this.DematerialisedIndicator = DematerialisedIndicator;
	}

	public EUSavingsDirectiveCode getEUSavingsDirective() {
		return EUSavingsDirective;
	}

	public void setEUSavingsDirective(EUSavingsDirectiveCode EUSavingsDirective) {
		this.EUSavingsDirective = EUSavingsDirective;
	}

	public SecuritiesQuantity getSecuritiesQuantity() {
		return SecuritiesQuantity;
	}

	public void setSecuritiesQuantity(SecuritiesQuantity SecuritiesQuantity) {
		this.SecuritiesQuantity = SecuritiesQuantity;
	}

	public SecuritiesRelatedFees getFees() {
		return Fees;
	}

	public void setFees(SecuritiesRelatedFees Fees) {
		this.Fees = Fees;
	}

	public SecuritiesPricing getPricing() {
		return Pricing;
	}

	public void setPricing(SecuritiesPricing Pricing) {
		this.Pricing = Pricing;
	}

	public SecuritiesAccount getSecuritiesAccount() {
		return SecuritiesAccount;
	}

	public void setSecuritiesAccount(SecuritiesAccount SecuritiesAccount) {
		this.SecuritiesAccount = SecuritiesAccount;
	}

	public TradingMarket getTradingMarket() {
		return TradingMarket;
	}

	public void setTradingMarket(TradingMarket TradingMarket) {
		this.TradingMarket = TradingMarket;
	}

	public TradingMarket getPlaceOfListing() {
		return PlaceOfListing;
	}

	public void setPlaceOfListing(TradingMarket PlaceOfListing) {
		this.PlaceOfListing = PlaceOfListing;
	}

	public BasicSecuritiesRegistration getRegistration() {
		return Registration;
	}

	public void setRegistration(BasicSecuritiesRegistration Registration) {
		this.Registration = Registration;
	}

	public SecuritiesRestriction getRestriction() {
		return Restriction;
	}

	public void setRestriction(SecuritiesRestriction Restriction) {
		this.Restriction = Restriction;
	}

	public CorporateActionEvent getCorporateEvent() {
		return CorporateEvent;
	}

	public void setCorporateEvent(CorporateActionEvent CorporateEvent) {
		this.CorporateEvent = CorporateEvent;
	}

	public YesNoIndicator getTemporaryFinancialInstrumentIndicator() {
		return TemporaryFinancialInstrumentIndicator;
	}

	public void setTemporaryFinancialInstrumentIndicator(
			YesNoIndicator TemporaryFinancialInstrumentIndicator) {
		this.TemporaryFinancialInstrumentIndicator = TemporaryFinancialInstrumentIndicator;
	}

	public ISODateTime getAvailableDate() {
		return AvailableDate;
	}

	public void setAvailableDate(ISODateTime AvailableDate) {
		this.AvailableDate = AvailableDate;
	}

	public Max350Text getDeclarationDetails() {
		return DeclarationDetails;
	}

	public void setDeclarationDetails(Max350Text DeclarationDetails) {
		this.DeclarationDetails = DeclarationDetails;
	}

	public Spread getSpread() {
		return Spread;
	}

	public void setSpread(Spread Spread) {
		this.Spread = Spread;
	}

	public Dividend getDividend() {
		return Dividend;
	}

	public void setDividend(Dividend Dividend) {
		this.Dividend = Dividend;
	}

	public SecuritiesBalance getBalance() {
		return Balance;
	}

	public void setBalance(SecuritiesBalance Balance) {
		this.Balance = Balance;
	}

	public YesNoIndicator getFungibleIndicator() {
		return FungibleIndicator;
	}

	public void setFungibleIndicator(YesNoIndicator FungibleIndicator) {
		this.FungibleIndicator = FungibleIndicator;
	}

	public AppearanceCode getAppearance() {
		return Appearance;
	}

	public void setAppearance(AppearanceCode Appearance) {
		this.Appearance = Appearance;
	}

	public Number getNearTermPositionLimit() {
		return NearTermPositionLimit;
	}

	public void setNearTermPositionLimit(Number NearTermPositionLimit) {
		this.NearTermPositionLimit = NearTermPositionLimit;
	}

	public ISOYearMonth getContractSettlementMonth() {
		return ContractSettlementMonth;
	}

	public void setContractSettlementMonth(ISOYearMonth ContractSettlementMonth) {
		this.ContractSettlementMonth = ContractSettlementMonth;
	}

	public Number getMinimumTradingPricingIncrement() {
		return MinimumTradingPricingIncrement;
	}

	public void setMinimumTradingPricingIncrement(
			Number MinimumTradingPricingIncrement) {
		this.MinimumTradingPricingIncrement = MinimumTradingPricingIncrement;
	}

	public Rating getRating() {
		return Rating;
	}

	public void setRating(Rating Rating) {
		this.Rating = Rating;
	}

	public CouponAttached getCouponAttached() {
		return CouponAttached;
	}

	public void setCouponAttached(CouponAttached CouponAttached) {
		this.CouponAttached = CouponAttached;
	}

	public Sector getSector() {
		return Sector;
	}

	public void setSector(Sector Sector) {
		this.Sector = Sector;
	}

	public YesNoIndicator getWarrantAttachedOnDelivery() {
		return WarrantAttachedOnDelivery;
	}

	public void setWarrantAttachedOnDelivery(
			YesNoIndicator WarrantAttachedOnDelivery) {
		this.WarrantAttachedOnDelivery = WarrantAttachedOnDelivery;
	}

	public YesNoIndicator getStrippableIndicator() {
		return StrippableIndicator;
	}

	public void setStrippableIndicator(YesNoIndicator StrippableIndicator) {
		this.StrippableIndicator = StrippableIndicator;
	}

	public ISODateTime getFirstDealingDate() {
		return FirstDealingDate;
	}

	public void setFirstDealingDate(ISODateTime FirstDealingDate) {
		this.FirstDealingDate = FirstDealingDate;
	}

	public SecuritiesTax getTaxDetails() {
		return TaxDetails;
	}

	public void setTaxDetails(SecuritiesTax TaxDetails) {
		this.TaxDetails = TaxDetails;
	}

	public SecuritiesTrade getSecuritiesTrade() {
		return SecuritiesTrade;
	}

	public void setSecuritiesTrade(SecuritiesTrade SecuritiesTrade) {
		this.SecuritiesTrade = SecuritiesTrade;
	}

	public Jurisdiction getRegistrationJurisdiction() {
		return RegistrationJurisdiction;
	}

	public void setRegistrationJurisdiction(
			Jurisdiction RegistrationJurisdiction) {
		this.RegistrationJurisdiction = RegistrationJurisdiction;
	}

	public SecuritiesPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(SecuritiesPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public SecuritiesStatus getSecurityStatus() {
		return SecurityStatus;
	}

	public void setSecurityStatus(SecuritiesStatus SecurityStatus) {
		this.SecurityStatus = SecurityStatus;
	}

	public SecuritiesModification getModification() {
		return Modification;
	}

	public void setModification(SecuritiesModification Modification) {
		this.Modification = Modification;
	}

	public RedemptionSchedule getRedemptionSchedule() {
		return RedemptionSchedule;
	}

	public void setRedemptionSchedule(RedemptionSchedule RedemptionSchedule) {
		this.RedemptionSchedule = RedemptionSchedule;
	}

	public SecuritiesSettlement getSecuritiesSettlement() {
		return SecuritiesSettlement;
	}

	public void setSecuritiesSettlement(
			SecuritiesSettlement SecuritiesSettlement) {
		this.SecuritiesSettlement = SecuritiesSettlement;
	}

	public SecuritiesTransfer getSecuritiesTransfer() {
		return SecuritiesTransfer;
	}

	public void setSecuritiesTransfer(SecuritiesTransfer SecuritiesTransfer) {
		this.SecuritiesTransfer = SecuritiesTransfer;
	}

	public AgentCorporateActionStandingInstruction getCorporateActionStandingInstructions() {
		return CorporateActionStandingInstructions;
	}

	public void setCorporateActionStandingInstructions(
			AgentCorporateActionStandingInstruction CorporateActionStandingInstructions) {
		this.CorporateActionStandingInstructions = CorporateActionStandingInstructions;
	}

	public Quote getQuote() {
		return Quote;
	}

	public void setQuote(Quote Quote) {
		this.Quote = Quote;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return SecuritiesOrder;
	}

	public void setSecuritiesOrder(SecuritiesOrder SecuritiesOrder) {
		this.SecuritiesOrder = SecuritiesOrder;
	}

	public VariableInterest getRelatedVariableInterest() {
		return RelatedVariableInterest;
	}

	public void setRelatedVariableInterest(
			VariableInterest RelatedVariableInterest) {
		this.RelatedVariableInterest = RelatedVariableInterest;
	}

	public SecuritiesConversion getConversion() {
		return Conversion;
	}

	public void setConversion(SecuritiesConversion Conversion) {
		this.Conversion = Conversion;
	}

	public ComponentSecurity getComponentSecurity() {
		return ComponentSecurity;
	}

	public void setComponentSecurity(ComponentSecurity ComponentSecurity) {
		this.ComponentSecurity = ComponentSecurity;
	}

	public YesNoIndicator getRecompositionIndicator() {
		return RecompositionIndicator;
	}

	public void setRecompositionIndicator(YesNoIndicator RecompositionIndicator) {
		this.RecompositionIndicator = RecompositionIndicator;
	}

	public Max35Text getSeries() {
		return Series;
	}

	public void setSeries(Max35Text Series) {
		this.Series = Series;
	}

	public PercentageRate getPercentageOfDebtClaim() {
		return PercentageOfDebtClaim;
	}

	public void setPercentageOfDebtClaim(PercentageRate PercentageOfDebtClaim) {
		this.PercentageOfDebtClaim = PercentageOfDebtClaim;
	}

	public PercentageRate getCoverRate() {
		return CoverRate;
	}

	public void setCoverRate(PercentageRate CoverRate) {
		this.CoverRate = CoverRate;
	}

	public MaturityRedemptionTypeCode getMaturityRedemption() {
		return MaturityRedemption;
	}

	public void setMaturityRedemption(
			MaturityRedemptionTypeCode MaturityRedemption) {
		this.MaturityRedemption = MaturityRedemption;
	}

	public MarginCall getRelatedMarginCall() {
		return RelatedMarginCall;
	}

	public void setRelatedMarginCall(MarginCall RelatedMarginCall) {
		this.RelatedMarginCall = RelatedMarginCall;
	}

	public Party getCloseLink() {
		return CloseLink;
	}

	public void setCloseLink(Party CloseLink) {
		this.CloseLink = CloseLink;
	}

	public YesNoIndicator getPotentialEuroSystemEligibility() {
		return PotentialEuroSystemEligibility;
	}

	public void setPotentialEuroSystemEligibility(
			YesNoIndicator PotentialEuroSystemEligibility) {
		this.PotentialEuroSystemEligibility = PotentialEuroSystemEligibility;
	}

	public SecuritiesQuantity getMinimumQuantity() {
		return MinimumQuantity;
	}

	public void setMinimumQuantity(SecuritiesQuantity MinimumQuantity) {
		this.MinimumQuantity = MinimumQuantity;
	}

	public YesNoIndicator getRestrictedIndicator() {
		return RestrictedIndicator;
	}

	public void setRestrictedIndicator(YesNoIndicator RestrictedIndicator) {
		this.RestrictedIndicator = RestrictedIndicator;
	}
}