package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.PaymentCategoryPurposeCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class PaymentCategoryPurposeCode extends MMCodeSet {

	private final static AtomicReference<PaymentCategoryPurposeCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeIntraCompanyPayment = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "INTC";
			super.name = "IntraCompanyPayment";
			super.definition = "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group.";
		}
	};
	public final MMCode codeTradeSettlementPayment = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "CORT";
			super.name = "TradeSettlementPayment";
			super.definition = "Transaction is related to settlement of a trade, eg a foreign exchange deal or a securities transaction.";
		}
	};
	public final MMCode codeSalaryPayment = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "SALA";
			super.name = "SalaryPayment";
			super.definition = "Transaction is the payment of salaries.";
		}
	};
	public final MMCode codeTreasuryPayment = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "TREA";
			super.name = "TreasuryPayment";
			super.definition = "Transaction is related to treasury operations.";
		}
	};
	public final MMCode codeCashManagementTransfer = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "CASH";
			super.name = "CashManagementTransfer";
			super.definition = "Transaction is a general cash management instruction.";
		}
	};
	public final MMCode codeDividend = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "DIVI";
			super.name = "Dividend";
			super.definition = "Transaction is the payment of dividends.";
		}
	};
	public final MMCode codeGovernmentPayment = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "GOVT";
			super.name = "GovernmentPayment";
			super.definition = "Transaction is a payment to or from a government department.";
		}
	};
	public final MMCode codeInterest = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "INTE";
			super.name = "Interest";
			super.definition = "Transaction is the payment of interest.";
		}
	};
	public final MMCode codeLoan = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "LOAN";
			super.name = "Loan";
			super.definition = "Transaction is related to the transfer of a loan to a borrower.";
		}
	};
	public final MMCode codePensionPayment = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "PENS";
			super.name = "PensionPayment";
			super.definition = "Transaction is the payment of pension.";
		}
	};
	public final MMCode codeSecurities = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "SECU";
			super.name = "Securities";
			super.definition = "Transaction is the payment of securities.";
		}
	};
	public final MMCode codeSocialSecurityBenefit = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "SSBE";
			super.name = "SocialSecurityBenefit";
			super.definition = "Transaction is a social security benefit, ie payment made by a government to support individuals.";
		}
	};
	public final MMCode codeTaxPayment = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "TAXS";
			super.name = "TaxPayment";
			super.definition = "Transaction is the payment of taxes.";
		}
	};
	public final MMCode codeValueAddedTaxPayment = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "VATX";
			super.name = "ValueAddedTaxPayment";
			super.definition = "Transaction is the payment of value added tax.";
		}
	};
	public final MMCode codeSupplierPayment = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "SUPP";
			super.name = "SupplierPayment";
			super.definition = "Transaction is related to a payment to a supplier.";
		}
	};
	public final MMCode codeHedging = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "HEDG";
			super.name = "Hedging";
			super.definition = "Transaction is related to the payment of a hedging operation.";
		}
	};
	public final MMCode codeTrade = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "TRAD";
			super.name = "Trade";
			super.definition = "Transaction is related to the payment of a trade transaction.";
		}
	};
	public final MMCode codeWithHolding = new MMCode() {
		{
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "WHLD";
			super.name = "WithHolding";
			super.definition = "Transaction is the payment of withholding tax.";
		}
	};

	public static PaymentCategoryPurposeCode repoType() {
		repoTypeRef.compareAndSet(null, new PaymentCategoryPurposeCode());
		return repoTypeRef.get();
	}

	private PaymentCategoryPurposeCode() {
		super.code = Arrays.asList(codeIntraCompanyPayment,
				codeTradeSettlementPayment, codeSalaryPayment,
				codeTreasuryPayment, codeCashManagementTransfer, codeDividend,
				codeGovernmentPayment, codeInterest, codeLoan,
				codePensionPayment, codeSecurities, codeSocialSecurityBenefit,
				codeTaxPayment, codeValueAddedTaxPayment, codeSupplierPayment,
				codeHedging, codeTrade, codeWithHolding);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PaymentCategoryPurposeCode";
		super.definition = "Specifies the type of transaction that resulted in the payment.";
		super.example = Arrays.asList("INTC");
	}
}