package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.CashAccountTypeCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class CashAccountTypeCode extends MMCodeSet {

	private final static AtomicReference<CashAccountTypeCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeCashPayment = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "CASH";
			super.name = "CashPayment";
			super.definition = "Account used for the payment of cash.";
			super.semanticMarkup = Arrays.asList();
		}
	};
	public final MMCode codeCharges = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "CHAR";
			super.name = "Charges";
			super.definition = "Account used for charges if different from the account for payment.";
			super.semanticMarkup = Arrays.asList();
		}
	};
	public final MMCode codeCommission = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "COMM";
			super.name = "Commission";
			super.definition = "Account used for commission if different from the account for payment.";
			super.semanticMarkup = Arrays.asList();
		}
	};
	public final MMCode codeTax = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "TAXE";
			super.name = "Tax";
			super.definition = "Account used for taxes if different from the account for payment.";
			super.semanticMarkup = Arrays.asList();
		}
	};
	public final MMCode codeCashIncome = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "CISH";
			super.name = "CashIncome";
			super.definition = "Account used for payment of income if different from the current cash account.";
		}
	};
	public final MMCode codeCashTrading = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "TRAS";
			super.name = "CashTrading";
			super.definition = "Account used for trading if different from the current cash account.";
		}
	};
	public final MMCode codeSettlement = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "SACC";
			super.name = "Settlement";
			super.definition = "Account used to post debit and credit entries, as a result of transactions cleared and settled through a specific clearing and settlement system.";
		}
	};
	public final MMCode codeCurrent = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "CACC";
			super.name = "Current";
			super.definition = "Account used to post debits and credits when no specific account has been nominated.";
		}
	};
	public final MMCode codeSavings = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "SVGS";
			super.name = "Savings";
			super.definition = "Account used for savings.";
		}
	};
	public final MMCode codeOverNightDeposit = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "ONDP";
			super.name = "OverNightDeposit";
			super.definition = "Account used for overnight deposits.";
		}
	};
	public final MMCode codeMarginalLending = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "MGLD";
			super.name = "MarginalLending";
			super.definition = "Account used for a marginal lending facility.";
		}
	};
	public final MMCode codeNonResidentExternal = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "NREX";
			super.name = "NonResidentExternal";
			super.definition = "Account used for non-resident external.";
		}
	};
	public final MMCode codeMoneyMarket = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "MOMA";
			super.name = "MoneyMarket";
			super.definition = "Account used for money markets if different from the cash account.";
		}
	};
	public final MMCode codeLoan = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "LOAN";
			super.name = "Loan";
			super.definition = "Account used for loans.";
		}
	};
	public final MMCode codeSalary = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "SLRY";
			super.name = "Salary";
			super.definition = "Accounts used for salary payments.";
		}
	};
	public final MMCode codeOverdraft = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "ODFT";
			super.name = "Overdraft";
			super.definition = "Account is used for overdrafts.";
		}
	};
	public final MMCode codeLending = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "LEND";
			super.name = "Lending";
			super.definition = "Account is for the coverage of lending.";
		}
	};
	public final MMCode codeCollateral = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "COLL";
			super.name = "Collateral";
			super.definition = "Account is for collateral.";
		}
	};
	public final MMCode codeFinancialSettlement = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "SETT";
			super.name = "FinancialSettlement";
			super.definition = "Account is for financial settlements.";
		}
	};
	public final MMCode codeMarginReturn = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "MARR";
			super.name = "MarginReturn";
			super.definition = "Account is for margin returns.";
		}
	};
	public final MMCode codeSegregated = new MMCode() {
		{
			super.owner_lazy = () -> CashAccountTypeCode.repoType();
			super.codeName = "SEGT";
			super.name = "Segregated";
			super.definition = "Account is an segregated account.";
		}
	};

	public static CashAccountTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new CashAccountTypeCode());
		return repoTypeRef.get();
	}

	private CashAccountTypeCode() {
		super.code = Arrays.asList(codeCashPayment, codeCharges,
				codeCommission, codeTax, codeCashIncome, codeCashTrading,
				codeSettlement, codeCurrent, codeSavings, codeOverNightDeposit,
				codeMarginalLending, codeNonResidentExternal, codeMoneyMarket,
				codeLoan, codeSalary, codeOverdraft, codeLending,
				codeCollateral, codeFinancialSettlement, codeMarginReturn,
				codeSegregated);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CashAccountTypeCode";
		super.definition = "Specifies the nature, or  use, of the cash account.";
		super.example = Arrays.asList("CASH");
		super.semanticMarkup = Arrays.asList();
	}
}