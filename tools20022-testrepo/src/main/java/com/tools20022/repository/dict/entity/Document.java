package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.Document;
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
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.GenericIdentification;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.Agreement;
import com.tools20022.repository.GeneratedRepository;

public class Document extends MMBusinessComponent {

	private final static AtomicReference<Document> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrIssueDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ISODateTime.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Document.repoType();
			super.name = "IssueDate";
			super.definition = "Issue date of the document.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrCopyDuplicate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> CopyDuplicateCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Document.repoType();
			super.name = "CopyDuplicate";
			super.definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrType = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> DocumentTypeCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Document.repoType();
			super.name = "Type";
			super.definition = "Specifies the type of the document, for example commercial invoice.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrAmount = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ActiveCurrencyAndAmount.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Document.repoType();
			super.name = "Amount";
			super.definition = "Amount of money and currency of a document. \r\nThe amount can be either the original amount due and payable for instance the ordered amount, or the amount actually remitted for the referred document.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrDocumentVersion = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Number.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Document.repoType();
			super.name = "DocumentVersion";
			super.definition = "Unambiguous identification of the version of a document.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrStatus = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max140Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Document.repoType();
			super.name = "Status";
			super.definition = "Status of the document (eg delivered, paid, etc.)";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrDataSetType = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> DataSetTypeCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Document.repoType();
			super.name = "DataSetType";
			super.definition = "Specifies the type of data set in which the document is included.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrSignedIndicator = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> YesNoIndicator.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Document.repoType();
			super.name = "SignedIndicator";
			super.definition = "Indication whether the document must be signed or not.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrRemittedAmount = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> CurrencyAndAmount.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Document.repoType();
			super.name = "RemittedAmount";
			super.definition = "Amount of money remitted for the referred document.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrLanguage = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> LanguageCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Document.repoType();
			super.name = "Language";
			super.definition = "Language used for textual information in the document.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrPurpose = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Document.repoType();
			super.name = "Purpose";
			super.definition = "Specifies the function of the document.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAssociationEnd refDocumentIdentification = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> GenericIdentification.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Document.repoType();
			super.name = "DocumentIdentification";
			super.definition = "Identification of a document for instance unique identification of the purchase order, assigned by the buyer.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static Document repoType() {
		repoTypeRef.compareAndSet(null, new Document());
		return repoTypeRef.get();
	}

	private Document() {
		super.element = Arrays.asList(attrIssueDate, attrCopyDuplicate,
				attrType, attrAmount, attrDocumentVersion, attrStatus,
				attrDataSetType, attrSignedIndicator, attrRemittedAmount,
				attrLanguage, attrPurpose, refDocumentIdentification);
		super.associationDomain_lazy = () -> Arrays
				.asList(Agreement.repoType().refDocument);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Document";
		super.definition = "General information that unambiguously identifies a document, such as identification number and issue date time.";
	}
}