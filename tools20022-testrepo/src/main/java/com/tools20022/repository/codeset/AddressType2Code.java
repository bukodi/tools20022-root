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
import com.tools20022.repository.codeset.AddressType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of address.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
 * AddressTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AddressType2Code#ADDR_Postal
 * AddressType2Code.ADDR_Postal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AddressType2Code#PBOX_POBox
 * AddressType2Code.PBOX_POBox}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AddressType2Code#HOME_Residential
 * AddressType2Code.HOME_Residential}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AddressType2Code#BIZZ_Business
 * AddressType2Code.BIZZ_Business}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AddressType2Code#MLTO_MailTo
 * AddressType2Code.MLTO_MailTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AddressType2Code#DLVY_DeliveryTo
 * AddressType2Code.DLVY_DeliveryTo}</li>
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
 * <li>"ADDR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AddressType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of address."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AddressType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressType2Code
	 * AddressType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Postal"</li>
	 * </ul>
	 */
	public static final AddressType2Code ADDR_Postal = new AddressType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Postal";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AddressType2Code.mmObject());
			codeName = AddressTypeCode.ADDR_Postal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressType2Code
	 * AddressType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POBox"</li>
	 * </ul>
	 */
	public static final AddressType2Code PBOX_POBox = new AddressType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POBox";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AddressType2Code.mmObject());
			codeName = AddressTypeCode.PBOX_POBox.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressType2Code
	 * AddressType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residential"</li>
	 * </ul>
	 */
	public static final AddressType2Code HOME_Residential = new AddressType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Residential";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AddressType2Code.mmObject());
			codeName = AddressTypeCode.HOME_Residential.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressType2Code
	 * AddressType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Business"</li>
	 * </ul>
	 */
	public static final AddressType2Code BIZZ_Business = new AddressType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Business";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AddressType2Code.mmObject());
			codeName = AddressTypeCode.BIZZ_Business.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressType2Code
	 * AddressType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailTo"</li>
	 * </ul>
	 */
	public static final AddressType2Code MLTO_MailTo = new AddressType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailTo";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AddressType2Code.mmObject());
			codeName = AddressTypeCode.MLTO_MailTo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressType2Code
	 * AddressType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryTo"</li>
	 * </ul>
	 */
	public static final AddressType2Code DLVY_DeliveryTo = new AddressType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryTo";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AddressType2Code.mmObject());
			codeName = AddressTypeCode.DLVY_DeliveryTo.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AddressType2Code> codesByName = new LinkedHashMap<>();

	protected AddressType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("ADDR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AddressType2Code";
				definition = "Specifies the type of address.";
				trace_lazy = LazyReference.create(() -> AddressTypeCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.AddressType2Code.ADDR_Postal, com.tools20022.repository.codeset.AddressType2Code.PBOX_POBox,
						com.tools20022.repository.codeset.AddressType2Code.HOME_Residential, com.tools20022.repository.codeset.AddressType2Code.BIZZ_Business, com.tools20022.repository.codeset.AddressType2Code.MLTO_MailTo,
						com.tools20022.repository.codeset.AddressType2Code.DLVY_DeliveryTo));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ADDR_Postal.getCodeName().get(), ADDR_Postal);
		codesByName.put(PBOX_POBox.getCodeName().get(), PBOX_POBox);
		codesByName.put(HOME_Residential.getCodeName().get(), HOME_Residential);
		codesByName.put(BIZZ_Business.getCodeName().get(), BIZZ_Business);
		codesByName.put(MLTO_MailTo.getCodeName().get(), MLTO_MailTo);
		codesByName.put(DLVY_DeliveryTo.getCodeName().get(), DLVY_DeliveryTo);
	}

	public static AddressType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AddressType2Code[] values() {
		AddressType2Code[] values = new AddressType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AddressType2Code> {
		@Override
		public AddressType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AddressType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}