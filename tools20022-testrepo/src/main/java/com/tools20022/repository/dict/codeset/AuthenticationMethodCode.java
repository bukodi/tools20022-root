package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.AuthenticationMethodCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class AuthenticationMethodCode extends MMCodeSet {

	private final static AtomicReference<AuthenticationMethodCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeUnknownMethod = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "UKNW";
			super.name = "UnknownMethod";
			super.definition = "Authentication method is performed unknown.";
		}
	};
	public final MMCode codeBypass = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "BYPS";
			super.name = "Bypass";
			super.definition = "Authentication bypassed by the merchant.";
		}
	};
	public final MMCode codeOnLinePIN = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "NPIN";
			super.name = "OnLinePIN";
			super.definition = "On-line PIN  authentication (Personal Identification Number).";
		}
	};
	public final MMCode codeOfflinePIN = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "FPIN";
			super.name = "OfflinePIN";
			super.definition = "Off-line PIN authentication (Personal Identification Number).";
		}
	};
	public final MMCode codeSignatureCapture = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "CPSG";
			super.name = "SignatureCapture";
			super.definition = "Electronic signature capture (handwritten signature).";
		}
	};
	public final MMCode codePaperSignature = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "PPSG";
			super.name = "PaperSignature";
			super.definition = "Handwritten paper signature.";
		}
	};
	public final MMCode codeManualVerification = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "MANU";
			super.name = "ManualVerification";
			super.definition = "Manual verification, for example passport or drivers license.";
		}
	};
	public final MMCode codeMerchantAuthentication = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "MERC";
			super.name = "MerchantAuthentication";
			super.definition = "Merchant-related authentication.";
		}
	};
	public final MMCode codeSecureCertificate = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "SCRT";
			super.name = "SecureCertificate";
			super.definition = "Electronic commerce transaction secured with the X.509 certificate of a customer.";
		}
	};
	public final MMCode codeSecureNoCertificate = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "SNCT";
			super.name = "SecureNoCertificate";
			super.definition = "Secure electronic transaction without cardholder certificate.";
		}
	};
	public final MMCode codeSecuredChannel = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "SCNL";
			super.name = "SecuredChannel";
			super.definition = "Channel-encrypted transaction.";
		}
	};
	public final MMCode codePassword = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "PSWD";
			super.name = "Password";
			super.definition = "Authentication by a password.";
		}
	};
	public final MMCode codeBillingAddressVerification = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "ADDB";
			super.name = "BillingAddressVerification";
			super.definition = "Cardholder billing address verification.";
		}
	};
	public final MMCode codeBiometry = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "BIOM";
			super.name = "Biometry";
			super.definition = "Biometric authentication of the cardholder.";
		}
	};
	public final MMCode codeCardholderIdentificationData = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "CDHI";
			super.name = "CardholderIdentificationData";
			super.definition = "Cardholder data provided for verification, for instance social security number, driver license number, passport number.";
		}
	};
	public final MMCode codeCryptogramVerification = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "CRYP";
			super.name = "CryptogramVerification";
			super.definition = "Verification of a cryptogram generated by a chip card or another device, for instance ARQC (Authorisation Request Cryptogram).";
		}
	};
	public final MMCode codeCSCVerification = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "CSCV";
			super.name = "CSCVerification";
			super.definition = "Verification of Card Security Code.";
		}
	};
	public final MMCode codePassiveAuthentication = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "PSVE";
			super.name = "PassiveAuthentication";
			super.definition = "Authentication based on statistical cardholder behaviour.";
		}
	};
	public final MMCode codeSecureElectronicCommerce = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "CSEC";
			super.name = "SecureElectronicCommerce";
			super.definition = "Authentication performed during a secure electronic commerce transaction.";
		}
	};
	public final MMCode codeShippingAddressVerification = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "ADDS";
			super.name = "ShippingAddressVerification";
			super.definition = "Cardholder shipping address verification.";
		}
	};
	public final MMCode codeTokenAuthentication = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "TOKN";
			super.name = "TokenAuthentication";
			super.definition = "Cryptogram generated by the token requestor or a customer device to validate the authorised use of a token.";
		}
	};
	public final MMCode codePaymentToken = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "TOKP";
			super.name = "PaymentToken";
			super.definition = "Verification or authentication related to the use of a payment token, for instance the validation of the authorised use of a token.";
		}
	};
	public final MMCode codeAuthenticationToken = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "TOKA";
			super.name = "AuthenticationToken";
			super.definition = "A token is used to verify an already performed authentication.";
		}
	};
	public final MMCode codeMobile = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "MOBL";
			super.name = "Mobile";
			super.definition = "Customer mobile device.";
		}
	};
	public final MMCode codeOther = new MMCode() {
		{
			super.owner_lazy = () -> AuthenticationMethodCode.repoType();
			super.codeName = "OTHR";
			super.name = "Other";
			super.definition = "Other customer authentication.";
		}
	};

	public static AuthenticationMethodCode repoType() {
		repoTypeRef.compareAndSet(null, new AuthenticationMethodCode());
		return repoTypeRef.get();
	}

	private AuthenticationMethodCode() {
		super.code = Arrays.asList(codeUnknownMethod, codeBypass,
				codeOnLinePIN, codeOfflinePIN, codeSignatureCapture,
				codePaperSignature, codeManualVerification,
				codeMerchantAuthentication, codeSecureCertificate,
				codeSecureNoCertificate, codeSecuredChannel, codePassword,
				codeBillingAddressVerification, codeBiometry,
				codeCardholderIdentificationData, codeCryptogramVerification,
				codeCSCVerification, codePassiveAuthentication,
				codeSecureElectronicCommerce, codeShippingAddressVerification,
				codeTokenAuthentication, codePaymentToken,
				codeAuthenticationToken, codeMobile, codeOther);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AuthenticationMethodCode";
		super.definition = "Method used to authenticate a cardholder.";
		super.example = Arrays.asList("UKNW");
	}
}