package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.codeset.CashAccountTypeCode;
import com.tools20022.repository.dict.entity.InvestmentAccount;
import com.tools20022.repository.dict.entity.CashEntry;
import com.tools20022.repository.dict.entity.CashBalance;
import com.tools20022.repository.dict.entity.PaymentPartyRole;
import com.tools20022.repository.dict.entity.StandingOrder;
import com.tools20022.repository.dict.entity.CashAccountContract;
import com.tools20022.repository.dict.entity.CorporateActionElection;
import com.tools20022.repository.dict.entity.Charges;
import com.tools20022.repository.dict.entity.Tax;
import com.tools20022.repository.dict.entity.CashSettlement;
import com.tools20022.repository.dict.entity.CashSettlementInstructionPartyRole;
import com.tools20022.repository.dict.entity.UndertakingUltimateObligor;
import com.tools20022.repository.dict.entity.PaymentCard;
import com.tools20022.repository.dict.entity.SecuritiesPartyRole;
import com.tools20022.repository.dict.entity.InvoiceFinancingPartyRole;
import com.tools20022.repository.dict.entity.CommercialTrade;
import com.tools20022.repository.dict.codeset.AccountLevelCode;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.AccountReportedMovement;
import com.tools20022.repository.dict.entity.AccountLink;
import com.tools20022.repository.dict.entity.CashStandingOrder;
import com.tools20022.repository.dict.entity.Cheque;
import com.tools20022.repository.dict.entity.CashAccountService;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.entity.Commission;

/**
 * Account to or from which a cash entry is made.
 */
public class CashAccount extends Account
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CashAccountTypeCode CashAccountType;
	private InvestmentAccount RelatedInvestmentAccount;
	private CashEntry CashEntry;
	private CashBalance CashBalance;
	private PaymentPartyRole PaymentPartyRole;
	private StandingOrder RelatedCreditStandingOrder;
	private StandingOrder RelatedDebitStandingOrder;
	private CashAccountContract CashAccountContract;
	private CorporateActionElection RelatedCorporateActionElection;
	private Charges Charges;
	private Tax Tax;
	private CashSettlement RelatedSettlementInstruction;
	private CashSettlementInstructionPartyRole CashSettlementPartyRole;
	private UndertakingUltimateObligor UltimateObligor;
	private PaymentCard RelatedPaymentCard;
	private SecuritiesPartyRole SecuritiesPartyRole;
	private InvoiceFinancingPartyRole RelatedInvoiceFinancingPartyRole;
	private CommercialTrade RelatedCommercialTrade;
	private AccountLevelCode Level;
	private CurrencyCode SettlementCurrency;
	private AccountReportedMovement ReportedMovements;
	private CashAccountContract ClosedAccountContract;
	private AccountLink AccountLink;
	private CashStandingOrder CashStandingOrder;
	private Cheque Cheque;
	private CashAccountService CashAccountService;
	private Payment Payment;
	private Commission Commission;

	public CashAccountTypeCode getCashAccountType() {
		return CashAccountType;
	}

	public void setCashAccountType(CashAccountTypeCode CashAccountType) {
		this.CashAccountType = CashAccountType;
	}

	public InvestmentAccount getRelatedInvestmentAccount() {
		return RelatedInvestmentAccount;
	}

	public void setRelatedInvestmentAccount(
			InvestmentAccount RelatedInvestmentAccount) {
		this.RelatedInvestmentAccount = RelatedInvestmentAccount;
	}

	public CashEntry getCashEntry() {
		return CashEntry;
	}

	public void setCashEntry(CashEntry CashEntry) {
		this.CashEntry = CashEntry;
	}

	public CashBalance getCashBalance() {
		return CashBalance;
	}

	public void setCashBalance(CashBalance CashBalance) {
		this.CashBalance = CashBalance;
	}

	public PaymentPartyRole getPaymentPartyRole() {
		return PaymentPartyRole;
	}

	public void setPaymentPartyRole(PaymentPartyRole PaymentPartyRole) {
		this.PaymentPartyRole = PaymentPartyRole;
	}

	public StandingOrder getRelatedCreditStandingOrder() {
		return RelatedCreditStandingOrder;
	}

	public void setRelatedCreditStandingOrder(
			StandingOrder RelatedCreditStandingOrder) {
		this.RelatedCreditStandingOrder = RelatedCreditStandingOrder;
	}

	public StandingOrder getRelatedDebitStandingOrder() {
		return RelatedDebitStandingOrder;
	}

	public void setRelatedDebitStandingOrder(
			StandingOrder RelatedDebitStandingOrder) {
		this.RelatedDebitStandingOrder = RelatedDebitStandingOrder;
	}

	public CashAccountContract getCashAccountContract() {
		return CashAccountContract;
	}

	public void setCashAccountContract(CashAccountContract CashAccountContract) {
		this.CashAccountContract = CashAccountContract;
	}

	public CorporateActionElection getRelatedCorporateActionElection() {
		return RelatedCorporateActionElection;
	}

	public void setRelatedCorporateActionElection(
			CorporateActionElection RelatedCorporateActionElection) {
		this.RelatedCorporateActionElection = RelatedCorporateActionElection;
	}

	public Charges getCharges() {
		return Charges;
	}

	public void setCharges(Charges Charges) {
		this.Charges = Charges;
	}

	public Tax getTax() {
		return Tax;
	}

	public void setTax(Tax Tax) {
		this.Tax = Tax;
	}

	public CashSettlement getRelatedSettlementInstruction() {
		return RelatedSettlementInstruction;
	}

	public void setRelatedSettlementInstruction(
			CashSettlement RelatedSettlementInstruction) {
		this.RelatedSettlementInstruction = RelatedSettlementInstruction;
	}

	public CashSettlementInstructionPartyRole getCashSettlementPartyRole() {
		return CashSettlementPartyRole;
	}

	public void setCashSettlementPartyRole(
			CashSettlementInstructionPartyRole CashSettlementPartyRole) {
		this.CashSettlementPartyRole = CashSettlementPartyRole;
	}

	public UndertakingUltimateObligor getUltimateObligor() {
		return UltimateObligor;
	}

	public void setUltimateObligor(UndertakingUltimateObligor UltimateObligor) {
		this.UltimateObligor = UltimateObligor;
	}

	public PaymentCard getRelatedPaymentCard() {
		return RelatedPaymentCard;
	}

	public void setRelatedPaymentCard(PaymentCard RelatedPaymentCard) {
		this.RelatedPaymentCard = RelatedPaymentCard;
	}

	public SecuritiesPartyRole getSecuritiesPartyRole() {
		return SecuritiesPartyRole;
	}

	public void setSecuritiesPartyRole(SecuritiesPartyRole SecuritiesPartyRole) {
		this.SecuritiesPartyRole = SecuritiesPartyRole;
	}

	public InvoiceFinancingPartyRole getRelatedInvoiceFinancingPartyRole() {
		return RelatedInvoiceFinancingPartyRole;
	}

	public void setRelatedInvoiceFinancingPartyRole(
			InvoiceFinancingPartyRole RelatedInvoiceFinancingPartyRole) {
		this.RelatedInvoiceFinancingPartyRole = RelatedInvoiceFinancingPartyRole;
	}

	public CommercialTrade getRelatedCommercialTrade() {
		return RelatedCommercialTrade;
	}

	public void setRelatedCommercialTrade(CommercialTrade RelatedCommercialTrade) {
		this.RelatedCommercialTrade = RelatedCommercialTrade;
	}

	public AccountLevelCode getLevel() {
		return Level;
	}

	public void setLevel(AccountLevelCode Level) {
		this.Level = Level;
	}

	public CurrencyCode getSettlementCurrency() {
		return SettlementCurrency;
	}

	public void setSettlementCurrency(CurrencyCode SettlementCurrency) {
		this.SettlementCurrency = SettlementCurrency;
	}

	public AccountReportedMovement getReportedMovements() {
		return ReportedMovements;
	}

	public void setReportedMovements(AccountReportedMovement ReportedMovements) {
		this.ReportedMovements = ReportedMovements;
	}

	public CashAccountContract getClosedAccountContract() {
		return ClosedAccountContract;
	}

	public void setClosedAccountContract(
			CashAccountContract ClosedAccountContract) {
		this.ClosedAccountContract = ClosedAccountContract;
	}

	public AccountLink getAccountLink() {
		return AccountLink;
	}

	public void setAccountLink(AccountLink AccountLink) {
		this.AccountLink = AccountLink;
	}

	public CashStandingOrder getCashStandingOrder() {
		return CashStandingOrder;
	}

	public void setCashStandingOrder(CashStandingOrder CashStandingOrder) {
		this.CashStandingOrder = CashStandingOrder;
	}

	public Cheque getCheque() {
		return Cheque;
	}

	public void setCheque(Cheque Cheque) {
		this.Cheque = Cheque;
	}

	public CashAccountService getCashAccountService() {
		return CashAccountService;
	}

	public void setCashAccountService(CashAccountService CashAccountService) {
		this.CashAccountService = CashAccountService;
	}

	public Payment getPayment() {
		return Payment;
	}

	public void setPayment(Payment Payment) {
		this.Payment = Payment;
	}

	public Commission getCommission() {
		return Commission;
	}

	public void setCommission(Commission Commission) {
		this.Commission = Commission;
	}
}