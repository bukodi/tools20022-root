package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTMax140Text;
import com.tools20022.repository.dict.msg.RTPartyIdentification43;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.msg.RTPostalAddress6;
import com.tools20022.repository.dict.choice.RTParty11Choice;
import com.tools20022.repository.dict.codeset.RTCountryCode;
import com.tools20022.repository.dict.msg.RTContactDetails2;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Set of elements used to identify a person or an organisation.
 */
public class RTPartyIdentification43 extends MMMessageComponent {

	private final static AtomicReference<RTPartyIdentification43> repoTypeRef = new AtomicReference<>();
	/**
	 * Name by which a party is known and which is usually used to identify that party.
	 */
	public final MMMessageAttribute attrName = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax140Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPartyIdentification43
					.repoType();
			super.xmlTag = "Nm";
			super.name = "Name";
			super.definition = "Name by which a party is known and which is usually used to identify that party.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Information that locates and identifies a specific address, as defined by postal services.
	 */
	public final MMMessageAssociationEnd refPostalAddress = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTPostalAddress6.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPartyIdentification43
					.repoType();
			super.xmlTag = "PstlAdr";
			super.name = "PostalAddress";
			super.definition = "Information that locates and identifies a specific address, as defined by postal services.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Unique and unambiguous identification of a party.
	 */
	public final MMMessageAssociationEnd refIdentification = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTParty11Choice.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPartyIdentification43
					.repoType();
			super.xmlTag = "Id";
			super.name = "Identification";
			super.definition = "Unique and unambiguous identification of a party.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Country in which a person resides (the place of a person's home). In the case of a company, it is the country from which the affairs of that company are directed.
	 */
	public final MMMessageAttribute attrCountryOfResidence = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTCountryCode.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPartyIdentification43
					.repoType();
			super.xmlTag = "CtryOfRes";
			super.name = "CountryOfResidence";
			super.definition = "Country in which a person resides (the place of a person's home). In the case of a company, it is the country from which the affairs of that company are directed.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Set of elements used to indicate how to contact the party.
	 */
	public final MMMessageAssociationEnd refContactDetails = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTContactDetails2.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPartyIdentification43
					.repoType();
			super.xmlTag = "CtctDtls";
			super.name = "ContactDetails";
			super.definition = "Set of elements used to indicate how to contact the party.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTPartyIdentification43 repoType() {
		repoTypeRef.compareAndSet(null, new RTPartyIdentification43());
		return repoTypeRef.get();
	}

	private RTPartyIdentification43() {
		super.messageElement = Arrays.asList(attrName, refPostalAddress,
				refIdentification, attrCountryOfResidence, refContactDetails);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PartyIdentification43";
		super.definition = "Set of elements used to identify a person or an organisation.";
	} }