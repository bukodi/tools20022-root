package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.StandingOrder;
import com.tools20022.repository.dict.entity.PaymentInstruction;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.entity.ValuationStatistics;
import com.tools20022.repository.dict.entity.PerformanceFactors;
import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.entity.CorporateActionOption;
import com.tools20022.repository.dict.entity.SecuritiesProceedsDefinition;
import com.tools20022.repository.dict.entity.SuspensionPeriod;
import com.tools20022.repository.dict.entity.InterestCalculation;
import com.tools20022.repository.dict.entity.BiddingConditions;
import com.tools20022.repository.dict.entity.ClassAction;
import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.entity.Debt;
import com.tools20022.repository.dict.entity.SecuritiesConversion;
import com.tools20022.repository.dict.entity.YieldCalculation;
import com.tools20022.repository.dict.entity.TaxPeriod;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.Agreement;
import com.tools20022.repository.dict.entity.ProductDelivery;
import com.tools20022.repository.dict.entity.Invoice;
import com.tools20022.repository.dict.entity.TradeCertificate;
import com.tools20022.repository.dict.entity.PortfolioValuation;
import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.entity.AccountRestriction;
import com.tools20022.repository.dict.entity.BankOperation;
import com.tools20022.repository.dict.entity.Limit;
import com.tools20022.repository.dict.entity.PartyIdentificationInformation;
import com.tools20022.repository.dict.entity.Scheme;
import com.tools20022.repository.dict.entity.Distribution;
import com.tools20022.repository.dict.entity.Guarantee;
import com.tools20022.repository.dict.entity.ComponentSecurity;
import com.tools20022.repository.dict.entity.TradingSession;
import com.tools20022.repository.dict.entity.FinancialInstrumentSwap;
import com.tools20022.repository.dict.entity.PostalAddress;
import com.tools20022.repository.dict.entity.RedemptionSchedule;
import com.tools20022.repository.dict.entity.AccountLink;
import com.tools20022.repository.dict.entity.Adjustment;
import com.tools20022.repository.dict.entity.SecuritiesIdentification;
import com.tools20022.repository.dict.entity.StandingSettlementInstruction;
import com.tools20022.repository.dict.entity.BasicSecuritiesRegistration;
import com.tools20022.repository.dict.entity.AmountAndPeriod;
import com.tools20022.repository.dict.entity.InvestmentPlan;
import com.tools20022.repository.dict.entity.Issuance;
import com.tools20022.repository.dict.entity.PaymentTerms;
import com.tools20022.repository.dict.entity.PercentageAndPeriod;
import com.tools20022.repository.dict.entity.RolePlayer;
import com.tools20022.repository.dict.entity.SystemAvailability;

/**
 * Time span defined by a start date and time, and an end date and time.
 */
public class DateTimePeriod {

	private ISODateTime FromDateTime;
	private ISODateTime ToDateTime;
	private StandingOrder RelatedStandingOrder;
	private PaymentInstruction PaymentInstruction;
	private Number NumberOfDays;
	private ValuationStatistics ValuationStatistics;
	private PerformanceFactors PerformanceFactors;
	private Status Status;
	private SecuritiesPricing PriceCalculationRelatedPricing;
	private CorporateActionOption CorporateActionOption;
	private SecuritiesProceedsDefinition ParallelTradingProceedsDefinition;
	private SuspensionPeriod PrivilegeSuspensionCorporateAction;
	private SuspensionPeriod WithdrawalSuspensionRelatedEvent;
	private InterestCalculation RelatedInterestCalculation;
	private BiddingConditions BiddingConditions;
	private ClassAction ClassAction;
	private SuspensionPeriod BookEntryTransferSuspensionRelatedEvent;
	private SuspensionPeriod DepositAtAgentSuspensionRelatedEvent;
	private SuspensionPeriod DepositSuspensionRelatedEvent;
	private SuspensionPeriod PledgeSuspensionRelatedEvent;
	private SuspensionPeriod SegregationPeriodRelatedEvent;
	private SuspensionPeriod WithdrawalAtAgentSuspensionRelatedEvent;
	private SuspensionPeriod WithdrawalInNomineeNameSuspensionRelatedEvent;
	private SuspensionPeriod WithdrawalInStreetNameSuspensionRelatedEvent;
	private CorporateActionEvent BookClosureCorporateAction;
	private SuspensionPeriod CoDepositoriesSuspensionRelatedEvent;
	private Debt ExtendiblePeriodDebt;
	private SecuritiesConversion SecuritiesConversion;
	private YieldCalculation YieldCalculation;
	private Debt CustomDateDebt;
	private TaxPeriod TaxPeriod;
	private Account Account;
	private Agreement RelatedAgreement;
	private SecuritiesProceedsDefinition AssentedLinePeriodProceedsDefinition;
	private SecuritiesProceedsDefinition SellThruIssuerProceedsDefinition;
	private ProductDelivery RelatedProductDelivery;
	private Invoice RelatedInvoice;
	private TradeCertificate TradeCertificate;
	private PortfolioValuation RelatedPortfolioValuation;
	private System System;
	private AccountRestriction AccountRestriction;
	private BankOperation BankOperation;
	private CorporateActionEvent RelatedCorporateAction;
	private Limit RelatedLimit;
	private PartyIdentificationInformation RelatedIdentification;
	private Scheme AssessmentValidityScheme;
	private Distribution ExercisePeriodDistribution;
	private Distribution OfferPeriodDistribution;
	private Distribution TradingPeriodDistribution;
	private Distribution BlockingPeriodDistribution;
	private Guarantee Guarantee;
	private SecuritiesPricing PriceFactRelatedPricing;
	private Distribution CashDistribution;
	private ComponentSecurity ComponentSecurity;
	private TradingSession TradingSession;
	private FinancialInstrumentSwap FinancialInstrumentSwap;
	private PostalAddress RelatedPostalAddress;
	private RedemptionSchedule RedemptionSchedule;
	private AccountLink RelatedAccountLink;
	private Adjustment RelatedAdjustment;
	private SecuritiesIdentification RelatedSecuritiesIdentification;
	private StandingSettlementInstruction RelatedStandingSettlementInstruction;
	private BasicSecuritiesRegistration RelatedSecuritiesRegistration;
	private AmountAndPeriod Amount;
	private InvestmentPlan RelatedInvestmentPlan;
	private Issuance Issuance;
	private PaymentTerms RelatedPaymentTerms;
	private PercentageAndPeriod Percentage;
	private RolePlayer RelatedRolePlayer;
	private SystemAvailability RelatedSystemAvailability;

	public ISODateTime getFromDateTime() {
		return FromDateTime;
	}

	public void setFromDateTime(ISODateTime FromDateTime) {
		this.FromDateTime = FromDateTime;
	}

	public ISODateTime getToDateTime() {
		return ToDateTime;
	}

	public void setToDateTime(ISODateTime ToDateTime) {
		this.ToDateTime = ToDateTime;
	}

	public StandingOrder getRelatedStandingOrder() {
		return RelatedStandingOrder;
	}

	public void setRelatedStandingOrder(StandingOrder RelatedStandingOrder) {
		this.RelatedStandingOrder = RelatedStandingOrder;
	}

	public PaymentInstruction getPaymentInstruction() {
		return PaymentInstruction;
	}

	public void setPaymentInstruction(PaymentInstruction PaymentInstruction) {
		this.PaymentInstruction = PaymentInstruction;
	}

	public Number getNumberOfDays() {
		return NumberOfDays;
	}

	public void setNumberOfDays(Number NumberOfDays) {
		this.NumberOfDays = NumberOfDays;
	}

	public ValuationStatistics getValuationStatistics() {
		return ValuationStatistics;
	}

	public void setValuationStatistics(ValuationStatistics ValuationStatistics) {
		this.ValuationStatistics = ValuationStatistics;
	}

	public PerformanceFactors getPerformanceFactors() {
		return PerformanceFactors;
	}

	public void setPerformanceFactors(PerformanceFactors PerformanceFactors) {
		this.PerformanceFactors = PerformanceFactors;
	}

	public Status getStatus() {
		return Status;
	}

	public void setStatus(Status Status) {
		this.Status = Status;
	}

	public SecuritiesPricing getPriceCalculationRelatedPricing() {
		return PriceCalculationRelatedPricing;
	}

	public void setPriceCalculationRelatedPricing(
			SecuritiesPricing PriceCalculationRelatedPricing) {
		this.PriceCalculationRelatedPricing = PriceCalculationRelatedPricing;
	}

	public CorporateActionOption getCorporateActionOption() {
		return CorporateActionOption;
	}

	public void setCorporateActionOption(
			CorporateActionOption CorporateActionOption) {
		this.CorporateActionOption = CorporateActionOption;
	}

	public SecuritiesProceedsDefinition getParallelTradingProceedsDefinition() {
		return ParallelTradingProceedsDefinition;
	}

	public void setParallelTradingProceedsDefinition(
			SecuritiesProceedsDefinition ParallelTradingProceedsDefinition) {
		this.ParallelTradingProceedsDefinition = ParallelTradingProceedsDefinition;
	}

	public SuspensionPeriod getPrivilegeSuspensionCorporateAction() {
		return PrivilegeSuspensionCorporateAction;
	}

	public void setPrivilegeSuspensionCorporateAction(
			SuspensionPeriod PrivilegeSuspensionCorporateAction) {
		this.PrivilegeSuspensionCorporateAction = PrivilegeSuspensionCorporateAction;
	}

	public SuspensionPeriod getWithdrawalSuspensionRelatedEvent() {
		return WithdrawalSuspensionRelatedEvent;
	}

	public void setWithdrawalSuspensionRelatedEvent(
			SuspensionPeriod WithdrawalSuspensionRelatedEvent) {
		this.WithdrawalSuspensionRelatedEvent = WithdrawalSuspensionRelatedEvent;
	}

	public InterestCalculation getRelatedInterestCalculation() {
		return RelatedInterestCalculation;
	}

	public void setRelatedInterestCalculation(
			InterestCalculation RelatedInterestCalculation) {
		this.RelatedInterestCalculation = RelatedInterestCalculation;
	}

	public BiddingConditions getBiddingConditions() {
		return BiddingConditions;
	}

	public void setBiddingConditions(BiddingConditions BiddingConditions) {
		this.BiddingConditions = BiddingConditions;
	}

	public ClassAction getClassAction() {
		return ClassAction;
	}

	public void setClassAction(ClassAction ClassAction) {
		this.ClassAction = ClassAction;
	}

	public SuspensionPeriod getBookEntryTransferSuspensionRelatedEvent() {
		return BookEntryTransferSuspensionRelatedEvent;
	}

	public void setBookEntryTransferSuspensionRelatedEvent(
			SuspensionPeriod BookEntryTransferSuspensionRelatedEvent) {
		this.BookEntryTransferSuspensionRelatedEvent = BookEntryTransferSuspensionRelatedEvent;
	}

	public SuspensionPeriod getDepositAtAgentSuspensionRelatedEvent() {
		return DepositAtAgentSuspensionRelatedEvent;
	}

	public void setDepositAtAgentSuspensionRelatedEvent(
			SuspensionPeriod DepositAtAgentSuspensionRelatedEvent) {
		this.DepositAtAgentSuspensionRelatedEvent = DepositAtAgentSuspensionRelatedEvent;
	}

	public SuspensionPeriod getDepositSuspensionRelatedEvent() {
		return DepositSuspensionRelatedEvent;
	}

	public void setDepositSuspensionRelatedEvent(
			SuspensionPeriod DepositSuspensionRelatedEvent) {
		this.DepositSuspensionRelatedEvent = DepositSuspensionRelatedEvent;
	}

	public SuspensionPeriod getPledgeSuspensionRelatedEvent() {
		return PledgeSuspensionRelatedEvent;
	}

	public void setPledgeSuspensionRelatedEvent(
			SuspensionPeriod PledgeSuspensionRelatedEvent) {
		this.PledgeSuspensionRelatedEvent = PledgeSuspensionRelatedEvent;
	}

	public SuspensionPeriod getSegregationPeriodRelatedEvent() {
		return SegregationPeriodRelatedEvent;
	}

	public void setSegregationPeriodRelatedEvent(
			SuspensionPeriod SegregationPeriodRelatedEvent) {
		this.SegregationPeriodRelatedEvent = SegregationPeriodRelatedEvent;
	}

	public SuspensionPeriod getWithdrawalAtAgentSuspensionRelatedEvent() {
		return WithdrawalAtAgentSuspensionRelatedEvent;
	}

	public void setWithdrawalAtAgentSuspensionRelatedEvent(
			SuspensionPeriod WithdrawalAtAgentSuspensionRelatedEvent) {
		this.WithdrawalAtAgentSuspensionRelatedEvent = WithdrawalAtAgentSuspensionRelatedEvent;
	}

	public SuspensionPeriod getWithdrawalInNomineeNameSuspensionRelatedEvent() {
		return WithdrawalInNomineeNameSuspensionRelatedEvent;
	}

	public void setWithdrawalInNomineeNameSuspensionRelatedEvent(
			SuspensionPeriod WithdrawalInNomineeNameSuspensionRelatedEvent) {
		this.WithdrawalInNomineeNameSuspensionRelatedEvent = WithdrawalInNomineeNameSuspensionRelatedEvent;
	}

	public SuspensionPeriod getWithdrawalInStreetNameSuspensionRelatedEvent() {
		return WithdrawalInStreetNameSuspensionRelatedEvent;
	}

	public void setWithdrawalInStreetNameSuspensionRelatedEvent(
			SuspensionPeriod WithdrawalInStreetNameSuspensionRelatedEvent) {
		this.WithdrawalInStreetNameSuspensionRelatedEvent = WithdrawalInStreetNameSuspensionRelatedEvent;
	}

	public CorporateActionEvent getBookClosureCorporateAction() {
		return BookClosureCorporateAction;
	}

	public void setBookClosureCorporateAction(
			CorporateActionEvent BookClosureCorporateAction) {
		this.BookClosureCorporateAction = BookClosureCorporateAction;
	}

	public SuspensionPeriod getCoDepositoriesSuspensionRelatedEvent() {
		return CoDepositoriesSuspensionRelatedEvent;
	}

	public void setCoDepositoriesSuspensionRelatedEvent(
			SuspensionPeriod CoDepositoriesSuspensionRelatedEvent) {
		this.CoDepositoriesSuspensionRelatedEvent = CoDepositoriesSuspensionRelatedEvent;
	}

	public Debt getExtendiblePeriodDebt() {
		return ExtendiblePeriodDebt;
	}

	public void setExtendiblePeriodDebt(Debt ExtendiblePeriodDebt) {
		this.ExtendiblePeriodDebt = ExtendiblePeriodDebt;
	}

	public SecuritiesConversion getSecuritiesConversion() {
		return SecuritiesConversion;
	}

	public void setSecuritiesConversion(
			SecuritiesConversion SecuritiesConversion) {
		this.SecuritiesConversion = SecuritiesConversion;
	}

	public YieldCalculation getYieldCalculation() {
		return YieldCalculation;
	}

	public void setYieldCalculation(YieldCalculation YieldCalculation) {
		this.YieldCalculation = YieldCalculation;
	}

	public Debt getCustomDateDebt() {
		return CustomDateDebt;
	}

	public void setCustomDateDebt(Debt CustomDateDebt) {
		this.CustomDateDebt = CustomDateDebt;
	}

	public TaxPeriod getTaxPeriod() {
		return TaxPeriod;
	}

	public void setTaxPeriod(TaxPeriod TaxPeriod) {
		this.TaxPeriod = TaxPeriod;
	}

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}

	public Agreement getRelatedAgreement() {
		return RelatedAgreement;
	}

	public void setRelatedAgreement(Agreement RelatedAgreement) {
		this.RelatedAgreement = RelatedAgreement;
	}

	public SecuritiesProceedsDefinition getAssentedLinePeriodProceedsDefinition() {
		return AssentedLinePeriodProceedsDefinition;
	}

	public void setAssentedLinePeriodProceedsDefinition(
			SecuritiesProceedsDefinition AssentedLinePeriodProceedsDefinition) {
		this.AssentedLinePeriodProceedsDefinition = AssentedLinePeriodProceedsDefinition;
	}

	public SecuritiesProceedsDefinition getSellThruIssuerProceedsDefinition() {
		return SellThruIssuerProceedsDefinition;
	}

	public void setSellThruIssuerProceedsDefinition(
			SecuritiesProceedsDefinition SellThruIssuerProceedsDefinition) {
		this.SellThruIssuerProceedsDefinition = SellThruIssuerProceedsDefinition;
	}

	public ProductDelivery getRelatedProductDelivery() {
		return RelatedProductDelivery;
	}

	public void setRelatedProductDelivery(ProductDelivery RelatedProductDelivery) {
		this.RelatedProductDelivery = RelatedProductDelivery;
	}

	public Invoice getRelatedInvoice() {
		return RelatedInvoice;
	}

	public void setRelatedInvoice(Invoice RelatedInvoice) {
		this.RelatedInvoice = RelatedInvoice;
	}

	public TradeCertificate getTradeCertificate() {
		return TradeCertificate;
	}

	public void setTradeCertificate(TradeCertificate TradeCertificate) {
		this.TradeCertificate = TradeCertificate;
	}

	public PortfolioValuation getRelatedPortfolioValuation() {
		return RelatedPortfolioValuation;
	}

	public void setRelatedPortfolioValuation(
			PortfolioValuation RelatedPortfolioValuation) {
		this.RelatedPortfolioValuation = RelatedPortfolioValuation;
	}

	public System getSystem() {
		return System;
	}

	public void setSystem(System System) {
		this.System = System;
	}

	public AccountRestriction getAccountRestriction() {
		return AccountRestriction;
	}

	public void setAccountRestriction(AccountRestriction AccountRestriction) {
		this.AccountRestriction = AccountRestriction;
	}

	public BankOperation getBankOperation() {
		return BankOperation;
	}

	public void setBankOperation(BankOperation BankOperation) {
		this.BankOperation = BankOperation;
	}

	public CorporateActionEvent getRelatedCorporateAction() {
		return RelatedCorporateAction;
	}

	public void setRelatedCorporateAction(
			CorporateActionEvent RelatedCorporateAction) {
		this.RelatedCorporateAction = RelatedCorporateAction;
	}

	public Limit getRelatedLimit() {
		return RelatedLimit;
	}

	public void setRelatedLimit(Limit RelatedLimit) {
		this.RelatedLimit = RelatedLimit;
	}

	public PartyIdentificationInformation getRelatedIdentification() {
		return RelatedIdentification;
	}

	public void setRelatedIdentification(
			PartyIdentificationInformation RelatedIdentification) {
		this.RelatedIdentification = RelatedIdentification;
	}

	public Scheme getAssessmentValidityScheme() {
		return AssessmentValidityScheme;
	}

	public void setAssessmentValidityScheme(Scheme AssessmentValidityScheme) {
		this.AssessmentValidityScheme = AssessmentValidityScheme;
	}

	public Distribution getExercisePeriodDistribution() {
		return ExercisePeriodDistribution;
	}

	public void setExercisePeriodDistribution(
			Distribution ExercisePeriodDistribution) {
		this.ExercisePeriodDistribution = ExercisePeriodDistribution;
	}

	public Distribution getOfferPeriodDistribution() {
		return OfferPeriodDistribution;
	}

	public void setOfferPeriodDistribution(Distribution OfferPeriodDistribution) {
		this.OfferPeriodDistribution = OfferPeriodDistribution;
	}

	public Distribution getTradingPeriodDistribution() {
		return TradingPeriodDistribution;
	}

	public void setTradingPeriodDistribution(
			Distribution TradingPeriodDistribution) {
		this.TradingPeriodDistribution = TradingPeriodDistribution;
	}

	public Distribution getBlockingPeriodDistribution() {
		return BlockingPeriodDistribution;
	}

	public void setBlockingPeriodDistribution(
			Distribution BlockingPeriodDistribution) {
		this.BlockingPeriodDistribution = BlockingPeriodDistribution;
	}

	public Guarantee getGuarantee() {
		return Guarantee;
	}

	public void setGuarantee(Guarantee Guarantee) {
		this.Guarantee = Guarantee;
	}

	public SecuritiesPricing getPriceFactRelatedPricing() {
		return PriceFactRelatedPricing;
	}

	public void setPriceFactRelatedPricing(
			SecuritiesPricing PriceFactRelatedPricing) {
		this.PriceFactRelatedPricing = PriceFactRelatedPricing;
	}

	public Distribution getCashDistribution() {
		return CashDistribution;
	}

	public void setCashDistribution(Distribution CashDistribution) {
		this.CashDistribution = CashDistribution;
	}

	public ComponentSecurity getComponentSecurity() {
		return ComponentSecurity;
	}

	public void setComponentSecurity(ComponentSecurity ComponentSecurity) {
		this.ComponentSecurity = ComponentSecurity;
	}

	public TradingSession getTradingSession() {
		return TradingSession;
	}

	public void setTradingSession(TradingSession TradingSession) {
		this.TradingSession = TradingSession;
	}

	public FinancialInstrumentSwap getFinancialInstrumentSwap() {
		return FinancialInstrumentSwap;
	}

	public void setFinancialInstrumentSwap(
			FinancialInstrumentSwap FinancialInstrumentSwap) {
		this.FinancialInstrumentSwap = FinancialInstrumentSwap;
	}

	public PostalAddress getRelatedPostalAddress() {
		return RelatedPostalAddress;
	}

	public void setRelatedPostalAddress(PostalAddress RelatedPostalAddress) {
		this.RelatedPostalAddress = RelatedPostalAddress;
	}

	public RedemptionSchedule getRedemptionSchedule() {
		return RedemptionSchedule;
	}

	public void setRedemptionSchedule(RedemptionSchedule RedemptionSchedule) {
		this.RedemptionSchedule = RedemptionSchedule;
	}

	public AccountLink getRelatedAccountLink() {
		return RelatedAccountLink;
	}

	public void setRelatedAccountLink(AccountLink RelatedAccountLink) {
		this.RelatedAccountLink = RelatedAccountLink;
	}

	public Adjustment getRelatedAdjustment() {
		return RelatedAdjustment;
	}

	public void setRelatedAdjustment(Adjustment RelatedAdjustment) {
		this.RelatedAdjustment = RelatedAdjustment;
	}

	public SecuritiesIdentification getRelatedSecuritiesIdentification() {
		return RelatedSecuritiesIdentification;
	}

	public void setRelatedSecuritiesIdentification(
			SecuritiesIdentification RelatedSecuritiesIdentification) {
		this.RelatedSecuritiesIdentification = RelatedSecuritiesIdentification;
	}

	public StandingSettlementInstruction getRelatedStandingSettlementInstruction() {
		return RelatedStandingSettlementInstruction;
	}

	public void setRelatedStandingSettlementInstruction(
			StandingSettlementInstruction RelatedStandingSettlementInstruction) {
		this.RelatedStandingSettlementInstruction = RelatedStandingSettlementInstruction;
	}

	public BasicSecuritiesRegistration getRelatedSecuritiesRegistration() {
		return RelatedSecuritiesRegistration;
	}

	public void setRelatedSecuritiesRegistration(
			BasicSecuritiesRegistration RelatedSecuritiesRegistration) {
		this.RelatedSecuritiesRegistration = RelatedSecuritiesRegistration;
	}

	public AmountAndPeriod getAmount() {
		return Amount;
	}

	public void setAmount(AmountAndPeriod Amount) {
		this.Amount = Amount;
	}

	public InvestmentPlan getRelatedInvestmentPlan() {
		return RelatedInvestmentPlan;
	}

	public void setRelatedInvestmentPlan(InvestmentPlan RelatedInvestmentPlan) {
		this.RelatedInvestmentPlan = RelatedInvestmentPlan;
	}

	public Issuance getIssuance() {
		return Issuance;
	}

	public void setIssuance(Issuance Issuance) {
		this.Issuance = Issuance;
	}

	public PaymentTerms getRelatedPaymentTerms() {
		return RelatedPaymentTerms;
	}

	public void setRelatedPaymentTerms(PaymentTerms RelatedPaymentTerms) {
		this.RelatedPaymentTerms = RelatedPaymentTerms;
	}

	public PercentageAndPeriod getPercentage() {
		return Percentage;
	}

	public void setPercentage(PercentageAndPeriod Percentage) {
		this.Percentage = Percentage;
	}

	public RolePlayer getRelatedRolePlayer() {
		return RelatedRolePlayer;
	}

	public void setRelatedRolePlayer(RolePlayer RelatedRolePlayer) {
		this.RelatedRolePlayer = RelatedRolePlayer;
	}

	public SystemAvailability getRelatedSystemAvailability() {
		return RelatedSystemAvailability;
	}

	public void setRelatedSystemAvailability(
			SystemAvailability RelatedSystemAvailability) {
		this.RelatedSystemAvailability = RelatedSystemAvailability;
	}
}