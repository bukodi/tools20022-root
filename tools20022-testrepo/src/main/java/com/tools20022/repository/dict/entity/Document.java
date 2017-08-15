package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.InstanceOf;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.CopyDuplicateCode;
import com.tools20022.repository.dict.codeset.DocumentTypeCode;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.codeset.DataSetTypeCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.LanguageCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.GenericIdentification;

/**
 * General information that unambiguously identifies a document, such as
 * identification number and issue date time.
 */
public class Document implements InstanceOf<MMBusinessComponent> {

	private ISODateTime IssueDate;
	private CopyDuplicateCode CopyDuplicate;
	private DocumentTypeCode Type;
	private ActiveCurrencyAndAmount Amount;
	private Number DocumentVersion;
	private Max140Text Status;
	private DataSetTypeCode DataSetType;
	private YesNoIndicator SignedIndicator;
	private CurrencyAndAmount RemittedAmount;
	private LanguageCode Language;
	private Max35Text Purpose;
	private GenericIdentification DocumentIdentification;

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

	public DataSetTypeCode getDataSetType() {
		return DataSetType;
	}

	public void setDataSetType(DataSetTypeCode DataSetType) {
		this.DataSetType = DataSetType;
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
}