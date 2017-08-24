package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.IBAN2007Identifier;
import com.tools20022.repository.dict.entity.AccountIdentification;
import com.tools20022.repository.dict.datatype.BBANIdentifier;
import com.tools20022.repository.dict.datatype.UPICIdentifier;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.GenericIdentification;
import java.util.Arrays;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.GeneratedRepository;

public class AccountIdentification extends MMBusinessComponent {

	private final static AtomicReference<AccountIdentification> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrIBAN = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> IBAN2007Identifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> AccountIdentification.repoType();
			super.name = "IBAN";
			super.definition = "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrBBAN = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> BBANIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> AccountIdentification.repoType();
			super.name = "BBAN";
			super.definition = "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrUPIC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> UPICIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> AccountIdentification.repoType();
			super.name = "UPIC";
			super.definition = "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAssociationEnd refProprietaryIdentification = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> GenericIdentification.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> AccountIdentification.repoType();
			super.name = "ProprietaryIdentification";
			super.definition = "Unique identifier for an account. It is assigned by the account servicer using a proprietary identification scheme.";
			super.semanticMarkup = Arrays.asList();
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max70Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> AccountIdentification.repoType();
			super.name = "Name";
			super.definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> AccountIdentification.repoType();
			super.name = "Number";
			super.definition = "String of characters (mainly numbers) used to identify an account.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static AccountIdentification repoType() {
		repoTypeRef.compareAndSet(null, new AccountIdentification());
		return repoTypeRef.get();
	}

	private AccountIdentification() {
		super.element = Arrays.asList(attrIBAN, attrBBAN, attrUPIC,
				refProprietaryIdentification, attrName, attrNumber);
		super.associationDomain_lazy = () -> Arrays
				.asList(Account.repoType().refIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AccountIdentification";
		super.definition = "Unique identifier of an account, as assigned by the account servicer.";
	}
}