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
import com.tools20022.repository.codeset.AuthenticationMethod1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
 * AuthenticationMethodCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#UKNW_UnknownMethod
 * AuthenticationMethod1Code.UKNW_UnknownMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#BYPS_Bypass
 * AuthenticationMethod1Code.BYPS_Bypass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#NPIN_OnLinePIN
 * AuthenticationMethod1Code.NPIN_OnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#FPIN_OfflinePIN
 * AuthenticationMethod1Code.FPIN_OfflinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#CPSG_SignatureCapture
 * AuthenticationMethod1Code.CPSG_SignatureCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#PPSG_PaperSignature
 * AuthenticationMethod1Code.PPSG_PaperSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#MANU_ManualVerification
 * AuthenticationMethod1Code.MANU_ManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#MERC_MerchantAuthentication
 * AuthenticationMethod1Code.MERC_MerchantAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#SCRT_SecureCertificate
 * AuthenticationMethod1Code.SCRT_SecureCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#SNCT_SecureNoCertificate
 * AuthenticationMethod1Code.SNCT_SecureNoCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#SCNL_SecuredChannel
 * AuthenticationMethod1Code.SCNL_SecuredChannel}</li>
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
 * "AuthenticationMethod1Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AuthenticationMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownMethod"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod1Code UKNW_UnknownMethod = new AuthenticationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownMethod";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethod1Code.mmObject());
			codeName = AuthenticationMethodCode.UKNW_UnknownMethod.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bypass"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod1Code BYPS_Bypass = new AuthenticationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bypass";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethod1Code.mmObject());
			codeName = AuthenticationMethodCode.BYPS_Bypass.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod1Code NPIN_OnLinePIN = new AuthenticationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethod1Code.mmObject());
			codeName = AuthenticationMethodCode.NPIN_OnLinePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePIN"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod1Code FPIN_OfflinePIN = new AuthenticationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePIN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethod1Code.mmObject());
			codeName = AuthenticationMethodCode.FPIN_OfflinePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureCapture"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod1Code CPSG_SignatureCapture = new AuthenticationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureCapture";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethod1Code.mmObject());
			codeName = AuthenticationMethodCode.CPSG_SignatureCapture.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaperSignature"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod1Code PPSG_PaperSignature = new AuthenticationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaperSignature";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethod1Code.mmObject());
			codeName = AuthenticationMethodCode.PPSG_PaperSignature.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod1Code MANU_ManualVerification = new AuthenticationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualVerification";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethod1Code.mmObject());
			codeName = AuthenticationMethodCode.MANU_ManualVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantAuthentication"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod1Code MERC_MerchantAuthentication = new AuthenticationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantAuthentication";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethod1Code.mmObject());
			codeName = AuthenticationMethodCode.MERC_MerchantAuthentication.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureCertificate"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod1Code SCRT_SecureCertificate = new AuthenticationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureCertificate";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethod1Code.mmObject());
			codeName = AuthenticationMethodCode.SCRT_SecureCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureNoCertificate"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod1Code SNCT_SecureNoCertificate = new AuthenticationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureNoCertificate";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethod1Code.mmObject());
			codeName = AuthenticationMethodCode.SNCT_SecureNoCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredChannel"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod1Code SCNL_SecuredChannel = new AuthenticationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredChannel";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationMethod1Code.mmObject());
			codeName = AuthenticationMethodCode.SCNL_SecuredChannel.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AuthenticationMethod1Code> codesByName = new LinkedHashMap<>();

	protected AuthenticationMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("UKNW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticationMethod1Code";
				definition = "Method used to authenticate a cardholder.";
				trace_lazy = LazyReference.create(() -> AuthenticationMethodCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod1Code.UKNW_UnknownMethod, com.tools20022.repository.codeset.AuthenticationMethod1Code.BYPS_Bypass,
						com.tools20022.repository.codeset.AuthenticationMethod1Code.NPIN_OnLinePIN, com.tools20022.repository.codeset.AuthenticationMethod1Code.FPIN_OfflinePIN,
						com.tools20022.repository.codeset.AuthenticationMethod1Code.CPSG_SignatureCapture, com.tools20022.repository.codeset.AuthenticationMethod1Code.PPSG_PaperSignature,
						com.tools20022.repository.codeset.AuthenticationMethod1Code.MANU_ManualVerification, com.tools20022.repository.codeset.AuthenticationMethod1Code.MERC_MerchantAuthentication,
						com.tools20022.repository.codeset.AuthenticationMethod1Code.SCRT_SecureCertificate, com.tools20022.repository.codeset.AuthenticationMethod1Code.SNCT_SecureNoCertificate,
						com.tools20022.repository.codeset.AuthenticationMethod1Code.SCNL_SecuredChannel));
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
	}

	public static AuthenticationMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AuthenticationMethod1Code[] values() {
		AuthenticationMethod1Code[] values = new AuthenticationMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AuthenticationMethod1Code> {
		@Override
		public AuthenticationMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AuthenticationMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}