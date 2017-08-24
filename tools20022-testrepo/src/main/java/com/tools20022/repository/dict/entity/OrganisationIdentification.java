package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.BICFIIdentifier;
import com.tools20022.repository.dict.entity.OrganisationIdentification;
import com.tools20022.repository.dict.datatype.AnyBICIdentifier;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.CashClearingSystemMember;
import com.tools20022.repository.dict.datatype.BICNonFIIdentifier;
import com.tools20022.repository.dict.datatype.EANGLNIdentifier;
import com.tools20022.repository.dict.datatype.CHIPSUniversalIdentifier;
import com.tools20022.repository.dict.datatype.DunsIdentifier;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.MICIdentifier;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.Organisation;
import com.tools20022.repository.GeneratedRepository;

public class OrganisationIdentification extends MMBusinessComponent {

	private final static AtomicReference<OrganisationIdentification> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrBICFI = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> BICFIIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> OrganisationIdentification
					.repoType();
			super.name = "BICFI";
			super.definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrAnyBIC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> AnyBICIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> OrganisationIdentification
					.repoType();
			super.name = "AnyBIC";
			super.definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAssociationEnd refClearingSystemMemberIdentificationType = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> CashClearingSystemMember.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> OrganisationIdentification
					.repoType();
			super.name = "ClearingSystemMemberIdentificationType";
			super.definition = "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator.";
			super.minOccurs = 0;
		}
	};
	public final MMBusinessAttribute attrBICNonFI = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> BICNonFIIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> OrganisationIdentification
					.repoType();
			super.name = "BICNonFI";
			super.definition = "Code allocated to a non-financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrEANGLN = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> EANGLNIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> OrganisationIdentification
					.repoType();
			super.name = "EANGLN";
			super.definition = "Global Location Number. A non-significant reference number used to identify legal entities, functional entities, or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve detailed information that is linked to it.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrCHIPSUniversalIdentifier = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> CHIPSUniversalIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> OrganisationIdentification
					.repoType();
			super.name = "CHIPSUniversalIdentifier";
			super.definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID). Identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrDUNS = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> DunsIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> OrganisationIdentification
					.repoType();
			super.name = "DUNS";
			super.definition = "Data Universal Numbering System. A unique identification number provided by Dun & Bradstreet to identify an organization.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrBankPartyIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> OrganisationIdentification
					.repoType();
			super.name = "BankPartyIdentification";
			super.definition = "Unique and unambiguous assignment made by a specific bank to identify a relationship as defined between the bank and its client.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrMIC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> MICIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> OrganisationIdentification
					.repoType();
			super.name = "MIC";
			super.definition = "Market Identifier Code. Identification of a financial market, as stipulated in the norm ISO 10383 \"Codes for exchanges and market identifications\".";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static OrganisationIdentification repoType() {
		repoTypeRef.compareAndSet(null, new OrganisationIdentification());
		return repoTypeRef.get();
	}

	private OrganisationIdentification() {
		super.element = Arrays.asList(attrBICFI, attrAnyBIC,
				refClearingSystemMemberIdentificationType, attrBICNonFI,
				attrEANGLN, attrCHIPSUniversalIdentifier, attrDUNS,
				attrBankPartyIdentification, attrMIC);
		super.associationDomain_lazy = () -> Arrays.asList(Organisation
				.repoType().refOrganisationIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "OrganisationIdentification";
		super.definition = "Unique and unambiguous way to identify an organisation.";
	}
}