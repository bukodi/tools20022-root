package com.tools20022.repository.dict.choice;


import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTIBAN2007Identifier;
import com.tools20022.repository.dict.choice.RTAccountIdentification4Choice;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.msg.RTGenericAccountIdentification1;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the unique identification of an account as assigned by the account servicer.
 */
public class RTAccountIdentification4Choice extends MMChoiceComponent {

	private final static AtomicReference<RTAccountIdentification4Choice> repoTypeRef = new AtomicReference<>();
	/**
	 * International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 "Banking and related financial services - International Bank Account Number (IBAN)" version 1997-10-01, or later revisions.
	 */
	public final MMMessageAttribute attrIBAN = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTIBAN2007Identifier.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTAccountIdentification4Choice
					.repoType();
			super.xmlTag = "IBAN";
			super.name = "IBAN";
			super.definition = "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Unique identification of an account, as assigned by the account servicer, using an identification scheme.
	 */
	public final MMMessageAssociationEnd refOther = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTGenericAccountIdentification1.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTAccountIdentification4Choice
					.repoType();
			super.xmlTag = "Othr";
			super.name = "Other";
			super.definition = "Unique identification of an account, as assigned by the account servicer, using an identification scheme.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTAccountIdentification4Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTAccountIdentification4Choice());
		return repoTypeRef.get();
	}

	private RTAccountIdentification4Choice() {
		super.messageElement = Arrays.asList(attrIBAN, refOther);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AccountIdentification4Choice";
		super.definition = "Specifies the unique identification of an account as assigned by the account servicer.";
	} }