package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTPINFormatCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPINFormatCode extends MMCodeSet {

	private final static AtomicReference<RTPINFormatCode> repoTypeRef = new AtomicReference<>();

	public static RTPINFormatCode repoType() {
		repoTypeRef.compareAndSet(null, new RTPINFormatCode());
		return repoTypeRef.get();
	}

	private RTPINFormatCode() {
		super.code = Arrays.asList(ISO0.repoType(), ISO1.repoType(),
				ISO2.repoType(), ISO3.repoType(), ISO4.repoType(),
				ISO5.repoType(), ANSI0.repoType(), Bancomat.repoType(),
				Banksys.repoType(), Diebold.repoType(), DieboldCO.repoType(),
				ECI2.repoType(), ECI3.repoType(), EMVRSA.repoType(),
				IBM3624.repoType(), VISA2.repoType(), VISA3.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("ISO0");
		super.name = "PINFormatCode";
		super.definition = "PIN (Personal Identification Number) format used to encrypt the PIN block.";
	}

	static public class ISO0 extends MMCode {
		private final static AtomicReference<ISO0> repoTypeRef = new AtomicReference<>();

		public static ISO0 repoType() {
			repoTypeRef.compareAndSet(null, new ISO0());
			return repoTypeRef.get();
		}

		private ISO0() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ISO0";
			super.name = "ISO0";
			super.definition = "PIN diversified with the card account number, conforming to the standard ISO 9564-2.";
		}
	}

	static public class ISO1 extends MMCode {
		private final static AtomicReference<ISO1> repoTypeRef = new AtomicReference<>();

		public static ISO1 repoType() {
			repoTypeRef.compareAndSet(null, new ISO1());
			return repoTypeRef.get();
		}

		private ISO1() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ISO1";
			super.name = "ISO1";
			super.definition = "PIN completed with random padding characters, conforming to the standard ISO 9564-2.";
		}
	}

	static public class ISO2 extends MMCode {
		private final static AtomicReference<ISO2> repoTypeRef = new AtomicReference<>();

		public static ISO2 repoType() {
			repoTypeRef.compareAndSet(null, new ISO2());
			return repoTypeRef.get();
		}

		private ISO2() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ISO2";
			super.name = "ISO2";
			super.definition = "PIN without diversification characters, conforming to the standard ISO 9564-2.";
		}
	}

	static public class ISO3 extends MMCode {
		private final static AtomicReference<ISO3> repoTypeRef = new AtomicReference<>();

		public static ISO3 repoType() {
			repoTypeRef.compareAndSet(null, new ISO3());
			return repoTypeRef.get();
		}

		private ISO3() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ISO3";
			super.name = "ISO3";
			super.definition = "PIN diversified with the card account number and random characters, conforming to the standard ISO 9564-2.";
		}
	}

	static public class ISO4 extends MMCode {
		private final static AtomicReference<ISO4> repoTypeRef = new AtomicReference<>();

		public static ISO4 repoType() {
			repoTypeRef.compareAndSet(null, new ISO4());
			return repoTypeRef.get();
		}

		private ISO4() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ISO4";
			super.name = "ISO4";
			super.definition = "PIN format used with AES encryption, conforming to the new ISO SC2 format.";
		}
	}

	static public class ISO5 extends MMCode {
		private final static AtomicReference<ISO5> repoTypeRef = new AtomicReference<>();

		public static ISO5 repoType() {
			repoTypeRef.compareAndSet(null, new ISO5());
			return repoTypeRef.get();
		}

		private ISO5() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ISO5";
			super.name = "ISO5";
			super.definition = "Alternative PIN format used with AES encryption, conforming to the new ISO SC2 format.";
		}
	}

	static public class ANSI0 extends MMCode {
		private final static AtomicReference<ANSI0> repoTypeRef = new AtomicReference<>();

		public static ANSI0 repoType() {
			repoTypeRef.compareAndSet(null, new ANSI0());
			return repoTypeRef.get();
		}

		private ANSI0() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ANSI";
			super.name = "ANSI0";
			super.definition = "ANSI 0 PIN block format.";
		}
	}

	static public class Bancomat extends MMCode {
		private final static AtomicReference<Bancomat> repoTypeRef = new AtomicReference<>();

		public static Bancomat repoType() {
			repoTypeRef.compareAndSet(null, new Bancomat());
			return repoTypeRef.get();
		}

		private Bancomat() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "BNCM";
			super.name = "Bancomat";
			super.definition = "Italian Bancomat PIN block format.";
		}
	}

	static public class Banksys extends MMCode {
		private final static AtomicReference<Banksys> repoTypeRef = new AtomicReference<>();

		public static Banksys repoType() {
			repoTypeRef.compareAndSet(null, new Banksys());
			return repoTypeRef.get();
		}

		private Banksys() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "BKSY";
			super.name = "Banksys";
			super.definition = "Banksys PIN block format.";
		}
	}

	static public class Diebold extends MMCode {
		private final static AtomicReference<Diebold> repoTypeRef = new AtomicReference<>();

		public static Diebold repoType() {
			repoTypeRef.compareAndSet(null, new Diebold());
			return repoTypeRef.get();
		}

		private Diebold() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "DBLD";
			super.name = "Diebold";
			super.definition = "Diebold PIN block format.";
		}
	}

	static public class DieboldCO extends MMCode {
		private final static AtomicReference<DieboldCO> repoTypeRef = new AtomicReference<>();

		public static DieboldCO repoType() {
			repoTypeRef.compareAndSet(null, new DieboldCO());
			return repoTypeRef.get();
		}

		private DieboldCO() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "DBLC";
			super.name = "DieboldCO";
			super.definition = "Diebold CO PIN block format.";
		}
	}

	static public class ECI2 extends MMCode {
		private final static AtomicReference<ECI2> repoTypeRef = new AtomicReference<>();

		public static ECI2 repoType() {
			repoTypeRef.compareAndSet(null, new ECI2());
			return repoTypeRef.get();
		}

		private ECI2() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ECI2";
			super.name = "ECI2";
			super.definition = "ECI2 PIN block format.";
		}
	}

	static public class ECI3 extends MMCode {
		private final static AtomicReference<ECI3> repoTypeRef = new AtomicReference<>();

		public static ECI3 repoType() {
			repoTypeRef.compareAndSet(null, new ECI3());
			return repoTypeRef.get();
		}

		private ECI3() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "ECI3";
			super.name = "ECI3";
			super.definition = "ECI3 PIN block format.";
		}
	}

	static public class EMVRSA extends MMCode {
		private final static AtomicReference<EMVRSA> repoTypeRef = new AtomicReference<>();

		public static EMVRSA repoType() {
			repoTypeRef.compareAndSet(null, new EMVRSA());
			return repoTypeRef.get();
		}

		private EMVRSA() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "EMVS";
			super.name = "EMVRSA";
			super.definition = "EMV ISO2 PIN block format encrypted with the EMV RSA cryptographic key for the PIN.";
		}
	}

	static public class IBM3624 extends MMCode {
		private final static AtomicReference<IBM3624> repoTypeRef = new AtomicReference<>();

		public static IBM3624 repoType() {
			repoTypeRef.compareAndSet(null, new IBM3624());
			return repoTypeRef.get();
		}

		private IBM3624() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "IBM3";
			super.name = "IBM3624";
			super.definition = "IBM 3624 PIN block format.";
		}
	}

	static public class VISA2 extends MMCode {
		private final static AtomicReference<VISA2> repoTypeRef = new AtomicReference<>();

		public static VISA2 repoType() {
			repoTypeRef.compareAndSet(null, new VISA2());
			return repoTypeRef.get();
		}

		private VISA2() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "VIS2";
			super.name = "VISA2";
			super.definition = "VISA2 PIN block format.";
		}
	}

	static public class VISA3 extends MMCode {
		private final static AtomicReference<VISA3> repoTypeRef = new AtomicReference<>();

		public static VISA3 repoType() {
			repoTypeRef.compareAndSet(null, new VISA3());
			return repoTypeRef.get();
		}

		private VISA3() {
			super.owner_lazy = () -> RTPINFormatCode.repoType();
			super.codeName = "VIS3";
			super.name = "VISA3";
			super.definition = "VISA3 PIN block format.";
		}
	}
}