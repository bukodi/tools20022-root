package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTCHIPSUniversalIdentifier;
import test.repository.dict.entity.RTCashClearingSystemMember;
import test.repository.dict.datatype.RTNewZealandNCCIdentifier;
import test.repository.dict.datatype.RTIrishNSCIdentifier;
import test.repository.dict.datatype.RTUKDomesticSortCodeIdentifier;
import test.repository.dict.datatype.RTCHIPSParticipantIdentifier;
import test.repository.dict.datatype.RTSwissBCIdentifier;
import test.repository.dict.datatype.RTFedwireRoutingNumberIdentifier;
import test.repository.dict.datatype.RTPortugueseNCCIdentifier;
import test.repository.dict.datatype.RTRussianCentralBankIdentificationCodeIdentifier;
import test.repository.dict.datatype.RTItalianDomesticIdentifier;
import test.repository.dict.datatype.RTAustrianBankleitzahlIdentifier;
import test.repository.dict.datatype.RTCanadianPaymentsARNIdentifier;
import test.repository.dict.datatype.RTSwissSICIdentifier;
import test.repository.dict.datatype.RTGermanBankleitzahlIdentifier;
import test.repository.dict.datatype.RTSpanishDomesticInterbankingIdentifier;
import test.repository.dict.datatype.RTSouthAfricanNCCIdentifier;
import test.repository.dict.datatype.RTHongKongBankIdentifier;
import test.repository.dict.datatype.RTIndianFinancialSystemCodeIdentifier;
import test.repository.dict.datatype.RTHellenicBankIdentificationCodeIdentifier;
import test.repository.dict.datatype.RTPolishNationalClearingCodeIdentifier;
import java.util.Arrays;
import test.repository.dict.entity.RTOrganisationIdentification.ClearingSystemMemberIdentificationType;
import test.repository.GeneratedRepository.DataDictionary;

public class RTCashClearingSystemMember extends MMBusinessComponent {

	private final static AtomicReference<RTCashClearingSystemMember> repoTypeRef = new AtomicReference<>();

	public static RTCashClearingSystemMember repoType() {
		repoTypeRef.compareAndSet(null, new RTCashClearingSystemMember());
		return repoTypeRef.get();
	}

	private RTCashClearingSystemMember() {
		super.element = Arrays.asList(CHIPSUniversalIdentification.repoType(),
				NewZealandNCC.repoType(), IrishNSC.repoType(),
				UKSortCode.repoType(),
				CHIPSParticipantIdentification.repoType(), SwissBC.repoType(),
				FedwireRoutingNumber.repoType(), PortugueseNCC.repoType(),
				RussianCentralBankIdentificationCode.repoType(),
				ItalianDomesticIdentificationCode.repoType(),
				AustrianBankleitzahl.repoType(),
				CanadianPaymentsAssociationRoutingNumber.repoType(),
				SwissSIC.repoType(), GermanBankleitzahl.repoType(),
				SpanishDomesticInterbankingCode.repoType(),
				SouthAfricanNCC.repoType(), HongKongBankCode.repoType(),
				IndianFinancialSystemCode.repoType(),
				HellenicBankIdentificationCode.repoType(),
				PolishNationalClearingCode.repoType());
		super.associationDomain_lazy = () -> Arrays
				.asList(ClearingSystemMemberIdentificationType.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.semanticMarkup = Arrays.asList();
		super.name = "CashClearingSystemMember";
		super.definition = "Unique and unambiguous identifier for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier. The identifier can be used when transmitting, reconciling and confirming payment orders or security transfer instructions prior to settlement, and may include the netting of instructions and the establishment of final positions for settlement.";
	}

	static public class CHIPSUniversalIdentification
			extends
				MMBusinessAttribute {
		private final static AtomicReference<CHIPSUniversalIdentification> repoTypeRef = new AtomicReference<>();

		public static CHIPSUniversalIdentification repoType() {
			repoTypeRef.compareAndSet(null, new CHIPSUniversalIdentification());
			return repoTypeRef.get();
		}

		private CHIPSUniversalIdentification() {
			super.simpleType_lazy = () -> RTCHIPSUniversalIdentifier.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "CHIPSUniversalIdentification";
			super.definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class NewZealandNCC extends MMBusinessAttribute {
		private final static AtomicReference<NewZealandNCC> repoTypeRef = new AtomicReference<>();

		public static NewZealandNCC repoType() {
			repoTypeRef.compareAndSet(null, new NewZealandNCC());
			return repoTypeRef.get();
		}

		private NewZealandNCC() {
			super.simpleType_lazy = () -> RTNewZealandNCCIdentifier.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "NewZealandNCC";
			super.definition = "New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class IrishNSC extends MMBusinessAttribute {
		private final static AtomicReference<IrishNSC> repoTypeRef = new AtomicReference<>();

		public static IrishNSC repoType() {
			repoTypeRef.compareAndSet(null, new IrishNSC());
			return repoTypeRef.get();
		}

		private IrishNSC() {
			super.simpleType_lazy = () -> RTIrishNSCIdentifier.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "IrishNSC";
			super.definition = "Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class UKSortCode extends MMBusinessAttribute {
		private final static AtomicReference<UKSortCode> repoTypeRef = new AtomicReference<>();

		public static UKSortCode repoType() {
			repoTypeRef.compareAndSet(null, new UKSortCode());
			return repoTypeRef.get();
		}

		private UKSortCode() {
			super.simpleType_lazy = () -> RTUKDomesticSortCodeIdentifier
					.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "UKSortCode";
			super.definition = "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class CHIPSParticipantIdentification
			extends
				MMBusinessAttribute {
		private final static AtomicReference<CHIPSParticipantIdentification> repoTypeRef = new AtomicReference<>();

		public static CHIPSParticipantIdentification repoType() {
			repoTypeRef.compareAndSet(null,
					new CHIPSParticipantIdentification());
			return repoTypeRef.get();
		}

		private CHIPSParticipantIdentification() {
			super.simpleType_lazy = () -> RTCHIPSParticipantIdentifier
					.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "CHIPSParticipantIdentification";
			super.definition = "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class SwissBC extends MMBusinessAttribute {
		private final static AtomicReference<SwissBC> repoTypeRef = new AtomicReference<>();

		public static SwissBC repoType() {
			repoTypeRef.compareAndSet(null, new SwissBC());
			return repoTypeRef.get();
		}

		private SwissBC() {
			super.simpleType_lazy = () -> RTSwissBCIdentifier.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "SwissBC";
			super.definition = "Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class FedwireRoutingNumber extends MMBusinessAttribute {
		private final static AtomicReference<FedwireRoutingNumber> repoTypeRef = new AtomicReference<>();

		public static FedwireRoutingNumber repoType() {
			repoTypeRef.compareAndSet(null, new FedwireRoutingNumber());
			return repoTypeRef.get();
		}

		private FedwireRoutingNumber() {
			super.simpleType_lazy = () -> RTFedwireRoutingNumberIdentifier
					.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "FedwireRoutingNumber";
			super.definition = "Fed wire Routing Number - identifies financial institutions, in the US, on the Fed wire system. The routing number is assigned by the American Bankers Association (ABA).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class PortugueseNCC extends MMBusinessAttribute {
		private final static AtomicReference<PortugueseNCC> repoTypeRef = new AtomicReference<>();

		public static PortugueseNCC repoType() {
			repoTypeRef.compareAndSet(null, new PortugueseNCC());
			return repoTypeRef.get();
		}

		private PortugueseNCC() {
			super.simpleType_lazy = () -> RTPortugueseNCCIdentifier.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "PortugueseNCC";
			super.definition = "Portuguese National Clearing Code - identifies Portuguese financial institutions on the Portuguese national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class RussianCentralBankIdentificationCode
			extends
				MMBusinessAttribute {
		private final static AtomicReference<RussianCentralBankIdentificationCode> repoTypeRef = new AtomicReference<>();

		public static RussianCentralBankIdentificationCode repoType() {
			repoTypeRef.compareAndSet(null,
					new RussianCentralBankIdentificationCode());
			return repoTypeRef.get();
		}

		private RussianCentralBankIdentificationCode() {
			super.simpleType_lazy = () -> RTRussianCentralBankIdentificationCodeIdentifier
					.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "RussianCentralBankIdentificationCode";
			super.definition = "Russian Central Bank Identification Code - identifies Russian financial institutions on the Russian national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class ItalianDomesticIdentificationCode
			extends
				MMBusinessAttribute {
		private final static AtomicReference<ItalianDomesticIdentificationCode> repoTypeRef = new AtomicReference<>();

		public static ItalianDomesticIdentificationCode repoType() {
			repoTypeRef.compareAndSet(null,
					new ItalianDomesticIdentificationCode());
			return repoTypeRef.get();
		}

		private ItalianDomesticIdentificationCode() {
			super.simpleType_lazy = () -> RTItalianDomesticIdentifier
					.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "ItalianDomesticIdentificationCode";
			super.definition = "Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class AustrianBankleitzahl extends MMBusinessAttribute {
		private final static AtomicReference<AustrianBankleitzahl> repoTypeRef = new AtomicReference<>();

		public static AustrianBankleitzahl repoType() {
			repoTypeRef.compareAndSet(null, new AustrianBankleitzahl());
			return repoTypeRef.get();
		}

		private AustrianBankleitzahl() {
			super.simpleType_lazy = () -> RTAustrianBankleitzahlIdentifier
					.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "AustrianBankleitzahl";
			super.definition = "Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class CanadianPaymentsAssociationRoutingNumber
			extends
				MMBusinessAttribute {
		private final static AtomicReference<CanadianPaymentsAssociationRoutingNumber> repoTypeRef = new AtomicReference<>();

		public static CanadianPaymentsAssociationRoutingNumber repoType() {
			repoTypeRef.compareAndSet(null,
					new CanadianPaymentsAssociationRoutingNumber());
			return repoTypeRef.get();
		}

		private CanadianPaymentsAssociationRoutingNumber() {
			super.simpleType_lazy = () -> RTCanadianPaymentsARNIdentifier
					.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "CanadianPaymentsAssociationRoutingNumber";
			super.definition = "Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class SwissSIC extends MMBusinessAttribute {
		private final static AtomicReference<SwissSIC> repoTypeRef = new AtomicReference<>();

		public static SwissSIC repoType() {
			repoTypeRef.compareAndSet(null, new SwissSIC());
			return repoTypeRef.get();
		}

		private SwissSIC() {
			super.simpleType_lazy = () -> RTSwissSICIdentifier.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "SwissSIC";
			super.definition = "Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class GermanBankleitzahl extends MMBusinessAttribute {
		private final static AtomicReference<GermanBankleitzahl> repoTypeRef = new AtomicReference<>();

		public static GermanBankleitzahl repoType() {
			repoTypeRef.compareAndSet(null, new GermanBankleitzahl());
			return repoTypeRef.get();
		}

		private GermanBankleitzahl() {
			super.simpleType_lazy = () -> RTGermanBankleitzahlIdentifier
					.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "GermanBankleitzahl";
			super.definition = "German Bankleitzahl - identifies German financial institutions on the German national clearing systems.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class SpanishDomesticInterbankingCode
			extends
				MMBusinessAttribute {
		private final static AtomicReference<SpanishDomesticInterbankingCode> repoTypeRef = new AtomicReference<>();

		public static SpanishDomesticInterbankingCode repoType() {
			repoTypeRef.compareAndSet(null,
					new SpanishDomesticInterbankingCode());
			return repoTypeRef.get();
		}

		private SpanishDomesticInterbankingCode() {
			super.simpleType_lazy = () -> RTSpanishDomesticInterbankingIdentifier
					.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "SpanishDomesticInterbankingCode";
			super.definition = "Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class SouthAfricanNCC extends MMBusinessAttribute {
		private final static AtomicReference<SouthAfricanNCC> repoTypeRef = new AtomicReference<>();

		public static SouthAfricanNCC repoType() {
			repoTypeRef.compareAndSet(null, new SouthAfricanNCC());
			return repoTypeRef.get();
		}

		private SouthAfricanNCC() {
			super.simpleType_lazy = () -> RTSouthAfricanNCCIdentifier
					.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "SouthAfricanNCC";
			super.definition = "South African National Clearing Code (NCC) - identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class HongKongBankCode extends MMBusinessAttribute {
		private final static AtomicReference<HongKongBankCode> repoTypeRef = new AtomicReference<>();

		public static HongKongBankCode repoType() {
			repoTypeRef.compareAndSet(null, new HongKongBankCode());
			return repoTypeRef.get();
		}

		private HongKongBankCode() {
			super.simpleType_lazy = () -> RTHongKongBankIdentifier.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "HongKongBankCode";
			super.definition = "Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class IndianFinancialSystemCode extends MMBusinessAttribute {
		private final static AtomicReference<IndianFinancialSystemCode> repoTypeRef = new AtomicReference<>();

		public static IndianFinancialSystemCode repoType() {
			repoTypeRef.compareAndSet(null, new IndianFinancialSystemCode());
			return repoTypeRef.get();
		}

		private IndianFinancialSystemCode() {
			super.simpleType_lazy = () -> RTIndianFinancialSystemCodeIdentifier
					.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "IndianFinancialSystemCode";
			super.definition = "Indian Financial System Code - identifies Indian financial institutions on the Indian local clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class HellenicBankIdentificationCode
			extends
				MMBusinessAttribute {
		private final static AtomicReference<HellenicBankIdentificationCode> repoTypeRef = new AtomicReference<>();

		public static HellenicBankIdentificationCode repoType() {
			repoTypeRef.compareAndSet(null,
					new HellenicBankIdentificationCode());
			return repoTypeRef.get();
		}

		private HellenicBankIdentificationCode() {
			super.simpleType_lazy = () -> RTHellenicBankIdentificationCodeIdentifier
					.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "HellenicBankIdentificationCode";
			super.definition = "Hellenic Bank Identification Code - identifies Hellenic financial institutions on the Hellenic national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class PolishNationalClearingCode extends MMBusinessAttribute {
		private final static AtomicReference<PolishNationalClearingCode> repoTypeRef = new AtomicReference<>();

		public static PolishNationalClearingCode repoType() {
			repoTypeRef.compareAndSet(null, new PolishNationalClearingCode());
			return repoTypeRef.get();
		}

		private PolishNationalClearingCode() {
			super.simpleType_lazy = () -> RTPolishNationalClearingCodeIdentifier
					.repoType();
			super.elementContext_lazy = () -> RTCashClearingSystemMember
					.repoType();
			super.isDerived = false;
			super.name = "PolishNationalClearingCode";
			super.definition = "Polish National Clearing Code - identifies Polish financial institutions on the Polish national clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}