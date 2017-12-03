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

@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AddressTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	public static final AddressTypeCode Residential = new AddressTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Residential";
			definition = "Address is the home address.";
			owner_lazy = () -> com.tools20022.repository.codeset.AddressTypeCode.mmObject();
			codeName = "HOME";
		}
	};
	public static final AddressTypeCode Business = new AddressTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Business";
			definition = "Address is the business address.";
			owner_lazy = () -> com.tools20022.repository.codeset.AddressTypeCode.mmObject();
			codeName = "BIZZ";
		}
	};
	public static final AddressTypeCode Postal = new AddressTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Postal";
			definition = "Address is the complete postal address.";
			owner_lazy = () -> com.tools20022.repository.codeset.AddressTypeCode.mmObject();
			codeName = "ADDR";
		}
	};
	public static final AddressTypeCode POBox = new AddressTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "POBox";
			definition = "Address is a postal office (PO) box.";
			owner_lazy = () -> com.tools20022.repository.codeset.AddressTypeCode.mmObject();
			codeName = "PBOX";
		}
	};
	public static final AddressTypeCode MailTo = new AddressTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MailTo";
			definition = "Address is the address to which mail is sent.";
			owner_lazy = () -> com.tools20022.repository.codeset.AddressTypeCode.mmObject();
			codeName = "MLTO";
		}
	};
	public static final AddressTypeCode DeliveryTo = new AddressTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryTo";
			definition = "Address is the address to which delivery is to take place.";
			owner_lazy = () -> com.tools20022.repository.codeset.AddressTypeCode.mmObject();
			codeName = "DLVY";
		}
	};
	final static private LinkedHashMap<String, AddressTypeCode> codesByName = new LinkedHashMap<>();

	protected AddressTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("HOME");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AddressTypeCode";
				definition = "Specifies the type of address.";
				derivation_lazy = () -> Arrays.asList(AddressType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AddressTypeCode.Residential, com.tools20022.repository.codeset.AddressTypeCode.Business, com.tools20022.repository.codeset.AddressTypeCode.Postal,
						com.tools20022.repository.codeset.AddressTypeCode.POBox, com.tools20022.repository.codeset.AddressTypeCode.MailTo, com.tools20022.repository.codeset.AddressTypeCode.DeliveryTo);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Residential.getCodeName().get(), Residential);
		codesByName.put(Business.getCodeName().get(), Business);
		codesByName.put(Postal.getCodeName().get(), Postal);
		codesByName.put(POBox.getCodeName().get(), POBox);
		codesByName.put(MailTo.getCodeName().get(), MailTo);
		codesByName.put(DeliveryTo.getCodeName().get(), DeliveryTo);
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