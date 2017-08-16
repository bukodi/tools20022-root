package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.codeset.FundCashAccountCode;
import com.tools20022.repository.dict.codeset.AccountOwnershipTypeCode;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.InvestmentFundClass;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.entity.SecuritiesAccount;
import com.tools20022.repository.dict.entity.InvestmentFundTax;
import com.tools20022.repository.dict.entity.InvestmentFundTransaction;
import com.tools20022.repository.dict.entity.SidePocket;
import com.tools20022.repository.dict.entity.InvestmentAccountPartyRole;
import com.tools20022.repository.dict.entity.PortfolioTransfer;
import com.tools20022.repository.dict.entity.FundOrderDesk;
import com.tools20022.repository.dict.entity.InvestmentAccountContract;
import com.tools20022.repository.dict.codeset.AccountUsageTypeCode;
import com.tools20022.repository.dict.codeset.InvestmentAccountCategoryCode;
import com.tools20022.repository.dict.entity.Portfolio;

/**
 * Account between an investor(s) and a fund manager or a fund. The account can
 * contain holdings in any investment fund or investment fund class managed (or
 * distributed) by the fund manager, within the same fund family.
 */
public class InvestmentAccount extends Account
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private FundCashAccountCode InvestmentAccountType;
	private AccountOwnershipTypeCode OwnershipType;
	private Max70Text Designation;
	private CurrencyCode ReferenceCurrency;
	private InvestmentFundClass InvestmentFundClass;
	private CashAccount CashAccount;
	private SecuritiesAccount SecuritiesAccount;
	private InvestmentFundTax InvestmentFundTax;
	private InvestmentFundTransaction InvestmentFundTransaction;
	private SidePocket SidePocket;
	private InvestmentAccountPartyRole InvestmentAccountPartyRole;
	private PortfolioTransfer DebitPortfolioTransfer;
	private PortfolioTransfer CreditPortfolioTransfer;
	private FundOrderDesk AccountForInvestmentFundProcessing;
	private InvestmentAccountContract InvestmentAccountContract;
	private AccountUsageTypeCode AccountUsageType;
	private InvestmentAccountCategoryCode Category;
	private Portfolio Portfolio;
	private PortfolioTransfer RelatedPortfolioTransfer;

	public FundCashAccountCode getInvestmentAccountType() {
		return InvestmentAccountType;
	}

	public void setInvestmentAccountType(
			FundCashAccountCode InvestmentAccountType) {
		this.InvestmentAccountType = InvestmentAccountType;
	}

	public AccountOwnershipTypeCode getOwnershipType() {
		return OwnershipType;
	}

	public void setOwnershipType(AccountOwnershipTypeCode OwnershipType) {
		this.OwnershipType = OwnershipType;
	}

	public Max70Text getDesignation() {
		return Designation;
	}

	public void setDesignation(Max70Text Designation) {
		this.Designation = Designation;
	}

	public CurrencyCode getReferenceCurrency() {
		return ReferenceCurrency;
	}

	public void setReferenceCurrency(CurrencyCode ReferenceCurrency) {
		this.ReferenceCurrency = ReferenceCurrency;
	}

	public InvestmentFundClass getInvestmentFundClass() {
		return InvestmentFundClass;
	}

	public void setInvestmentFundClass(InvestmentFundClass InvestmentFundClass) {
		this.InvestmentFundClass = InvestmentFundClass;
	}

	public CashAccount getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(CashAccount CashAccount) {
		this.CashAccount = CashAccount;
	}

	public SecuritiesAccount getSecuritiesAccount() {
		return SecuritiesAccount;
	}

	public void setSecuritiesAccount(SecuritiesAccount SecuritiesAccount) {
		this.SecuritiesAccount = SecuritiesAccount;
	}

	public InvestmentFundTax getInvestmentFundTax() {
		return InvestmentFundTax;
	}

	public void setInvestmentFundTax(InvestmentFundTax InvestmentFundTax) {
		this.InvestmentFundTax = InvestmentFundTax;
	}

	public InvestmentFundTransaction getInvestmentFundTransaction() {
		return InvestmentFundTransaction;
	}

	public void setInvestmentFundTransaction(
			InvestmentFundTransaction InvestmentFundTransaction) {
		this.InvestmentFundTransaction = InvestmentFundTransaction;
	}

	public SidePocket getSidePocket() {
		return SidePocket;
	}

	public void setSidePocket(SidePocket SidePocket) {
		this.SidePocket = SidePocket;
	}

	public InvestmentAccountPartyRole getInvestmentAccountPartyRole() {
		return InvestmentAccountPartyRole;
	}

	public void setInvestmentAccountPartyRole(
			InvestmentAccountPartyRole InvestmentAccountPartyRole) {
		this.InvestmentAccountPartyRole = InvestmentAccountPartyRole;
	}

	public PortfolioTransfer getDebitPortfolioTransfer() {
		return DebitPortfolioTransfer;
	}

	public void setDebitPortfolioTransfer(
			PortfolioTransfer DebitPortfolioTransfer) {
		this.DebitPortfolioTransfer = DebitPortfolioTransfer;
	}

	public PortfolioTransfer getCreditPortfolioTransfer() {
		return CreditPortfolioTransfer;
	}

	public void setCreditPortfolioTransfer(
			PortfolioTransfer CreditPortfolioTransfer) {
		this.CreditPortfolioTransfer = CreditPortfolioTransfer;
	}

	public FundOrderDesk getAccountForInvestmentFundProcessing() {
		return AccountForInvestmentFundProcessing;
	}

	public void setAccountForInvestmentFundProcessing(
			FundOrderDesk AccountForInvestmentFundProcessing) {
		this.AccountForInvestmentFundProcessing = AccountForInvestmentFundProcessing;
	}

	public InvestmentAccountContract getInvestmentAccountContract() {
		return InvestmentAccountContract;
	}

	public void setInvestmentAccountContract(
			InvestmentAccountContract InvestmentAccountContract) {
		this.InvestmentAccountContract = InvestmentAccountContract;
	}

	public AccountUsageTypeCode getAccountUsageType() {
		return AccountUsageType;
	}

	public void setAccountUsageType(AccountUsageTypeCode AccountUsageType) {
		this.AccountUsageType = AccountUsageType;
	}

	public InvestmentAccountCategoryCode getCategory() {
		return Category;
	}

	public void setCategory(InvestmentAccountCategoryCode Category) {
		this.Category = Category;
	}

	public Portfolio getPortfolio() {
		return Portfolio;
	}

	public void setPortfolio(Portfolio Portfolio) {
		this.Portfolio = Portfolio;
	}

	public PortfolioTransfer getRelatedPortfolioTransfer() {
		return RelatedPortfolioTransfer;
	}

	public void setRelatedPortfolioTransfer(
			PortfolioTransfer RelatedPortfolioTransfer) {
		this.RelatedPortfolioTransfer = RelatedPortfolioTransfer;
	}
}