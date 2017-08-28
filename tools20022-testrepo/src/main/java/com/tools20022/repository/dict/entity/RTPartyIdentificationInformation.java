package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.RTGenericIdentification;
import com.tools20022.repository.dict.entity.RTPartyIdentificationInformation;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.codeset.RTTypeOfIdentificationCode;
import com.tools20022.repository.dict.datatype.RTMax350Text;
import com.tools20022.repository.dict.codeset.RTPartyTypeCode;
import com.tools20022.repository.dict.datatype.RTLEIIdentifier;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.RTParty;
import com.tools20022.repository.GeneratedRepository;/**
 * Unique and unambiguous way to identify a party
 */
public class RTPartyIdentificationInformation extends MMBusinessComponent {

	private final static AtomicReference<RTPartyIdentificationInformation> repoTypeRef = new AtomicReference<>();
	/**
	 * Identifier issued to a party for which no specific identifier has been defined.
	 */
	public final MMBusinessAssociationEnd refOtherIdentification = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTGenericIdentification.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPartyIdentificationInformation
					.repoType();
			super.name = "OtherIdentification";
			super.definition = "Identifier issued to a party for which no specific identifier has been defined.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Number assigned by a tax authority to an entity.
	 */
	public final MMBusinessAttribute attrTaxIdentificationNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPartyIdentificationInformation
					.repoType();
			super.name = "TaxIdentificationNumber";
			super.definition = "Number assigned by a tax authority to an entity.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC.
	 */
	public final MMBusinessAttribute attrNationalRegistrationNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPartyIdentificationInformation
					.repoType();
			super.name = "NationalRegistrationNumber";
			super.definition = "Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Specifies the type of alternate identification which can be used to identify a party.
	 */
	public final MMBusinessAttribute attrTypeOfIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPartyIdentificationInformation
					.repoType();
			super.name = "TypeOfIdentification";
			super.definition = "Specifies the type of alternate identification which can be used to identify a party.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Provides declaration details relative to the party.
	 */
	public final MMBusinessAttribute attrDeclaration = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax350Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPartyIdentificationInformation
					.repoType();
			super.name = "Declaration";
			super.definition = "Provides declaration details relative to the party.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Specifies the type of party in different business contexts.
	 */
	public final MMBusinessAttribute attrPartyType = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTPartyTypeCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPartyIdentificationInformation
					.repoType();
			super.name = "PartyType";
			super.definition = "Specifies the type of party in different business contexts.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Legal Entity Identifier is a code allocated to a party as described in ISO 17442 "Financial Services - Legal Entity Identifier (LEI)".
	 */
	public final MMBusinessAttribute attrLEI = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTLEIIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPartyIdentificationInformation
					.repoType();
			super.name = "LEI";
			super.definition = "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTPartyIdentificationInformation repoType() {
		repoTypeRef.compareAndSet(null, new RTPartyIdentificationInformation());
		return repoTypeRef.get();
	}

	private RTPartyIdentificationInformation() {
		super.element = Arrays.asList(refOtherIdentification,
				attrTaxIdentificationNumber, attrNationalRegistrationNumber,
				attrTypeOfIdentification, attrDeclaration, attrPartyType,
				attrLEI);
		super.associationDomain_lazy = () -> Arrays
				.asList(RTParty.repoType().refIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PartyIdentificationInformation";
		super.definition = "Unique and unambiguous way to identify a party";
		super.semanticMarkup = Arrays.asList();
	} }