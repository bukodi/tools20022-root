package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.CashClearingSystemCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class CashClearingSystemCode extends MMCodeSet {

	private final static AtomicReference<CashClearingSystemCode> repoTypeRef = new AtomicReference<>();

	public static CashClearingSystemCode repoType() {
		repoTypeRef.compareAndSet(null, new CashClearingSystemCode());
		return repoTypeRef.get();
	}

	private CashClearingSystemCode() {
		super.code = Arrays.asList(EBAEuro1Step1.repoType(),
				Austrian.repoType(), NewZealand.repoType(),
				Azerbaijan.repoType(), BosniaHerzegovina.repoType(),
				Belgium.repoType(), Finland.repoType(), Italy.repoType(),
				Canada.repoType(), SpainCAM.repoType(), Ireland.repoType(),
				UnitedKingdom.repoType(), Denmark.repoType(),
				GermanyRTGSPlus.repoType(), EBAEuro1.repoType(),
				GermanyELS.repoType(), EBAStep1.repoType(),
				EBAStep2.repoType(), Croatia.repoType(), Greece.repoType(),
				Hungary.repoType(), Luxemburg.repoType(), Latvia.repoType(),
				SouthAfrica.repoType(), Mauritius.repoType(),
				Norway.repoType(), Switzerland.repoType(),
				Australia.repoType(), Egypt.repoType(), FrancePNS.repoType(),
				Venezuela.repoType(), SwedenSEC.repoType(),
				Slovania.repoType(), SpainES.repoType(), Portugal.repoType(),
				SwedenSSK.repoType(), FranceFR.repoType(), Target.repoType(),
				Netherlands.repoType(), Fedwire.repoType(),
				BankOfJapanNet.repoType(),
				ForeignExchangeYenClearing.repoType(), Zengin.repoType(),
				RTGS.repoType(), ACH.repoType(), USChips.repoType(),
				FedNet.repoType(), DenmarkDDK.repoType(), Albania.repoType(),
				SwedenBGC.repoType(), Barbados.repoType(), Bulgaria.repoType(),
				Bahamas.repoType(), Botswana.repoType(),
				Philippines.repoType(), ECB.repoType(), USChipsACH.repoType(),
				USFedACH.repoType(), Ghana.repoType(),
				NetherlandsIP.repoType(), Jordan.repoType(), Kenya.repoType(),
				SriLanka.repoType(), Singapore.repoType(), Malta.repoType(),
				Namibia.repoType(), Angola.repoType(), RomaniaEPO.repoType(),
				RomaniaGSRS.repoType(), Chili.repoType(),
				UnitedKingdomGBP.repoType(), Thailand.repoType(),
				Tanzania.repoType(), TrinidadAndTobago.repoType(),
				Uganda.repoType(), Zimbabwe.repoType(), Zambia.repoType(),
				Columbia.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("ABE");
		super.name = "CashClearingSystemCode";
		super.definition = "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is to be processed.";
	}

	static public class EBAEuro1Step1 extends MMCode {
		private final static AtomicReference<EBAEuro1Step1> repoTypeRef = new AtomicReference<>();

		public static EBAEuro1Step1 repoType() {
			repoTypeRef.compareAndSet(null, new EBAEuro1Step1());
			return repoTypeRef.get();
		}

		private EBAEuro1Step1() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "ABE";
			super.name = "EBAEuro1Step1";
			super.definition = "Scheme code for EBA Euro1/Step1.";
		}
	}

	static public class Austrian extends MMCode {
		private final static AtomicReference<Austrian> repoTypeRef = new AtomicReference<>();

		public static Austrian repoType() {
			repoTypeRef.compareAndSet(null, new Austrian());
			return repoTypeRef.get();
		}

		private Austrian() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "ART";
			super.name = "Austrian";
			super.definition = "Scheme code for AT (Austria) - Austrian RTGS (ARTIS).";
		}
	}

	static public class NewZealand extends MMCode {
		private final static AtomicReference<NewZealand> repoTypeRef = new AtomicReference<>();

		public static NewZealand repoType() {
			repoTypeRef.compareAndSet(null, new NewZealand());
			return repoTypeRef.get();
		}

		private NewZealand() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "AVP";
			super.name = "NewZealand";
			super.definition = "Scheme code for NZ (New Zealand) - New Zealand Assured Value Payments.";
		}
	}

	static public class Azerbaijan extends MMCode {
		private final static AtomicReference<Azerbaijan> repoTypeRef = new AtomicReference<>();

		public static Azerbaijan repoType() {
			repoTypeRef.compareAndSet(null, new Azerbaijan());
			return repoTypeRef.get();
		}

		private Azerbaijan() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "AZM";
			super.name = "Azerbaijan";
			super.definition = "Scheme code for AZ (Azerbaijan) - Azerbaijan Interbank Payment System (AZIPS).";
		}
	}

	static public class BosniaHerzegovina extends MMCode {
		private final static AtomicReference<BosniaHerzegovina> repoTypeRef = new AtomicReference<>();

		public static BosniaHerzegovina repoType() {
			repoTypeRef.compareAndSet(null, new BosniaHerzegovina());
			return repoTypeRef.get();
		}

		private BosniaHerzegovina() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "BAP";
			super.name = "BosniaHerzegovina";
			super.definition = "Scheme code for BA (Bosnia and Herzegovina).";
		}
	}

	static public class Belgium extends MMCode {
		private final static AtomicReference<Belgium> repoTypeRef = new AtomicReference<>();

		public static Belgium repoType() {
			repoTypeRef.compareAndSet(null, new Belgium());
			return repoTypeRef.get();
		}

		private Belgium() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "BEL";
			super.name = "Belgium";
			super.definition = "Scheme code for BE (Belgium) - Belgium RTGS (ELLIPS).";
		}
	}

	static public class Finland extends MMCode {
		private final static AtomicReference<Finland> repoTypeRef = new AtomicReference<>();

		public static Finland repoType() {
			repoTypeRef.compareAndSet(null, new Finland());
			return repoTypeRef.get();
		}

		private Finland() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "BOF";
			super.name = "Finland";
			super.definition = "Scheme code for FI (Finland) - RTGS (BOF).";
		}
	}

	static public class Italy extends MMCode {
		private final static AtomicReference<Italy> repoTypeRef = new AtomicReference<>();

		public static Italy repoType() {
			repoTypeRef.compareAndSet(null, new Italy());
			return repoTypeRef.get();
		}

		private Italy() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "BRL";
			super.name = "Italy";
			super.definition = "Scheme code for IT (Italy) - Italy RTGS (BIREL).";
		}
	}

	static public class Canada extends MMCode {
		private final static AtomicReference<Canada> repoTypeRef = new AtomicReference<>();

		public static Canada repoType() {
			repoTypeRef.compareAndSet(null, new Canada());
			return repoTypeRef.get();
		}

		private Canada() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "CAD";
			super.name = "Canada";
			super.definition = "Scheme code for CA (Canada) - Canadian Large Value Transfer System (LVTS)";
		}
	}

	static public class SpainCAM extends MMCode {
		private final static AtomicReference<SpainCAM> repoTypeRef = new AtomicReference<>();

		public static SpainCAM repoType() {
			repoTypeRef.compareAndSet(null, new SpainCAM());
			return repoTypeRef.get();
		}

		private SpainCAM() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "CAM";
			super.name = "SpainCAM";
			super.definition = "Scheme code for ES (Spain).";
		}
	}

	static public class Ireland extends MMCode {
		private final static AtomicReference<Ireland> repoTypeRef = new AtomicReference<>();

		public static Ireland repoType() {
			repoTypeRef.compareAndSet(null, new Ireland());
			return repoTypeRef.get();
		}

		private Ireland() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "CBJ";
			super.name = "Ireland";
			super.definition = "Scheme code for IE (Ireland) - Irish RTGS (IRIS).";
		}
	}

	static public class UnitedKingdom extends MMCode {
		private final static AtomicReference<UnitedKingdom> repoTypeRef = new AtomicReference<>();

		public static UnitedKingdom repoType() {
			repoTypeRef.compareAndSet(null, new UnitedKingdom());
			return repoTypeRef.get();
		}

		private UnitedKingdom() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "CHP";
			super.name = "UnitedKingdom";
			super.definition = "Scheme code for GB (UK) - British Euro RTGS (CHAPS).";
		}
	}

	static public class Denmark extends MMCode {
		private final static AtomicReference<Denmark> repoTypeRef = new AtomicReference<>();

		public static Denmark repoType() {
			repoTypeRef.compareAndSet(null, new Denmark());
			return repoTypeRef.get();
		}

		private Denmark() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "DKC";
			super.name = "Denmark";
			super.definition = "Scheme code for DK (Denmark) - Danish Euro RTGS (KRONOS)";
		}
	}

	static public class GermanyRTGSPlus extends MMCode {
		private final static AtomicReference<GermanyRTGSPlus> repoTypeRef = new AtomicReference<>();

		public static GermanyRTGSPlus repoType() {
			repoTypeRef.compareAndSet(null, new GermanyRTGSPlus());
			return repoTypeRef.get();
		}

		private GermanyRTGSPlus() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "RTP";
			super.name = "GermanyRTGSPlus";
			super.definition = "Scheme code for DE (Germany).";
		}
	}

	static public class EBAEuro1 extends MMCode {
		private final static AtomicReference<EBAEuro1> repoTypeRef = new AtomicReference<>();

		public static EBAEuro1 repoType() {
			repoTypeRef.compareAndSet(null, new EBAEuro1());
			return repoTypeRef.get();
		}

		private EBAEuro1() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "EBA";
			super.name = "EBAEuro1";
			super.definition = "Scheme code for EBA Euro1.";
		}
	}

	static public class GermanyELS extends MMCode {
		private final static AtomicReference<GermanyELS> repoTypeRef = new AtomicReference<>();

		public static GermanyELS repoType() {
			repoTypeRef.compareAndSet(null, new GermanyELS());
			return repoTypeRef.get();
		}

		private GermanyELS() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "ELS";
			super.name = "GermanyELS";
			super.definition = "Scheme code for DE (Germany).";
		}
	}

	static public class EBAStep1 extends MMCode {
		private final static AtomicReference<EBAStep1> repoTypeRef = new AtomicReference<>();

		public static EBAStep1 repoType() {
			repoTypeRef.compareAndSet(null, new EBAStep1());
			return repoTypeRef.get();
		}

		private EBAStep1() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "ERP";
			super.name = "EBAStep1";
			super.definition = "Scheme code for EBA step 1 (members).";
		}
	}

	static public class EBAStep2 extends MMCode {
		private final static AtomicReference<EBAStep2> repoTypeRef = new AtomicReference<>();

		public static EBAStep2 repoType() {
			repoTypeRef.compareAndSet(null, new EBAStep2());
			return repoTypeRef.get();
		}

		private EBAStep2() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "XCT";
			super.name = "EBAStep2";
			super.definition = "Scheme code for EBA step 2.";
		}
	}

	static public class Croatia extends MMCode {
		private final static AtomicReference<Croatia> repoTypeRef = new AtomicReference<>();

		public static Croatia repoType() {
			repoTypeRef.compareAndSet(null, new Croatia());
			return repoTypeRef.get();
		}

		private Croatia() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "HRK";
			super.name = "Croatia";
			super.definition = "Scheme code for HR (Croatia) - HSVP.";
		}
	}

	static public class Greece extends MMCode {
		private final static AtomicReference<Greece> repoTypeRef = new AtomicReference<>();

		public static Greece repoType() {
			repoTypeRef.compareAndSet(null, new Greece());
			return repoTypeRef.get();
		}

		private Greece() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "HRM";
			super.name = "Greece";
			super.definition = "Scheme code for GR (Greece) - Greek RTGS (HERMES).";
		}
	}

	static public class Hungary extends MMCode {
		private final static AtomicReference<Hungary> repoTypeRef = new AtomicReference<>();

		public static Hungary repoType() {
			repoTypeRef.compareAndSet(null, new Hungary());
			return repoTypeRef.get();
		}

		private Hungary() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "HUF";
			super.name = "Hungary";
			super.definition = "Scheme code for HU (Hungary) - VIBER.";
		}
	}

	static public class Luxemburg extends MMCode {
		private final static AtomicReference<Luxemburg> repoTypeRef = new AtomicReference<>();

		public static Luxemburg repoType() {
			repoTypeRef.compareAndSet(null, new Luxemburg());
			return repoTypeRef.get();
		}

		private Luxemburg() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "LGS";
			super.name = "Luxemburg";
			super.definition = "Scheme code for LU (Luxemburg) - Luxembourg RTGS (LIPS).";
		}
	}

	static public class Latvia extends MMCode {
		private final static AtomicReference<Latvia> repoTypeRef = new AtomicReference<>();

		public static Latvia repoType() {
			repoTypeRef.compareAndSet(null, new Latvia());
			return repoTypeRef.get();
		}

		private Latvia() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "LVL";
			super.name = "Latvia";
			super.definition = "Scheme code for LV (Latvia).";
		}
	}

	static public class SouthAfrica extends MMCode {
		private final static AtomicReference<SouthAfrica> repoTypeRef = new AtomicReference<>();

		public static SouthAfrica repoType() {
			repoTypeRef.compareAndSet(null, new SouthAfrica());
			return repoTypeRef.get();
		}

		private SouthAfrica() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "MOS";
			super.name = "SouthAfrica";
			super.definition = "Scheme code for ZA (South Africa) - South-African Multiple Option Settlement.";
		}
	}

	static public class Mauritius extends MMCode {
		private final static AtomicReference<Mauritius> repoTypeRef = new AtomicReference<>();

		public static Mauritius repoType() {
			repoTypeRef.compareAndSet(null, new Mauritius());
			return repoTypeRef.get();
		}

		private Mauritius() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "MUP";
			super.name = "Mauritius";
			super.definition = "Scheme code for MU (Mauritius).";
		}
	}

	static public class Norway extends MMCode {
		private final static AtomicReference<Norway> repoTypeRef = new AtomicReference<>();

		public static Norway repoType() {
			repoTypeRef.compareAndSet(null, new Norway());
			return repoTypeRef.get();
		}

		private Norway() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "NOC";
			super.name = "Norway";
			super.definition = "Scheme code for NO (Norway).";
		}
	}

	static public class Switzerland extends MMCode {
		private final static AtomicReference<Switzerland> repoTypeRef = new AtomicReference<>();

		public static Switzerland repoType() {
			repoTypeRef.compareAndSet(null, new Switzerland());
			return repoTypeRef.get();
		}

		private Switzerland() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "PCH";
			super.name = "Switzerland";
			super.definition = "Scheme code for CH (Switzerland).";
		}
	}

	static public class Australia extends MMCode {
		private final static AtomicReference<Australia> repoTypeRef = new AtomicReference<>();

		public static Australia repoType() {
			repoTypeRef.compareAndSet(null, new Australia());
			return repoTypeRef.get();
		}

		private Australia() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "PDS";
			super.name = "Australia";
			super.definition = "Scheme code for AU (Australia).";
		}
	}

	static public class Egypt extends MMCode {
		private final static AtomicReference<Egypt> repoTypeRef = new AtomicReference<>();

		public static Egypt repoType() {
			repoTypeRef.compareAndSet(null, new Egypt());
			return repoTypeRef.get();
		}

		private Egypt() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "PEG";
			super.name = "Egypt";
			super.definition = "Scheme code for EG (Egypt).";
		}
	}

	static public class FrancePNS extends MMCode {
		private final static AtomicReference<FrancePNS> repoTypeRef = new AtomicReference<>();

		public static FrancePNS repoType() {
			repoTypeRef.compareAndSet(null, new FrancePNS());
			return repoTypeRef.get();
		}

		private FrancePNS() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "PNS";
			super.name = "FrancePNS";
			super.definition = "Scheme code for FR (France).";
		}
	}

	static public class Venezuela extends MMCode {
		private final static AtomicReference<Venezuela> repoTypeRef = new AtomicReference<>();

		public static Venezuela repoType() {
			repoTypeRef.compareAndSet(null, new Venezuela());
			return repoTypeRef.get();
		}

		private Venezuela() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "PVE";
			super.name = "Venezuela";
			super.definition = "Scheme code for Ve (Venezuela).";
		}
	}

	static public class SwedenSEC extends MMCode {
		private final static AtomicReference<SwedenSEC> repoTypeRef = new AtomicReference<>();

		public static SwedenSEC repoType() {
			repoTypeRef.compareAndSet(null, new SwedenSEC());
			return repoTypeRef.get();
		}

		private SwedenSEC() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "SEC";
			super.name = "SwedenSEC";
			super.definition = "Scheme code for SE (Sweden) - Swedish Euro RTGS (SEC).";
		}
	}

	static public class Slovania extends MMCode {
		private final static AtomicReference<Slovania> repoTypeRef = new AtomicReference<>();

		public static Slovania repoType() {
			repoTypeRef.compareAndSet(null, new Slovania());
			return repoTypeRef.get();
		}

		private Slovania() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "SIT";
			super.name = "Slovania";
			super.definition = "Scheme code for SI (Slovenia).";
		}
	}

	static public class SpainES extends MMCode {
		private final static AtomicReference<SpainES> repoTypeRef = new AtomicReference<>();

		public static SpainES repoType() {
			repoTypeRef.compareAndSet(null, new SpainES());
			return repoTypeRef.get();
		}

		private SpainES() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "SLB";
			super.name = "SpainES";
			super.definition = "Scheme code for ES (Spain) - Spanish RTGS (SLBE).";
		}
	}

	static public class Portugal extends MMCode {
		private final static AtomicReference<Portugal> repoTypeRef = new AtomicReference<>();

		public static Portugal repoType() {
			repoTypeRef.compareAndSet(null, new Portugal());
			return repoTypeRef.get();
		}

		private Portugal() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "SPG";
			super.name = "Portugal";
			super.definition = "Scheme code for PT (Portugal) - Portuguese RTGS (SPGT).";
		}
	}

	static public class SwedenSSK extends MMCode {
		private final static AtomicReference<SwedenSSK> repoTypeRef = new AtomicReference<>();

		public static SwedenSSK repoType() {
			repoTypeRef.compareAndSet(null, new SwedenSSK());
			return repoTypeRef.get();
		}

		private SwedenSSK() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "SSK";
			super.name = "SwedenSSK";
			super.definition = "Scheme code for SE (Sweden) - SEK RTGS (RIX).";
		}
	}

	static public class FranceFR extends MMCode {
		private final static AtomicReference<FranceFR> repoTypeRef = new AtomicReference<>();

		public static FranceFR repoType() {
			repoTypeRef.compareAndSet(null, new FranceFR());
			return repoTypeRef.get();
		}

		private FranceFR() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "TBF";
			super.name = "FranceFR";
			super.definition = "Scheme code for FR (France) - French RTGS (TBF).";
		}
	}

	static public class Target extends MMCode {
		private final static AtomicReference<Target> repoTypeRef = new AtomicReference<>();

		public static Target repoType() {
			repoTypeRef.compareAndSet(null, new Target());
			return repoTypeRef.get();
		}

		private Target() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "TGT";
			super.name = "Target";
			super.definition = "Scheme code for Target.";
		}
	}

	static public class Netherlands extends MMCode {
		private final static AtomicReference<Netherlands> repoTypeRef = new AtomicReference<>();

		public static Netherlands repoType() {
			repoTypeRef.compareAndSet(null, new Netherlands());
			return repoTypeRef.get();
		}

		private Netherlands() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "TOP";
			super.name = "Netherlands";
			super.definition = "Scheme code for NL (Netherlands) - Dutch RTGS (TOP)";
		}
	}

	static public class Fedwire extends MMCode {
		private final static AtomicReference<Fedwire> repoTypeRef = new AtomicReference<>();

		public static Fedwire repoType() {
			repoTypeRef.compareAndSet(null, new Fedwire());
			return repoTypeRef.get();
		}

		private Fedwire() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "FDW";
			super.name = "Fedwire";
			super.definition = "Scheme code for the US national real time gross settlement system.";
		}
	}

	static public class BankOfJapanNet extends MMCode {
		private final static AtomicReference<BankOfJapanNet> repoTypeRef = new AtomicReference<>();

		public static BankOfJapanNet repoType() {
			repoTypeRef.compareAndSet(null, new BankOfJapanNet());
			return repoTypeRef.get();
		}

		private BankOfJapanNet() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "BOJ";
			super.name = "BankOfJapanNet";
			super.definition = "Scheme code for the Bank of Japan clearing system.";
		}
	}

	static public class ForeignExchangeYenClearing extends MMCode {
		private final static AtomicReference<ForeignExchangeYenClearing> repoTypeRef = new AtomicReference<>();

		public static ForeignExchangeYenClearing repoType() {
			repoTypeRef.compareAndSet(null, new ForeignExchangeYenClearing());
			return repoTypeRef.get();
		}

		private ForeignExchangeYenClearing() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "FEY";
			super.name = "ForeignExchangeYenClearing";
			super.definition = "Scheme code for the Foreign Exchange Yen Clearing system (FEYCS). It is the Japanese electronic interbank system for sending guaranteed and unconditional yen payments of FX deals for same day settlement from one settlement bank, on behalf of itself or its customers, to another settlement bank.";
		}
	}

	static public class Zengin extends MMCode {
		private final static AtomicReference<Zengin> repoTypeRef = new AtomicReference<>();

		public static Zengin repoType() {
			repoTypeRef.compareAndSet(null, new Zengin());
			return repoTypeRef.get();
		}

		private Zengin() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "ZEN";
			super.name = "Zengin";
			super.definition = "Scheme code for the Zengin system. The electronic payment system for domestic third party transfers managed by the Tokyo Bankers Association.";
		}
	}

	static public class RTGS extends MMCode {
		private final static AtomicReference<RTGS> repoTypeRef = new AtomicReference<>();

		public static RTGS repoType() {
			repoTypeRef.compareAndSet(null, new RTGS());
			return repoTypeRef.get();
		}

		private RTGS() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "RTG";
			super.name = "RTGS";
			super.definition = "Real Time Gross Settlement System. Payment system that simultaneously clears individual transfers and settles them in central bank money.";
		}
	}

	static public class ACH extends MMCode {
		private final static AtomicReference<ACH> repoTypeRef = new AtomicReference<>();

		public static ACH repoType() {
			repoTypeRef.compareAndSet(null, new ACH());
			return repoTypeRef.get();
		}

		private ACH() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "ACH";
			super.name = "ACH";
			super.definition = "Automated Clearing House. Payment system that clears cash transfers and settles the proceeds in a lump sum, usually on a multilateral netting basis.";
		}
	}

	static public class USChips extends MMCode {
		private final static AtomicReference<USChips> repoTypeRef = new AtomicReference<>();

		public static USChips repoType() {
			repoTypeRef.compareAndSet(null, new USChips());
			return repoTypeRef.get();
		}

		private USChips() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "CHI";
			super.name = "USChips";
			super.definition = "CHIPS is the Clearing House Interbank Payment System in the US.";
		}
	}

	static public class FedNet extends MMCode {
		private final static AtomicReference<FedNet> repoTypeRef = new AtomicReference<>();

		public static FedNet repoType() {
			repoTypeRef.compareAndSet(null, new FedNet());
			return repoTypeRef.get();
		}

		private FedNet() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "FDN";
			super.name = "FedNet";
			super.definition = "FedNet is a link to a Federal Bank account via the internet.  FedNet enables checking of account balance, transactions, take print outs of account statement, transfer funds to third party accounts, E-shopping, BSNL Payments, Deposit opening, Deposit Renewal, Request for Demand Draft, Cheque Book etc.";
		}
	}

	static public class DenmarkDDK extends MMCode {
		private final static AtomicReference<DenmarkDDK> repoTypeRef = new AtomicReference<>();

		public static DenmarkDDK repoType() {
			repoTypeRef.compareAndSet(null, new DenmarkDDK());
			return repoTypeRef.get();
		}

		private DenmarkDDK() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "DDK";
			super.name = "DenmarkDDK";
			super.definition = "Scheme code for DK (Denmark) - Danish Krone RTGS (KRONOS)";
		}
	}

	static public class Albania extends MMCode {
		private final static AtomicReference<Albania> repoTypeRef = new AtomicReference<>();

		public static Albania repoType() {
			repoTypeRef.compareAndSet(null, new Albania());
			return repoTypeRef.get();
		}

		private Albania() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "AIP";
			super.name = "Albania";
			super.definition = "Scheme code for AL (Albania) -  Albania Interbank Payment System.";
		}
	}

	static public class SwedenBGC extends MMCode {
		private final static AtomicReference<SwedenBGC> repoTypeRef = new AtomicReference<>();

		public static SwedenBGC repoType() {
			repoTypeRef.compareAndSet(null, new SwedenBGC());
			return repoTypeRef.get();
		}

		private SwedenBGC() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "BCC";
			super.name = "SwedenBGC";
			super.definition = "Scheme code for SE (Sweden) - Sweden BGC Clearing CUG.";
		}
	}

	static public class Barbados extends MMCode {
		private final static AtomicReference<Barbados> repoTypeRef = new AtomicReference<>();

		public static Barbados repoType() {
			repoTypeRef.compareAndSet(null, new Barbados());
			return repoTypeRef.get();
		}

		private Barbados() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "BDS";
			super.name = "Barbados";
			super.definition = "Scheme code for BB (Barbados) - Barbados RTGS (CBRTGS).";
		}
	}

	static public class Bulgaria extends MMCode {
		private final static AtomicReference<Bulgaria> repoTypeRef = new AtomicReference<>();

		public static Bulgaria repoType() {
			repoTypeRef.compareAndSet(null, new Bulgaria());
			return repoTypeRef.get();
		}

		private Bulgaria() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "BGN";
			super.name = "Bulgaria";
			super.definition = "Scheme code for BG (Bulgaria) - Bulgaria RTGS.";
		}
	}

	static public class Bahamas extends MMCode {
		private final static AtomicReference<Bahamas> repoTypeRef = new AtomicReference<>();

		public static Bahamas repoType() {
			repoTypeRef.compareAndSet(null, new Bahamas());
			return repoTypeRef.get();
		}

		private Bahamas() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "BHS";
			super.name = "Bahamas";
			super.definition = "Scheme code for BS (Bahamas) - Bahamas RTGS.";
		}
	}

	static public class Botswana extends MMCode {
		private final static AtomicReference<Botswana> repoTypeRef = new AtomicReference<>();

		public static Botswana repoType() {
			repoTypeRef.compareAndSet(null, new Botswana());
			return repoTypeRef.get();
		}

		private Botswana() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "BIS";
			super.name = "Botswana";
			super.definition = "Scheme code for BW (Botswana) - Botswana Interbank Settlement System.";
		}
	}

	static public class Philippines extends MMCode {
		private final static AtomicReference<Philippines> repoTypeRef = new AtomicReference<>();

		public static Philippines repoType() {
			repoTypeRef.compareAndSet(null, new Philippines());
			return repoTypeRef.get();
		}

		private Philippines() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "BSP";
			super.name = "Philippines";
			super.definition = "Scheme code for PH (Philippines) - Philippines Payment System.";
		}
	}

	static public class ECB extends MMCode {
		private final static AtomicReference<ECB> repoTypeRef = new AtomicReference<>();

		public static ECB repoType() {
			repoTypeRef.compareAndSet(null, new ECB());
			return repoTypeRef.get();
		}

		private ECB() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "EPM";
			super.name = "ECB";
			super.definition = "Scheme code for ECB (European Central Bank) - ECB Payment Mechanism.";
		}
	}

	static public class USChipsACH extends MMCode {
		private final static AtomicReference<USChipsACH> repoTypeRef = new AtomicReference<>();

		public static USChipsACH repoType() {
			repoTypeRef.compareAndSet(null, new USChipsACH());
			return repoTypeRef.get();
		}

		private USChipsACH() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "EPN";
			super.name = "USChipsACH";
			super.definition = "Scheme code for the US CHIPS-ACH.";
		}
	}

	static public class USFedACH extends MMCode {
		private final static AtomicReference<USFedACH> repoTypeRef = new AtomicReference<>();

		public static USFedACH repoType() {
			repoTypeRef.compareAndSet(null, new USFedACH());
			return repoTypeRef.get();
		}

		private USFedACH() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "FDA";
			super.name = "USFedACH";
			super.definition = "Scheme code for the US FED-ACH.";
		}
	}

	static public class Ghana extends MMCode {
		private final static AtomicReference<Ghana> repoTypeRef = new AtomicReference<>();

		public static Ghana repoType() {
			repoTypeRef.compareAndSet(null, new Ghana());
			return repoTypeRef.get();
		}

		private Ghana() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "GIS";
			super.name = "Ghana";
			super.definition = "Scheme code for GH (Ghana) - Ghana Interbank Settlement System (GISS).";
		}
	}

	static public class NetherlandsIP extends MMCode {
		private final static AtomicReference<NetherlandsIP> repoTypeRef = new AtomicReference<>();

		public static NetherlandsIP repoType() {
			repoTypeRef.compareAndSet(null, new NetherlandsIP());
			return repoTypeRef.get();
		}

		private NetherlandsIP() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "INC";
			super.name = "NetherlandsIP";
			super.definition = "Scheme code for NL (Netherlands) - Netherlands Interpay CUG.";
		}
	}

	static public class Jordan extends MMCode {
		private final static AtomicReference<Jordan> repoTypeRef = new AtomicReference<>();

		public static Jordan repoType() {
			repoTypeRef.compareAndSet(null, new Jordan());
			return repoTypeRef.get();
		}

		private Jordan() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "JOD";
			super.name = "Jordan";
			super.definition = "Scheme code for JO (Jordan) - Jordan RTGS.";
		}
	}

	static public class Kenya extends MMCode {
		private final static AtomicReference<Kenya> repoTypeRef = new AtomicReference<>();

		public static Kenya repoType() {
			repoTypeRef.compareAndSet(null, new Kenya());
			return repoTypeRef.get();
		}

		private Kenya() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "KPS";
			super.name = "Kenya";
			super.definition = "Scheme code for KE (Kenya) - Kenyan Electronic Payment Settlement System.";
		}
	}

	static public class SriLanka extends MMCode {
		private final static AtomicReference<SriLanka> repoTypeRef = new AtomicReference<>();

		public static SriLanka repoType() {
			repoTypeRef.compareAndSet(null, new SriLanka());
			return repoTypeRef.get();
		}

		private SriLanka() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "LKB";
			super.name = "SriLanka";
			super.definition = "Scheme code for LK (Sri Lanka) - Sri Lanka (Lankasettle).";
		}
	}

	static public class Singapore extends MMCode {
		private final static AtomicReference<Singapore> repoTypeRef = new AtomicReference<>();

		public static Singapore repoType() {
			repoTypeRef.compareAndSet(null, new Singapore());
			return repoTypeRef.get();
		}

		private Singapore() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "MEP";
			super.name = "Singapore";
			super.definition = "Scheme code for SG (Singapore) - Singapore RTGS (MEPS+).";
		}
	}

	static public class Malta extends MMCode {
		private final static AtomicReference<Malta> repoTypeRef = new AtomicReference<>();

		public static Malta repoType() {
			repoTypeRef.compareAndSet(null, new Malta());
			return repoTypeRef.get();
		}

		private Malta() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "MRS";
			super.name = "Malta";
			super.definition = "Scheme code for MT (Malta) - Malta Realtime Interbank Settlement System.";
		}
	}

	static public class Namibia extends MMCode {
		private final static AtomicReference<Namibia> repoTypeRef = new AtomicReference<>();

		public static Namibia repoType() {
			repoTypeRef.compareAndSet(null, new Namibia());
			return repoTypeRef.get();
		}

		private Namibia() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "NAM";
			super.name = "Namibia";
			super.definition = "Scheme code for NA (Namibian) - Namibian Interbank Settlement System.";
		}
	}

	static public class Angola extends MMCode {
		private final static AtomicReference<Angola> repoTypeRef = new AtomicReference<>();

		public static Angola repoType() {
			repoTypeRef.compareAndSet(null, new Angola());
			return repoTypeRef.get();
		}

		private Angola() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "PTR";
			super.name = "Angola";
			super.definition = "Scheme code for AO (Angola) - Angola RTGS.";
		}
	}

	static public class RomaniaEPO extends MMCode {
		private final static AtomicReference<RomaniaEPO> repoTypeRef = new AtomicReference<>();

		public static RomaniaEPO repoType() {
			repoTypeRef.compareAndSet(null, new RomaniaEPO());
			return repoTypeRef.get();
		}

		private RomaniaEPO() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "ROL";
			super.name = "RomaniaEPO";
			super.definition = "Scheme code for RO (Romania) - Romanian Electronic Payment Operations RT.";
		}
	}

	static public class RomaniaGSRS extends MMCode {
		private final static AtomicReference<RomaniaGSRS> repoTypeRef = new AtomicReference<>();

		public static RomaniaGSRS repoType() {
			repoTypeRef.compareAndSet(null, new RomaniaGSRS());
			return repoTypeRef.get();
		}

		private RomaniaGSRS() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "ROS";
			super.name = "RomaniaGSRS";
			super.definition = "Scheme code for RO (Romania) - Romanian GSRS.";
		}
	}

	static public class Chili extends MMCode {
		private final static AtomicReference<Chili> repoTypeRef = new AtomicReference<>();

		public static Chili repoType() {
			repoTypeRef.compareAndSet(null, new Chili());
			return repoTypeRef.get();
		}

		private Chili() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "SCP";
			super.name = "Chili";
			super.definition = "Scheme code for CL (Chile) - Chilean Interbank Payment System.";
		}
	}

	static public class UnitedKingdomGBP extends MMCode {
		private final static AtomicReference<UnitedKingdomGBP> repoTypeRef = new AtomicReference<>();

		public static UnitedKingdomGBP repoType() {
			repoTypeRef.compareAndSet(null, new UnitedKingdomGBP());
			return repoTypeRef.get();
		}

		private UnitedKingdomGBP() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "STG";
			super.name = "UnitedKingdomGBP";
			super.definition = "Scheme code for UK (United Kingdom) - CHAPS Sterling RTGS.";
		}
	}

	static public class Thailand extends MMCode {
		private final static AtomicReference<Thailand> repoTypeRef = new AtomicReference<>();

		public static Thailand repoType() {
			repoTypeRef.compareAndSet(null, new Thailand());
			return repoTypeRef.get();
		}

		private Thailand() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "THB";
			super.name = "Thailand";
			super.definition = "Scheme code for TH (Thailand) - Thailand Payment System (Bahtnet/2).";
		}
	}

	static public class Tanzania extends MMCode {
		private final static AtomicReference<Tanzania> repoTypeRef = new AtomicReference<>();

		public static Tanzania repoType() {
			repoTypeRef.compareAndSet(null, new Tanzania());
			return repoTypeRef.get();
		}

		private Tanzania() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "TIS";
			super.name = "Tanzania";
			super.definition = "Scheme code for TZ (Tanzania) - Tanzania Interbank Settlement System (TISS).";
		}
	}

	static public class TrinidadAndTobago extends MMCode {
		private final static AtomicReference<TrinidadAndTobago> repoTypeRef = new AtomicReference<>();

		public static TrinidadAndTobago repoType() {
			repoTypeRef.compareAndSet(null, new TrinidadAndTobago());
			return repoTypeRef.get();
		}

		private TrinidadAndTobago() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "TTD";
			super.name = "TrinidadAndTobago";
			super.definition = "Scheme code for TT (Trinidad and Tobago ) - Trinidad and Tobago SAFE-TT.";
		}
	}

	static public class Uganda extends MMCode {
		private final static AtomicReference<Uganda> repoTypeRef = new AtomicReference<>();

		public static Uganda repoType() {
			repoTypeRef.compareAndSet(null, new Uganda());
			return repoTypeRef.get();
		}

		private Uganda() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "UIS";
			super.name = "Uganda";
			super.definition = "Scheme code for UG (Uganda) - Uganda National Interbank Settlement System.";
		}
	}

	static public class Zimbabwe extends MMCode {
		private final static AtomicReference<Zimbabwe> repoTypeRef = new AtomicReference<>();

		public static Zimbabwe repoType() {
			repoTypeRef.compareAndSet(null, new Zimbabwe());
			return repoTypeRef.get();
		}

		private Zimbabwe() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "ZET";
			super.name = "Zimbabwe";
			super.definition = "Scheme code for ZW (Zimbabwe) - Zimbabwe Electronic Transfer & Settlement System.";
		}
	}

	static public class Zambia extends MMCode {
		private final static AtomicReference<Zambia> repoTypeRef = new AtomicReference<>();

		public static Zambia repoType() {
			repoTypeRef.compareAndSet(null, new Zambia());
			return repoTypeRef.get();
		}

		private Zambia() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "ZIS";
			super.name = "Zambia";
			super.definition = "Scheme code for ZM (Zambia) - Zambian Interbank Payment &Settlement System.";
		}
	}

	static public class Columbia extends MMCode {
		private final static AtomicReference<Columbia> repoTypeRef = new AtomicReference<>();

		public static Columbia repoType() {
			repoTypeRef.compareAndSet(null, new Columbia());
			return repoTypeRef.get();
		}

		private Columbia() {
			super.owner_lazy = () -> CashClearingSystemCode.repoType();
			super.codeName = "COP";
			super.name = "Columbia";
			super.definition = "Scheme code for Columbia (CO) - Colombian ACH CENIT Central Bank Payment System.";
		}
	}
}