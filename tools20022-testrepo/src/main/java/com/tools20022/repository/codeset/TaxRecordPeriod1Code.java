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
import com.tools20022.repository.codeset.TaxRecordPeriod1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
 * TaxRecordPeriodCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#MM01_FirstMonth
 * TaxRecordPeriod1Code.MM01_FirstMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#MM02_SecondMonth
 * TaxRecordPeriod1Code.MM02_SecondMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#MM03_ThirdMonth
 * TaxRecordPeriod1Code.MM03_ThirdMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#MM04_FourthMonth
 * TaxRecordPeriod1Code.MM04_FourthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#MM05_FifthMonth
 * TaxRecordPeriod1Code.MM05_FifthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#MM06_SixthMonth
 * TaxRecordPeriod1Code.MM06_SixthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#MM07_SeventhMonth
 * TaxRecordPeriod1Code.MM07_SeventhMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#MM08_EighthMonth
 * TaxRecordPeriod1Code.MM08_EighthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#MM09_NinthMonth
 * TaxRecordPeriod1Code.MM09_NinthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#MM10_TenthMonth
 * TaxRecordPeriod1Code.MM10_TenthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#MM11_EleventhMonth
 * TaxRecordPeriod1Code.MM11_EleventhMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#MM12_TwelfthMonth
 * TaxRecordPeriod1Code.MM12_TwelfthMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#QTR1_FirstQuarter
 * TaxRecordPeriod1Code.QTR1_FirstQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#QTR2_SecondQuarter
 * TaxRecordPeriod1Code.QTR2_SecondQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#QTR3_ThirdQuarter
 * TaxRecordPeriod1Code.QTR3_ThirdQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#QTR4_FourthQuarter
 * TaxRecordPeriod1Code.QTR4_FourthQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#HLF1_FirstHalf
 * TaxRecordPeriod1Code.HLF1_FirstHalf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code#HLF2_SecondHalf
 * TaxRecordPeriod1Code.HLF2_SecondHalf}</li>
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
 * "TaxRecordPeriod1Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxRecordPeriod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code MM01_FirstMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstMonth";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.MM01_FirstMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code MM02_SecondMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondMonth";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.MM02_SecondMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code MM03_ThirdMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdMonth";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.MM03_ThirdMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code MM04_FourthMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourthMonth";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.MM04_FourthMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FifthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code MM05_FifthMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FifthMonth";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.MM05_FifthMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SixthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code MM06_SixthMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SixthMonth";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.MM06_SixthMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeventhMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code MM07_SeventhMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeventhMonth";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.MM07_SeventhMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EighthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code MM08_EighthMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EighthMonth";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.MM08_EighthMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NinthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code MM09_NinthMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NinthMonth";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.MM09_NinthMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code MM10_TenthMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenthMonth";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.MM10_TenthMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EleventhMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code MM11_EleventhMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EleventhMonth";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.MM11_EleventhMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwelfthMonth"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code MM12_TwelfthMonth = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwelfthMonth";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.MM12_TwelfthMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstQuarter"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code QTR1_FirstQuarter = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstQuarter";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.QTR1_FirstQuarter.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondQuarter"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code QTR2_SecondQuarter = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondQuarter";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.QTR2_SecondQuarter.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdQuarter"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code QTR3_ThirdQuarter = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdQuarter";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.QTR3_ThirdQuarter.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourthQuarter"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code QTR4_FourthQuarter = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourthQuarter";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.QTR4_FourthQuarter.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstHalf"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code HLF1_FirstHalf = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstHalf";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.HLF1_FirstHalf.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondHalf"</li>
	 * </ul>
	 */
	public static final TaxRecordPeriod1Code HLF2_SecondHalf = new TaxRecordPeriod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondHalf";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TaxRecordPeriod1Code.mmObject());
			codeName = TaxRecordPeriodCode.HLF2_SecondHalf.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxRecordPeriod1Code> codesByName = new LinkedHashMap<>();

	protected TaxRecordPeriod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("MM01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxRecordPeriod1Code";
				definition = "Specifies the period related to the tax payment.";
				trace_lazy = LazyReference.create(() -> TaxRecordPeriodCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.TaxRecordPeriod1Code.MM01_FirstMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.MM02_SecondMonth,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.MM03_ThirdMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.MM04_FourthMonth,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.MM05_FifthMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.MM06_SixthMonth,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.MM07_SeventhMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.MM08_EighthMonth,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.MM09_NinthMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.MM10_TenthMonth,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.MM11_EleventhMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.MM12_TwelfthMonth,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.QTR1_FirstQuarter, com.tools20022.repository.codeset.TaxRecordPeriod1Code.QTR2_SecondQuarter,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.QTR3_ThirdQuarter, com.tools20022.repository.codeset.TaxRecordPeriod1Code.QTR4_FourthQuarter,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.HLF1_FirstHalf, com.tools20022.repository.codeset.TaxRecordPeriod1Code.HLF2_SecondHalf));
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

	public static TaxRecordPeriod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxRecordPeriod1Code[] values() {
		TaxRecordPeriod1Code[] values = new TaxRecordPeriod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxRecordPeriod1Code> {
		@Override
		public TaxRecordPeriod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxRecordPeriod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}