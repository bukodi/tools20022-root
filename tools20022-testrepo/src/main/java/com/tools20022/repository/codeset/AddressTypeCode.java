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
import com.tools20022.repository.codeset.AddressTypeCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode#HOME_Residential
 * AddressTypeCode.HOME_Residential}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode#BIZZ_Business
 * AddressTypeCode.BIZZ_Business}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode#ADDR_Postal
 * AddressTypeCode.ADDR_Postal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AddressTypeCode#PBOX_POBox
 * AddressTypeCode.PBOX_POBox}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode#MLTO_MailTo
 * AddressTypeCode.MLTO_MailTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode#DLVY_DeliveryTo
 * AddressTypeCode.DLVY_DeliveryTo}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AddressType2Code
 * AddressType2Code}</li>
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
 * <li>"HOME"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AddressTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of address."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AddressTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Address is the home address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOME"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residential"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address is the home address."</li>
	 * </ul>
	 */
	public static final AddressTypeCode HOME_Residential = new AddressTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Residential";
			definition = "Address is the home address.";
			codeName = "HOME";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AddressTypeCode.mmObject());
		}
	};
	/**
	 * Address is the business address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIZZ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Business"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address is the business address."</li>
	 * </ul>
	 */
	public static final AddressTypeCode BIZZ_Business = new AddressTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Business";
			definition = "Address is the business address.";
			codeName = "BIZZ";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AddressTypeCode.mmObject());
		}
	};
	/**
	 * Address is the complete postal address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADDR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Postal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address is the complete postal address."</li>
	 * </ul>
	 */
	public static final AddressTypeCode ADDR_Postal = new AddressTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Postal";
			definition = "Address is the complete postal address.";
			codeName = "ADDR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AddressTypeCode.mmObject());
		}
	};
	/**
	 * Address is a postal office (PO) box.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PBOX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POBox"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address is a postal office (PO) box."</li>
	 * </ul>
	 */
	public static final AddressTypeCode PBOX_POBox = new AddressTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "POBox";
			definition = "Address is a postal office (PO) box.";
			codeName = "PBOX";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AddressTypeCode.mmObject());
		}
	};
	/**
	 * Address is the address to which mail is sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MLTO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address is the address to which mail is sent."</li>
	 * </ul>
	 */
	public static final AddressTypeCode MLTO_MailTo = new AddressTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MailTo";
			definition = "Address is the address to which mail is sent.";
			codeName = "MLTO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AddressTypeCode.mmObject());
		}
	};
	/**
	 * Address is the address to which delivery is to take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLVY"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address is the address to which delivery is to take place."</li>
	 * </ul>
	 */
	public static final AddressTypeCode DLVY_DeliveryTo = new AddressTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryTo";
			definition = "Address is the address to which delivery is to take place.";
			codeName = "DLVY";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AddressTypeCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, AddressTypeCode> codesByName = new LinkedHashMap<>();

	protected AddressTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("HOME");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AddressTypeCode";
				definition = "Specifies the type of address.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(AddressType2Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.AddressTypeCode.HOME_Residential, com.tools20022.repository.codeset.AddressTypeCode.BIZZ_Business,
						com.tools20022.repository.codeset.AddressTypeCode.ADDR_Postal, com.tools20022.repository.codeset.AddressTypeCode.PBOX_POBox, com.tools20022.repository.codeset.AddressTypeCode.MLTO_MailTo,
						com.tools20022.repository.codeset.AddressTypeCode.DLVY_DeliveryTo));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(HOME_Residential.getCodeName().get(), HOME_Residential);
		codesByName.put(BIZZ_Business.getCodeName().get(), BIZZ_Business);
		codesByName.put(ADDR_Postal.getCodeName().get(), ADDR_Postal);
		codesByName.put(PBOX_POBox.getCodeName().get(), PBOX_POBox);
		codesByName.put(MLTO_MailTo.getCodeName().get(), MLTO_MailTo);
		codesByName.put(DLVY_DeliveryTo.getCodeName().get(), DLVY_DeliveryTo);
	}

	public static AddressTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AddressTypeCode[] values() {
		AddressTypeCode[] values = new AddressTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AddressTypeCode> {
		@Override
		public AddressTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AddressTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}