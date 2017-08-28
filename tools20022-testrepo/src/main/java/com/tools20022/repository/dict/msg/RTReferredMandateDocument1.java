package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.msg.RTReferredDocumentType4;
import com.tools20022.repository.dict.msg.RTReferredMandateDocument1;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.datatype.RTISODate;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Identifies the documents referred to in the remittance information.
 */
public class RTReferredMandateDocument1 extends MMMessageComponent {

	private final static AtomicReference<RTReferredMandateDocument1> repoTypeRef = new AtomicReference<>();
	/**
	 * Specifies the type of referred document.
	 */
	public final MMMessageAssociationEnd refType = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTReferredDocumentType4.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTReferredMandateDocument1
					.repoType();
			super.xmlTag = "Tp";
			super.name = "Type";
			super.definition = "Specifies the type of referred document.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Unique and unambiguous identification of the referred document.
	 */
	public final MMMessageAttribute attrNumber = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTReferredMandateDocument1
					.repoType();
			super.xmlTag = "Nb";
			super.name = "Number";
			super.definition = "Unique and unambiguous identification of the referred document.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Unique and unambiguous identification as assigned by the creditor to the referred document shared with the debtor for its own reference.
	 */
	public final MMMessageAttribute attrCreditorReference = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTReferredMandateDocument1
					.repoType();
			super.xmlTag = "CdtrRef";
			super.name = "CreditorReference";
			super.definition = "Unique and unambiguous identification as assigned by the creditor to the referred document shared with the debtor for its own reference.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Date associated with the referred document.
	 */
	public final MMMessageAttribute attrRelatedDate = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTReferredMandateDocument1
					.repoType();
			super.xmlTag = "RltdDt";
			super.name = "RelatedDate";
			super.definition = "Date associated with the referred document.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTReferredMandateDocument1 repoType() {
		repoTypeRef.compareAndSet(null, new RTReferredMandateDocument1());
		return repoTypeRef.get();
	}

	private RTReferredMandateDocument1() {
		super.messageElement = Arrays.asList(refType, attrNumber,
				attrCreditorReference, attrRelatedDate);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ReferredMandateDocument1";
		super.definition = "Identifies the documents referred to in the remittance information.";
	} }