package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTISODateTime;
import com.tools20022.repository.dict.entity.RTDocument;
import com.tools20022.repository.dict.codeset.RTCopyDuplicateCode;
import com.tools20022.repository.dict.codeset.RTDocumentTypeCode;
import com.tools20022.repository.dict.datatype.RTActiveCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.RTNumber;
import com.tools20022.repository.dict.datatype.RTMax140Text;
import com.tools20022.repository.dict.codeset.RTDataSetTypeCode;
import com.tools20022.repository.dict.datatype.RTYesNoIndicator;
import com.tools20022.repository.dict.datatype.RTCurrencyAndAmount;
import com.tools20022.repository.dict.codeset.RTLanguageCode;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.RTGenericIdentification;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.RTAgreement;
import com.tools20022.repository.GeneratedRepository;/**
 * General information that unambiguously identifies a document, such as identification number and issue date time.
 */
public class RTDocument extends MMBusinessComponent {

	private final static AtomicReference<RTDocument> repoTypeRef = new AtomicReference<>();
	/**
	 * Issue date of the document.
	 */
	public final MMBusinessAttribute attrIssueDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTISODateTime.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.name = "IssueDate";
			super.definition = "Issue date of the document.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies if this document is a copy, a duplicate, or a duplicate of a copy.
	 */
	public final MMBusinessAttribute attrCopyDuplicate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTCopyDuplicateCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.name = "CopyDuplicate";
			super.definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies the type of the document, for example commercial invoice.
	 */
	public final MMBusinessAttribute attrType = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTDocumentTypeCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.name = "Type";
			super.definition = "Specifies the type of the document, for example commercial invoice.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Amount of money and currency of a document. 
	The amount can be either the original amount due and payable for instance the ordered amount, or the amount actually remitted for the referred document.
	 */
	public final MMBusinessAttribute attrAmount = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTActiveCurrencyAndAmount.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.name = "Amount";
			super.definition = "Amount of money and currency of a document. \r\nThe amount can be either the original amount due and payable for instance the ordered amount, or the amount actually remitted for the referred document.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Unambiguous identification of the version of a document.
	 */
	public final MMBusinessAttribute attrDocumentVersion = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTNumber.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.name = "DocumentVersion";
			super.definition = "Unambiguous identification of the version of a document.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Status of the document (eg delivered, paid, etc.)
	 */
	public final MMBusinessAttribute attrStatus = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax140Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.name = "Status";
			super.definition = "Status of the document (eg delivered, paid, etc.)";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies the type of data set in which the document is included.
	 */
	public final MMBusinessAttribute attrDataSetType = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTDataSetTypeCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.name = "DataSetType";
			super.definition = "Specifies the type of data set in which the document is included.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Indication whether the document must be signed or not.
	 */
	public final MMBusinessAttribute attrSignedIndicator = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTYesNoIndicator.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.name = "SignedIndicator";
			super.definition = "Indication whether the document must be signed or not.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Amount of money remitted for the referred document.
	 */
	public final MMBusinessAttribute attrRemittedAmount = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTCurrencyAndAmount.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.name = "RemittedAmount";
			super.definition = "Amount of money remitted for the referred document.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Language used for textual information in the document.
	 */
	public final MMBusinessAttribute attrLanguage = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTLanguageCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.name = "Language";
			super.definition = "Language used for textual information in the document.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies the function of the document.
	 */
	public final MMBusinessAttribute attrPurpose = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.name = "Purpose";
			super.definition = "Specifies the function of the document.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Identification of a document for instance unique identification of the purchase order, assigned by the buyer.
	 */
	public final MMBusinessAssociationEnd refDocumentIdentification = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTGenericIdentification.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTDocument.repoType();
			super.name = "DocumentIdentification";
			super.definition = "Identification of a document for instance unique identification of the purchase order, assigned by the buyer.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTDocument repoType() {
		repoTypeRef.compareAndSet(null, new RTDocument());
		return repoTypeRef.get();
	}

	private RTDocument() {
		super.element = Arrays.asList(attrIssueDate, attrCopyDuplicate,
				attrType, attrAmount, attrDocumentVersion, attrStatus,
				attrDataSetType, attrSignedIndicator, attrRemittedAmount,
				attrLanguage, attrPurpose, refDocumentIdentification);
		super.associationDomain_lazy = () -> Arrays.asList(RTAgreement
				.repoType().refDocument);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Document";
		super.definition = "General information that unambiguously identifies a document, such as identification number and issue date time.";
	} }