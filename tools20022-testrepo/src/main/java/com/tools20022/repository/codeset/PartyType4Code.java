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
import com.tools20022.repository.codeset.PartyType4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Entity assigning an identification (for example merchant, acceptor, acquirer,
 * tax authority, etc.).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode PartyTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType4Code#MERC_Merchant
 * PartyType4Code.MERC_Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType4Code#ACCP_Acceptor
 * PartyType4Code.ACCP_Acceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType4Code#ITAG_IntermediaryAgent
 * PartyType4Code.ITAG_IntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType4Code#ACQR_Acquirer
 * PartyType4Code.ACQR_Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType4Code#CISS_CardIssuer
 * PartyType4Code.CISS_CardIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType4Code#TAXH_TaxAuthority
 * PartyType4Code.TAXH_TaxAuthority}</li>
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
 * <li>"MERC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyType4Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartyType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType4Code
	 * PartyType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * </ul>
	 */
	public static final PartyType4Code MERC_Merchant = new PartyType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merchant";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyType4Code.mmObject());
			codeName = PartyTypeCode.MERC_Merchant.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType4Code
	 * PartyType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acceptor"</li>
	 * </ul>
	 */
	public static final PartyType4Code ACCP_Acceptor = new PartyType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acceptor";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyType4Code.mmObject());
			codeName = PartyTypeCode.ACCP_Acceptor.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType4Code
	 * PartyType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent"</li>
	 * </ul>
	 */
	public static final PartyType4Code ITAG_IntermediaryAgent = new PartyType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyType4Code.mmObject());
			codeName = PartyTypeCode.ITAG_IntermediaryAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType4Code
	 * PartyType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * </ul>
	 */
	public static final PartyType4Code ACQR_Acquirer = new PartyType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyType4Code.mmObject());
			codeName = PartyTypeCode.ACQR_Acquirer.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType4Code
	 * PartyType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardIssuer"</li>
	 * </ul>
	 */
	public static final PartyType4Code CISS_CardIssuer = new PartyType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardIssuer";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyType4Code.mmObject());
			codeName = PartyTypeCode.CISS_CardIssuer.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType4Code
	 * PartyType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAuthority"</li>
	 * </ul>
	 */
	public static final PartyType4Code TAXH_TaxAuthority = new PartyType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAuthority";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyType4Code.mmObject());
			codeName = PartyTypeCode.TAXH_TaxAuthority.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PartyType4Code> codesByName = new LinkedHashMap<>();

	protected PartyType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("MERC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyType4Code";
				definition = "Entity assigning an identification (for example merchant, acceptor, acquirer, tax authority, etc.).";
				trace_lazy = LazyReference.create(() -> PartyTypeCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.PartyType4Code.MERC_Merchant, com.tools20022.repository.codeset.PartyType4Code.ACCP_Acceptor,
						com.tools20022.repository.codeset.PartyType4Code.ITAG_IntermediaryAgent, com.tools20022.repository.codeset.PartyType4Code.ACQR_Acquirer, com.tools20022.repository.codeset.PartyType4Code.CISS_CardIssuer,
						com.tools20022.repository.codeset.PartyType4Code.TAXH_TaxAuthority));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MERC_Merchant.getCodeName().get(), MERC_Merchant);
		codesByName.put(ACCP_Acceptor.getCodeName().get(), ACCP_Acceptor);
		codesByName.put(ITAG_IntermediaryAgent.getCodeName().get(), ITAG_IntermediaryAgent);
		codesByName.put(ACQR_Acquirer.getCodeName().get(), ACQR_Acquirer);
		codesByName.put(CISS_CardIssuer.getCodeName().get(), CISS_CardIssuer);
		codesByName.put(TAXH_TaxAuthority.getCodeName().get(), TAXH_TaxAuthority);
	}

	public static PartyType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartyType4Code[] values() {
		PartyType4Code[] values = new PartyType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartyType4Code> {
		@Override
		public PartyType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartyType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}