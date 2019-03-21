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
import com.tools20022.repository.codeset.CardPaymentServiceType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Service provided by the card payment transaction, in addition to the main
 * service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
 * CardPaymentServiceTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#AGGR_Aggregation
 * CardPaymentServiceType2Code.AGGR_Aggregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#DCCV_DCC
 * CardPaymentServiceType2Code.DCCV_DCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#GRTT_Gratuity
 * CardPaymentServiceType2Code.GRTT_Gratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#INSP_Instalment
 * CardPaymentServiceType2Code.INSP_Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#LOYT_Loyalty
 * CardPaymentServiceType2Code.LOYT_Loyalty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#NRES_NoShow
 * CardPaymentServiceType2Code.NRES_NoShow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#PUCO_PurchaseCorporate
 * CardPaymentServiceType2Code.PUCO_PurchaseCorporate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#RECP_RecurringPayment
 * CardPaymentServiceType2Code.RECP_RecurringPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#SOAF_SolicitedAvailableFunds
 * CardPaymentServiceType2Code.SOAF_SolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#UNAF_UnsolicitedAvailableFunds
 * CardPaymentServiceType2Code.UNAF_UnsolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#VCAU_VoiceAuthorisation
 * CardPaymentServiceType2Code.VCAU_VoiceAuthorisation}</li>
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
 * <li>"AGGR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentServiceType2Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardPaymentServiceType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aggregation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code AGGR_Aggregation = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Aggregation";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject());
			codeName = CardPaymentServiceTypeCode.AGGR_Aggregation.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DCC"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code DCCV_DCC = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DCC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject());
			codeName = CardPaymentServiceTypeCode.DCCV_DCC.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gratuity"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code GRTT_Gratuity = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gratuity";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject());
			codeName = CardPaymentServiceTypeCode.GRTT_Gratuity.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instalment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code INSP_Instalment = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instalment";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject());
			codeName = CardPaymentServiceTypeCode.INSP_Instalment.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loyalty"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code LOYT_Loyalty = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loyalty";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject());
			codeName = CardPaymentServiceTypeCode.LOYT_Loyalty.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoShow"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code NRES_NoShow = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoShow";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject());
			codeName = CardPaymentServiceTypeCode.NRES_NoShow.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseCorporate"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code PUCO_PurchaseCorporate = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseCorporate";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject());
			codeName = CardPaymentServiceTypeCode.PUCO_PurchaseCorporate.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringPayment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code RECP_RecurringPayment = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringPayment";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject());
			codeName = CardPaymentServiceTypeCode.RECP_RecurringPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitedAvailableFunds"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code SOAF_SolicitedAvailableFunds = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitedAvailableFunds";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject());
			codeName = CardPaymentServiceTypeCode.SOAF_SolicitedAvailableFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsolicitedAvailableFunds"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code UNAF_UnsolicitedAvailableFunds = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsolicitedAvailableFunds";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject());
			codeName = CardPaymentServiceTypeCode.UNAF_UnsolicitedAvailableFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoiceAuthorisation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code VCAU_VoiceAuthorisation = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoiceAuthorisation";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject());
			codeName = CardPaymentServiceTypeCode.VCAU_VoiceAuthorisation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardPaymentServiceType2Code> codesByName = new LinkedHashMap<>();

	protected CardPaymentServiceType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("AGGR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceType2Code";
				definition = "Service provided by the card payment transaction, in addition to the main service.";
				trace_lazy = LazyReference.create(() -> CardPaymentServiceTypeCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType2Code.AGGR_Aggregation, com.tools20022.repository.codeset.CardPaymentServiceType2Code.DCCV_DCC,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.GRTT_Gratuity, com.tools20022.repository.codeset.CardPaymentServiceType2Code.INSP_Instalment,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.LOYT_Loyalty, com.tools20022.repository.codeset.CardPaymentServiceType2Code.NRES_NoShow,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.PUCO_PurchaseCorporate, com.tools20022.repository.codeset.CardPaymentServiceType2Code.RECP_RecurringPayment,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.SOAF_SolicitedAvailableFunds, com.tools20022.repository.codeset.CardPaymentServiceType2Code.UNAF_UnsolicitedAvailableFunds,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.VCAU_VoiceAuthorisation));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AGGR_Aggregation.getCodeName().get(), AGGR_Aggregation);
		codesByName.put(DCCV_DCC.getCodeName().get(), DCCV_DCC);
		codesByName.put(GRTT_Gratuity.getCodeName().get(), GRTT_Gratuity);
		codesByName.put(INSP_Instalment.getCodeName().get(), INSP_Instalment);
		codesByName.put(LOYT_Loyalty.getCodeName().get(), LOYT_Loyalty);
		codesByName.put(NRES_NoShow.getCodeName().get(), NRES_NoShow);
		codesByName.put(PUCO_PurchaseCorporate.getCodeName().get(), PUCO_PurchaseCorporate);
		codesByName.put(RECP_RecurringPayment.getCodeName().get(), RECP_RecurringPayment);
		codesByName.put(SOAF_SolicitedAvailableFunds.getCodeName().get(), SOAF_SolicitedAvailableFunds);
		codesByName.put(UNAF_UnsolicitedAvailableFunds.getCodeName().get(), UNAF_UnsolicitedAvailableFunds);
		codesByName.put(VCAU_VoiceAuthorisation.getCodeName().get(), VCAU_VoiceAuthorisation);
	}

	public static CardPaymentServiceType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardPaymentServiceType2Code[] values() {
		CardPaymentServiceType2Code[] values = new CardPaymentServiceType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardPaymentServiceType2Code> {
		@Override
		public CardPaymentServiceType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardPaymentServiceType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}