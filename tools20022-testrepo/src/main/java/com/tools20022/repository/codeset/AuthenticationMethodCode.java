/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.core.repo.LazyReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AuthenticationMethodCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Method used to authenticate a cardholder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#UKNW_UnknownMethod
 * AuthenticationMethodCode.UKNW_UnknownMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#BYPS_Bypass
 * AuthenticationMethodCode.BYPS_Bypass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#NPIN_OnLinePIN
 * AuthenticationMethodCode.NPIN_OnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#FPIN_OfflinePIN
 * AuthenticationMethodCode.FPIN_OfflinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#CPSG_SignatureCapture
 * AuthenticationMethodCode.CPSG_SignatureCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#PPSG_PaperSignature
 * AuthenticationMethodCode.PPSG_PaperSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#MANU_ManualVerification
 * AuthenticationMethodCode.MANU_ManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#MERC_MerchantAuthentication
 * AuthenticationMethodCode.MERC_MerchantAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#SCRT_SecureCertificate
 * AuthenticationMethodCode.SCRT_SecureCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#SNCT_SecureNoCertificate
 * AuthenticationMethodCode.SNCT_SecureNoCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#SCNL_SecuredChannel
 * AuthenticationMethodCode.SCNL_SecuredChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#PSWD_Password
 * AuthenticationMethodCode.PSWD_Password}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#ADDB_BillingAddressVerification
 * AuthenticationMethodCode.ADDB_BillingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#BIOM_Biometry
 * AuthenticationMethodCode.BIOM_Biometry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#CDHI_CardholderIdentificationData
 * AuthenticationMethodCode.CDHI_CardholderIdentificationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#CRYP_CryptogramVerification
 * AuthenticationMethodCode.CRYP_CryptogramVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#CSCV_CSCVerification
 * AuthenticationMethodCode.CSCV_CSCVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#PSVE_PassiveAuthentication
 * AuthenticationMethodCode.PSVE_PassiveAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#CSEC_SecureElectronicCommerce
 * AuthenticationMethodCode.CSEC_SecureElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#ADDS_ShippingAddressVerification
 * AuthenticationMethodCode.ADDS_ShippingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#TOKN_TokenAuthentication
 * AuthenticationMethodCode.TOKN_TokenAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#TOKP_PaymentToken
 * AuthenticationMethodCode.TOKP_PaymentToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#TOKA_AuthenticationToken
 * AuthenticationMethodCode.TOKA_AuthenticationToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#MOBL_Mobile
 * AuthenticationMethodCode.MOBL_Mobile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#OTHR_Other
 * AuthenticationMethodCode.OTHR_Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
 * AuthenticationMethod1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExamples
 * examples} =
 * <ul>
 * <li>"UKNW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthenticationMethodCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AuthenticationMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKNW"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownMethod"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode UKNW_UnknownMethod = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownMethod";
			definition = "Authentication method is performed unknown.";
			codeName = "UKNW";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BYPS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bypass"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode BYPS_Bypass = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bypass";
			definition = "Authentication bypassed by the merchant.";
			codeName = "BYPS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode NPIN_OnLinePIN = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnLinePIN";
			definition = "On-line PIN authentication (Personal Identification Number).";
			codeName = "NPIN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FPIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePIN"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode FPIN_OfflinePIN = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfflinePIN";
			definition = "Off-line PIN authentication (Personal Identification Number).";
			codeName = "FPIN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPSG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureCapture"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode CPSG_SignatureCapture = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignatureCapture";
			definition = "Electronic signature capture (handwritten signature).";
			codeName = "CPSG";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPSG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaperSignature"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode PPSG_PaperSignature = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaperSignature";
			definition = "Handwritten paper signature.";
			codeName = "PPSG";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MANU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode MANU_ManualVerification = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManualVerification";
			definition = "Manual verification, for example passport or drivers license.";
			codeName = "MANU";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MERC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantAuthentication"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode MERC_MerchantAuthentication = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantAuthentication";
			definition = "Merchant-related authentication.";
			codeName = "MERC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCRT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureCertificate"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode SCRT_SecureCertificate = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecureCertificate";
			definition = "Electronic commerce transaction secured with the X.509 certificate of a customer.";
			codeName = "SCRT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SNCT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureNoCertificate"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode SNCT_SecureNoCertificate = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecureNoCertificate";
			definition = "Secure electronic transaction without cardholder certificate.";
			codeName = "SNCT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCNL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredChannel"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode SCNL_SecuredChannel = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuredChannel";
			definition = "Channel-encrypted transaction.";
			codeName = "SCNL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSWD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Password"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode PSWD_Password = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Password";
			definition = "Authentication by a password.";
			codeName = "PSWD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADDB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingAddressVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode ADDB_BillingAddressVerification = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingAddressVerification";
			definition = "Cardholder billing address verification.";
			codeName = "ADDB";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIOM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Biometry"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode BIOM_Biometry = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Biometry";
			definition = "Biometric authentication of the cardholder.";
			codeName = "BIOM";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDHI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderIdentificationData"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode CDHI_CardholderIdentificationData = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderIdentificationData";
			definition = "Cardholder data provided for verification, for instance social security number, driver license number, passport number.";
			codeName = "CDHI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRYP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CryptogramVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode CRYP_CryptogramVerification = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CryptogramVerification";
			definition = "Verification of a cryptogram generated by a chip card or another device, for instance ARQC (Authorisation Request Cryptogram).";
			codeName = "CRYP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSCV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode CSCV_CSCVerification = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCVerification";
			definition = "Verification of Card Security Code.";
			codeName = "CSCV";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSVE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassiveAuthentication"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode PSVE_PassiveAuthentication = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassiveAuthentication";
			definition = "Authentication based on statistical cardholder behaviour.";
			codeName = "PSVE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSEC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureElectronicCommerce"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode CSEC_SecureElectronicCommerce = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			definition = "Authentication performed during a secure electronic commerce transaction.";
			codeName = "CSEC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADDS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingAddressVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode ADDS_ShippingAddressVerification = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAddressVerification";
			definition = "Cardholder shipping address verification.";
			codeName = "ADDS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOKN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenAuthentication"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode TOKN_TokenAuthentication = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenAuthentication";
			definition = "Cryptogram generated by the token requestor or a customer device to validate the authorised use of a token.";
			codeName = "TOKN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOKP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentToken"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode TOKP_PaymentToken = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToken";
			definition = "Verification or authentication related to the use of a payment token, for instance the validation of the authorised use of a token.";
			codeName = "TOKP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOKA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationToken"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode TOKA_AuthenticationToken = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationToken";
			definition = "A token is used to verify an already performed authentication.";
			codeName = "TOKA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOBL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mobile"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode MOBL_Mobile = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mobile";
			definition = "Customer mobile device.";
			codeName = "MOBL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final AuthenticationMethodCode OTHR_Other = new AuthenticationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other customer authentication.";
			codeName = "OTHR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethodCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, AuthenticationMethodCode> codesByName = new LinkedHashMap<>();

	protected AuthenticationMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("UKNW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticationMethodCode";
				definition = "Method used to authenticate a cardholder.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(AuthenticationMethod1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethodCode.UKNW_UnknownMethod, com.tools20022.repository.codeset.AuthenticationMethodCode.BYPS_Bypass,
						com.tools20022.repository.codeset.AuthenticationMethodCode.NPIN_OnLinePIN, com.tools20022.repository.codeset.AuthenticationMethodCode.FPIN_OfflinePIN,
						com.tools20022.repository.codeset.AuthenticationMethodCode.CPSG_SignatureCapture, com.tools20022.repository.codeset.AuthenticationMethodCode.PPSG_PaperSignature,
						com.tools20022.repository.codeset.AuthenticationMethodCode.MANU_ManualVerification, com.tools20022.repository.codeset.AuthenticationMethodCode.MERC_MerchantAuthentication,
						com.tools20022.repository.codeset.AuthenticationMethodCode.SCRT_SecureCertificate, com.tools20022.repository.codeset.AuthenticationMethodCode.SNCT_SecureNoCertificate,
						com.tools20022.repository.codeset.AuthenticationMethodCode.SCNL_SecuredChannel, com.tools20022.repository.codeset.AuthenticationMethodCode.PSWD_Password,
						com.tools20022.repository.codeset.AuthenticationMethodCode.ADDB_BillingAddressVerification, com.tools20022.repository.codeset.AuthenticationMethodCode.BIOM_Biometry,
						com.tools20022.repository.codeset.AuthenticationMethodCode.CDHI_CardholderIdentificationData, com.tools20022.repository.codeset.AuthenticationMethodCode.CRYP_CryptogramVerification,
						com.tools20022.repository.codeset.AuthenticationMethodCode.CSCV_CSCVerification, com.tools20022.repository.codeset.AuthenticationMethodCode.PSVE_PassiveAuthentication,
						com.tools20022.repository.codeset.AuthenticationMethodCode.CSEC_SecureElectronicCommerce, com.tools20022.repository.codeset.AuthenticationMethodCode.ADDS_ShippingAddressVerification,
						com.tools20022.repository.codeset.AuthenticationMethodCode.TOKN_TokenAuthentication, com.tools20022.repository.codeset.AuthenticationMethodCode.TOKP_PaymentToken,
						com.tools20022.repository.codeset.AuthenticationMethodCode.TOKA_AuthenticationToken, com.tools20022.repository.codeset.AuthenticationMethodCode.MOBL_Mobile,
						com.tools20022.repository.codeset.AuthenticationMethodCode.OTHR_Other));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UKNW_UnknownMethod.getCodeName().get(), UKNW_UnknownMethod);
		codesByName.put(BYPS_Bypass.getCodeName().get(), BYPS_Bypass);
		codesByName.put(NPIN_OnLinePIN.getCodeName().get(), NPIN_OnLinePIN);
		codesByName.put(FPIN_OfflinePIN.getCodeName().get(), FPIN_OfflinePIN);
		codesByName.put(CPSG_SignatureCapture.getCodeName().get(), CPSG_SignatureCapture);
		codesByName.put(PPSG_PaperSignature.getCodeName().get(), PPSG_PaperSignature);
		codesByName.put(MANU_ManualVerification.getCodeName().get(), MANU_ManualVerification);
		codesByName.put(MERC_MerchantAuthentication.getCodeName().get(), MERC_MerchantAuthentication);
		codesByName.put(SCRT_SecureCertificate.getCodeName().get(), SCRT_SecureCertificate);
		codesByName.put(SNCT_SecureNoCertificate.getCodeName().get(), SNCT_SecureNoCertificate);
		codesByName.put(SCNL_SecuredChannel.getCodeName().get(), SCNL_SecuredChannel);
		codesByName.put(PSWD_Password.getCodeName().get(), PSWD_Password);
		codesByName.put(ADDB_BillingAddressVerification.getCodeName().get(), ADDB_BillingAddressVerification);
		codesByName.put(BIOM_Biometry.getCodeName().get(), BIOM_Biometry);
		codesByName.put(CDHI_CardholderIdentificationData.getCodeName().get(), CDHI_CardholderIdentificationData);
		codesByName.put(CRYP_CryptogramVerification.getCodeName().get(), CRYP_CryptogramVerification);
		codesByName.put(CSCV_CSCVerification.getCodeName().get(), CSCV_CSCVerification);
		codesByName.put(PSVE_PassiveAuthentication.getCodeName().get(), PSVE_PassiveAuthentication);
		codesByName.put(CSEC_SecureElectronicCommerce.getCodeName().get(), CSEC_SecureElectronicCommerce);
		codesByName.put(ADDS_ShippingAddressVerification.getCodeName().get(), ADDS_ShippingAddressVerification);
		codesByName.put(TOKN_TokenAuthentication.getCodeName().get(), TOKN_TokenAuthentication);
		codesByName.put(TOKP_PaymentToken.getCodeName().get(), TOKP_PaymentToken);
		codesByName.put(TOKA_AuthenticationToken.getCodeName().get(), TOKA_AuthenticationToken);
		codesByName.put(MOBL_Mobile.getCodeName().get(), MOBL_Mobile);
		codesByName.put(OTHR_Other.getCodeName().get(), OTHR_Other);
	}

	public static AuthenticationMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AuthenticationMethodCode[] values() {
		AuthenticationMethodCode[] values = new AuthenticationMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AuthenticationMethodCode> {
		@Override
		public AuthenticationMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AuthenticationMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}