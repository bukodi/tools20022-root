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
import com.tools20022.repository.codeset.POIComponentType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Generic component type belonging to a POI (Point of Interaction) Terminal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
 * POIComponentTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code#SOFT_Soft
 * POIComponentType1Code.SOFT_Soft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code#EMVK_EMVKernel
 * POIComponentType1Code.EMVK_EMVKernel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code#EMVO_EMVLevel1
 * POIComponentType1Code.EMVO_EMVLevel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code#MRIT_MerchantInterface
 * POIComponentType1Code.MRIT_MerchantInterface}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code#CHIT_CardholderInterface
 * POIComponentType1Code.CHIT_CardholderInterface}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code#SECM_SecureModule
 * POIComponentType1Code.SECM_SecureModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code#PEDV_PINEntryDevice
 * POIComponentType1Code.PEDV_PINEntryDevice}</li>
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
 * <li>"SOFT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "POIComponentType1Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class POIComponentType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Soft"</li>
	 * </ul>
	 */
	public static final POIComponentType1Code SOFT_Soft = new POIComponentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Soft";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentType1Code.mmObject());
			codeName = POIComponentTypeCode.SOFT_Soft.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVKernel"</li>
	 * </ul>
	 */
	public static final POIComponentType1Code EMVK_EMVKernel = new POIComponentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVKernel";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentType1Code.mmObject());
			codeName = POIComponentTypeCode.EMVK_EMVKernel.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVLevel1"</li>
	 * </ul>
	 */
	public static final POIComponentType1Code EMVO_EMVLevel1 = new POIComponentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVLevel1";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentType1Code.mmObject());
			codeName = POIComponentTypeCode.EMVO_EMVLevel1.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantInterface"</li>
	 * </ul>
	 */
	public static final POIComponentType1Code MRIT_MerchantInterface = new POIComponentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantInterface";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentType1Code.mmObject());
			codeName = POIComponentTypeCode.MRIT_MerchantInterface.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderInterface"</li>
	 * </ul>
	 */
	public static final POIComponentType1Code CHIT_CardholderInterface = new POIComponentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderInterface";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentType1Code.mmObject());
			codeName = POIComponentTypeCode.CHIT_CardholderInterface.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureModule"</li>
	 * </ul>
	 */
	public static final POIComponentType1Code SECM_SecureModule = new POIComponentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureModule";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentType1Code.mmObject());
			codeName = POIComponentTypeCode.SECM_SecureModule.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINEntryDevice"</li>
	 * </ul>
	 */
	public static final POIComponentType1Code PEDV_PINEntryDevice = new POIComponentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINEntryDevice";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentType1Code.mmObject());
			codeName = POIComponentTypeCode.PEDV_PINEntryDevice.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, POIComponentType1Code> codesByName = new LinkedHashMap<>();

	protected POIComponentType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("SOFT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "POIComponentType1Code";
				definition = "Generic component type belonging to a POI (Point of Interaction) Terminal.";
				trace_lazy = LazyReference.create(() -> POIComponentTypeCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType1Code.SOFT_Soft, com.tools20022.repository.codeset.POIComponentType1Code.EMVK_EMVKernel,
						com.tools20022.repository.codeset.POIComponentType1Code.EMVO_EMVLevel1, com.tools20022.repository.codeset.POIComponentType1Code.MRIT_MerchantInterface,
						com.tools20022.repository.codeset.POIComponentType1Code.CHIT_CardholderInterface, com.tools20022.repository.codeset.POIComponentType1Code.SECM_SecureModule,
						com.tools20022.repository.codeset.POIComponentType1Code.PEDV_PINEntryDevice));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SOFT_Soft.getCodeName().get(), SOFT_Soft);
		codesByName.put(EMVK_EMVKernel.getCodeName().get(), EMVK_EMVKernel);
		codesByName.put(EMVO_EMVLevel1.getCodeName().get(), EMVO_EMVLevel1);
		codesByName.put(MRIT_MerchantInterface.getCodeName().get(), MRIT_MerchantInterface);
		codesByName.put(CHIT_CardholderInterface.getCodeName().get(), CHIT_CardholderInterface);
		codesByName.put(SECM_SecureModule.getCodeName().get(), SECM_SecureModule);
		codesByName.put(PEDV_PINEntryDevice.getCodeName().get(), PEDV_PINEntryDevice);
	}

	public static POIComponentType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static POIComponentType1Code[] values() {
		POIComponentType1Code[] values = new POIComponentType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, POIComponentType1Code> {
		@Override
		public POIComponentType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(POIComponentType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}