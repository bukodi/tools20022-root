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
import com.tools20022.repository.codeset.ExternalBalanceType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the balance type, as published in an external balance type code
 * set.<br>
 * External code sets can be downloaded from www.iso20022.org.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ExternalBalanceTypeCode
 * ExternalBalanceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExternalBalanceType1Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExternalBalanceType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	final static private LinkedHashMap<String, ExternalBalanceType1Code> codesByName = new LinkedHashMap<>();

	protected ExternalBalanceType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExternalBalanceType1Code";
				definition = "Specifies the balance type, as published in an external balance type code set.\r\nExternal code sets can be downloaded from www.iso20022.org.";
				trace_lazy = LazyReference.create(() -> ExternalBalanceTypeCode.mmObject());
				minLength = 1;
				maxLength = 4;
			}
		});
		return mmObject_lazy.get();
	}

	static {
	}

	public static ExternalBalanceType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExternalBalanceType1Code[] values() {
		ExternalBalanceType1Code[] values = new ExternalBalanceType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExternalBalanceType1Code> {
		@Override
		public ExternalBalanceType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExternalBalanceType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}