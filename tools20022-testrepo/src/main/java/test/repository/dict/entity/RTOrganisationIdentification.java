package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTBICFIIdentifier;
import test.repository.dict.entity.RTOrganisationIdentification;
import test.repository.dict.datatype.RTAnyBICIdentifier;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import test.repository.dict.entity.RTCashClearingSystemMember;
import test.repository.dict.datatype.RTBICNonFIIdentifier;
import test.repository.dict.datatype.RTEANGLNIdentifier;
import test.repository.dict.datatype.RTCHIPSUniversalIdentifier;
import test.repository.dict.datatype.RTDunsIdentifier;
import test.repository.dict.datatype.RTMax35Text;
import test.repository.dict.datatype.RTMICIdentifier;
import java.util.Arrays;
import test.repository.dict.entity.RTOrganisation.OrganisationIdentification;
import test.repository.GeneratedRepository.DataDictionary;

public class RTOrganisationIdentification extends MMBusinessComponent {

	private final static AtomicReference<RTOrganisationIdentification> repoTypeRef = new AtomicReference<>();

	public static RTOrganisationIdentification repoType() {
		repoTypeRef.compareAndSet(null, new RTOrganisationIdentification());
		return repoTypeRef.get();
	}

	private RTOrganisationIdentification() {
		super.element = Arrays.asList(BICFI.repoType(), AnyBIC.repoType(),
				ClearingSystemMemberIdentificationType.repoType(),
				BICNonFI.repoType(), EANGLN.repoType(),
				CHIPSUniversalIdentifier.repoType(), DUNS.repoType(),
				BankPartyIdentification.repoType(), MIC.repoType());
		super.associationDomain_lazy = () -> Arrays
				.asList(OrganisationIdentification.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "OrganisationIdentification";
		super.definition = "Unique and unambiguous way to identify an organisation.";
	}

	static public class BICFI extends MMBusinessAttribute {
		private final static AtomicReference<BICFI> repoTypeRef = new AtomicReference<>();

		public static BICFI repoType() {
			repoTypeRef.compareAndSet(null, new BICFI());
			return repoTypeRef.get();
		}

		private BICFI() {
			super.simpleType_lazy = () -> RTBICFIIdentifier.repoType();
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.isDerived = false;
			super.name = "BICFI";
			super.definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class AnyBIC extends MMBusinessAttribute {
		private final static AtomicReference<AnyBIC> repoTypeRef = new AtomicReference<>();

		public static AnyBIC repoType() {
			repoTypeRef.compareAndSet(null, new AnyBIC());
			return repoTypeRef.get();
		}

		private AnyBIC() {
			super.simpleType_lazy = () -> RTAnyBICIdentifier.repoType();
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.isDerived = false;
			super.name = "AnyBIC";
			super.definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class ClearingSystemMemberIdentificationType
			extends
				MMBusinessAssociationEnd {
		private final static AtomicReference<ClearingSystemMemberIdentificationType> repoTypeRef = new AtomicReference<>();

		public static ClearingSystemMemberIdentificationType repoType() {
			repoTypeRef.compareAndSet(null,
					new ClearingSystemMemberIdentificationType());
			return repoTypeRef.get();
		}

		private ClearingSystemMemberIdentificationType() {
			super.type_lazy = () -> RTCashClearingSystemMember.repoType();
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.isDerived = false;
			super.name = "ClearingSystemMemberIdentificationType";
			super.definition = "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator.";
			super.minOccurs = 0;
		}
	}

	static public class BICNonFI extends MMBusinessAttribute {
		private final static AtomicReference<BICNonFI> repoTypeRef = new AtomicReference<>();

		public static BICNonFI repoType() {
			repoTypeRef.compareAndSet(null, new BICNonFI());
			return repoTypeRef.get();
		}

		private BICNonFI() {
			super.simpleType_lazy = () -> RTBICNonFIIdentifier.repoType();
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.isDerived = false;
			super.name = "BICNonFI";
			super.definition = "Code allocated to a non-financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class EANGLN extends MMBusinessAttribute {
		private final static AtomicReference<EANGLN> repoTypeRef = new AtomicReference<>();

		public static EANGLN repoType() {
			repoTypeRef.compareAndSet(null, new EANGLN());
			return repoTypeRef.get();
		}

		private EANGLN() {
			super.simpleType_lazy = () -> RTEANGLNIdentifier.repoType();
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.isDerived = false;
			super.name = "EANGLN";
			super.definition = "Global Location Number. A non-significant reference number used to identify legal entities, functional entities, or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve detailed information that is linked to it.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class CHIPSUniversalIdentifier extends MMBusinessAttribute {
		private final static AtomicReference<CHIPSUniversalIdentifier> repoTypeRef = new AtomicReference<>();

		public static CHIPSUniversalIdentifier repoType() {
			repoTypeRef.compareAndSet(null, new CHIPSUniversalIdentifier());
			return repoTypeRef.get();
		}

		private CHIPSUniversalIdentifier() {
			super.simpleType_lazy = () -> RTCHIPSUniversalIdentifier.repoType();
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.isDerived = false;
			super.name = "CHIPSUniversalIdentifier";
			super.definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID). Identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class DUNS extends MMBusinessAttribute {
		private final static AtomicReference<DUNS> repoTypeRef = new AtomicReference<>();

		public static DUNS repoType() {
			repoTypeRef.compareAndSet(null, new DUNS());
			return repoTypeRef.get();
		}

		private DUNS() {
			super.simpleType_lazy = () -> RTDunsIdentifier.repoType();
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.isDerived = false;
			super.name = "DUNS";
			super.definition = "Data Universal Numbering System. A unique identification number provided by Dun & Bradstreet to identify an organization.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class BankPartyIdentification extends MMBusinessAttribute {
		private final static AtomicReference<BankPartyIdentification> repoTypeRef = new AtomicReference<>();

		public static BankPartyIdentification repoType() {
			repoTypeRef.compareAndSet(null, new BankPartyIdentification());
			return repoTypeRef.get();
		}

		private BankPartyIdentification() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.isDerived = false;
			super.name = "BankPartyIdentification";
			super.definition = "Unique and unambiguous assignment made by a specific bank to identify a relationship as defined between the bank and its client.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class MIC extends MMBusinessAttribute {
		private final static AtomicReference<MIC> repoTypeRef = new AtomicReference<>();

		public static MIC repoType() {
			repoTypeRef.compareAndSet(null, new MIC());
			return repoTypeRef.get();
		}

		private MIC() {
			super.simpleType_lazy = () -> RTMICIdentifier.repoType();
			super.elementContext_lazy = () -> RTOrganisationIdentification
					.repoType();
			super.isDerived = false;
			super.name = "MIC";
			super.definition = "Market Identifier Code. Identification of a financial market, as stipulated in the norm ISO 10383 \"Codes for exchanges and market identifications\".";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}