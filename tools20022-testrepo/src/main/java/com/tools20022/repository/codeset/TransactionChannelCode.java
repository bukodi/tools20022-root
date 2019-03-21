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
import com.tools20022.repository.codeset.TransactionChannelCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of communication channel.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#MAIL_MailOrder
 * TransactionChannelCode.MAIL_MailOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#TLPH_TelephoneOrder
 * TransactionChannelCode.TLPH_TelephoneOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#ECOM_ElectronicCommerce
 * TransactionChannelCode.ECOM_ElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#TVPY_TelevisionPayment
 * TransactionChannelCode.TVPY_TelevisionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#BRAN_OfficeOrBranch
 * TransactionChannelCode.BRAN_OfficeOrBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#HOBA_HomeBanking
 * TransactionChannelCode.HOBA_HomeBanking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#FIAD_FinancialAdvisor
 * TransactionChannelCode.FIAD_FinancialAdvisor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#MOBL_MobilePayment
 * TransactionChannelCode.MOBL_MobilePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#SECM_SecuredElectronicCommerce
 * TransactionChannelCode.SECM_SecuredElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#MPOS_MobilePOS
 * TransactionChannelCode.MPOS_MobilePOS}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TransactionChannel1Code
 * TransactionChannel1Code}</li>
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
 * <li>"MAIL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionChannelCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionChannelCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAIL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailOrder"</li>
	 * </ul>
	 */
	public static final TransactionChannelCode MAIL_MailOrder = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MailOrder";
			definition = "Mail order.";
			codeName = "MAIL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TLPH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelephoneOrder"</li>
	 * </ul>
	 */
	public static final TransactionChannelCode TLPH_TelephoneOrder = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TelephoneOrder";
			definition = "Telephone order.";
			codeName = "TLPH";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECOM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicCommerce"</li>
	 * </ul>
	 */
	public static final TransactionChannelCode ECOM_ElectronicCommerce = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectronicCommerce";
			definition = "Electronic commerce.";
			codeName = "ECOM";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TVPY"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelevisionPayment"</li>
	 * </ul>
	 */
	public static final TransactionChannelCode TVPY_TelevisionPayment = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TelevisionPayment";
			definition = "Payment on television.";
			codeName = "TVPY";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRAN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficeOrBranch"</li>
	 * </ul>
	 */
	public static final TransactionChannelCode BRAN_OfficeOrBranch = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficeOrBranch";
			definition = "Office or branch.";
			codeName = "BRAN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOBA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HomeBanking"</li>
	 * </ul>
	 */
	public static final TransactionChannelCode HOBA_HomeBanking = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeBanking";
			definition = "Home banking.";
			codeName = "HOBA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIAD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdvisor"</li>
	 * </ul>
	 */
	public static final TransactionChannelCode FIAD_FinancialAdvisor = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdvisor";
			definition = "Financial advisor.";
			codeName = "FIAD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject());
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
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobilePayment"</li>
	 * </ul>
	 */
	public static final TransactionChannelCode MOBL_MobilePayment = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobilePayment";
			definition = "Payment performed through a cardholder mobile device.";
			codeName = "MOBL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredElectronicCommerce"</li>
	 * </ul>
	 */
	public static final TransactionChannelCode SECM_SecuredElectronicCommerce = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredElectronicCommerce";
			definition = "Electronic commerce with cardholder authentication.";
			codeName = "SECM";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MPOS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobilePOS"</li>
	 * </ul>
	 */
	public static final TransactionChannelCode MPOS_MobilePOS = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobilePOS";
			definition = "Payment performed through a merchant mobile device.";
			codeName = "MPOS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, TransactionChannelCode> codesByName = new LinkedHashMap<>();

	protected TransactionChannelCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("MAIL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionChannelCode";
				definition = "Specifies the type of communication channel.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(TransactionChannel1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.TransactionChannelCode.MAIL_MailOrder, com.tools20022.repository.codeset.TransactionChannelCode.TLPH_TelephoneOrder,
						com.tools20022.repository.codeset.TransactionChannelCode.ECOM_ElectronicCommerce, com.tools20022.repository.codeset.TransactionChannelCode.TVPY_TelevisionPayment,
						com.tools20022.repository.codeset.TransactionChannelCode.BRAN_OfficeOrBranch, com.tools20022.repository.codeset.TransactionChannelCode.HOBA_HomeBanking,
						com.tools20022.repository.codeset.TransactionChannelCode.FIAD_FinancialAdvisor, com.tools20022.repository.codeset.TransactionChannelCode.MOBL_MobilePayment,
						com.tools20022.repository.codeset.TransactionChannelCode.SECM_SecuredElectronicCommerce, com.tools20022.repository.codeset.TransactionChannelCode.MPOS_MobilePOS));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MAIL_MailOrder.getCodeName().get(), MAIL_MailOrder);
		codesByName.put(TLPH_TelephoneOrder.getCodeName().get(), TLPH_TelephoneOrder);
		codesByName.put(ECOM_ElectronicCommerce.getCodeName().get(), ECOM_ElectronicCommerce);
		codesByName.put(TVPY_TelevisionPayment.getCodeName().get(), TVPY_TelevisionPayment);
		codesByName.put(BRAN_OfficeOrBranch.getCodeName().get(), BRAN_OfficeOrBranch);
		codesByName.put(HOBA_HomeBanking.getCodeName().get(), HOBA_HomeBanking);
		codesByName.put(FIAD_FinancialAdvisor.getCodeName().get(), FIAD_FinancialAdvisor);
		codesByName.put(MOBL_MobilePayment.getCodeName().get(), MOBL_MobilePayment);
		codesByName.put(SECM_SecuredElectronicCommerce.getCodeName().get(), SECM_SecuredElectronicCommerce);
		codesByName.put(MPOS_MobilePOS.getCodeName().get(), MPOS_MobilePOS);
	}

	public static TransactionChannelCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionChannelCode[] values() {
		TransactionChannelCode[] values = new TransactionChannelCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionChannelCode> {
		@Override
		public TransactionChannelCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionChannelCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}