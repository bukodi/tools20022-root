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
import com.tools20022.repository.codeset.TaxRecordPeriodCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the period related to the tax payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#MM01_FirstMonth
 * TaxRecordPeriodCode.MM01_FirstMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#MM02_SecondMonth
 * TaxRecordPeriodCode.MM02_SecondMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#MM03_ThirdMonth
 * TaxRecordPeriodCode.MM03_ThirdMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#MM04_FourthMonth
 * TaxRecordPeriodCode.MM04_FourthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#MM05_FifthMonth
 * TaxRecordPeriodCode.MM05_FifthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#MM06_SixthMonth
 * TaxRecordPeriodCode.MM06_SixthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#MM07_SeventhMonth
 * TaxRecordPeriodCode.MM07_SeventhMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#MM08_EighthMonth
 * TaxRecordPeriodCode.MM08_EighthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#MM09_NinthMonth
 * TaxRecordPeriodCode.MM09_NinthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#MM10_TenthMonth
 * TaxRecordPeriodCode.MM10_TenthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#MM11_EleventhMonth
 * TaxRecordPeriodCode.MM11_EleventhMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#MM12_TwelfthMonth
 * TaxRecordPeriodCode.MM12_TwelfthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#QTR1_FirstQuarter
 * TaxRecordPeriodCode.QTR1_FirstQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#QTR2_SecondQuarter
 * TaxRecordPeriodCode.QTR2_SecondQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#QTR3_ThirdQuarter
 * TaxRecordPeriodCode.QTR3_ThirdQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#QTR4_FourthQuarter
 * TaxRecordPeriodCode.QTR4_FourthQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#HLF1_FirstHalf
 * TaxRecordPeriodCode.HLF1_FirstHalf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode#HLF2_SecondHalf
 * TaxRecordPeriodCode.HLF2_SecondHalf}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
 * TaxRecordPeriod1Code}</li>
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
 * <li>"MM01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxRecordPeriodCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxRecordPeriodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM01"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode MM01_FirstMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstMonth";
			definition = "Tax is related to the second month of the period.";
			codeName = "MM01";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM02"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode MM02_SecondMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecondMonth";
			definition = "Tax is related to the first month of the period.";
			codeName = "MM02";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM03"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode MM03_ThirdMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ThirdMonth";
			definition = "Tax is related to the third month of the period.";
			codeName = "MM03";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM04"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode MM04_FourthMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FourthMonth";
			definition = "Tax is related to the fourth month of the period.";
			codeName = "MM04";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM05"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FifthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode MM05_FifthMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FifthMonth";
			definition = "Tax is related to the fifth month of the period.";
			codeName = "MM05";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM06"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SixthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode MM06_SixthMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SixthMonth";
			definition = "Tax is related to the sixth month of the period.";
			codeName = "MM06";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM07"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeventhMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode MM07_SeventhMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SeventhMonth";
			definition = "Tax is related to the seventh month of the period.";
			codeName = "MM07";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM08"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EighthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode MM08_EighthMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EighthMonth";
			definition = "Tax is related to the eighth month of the period.";
			codeName = "MM08";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM09"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NinthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode MM09_NinthMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NinthMonth";
			definition = "Tax is related to the ninth month of the period.";
			codeName = "MM09";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM10"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode MM10_TenthMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TenthMonth";
			definition = "Tax is related to the tenth month of the period.";
			codeName = "MM10";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM11"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EleventhMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode MM11_EleventhMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EleventhMonth";
			definition = "Tax is related to the eleventh month of the period.";
			codeName = "MM11";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MM12"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwelfthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode MM12_TwelfthMonth = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TwelfthMonth";
			definition = "Tax is related to the twelfth month of the period.";
			codeName = "MM12";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QTR1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstQuarter"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode QTR1_FirstQuarter = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstQuarter";
			definition = "Tax is related to the first quarter of the period.";
			codeName = "QTR1";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QTR2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondQuarter"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode QTR2_SecondQuarter = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecondQuarter";
			definition = "Tax is related to the second quarter of the period.";
			codeName = "QTR2";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QTR3"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdQuarter"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode QTR3_ThirdQuarter = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ThirdQuarter";
			definition = "Tax is related to the third quarter of the period.";
			codeName = "QTR3";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QTR4"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourthQuarter"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode QTR4_FourthQuarter = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FourthQuarter";
			definition = "Tax is related to the forth quarter of the period.";
			codeName = "QTR4";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HLF1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstHalf"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode HLF1_FirstHalf = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstHalf";
			definition = "Tax is related to the first half of the period.";
			codeName = "HLF1";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HLF2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondHalf"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriodCode HLF2_SecondHalf = new TaxRecordPeriodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecondHalf";
			definition = "Tax is related to the second half of the period.";
			codeName = "HLF2";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriodCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, TaxRecordPeriodCode> codesByName = new LinkedHashMap<>();

	protected TaxRecordPeriodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("MM01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxRecordPeriodCode";
				definition = "Specifies the period related to the tax payment.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(TaxRecordPeriod1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.TaxRecordPeriodCode.MM01_FirstMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.MM02_SecondMonth,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.MM03_ThirdMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.MM04_FourthMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.MM05_FifthMonth,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.MM06_SixthMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.MM07_SeventhMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.MM08_EighthMonth,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.MM09_NinthMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.MM10_TenthMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.MM11_EleventhMonth,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.MM12_TwelfthMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.QTR1_FirstQuarter,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.QTR2_SecondQuarter, com.tools20022.repository.codeset.TaxRecordPeriodCode.QTR3_ThirdQuarter,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.QTR4_FourthQuarter, com.tools20022.repository.codeset.TaxRecordPeriodCode.HLF1_FirstHalf, com.tools20022.repository.codeset.TaxRecordPeriodCode.HLF2_SecondHalf));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MM01_FirstMonth.getCodeName().get(), MM01_FirstMonth);
		codesByName.put(MM02_SecondMonth.getCodeName().get(), MM02_SecondMonth);
		codesByName.put(MM03_ThirdMonth.getCodeName().get(), MM03_ThirdMonth);
		codesByName.put(MM04_FourthMonth.getCodeName().get(), MM04_FourthMonth);
		codesByName.put(MM05_FifthMonth.getCodeName().get(), MM05_FifthMonth);
		codesByName.put(MM06_SixthMonth.getCodeName().get(), MM06_SixthMonth);
		codesByName.put(MM07_SeventhMonth.getCodeName().get(), MM07_SeventhMonth);
		codesByName.put(MM08_EighthMonth.getCodeName().get(), MM08_EighthMonth);
		codesByName.put(MM09_NinthMonth.getCodeName().get(), MM09_NinthMonth);
		codesByName.put(MM10_TenthMonth.getCodeName().get(), MM10_TenthMonth);
		codesByName.put(MM11_EleventhMonth.getCodeName().get(), MM11_EleventhMonth);
		codesByName.put(MM12_TwelfthMonth.getCodeName().get(), MM12_TwelfthMonth);
		codesByName.put(QTR1_FirstQuarter.getCodeName().get(), QTR1_FirstQuarter);
		codesByName.put(QTR2_SecondQuarter.getCodeName().get(), QTR2_SecondQuarter);
		codesByName.put(QTR3_ThirdQuarter.getCodeName().get(), QTR3_ThirdQuarter);
		codesByName.put(QTR4_FourthQuarter.getCodeName().get(), QTR4_FourthQuarter);
		codesByName.put(HLF1_FirstHalf.getCodeName().get(), HLF1_FirstHalf);
		codesByName.put(HLF2_SecondHalf.getCodeName().get(), HLF2_SecondHalf);
	}

	public static TaxRecordPeriodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxRecordPeriodCode[] values() {
		TaxRecordPeriodCode[] values = new TaxRecordPeriodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxRecordPeriodCode> {
		@Override
		public TaxRecordPeriodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxRecordPeriodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}