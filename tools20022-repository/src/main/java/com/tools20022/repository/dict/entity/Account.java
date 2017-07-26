package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.AccountIdentification;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.InvestmentFundClassProcessingCharacteristics;
import com.tools20022.repository.dict.entity.AccountStatus;
import com.tools20022.repository.dict.codeset.LanguageCode;
import com.tools20022.repository.dict.entity.AccountPartyRole;
import com.tools20022.repository.dict.entity.TradePartyRole;
import com.tools20022.repository.dict.entity.AccountRestriction;
import com.tools20022.repository.dict.entity.SettlementPartyRole;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.InvestmentFundPartyRole;
import com.tools20022.repository.dict.entity.Collateral;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.entity.CorporateActionProceedsDeliveryInstruction;
import com.tools20022.repository.dict.entity.CorporateActionPartyRole;
import com.tools20022.repository.dict.entity.ClearingMemberRole;
import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.entity.Balance;
import com.tools20022.repository.dict.entity.Entry;
import com.tools20022.repository.dict.entity.AccountContract;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.entity.DefaultFundContribution;
import com.tools20022.repository.dict.entity.SystemMemberRole;
import com.tools20022.repository.dict.codeset.CollateralAccountTypeCode;
import com.tools20022.repository.dict.entity.AccountService;
import com.tools20022.repository.dict.entity.Reconciliation;
import com.tools20022.repository.dict.entity.ManagedAccountProduct;

/**
 * Record of transactions in specific types of assets, maintained by a servicing
 * party on behalf of one or more owning parties. Business relationship between
 * an account servicer and one or more account owners.
 */
public class Account {

	private CurrencyCode BaseCurrency;
	private AccountIdentification Identification;
	private Account ParentAccount;
	private Account SubAccount;
	private InvestmentFundClassProcessingCharacteristics RelatedFundProcessingCharacteristics;
	private AccountStatus Status;
	private LanguageCode Language;
	private AccountPartyRole PartyRole;
	private TradePartyRole TradePartyRole;
	private CurrencyCode ReportingCurrency;
	private AccountRestriction AccountRestriction;
	private SettlementPartyRole SettlementPartyRole;
	private Max140Text Purpose;
	private ISODateTime ClosingDate;
	private ISODateTime LiveDate;
	private DateTimePeriod ReportedPeriod;
	private InvestmentFundPartyRole InvestmentFundPartyRole;
	private Collateral RelatedCollateralProcess;
	private GenericIdentification Type;
	private CorporateActionProceedsDeliveryInstruction RelatedProceedsDelivery;
	private CorporateActionPartyRole RelatedCorporateActionPartyRole;
	private ClearingMemberRole DefaultFundAccountOwner;
	private System System;
	private Balance Balance;
	private Entry Entry;
	private AccountContract AccountContract;
	private ISODateTime OpeningDate;
	private CurrencyExchange CurrencyExchange;
	private DefaultFundContribution DefaultFundContribution;
	private SystemMemberRole SystemMember;
	private CollateralAccountTypeCode CollateralAccountType;
	private AccountService AccountService;
	private Reconciliation Reconciliation;
	private ManagedAccountProduct ManagedAccountProduct;

	public CurrencyCode getBaseCurrency() {
		return BaseCurrency;
	}

	public void setBaseCurrency(CurrencyCode BaseCurrency) {
		this.BaseCurrency = BaseCurrency;
	}

	public AccountIdentification getIdentification() {
		return Identification;
	}

	public void setIdentification(AccountIdentification Identification) {
		this.Identification = Identification;
	}

	public Account getParentAccount() {
		return ParentAccount;
	}

	public void setParentAccount(Account ParentAccount) {
		this.ParentAccount = ParentAccount;
	}

	public Account getSubAccount() {
		return SubAccount;
	}

	public void setSubAccount(Account SubAccount) {
		this.SubAccount = SubAccount;
	}

	public InvestmentFundClassProcessingCharacteristics getRelatedFundProcessingCharacteristics() {
		return RelatedFundProcessingCharacteristics;
	}

	public void setRelatedFundProcessingCharacteristics(
			InvestmentFundClassProcessingCharacteristics RelatedFundProcessingCharacteristics) {
		this.RelatedFundProcessingCharacteristics = RelatedFundProcessingCharacteristics;
	}

	public AccountStatus getStatus() {
		return Status;
	}

	public void setStatus(AccountStatus Status) {
		this.Status = Status;
	}

	public LanguageCode getLanguage() {
		return Language;
	}

	public void setLanguage(LanguageCode Language) {
		this.Language = Language;
	}

	public AccountPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(AccountPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public TradePartyRole getTradePartyRole() {
		return TradePartyRole;
	}

	public void setTradePartyRole(TradePartyRole TradePartyRole) {
		this.TradePartyRole = TradePartyRole;
	}

	public CurrencyCode getReportingCurrency() {
		return ReportingCurrency;
	}

	public void setReportingCurrency(CurrencyCode ReportingCurrency) {
		this.ReportingCurrency = ReportingCurrency;
	}

	public AccountRestriction getAccountRestriction() {
		return AccountRestriction;
	}

	public void setAccountRestriction(AccountRestriction AccountRestriction) {
		this.AccountRestriction = AccountRestriction;
	}

	public SettlementPartyRole getSettlementPartyRole() {
		return SettlementPartyRole;
	}

	public void setSettlementPartyRole(SettlementPartyRole SettlementPartyRole) {
		this.SettlementPartyRole = SettlementPartyRole;
	}

	public Max140Text getPurpose() {
		return Purpose;
	}

	public void setPurpose(Max140Text Purpose) {
		this.Purpose = Purpose;
	}

	public ISODateTime getClosingDate() {
		return ClosingDate;
	}

	public void setClosingDate(ISODateTime ClosingDate) {
		this.ClosingDate = ClosingDate;
	}

	public ISODateTime getLiveDate() {
		return LiveDate;
	}

	public void setLiveDate(ISODateTime LiveDate) {
		this.LiveDate = LiveDate;
	}

	public DateTimePeriod getReportedPeriod() {
		return ReportedPeriod;
	}

	public void setReportedPeriod(DateTimePeriod ReportedPeriod) {
		this.ReportedPeriod = ReportedPeriod;
	}

	public InvestmentFundPartyRole getInvestmentFundPartyRole() {
		return InvestmentFundPartyRole;
	}

	public void setInvestmentFundPartyRole(
			InvestmentFundPartyRole InvestmentFundPartyRole) {
		this.InvestmentFundPartyRole = InvestmentFundPartyRole;
	}

	public Collateral getRelatedCollateralProcess() {
		return RelatedCollateralProcess;
	}

	public void setRelatedCollateralProcess(Collateral RelatedCollateralProcess) {
		this.RelatedCollateralProcess = RelatedCollateralProcess;
	}

	public GenericIdentification getType() {
		return Type;
	}

	public void setType(GenericIdentification Type) {
		this.Type = Type;
	}

	public CorporateActionProceedsDeliveryInstruction getRelatedProceedsDelivery() {
		return RelatedProceedsDelivery;
	}

	public void setRelatedProceedsDelivery(
			CorporateActionProceedsDeliveryInstruction RelatedProceedsDelivery) {
		this.RelatedProceedsDelivery = RelatedProceedsDelivery;
	}

	public CorporateActionPartyRole getRelatedCorporateActionPartyRole() {
		return RelatedCorporateActionPartyRole;
	}

	public void setRelatedCorporateActionPartyRole(
			CorporateActionPartyRole RelatedCorporateActionPartyRole) {
		this.RelatedCorporateActionPartyRole = RelatedCorporateActionPartyRole;
	}

	public ClearingMemberRole getDefaultFundAccountOwner() {
		return DefaultFundAccountOwner;
	}

	public void setDefaultFundAccountOwner(
			ClearingMemberRole DefaultFundAccountOwner) {
		this.DefaultFundAccountOwner = DefaultFundAccountOwner;
	}

	public System getSystem() {
		return System;
	}

	public void setSystem(System System) {
		this.System = System;
	}

	public Balance getBalance() {
		return Balance;
	}

	public void setBalance(Balance Balance) {
		this.Balance = Balance;
	}

	public Entry getEntry() {
		return Entry;
	}

	public void setEntry(Entry Entry) {
		this.Entry = Entry;
	}

	public AccountContract getAccountContract() {
		return AccountContract;
	}

	public void setAccountContract(AccountContract AccountContract) {
		this.AccountContract = AccountContract;
	}

	public ISODateTime getOpeningDate() {
		return OpeningDate;
	}

	public void setOpeningDate(ISODateTime OpeningDate) {
		this.OpeningDate = OpeningDate;
	}

	public CurrencyExchange getCurrencyExchange() {
		return CurrencyExchange;
	}

	public void setCurrencyExchange(CurrencyExchange CurrencyExchange) {
		this.CurrencyExchange = CurrencyExchange;
	}

	public DefaultFundContribution getDefaultFundContribution() {
		return DefaultFundContribution;
	}

	public void setDefaultFundContribution(
			DefaultFundContribution DefaultFundContribution) {
		this.DefaultFundContribution = DefaultFundContribution;
	}

	public SystemMemberRole getSystemMember() {
		return SystemMember;
	}

	public void setSystemMember(SystemMemberRole SystemMember) {
		this.SystemMember = SystemMember;
	}

	public CollateralAccountTypeCode getCollateralAccountType() {
		return CollateralAccountType;
	}

	public void setCollateralAccountType(
			CollateralAccountTypeCode CollateralAccountType) {
		this.CollateralAccountType = CollateralAccountType;
	}

	public AccountService getAccountService() {
		return AccountService;
	}

	public void setAccountService(AccountService AccountService) {
		this.AccountService = AccountService;
	}

	public Reconciliation getReconciliation() {
		return Reconciliation;
	}

	public void setReconciliation(Reconciliation Reconciliation) {
		this.Reconciliation = Reconciliation;
	}

	public ManagedAccountProduct getManagedAccountProduct() {
		return ManagedAccountProduct;
	}

	public void setManagedAccountProduct(
			ManagedAccountProduct ManagedAccountProduct) {
		this.ManagedAccountProduct = ManagedAccountProduct;
	}
}