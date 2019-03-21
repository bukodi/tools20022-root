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
import com.tools20022.repository.codeset.UnitOfMeasure1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Unit of measure of the item purchased.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
 * UnitOfMeasureCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#PIEC_Piece
 * UnitOfMeasure1Code.PIEC_Piece}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#TONS_Ton
 * UnitOfMeasure1Code.TONS_Ton}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#FOOT_Foot
 * UnitOfMeasure1Code.FOOT_Foot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#GBGA_GBGallon
 * UnitOfMeasure1Code.GBGA_GBGallon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#USGA_USGallon
 * UnitOfMeasure1Code.USGA_USGallon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#GRAM_Gram
 * UnitOfMeasure1Code.GRAM_Gram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#INCH_Inch
 * UnitOfMeasure1Code.INCH_Inch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#KILO_Kilogram
 * UnitOfMeasure1Code.KILO_Kilogram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#PUND_Pound
 * UnitOfMeasure1Code.PUND_Pound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#METR_Metre
 * UnitOfMeasure1Code.METR_Metre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#CMET_Centimetre
 * UnitOfMeasure1Code.CMET_Centimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#MMET_Millimetre
 * UnitOfMeasure1Code.MMET_Millimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#LITR_Litre
 * UnitOfMeasure1Code.LITR_Litre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#CELI_Centilitre
 * UnitOfMeasure1Code.CELI_Centilitre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#MILI_MilliLitre
 * UnitOfMeasure1Code.MILI_MilliLitre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#GBOU_GBOunce
 * UnitOfMeasure1Code.GBOU_GBOunce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#USOU_USOunce
 * UnitOfMeasure1Code.USOU_USOunce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#GBQA_GBQuart
 * UnitOfMeasure1Code.GBQA_GBQuart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#USQA_USQuart
 * UnitOfMeasure1Code.USQA_USQuart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#GBPI_GBPint
 * UnitOfMeasure1Code.GBPI_GBPint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#USPI_USPint
 * UnitOfMeasure1Code.USPI_USPint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#MILE_Mile
 * UnitOfMeasure1Code.MILE_Mile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#KMET_Kilometre
 * UnitOfMeasure1Code.KMET_Kilometre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#YARD_Yard
 * UnitOfMeasure1Code.YARD_Yard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SQKI_SquareKilometre
 * UnitOfMeasure1Code.SQKI_SquareKilometre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#HECT_Hectare
 * UnitOfMeasure1Code.HECT_Hectare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#ARES_Are
 * UnitOfMeasure1Code.ARES_Are}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SMET_SquareMetre
 * UnitOfMeasure1Code.SMET_SquareMetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SCMT_SquareCentimetre
 * UnitOfMeasure1Code.SCMT_SquareCentimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SMIL_SquareMillimetre
 * UnitOfMeasure1Code.SMIL_SquareMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SQMI_SquareMile
 * UnitOfMeasure1Code.SQMI_SquareMile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SQYA_SquareYard
 * UnitOfMeasure1Code.SQYA_SquareYard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SQFO_SquareFoot
 * UnitOfMeasure1Code.SQFO_SquareFoot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SQIN_SquareInch
 * UnitOfMeasure1Code.SQIN_SquareInch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#ACRE_Acre
 * UnitOfMeasure1Code.ACRE_Acre}</li>
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
 * <li>"PIEC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnitOfMeasure1Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnitOfMeasure1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Piece"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code PIEC_Piece = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Piece";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.PIEC_Piece.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ton"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code TONS_Ton = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ton";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.TONS_Ton.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Foot"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code FOOT_Foot = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Foot";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.FOOT_Foot.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBGallon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code GBGA_GBGallon = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBGallon";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.GBGA_GBGallon.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGallon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code USGA_USGallon = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGallon";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.USGA_USGallon.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gram"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code GRAM_Gram = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gram";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.GRAM_Gram.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inch"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code INCH_Inch = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inch";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.INCH_Inch.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilogram"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code KILO_Kilogram = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Kilogram";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.KILO_Kilogram.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pound"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code PUND_Pound = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pound";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.PUND_Pound.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Metre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code METR_Metre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Metre";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.METR_Metre.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code CMET_Centimetre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Centimetre";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.CMET_Centimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Millimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code MMET_Millimetre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Millimetre";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.MMET_Millimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Litre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code LITR_Litre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Litre";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.LITR_Litre.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centilitre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code CELI_Centilitre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Centilitre";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.CELI_Centilitre.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MilliLitre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code MILI_MilliLitre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MilliLitre";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.MILI_MilliLitre.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code GBOU_GBOunce = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBOunce";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.GBOU_GBOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code USOU_USOunce = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USOunce";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.USOU_USOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBQuart"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code GBQA_GBQuart = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBQuart";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.GBQA_GBQuart.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USQuart"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code USQA_USQuart = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USQuart";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.USQA_USQuart.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBPint"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code GBPI_GBPint = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBPint";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.GBPI_GBPint.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USPint"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code USPI_USPint = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USPint";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.USPI_USPint.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mile"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code MILE_Mile = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mile";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.MILE_Mile.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilometre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code KMET_Kilometre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Kilometre";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.KMET_Kilometre.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yard"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code YARD_Yard = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yard";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.YARD_Yard.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareKilometre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SQKI_SquareKilometre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareKilometre";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.SQKI_SquareKilometre.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hectare"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code HECT_Hectare = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hectare";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.HECT_Hectare.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Are"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code ARES_Are = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Are";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.ARES_Are.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SMET_SquareMetre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMetre";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.SMET_SquareMetre.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareCentimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SCMT_SquareCentimetre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareCentimetre";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.SCMT_SquareCentimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMillimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SMIL_SquareMillimetre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMillimetre";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.SMIL_SquareMillimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMile"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SQMI_SquareMile = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMile";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.SQMI_SquareMile.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareYard"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SQYA_SquareYard = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareYard";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.SQYA_SquareYard.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareFoot"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SQFO_SquareFoot = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareFoot";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.SQFO_SquareFoot.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareInch"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SQIN_SquareInch = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareInch";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.SQIN_SquareInch.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code ACRE_Acre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acre";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject());
			codeName = UnitOfMeasureCode.ACRE_Acre.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnitOfMeasure1Code> codesByName = new LinkedHashMap<>();

	protected UnitOfMeasure1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("PIEC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnitOfMeasure1Code";
				definition = "Unit of measure of the item purchased.";
				trace_lazy = LazyReference.create(() -> UnitOfMeasureCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.UnitOfMeasure1Code.PIEC_Piece, com.tools20022.repository.codeset.UnitOfMeasure1Code.TONS_Ton,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.FOOT_Foot, com.tools20022.repository.codeset.UnitOfMeasure1Code.GBGA_GBGallon, com.tools20022.repository.codeset.UnitOfMeasure1Code.USGA_USGallon,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.GRAM_Gram, com.tools20022.repository.codeset.UnitOfMeasure1Code.INCH_Inch, com.tools20022.repository.codeset.UnitOfMeasure1Code.KILO_Kilogram,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.PUND_Pound, com.tools20022.repository.codeset.UnitOfMeasure1Code.METR_Metre, com.tools20022.repository.codeset.UnitOfMeasure1Code.CMET_Centimetre,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.MMET_Millimetre, com.tools20022.repository.codeset.UnitOfMeasure1Code.LITR_Litre, com.tools20022.repository.codeset.UnitOfMeasure1Code.CELI_Centilitre,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.MILI_MilliLitre, com.tools20022.repository.codeset.UnitOfMeasure1Code.GBOU_GBOunce, com.tools20022.repository.codeset.UnitOfMeasure1Code.USOU_USOunce,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.GBQA_GBQuart, com.tools20022.repository.codeset.UnitOfMeasure1Code.USQA_USQuart, com.tools20022.repository.codeset.UnitOfMeasure1Code.GBPI_GBPint,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.USPI_USPint, com.tools20022.repository.codeset.UnitOfMeasure1Code.MILE_Mile, com.tools20022.repository.codeset.UnitOfMeasure1Code.KMET_Kilometre,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.YARD_Yard, com.tools20022.repository.codeset.UnitOfMeasure1Code.SQKI_SquareKilometre, com.tools20022.repository.codeset.UnitOfMeasure1Code.HECT_Hectare,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.ARES_Are, com.tools20022.repository.codeset.UnitOfMeasure1Code.SMET_SquareMetre, com.tools20022.repository.codeset.UnitOfMeasure1Code.SCMT_SquareCentimetre,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.SMIL_SquareMillimetre, com.tools20022.repository.codeset.UnitOfMeasure1Code.SQMI_SquareMile, com.tools20022.repository.codeset.UnitOfMeasure1Code.SQYA_SquareYard,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.SQFO_SquareFoot, com.tools20022.repository.codeset.UnitOfMeasure1Code.SQIN_SquareInch, com.tools20022.repository.codeset.UnitOfMeasure1Code.ACRE_Acre));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PIEC_Piece.getCodeName().get(), PIEC_Piece);
		codesByName.put(TONS_Ton.getCodeName().get(), TONS_Ton);
		codesByName.put(FOOT_Foot.getCodeName().get(), FOOT_Foot);
		codesByName.put(GBGA_GBGallon.getCodeName().get(), GBGA_GBGallon);
		codesByName.put(USGA_USGallon.getCodeName().get(), USGA_USGallon);
		codesByName.put(GRAM_Gram.getCodeName().get(), GRAM_Gram);
		codesByName.put(INCH_Inch.getCodeName().get(), INCH_Inch);
		codesByName.put(KILO_Kilogram.getCodeName().get(), KILO_Kilogram);
		codesByName.put(PUND_Pound.getCodeName().get(), PUND_Pound);
		codesByName.put(METR_Metre.getCodeName().get(), METR_Metre);
		codesByName.put(CMET_Centimetre.getCodeName().get(), CMET_Centimetre);
		codesByName.put(MMET_Millimetre.getCodeName().get(), MMET_Millimetre);
		codesByName.put(LITR_Litre.getCodeName().get(), LITR_Litre);
		codesByName.put(CELI_Centilitre.getCodeName().get(), CELI_Centilitre);
		codesByName.put(MILI_MilliLitre.getCodeName().get(), MILI_MilliLitre);
		codesByName.put(GBOU_GBOunce.getCodeName().get(), GBOU_GBOunce);
		codesByName.put(USOU_USOunce.getCodeName().get(), USOU_USOunce);
		codesByName.put(GBQA_GBQuart.getCodeName().get(), GBQA_GBQuart);
		codesByName.put(USQA_USQuart.getCodeName().get(), USQA_USQuart);
		codesByName.put(GBPI_GBPint.getCodeName().get(), GBPI_GBPint);
		codesByName.put(USPI_USPint.getCodeName().get(), USPI_USPint);
		codesByName.put(MILE_Mile.getCodeName().get(), MILE_Mile);
		codesByName.put(KMET_Kilometre.getCodeName().get(), KMET_Kilometre);
		codesByName.put(YARD_Yard.getCodeName().get(), YARD_Yard);
		codesByName.put(SQKI_SquareKilometre.getCodeName().get(), SQKI_SquareKilometre);
		codesByName.put(HECT_Hectare.getCodeName().get(), HECT_Hectare);
		codesByName.put(ARES_Are.getCodeName().get(), ARES_Are);
		codesByName.put(SMET_SquareMetre.getCodeName().get(), SMET_SquareMetre);
		codesByName.put(SCMT_SquareCentimetre.getCodeName().get(), SCMT_SquareCentimetre);
		codesByName.put(SMIL_SquareMillimetre.getCodeName().get(), SMIL_SquareMillimetre);
		codesByName.put(SQMI_SquareMile.getCodeName().get(), SQMI_SquareMile);
		codesByName.put(SQYA_SquareYard.getCodeName().get(), SQYA_SquareYard);
		codesByName.put(SQFO_SquareFoot.getCodeName().get(), SQFO_SquareFoot);
		codesByName.put(SQIN_SquareInch.getCodeName().get(), SQIN_SquareInch);
		codesByName.put(ACRE_Acre.getCodeName().get(), ACRE_Acre);
	}

	public static UnitOfMeasure1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnitOfMeasure1Code[] values() {
		UnitOfMeasure1Code[] values = new UnitOfMeasure1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnitOfMeasure1Code> {
		@Override
		public UnitOfMeasure1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnitOfMeasure1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}