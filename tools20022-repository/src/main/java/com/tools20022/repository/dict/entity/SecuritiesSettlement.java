package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Settlement;
import com.tools20022.repository.dict.entity.SecuritiesTransfer;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.ReceiveDeliveryCode;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.SecuritiesTradeExecution;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.codeset.SettlementTransactionConditionCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.MarketClientSideCode;
import com.tools20022.repository.dict.codeset.PreConfirmationCode;
import com.tools20022.repository.dict.codeset.BlockTradeCode;
import com.tools20022.repository.dict.codeset.SettlementSystemMethodCode;
import com.tools20022.repository.dict.codeset.AutoBorrowingCode;
import com.tools20022.repository.dict.entity.SafekeepingPlace;
import com.tools20022.repository.dict.entity.PairOff;
import com.tools20022.repository.dict.entity.Interest;
import com.tools20022.repository.dict.entity.SecuritiesClearing;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.entity.Allocation;
import com.tools20022.repository.dict.entity.ForeignExchangeTrade;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.entity.Position;
import com.tools20022.repository.dict.entity.Rollover;
import com.tools20022.repository.dict.codeset.ObligationTypeCode;
import com.tools20022.repository.dict.codeset.DeliveryReceiptTypeCode;

/**
 * Settlement of the securities in a securities transaction, that is, the
 * instruction to deliver or receive securities, involving the payment of an
 * amount of money or not.
 */
public class SecuritiesSettlement extends Settlement
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesTransfer TransferOperation;
	private ISODateTime SettlementDate;
	private SecuritiesSettlementPartyRole PartyRole;
	private ActiveCurrencyAndAmount SettlementAmount;
	private Max35Text HoldingsPlanType;
	private ReceiveDeliveryCode SecuritiesMovementType;
	private SecuritiesQuantity SettlementQuantity;
	private SecuritiesTradeExecution SecuritiesTradeExecution;
	private CurrencyCode CurrencyToBuy;
	private CurrencyCode CurrencyToSell;
	private Max35Text DenominationChoice;
	private SettlementTransactionConditionCode SettlementTransactionCondition;
	private YesNoIndicator BeneficialOwnershipIndicator;
	private MarketClientSideCode MarketClientSide;
	private YesNoIndicator Tracking;
	private YesNoIndicator LetterOfGuarantee;
	private YesNoIndicator EligibleForCollateral;
	private YesNoIndicator AccruedInterestIndicator;
	private PreConfirmationCode PreConfirmation;
	private YesNoIndicator SecuritiesRealTimeGrossSettlement;
	private BlockTradeCode BlockTrade;
	private SettlementSystemMethodCode SettlementSystemMethod;
	private AutoBorrowingCode AutomaticBorrowing;
	private YesNoIndicator PartialSettlementIndicator;
	private YesNoIndicator HoldIndicator;
	private SafekeepingPlace RequestedSafekeepingPlace;
	private PairOff PairOff;
	private Interest AccruedInterest;
	private SecuritiesClearing SecuritiesClearing;
	private Payment Payment;
	private Allocation SettledAllocation;
	private ForeignExchangeTrade RelatedForeignExchangeOperation;
	private Security Security;
	private Position Position;
	private Rollover Rollover;
	private SecuritiesQuantity TurnedQuantity;
	private ObligationTypeCode SettlementReason;
	private DeliveryReceiptTypeCode SettlementType;

	public SecuritiesTransfer getTransferOperation() {
		return TransferOperation;
	}

	public void setTransferOperation(SecuritiesTransfer TransferOperation) {
		this.TransferOperation = TransferOperation;
	}

	public ISODateTime getSettlementDate() {
		return SettlementDate;
	}

	public void setSettlementDate(ISODateTime SettlementDate) {
		this.SettlementDate = SettlementDate;
	}

	public SecuritiesSettlementPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(SecuritiesSettlementPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public ActiveCurrencyAndAmount getSettlementAmount() {
		return SettlementAmount;
	}

	public void setSettlementAmount(ActiveCurrencyAndAmount SettlementAmount) {
		this.SettlementAmount = SettlementAmount;
	}

	public Max35Text getHoldingsPlanType() {
		return HoldingsPlanType;
	}

	public void setHoldingsPlanType(Max35Text HoldingsPlanType) {
		this.HoldingsPlanType = HoldingsPlanType;
	}

	public ReceiveDeliveryCode getSecuritiesMovementType() {
		return SecuritiesMovementType;
	}

	public void setSecuritiesMovementType(
			ReceiveDeliveryCode SecuritiesMovementType) {
		this.SecuritiesMovementType = SecuritiesMovementType;
	}

	public SecuritiesQuantity getSettlementQuantity() {
		return SettlementQuantity;
	}

	public void setSettlementQuantity(SecuritiesQuantity SettlementQuantity) {
		this.SettlementQuantity = SettlementQuantity;
	}

	public SecuritiesTradeExecution getSecuritiesTradeExecution() {
		return SecuritiesTradeExecution;
	}

	public void setSecuritiesTradeExecution(
			SecuritiesTradeExecution SecuritiesTradeExecution) {
		this.SecuritiesTradeExecution = SecuritiesTradeExecution;
	}

	public CurrencyCode getCurrencyToBuy() {
		return CurrencyToBuy;
	}

	public void setCurrencyToBuy(CurrencyCode CurrencyToBuy) {
		this.CurrencyToBuy = CurrencyToBuy;
	}

	public CurrencyCode getCurrencyToSell() {
		return CurrencyToSell;
	}

	public void setCurrencyToSell(CurrencyCode CurrencyToSell) {
		this.CurrencyToSell = CurrencyToSell;
	}

	public Max35Text getDenominationChoice() {
		return DenominationChoice;
	}

	public void setDenominationChoice(Max35Text DenominationChoice) {
		this.DenominationChoice = DenominationChoice;
	}

	public SettlementTransactionConditionCode getSettlementTransactionCondition() {
		return SettlementTransactionCondition;
	}

	public void setSettlementTransactionCondition(
			SettlementTransactionConditionCode SettlementTransactionCondition) {
		this.SettlementTransactionCondition = SettlementTransactionCondition;
	}

	public YesNoIndicator getBeneficialOwnershipIndicator() {
		return BeneficialOwnershipIndicator;
	}

	public void setBeneficialOwnershipIndicator(
			YesNoIndicator BeneficialOwnershipIndicator) {
		this.BeneficialOwnershipIndicator = BeneficialOwnershipIndicator;
	}

	public MarketClientSideCode getMarketClientSide() {
		return MarketClientSide;
	}

	public void setMarketClientSide(MarketClientSideCode MarketClientSide) {
		this.MarketClientSide = MarketClientSide;
	}

	public YesNoIndicator getTracking() {
		return Tracking;
	}

	public void setTracking(YesNoIndicator Tracking) {
		this.Tracking = Tracking;
	}

	public YesNoIndicator getLetterOfGuarantee() {
		return LetterOfGuarantee;
	}

	public void setLetterOfGuarantee(YesNoIndicator LetterOfGuarantee) {
		this.LetterOfGuarantee = LetterOfGuarantee;
	}

	public YesNoIndicator getEligibleForCollateral() {
		return EligibleForCollateral;
	}

	public void setEligibleForCollateral(YesNoIndicator EligibleForCollateral) {
		this.EligibleForCollateral = EligibleForCollateral;
	}

	public YesNoIndicator getAccruedInterestIndicator() {
		return AccruedInterestIndicator;
	}

	public void setAccruedInterestIndicator(
			YesNoIndicator AccruedInterestIndicator) {
		this.AccruedInterestIndicator = AccruedInterestIndicator;
	}

	public PreConfirmationCode getPreConfirmation() {
		return PreConfirmation;
	}

	public void setPreConfirmation(PreConfirmationCode PreConfirmation) {
		this.PreConfirmation = PreConfirmation;
	}

	public YesNoIndicator getSecuritiesRealTimeGrossSettlement() {
		return SecuritiesRealTimeGrossSettlement;
	}

	public void setSecuritiesRealTimeGrossSettlement(
			YesNoIndicator SecuritiesRealTimeGrossSettlement) {
		this.SecuritiesRealTimeGrossSettlement = SecuritiesRealTimeGrossSettlement;
	}

	public BlockTradeCode getBlockTrade() {
		return BlockTrade;
	}

	public void setBlockTrade(BlockTradeCode BlockTrade) {
		this.BlockTrade = BlockTrade;
	}

	public SettlementSystemMethodCode getSettlementSystemMethod() {
		return SettlementSystemMethod;
	}

	public void setSettlementSystemMethod(
			SettlementSystemMethodCode SettlementSystemMethod) {
		this.SettlementSystemMethod = SettlementSystemMethod;
	}

	public AutoBorrowingCode getAutomaticBorrowing() {
		return AutomaticBorrowing;
	}

	public void setAutomaticBorrowing(AutoBorrowingCode AutomaticBorrowing) {
		this.AutomaticBorrowing = AutomaticBorrowing;
	}

	public YesNoIndicator getPartialSettlementIndicator() {
		return PartialSettlementIndicator;
	}

	public void setPartialSettlementIndicator(
			YesNoIndicator PartialSettlementIndicator) {
		this.PartialSettlementIndicator = PartialSettlementIndicator;
	}

	public YesNoIndicator getHoldIndicator() {
		return HoldIndicator;
	}

	public void setHoldIndicator(YesNoIndicator HoldIndicator) {
		this.HoldIndicator = HoldIndicator;
	}

	public SafekeepingPlace getRequestedSafekeepingPlace() {
		return RequestedSafekeepingPlace;
	}

	public void setRequestedSafekeepingPlace(
			SafekeepingPlace RequestedSafekeepingPlace) {
		this.RequestedSafekeepingPlace = RequestedSafekeepingPlace;
	}

	public PairOff getPairOff() {
		return PairOff;
	}

	public void setPairOff(PairOff PairOff) {
		this.PairOff = PairOff;
	}

	public Interest getAccruedInterest() {
		return AccruedInterest;
	}

	public void setAccruedInterest(Interest AccruedInterest) {
		this.AccruedInterest = AccruedInterest;
	}

	public SecuritiesClearing getSecuritiesClearing() {
		return SecuritiesClearing;
	}

	public void setSecuritiesClearing(SecuritiesClearing SecuritiesClearing) {
		this.SecuritiesClearing = SecuritiesClearing;
	}

	public Payment getPayment() {
		return Payment;
	}

	public void setPayment(Payment Payment) {
		this.Payment = Payment;
	}

	public Allocation getSettledAllocation() {
		return SettledAllocation;
	}

	public void setSettledAllocation(Allocation SettledAllocation) {
		this.SettledAllocation = SettledAllocation;
	}

	public ForeignExchangeTrade getRelatedForeignExchangeOperation() {
		return RelatedForeignExchangeOperation;
	}

	public void setRelatedForeignExchangeOperation(
			ForeignExchangeTrade RelatedForeignExchangeOperation) {
		this.RelatedForeignExchangeOperation = RelatedForeignExchangeOperation;
	}

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public Position getPosition() {
		return Position;
	}

	public void setPosition(Position Position) {
		this.Position = Position;
	}

	public Rollover getRollover() {
		return Rollover;
	}

	public void setRollover(Rollover Rollover) {
		this.Rollover = Rollover;
	}

	public SecuritiesQuantity getTurnedQuantity() {
		return TurnedQuantity;
	}

	public void setTurnedQuantity(SecuritiesQuantity TurnedQuantity) {
		this.TurnedQuantity = TurnedQuantity;
	}

	public ObligationTypeCode getSettlementReason() {
		return SettlementReason;
	}

	public void setSettlementReason(ObligationTypeCode SettlementReason) {
		this.SettlementReason = SettlementReason;
	}

	public DeliveryReceiptTypeCode getSettlementType() {
		return SettlementType;
	}

	public void setSettlementType(DeliveryReceiptTypeCode SettlementType) {
		this.SettlementType = SettlementType;
	}
}