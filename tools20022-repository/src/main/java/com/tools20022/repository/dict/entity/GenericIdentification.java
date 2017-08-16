package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.entity.AccountIdentification;
import com.tools20022.repository.dict.entity.PartyIdentificationInformation;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.Scheme;
import com.tools20022.repository.dict.entity.SecuritiesCertificate;
import com.tools20022.repository.dict.entity.LotBreakdown;
import com.tools20022.repository.dict.entity.InformationPartyRole;
import com.tools20022.repository.dict.entity.CashProceedsDefinition;
import com.tools20022.repository.dict.entity.StatusReason;
import com.tools20022.repository.dict.entity.BankTransaction;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.SystemIdentification;
import com.tools20022.repository.dict.entity.Interest;
import com.tools20022.repository.dict.entity.CashAccountService;
import com.tools20022.repository.dict.entity.InvestmentFundClass;
import com.tools20022.repository.dict.entity.Location;
import com.tools20022.repository.dict.entity.SecuritiesIdentification;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.entity.PurchaseOrder;
import com.tools20022.repository.dict.entity.RegisteredContract;

/**
 * Information related to a non-standardised identification, such as a
 * proprietary party identification or account identification.
 */
public class GenericIdentification extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text Identification;
	private ContactPoint IdentificationForContactPoint;
	private AccountIdentification IdentificationForAccount;
	private PartyIdentificationInformation RelatedPartyIdentification;
	private ISODate IssueDate;
	private ISODate ExpiryDate;
	private Scheme Scheme;
	private SecuritiesCertificate IdentificationForSecuritiesCertificate;
	private LotBreakdown IdentificationForLot;
	private InformationPartyRole PartyRole;
	private CashProceedsDefinition IdentificationForCashProceedsIncome;
	private StatusReason RelatedStatusReason;
	private BankTransaction IdentificationForBankTransaction;
	private AccountIdentification IdentificationForAccountCostReferencePattern;
	private Account Account;
	private SystemIdentification RelatedSystemIdentification;
	private Interest IdentificationForInterestName;
	private CashAccountService RelatedCashAccountService;
	private InvestmentFundClass IdentificationForInvestmentFundClass;
	private Location IdentifiedLocation;
	private SecuritiesIdentification RelatedSecuritiesIdentification;
	private Document IdentifiedDocument;
	private PurchaseOrder RelatedPurchaseOrder;
	private RegisteredContract RelatedCertificate;

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public ContactPoint getIdentificationForContactPoint() {
		return IdentificationForContactPoint;
	}

	public void setIdentificationForContactPoint(
			ContactPoint IdentificationForContactPoint) {
		this.IdentificationForContactPoint = IdentificationForContactPoint;
	}

	public AccountIdentification getIdentificationForAccount() {
		return IdentificationForAccount;
	}

	public void setIdentificationForAccount(
			AccountIdentification IdentificationForAccount) {
		this.IdentificationForAccount = IdentificationForAccount;
	}

	public PartyIdentificationInformation getRelatedPartyIdentification() {
		return RelatedPartyIdentification;
	}

	public void setRelatedPartyIdentification(
			PartyIdentificationInformation RelatedPartyIdentification) {
		this.RelatedPartyIdentification = RelatedPartyIdentification;
	}

	public ISODate getIssueDate() {
		return IssueDate;
	}

	public void setIssueDate(ISODate IssueDate) {
		this.IssueDate = IssueDate;
	}

	public ISODate getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(ISODate ExpiryDate) {
		this.ExpiryDate = ExpiryDate;
	}

	public Scheme getScheme() {
		return Scheme;
	}

	public void setScheme(Scheme Scheme) {
		this.Scheme = Scheme;
	}

	public SecuritiesCertificate getIdentificationForSecuritiesCertificate() {
		return IdentificationForSecuritiesCertificate;
	}

	public void setIdentificationForSecuritiesCertificate(
			SecuritiesCertificate IdentificationForSecuritiesCertificate) {
		this.IdentificationForSecuritiesCertificate = IdentificationForSecuritiesCertificate;
	}

	public LotBreakdown getIdentificationForLot() {
		return IdentificationForLot;
	}

	public void setIdentificationForLot(LotBreakdown IdentificationForLot) {
		this.IdentificationForLot = IdentificationForLot;
	}

	public InformationPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(InformationPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public CashProceedsDefinition getIdentificationForCashProceedsIncome() {
		return IdentificationForCashProceedsIncome;
	}

	public void setIdentificationForCashProceedsIncome(
			CashProceedsDefinition IdentificationForCashProceedsIncome) {
		this.IdentificationForCashProceedsIncome = IdentificationForCashProceedsIncome;
	}

	public StatusReason getRelatedStatusReason() {
		return RelatedStatusReason;
	}

	public void setRelatedStatusReason(StatusReason RelatedStatusReason) {
		this.RelatedStatusReason = RelatedStatusReason;
	}

	public BankTransaction getIdentificationForBankTransaction() {
		return IdentificationForBankTransaction;
	}

	public void setIdentificationForBankTransaction(
			BankTransaction IdentificationForBankTransaction) {
		this.IdentificationForBankTransaction = IdentificationForBankTransaction;
	}

	public AccountIdentification getIdentificationForAccountCostReferencePattern() {
		return IdentificationForAccountCostReferencePattern;
	}

	public void setIdentificationForAccountCostReferencePattern(
			AccountIdentification IdentificationForAccountCostReferencePattern) {
		this.IdentificationForAccountCostReferencePattern = IdentificationForAccountCostReferencePattern;
	}

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}

	public SystemIdentification getRelatedSystemIdentification() {
		return RelatedSystemIdentification;
	}

	public void setRelatedSystemIdentification(
			SystemIdentification RelatedSystemIdentification) {
		this.RelatedSystemIdentification = RelatedSystemIdentification;
	}

	public Interest getIdentificationForInterestName() {
		return IdentificationForInterestName;
	}

	public void setIdentificationForInterestName(
			Interest IdentificationForInterestName) {
		this.IdentificationForInterestName = IdentificationForInterestName;
	}

	public CashAccountService getRelatedCashAccountService() {
		return RelatedCashAccountService;
	}

	public void setRelatedCashAccountService(
			CashAccountService RelatedCashAccountService) {
		this.RelatedCashAccountService = RelatedCashAccountService;
	}

	public InvestmentFundClass getIdentificationForInvestmentFundClass() {
		return IdentificationForInvestmentFundClass;
	}

	public void setIdentificationForInvestmentFundClass(
			InvestmentFundClass IdentificationForInvestmentFundClass) {
		this.IdentificationForInvestmentFundClass = IdentificationForInvestmentFundClass;
	}

	public Location getIdentifiedLocation() {
		return IdentifiedLocation;
	}

	public void setIdentifiedLocation(Location IdentifiedLocation) {
		this.IdentifiedLocation = IdentifiedLocation;
	}

	public SecuritiesIdentification getRelatedSecuritiesIdentification() {
		return RelatedSecuritiesIdentification;
	}

	public void setRelatedSecuritiesIdentification(
			SecuritiesIdentification RelatedSecuritiesIdentification) {
		this.RelatedSecuritiesIdentification = RelatedSecuritiesIdentification;
	}

	public Document getIdentifiedDocument() {
		return IdentifiedDocument;
	}

	public void setIdentifiedDocument(Document IdentifiedDocument) {
		this.IdentifiedDocument = IdentifiedDocument;
	}

	public PurchaseOrder getRelatedPurchaseOrder() {
		return RelatedPurchaseOrder;
	}

	public void setRelatedPurchaseOrder(PurchaseOrder RelatedPurchaseOrder) {
		this.RelatedPurchaseOrder = RelatedPurchaseOrder;
	}

	public RegisteredContract getRelatedCertificate() {
		return RelatedCertificate;
	}

	public void setRelatedCertificate(RegisteredContract RelatedCertificate) {
		this.RelatedCertificate = RelatedCertificate;
	}
}