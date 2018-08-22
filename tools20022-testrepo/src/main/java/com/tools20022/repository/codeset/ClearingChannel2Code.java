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
import com.tools20022.repository.codeset.ClearingChannel2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the clearing channel for the routing of the transaction, as part of
 * the payment type identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ClearingChannelCode
 * ClearingChannelCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingChannel2Code#RTGS_RealTimeGrossSettlementSystem
 * ClearingChannel2Code.RTGS_RealTimeGrossSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingChannel2Code#RTNS_RealTimeNetSettlementSystem
 * ClearingChannel2Code.RTNS_RealTimeNetSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingChannel2Code#MPNS_MassPaymentNetSystem
 * ClearingChannel2Code.MPNS_MassPaymentNetSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingChannel2Code#BOOK_BookTransfer
 * ClearingChannel2Code.BOOK_BookTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RTGS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearingChannel2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the clearing channel for the routing of the transaction, as part of the payment type identification."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ClearingChannel2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingChannel2Code
	 * ClearingChannel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealTimeGrossSettlementSystem"</li>
	 * </ul>
	 */
	public static final ClearingChannel2Code RTGS_RealTimeGrossSettlementSystem = new ClearingChannel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealTimeGrossSettlementSystem";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.ClearingChannel2Code.mmObject());
			codeName = ClearingChannelCode.RTGS_RealTimeGrossSettlementSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingChannel2Code
	 * ClearingChannel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealTimeNetSettlementSystem"</li>
	 * </ul>
	 */
	public static final ClearingChannel2Code RTNS_RealTimeNetSettlementSystem = new ClearingChannel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealTimeNetSettlementSystem";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.ClearingChannel2Code.mmObject());
			codeName = ClearingChannelCode.RTNS_RealTimeNetSettlementSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingChannel2Code
	 * ClearingChannel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MassPaymentNetSystem"</li>
	 * </ul>
	 */
	public static final ClearingChannel2Code MPNS_MassPaymentNetSystem = new ClearingChannel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MassPaymentNetSystem";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.ClearingChannel2Code.mmObject());
			codeName = ClearingChannelCode.MPNS_MassPaymentNetSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingChannel2Code
	 * ClearingChannel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookTransfer"</li>
	 * </ul>
	 */
	public static final ClearingChannel2Code BOOK_BookTransfer = new ClearingChannel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookTransfer";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.ClearingChannel2Code.mmObject());
			codeName = ClearingChannelCode.BOOK_BookTransfer.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ClearingChannel2Code> codesByName = new LinkedHashMap<>();

	protected ClearingChannel2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				example = Arrays.asList("RTGS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingChannel2Code";
				definition = "Specifies the clearing channel for the routing of the transaction, as part of the payment type identification.";
				trace_lazy = LazyReference.create(() -> ClearingChannelCode.mmObject());
				code_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.ClearingChannel2Code.RTGS_RealTimeGrossSettlementSystem,
						com.tools20022.repository.codeset.ClearingChannel2Code.RTNS_RealTimeNetSettlementSystem, com.tools20022.repository.codeset.ClearingChannel2Code.MPNS_MassPaymentNetSystem,
						com.tools20022.repository.codeset.ClearingChannel2Code.BOOK_BookTransfer));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RTGS_RealTimeGrossSettlementSystem.getCodeName().get(), RTGS_RealTimeGrossSettlementSystem);
		codesByName.put(RTNS_RealTimeNetSettlementSystem.getCodeName().get(), RTNS_RealTimeNetSettlementSystem);
		codesByName.put(MPNS_MassPaymentNetSystem.getCodeName().get(), MPNS_MassPaymentNetSystem);
		codesByName.put(BOOK_BookTransfer.getCodeName().get(), BOOK_BookTransfer);
	}

	public static ClearingChannel2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ClearingChannel2Code[] values() {
		ClearingChannel2Code[] values = new ClearingChannel2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ClearingChannel2Code> {
		@Override
		public ClearingChannel2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ClearingChannel2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}