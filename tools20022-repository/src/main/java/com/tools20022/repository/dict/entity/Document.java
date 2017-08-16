package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.CopyDuplicateCode;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.codeset.DocumentTypeCode;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.entity.Agreement;
import com.tools20022.repository.dict.entity.Location;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.entity.Reconciliation;
import com.tools20022.repository.dict.entity.LetterOfCredit;
import com.tools20022.repository.dict.entity.DocumentPartyRole;
import com.tools20022.repository.dict.codeset.DataSetTypeCode;
import com.tools20022.repository.dict.entity.Transport;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.Guarantee;
import com.tools20022.repository.dict.codeset.LanguageCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.entity.Evidence;
import com.tools20022.repository.dict.entity.CommercialTrade;
import com.tools20022.repository.dict.entity.Presentation;
import com.tools20022.repository.dict.entity.RegisteredContract;

/**
 * General information that unambiguously identifies a document, such as
 * identification number and issue date time.
 */
public class Document extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ISODateTime IssueDate;
	private CopyDuplicateCode CopyDuplicate;
	private ContactPoint PlaceOfStorage;
	private PaymentObligation PaymentObligation;
	private DocumentTypeCode Type;
	private ActiveCurrencyAndAmount Amount;
	private Agreement Agreement;
	private Location PlaceOfIssue;
	private Number DocumentVersion;
	private Max140Text Status;
	private Reconciliation Reconciliation;
	private LetterOfCredit LetterOfCredit;
	private DocumentPartyRole PartyRole;
	private DataSetTypeCode DataSetType;
	private Transport Transport;
	private YesNoIndicator SignedIndicator;
	private CurrencyAndAmount RemittedAmount;
	private Guarantee Guarantee;
	private LanguageCode Language;
	private Max35Text Purpose;
	private GenericIdentification DocumentIdentification;
	private Evidence Evidence;
	private CommercialTrade CommercialTrade;
	private Presentation Presentation;
	private RegisteredContract RelatedContract;

	public ISODateTime getIssueDate() {
		return IssueDate;
	}

	public void setIssueDate(ISODateTime IssueDate) {
		this.IssueDate = IssueDate;
	}

	public CopyDuplicateCode getCopyDuplicate() {
		return CopyDuplicate;
	}

	public void setCopyDuplicate(CopyDuplicateCode CopyDuplicate) {
		this.CopyDuplicate = CopyDuplicate;
	}

	public ContactPoint getPlaceOfStorage() {
		return PlaceOfStorage;
	}

	public void setPlaceOfStorage(ContactPoint PlaceOfStorage) {
		this.PlaceOfStorage = PlaceOfStorage;
	}

	public PaymentObligation getPaymentObligation() {
		return PaymentObligation;
	}

	public void setPaymentObligation(PaymentObligation PaymentObligation) {
		this.PaymentObligation = PaymentObligation;
	}

	public DocumentTypeCode getType() {
		return Type;
	}

	public void setType(DocumentTypeCode Type) {
		this.Type = Type;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(ActiveCurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public Agreement getAgreement() {
		return Agreement;
	}

	public void setAgreement(Agreement Agreement) {
		this.Agreement = Agreement;
	}

	public Location getPlaceOfIssue() {
		return PlaceOfIssue;
	}

	public void setPlaceOfIssue(Location PlaceOfIssue) {
		this.PlaceOfIssue = PlaceOfIssue;
	}

	public Number getDocumentVersion() {
		return DocumentVersion;
	}

	public void setDocumentVersion(Number DocumentVersion) {
		this.DocumentVersion = DocumentVersion;
	}

	public Max140Text getStatus() {
		return Status;
	}

	public void setStatus(Max140Text Status) {
		this.Status = Status;
	}

	public Reconciliation getReconciliation() {
		return Reconciliation;
	}

	public void setReconciliation(Reconciliation Reconciliation) {
		this.Reconciliation = Reconciliation;
	}

	public LetterOfCredit getLetterOfCredit() {
		return LetterOfCredit;
	}

	public void setLetterOfCredit(LetterOfCredit LetterOfCredit) {
		this.LetterOfCredit = LetterOfCredit;
	}

	public DocumentPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(DocumentPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public DataSetTypeCode getDataSetType() {
		return DataSetType;
	}

	public void setDataSetType(DataSetTypeCode DataSetType) {
		this.DataSetType = DataSetType;
	}

	public Transport getTransport() {
		return Transport;
	}

	public void setTransport(Transport Transport) {
		this.Transport = Transport;
	}

	public YesNoIndicator getSignedIndicator() {
		return SignedIndicator;
	}

	public void setSignedIndicator(YesNoIndicator SignedIndicator) {
		this.SignedIndicator = SignedIndicator;
	}

	public CurrencyAndAmount getRemittedAmount() {
		return RemittedAmount;
	}

	public void setRemittedAmount(CurrencyAndAmount RemittedAmount) {
		this.RemittedAmount = RemittedAmount;
	}

	public Guarantee getGuarantee() {
		return Guarantee;
	}

	public void setGuarantee(Guarantee Guarantee) {
		this.Guarantee = Guarantee;
	}

	public LanguageCode getLanguage() {
		return Language;
	}

	public void setLanguage(LanguageCode Language) {
		this.Language = Language;
	}

	public Max35Text getPurpose() {
		return Purpose;
	}

	public void setPurpose(Max35Text Purpose) {
		this.Purpose = Purpose;
	}

	public GenericIdentification getDocumentIdentification() {
		return DocumentIdentification;
	}

	public void setDocumentIdentification(
			GenericIdentification DocumentIdentification) {
		this.DocumentIdentification = DocumentIdentification;
	}

	public Evidence getEvidence() {
		return Evidence;
	}

	public void setEvidence(Evidence Evidence) {
		this.Evidence = Evidence;
	}

	public CommercialTrade getCommercialTrade() {
		return CommercialTrade;
	}

	public void setCommercialTrade(CommercialTrade CommercialTrade) {
		this.CommercialTrade = CommercialTrade;
	}

	public Presentation getPresentation() {
		return Presentation;
	}

	public void setPresentation(Presentation Presentation) {
		this.Presentation = Presentation;
	}

	public RegisteredContract getRelatedContract() {
		return RelatedContract;
	}

	public void setRelatedContract(RegisteredContract RelatedContract) {
		this.RelatedContract = RelatedContract;
	}
}