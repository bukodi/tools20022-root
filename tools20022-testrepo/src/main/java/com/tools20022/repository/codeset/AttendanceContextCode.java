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
import com.tools20022.repository.codeset.AttendanceContextCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#ATTD_Attended
 * AttendanceContextCode.ATTD_Attended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#SATT_SemiAttended
 * AttendanceContextCode.SATT_SemiAttended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#UATT_Unattended
 * AttendanceContextCode.UATT_Unattended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#ATTL_AttendantDelivery
 * AttendanceContextCode.ATTL_AttendantDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#CUST_CustomerDelivery
 * AttendanceContextCode.CUST_CustomerDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#CARR_CarrierDelivery
 * AttendanceContextCode.CARR_CarrierDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#FULL_FullServe
 * AttendanceContextCode.FULL_FullServe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#SELF_SelfServe
 * AttendanceContextCode.SELF_SelfServe}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AttendanceContext1Code
 * AttendanceContext1Code}</li>
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
 * "AttendanceContextCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AttendanceContextCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATTD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attended"</li>
	 * </ul>
	 */
	public static final AttendanceContextCode ATTD_Attended = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Attended";
			definition = "Attended payment, with an attendant.";
			codeName = "ATTD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SATT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SemiAttended"</li>
	 * </ul>
	 */
	public static final AttendanceContextCode SATT_SemiAttended = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SemiAttended";
			definition = "Semi-attended, including self checkout. An attendant supervises several payment, and could be called to help the cardholder.";
			codeName = "SATT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UATT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unattended"</li>
	 * </ul>
	 */
	public static final AttendanceContextCode UATT_Unattended = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unattended";
			definition = "Unattended payment, no attendant present.";
			codeName = "UATT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATTL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendantDelivery"</li>
	 * </ul>
	 */
	public static final AttendanceContextCode ATTL_AttendantDelivery = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendantDelivery";
			definition = "Delivery by an attendant.";
			codeName = "ATTL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerDelivery"</li>
	 * </ul>
	 */
	public static final AttendanceContextCode CUST_CustomerDelivery = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDelivery";
			definition = "Delivery by the customer.";
			codeName = "CUST";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CARR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarrierDelivery"</li>
	 * </ul>
	 */
	public static final AttendanceContextCode CARR_CarrierDelivery = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarrierDelivery";
			definition = "Delivery by a carrier.";
			codeName = "CARR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullServe"</li>
	 * </ul>
	 */
	public static final AttendanceContextCode FULL_FullServe = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullServe";
			definition = "Full service for fuel distribution.";
			codeName = "FULL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SELF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfServe"</li>
	 * </ul>
	 */
	public static final AttendanceContextCode SELF_SelfServe = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfServe";
			definition = "Self service for fuel distribution.";
			codeName = "SELF";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, AttendanceContextCode> codesByName = new LinkedHashMap<>();

	protected AttendanceContextCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("ATTD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AttendanceContextCode";
				definition = "Human attendance at the POI location during the transaction.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(AttendanceContext1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.AttendanceContextCode.ATTD_Attended, com.tools20022.repository.codeset.AttendanceContextCode.SATT_SemiAttended,
						com.tools20022.repository.codeset.AttendanceContextCode.UATT_Unattended, com.tools20022.repository.codeset.AttendanceContextCode.ATTL_AttendantDelivery,
						com.tools20022.repository.codeset.AttendanceContextCode.CUST_CustomerDelivery, com.tools20022.repository.codeset.AttendanceContextCode.CARR_CarrierDelivery,
						com.tools20022.repository.codeset.AttendanceContextCode.FULL_FullServe, com.tools20022.repository.codeset.AttendanceContextCode.SELF_SelfServe));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ATTD_Attended.getCodeName().get(), ATTD_Attended);
		codesByName.put(SATT_SemiAttended.getCodeName().get(), SATT_SemiAttended);
		codesByName.put(UATT_Unattended.getCodeName().get(), UATT_Unattended);
		codesByName.put(ATTL_AttendantDelivery.getCodeName().get(), ATTL_AttendantDelivery);
		codesByName.put(CUST_CustomerDelivery.getCodeName().get(), CUST_CustomerDelivery);
		codesByName.put(CARR_CarrierDelivery.getCodeName().get(), CARR_CarrierDelivery);
		codesByName.put(FULL_FullServe.getCodeName().get(), FULL_FullServe);
		codesByName.put(SELF_SelfServe.getCodeName().get(), SELF_SelfServe);
	}

	public static AttendanceContextCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AttendanceContextCode[] values() {
		AttendanceContextCode[] values = new AttendanceContextCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AttendanceContextCode> {
		@Override
		public AttendanceContextCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AttendanceContextCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}