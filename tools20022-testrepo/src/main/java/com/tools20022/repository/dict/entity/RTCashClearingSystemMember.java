package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTCHIPSUniversalIdentifier;
import com.tools20022.repository.dict.entity.RTCashClearingSystemMember;
import com.tools20022.repository.dict.datatype.RTNewZealandNCCIdentifier;
import com.tools20022.repository.dict.datatype.RTIrishNSCIdentifier;
import com.tools20022.repository.dict.datatype.RTUKDomesticSortCodeIdentifier;
import com.tools20022.repository.dict.datatype.RTCHIPSParticipantIdentifier;
import com.tools20022.repository.dict.datatype.RTSwissBCIdentifier;
import com.tools20022.repository.dict.datatype.RTFedwireRoutingNumberIdentifier;
import com.tools20022.repository.dict.datatype.RTPortugueseNCCIdentifier;
import com.tools20022.repository.dict.datatype.RTRussianCentralBankIdentificationCodeIdentifier;
import com.tools20022.repository.dict.datatype.RTItalianDomesticIdentifier;
import com.tools20022.repository.dict.datatype.RTAustrianBankleitzahlIdentifier;
import com.tools20022.repository.dict.datatype.RTCanadianPaymentsARNIdentifier;
import com.tools20022.repository.dict.datatype.RTSwissSICIdentifier;
import com.tools20022.repository.dict.datatype.RTGermanBankleitzahlIdentifier;
import com.tools20022.repository.dict.datatype.RTSpanishDomesticInterbankingIdentifier;
import com.tools20022.repository.dict.datatype.RTSouthAfricanNCCIdentifier;
import com.tools20022.repository.dict.datatype.RTHongKongBankIdentifier;
import com.tools20022.repository.dict.datatype.RTIndianFinancialSystemCodeIdentifier;
import com.tools20022.repository.dict.datatype.RTHellenicBankIdentificationCodeIdentifier;
import com.tools20022.repository.dict.datatype.RTPolishNationalClearingCodeIdentifier;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.RTOrganisationIdentification;
import com.tools20022.repository.GeneratedRepository;/**
 * Unique and unambiguous identifier for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier. The identifier can be used when transmitting, reconciling and confirming payment orders or security transfer instructions prior to settlement, and may include the netting of instructions and the establishment of final positions for settlement.
 */
public class RTCashClearingSystemMember extends MMBusinessComponent {

	private final static AtomicReference<RTCashClearingSystemMember> repoTypeRef = new AtomicReference<>();
	/**
	 * (United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.
	 */
	public final MMBusinessAttribute attrCHIPSUniversalIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTCHIPSUniversalIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "CHIPSUniversalIdentification";
			super.definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA).
	 */
	public final MMBusinessAttribute attrNewZealandNCC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTNewZealandNCCIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "NewZealandNCC";
			super.definition = "New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO).
	 */
	public final MMBusinessAttribute attrIrishNSC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTIrishNSCIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "IrishNSC";
			super.definition = "Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS).
	 */
	public final MMBusinessAttribute attrUKSortCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTUKDomesticSortCodeIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "UKSortCode";
			super.definition = "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * (United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House.
	 */
	public final MMBusinessAttribute attrCHIPSParticipantIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTCHIPSParticipantIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "CHIPSParticipantIdentification";
			super.definition = "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system.
	 */
	public final MMBusinessAttribute attrSwissBC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTSwissBCIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "SwissBC";
			super.definition = "Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Fed wire Routing Number - identifies financial institutions, in the US, on the Fed wire system. The routing number is assigned by the American Bankers Association (ABA).
	 */
	public final MMBusinessAttribute attrFedwireRoutingNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTFedwireRoutingNumberIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "FedwireRoutingNumber";
			super.definition = "Fed wire Routing Number - identifies financial institutions, in the US, on the Fed wire system. The routing number is assigned by the American Bankers Association (ABA).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Portuguese National Clearing Code - identifies Portuguese financial institutions on the Portuguese national clearing system.
	 */
	public final MMBusinessAttribute attrPortugueseNCC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTPortugueseNCCIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "PortugueseNCC";
			super.definition = "Portuguese National Clearing Code - identifies Portuguese financial institutions on the Portuguese national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Russian Central Bank Identification Code - identifies Russian financial institutions on the Russian national clearing system.
	 */
	public final MMBusinessAttribute attrRussianCentralBankIdentificationCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTRussianCentralBankIdentificationCodeIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "RussianCentralBankIdentificationCode";
			super.definition = "Russian Central Bank Identification Code - identifies Russian financial institutions on the Russian national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI).
	 */
	public final MMBusinessAttribute attrItalianDomesticIdentificationCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTItalianDomesticIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "ItalianDomesticIdentificationCode";
			super.definition = "Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system.
	 */
	public final MMBusinessAttribute attrAustrianBankleitzahl = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTAustrianBankleitzahlIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "AustrianBankleitzahl";
			super.definition = "Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system.
	 */
	public final MMBusinessAttribute attrCanadianPaymentsAssociationRoutingNumber = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTCanadianPaymentsARNIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "CanadianPaymentsAssociationRoutingNumber";
			super.definition = "Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system.
	 */
	public final MMBusinessAttribute attrSwissSIC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTSwissSICIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "SwissSIC";
			super.definition = "Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * German Bankleitzahl - identifies German financial institutions on the German national clearing systems.
	 */
	public final MMBusinessAttribute attrGermanBankleitzahl = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTGermanBankleitzahlIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "GermanBankleitzahl";
			super.definition = "German Bankleitzahl - identifies German financial institutions on the German national clearing systems.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI).
	 */
	public final MMBusinessAttribute attrSpanishDomesticInterbankingCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTSpanishDomesticInterbankingIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "SpanishDomesticInterbankingCode";
			super.definition = "Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * South African National Clearing Code (NCC) - identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ).
	 */
	public final MMBusinessAttribute attrSouthAfricanNCC = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTSouthAfricanNCCIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "SouthAfricanNCC";
			super.definition = "South African National Clearing Code (NCC) - identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system.
	 */
	public final MMBusinessAttribute attrHongKongBankCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTHongKongBankIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "HongKongBankCode";
			super.definition = "Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Indian Financial System Code - identifies Indian financial institutions on the Indian local clearing system.
	 */
	public final MMBusinessAttribute attrIndianFinancialSystemCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTIndianFinancialSystemCodeIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "IndianFinancialSystemCode";
			super.definition = "Indian Financial System Code - identifies Indian financial institutions on the Indian local clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Hellenic Bank Identification Code - identifies Hellenic financial institutions on the Hellenic national clearing system.
	 */
	public final MMBusinessAttribute attrHellenicBankIdentificationCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTHellenicBankIdentificationCodeIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "HellenicBankIdentificationCode";
			super.definition = "Hellenic Bank Identification Code - identifies Hellenic financial institutions on the Hellenic national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Polish National Clearing Code - identifies Polish financial institutions on the Polish national clearing system.
	 */
	public final MMBusinessAttribute attrPolishNationalClearingCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTPolishNationalClearingCodeIdentifier
					.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.name = "PolishNationalClearingCode";
			super.definition = "Polish National Clearing Code - identifies Polish financial institutions on the Polish national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTCashClearingSystemMember repoType() {
		repoTypeRef.compareAndSet(null, new RTCashClearingSystemMember());
		return repoTypeRef.get();
	}

	private RTCashClearingSystemMember() {
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
				.asList(RTOrganisationIdentification.repoType().refClearingSystemMemberIdentificationType);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CashClearingSystemMember";
		super.definition = "Unique and unambiguous identifier for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier. The identifier can be used when transmitting, reconciling and confirming payment orders or security transfer instructions prior to settlement, and may include the netting of instructions and the establishment of final positions for settlement.";
		super.semanticMarkup = Arrays.asList();
	} }