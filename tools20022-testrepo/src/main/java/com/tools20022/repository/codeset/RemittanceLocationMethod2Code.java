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
import com.tools20022.repository.codeset.RemittanceLocationMethod2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the method used to deliver the remittance advice information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
 * RemittanceLocationMethodCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code#FAXI_Fax
 * RemittanceLocationMethod2Code.FAXI_Fax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code#EDIC_ElectronicDataInterchange
 * RemittanceLocationMethod2Code.EDIC_ElectronicDataInterchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code#URID_UniformResourceIdentifier
 * RemittanceLocationMethod2Code.URID_UniformResourceIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code#EMAL_EMail
 * RemittanceLocationMethod2Code.EMAL_EMail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code#POST_Post
 * RemittanceLocationMethod2Code.POST_Post}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code#SMSM_SMS
 * RemittanceLocationMethod2Code.SMSM_SMS}</li>
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
 * <li>"FAXI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RemittanceLocationMethod2Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RemittanceLocationMethod2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fax"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethod2Code FAXI_Fax = new RemittanceLocationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fax";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.RemittanceLocationMethod2Code.mmObject());
			codeName = RemittanceLocationMethodCode.FAXI_Fax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicDataInterchange"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethod2Code EDIC_ElectronicDataInterchange = new RemittanceLocationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicDataInterchange";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.RemittanceLocationMethod2Code.mmObject());
			codeName = RemittanceLocationMethodCode.EDIC_ElectronicDataInterchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniformResourceIdentifier"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethod2Code URID_UniformResourceIdentifier = new RemittanceLocationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniformResourceIdentifier";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.RemittanceLocationMethod2Code.mmObject());
			codeName = RemittanceLocationMethodCode.URID_UniformResourceIdentifier.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMail"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethod2Code EMAL_EMail = new RemittanceLocationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMail";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.RemittanceLocationMethod2Code.mmObject());
			codeName = RemittanceLocationMethodCode.EMAL_EMail.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Post"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethod2Code POST_Post = new RemittanceLocationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Post";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.RemittanceLocationMethod2Code.mmObject());
			codeName = RemittanceLocationMethodCode.POST_Post.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SMS"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethod2Code SMSM_SMS = new RemittanceLocationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SMS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.RemittanceLocationMethod2Code.mmObject());
			codeName = RemittanceLocationMethodCode.SMSM_SMS.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RemittanceLocationMethod2Code> codesByName = new LinkedHashMap<>();

	protected RemittanceLocationMethod2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("FAXI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RemittanceLocationMethod2Code";
				definition = "Specifies the method used to deliver the remittance advice information.";
				trace_lazy = LazyReference.create(() -> RemittanceLocationMethodCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.RemittanceLocationMethod2Code.FAXI_Fax, com.tools20022.repository.codeset.RemittanceLocationMethod2Code.EDIC_ElectronicDataInterchange,
						com.tools20022.repository.codeset.RemittanceLocationMethod2Code.URID_UniformResourceIdentifier, com.tools20022.repository.codeset.RemittanceLocationMethod2Code.EMAL_EMail,
						com.tools20022.repository.codeset.RemittanceLocationMethod2Code.POST_Post, com.tools20022.repository.codeset.RemittanceLocationMethod2Code.SMSM_SMS));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FAXI_Fax.getCodeName().get(), FAXI_Fax);
		codesByName.put(EDIC_ElectronicDataInterchange.getCodeName().get(), EDIC_ElectronicDataInterchange);
		codesByName.put(URID_UniformResourceIdentifier.getCodeName().get(), URID_UniformResourceIdentifier);
		codesByName.put(EMAL_EMail.getCodeName().get(), EMAL_EMail);
		codesByName.put(POST_Post.getCodeName().get(), POST_Post);
		codesByName.put(SMSM_SMS.getCodeName().get(), SMSM_SMS);
	}

	public static RemittanceLocationMethod2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RemittanceLocationMethod2Code[] values() {
		RemittanceLocationMethod2Code[] values = new RemittanceLocationMethod2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RemittanceLocationMethod2Code> {
		@Override
		public RemittanceLocationMethod2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RemittanceLocationMethod2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}