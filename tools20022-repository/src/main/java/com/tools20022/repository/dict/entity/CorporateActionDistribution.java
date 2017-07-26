package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.TaxVoucher;
import com.tools20022.repository.dict.entity.CorporateActionServicing;
import com.tools20022.repository.dict.codeset.DistributionTypeCode;
import com.tools20022.repository.dict.codeset.DistributionInstructionTypeCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.RoundingDirectionCode;
import com.tools20022.repository.dict.codeset.DebitCreditCode;
import com.tools20022.repository.dict.entity.CorporateActionOption;
import com.tools20022.repository.dict.entity.FinancialTransaction;
import com.tools20022.repository.dict.entity.CorporateActionProceedsDeliveryInstruction;

/**
 * Distribution of the proceeds of a CA event.
 */
public class CorporateActionDistribution {

	private SecuritiesQuantity PostingQuantity;
	private ISODateTime PostingDateTime;
	private ISODate MovementDate;
	private CurrencyAndAmount PostingAmount;
	private TaxVoucher TaxVoucher;
	private CorporateActionServicing RelatedServicing;
	private DistributionTypeCode OrderType;
	private DistributionInstructionTypeCode MovementType;
	private YesNoIndicator HighPriorityIndicator;
	private ISODate RequestedExecutionDate;
	private RoundingDirectionCode FractionTreatment;
	private DebitCreditCode CreditDebitIndicator;
	private CorporateActionOption Option;
	private CurrencyAndAmount NetAmount;
	private CurrencyAndAmount GrossAmount;
	private FinancialTransaction FinancialTransaction;
	private CorporateActionProceedsDeliveryInstruction CorporateActionProceedsDeliveryInstruction;

	public SecuritiesQuantity getPostingQuantity() {
		return PostingQuantity;
	}

	public void setPostingQuantity(SecuritiesQuantity PostingQuantity) {
		this.PostingQuantity = PostingQuantity;
	}

	public ISODateTime getPostingDateTime() {
		return PostingDateTime;
	}

	public void setPostingDateTime(ISODateTime PostingDateTime) {
		this.PostingDateTime = PostingDateTime;
	}

	public ISODate getMovementDate() {
		return MovementDate;
	}

	public void setMovementDate(ISODate MovementDate) {
		this.MovementDate = MovementDate;
	}

	public CurrencyAndAmount getPostingAmount() {
		return PostingAmount;
	}

	public void setPostingAmount(CurrencyAndAmount PostingAmount) {
		this.PostingAmount = PostingAmount;
	}

	public TaxVoucher getTaxVoucher() {
		return TaxVoucher;
	}

	public void setTaxVoucher(TaxVoucher TaxVoucher) {
		this.TaxVoucher = TaxVoucher;
	}

	public CorporateActionServicing getRelatedServicing() {
		return RelatedServicing;
	}

	public void setRelatedServicing(CorporateActionServicing RelatedServicing) {
		this.RelatedServicing = RelatedServicing;
	}

	public DistributionTypeCode getOrderType() {
		return OrderType;
	}

	public void setOrderType(DistributionTypeCode OrderType) {
		this.OrderType = OrderType;
	}

	public DistributionInstructionTypeCode getMovementType() {
		return MovementType;
	}

	public void setMovementType(DistributionInstructionTypeCode MovementType) {
		this.MovementType = MovementType;
	}

	public YesNoIndicator getHighPriorityIndicator() {
		return HighPriorityIndicator;
	}

	public void setHighPriorityIndicator(YesNoIndicator HighPriorityIndicator) {
		this.HighPriorityIndicator = HighPriorityIndicator;
	}

	public ISODate getRequestedExecutionDate() {
		return RequestedExecutionDate;
	}

	public void setRequestedExecutionDate(ISODate RequestedExecutionDate) {
		this.RequestedExecutionDate = RequestedExecutionDate;
	}

	public RoundingDirectionCode getFractionTreatment() {
		return FractionTreatment;
	}

	public void setFractionTreatment(RoundingDirectionCode FractionTreatment) {
		this.FractionTreatment = FractionTreatment;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return CreditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode CreditDebitIndicator) {
		this.CreditDebitIndicator = CreditDebitIndicator;
	}

	public CorporateActionOption getOption() {
		return Option;
	}

	public void setOption(CorporateActionOption Option) {
		this.Option = Option;
	}

	public CurrencyAndAmount getNetAmount() {
		return NetAmount;
	}

	public void setNetAmount(CurrencyAndAmount NetAmount) {
		this.NetAmount = NetAmount;
	}

	public CurrencyAndAmount getGrossAmount() {
		return GrossAmount;
	}

	public void setGrossAmount(CurrencyAndAmount GrossAmount) {
		this.GrossAmount = GrossAmount;
	}

	public FinancialTransaction getFinancialTransaction() {
		return FinancialTransaction;
	}

	public void setFinancialTransaction(
			FinancialTransaction FinancialTransaction) {
		this.FinancialTransaction = FinancialTransaction;
	}

	public CorporateActionProceedsDeliveryInstruction getCorporateActionProceedsDeliveryInstruction() {
		return CorporateActionProceedsDeliveryInstruction;
	}

	public void setCorporateActionProceedsDeliveryInstruction(
			CorporateActionProceedsDeliveryInstruction CorporateActionProceedsDeliveryInstruction) {
		this.CorporateActionProceedsDeliveryInstruction = CorporateActionProceedsDeliveryInstruction;
	}
}