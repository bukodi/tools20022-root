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
import com.tools20022.repository.codeset.AuthenticationEntityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Entity or object in charge of verifying the cardholder authenticity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode#ICCD_ICC
 * AuthenticationEntityCode.ICCD_ICC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode#AGNT_AuthorisedAgent
 * AuthenticationEntityCode.AGNT_AuthorisedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode#MERC_Merchant
 * AuthenticationEntityCode.MERC_Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode#ACQR_Acquirer
 * AuthenticationEntityCode.ACQR_Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode#ISSR_Issuer
 * AuthenticationEntityCode.ISSR_Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode#TRML_Terminal
 * AuthenticationEntityCode.TRML_Terminal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code
 * AuthenticationEntity1Code}</li>
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
 * <li>"ICCD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthenticationEntityCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AuthenticationEntityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICCD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
	 * AuthenticationEntityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICC"</li>
	 * </ul>
	 */
	public static final AuthenticationEntityCode ICCD_ICC = new AuthenticationEntityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ICC";
			definition = "Application in the chip card (Integrated Circuit Card), for instance an offline PIN verification.";
			codeName = "ICCD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationEntityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGNT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
	 * AuthenticationEntityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedAgent"</li>
	 * </ul>
	 */
	public static final AuthenticationEntityCode AGNT_AuthorisedAgent = new AuthenticationEntityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthorisedAgent";
			definition = "Authorisation agent of the issuer.";
			codeName = "AGNT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationEntityCode.mmObject());
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
	 * AuthenticationEntityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * </ul>
	 */
	public static final AuthenticationEntityCode MERC_Merchant = new AuthenticationEntityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Merchant";
			definition = "Merchant (for example signature verification by the attendant).";
			codeName = "MERC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationEntityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACQR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
	 * AuthenticationEntityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * </ul>
	 */
	public static final AuthenticationEntityCode ACQR_Acquirer = new AuthenticationEntityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer of the transaction.";
			codeName = "ACQR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationEntityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
	 * AuthenticationEntityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * </ul>
	 */
	public static final AuthenticationEntityCode ISSR_Issuer = new AuthenticationEntityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Card issuer.";
			codeName = "ISSR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationEntityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRML"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
	 * AuthenticationEntityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Terminal"</li>
	 * </ul>
	 */
	public static final AuthenticationEntityCode TRML_Terminal = new AuthenticationEntityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Terminal";
			definition = "Secure application in the terminal.";
			codeName = "TRML";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AuthenticationEntityCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, AuthenticationEntityCode> codesByName = new LinkedHashMap<>();

	protected AuthenticationEntityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("ICCD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticationEntityCode";
				definition = "Entity or object in charge of verifying the cardholder authenticity.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(AuthenticationEntity1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationEntityCode.ICCD_ICC, com.tools20022.repository.codeset.AuthenticationEntityCode.AGNT_AuthorisedAgent,
						com.tools20022.repository.codeset.AuthenticationEntityCode.MERC_Merchant, com.tools20022.repository.codeset.AuthenticationEntityCode.ACQR_Acquirer,
						com.tools20022.repository.codeset.AuthenticationEntityCode.ISSR_Issuer, com.tools20022.repository.codeset.AuthenticationEntityCode.TRML_Terminal));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ICCD_ICC.getCodeName().get(), ICCD_ICC);
		codesByName.put(AGNT_AuthorisedAgent.getCodeName().get(), AGNT_AuthorisedAgent);
		codesByName.put(MERC_Merchant.getCodeName().get(), MERC_Merchant);
		codesByName.put(ACQR_Acquirer.getCodeName().get(), ACQR_Acquirer);
		codesByName.put(ISSR_Issuer.getCodeName().get(), ISSR_Issuer);
		codesByName.put(TRML_Terminal.getCodeName().get(), TRML_Terminal);
	}

	public static AuthenticationEntityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AuthenticationEntityCode[] values() {
		AuthenticationEntityCode[] values = new AuthenticationEntityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AuthenticationEntityCode> {
		@Override
		public AuthenticationEntityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AuthenticationEntityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}