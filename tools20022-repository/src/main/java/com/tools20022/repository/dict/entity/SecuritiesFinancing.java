package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesTrade;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.SecuritiesTransactionTypeV2Code;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.Interest;
import com.tools20022.repository.dict.entity.Spread;
import com.tools20022.repository.dict.datatype.Max3NumericText;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.RepurchaseTypeCode;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.entity.SecuritiesFinancingAgreement;
import com.tools20022.repository.dict.entity.BuyOrSellIndicationOfInterest;

/**
 * Process of lending or borrowing cash or securities against securities or cash
 * collateral. It aims at optimising liquidity, support a trading strategy, or
 * increase settlement efficiency.
 */
public class SecuritiesFinancing extends SecuritiesTrade
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private YesNoIndicator ReturnLegInstruction;
	private SecuritiesTransactionTypeV2Code Type;
	private ISODateTime TerminationDateTime;
	private ISODateTime RateChangeDateTime;
	private YesNoIndicator RevaluationIndicator;
	private YesNoIndicator InterestPayment;
	private Max35Text VariableRateSupport;
	private PercentageRate RepurchaseRate;
	private PercentageRate StockLoanMargin;
	private Interest Interest;
	private Spread RepurchaseSpread;
	private Max3NumericText TransactionCallDelay;
	private Max3NumericText TotalNumberOfCollateralInstructions;
	private CurrencyAndAmount DealAmount;
	private CurrencyAndAmount ForfeitRepurchaseAmount;
	private CurrencyAndAmount PremiumAmount;
	private CurrencyAndAmount TerminationAmountPerPieceOfCollateral;
	private CurrencyAndAmount TerminationTransactionAmount;
	private YesNoIndicator MaturityDateModification;
	private ISODateTime EarliestCallBackDate;
	private ISODateTime OpeningSettlementDate;
	private RepurchaseTypeCode RepurchaseType;
	private SecuritiesPricing EndPrice;
	private YesNoIndicator SpreadTransaction;
	private SecuritiesFinancingAgreement FinancingAgreement;
	private CurrencyAndAmount OpeningSettlementAmount;
	private SecuritiesTrade ClosingLegExecution;
	private SecuritiesTrade OpeningLegExecution;
	private BuyOrSellIndicationOfInterest RelatedIndicationOfInterest;
	private Max35Text Identification;

	public YesNoIndicator getReturnLegInstruction() {
		return ReturnLegInstruction;
	}

	public void setReturnLegInstruction(YesNoIndicator ReturnLegInstruction) {
		this.ReturnLegInstruction = ReturnLegInstruction;
	}

	public SecuritiesTransactionTypeV2Code getType() {
		return Type;
	}

	public void setType(SecuritiesTransactionTypeV2Code Type) {
		this.Type = Type;
	}

	public ISODateTime getTerminationDateTime() {
		return TerminationDateTime;
	}

	public void setTerminationDateTime(ISODateTime TerminationDateTime) {
		this.TerminationDateTime = TerminationDateTime;
	}

	public ISODateTime getRateChangeDateTime() {
		return RateChangeDateTime;
	}

	public void setRateChangeDateTime(ISODateTime RateChangeDateTime) {
		this.RateChangeDateTime = RateChangeDateTime;
	}

	public YesNoIndicator getRevaluationIndicator() {
		return RevaluationIndicator;
	}

	public void setRevaluationIndicator(YesNoIndicator RevaluationIndicator) {
		this.RevaluationIndicator = RevaluationIndicator;
	}

	public YesNoIndicator getInterestPayment() {
		return InterestPayment;
	}

	public void setInterestPayment(YesNoIndicator InterestPayment) {
		this.InterestPayment = InterestPayment;
	}

	public Max35Text getVariableRateSupport() {
		return VariableRateSupport;
	}

	public void setVariableRateSupport(Max35Text VariableRateSupport) {
		this.VariableRateSupport = VariableRateSupport;
	}

	public PercentageRate getRepurchaseRate() {
		return RepurchaseRate;
	}

	public void setRepurchaseRate(PercentageRate RepurchaseRate) {
		this.RepurchaseRate = RepurchaseRate;
	}

	public PercentageRate getStockLoanMargin() {
		return StockLoanMargin;
	}

	public void setStockLoanMargin(PercentageRate StockLoanMargin) {
		this.StockLoanMargin = StockLoanMargin;
	}

	public Interest getInterest() {
		return Interest;
	}

	public void setInterest(Interest Interest) {
		this.Interest = Interest;
	}

	public Spread getRepurchaseSpread() {
		return RepurchaseSpread;
	}

	public void setRepurchaseSpread(Spread RepurchaseSpread) {
		this.RepurchaseSpread = RepurchaseSpread;
	}

	public Max3NumericText getTransactionCallDelay() {
		return TransactionCallDelay;
	}

	public void setTransactionCallDelay(Max3NumericText TransactionCallDelay) {
		this.TransactionCallDelay = TransactionCallDelay;
	}

	public Max3NumericText getTotalNumberOfCollateralInstructions() {
		return TotalNumberOfCollateralInstructions;
	}

	public void setTotalNumberOfCollateralInstructions(
			Max3NumericText TotalNumberOfCollateralInstructions) {
		this.TotalNumberOfCollateralInstructions = TotalNumberOfCollateralInstructions;
	}

	public CurrencyAndAmount getDealAmount() {
		return DealAmount;
	}

	public void setDealAmount(CurrencyAndAmount DealAmount) {
		this.DealAmount = DealAmount;
	}

	public CurrencyAndAmount getForfeitRepurchaseAmount() {
		return ForfeitRepurchaseAmount;
	}

	public void setForfeitRepurchaseAmount(
			CurrencyAndAmount ForfeitRepurchaseAmount) {
		this.ForfeitRepurchaseAmount = ForfeitRepurchaseAmount;
	}

	public CurrencyAndAmount getPremiumAmount() {
		return PremiumAmount;
	}

	public void setPremiumAmount(CurrencyAndAmount PremiumAmount) {
		this.PremiumAmount = PremiumAmount;
	}

	public CurrencyAndAmount getTerminationAmountPerPieceOfCollateral() {
		return TerminationAmountPerPieceOfCollateral;
	}

	public void setTerminationAmountPerPieceOfCollateral(
			CurrencyAndAmount TerminationAmountPerPieceOfCollateral) {
		this.TerminationAmountPerPieceOfCollateral = TerminationAmountPerPieceOfCollateral;
	}

	public CurrencyAndAmount getTerminationTransactionAmount() {
		return TerminationTransactionAmount;
	}

	public void setTerminationTransactionAmount(
			CurrencyAndAmount TerminationTransactionAmount) {
		this.TerminationTransactionAmount = TerminationTransactionAmount;
	}

	public YesNoIndicator getMaturityDateModification() {
		return MaturityDateModification;
	}

	public void setMaturityDateModification(
			YesNoIndicator MaturityDateModification) {
		this.MaturityDateModification = MaturityDateModification;
	}

	public ISODateTime getEarliestCallBackDate() {
		return EarliestCallBackDate;
	}

	public void setEarliestCallBackDate(ISODateTime EarliestCallBackDate) {
		this.EarliestCallBackDate = EarliestCallBackDate;
	}

	public ISODateTime getOpeningSettlementDate() {
		return OpeningSettlementDate;
	}

	public void setOpeningSettlementDate(ISODateTime OpeningSettlementDate) {
		this.OpeningSettlementDate = OpeningSettlementDate;
	}

	public RepurchaseTypeCode getRepurchaseType() {
		return RepurchaseType;
	}

	public void setRepurchaseType(RepurchaseTypeCode RepurchaseType) {
		this.RepurchaseType = RepurchaseType;
	}

	public SecuritiesPricing getEndPrice() {
		return EndPrice;
	}

	public void setEndPrice(SecuritiesPricing EndPrice) {
		this.EndPrice = EndPrice;
	}

	public YesNoIndicator getSpreadTransaction() {
		return SpreadTransaction;
	}

	public void setSpreadTransaction(YesNoIndicator SpreadTransaction) {
		this.SpreadTransaction = SpreadTransaction;
	}

	public SecuritiesFinancingAgreement getFinancingAgreement() {
		return FinancingAgreement;
	}

	public void setFinancingAgreement(
			SecuritiesFinancingAgreement FinancingAgreement) {
		this.FinancingAgreement = FinancingAgreement;
	}

	public CurrencyAndAmount getOpeningSettlementAmount() {
		return OpeningSettlementAmount;
	}

	public void setOpeningSettlementAmount(
			CurrencyAndAmount OpeningSettlementAmount) {
		this.OpeningSettlementAmount = OpeningSettlementAmount;
	}

	public SecuritiesTrade getClosingLegExecution() {
		return ClosingLegExecution;
	}

	public void setClosingLegExecution(SecuritiesTrade ClosingLegExecution) {
		this.ClosingLegExecution = ClosingLegExecution;
	}

	public SecuritiesTrade getOpeningLegExecution() {
		return OpeningLegExecution;
	}

	public void setOpeningLegExecution(SecuritiesTrade OpeningLegExecution) {
		this.OpeningLegExecution = OpeningLegExecution;
	}

	public BuyOrSellIndicationOfInterest getRelatedIndicationOfInterest() {
		return RelatedIndicationOfInterest;
	}

	public void setRelatedIndicationOfInterest(
			BuyOrSellIndicationOfInterest RelatedIndicationOfInterest) {
		this.RelatedIndicationOfInterest = RelatedIndicationOfInterest;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}
}