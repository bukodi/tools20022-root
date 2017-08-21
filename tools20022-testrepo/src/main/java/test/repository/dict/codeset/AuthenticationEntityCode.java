package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.AuthenticationEntityCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class AuthenticationEntityCode extends MMCodeSet {

	private final static AtomicReference<AuthenticationEntityCode> repoTypeRef = new AtomicReference<>();

	public static AuthenticationEntityCode repoType() {
		repoTypeRef.compareAndSet(null, new AuthenticationEntityCode());
		return repoTypeRef.get();
	}

	private AuthenticationEntityCode() {
		super.code = Arrays.asList(ICC.repoType(), AuthorisedAgent.repoType(),
				Merchant.repoType(), Acquirer.repoType(), Issuer.repoType(),
				Terminal.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("ICCD");
		super.name = "AuthenticationEntityCode";
		super.definition = "Entity or object in charge of verifying the cardholder authenticity.";
	}

	static public class ICC extends MMCode {
		private final static AtomicReference<ICC> repoTypeRef = new AtomicReference<>();

		public static ICC repoType() {
			repoTypeRef.compareAndSet(null, new ICC());
			return repoTypeRef.get();
		}

		private ICC() {
			super.owner_lazy = () -> AuthenticationEntityCode.repoType();
			super.codeName = "ICCD";
			super.name = "ICC";
			super.definition = "Application in the chip card (Integrated Circuit Card), for instance an offline PIN verification.";
		}
	}

	static public class AuthorisedAgent extends MMCode {
		private final static AtomicReference<AuthorisedAgent> repoTypeRef = new AtomicReference<>();

		public static AuthorisedAgent repoType() {
			repoTypeRef.compareAndSet(null, new AuthorisedAgent());
			return repoTypeRef.get();
		}

		private AuthorisedAgent() {
			super.owner_lazy = () -> AuthenticationEntityCode.repoType();
			super.codeName = "AGNT";
			super.name = "AuthorisedAgent";
			super.definition = "Authorisation agent of the issuer.";
		}
	}

	static public class Merchant extends MMCode {
		private final static AtomicReference<Merchant> repoTypeRef = new AtomicReference<>();

		public static Merchant repoType() {
			repoTypeRef.compareAndSet(null, new Merchant());
			return repoTypeRef.get();
		}

		private Merchant() {
			super.owner_lazy = () -> AuthenticationEntityCode.repoType();
			super.codeName = "MERC";
			super.name = "Merchant";
			super.definition = "Merchant (for example signature verification by the attendant).";
		}
	}

	static public class Acquirer extends MMCode {
		private final static AtomicReference<Acquirer> repoTypeRef = new AtomicReference<>();

		public static Acquirer repoType() {
			repoTypeRef.compareAndSet(null, new Acquirer());
			return repoTypeRef.get();
		}

		private Acquirer() {
			super.owner_lazy = () -> AuthenticationEntityCode.repoType();
			super.codeName = "ACQR";
			super.name = "Acquirer";
			super.definition = "Acquirer of the transaction.";
		}
	}

	static public class Issuer extends MMCode {
		private final static AtomicReference<Issuer> repoTypeRef = new AtomicReference<>();

		public static Issuer repoType() {
			repoTypeRef.compareAndSet(null, new Issuer());
			return repoTypeRef.get();
		}

		private Issuer() {
			super.owner_lazy = () -> AuthenticationEntityCode.repoType();
			super.codeName = "ISSR";
			super.name = "Issuer";
			super.definition = "Card issuer.";
		}
	}

	static public class Terminal extends MMCode {
		private final static AtomicReference<Terminal> repoTypeRef = new AtomicReference<>();

		public static Terminal repoType() {
			repoTypeRef.compareAndSet(null, new Terminal());
			return repoTypeRef.get();
		}

		private Terminal() {
			super.owner_lazy = () -> AuthenticationEntityCode.repoType();
			super.codeName = "TRML";
			super.name = "Terminal";
			super.definition = "Secure application in the terminal.";
		}
	}
}