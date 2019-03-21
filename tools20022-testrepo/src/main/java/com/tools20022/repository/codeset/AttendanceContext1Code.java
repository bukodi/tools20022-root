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
import com.tools20022.repository.codeset.AttendanceContext1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Human attendance at the POI location during the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
 * AttendanceContextCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContext1Code#ATTD_Attended
 * AttendanceContext1Code.ATTD_Attended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContext1Code#SATT_SemiAttended
 * AttendanceContext1Code.SATT_SemiAttended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContext1Code#UATT_Unattended
 * AttendanceContext1Code.UATT_Unattended}</li>
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
 * <li>"ATTD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AttendanceContext1Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AttendanceContext1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContext1Code
	 * AttendanceContext1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attended"</li>
	 * </ul>
	 */
	public static final AttendanceContext1Code ATTD_Attended = new AttendanceContext1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attended";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AttendanceContext1Code.mmObject());
			codeName = AttendanceContextCode.ATTD_Attended.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContext1Code
	 * AttendanceContext1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SemiAttended"</li>
	 * </ul>
	 */
	public static final AttendanceContext1Code SATT_SemiAttended = new AttendanceContext1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SemiAttended";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AttendanceContext1Code.mmObject());
			codeName = AttendanceContextCode.SATT_SemiAttended.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContext1Code
	 * AttendanceContext1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unattended"</li>
	 * </ul>
	 */
	public static final AttendanceContext1Code UATT_Unattended = new AttendanceContext1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unattended";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AttendanceContext1Code.mmObject());
			codeName = AttendanceContextCode.UATT_Unattended.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AttendanceContext1Code> codesByName = new LinkedHashMap<>();

	protected AttendanceContext1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("ATTD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AttendanceContext1Code";
				definition = "Human attendance at the POI location during the transaction.";
				trace_lazy = LazyReference.create(() -> AttendanceContextCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.AttendanceContext1Code.ATTD_Attended, com.tools20022.repository.codeset.AttendanceContext1Code.SATT_SemiAttended,
						com.tools20022.repository.codeset.AttendanceContext1Code.UATT_Unattended));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ATTD_Attended.getCodeName().get(), ATTD_Attended);
		codesByName.put(SATT_SemiAttended.getCodeName().get(), SATT_SemiAttended);
		codesByName.put(UATT_Unattended.getCodeName().get(), UATT_Unattended);
	}

	public static AttendanceContext1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AttendanceContext1Code[] values() {
		AttendanceContext1Code[] values = new AttendanceContext1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AttendanceContext1Code> {
		@Override
		public AttendanceContext1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AttendanceContext1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}