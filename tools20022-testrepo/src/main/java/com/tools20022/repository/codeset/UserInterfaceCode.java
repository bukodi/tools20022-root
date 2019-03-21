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
import com.tools20022.repository.codeset.UserInterfaceCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of user interface to display or print information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#CDSP_CardholderDisplay
 * UserInterfaceCode.CDSP_CardholderDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#CRCP_CardholderReceipt
 * UserInterfaceCode.CRCP_CardholderReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#MDSP_MerchantDisplay
 * UserInterfaceCode.MDSP_MerchantDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#MRCP_MerchantReceipt
 * UserInterfaceCode.MRCP_MerchantReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#ACQU_Acquirer
 * UserInterfaceCode.ACQU_Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#ISSR_Issuer
 * UserInterfaceCode.ISSR_Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#AGNT_Agent
 * UserInterfaceCode.AGNT_Agent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#CRDO_OtherCardholderInterface
 * UserInterfaceCode.CRDO_OtherCardholderInterface}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterface2Code
 * UserInterface2Code}</li>
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
 * <li>"CDSP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UserInterfaceCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UserInterfaceCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDSP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderDisplay"</li>
	 * </ul>
	 */
	public static final UserInterfaceCode CDSP_CardholderDisplay = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardholderDisplay";
			definition = "Cardholder display or interface.";
			codeName = "CDSP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRCP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderReceipt"</li>
	 * </ul>
	 */
	public static final UserInterfaceCode CRCP_CardholderReceipt = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardholderReceipt";
			definition = "Cardholder receipt.";
			codeName = "CRCP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MDSP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantDisplay"</li>
	 * </ul>
	 */
	public static final UserInterfaceCode MDSP_MerchantDisplay = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantDisplay";
			definition = "Merchant display or interface.";
			codeName = "MDSP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRCP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantReceipt"</li>
	 * </ul>
	 */
	public static final UserInterfaceCode MRCP_MerchantReceipt = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantReceipt";
			definition = "Merchant receipt.";
			codeName = "MRCP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACQU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * </ul>
	 */
	public static final UserInterfaceCode ACQU_Acquirer = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer.";
			codeName = "ACQU";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject());
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
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * </ul>
	 */
	public static final UserInterfaceCode ISSR_Issuer = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Issuer.";
			codeName = "ISSR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject());
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
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agent"</li>
	 * </ul>
	 */
	public static final UserInterfaceCode AGNT_Agent = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agent";
			definition = "Agent.";
			codeName = "AGNT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCardholderInterface"</li>
	 * </ul>
	 */
	public static final UserInterfaceCode CRDO_OtherCardholderInterface = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCardholderInterface";
			definition = "Other interface of the cardholder, for instance e-mail or smartphone message.";
			codeName = "CRDO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, UserInterfaceCode> codesByName = new LinkedHashMap<>();

	protected UserInterfaceCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("CDSP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UserInterfaceCode";
				definition = "Type of user interface to display or print information.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(UserInterface2Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.UserInterfaceCode.CDSP_CardholderDisplay, com.tools20022.repository.codeset.UserInterfaceCode.CRCP_CardholderReceipt,
						com.tools20022.repository.codeset.UserInterfaceCode.MDSP_MerchantDisplay, com.tools20022.repository.codeset.UserInterfaceCode.MRCP_MerchantReceipt, com.tools20022.repository.codeset.UserInterfaceCode.ACQU_Acquirer,
						com.tools20022.repository.codeset.UserInterfaceCode.ISSR_Issuer, com.tools20022.repository.codeset.UserInterfaceCode.AGNT_Agent, com.tools20022.repository.codeset.UserInterfaceCode.CRDO_OtherCardholderInterface));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CDSP_CardholderDisplay.getCodeName().get(), CDSP_CardholderDisplay);
		codesByName.put(CRCP_CardholderReceipt.getCodeName().get(), CRCP_CardholderReceipt);
		codesByName.put(MDSP_MerchantDisplay.getCodeName().get(), MDSP_MerchantDisplay);
		codesByName.put(MRCP_MerchantReceipt.getCodeName().get(), MRCP_MerchantReceipt);
		codesByName.put(ACQU_Acquirer.getCodeName().get(), ACQU_Acquirer);
		codesByName.put(ISSR_Issuer.getCodeName().get(), ISSR_Issuer);
		codesByName.put(AGNT_Agent.getCodeName().get(), AGNT_Agent);
		codesByName.put(CRDO_OtherCardholderInterface.getCodeName().get(), CRDO_OtherCardholderInterface);
	}

	public static UserInterfaceCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UserInterfaceCode[] values() {
		UserInterfaceCode[] values = new UserInterfaceCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UserInterfaceCode> {
		@Override
		public UserInterfaceCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UserInterfaceCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}