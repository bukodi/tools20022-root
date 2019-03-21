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
import com.tools20022.repository.codeset.CardDataReadingCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#TAGC_Tag
 * CardDataReadingCode.TAGC_Tag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#PHYS_Physical
 * CardDataReadingCode.PHYS_Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#BRCD_BarCode
 * CardDataReadingCode.BRCD_BarCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#MGST_MagneticStripe
 * CardDataReadingCode.MGST_MagneticStripe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#CICC_ICC
 * CardDataReadingCode.CICC_ICC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#DFLE_AccountData
 * CardDataReadingCode.DFLE_AccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#CTLS_ProximityReader
 * CardDataReadingCode.CTLS_ProximityReader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#ECTL_EMVProximityReader
 * CardDataReadingCode.ECTL_EMVProximityReader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#CDFL_CardOnFile
 * CardDataReadingCode.CDFL_CardOnFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#UNKW_Unknown
 * CardDataReadingCode.UNKW_Unknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReading1Code
 * CardDataReading1Code}</li>
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
 * "CardDataReadingCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardDataReadingCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAGC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tag"</li>
	 * </ul>
	 */
	public static final CardDataReadingCode TAGC_Tag = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tag";
			definition = "Tag reading capabilities (RFID, etc.).";
			codeName = "TAGC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * </ul>
	 */
	public static final CardDataReadingCode PHYS_Physical = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Physical";
			definition = "Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.";
			codeName = "PHYS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRCD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BarCode"</li>
	 * </ul>
	 */
	public static final CardDataReadingCode BRCD_BarCode = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BarCode";
			definition = "Bar code.";
			codeName = "BRCD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MGST"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MagneticStripe"</li>
	 * </ul>
	 */
	public static final CardDataReadingCode MGST_MagneticStripe = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MagneticStripe";
			definition = "Magnetic stripe.";
			codeName = "MGST";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CICC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICC"</li>
	 * </ul>
	 */
	public static final CardDataReadingCode CICC_ICC = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ICC";
			definition = "ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.";
			codeName = "CICC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountData"</li>
	 * </ul>
	 */
	public static final CardDataReadingCode DFLE_AccountData = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountData";
			definition = "Account data on file.";
			codeName = "DFLE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTLS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProximityReader"</li>
	 * </ul>
	 */
	public static final CardDataReadingCode CTLS_ProximityReader = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProximityReader";
			definition = "Contactless proximity reader.";
			codeName = "CTLS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECTL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVProximityReader"</li>
	 * </ul>
	 */
	public static final CardDataReadingCode ECTL_EMVProximityReader = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EMVProximityReader";
			definition = "Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).";
			codeName = "ECTL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDFL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardOnFile"</li>
	 * </ul>
	 */
	public static final CardDataReadingCode CDFL_CardOnFile = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardOnFile";
			definition = "Card information are stored on a file.";
			codeName = "CDFL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNKW"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * </ul>
	 */
	public static final CardDataReadingCode UNKW_Unknown = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "Unknown card reading capability.";
			codeName = "UNKW";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, CardDataReadingCode> codesByName = new LinkedHashMap<>();

	protected CardDataReadingCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("TAGC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardDataReadingCode";
				definition = "Type of reading of the card data.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(CardDataReading1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.CardDataReadingCode.TAGC_Tag, com.tools20022.repository.codeset.CardDataReadingCode.PHYS_Physical,
						com.tools20022.repository.codeset.CardDataReadingCode.BRCD_BarCode, com.tools20022.repository.codeset.CardDataReadingCode.MGST_MagneticStripe, com.tools20022.repository.codeset.CardDataReadingCode.CICC_ICC,
						com.tools20022.repository.codeset.CardDataReadingCode.DFLE_AccountData, com.tools20022.repository.codeset.CardDataReadingCode.CTLS_ProximityReader,
						com.tools20022.repository.codeset.CardDataReadingCode.ECTL_EMVProximityReader, com.tools20022.repository.codeset.CardDataReadingCode.CDFL_CardOnFile,
						com.tools20022.repository.codeset.CardDataReadingCode.UNKW_Unknown));
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
		codesByName.put(CDFL_CardOnFile.getCodeName().get(), CDFL_CardOnFile);
		codesByName.put(UNKW_Unknown.getCodeName().get(), UNKW_Unknown);
	}

	public static CardDataReadingCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardDataReadingCode[] values() {
		CardDataReadingCode[] values = new CardDataReadingCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardDataReadingCode> {
		@Override
		public CardDataReadingCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardDataReadingCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}