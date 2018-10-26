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
import com.tools20022.repository.codeset.RemittanceLocationMethodCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode#FAXI_Fax
 * RemittanceLocationMethodCode.FAXI_Fax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode#EDIC_ElectronicDataInterchange
 * RemittanceLocationMethodCode.EDIC_ElectronicDataInterchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode#URID_UniformResourceIdentifier
 * RemittanceLocationMethodCode.URID_UniformResourceIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode#EMAL_EMail
 * RemittanceLocationMethodCode.EMAL_EMail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode#POST_Post
 * RemittanceLocationMethodCode.POST_Post}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode#SMSM_SMS
 * RemittanceLocationMethodCode.SMSM_SMS}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
 * RemittanceLocationMethod2Code}</li>
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
 * "RemittanceLocationMethodCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RemittanceLocationMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Remittance advice information must be faxed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAXI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fax"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethodCode FAXI_Fax = new RemittanceLocationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fax";
			definition = "Remittance advice information must be faxed.";
			codeName = "FAXI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.RemittanceLocationMethodCode.mmObject());
		}
	};
	/**
	 * Remittance advice information must be sent through Electronic Data
	 * Interchange (EDI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EDIC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicDataInterchange"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethodCode EDIC_ElectronicDataInterchange = new RemittanceLocationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectronicDataInterchange";
			definition = "Remittance advice information must be sent through Electronic Data Interchange (EDI).";
			codeName = "EDIC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.RemittanceLocationMethodCode.mmObject());
		}
	};
	/**
	 * Remittance advice information needs to be sent to a Uniform Resource
	 * Identifier (URI). URI is a compact string of characters that uniquely
	 * identify an abstract or physical resource. URI's are the super-set of
	 * identifiers, such as URLs, email addresses, ftp sites, etc, and as such,
	 * provide the syntax for all of the identification schemes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "URID"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniformResourceIdentifier"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethodCode URID_UniformResourceIdentifier = new RemittanceLocationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UniformResourceIdentifier";
			definition = "Remittance advice  information needs to be sent to a Uniform Resource Identifier (URI). URI  is a compact string of characters that uniquely identify an abstract or physical resource.  URI's are the super-set of identifiers, such as URLs, email addresses, ftp sites, etc, and as such, provide the syntax for all of the identification schemes.";
			codeName = "URID";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.RemittanceLocationMethodCode.mmObject());
		}
	};
	/**
	 * Remittance advice information must be sent through e-mail.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMAL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMail"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethodCode EMAL_EMail = new RemittanceLocationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EMail";
			definition = "Remittance advice  information must be sent through e-mail.";
			codeName = "EMAL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.RemittanceLocationMethodCode.mmObject());
		}
	};
	/**
	 * Remittance advice information must be sent through postal services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POST"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Post"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethodCode POST_Post = new RemittanceLocationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Post";
			definition = "Remittance advice information must be sent through postal services.";
			codeName = "POST";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.RemittanceLocationMethodCode.mmObject());
		}
	};
	/**
	 * Remittance advice information must be sent through by phone as a short
	 * message service (SMS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMSM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SMS"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethodCode SMSM_SMS = new RemittanceLocationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SMS";
			definition = "Remittance advice  information must be sent through by phone as a short message service (SMS).";
			codeName = "SMSM";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.RemittanceLocationMethodCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, RemittanceLocationMethodCode> codesByName = new LinkedHashMap<>();

	protected RemittanceLocationMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("FAXI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RemittanceLocationMethodCode";
				definition = "Specifies the method used to deliver the remittance advice information.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(RemittanceLocationMethod2Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.RemittanceLocationMethodCode.FAXI_Fax, com.tools20022.repository.codeset.RemittanceLocationMethodCode.EDIC_ElectronicDataInterchange,
						com.tools20022.repository.codeset.RemittanceLocationMethodCode.URID_UniformResourceIdentifier, com.tools20022.repository.codeset.RemittanceLocationMethodCode.EMAL_EMail,
						com.tools20022.repository.codeset.RemittanceLocationMethodCode.POST_Post, com.tools20022.repository.codeset.RemittanceLocationMethodCode.SMSM_SMS));
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

	public static RemittanceLocationMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RemittanceLocationMethodCode[] values() {
		RemittanceLocationMethodCode[] values = new RemittanceLocationMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RemittanceLocationMethodCode> {
		@Override
		public RemittanceLocationMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RemittanceLocationMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}