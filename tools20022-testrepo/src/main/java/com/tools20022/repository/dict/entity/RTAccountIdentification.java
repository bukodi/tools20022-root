package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTIBAN2007Identifier;
import com.tools20022.repository.dict.entity.RTAccountIdentification;
import com.tools20022.repository.dict.datatype.RTBBANIdentifier;
import com.tools20022.repository.dict.datatype.RTUPICIdentifier;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.RTGenericIdentification;
import java.util.Arrays;
import com.tools20022.repository.dict.datatype.RTMax70Text;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.entity.RTAccount;
import com.tools20022.repository.GeneratedRepository;/**
 * Unique identifier of an account, as assigned by the account servicer.
 */
public class RTAccountIdentification extends MMBusinessComponent {

	private final static AtomicReference<RTAccountIdentification> repoTypeRef = new AtomicReference<>();
	/**
	 * International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 "Banking and related financial services - International Bank Account Number (IBAN)" version 1997-10-01, or later revisions.
	 */
	public final MMBusinessAttribute attrIBAN = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTIBAN2007Identifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAccountIdentification
					.repoType();
			super.name = "IBAN";
			super.definition = "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer.
	 */
	public final MMBusinessAttribute attrBBAN = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTBBANIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAccountIdentification
					.repoType();
			super.name = "BBAN";
			super.definition = "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.
	 */
	public final MMBusinessAttribute attrUPIC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTUPICIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAccountIdentification
					.repoType();
			super.name = "UPIC";
			super.definition = "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Unique identifier for an account. It is assigned by the account servicer using a proprietary identification scheme.
	 */
	public final MMBusinessAssociationEnd refProprietaryIdentification = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTGenericIdentification.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAccountIdentification
					.repoType();
			super.name = "ProprietaryIdentification";
			super.definition = "Unique identifier for an account. It is assigned by the account servicer using a proprietary identification scheme.";
			super.semanticMarkup = Arrays.asList();
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.
	 */
	public final MMBusinessAttribute attrName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAccountIdentification
					.repoType();
			super.name = "Name";
			super.definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * String of characters (mainly numbers) used to identify an account.
	 */
	public final MMBusinessAttribute attrNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAccountIdentification
					.repoType();
			super.name = "Number";
			super.definition = "String of characters (mainly numbers) used to identify an account.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTAccountIdentification repoType() {
		repoTypeRef.compareAndSet(null, new RTAccountIdentification());
		return repoTypeRef.get();
	}

	private RTAccountIdentification() {
		super.element = Arrays.asList(attrIBAN, attrBBAN, attrUPIC,
				refProprietaryIdentification, attrName, attrNumber);
		super.associationDomain_lazy = () -> Arrays
				.asList(RTAccount.repoType().refIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AccountIdentification";
		super.definition = "Unique identifier of an account, as assigned by the account servicer.";
	} }