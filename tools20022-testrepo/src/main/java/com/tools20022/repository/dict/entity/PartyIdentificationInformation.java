package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.entity.PartyIdentificationInformation;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.TypeOfIdentificationCode;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.codeset.PartyTypeCode;
import com.tools20022.repository.dict.datatype.LEIIdentifier;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.Party;
import com.tools20022.repository.GeneratedRepository;

public class PartyIdentificationInformation extends MMBusinessComponent {

	private final static AtomicReference<PartyIdentificationInformation> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAssociationEnd refOtherIdentification = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> GenericIdentification.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PartyIdentificationInformation
					.repoType();
			super.name = "OtherIdentification";
			super.definition = "Identifier issued to a party for which no specific identifier has been defined.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrTaxIdentificationNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PartyIdentificationInformation
					.repoType();
			super.name = "TaxIdentificationNumber";
			super.definition = "Number assigned by a tax authority to an entity.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrNationalRegistrationNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PartyIdentificationInformation
					.repoType();
			super.name = "NationalRegistrationNumber";
			super.definition = "Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC.";
			super.minOccurs = 0;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrTypeOfIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> TypeOfIdentificationCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PartyIdentificationInformation
					.repoType();
			super.name = "TypeOfIdentification";
			super.definition = "Specifies the type of alternate identification which can be used to identify a party.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrDeclaration = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max350Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PartyIdentificationInformation
					.repoType();
			super.name = "Declaration";
			super.definition = "Provides declaration details relative to the party.";
			super.minOccurs = 0;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrPartyType = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> PartyTypeCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PartyIdentificationInformation
					.repoType();
			super.name = "PartyType";
			super.definition = "Specifies the type of party in different business contexts.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrLEI = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> LEIIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PartyIdentificationInformation
					.repoType();
			super.name = "LEI";
			super.definition = "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static PartyIdentificationInformation repoType() {
		repoTypeRef.compareAndSet(null, new PartyIdentificationInformation());
		return repoTypeRef.get();
	}

	private PartyIdentificationInformation() {
		super.element = Arrays.asList(refOtherIdentification,
				attrTaxIdentificationNumber, attrNationalRegistrationNumber,
				attrTypeOfIdentification, attrDeclaration, attrPartyType,
				attrLEI);
		super.associationDomain_lazy = () -> Arrays
				.asList(Party.repoType().refIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PartyIdentificationInformation";
		super.definition = "Unique and unambiguous way to identify a party";
		super.semanticMarkup = Arrays.asList();
	}
}