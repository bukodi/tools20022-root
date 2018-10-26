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
import com.tools20022.repository.codeset.ChargeBearerTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies which party(ies) will pay charges due for processing of the
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode#DEBT_BorneByDebtor
 * ChargeBearerTypeCode.DEBT_BorneByDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode#CRED_BorneByCreditor
 * ChargeBearerTypeCode.CRED_BorneByCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode#SHAR_Shared
 * ChargeBearerTypeCode.SHAR_Shared}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode#SLEV_FollowingServiceLevel
 * ChargeBearerTypeCode.SLEV_FollowingServiceLevel}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
 * ChargeBearerType1Code}</li>
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
 * <li>"DEBT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeBearerTypeCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeBearerTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * All transaction charges are to be borne by the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEBT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode
	 * ChargeBearerTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorneByDebtor"</li>
	 * </ul>
	 */
	public static final ChargeBearerTypeCode DEBT_BorneByDebtor = new ChargeBearerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorneByDebtor";
			definition = "All transaction charges are to be borne by the debtor.";
			codeName = "DEBT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.ChargeBearerTypeCode.mmObject());
		}
	};
	/**
	 * All transaction charges are to be borne by the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRED"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode
	 * ChargeBearerTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorneByCreditor"</li>
	 * </ul>
	 */
	public static final ChargeBearerTypeCode CRED_BorneByCreditor = new ChargeBearerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorneByCreditor";
			definition = "All transaction charges are to be borne by the creditor.";
			codeName = "CRED";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.ChargeBearerTypeCode.mmObject());
		}
	};
	/**
	 * In a credit transfer context, means that transaction charges on the
	 * sender side are to be borne by the debtor, transaction charges on the
	 * receiver side are to be borne by the creditor. In a direct debit context,
	 * means that transaction charges on the sender side are to be borne by the
	 * creditor, transaction charges on the receiver side are to be borne by the
	 * debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHAR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode
	 * ChargeBearerTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Shared"</li>
	 * </ul>
	 */
	public static final ChargeBearerTypeCode SHAR_Shared = new ChargeBearerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Shared";
			definition = "In a credit transfer context, means that transaction charges on the sender side are to be borne by the debtor, transaction charges on the receiver side are to be borne by the creditor. In a direct debit context, means that transaction charges on the sender side are to be borne by the creditor, transaction charges on the receiver side are to be borne by the debtor.";
			codeName = "SHAR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.ChargeBearerTypeCode.mmObject());
		}
	};
	/**
	 * Charges are to be applied following the rules agreed in the service level
	 * and/or scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLEV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode
	 * ChargeBearerTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FollowingServiceLevel"</li>
	 * </ul>
	 */
	public static final ChargeBearerTypeCode SLEV_FollowingServiceLevel = new ChargeBearerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FollowingServiceLevel";
			definition = "Charges are to be applied following the rules agreed in the service level and/or scheme.";
			codeName = "SLEV";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.ChargeBearerTypeCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, ChargeBearerTypeCode> codesByName = new LinkedHashMap<>();

	protected ChargeBearerTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("DEBT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeBearerTypeCode";
				definition = "Specifies which party(ies) will pay charges due for processing of the instruction.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(ChargeBearerType1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.ChargeBearerTypeCode.DEBT_BorneByDebtor, com.tools20022.repository.codeset.ChargeBearerTypeCode.CRED_BorneByCreditor,
						com.tools20022.repository.codeset.ChargeBearerTypeCode.SHAR_Shared, com.tools20022.repository.codeset.ChargeBearerTypeCode.SLEV_FollowingServiceLevel));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DEBT_BorneByDebtor.getCodeName().get(), DEBT_BorneByDebtor);
		codesByName.put(CRED_BorneByCreditor.getCodeName().get(), CRED_BorneByCreditor);
		codesByName.put(SHAR_Shared.getCodeName().get(), SHAR_Shared);
		codesByName.put(SLEV_FollowingServiceLevel.getCodeName().get(), SLEV_FollowingServiceLevel);
	}

	public static ChargeBearerTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeBearerTypeCode[] values() {
		ChargeBearerTypeCode[] values = new ChargeBearerTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeBearerTypeCode> {
		@Override
		public ChargeBearerTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeBearerTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}