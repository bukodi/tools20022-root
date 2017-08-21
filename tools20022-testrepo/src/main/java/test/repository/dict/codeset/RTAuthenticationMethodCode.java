package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTAuthenticationMethodCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTAuthenticationMethodCode extends MMCodeSet {

	private final static AtomicReference<RTAuthenticationMethodCode> repoTypeRef = new AtomicReference<>();

	public static RTAuthenticationMethodCode repoType() {
		repoTypeRef.compareAndSet(null, new RTAuthenticationMethodCode());
		return repoTypeRef.get();
	}

	private RTAuthenticationMethodCode() {
		super.code = Arrays.asList(UnknownMethod.repoType(), Bypass.repoType(),
				OnLinePIN.repoType(), OfflinePIN.repoType(),
				SignatureCapture.repoType(), PaperSignature.repoType(),
				ManualVerification.repoType(),
				MerchantAuthentication.repoType(),
				SecureCertificate.repoType(), SecureNoCertificate.repoType(),
				SecuredChannel.repoType(), Password.repoType(),
				BillingAddressVerification.repoType(), Biometry.repoType(),
				CardholderIdentificationData.repoType(),
				CryptogramVerification.repoType(), CSCVerification.repoType(),
				PassiveAuthentication.repoType(),
				SecureElectronicCommerce.repoType(),
				ShippingAddressVerification.repoType(),
				TokenAuthentication.repoType(), PaymentToken.repoType(),
				AuthenticationToken.repoType(), Mobile.repoType(),
				Other.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("UKNW");
		super.name = "AuthenticationMethodCode";
		super.definition = "Method used to authenticate a cardholder.";
	}

	static public class UnknownMethod extends MMCode {
		private final static AtomicReference<UnknownMethod> repoTypeRef = new AtomicReference<>();

		public static UnknownMethod repoType() {
			repoTypeRef.compareAndSet(null, new UnknownMethod());
			return repoTypeRef.get();
		}

		private UnknownMethod() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "UKNW";
			super.name = "UnknownMethod";
			super.definition = "Authentication method is performed unknown.";
		}
	}

	static public class Bypass extends MMCode {
		private final static AtomicReference<Bypass> repoTypeRef = new AtomicReference<>();

		public static Bypass repoType() {
			repoTypeRef.compareAndSet(null, new Bypass());
			return repoTypeRef.get();
		}

		private Bypass() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "BYPS";
			super.name = "Bypass";
			super.definition = "Authentication bypassed by the merchant.";
		}
	}

	static public class OnLinePIN extends MMCode {
		private final static AtomicReference<OnLinePIN> repoTypeRef = new AtomicReference<>();

		public static OnLinePIN repoType() {
			repoTypeRef.compareAndSet(null, new OnLinePIN());
			return repoTypeRef.get();
		}

		private OnLinePIN() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "NPIN";
			super.name = "OnLinePIN";
			super.definition = "On-line PIN  authentication (Personal Identification Number).";
		}
	}

	static public class OfflinePIN extends MMCode {
		private final static AtomicReference<OfflinePIN> repoTypeRef = new AtomicReference<>();

		public static OfflinePIN repoType() {
			repoTypeRef.compareAndSet(null, new OfflinePIN());
			return repoTypeRef.get();
		}

		private OfflinePIN() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "FPIN";
			super.name = "OfflinePIN";
			super.definition = "Off-line PIN authentication (Personal Identification Number).";
		}
	}

	static public class SignatureCapture extends MMCode {
		private final static AtomicReference<SignatureCapture> repoTypeRef = new AtomicReference<>();

		public static SignatureCapture repoType() {
			repoTypeRef.compareAndSet(null, new SignatureCapture());
			return repoTypeRef.get();
		}

		private SignatureCapture() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "CPSG";
			super.name = "SignatureCapture";
			super.definition = "Electronic signature capture (handwritten signature).";
		}
	}

	static public class PaperSignature extends MMCode {
		private final static AtomicReference<PaperSignature> repoTypeRef = new AtomicReference<>();

		public static PaperSignature repoType() {
			repoTypeRef.compareAndSet(null, new PaperSignature());
			return repoTypeRef.get();
		}

		private PaperSignature() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "PPSG";
			super.name = "PaperSignature";
			super.definition = "Handwritten paper signature.";
		}
	}

	static public class ManualVerification extends MMCode {
		private final static AtomicReference<ManualVerification> repoTypeRef = new AtomicReference<>();

		public static ManualVerification repoType() {
			repoTypeRef.compareAndSet(null, new ManualVerification());
			return repoTypeRef.get();
		}

		private ManualVerification() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "MANU";
			super.name = "ManualVerification";
			super.definition = "Manual verification, for example passport or drivers license.";
		}
	}

	static public class MerchantAuthentication extends MMCode {
		private final static AtomicReference<MerchantAuthentication> repoTypeRef = new AtomicReference<>();

		public static MerchantAuthentication repoType() {
			repoTypeRef.compareAndSet(null, new MerchantAuthentication());
			return repoTypeRef.get();
		}

		private MerchantAuthentication() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "MERC";
			super.name = "MerchantAuthentication";
			super.definition = "Merchant-related authentication.";
		}
	}

	static public class SecureCertificate extends MMCode {
		private final static AtomicReference<SecureCertificate> repoTypeRef = new AtomicReference<>();

		public static SecureCertificate repoType() {
			repoTypeRef.compareAndSet(null, new SecureCertificate());
			return repoTypeRef.get();
		}

		private SecureCertificate() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "SCRT";
			super.name = "SecureCertificate";
			super.definition = "Electronic commerce transaction secured with the X.509 certificate of a customer.";
		}
	}

	static public class SecureNoCertificate extends MMCode {
		private final static AtomicReference<SecureNoCertificate> repoTypeRef = new AtomicReference<>();

		public static SecureNoCertificate repoType() {
			repoTypeRef.compareAndSet(null, new SecureNoCertificate());
			return repoTypeRef.get();
		}

		private SecureNoCertificate() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "SNCT";
			super.name = "SecureNoCertificate";
			super.definition = "Secure electronic transaction without cardholder certificate.";
		}
	}

	static public class SecuredChannel extends MMCode {
		private final static AtomicReference<SecuredChannel> repoTypeRef = new AtomicReference<>();

		public static SecuredChannel repoType() {
			repoTypeRef.compareAndSet(null, new SecuredChannel());
			return repoTypeRef.get();
		}

		private SecuredChannel() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "SCNL";
			super.name = "SecuredChannel";
			super.definition = "Channel-encrypted transaction.";
		}
	}

	static public class Password extends MMCode {
		private final static AtomicReference<Password> repoTypeRef = new AtomicReference<>();

		public static Password repoType() {
			repoTypeRef.compareAndSet(null, new Password());
			return repoTypeRef.get();
		}

		private Password() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "PSWD";
			super.name = "Password";
			super.definition = "Authentication by a password.";
		}
	}

	static public class BillingAddressVerification extends MMCode {
		private final static AtomicReference<BillingAddressVerification> repoTypeRef = new AtomicReference<>();

		public static BillingAddressVerification repoType() {
			repoTypeRef.compareAndSet(null, new BillingAddressVerification());
			return repoTypeRef.get();
		}

		private BillingAddressVerification() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "ADDB";
			super.name = "BillingAddressVerification";
			super.definition = "Cardholder billing address verification.";
		}
	}

	static public class Biometry extends MMCode {
		private final static AtomicReference<Biometry> repoTypeRef = new AtomicReference<>();

		public static Biometry repoType() {
			repoTypeRef.compareAndSet(null, new Biometry());
			return repoTypeRef.get();
		}

		private Biometry() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "BIOM";
			super.name = "Biometry";
			super.definition = "Biometric authentication of the cardholder.";
		}
	}

	static public class CardholderIdentificationData extends MMCode {
		private final static AtomicReference<CardholderIdentificationData> repoTypeRef = new AtomicReference<>();

		public static CardholderIdentificationData repoType() {
			repoTypeRef.compareAndSet(null, new CardholderIdentificationData());
			return repoTypeRef.get();
		}

		private CardholderIdentificationData() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "CDHI";
			super.name = "CardholderIdentificationData";
			super.definition = "Cardholder data provided for verification, for instance social security number, driver license number, passport number.";
		}
	}

	static public class CryptogramVerification extends MMCode {
		private final static AtomicReference<CryptogramVerification> repoTypeRef = new AtomicReference<>();

		public static CryptogramVerification repoType() {
			repoTypeRef.compareAndSet(null, new CryptogramVerification());
			return repoTypeRef.get();
		}

		private CryptogramVerification() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "CRYP";
			super.name = "CryptogramVerification";
			super.definition = "Verification of a cryptogram generated by a chip card or another device, for instance ARQC (Authorisation Request Cryptogram).";
		}
	}

	static public class CSCVerification extends MMCode {
		private final static AtomicReference<CSCVerification> repoTypeRef = new AtomicReference<>();

		public static CSCVerification repoType() {
			repoTypeRef.compareAndSet(null, new CSCVerification());
			return repoTypeRef.get();
		}

		private CSCVerification() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "CSCV";
			super.name = "CSCVerification";
			super.definition = "Verification of Card Security Code.";
		}
	}

	static public class PassiveAuthentication extends MMCode {
		private final static AtomicReference<PassiveAuthentication> repoTypeRef = new AtomicReference<>();

		public static PassiveAuthentication repoType() {
			repoTypeRef.compareAndSet(null, new PassiveAuthentication());
			return repoTypeRef.get();
		}

		private PassiveAuthentication() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "PSVE";
			super.name = "PassiveAuthentication";
			super.definition = "Authentication based on statistical cardholder behaviour.";
		}
	}

	static public class SecureElectronicCommerce extends MMCode {
		private final static AtomicReference<SecureElectronicCommerce> repoTypeRef = new AtomicReference<>();

		public static SecureElectronicCommerce repoType() {
			repoTypeRef.compareAndSet(null, new SecureElectronicCommerce());
			return repoTypeRef.get();
		}

		private SecureElectronicCommerce() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "CSEC";
			super.name = "SecureElectronicCommerce";
			super.definition = "Authentication performed during a secure electronic commerce transaction.";
		}
	}

	static public class ShippingAddressVerification extends MMCode {
		private final static AtomicReference<ShippingAddressVerification> repoTypeRef = new AtomicReference<>();

		public static ShippingAddressVerification repoType() {
			repoTypeRef.compareAndSet(null, new ShippingAddressVerification());
			return repoTypeRef.get();
		}

		private ShippingAddressVerification() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "ADDS";
			super.name = "ShippingAddressVerification";
			super.definition = "Cardholder shipping address verification.";
		}
	}

	static public class TokenAuthentication extends MMCode {
		private final static AtomicReference<TokenAuthentication> repoTypeRef = new AtomicReference<>();

		public static TokenAuthentication repoType() {
			repoTypeRef.compareAndSet(null, new TokenAuthentication());
			return repoTypeRef.get();
		}

		private TokenAuthentication() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "TOKN";
			super.name = "TokenAuthentication";
			super.definition = "Cryptogram generated by the token requestor or a customer device to validate the authorised use of a token.";
		}
	}

	static public class PaymentToken extends MMCode {
		private final static AtomicReference<PaymentToken> repoTypeRef = new AtomicReference<>();

		public static PaymentToken repoType() {
			repoTypeRef.compareAndSet(null, new PaymentToken());
			return repoTypeRef.get();
		}

		private PaymentToken() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "TOKP";
			super.name = "PaymentToken";
			super.definition = "Verification or authentication related to the use of a payment token, for instance the validation of the authorised use of a token.";
		}
	}

	static public class AuthenticationToken extends MMCode {
		private final static AtomicReference<AuthenticationToken> repoTypeRef = new AtomicReference<>();

		public static AuthenticationToken repoType() {
			repoTypeRef.compareAndSet(null, new AuthenticationToken());
			return repoTypeRef.get();
		}

		private AuthenticationToken() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "TOKA";
			super.name = "AuthenticationToken";
			super.definition = "A token is used to verify an already performed authentication.";
		}
	}

	static public class Mobile extends MMCode {
		private final static AtomicReference<Mobile> repoTypeRef = new AtomicReference<>();

		public static Mobile repoType() {
			repoTypeRef.compareAndSet(null, new Mobile());
			return repoTypeRef.get();
		}

		private Mobile() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "MOBL";
			super.name = "Mobile";
			super.definition = "Customer mobile device.";
		}
	}

	static public class Other extends MMCode {
		private final static AtomicReference<Other> repoTypeRef = new AtomicReference<>();

		public static Other repoType() {
			repoTypeRef.compareAndSet(null, new Other());
			return repoTypeRef.get();
		}

		private Other() {
			super.owner_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.codeName = "OTHR";
			super.name = "Other";
			super.definition = "Other customer authentication.";
		}
	}
}