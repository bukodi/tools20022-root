package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTAuthenticationResultCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTAuthenticationResultCode extends MMCodeSet {

	private final static AtomicReference<RTAuthenticationResultCode> repoTypeRef = new AtomicReference<>();

	public static RTAuthenticationResultCode repoType() {
		repoTypeRef.compareAndSet(null, new RTAuthenticationResultCode());
		return repoTypeRef.get();
	}

	private RTAuthenticationResultCode() {
		super.code = Arrays.asList(Denial.repoType(),
				NonParticipation.repoType(), UnableToAuthenticate.repoType(),
				MerchantNotEnroled.repoType(), WithCryptogram.repoType(),
				WithoutCryptogram.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "AuthenticationResultCode";
		super.definition = "Specifies the result of authentication done";
	}

	static public class Denial extends MMCode {
		private final static AtomicReference<Denial> repoTypeRef = new AtomicReference<>();

		public static Denial repoType() {
			repoTypeRef.compareAndSet(null, new Denial());
			return repoTypeRef.get();
		}

		private Denial() {
			super.owner_lazy = () -> RTAuthenticationResultCode.repoType();
			super.codeName = "DENY";
			super.name = "Denial";
			super.definition = "The authentication didn’t succeed";
		}
	}

	static public class NonParticipation extends MMCode {
		private final static AtomicReference<NonParticipation> repoTypeRef = new AtomicReference<>();

		public static NonParticipation repoType() {
			repoTypeRef.compareAndSet(null, new NonParticipation());
			return repoTypeRef.get();
		}

		private NonParticipation() {
			super.owner_lazy = () -> RTAuthenticationResultCode.repoType();
			super.codeName = "CARD";
			super.name = "NonParticipation";
			super.definition = "The card does not participate in the authentication programme";
		}
	}

	static public class UnableToAuthenticate extends MMCode {
		private final static AtomicReference<UnableToAuthenticate> repoTypeRef = new AtomicReference<>();

		public static UnableToAuthenticate repoType() {
			repoTypeRef.compareAndSet(null, new UnableToAuthenticate());
			return repoTypeRef.get();
		}

		private UnableToAuthenticate() {
			super.owner_lazy = () -> RTAuthenticationResultCode.repoType();
			super.codeName = "AUTH";
			super.name = "UnableToAuthenticate";
			super.definition = "The authentication couldn’t be carried out";
		}
	}

	static public class MerchantNotEnroled extends MMCode {
		private final static AtomicReference<MerchantNotEnroled> repoTypeRef = new AtomicReference<>();

		public static MerchantNotEnroled repoType() {
			repoTypeRef.compareAndSet(null, new MerchantNotEnroled());
			return repoTypeRef.get();
		}

		private MerchantNotEnroled() {
			super.owner_lazy = () -> RTAuthenticationResultCode.repoType();
			super.codeName = "MRCH";
			super.name = "MerchantNotEnroled";
			super.definition = "Merchant not enrolled in the authentication programme";
		}
	}

	static public class WithCryptogram extends MMCode {
		private final static AtomicReference<WithCryptogram> repoTypeRef = new AtomicReference<>();

		public static WithCryptogram repoType() {
			repoTypeRef.compareAndSet(null, new WithCryptogram());
			return repoTypeRef.get();
		}

		private WithCryptogram() {
			super.owner_lazy = () -> RTAuthenticationResultCode.repoType();
			super.codeName = "CRPT";
			super.name = "WithCryptogram";
			super.definition = "Authentication succeeded with a cryptogram";
		}
	}

	static public class WithoutCryptogram extends MMCode {
		private final static AtomicReference<WithoutCryptogram> repoTypeRef = new AtomicReference<>();

		public static WithoutCryptogram repoType() {
			repoTypeRef.compareAndSet(null, new WithoutCryptogram());
			return repoTypeRef.get();
		}

		private WithoutCryptogram() {
			super.owner_lazy = () -> RTAuthenticationResultCode.repoType();
			super.codeName = "UCRP";
			super.name = "WithoutCryptogram";
			super.definition = "Authentication succeeded without a cryptogram";
		}
	}
}