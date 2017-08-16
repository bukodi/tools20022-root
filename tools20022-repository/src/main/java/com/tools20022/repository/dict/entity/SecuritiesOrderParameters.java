package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.SecuritiesPegOrderInstruction;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.codeset.AutoRoutingCode;
import com.tools20022.repository.dict.codeset.IncomePreferenceCode;
import com.tools20022.repository.dict.codeset.ExecutionTimeLimitCode;
import com.tools20022.repository.dict.datatype.Max16Text;
import com.tools20022.repository.dict.codeset.PriorityCode;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.codeset.TradingFloorOrderHandlingCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.BookPriorityIndicatorCode;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.codeset.GoodTillBookingInstructionCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.CustomerHandlingInstructionsCode;
import com.tools20022.repository.dict.codeset.CommissionTypeV2Code;
import com.tools20022.repository.dict.entity.SecuritiesOrder;

/**
 * Parameters of the transfer of a financial instrument.
 */
public class SecuritiesOrderParameters extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesQuantity MinimumQuantity;
	private SecuritiesQuantity MatchIncrement;
	private SecuritiesPegOrderInstruction PegInstructions;
	private SecuritiesPricing PreviousClosingPrice;
	private AutoRoutingCode AutoRouting;
	private IncomePreferenceCode CorporateActionOptionIndicator;
	private ExecutionTimeLimitCode ExecutionTimeLimit;
	private Max16Text PreAllocationConditionIndicator;
	private PriorityCode PriorityIndicator;
	private CurrencyCode RequestedDealCurrency;
	private TradingFloorOrderHandlingCode OrderHandlingInstruction;
	private YesNoIndicator StockLocateRequired;
	private YesNoIndicator WorkingIndicator;
	private BookPriorityIndicatorCode BookPriorityIndicator;
	private Number MaxPriceLevels;
	private YesNoIndicator PreTradeAnonymity;
	private GoodTillBookingInstructionCode GoodTillBooking;
	private YesNoIndicator ManualOrderIndicator;
	private YesNoIndicator DirectedOrder;
	private Max35Text ReceivedDepartment;
	private CustomerHandlingInstructionsCode CustomerHandlingInstruction;
	private CommissionTypeV2Code ProcessCode;
	private SecuritiesOrder RelatedSecuritiesOrder;

	public SecuritiesQuantity getMinimumQuantity() {
		return MinimumQuantity;
	}

	public void setMinimumQuantity(SecuritiesQuantity MinimumQuantity) {
		this.MinimumQuantity = MinimumQuantity;
	}

	public SecuritiesQuantity getMatchIncrement() {
		return MatchIncrement;
	}

	public void setMatchIncrement(SecuritiesQuantity MatchIncrement) {
		this.MatchIncrement = MatchIncrement;
	}

	public SecuritiesPegOrderInstruction getPegInstructions() {
		return PegInstructions;
	}

	public void setPegInstructions(SecuritiesPegOrderInstruction PegInstructions) {
		this.PegInstructions = PegInstructions;
	}

	public SecuritiesPricing getPreviousClosingPrice() {
		return PreviousClosingPrice;
	}

	public void setPreviousClosingPrice(SecuritiesPricing PreviousClosingPrice) {
		this.PreviousClosingPrice = PreviousClosingPrice;
	}

	public AutoRoutingCode getAutoRouting() {
		return AutoRouting;
	}

	public void setAutoRouting(AutoRoutingCode AutoRouting) {
		this.AutoRouting = AutoRouting;
	}

	public IncomePreferenceCode getCorporateActionOptionIndicator() {
		return CorporateActionOptionIndicator;
	}

	public void setCorporateActionOptionIndicator(
			IncomePreferenceCode CorporateActionOptionIndicator) {
		this.CorporateActionOptionIndicator = CorporateActionOptionIndicator;
	}

	public ExecutionTimeLimitCode getExecutionTimeLimit() {
		return ExecutionTimeLimit;
	}

	public void setExecutionTimeLimit(ExecutionTimeLimitCode ExecutionTimeLimit) {
		this.ExecutionTimeLimit = ExecutionTimeLimit;
	}

	public Max16Text getPreAllocationConditionIndicator() {
		return PreAllocationConditionIndicator;
	}

	public void setPreAllocationConditionIndicator(
			Max16Text PreAllocationConditionIndicator) {
		this.PreAllocationConditionIndicator = PreAllocationConditionIndicator;
	}

	public PriorityCode getPriorityIndicator() {
		return PriorityIndicator;
	}

	public void setPriorityIndicator(PriorityCode PriorityIndicator) {
		this.PriorityIndicator = PriorityIndicator;
	}

	public CurrencyCode getRequestedDealCurrency() {
		return RequestedDealCurrency;
	}

	public void setRequestedDealCurrency(CurrencyCode RequestedDealCurrency) {
		this.RequestedDealCurrency = RequestedDealCurrency;
	}

	public TradingFloorOrderHandlingCode getOrderHandlingInstruction() {
		return OrderHandlingInstruction;
	}

	public void setOrderHandlingInstruction(
			TradingFloorOrderHandlingCode OrderHandlingInstruction) {
		this.OrderHandlingInstruction = OrderHandlingInstruction;
	}

	public YesNoIndicator getStockLocateRequired() {
		return StockLocateRequired;
	}

	public void setStockLocateRequired(YesNoIndicator StockLocateRequired) {
		this.StockLocateRequired = StockLocateRequired;
	}

	public YesNoIndicator getWorkingIndicator() {
		return WorkingIndicator;
	}

	public void setWorkingIndicator(YesNoIndicator WorkingIndicator) {
		this.WorkingIndicator = WorkingIndicator;
	}

	public BookPriorityIndicatorCode getBookPriorityIndicator() {
		return BookPriorityIndicator;
	}

	public void setBookPriorityIndicator(
			BookPriorityIndicatorCode BookPriorityIndicator) {
		this.BookPriorityIndicator = BookPriorityIndicator;
	}

	public Number getMaxPriceLevels() {
		return MaxPriceLevels;
	}

	public void setMaxPriceLevels(Number MaxPriceLevels) {
		this.MaxPriceLevels = MaxPriceLevels;
	}

	public YesNoIndicator getPreTradeAnonymity() {
		return PreTradeAnonymity;
	}

	public void setPreTradeAnonymity(YesNoIndicator PreTradeAnonymity) {
		this.PreTradeAnonymity = PreTradeAnonymity;
	}

	public GoodTillBookingInstructionCode getGoodTillBooking() {
		return GoodTillBooking;
	}

	public void setGoodTillBooking(
			GoodTillBookingInstructionCode GoodTillBooking) {
		this.GoodTillBooking = GoodTillBooking;
	}

	public YesNoIndicator getManualOrderIndicator() {
		return ManualOrderIndicator;
	}

	public void setManualOrderIndicator(YesNoIndicator ManualOrderIndicator) {
		this.ManualOrderIndicator = ManualOrderIndicator;
	}

	public YesNoIndicator getDirectedOrder() {
		return DirectedOrder;
	}

	public void setDirectedOrder(YesNoIndicator DirectedOrder) {
		this.DirectedOrder = DirectedOrder;
	}

	public Max35Text getReceivedDepartment() {
		return ReceivedDepartment;
	}

	public void setReceivedDepartment(Max35Text ReceivedDepartment) {
		this.ReceivedDepartment = ReceivedDepartment;
	}

	public CustomerHandlingInstructionsCode getCustomerHandlingInstruction() {
		return CustomerHandlingInstruction;
	}

	public void setCustomerHandlingInstruction(
			CustomerHandlingInstructionsCode CustomerHandlingInstruction) {
		this.CustomerHandlingInstruction = CustomerHandlingInstruction;
	}

	public CommissionTypeV2Code getProcessCode() {
		return ProcessCode;
	}

	public void setProcessCode(CommissionTypeV2Code ProcessCode) {
		this.ProcessCode = ProcessCode;
	}

	public SecuritiesOrder getRelatedSecuritiesOrder() {
		return RelatedSecuritiesOrder;
	}

	public void setRelatedSecuritiesOrder(SecuritiesOrder RelatedSecuritiesOrder) {
		this.RelatedSecuritiesOrder = RelatedSecuritiesOrder;
	}
}