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
import com.tools20022.repository.codeset.AddressType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AddressType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	public static final AddressType2Code Postal = new AddressType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Postal";
			owner_lazy = () -> com.tools20022.repository.codeset.AddressType2Code.mmObject();
			codeName = AddressTypeCode.Postal.getCodeName().orElse(name);
		}
	};
	public static final AddressType2Code POBox = new AddressType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POBox";
			owner_lazy = () -> com.tools20022.repository.codeset.AddressType2Code.mmObject();
			codeName = AddressTypeCode.POBox.getCodeName().orElse(name);
		}
	};
	public static final AddressType2Code Residential = new AddressType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Residential";
			owner_lazy = () -> com.tools20022.repository.codeset.AddressType2Code.mmObject();
			codeName = AddressTypeCode.Residential.getCodeName().orElse(name);
		}
	};
	public static final AddressType2Code Business = new AddressType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Business";
			owner_lazy = () -> com.tools20022.repository.codeset.AddressType2Code.mmObject();
			codeName = AddressTypeCode.Business.getCodeName().orElse(name);
		}
	};
	public static final AddressType2Code MailTo = new AddressType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailTo";
			owner_lazy = () -> com.tools20022.repository.codeset.AddressType2Code.mmObject();
			codeName = AddressTypeCode.MailTo.getCodeName().orElse(name);
		}
	};
	public static final AddressType2Code DeliveryTo = new AddressType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryTo";
			owner_lazy = () -> com.tools20022.repository.codeset.AddressType2Code.mmObject();
			codeName = AddressTypeCode.DeliveryTo.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AddressType2Code> codesByName = new LinkedHashMap<>();

	protected AddressType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ADDR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AddressType2Code";
				definition = "Specifies the type of address.";
				trace_lazy = () -> AddressTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AddressType2Code.Postal, com.tools20022.repository.codeset.AddressType2Code.POBox, com.tools20022.repository.codeset.AddressType2Code.Residential,
						com.tools20022.repository.codeset.AddressType2Code.Business, com.tools20022.repository.codeset.AddressType2Code.MailTo, com.tools20022.repository.codeset.AddressType2Code.DeliveryTo);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Postal.getCodeName().get(), Postal);
		codesByName.put(POBox.getCodeName().get(), POBox);
		codesByName.put(Residential.getCodeName().get(), Residential);
		codesByName.put(Business.getCodeName().get(), Business);
		codesByName.put(MailTo.getCodeName().get(), MailTo);
		codesByName.put(DeliveryTo.getCodeName().get(), DeliveryTo);
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