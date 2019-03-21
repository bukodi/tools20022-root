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
import com.tools20022.repository.codeset.CardDataReading1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of reading of the card data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
 * CardDataReadingCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#TAGC_Tag
 * CardDataReading1Code.TAGC_Tag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#PHYS_Physical
 * CardDataReading1Code.PHYS_Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#BRCD_BarCode
 * CardDataReading1Code.BRCD_BarCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#MGST_MagneticStripe
 * CardDataReading1Code.MGST_MagneticStripe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#CICC_ICC
 * CardDataReading1Code.CICC_ICC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#DFLE_AccountData
 * CardDataReading1Code.DFLE_AccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#CTLS_ProximityReader
 * CardDataReading1Code.CTLS_ProximityReader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#ECTL_EMVProximityReader
 * CardDataReading1Code.ECTL_EMVProximityReader}</li>
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
 * <li>"TAGC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardDataReading1Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardDataReading1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tag"</li>
	 * </ul>
	 */
	public static final CardDataReading1Code TAGC_Tag = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tag";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject());
			codeName = CardDataReadingCode.TAGC_Tag.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * </ul>
	 */
	public static final CardDataReading1Code PHYS_Physical = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Physical";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject());
			codeName = CardDataReadingCode.PHYS_Physical.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BarCode"</li>
	 * </ul>
	 */
	public static final CardDataReading1Code BRCD_BarCode = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BarCode";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject());
			codeName = CardDataReadingCode.BRCD_BarCode.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MagneticStripe"</li>
	 * </ul>
	 */
	public static final CardDataReading1Code MGST_MagneticStripe = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MagneticStripe";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject());
			codeName = CardDataReadingCode.MGST_MagneticStripe.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICC"</li>
	 * </ul>
	 */
	public static final CardDataReading1Code CICC_ICC = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject());
			codeName = CardDataReadingCode.CICC_ICC.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountData"</li>
	 * </ul>
	 */
	public static final CardDataReading1Code DFLE_AccountData = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountData";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject());
			codeName = CardDataReadingCode.DFLE_AccountData.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProximityReader"</li>
	 * </ul>
	 */
	public static final CardDataReading1Code CTLS_ProximityReader = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProximityReader";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject());
			codeName = CardDataReadingCode.CTLS_ProximityReader.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVProximityReader"</li>
	 * </ul>
	 */
	public static final CardDataReading1Code ECTL_EMVProximityReader = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVProximityReader";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject());
			codeName = CardDataReadingCode.ECTL_EMVProximityReader.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardDataReading1Code> codesByName = new LinkedHashMap<>();

	protected CardDataReading1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("TAGC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardDataReading1Code";
				definition = "Type of reading of the card data.";
				trace_lazy = LazyReference.create(() -> CardDataReadingCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.CardDataReading1Code.TAGC_Tag, com.tools20022.repository.codeset.CardDataReading1Code.PHYS_Physical,
						com.tools20022.repository.codeset.CardDataReading1Code.BRCD_BarCode, com.tools20022.repository.codeset.CardDataReading1Code.MGST_MagneticStripe, com.tools20022.repository.codeset.CardDataReading1Code.CICC_ICC,
						com.tools20022.repository.codeset.CardDataReading1Code.DFLE_AccountData, com.tools20022.repository.codeset.CardDataReading1Code.CTLS_ProximityReader,
						com.tools20022.repository.codeset.CardDataReading1Code.ECTL_EMVProximityReader));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TAGC_Tag.getCodeName().get(), TAGC_Tag);
		codesByName.put(PHYS_Physical.getCodeName().get(), PHYS_Physical);
		codesByName.put(BRCD_BarCode.getCodeName().get(), BRCD_BarCode);
		codesByName.put(MGST_MagneticStripe.getCodeName().get(), MGST_MagneticStripe);
		codesByName.put(CICC_ICC.getCodeName().get(), CICC_ICC);
		codesByName.put(DFLE_AccountData.getCodeName().get(), DFLE_AccountData);
		codesByName.put(CTLS_ProximityReader.getCodeName().get(), CTLS_ProximityReader);
		codesByName.put(ECTL_EMVProximityReader.getCodeName().get(), ECTL_EMVProximityReader);
	}

	public static CardDataReading1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardDataReading1Code[] values() {
		CardDataReading1Code[] values = new CardDataReading1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardDataReading1Code> {
		@Override
		public CardDataReading1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardDataReading1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}