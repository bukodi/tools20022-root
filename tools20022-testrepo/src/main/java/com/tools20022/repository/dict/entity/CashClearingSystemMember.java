package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.CHIPSUniversalIdentifier;
import com.tools20022.repository.dict.entity.CashClearingSystemMember;
import com.tools20022.repository.dict.datatype.NewZealandNCCIdentifier;
import com.tools20022.repository.dict.datatype.IrishNSCIdentifier;
import com.tools20022.repository.dict.datatype.UKDomesticSortCodeIdentifier;
import com.tools20022.repository.dict.datatype.CHIPSParticipantIdentifier;
import com.tools20022.repository.dict.datatype.SwissBCIdentifier;
import com.tools20022.repository.dict.datatype.FedwireRoutingNumberIdentifier;
import com.tools20022.repository.dict.datatype.PortugueseNCCIdentifier;
import com.tools20022.repository.dict.datatype.RussianCentralBankIdentificationCodeIdentifier;
import com.tools20022.repository.dict.datatype.ItalianDomesticIdentifier;
import com.tools20022.repository.dict.datatype.AustrianBankleitzahlIdentifier;
import com.tools20022.repository.dict.datatype.CanadianPaymentsARNIdentifier;
import com.tools20022.repository.dict.datatype.SwissSICIdentifier;
import com.tools20022.repository.dict.datatype.GermanBankleitzahlIdentifier;
import com.tools20022.repository.dict.datatype.SpanishDomesticInterbankingIdentifier;
import com.tools20022.repository.dict.datatype.SouthAfricanNCCIdentifier;
import com.tools20022.repository.dict.datatype.HongKongBankIdentifier;
import com.tools20022.repository.dict.datatype.IndianFinancialSystemCodeIdentifier;
import com.tools20022.repository.dict.datatype.HellenicBankIdentificationCodeIdentifier;
import com.tools20022.repository.dict.datatype.PolishNationalClearingCodeIdentifier;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.OrganisationIdentification;
import com.tools20022.repository.GeneratedRepository;

public class CashClearingSystemMember extends MMBusinessComponent {

	private final static AtomicReference<CashClearingSystemMember> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrCHIPSUniversalIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> CHIPSUniversalIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "CHIPSUniversalIdentification";
			super.definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrNewZealandNCC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> NewZealandNCCIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "NewZealandNCC";
			super.definition = "New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA).";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrIrishNSC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> IrishNSCIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "IrishNSC";
			super.definition = "Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO).";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrUKSortCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> UKDomesticSortCodeIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "UKSortCode";
			super.definition = "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS).";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrCHIPSParticipantIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> CHIPSParticipantIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "CHIPSParticipantIdentification";
			super.definition = "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrSwissBC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> SwissBCIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "SwissBC";
			super.definition = "Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrFedwireRoutingNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> FedwireRoutingNumberIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "FedwireRoutingNumber";
			super.definition = "Fed wire Routing Number - identifies financial institutions, in the US, on the Fed wire system. The routing number is assigned by the American Bankers Association (ABA).";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrPortugueseNCC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> PortugueseNCCIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "PortugueseNCC";
			super.definition = "Portuguese National Clearing Code - identifies Portuguese financial institutions on the Portuguese national clearing system.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrRussianCentralBankIdentificationCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RussianCentralBankIdentificationCodeIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "RussianCentralBankIdentificationCode";
			super.definition = "Russian Central Bank Identification Code - identifies Russian financial institutions on the Russian national clearing system.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrItalianDomesticIdentificationCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ItalianDomesticIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "ItalianDomesticIdentificationCode";
			super.definition = "Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI).";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrAustrianBankleitzahl = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> AustrianBankleitzahlIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "AustrianBankleitzahl";
			super.definition = "Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrCanadianPaymentsAssociationRoutingNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> CanadianPaymentsARNIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "CanadianPaymentsAssociationRoutingNumber";
			super.definition = "Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrSwissSIC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> SwissSICIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "SwissSIC";
			super.definition = "Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrGermanBankleitzahl = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> GermanBankleitzahlIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "GermanBankleitzahl";
			super.definition = "German Bankleitzahl - identifies German financial institutions on the German national clearing systems.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrSpanishDomesticInterbankingCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> SpanishDomesticInterbankingIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "SpanishDomesticInterbankingCode";
			super.definition = "Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI).";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrSouthAfricanNCC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> SouthAfricanNCCIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "SouthAfricanNCC";
			super.definition = "South African National Clearing Code (NCC) - identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ).";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrHongKongBankCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> HongKongBankIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "HongKongBankCode";
			super.definition = "Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrIndianFinancialSystemCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> IndianFinancialSystemCodeIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "IndianFinancialSystemCode";
			super.definition = "Indian Financial System Code - identifies Indian financial institutions on the Indian local clearing system.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrHellenicBankIdentificationCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> HellenicBankIdentificationCodeIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "HellenicBankIdentificationCode";
			super.definition = "Hellenic Bank Identification Code - identifies Hellenic financial institutions on the Hellenic national clearing system.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrPolishNationalClearingCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> PolishNationalClearingCodeIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystemMember
					.repoType();
			super.name = "PolishNationalClearingCode";
			super.definition = "Polish National Clearing Code - identifies Polish financial institutions on the Polish national clearing system.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static CashClearingSystemMember repoType() {
		repoTypeRef.compareAndSet(null, new CashClearingSystemMember());
		return repoTypeRef.get();
	}

	private CashClearingSystemMember() {
		super.element = Arrays.asList(attrCHIPSUniversalIdentification,
				attrNewZealandNCC, attrIrishNSC, attrUKSortCode,
				attrCHIPSParticipantIdentification, attrSwissBC,
				attrFedwireRoutingNumber, attrPortugueseNCC,
				attrRussianCentralBankIdentificationCode,
				attrItalianDomesticIdentificationCode,
				attrAustrianBankleitzahl,
				attrCanadianPaymentsAssociationRoutingNumber, attrSwissSIC,
				attrGermanBankleitzahl, attrSpanishDomesticInterbankingCode,
				attrSouthAfricanNCC, attrHongKongBankCode,
				attrIndianFinancialSystemCode,
				attrHellenicBankIdentificationCode,
				attrPolishNationalClearingCode);
		super.associationDomain_lazy = () -> Arrays
				.asList(OrganisationIdentification.repoType().refClearingSystemMemberIdentificationType);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CashClearingSystemMember";
		super.definition = "Unique and unambiguous identifier for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier. The identifier can be used when transmitting, reconciling and confirming payment orders or security transfer instructions prior to settlement, and may include the netting of instructions and the establishment of final positions for settlement.";
		super.semanticMarkup = Arrays.asList();
	}
}