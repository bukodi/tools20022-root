package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTBICFIIdentifier;
import com.tools20022.repository.dict.entity.RTOrganisationIdentification;
import com.tools20022.repository.dict.datatype.RTAnyBICIdentifier;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.RTCashClearingSystemMember;
import com.tools20022.repository.dict.datatype.RTBICNonFIIdentifier;
import com.tools20022.repository.dict.datatype.RTEANGLNIdentifier;
import com.tools20022.repository.dict.datatype.RTCHIPSUniversalIdentifier;
import com.tools20022.repository.dict.datatype.RTDunsIdentifier;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.datatype.RTMICIdentifier;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.RTOrganisation;
import com.tools20022.repository.GeneratedRepository;/**
 * Unique and unambiguous way to identify an organisation.
 */
public class RTOrganisationIdentification extends MMBusinessComponent {

	private final static AtomicReference<RTOrganisationIdentification> repoTypeRef = new AtomicReference<>();
	/**
	 * Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 "Banking - Banking telecommunication messages - Business identifier code (BIC)".
	 */
	public final MMBusinessAttribute attrBICFI = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTBICFIIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.name = "BICFI";
			super.definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 "Banking - Banking telecommunication messages - Business identifier code (BIC)".
	 */
	public final MMBusinessAttribute attrAnyBIC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTAnyBICIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.name = "AnyBIC";
			super.definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator.
	 */
	public final MMBusinessAssociationEnd refClearingSystemMemberIdentificationType = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTCashClearingSystemMember.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.name = "ClearingSystemMemberIdentificationType";
			super.definition = "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator.";
			super.minOccurs = 0;
		}
	};
	/**
	 * Code allocated to a non-financial institution by the ISO 9362 Registration Authority as described in ISO 9362 "Banking - Banking telecommunication messages - Business identifier code (BIC)".
	 */
	public final MMBusinessAttribute attrBICNonFI = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTBICNonFIIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.name = "BICNonFI";
			super.definition = "Code allocated to a non-financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Global Location Number. A non-significant reference number used to identify legal entities, functional entities, or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve detailed information that is linked to it.
	 */
	public final MMBusinessAttribute attrEANGLN = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTEANGLNIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.name = "EANGLN";
			super.definition = "Global Location Number. A non-significant reference number used to identify legal entities, functional entities, or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve detailed information that is linked to it.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * (United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID). Identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.
	 */
	public final MMBusinessAttribute attrCHIPSUniversalIdentifier = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTCHIPSUniversalIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.name = "CHIPSUniversalIdentifier";
			super.definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID). Identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Data Universal Numbering System. A unique identification number provided by Dun 	&amp; Bradstreet to identify an organization.
	 */
	public final MMBusinessAttribute attrDUNS = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTDunsIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.name = "DUNS";
			super.definition = "Data Universal Numbering System. A unique identification number provided by Dun & Bradstreet to identify an organization.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Unique and unambiguous assignment made by a specific bank to identify a relationship as defined between the bank and its client.
	 */
	public final MMBusinessAttribute attrBankPartyIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.name = "BankPartyIdentification";
			super.definition = "Unique and unambiguous assignment made by a specific bank to identify a relationship as defined between the bank and its client.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Market Identifier Code. Identification of a financial market, as stipulated in the norm ISO 10383 "Codes for exchanges and market identifications".
	 */
	public final MMBusinessAttribute attrMIC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMICIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.name = "MIC";
			super.definition = "Market Identifier Code. Identification of a financial market, as stipulated in the norm ISO 10383 \"Codes for exchanges and market identifications\".";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTOrganisationIdentification repoType() {
		repoTypeRef.compareAndSet(null, new RTOrganisationIdentification());
		return repoTypeRef.get();
	}

	private RTOrganisationIdentification() {
		super.element = Arrays.asList(attrBICFI, attrAnyBIC,
				refClearingSystemMemberIdentificationType, attrBICNonFI,
				attrEANGLN, attrCHIPSUniversalIdentifier, attrDUNS,
				attrBankPartyIdentification, attrMIC);
		super.associationDomain_lazy = () -> Arrays.asList(RTOrganisation
				.repoType().refOrganisationIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "OrganisationIdentification";
		super.definition = "Unique and unambiguous way to identify an organisation.";
	} }