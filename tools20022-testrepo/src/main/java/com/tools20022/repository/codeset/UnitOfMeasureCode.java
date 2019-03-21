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
import com.tools20022.repository.codeset.UnitOfMeasureCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the unit of measure by means of a code.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#KILO_Kilogram
 * UnitOfMeasureCode.KILO_Kilogram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#PIEC_Piece
 * UnitOfMeasureCode.PIEC_Piece}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#TONS_Ton
 * UnitOfMeasureCode.TONS_Ton}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#METR_Metre
 * UnitOfMeasureCode.METR_Metre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#INCH_Inch
 * UnitOfMeasureCode.INCH_Inch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#YARD_Yard
 * UnitOfMeasureCode.YARD_Yard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GBGA_GBGallon
 * UnitOfMeasureCode.GBGA_GBGallon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GRAM_Gram
 * UnitOfMeasureCode.GRAM_Gram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#CMET_Centimetre
 * UnitOfMeasureCode.CMET_Centimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SMET_SquareMetre
 * UnitOfMeasureCode.SMET_SquareMetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#FOOT_Foot
 * UnitOfMeasureCode.FOOT_Foot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MILE_Mile
 * UnitOfMeasureCode.MILE_Mile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SQIN_SquareInch
 * UnitOfMeasureCode.SQIN_SquareInch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SQFO_SquareFoot
 * UnitOfMeasureCode.SQFO_SquareFoot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SQMI_SquareMile
 * UnitOfMeasureCode.SQMI_SquareMile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GBOU_GBOunce
 * UnitOfMeasureCode.GBOU_GBOunce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#USOU_USOunce
 * UnitOfMeasureCode.USOU_USOunce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GBPI_GBPint
 * UnitOfMeasureCode.GBPI_GBPint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#USPI_USPint
 * UnitOfMeasureCode.USPI_USPint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GBQA_GBQuart
 * UnitOfMeasureCode.GBQA_GBQuart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#USQA_USQuart
 * UnitOfMeasureCode.USQA_USQuart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#USGA_USGallon
 * UnitOfMeasureCode.USGA_USGallon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MMET_Millimetre
 * UnitOfMeasureCode.MMET_Millimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#KMET_Kilometre
 * UnitOfMeasureCode.KMET_Kilometre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SQYA_SquareYard
 * UnitOfMeasureCode.SQYA_SquareYard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#ACRE_Acre
 * UnitOfMeasureCode.ACRE_Acre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#ARES_Are
 * UnitOfMeasureCode.ARES_Are}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SMIL_SquareMillimetre
 * UnitOfMeasureCode.SMIL_SquareMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SCMT_SquareCentimetre
 * UnitOfMeasureCode.SCMT_SquareCentimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#HECT_Hectare
 * UnitOfMeasureCode.HECT_Hectare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SQKI_SquareKilometre
 * UnitOfMeasureCode.SQKI_SquareKilometre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MILI_MilliLitre
 * UnitOfMeasureCode.MILI_MilliLitre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#CELI_Centilitre
 * UnitOfMeasureCode.CELI_Centilitre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#LITR_Litre
 * UnitOfMeasureCode.LITR_Litre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#PUND_Pound
 * UnitOfMeasureCode.PUND_Pound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#ALOW_Allowances
 * UnitOfMeasureCode.ALOW_Allowances}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#ACCY_AmountOfCurrency
 * UnitOfMeasureCode.ACCY_AmountOfCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#BARL_Barrels
 * UnitOfMeasureCode.BARL_Barrels}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#BCUF_BillionCubicFeet
 * UnitOfMeasureCode.BCUF_BillionCubicFeet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#BDFT_BoardFeet
 * UnitOfMeasureCode.BDFT_BoardFeet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#BUSL_Bushels
 * UnitOfMeasureCode.BUSL_Bushels}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#CEER_CertifiedEmissionsReduction
 * UnitOfMeasureCode.CEER_CertifiedEmissionsReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#CLRT_ClimateReserveTonnes
 * UnitOfMeasureCode.CLRT_ClimateReserveTonnes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#CBME_CubicMeters
 * UnitOfMeasureCode.CBME_CubicMeters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#DAYS_Days
 * UnitOfMeasureCode.DAYS_Days}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#DMET_DryMetricTons
 * UnitOfMeasureCode.DMET_DryMetricTons}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#ENVC_EnvironmentalCredit
 * UnitOfMeasureCode.ENVC_EnvironmentalCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#ENVO_EnvironmentalOffset
 * UnitOfMeasureCode.ENVO_EnvironmentalOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#HUWG_Hundredweight
 * UnitOfMeasureCode.HUWG_Hundredweight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#KWDC_KilowattDayCapacity
 * UnitOfMeasureCode.KWDC_KilowattDayCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#KWHO_KilowattHours
 * UnitOfMeasureCode.KWHO_KilowattHours}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#KWHC_KilowattHoursCapacity
 * UnitOfMeasureCode.KWHC_KilowattHoursCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#KMOC_KilowattMinuteCapacity
 * UnitOfMeasureCode.KMOC_KilowattMinuteCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#KWMC_KilowattMonthCapacity
 * UnitOfMeasureCode.KWMC_KilowattMonthCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#KWYC_KilowattYearCapacity
 * UnitOfMeasureCode.KWYC_KilowattYearCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MWDC_MegawattDayCapacity
 * UnitOfMeasureCode.MWDC_MegawattDayCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MWHO_MegawattHours
 * UnitOfMeasureCode.MWHO_MegawattHours}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MWHC_MegawattHoursCapacity
 * UnitOfMeasureCode.MWHC_MegawattHoursCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MWMC_MegawattMinuteCapacity
 * UnitOfMeasureCode.MWMC_MegawattMinuteCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MMOC_MegawattMonthCapacity
 * UnitOfMeasureCode.MMOC_MegawattMonthCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MWYC_MegawattYearCapacity
 * UnitOfMeasureCode.MWYC_MegawattYearCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#TONE_MetricTons
 * UnitOfMeasureCode.TONE_MetricTons}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MIBA_MillionBarrels
 * UnitOfMeasureCode.MIBA_MillionBarrels}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MBTU_OneMillionBTU
 * UnitOfMeasureCode.MBTU_OneMillionBTU}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#OZTR_TroyOunces
 * UnitOfMeasureCode.OZTR_TroyOunces}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#UCWT_USHundredweight
 * UnitOfMeasureCode.UCWT_USHundredweight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#IPNT_IndexPoint
 * UnitOfMeasureCode.IPNT_IndexPoint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#PWRD_PrincipalWithRelationToDebtInstrument
 * UnitOfMeasureCode.PWRD_PrincipalWithRelationToDebtInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#DGEU_DieselGallonEquivalent
 * UnitOfMeasureCode.DGEU_DieselGallonEquivalent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GGEU_GasolineGallonEquivalent
 * UnitOfMeasureCode.GGEU_GasolineGallonEquivalent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#TOCD_TonsOfCarbonDioxide
 * UnitOfMeasureCode.TOCD_TonsOfCarbonDioxide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SHAS_Shares
 * UnitOfMeasureCode.SHAS_Shares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#THMS_Therms
 * UnitOfMeasureCode.THMS_Therms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#FUTU_Future
 * UnitOfMeasureCode.FUTU_Future}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GWHO_GigawattHours
 * UnitOfMeasureCode.GWHO_GigawattHours}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#BRTU_BritishThermalUnit
 * UnitOfMeasureCode.BRTU_BritishThermalUnit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#LOTS_Lot
 * UnitOfMeasureCode.LOTS_Lot}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#BAGG_Bag
 * UnitOfMeasureCode.BAGG_Bag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#BALE_Bale
 * UnitOfMeasureCode.BALE_Bale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#BOTL_Bottle
 * UnitOfMeasureCode.BOTL_Bottle}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#BOXX_Box
 * UnitOfMeasureCode.BOXX_Box}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#CRTN_Carton
 * UnitOfMeasureCode.CRTN_Carton}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#CNTR_Container
 * UnitOfMeasureCode.CNTR_Container}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#CRAT_Crate
 * UnitOfMeasureCode.CRAT_Crate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#CBIN_CubicInch
 * UnitOfMeasureCode.CBIN_CubicInch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#CBML_CubicMillimetre
 * UnitOfMeasureCode.CBML_CubicMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GBFO_GBFuildOunce
 * UnitOfMeasureCode.GBFO_GBFuildOunce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GBTN_GBTon
 * UnitOfMeasureCode.GBTN_GBTon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#USBA_USBarrel
 * UnitOfMeasureCode.USBA_USBarrel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#USFO_USFluidOunce
 * UnitOfMeasureCode.USFO_USFluidOunce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#USTN_USTon
 * UnitOfMeasureCode.USTN_USTon}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
 * UnitOfMeasure1Code}</li>
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
 * <li>"KILO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnitOfMeasureCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnitOfMeasureCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KILO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilogram"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode KILO_Kilogram = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Kilogram";
			definition = "Basic unit of mass in the SI system, 1000 grams.";
			codeName = "KILO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PIEC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Piece"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode PIEC_Piece = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Piece";
			definition = "Standard length of cloth, wallpaper, as an item for sale or amount of a substance.";
			codeName = "PIEC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TONS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ton"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode TONS_Ton = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ton";
			definition = "Measure of weight, in Britain 2240lb (long ton)and in the US 2000lb (short ton).";
			codeName = "TONS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "METR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Metre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode METR_Metre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Metre";
			definition = "Unit of length in the metric system, equal to 39.37 inches.";
			codeName = "METR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inch"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode INCH_Inch = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Inch";
			definition = "Measure of length equal to 2.54 cm.";
			codeName = "INCH";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YARD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yard"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode YARD_Yard = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Yard";
			definition = "Unit of length equal to 3 feet or 0.9144 metre.";
			codeName = "YARD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBGA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBGallon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GBGA_GBGallon = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GBGallon";
			definition = "Unit of volume that is equal to 8 pints.";
			codeName = "GBGA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRAM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gram"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GRAM_Gram = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gram";
			definition = "Unit of measure that is equal to a 1, 000th of a kilo.";
			codeName = "GRAM";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMET"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode CMET_Centimetre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Centimetre";
			definition = "Unit of measure that is equal to one hundredth of a metre.";
			codeName = "CMET";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMET"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SMET_SquareMetre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareMetre";
			definition = "Measure of a surface, one metre by one metre.";
			codeName = "SMET";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FOOT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Foot"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode FOOT_Foot = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Foot";
			definition = "Unit of length equal to 1/3 yard.";
			codeName = "FOOT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MILE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mile"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MILE_Mile = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mile";
			definition = "Unit of length equal to 1, 760 yards.";
			codeName = "MILE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SQIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareInch"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SQIN_SquareInch = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareInch";
			definition = "Measure of a surface, one inch by one inch.";
			codeName = "SQIN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SQFO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareFoot"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SQFO_SquareFoot = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareFoot";
			definition = "Measure of a surface, one foot by one foot.";
			codeName = "SQFO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SQMI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMile"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SQMI_SquareMile = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareMile";
			definition = "Measure of a surface, one mile by one mile.";
			codeName = "SQMI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBOU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GBOU_GBOunce = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GBOunce";
			definition = "Unit of weight equal to a sixteenth of a pound.";
			codeName = "GBOU";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USOU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode USOU_USOunce = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USOunce";
			definition = "Unit of weight equal to a sixteenth of a pound.";
			codeName = "USOU";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBPI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBPint"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GBPI_GBPint = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GBPint";
			definition = "Unit of volume that is equal to 568 cubic centimetres.";
			codeName = "GBPI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USPI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USPint"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode USPI_USPint = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USPint";
			definition = "Unit of volume that is equal to 473 cubic centimetres.";
			codeName = "USPI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBQA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBQuart"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GBQA_GBQuart = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GBQuart";
			definition = "Unit of volume that is equal to 2 pints.";
			codeName = "GBQA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USQA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USQuart"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode USQA_USQuart = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USQuart";
			definition = "Unit of volume that is equal to 2 pints.";
			codeName = "USQA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USGA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGallon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode USGA_USGallon = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USGallon";
			definition = "Unit of volume that is equal to 8 pints.";
			codeName = "USGA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MMET"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Millimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MMET_Millimetre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Millimetre";
			definition = "Unit of measure that is a thousandth of one metre.";
			codeName = "MMET";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KMET"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilometre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode KMET_Kilometre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Kilometre";
			definition = "Unit of measure that is equal to 1, 000 meters.";
			codeName = "KMET";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SQYA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareYard"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SQYA_SquareYard = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareYard";
			definition = "Measure of a surface, one yard by one yard.";
			codeName = "SQYA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACRE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode ACRE_Acre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Acre";
			definition = "Unit of measure equal to 4, 840 square yards.";
			codeName = "ACRE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARES"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Are"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode ARES_Are = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Are";
			definition = "Unit of measure equal to a 100 square meters.";
			codeName = "ARES";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMIL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMillimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SMIL_SquareMillimetre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareMillimetre";
			definition = "Measure of a surface, one millimetre by one millimetre.";
			codeName = "SMIL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCMT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareCentimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SCMT_SquareCentimetre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareCentimetre";
			definition = "Measure of a surface, one centimetre by one centimetre.";
			codeName = "SCMT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HECT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hectare"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode HECT_Hectare = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Hectare";
			definition = "Unit of measure that is equal to 10, 000 square meters.";
			codeName = "HECT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SQKI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareKilometre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SQKI_SquareKilometre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareKilometre";
			definition = "Measure of a surface, one kilometre by one kilometre.";
			codeName = "SQKI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MILI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MilliLitre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MILI_MilliLitre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MilliLitre";
			definition = "Unit of volume that is equal to one thousandth of a litre.";
			codeName = "MILI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CELI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centilitre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode CELI_Centilitre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Centilitre";
			definition = "Unit of volume that is equal to one hundredth of a litre.";
			codeName = "CELI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LITR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Litre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode LITR_Litre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Litre";
			definition = "Unit of volume that is equal to a thousand cubic centimetres.";
			codeName = "LITR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUND"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pound"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode PUND_Pound = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pound";
			definition = "Unit of weight equal to 0.454 kilograms.";
			codeName = "PUND";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALOW"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Allowances"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode ALOW_Allowances = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Allowances";
			definition = "Amount of money deducted from a price or an amount due.";
			codeName = "ALOW";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCY"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountOfCurrency"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode ACCY_AmountOfCurrency = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountOfCurrency";
			definition = "Number of monetary units specified in a currency, where the unit of currency is explicit and compliant with ISO 4217.";
			codeName = "ACCY";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BARL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Barrels"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode BARL_Barrels = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Barrels";
			definition = "Unit of volume that is equal to 42 US gallons.";
			codeName = "BARL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCUF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillionCubicFeet"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode BCUF_BillionCubicFeet = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BillionCubicFeet";
			definition = "Unit of measure for large volumes of natural gas equivalent to 28316846 cubic meters.";
			codeName = "BCUF";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BDFT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardFeet"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode BDFT_BoardFeet = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BoardFeet";
			definition = "Measure of length equal to to 144 cubic inches.";
			codeName = "BDFT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUSL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bushels"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode BUSL_Bushels = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bushels";
			definition = "Unit of weight that is equal to 8 gallons. Mostly used for agricultural products with a specification of weight defined for each commodity differently.";
			codeName = "BUSL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CEER"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertifiedEmissionsReduction"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode CEER_CertifiedEmissionsReduction = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertifiedEmissionsReduction";
			definition = "Unit of emissions type (or carbon credits) issued by the Clean Development Mechanism (CDM) Executive Board for emission reductions achieved by CDM projects and verified by a DOE (Designated Operational Entity) under the rules of the Kyoto Protocol.";
			codeName = "CEER";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLRT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClimateReserveTonnes"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode CLRT_ClimateReserveTonnes = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClimateReserveTonnes";
			definition = "Unit of offset credits used by the Climate Action Reserve. One Climate Reserve Tonne is equal to one metric ton of Greenhouse Gas (GHG) reduced/sequestered.";
			codeName = "CLRT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBME"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicMeters"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode CBME_CubicMeters = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CubicMeters";
			definition = "Unit of volume that is equal to one metre in length, breadth and height or also equal to 1000 liter.";
			codeName = "CBME";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DAYS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Days"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode DAYS_Days = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Days";
			definition = "Unit of time that is equal to 24 hours.";
			codeName = "DAYS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DMET"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DryMetricTons"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode DMET_DryMetricTons = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DryMetricTons";
			definition = "Unit of weight that is equal to the same mass value as a metric ton excluding moisture.";
			codeName = "DMET";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENVC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnvironmentalCredit"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode ENVC_EnvironmentalCredit = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EnvironmentalCredit";
			definition = "Unit of measure for ownership of credit (or allowance) of carbon dioxyde emission (in metric ton).";
			codeName = "ENVC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENVO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnvironmentalOffset"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode ENVO_EnvironmentalOffset = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EnvironmentalOffset";
			definition = "Unit of measure for reduction of carbon dioxyde emission (in metric ton) that may result in Environmental Credit.";
			codeName = "ENVO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HUWG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hundredweight"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode HUWG_Hundredweight = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Hundredweight";
			definition = "Unit of weight or mass of various values in the Imperial Unit System also known as quintal, cental or centum.";
			codeName = "HUWG";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KWDC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattDayCapacity"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode KWDC_KilowattDayCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KilowattDayCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000 watt in one day.";
			codeName = "KWDC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KWHO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattHours"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode KWHO_KilowattHours = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KilowattHours";
			definition = "Unit of measure that is equal to the power consumption of one kilowatt during one hour.";
			codeName = "KWHO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KWHC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattHoursCapacity"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode KWHC_KilowattHoursCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KilowattHoursCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000 watt in one hour.";
			codeName = "KWHC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KMOC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattMinuteCapacity"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode KMOC_KilowattMinuteCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KilowattMinuteCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000 watt in one minute.";
			codeName = "KMOC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KWMC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattMonthCapacity"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode KWMC_KilowattMonthCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KilowattMonthCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000 watt in one month.";
			codeName = "KWMC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KWYC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattYearCapacity"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode KWYC_KilowattYearCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KilowattYearCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000 watt in one year.";
			codeName = "KWYC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MWDC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattDayCapacity"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MWDC_MegawattDayCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MegawattDayCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000000 watt in one day.";
			codeName = "MWDC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MWHO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattHours"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MWHO_MegawattHours = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MegawattHours";
			definition = "Unit of measure that is equal to the power consumption of one megawatt during one hour.";
			codeName = "MWHO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MWHC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattHoursCapacity"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MWHC_MegawattHoursCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MegawattHoursCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000000 watt in one hour.";
			codeName = "MWHC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MWMC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattMinuteCapacity"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MWMC_MegawattMinuteCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MegawattMinuteCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000000 watt in one minute.";
			codeName = "MWMC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MMOC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattMonthCapacity"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MMOC_MegawattMonthCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MegawattMonthCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000000 watt in one month.";
			codeName = "MMOC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MWYC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattYearCapacity"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MWYC_MegawattYearCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MegawattYearCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000000 watt in one year.";
			codeName = "MWYC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TONE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MetricTons"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode TONE_MetricTons = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MetricTons";
			definition = "Unit of mass equal to 1000 kilograms; equivalent to approximately 2,204.6 pounds, 1.102 short tons (US) or 0.984 long tons (imperial).";
			codeName = "TONE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MIBA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MillionBarrels"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MIBA_MillionBarrels = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MillionBarrels";
			definition = "Unit of volume that is equal to 1 million barrels equivalent to 42.000.000 US gallons.";
			codeName = "MIBA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MBTU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneMillionBTU"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MBTU_OneMillionBTU = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OneMillionBTU";
			definition = "Unit of measure of heat equal to one million British thermal unit (BTU).";
			codeName = "MBTU";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OZTR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TroyOunces"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode OZTR_TroyOunces = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TroyOunces";
			definition = "Unit of weight equal to 31.1034768 grams. Used in precious metals.";
			codeName = "OZTR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCWT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USHundredweight"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode UCWT_USHundredweight = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USHundredweight";
			definition = "Unit of weight or mass of various values in the US Customary System also known as quintal, cental or centum. Equal to 100 lbs.";
			codeName = "UCWT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPNT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexPoint"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode IPNT_IndexPoint = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexPoint";
			definition = "Decimal number used to calculate an amount or a price price.";
			codeName = "IPNT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PWRD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalWithRelationToDebtInstrument"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode PWRD_PrincipalWithRelationToDebtInstrument = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrincipalWithRelationToDebtInstrument";
			definition = "Amount of money borrowed, or part of that amount which remains unpaid (excluding interest).";
			codeName = "PWRD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DGEU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DieselGallonEquivalent"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode DGEU_DieselGallonEquivalent = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DieselGallonEquivalent";
			definition = "Amount of fuel alternative equal to one gallon of diesel.";
			codeName = "DGEU";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GGEU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GasolineGallonEquivalent"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GGEU_GasolineGallonEquivalent = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GasolineGallonEquivalent";
			definition = "Amount of fuel alternative equal to one gallon of gasoline.";
			codeName = "GGEU";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOCD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TonsOfCarbonDioxide"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode TOCD_TonsOfCarbonDioxide = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TonsOfCarbonDioxide";
			definition = "Tons of carbon dioxide.";
			codeName = "TOCD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHAS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Shares"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SHAS_Shares = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Shares";
			definition = "Financial instrument that gives the owner right to dividends paid by a company and the most junior claim on the companies assets in the event of a bankruptcy.";
			codeName = "SHAS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THMS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Therms"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode THMS_Therms = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Therms";
			definition = "Unit of heat, often used a unit of measure for natural gas in the UK.";
			codeName = "THMS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Future"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode FUTU_Future = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Future";
			definition = "Exchange traded contract that defines an agreement to buy specific quantities of a commodity or financial instrument at an agreed time in the future.";
			codeName = "FUTU";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GWHO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GigawattHours"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GWHO_GigawattHours = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GigawattHours";
			definition = "Unit of measure that is equal to the power consumption of one Gigawatt during one hour.";
			codeName = "GWHO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRTU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BritishThermalUnit"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode BRTU_BritishThermalUnit = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BritishThermalUnit";
			definition = "Unit of measure of heat required to raise the temperature of one pound of water by one degree Fahrenheit.";
			codeName = "BRTU";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOTS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lot"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode LOTS_Lot = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lot";
			definition = "Indication of the unit of measurement.";
			codeName = "LOTS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BAGG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bag"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode BAGG_Bag = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bag";
			definition = "Code for a bag.";
			codeName = "BAGG";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BALE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bale"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode BALE_Bale = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bale";
			definition = "Code for a bale.";
			codeName = "BALE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOTL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bottle"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode BOTL_Bottle = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bottle";
			definition = "Code for a bottle.";
			codeName = "BOTL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOXX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Box"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode BOXX_Box = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Box";
			definition = "Code for a box.";
			codeName = "BOXX";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Carton"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode CRTN_Carton = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Carton";
			definition = "Code for a carton.";
			codeName = "CRTN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNTR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Container"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode CNTR_Container = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Container";
			definition = "Code for a container.";
			codeName = "CNTR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRAT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Crate"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode CRAT_Crate = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Crate";
			definition = "Code for a crate.";
			codeName = "CRAT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicInch"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode CBIN_CubicInch = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicInch";
			definition = "Measure of a volume, one inch by one inch by one inch.";
			codeName = "CBIN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBML"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicMillimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode CBML_CubicMillimetre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicMillimetre";
			definition = "Unit of volume that is equal to one thousandth of a litre.";
			codeName = "CBML";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBFO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBFuildOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GBFO_GBFuildOunce = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBFuildOunce";
			definition = "Unit of volume equal to 2, 841 306 centilitre.";
			codeName = "GBFO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBTN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBTon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GBTN_GBTon = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBTon";
			definition = "Measure of weight, in Britain 2240 lb (long ton).";
			codeName = "GBTN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USBA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USBarrel"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode USBA_USBarrel = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USBarrel";
			definition = "Unit of volume equal to 158, 9873 litre.";
			codeName = "USBA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USFO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USFluidOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode USFO_USFluidOunce = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USFluidOunce";
			definition = "Unit of volume equal to 2, 957353 centilitre.";
			codeName = "USFO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USTN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode USTN_USTon = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTon";
			definition = "Measure of weight, in the US 2000 lb (short ton).";
			codeName = "USTN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, UnitOfMeasureCode> codesByName = new LinkedHashMap<>();

	protected UnitOfMeasureCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("KILO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnitOfMeasureCode";
				definition = "Identifies the unit of measure by means of a code.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(UnitOfMeasure1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.UnitOfMeasureCode.KILO_Kilogram, com.tools20022.repository.codeset.UnitOfMeasureCode.PIEC_Piece,
						com.tools20022.repository.codeset.UnitOfMeasureCode.TONS_Ton, com.tools20022.repository.codeset.UnitOfMeasureCode.METR_Metre, com.tools20022.repository.codeset.UnitOfMeasureCode.INCH_Inch,
						com.tools20022.repository.codeset.UnitOfMeasureCode.YARD_Yard, com.tools20022.repository.codeset.UnitOfMeasureCode.GBGA_GBGallon, com.tools20022.repository.codeset.UnitOfMeasureCode.GRAM_Gram,
						com.tools20022.repository.codeset.UnitOfMeasureCode.CMET_Centimetre, com.tools20022.repository.codeset.UnitOfMeasureCode.SMET_SquareMetre, com.tools20022.repository.codeset.UnitOfMeasureCode.FOOT_Foot,
						com.tools20022.repository.codeset.UnitOfMeasureCode.MILE_Mile, com.tools20022.repository.codeset.UnitOfMeasureCode.SQIN_SquareInch, com.tools20022.repository.codeset.UnitOfMeasureCode.SQFO_SquareFoot,
						com.tools20022.repository.codeset.UnitOfMeasureCode.SQMI_SquareMile, com.tools20022.repository.codeset.UnitOfMeasureCode.GBOU_GBOunce, com.tools20022.repository.codeset.UnitOfMeasureCode.USOU_USOunce,
						com.tools20022.repository.codeset.UnitOfMeasureCode.GBPI_GBPint, com.tools20022.repository.codeset.UnitOfMeasureCode.USPI_USPint, com.tools20022.repository.codeset.UnitOfMeasureCode.GBQA_GBQuart,
						com.tools20022.repository.codeset.UnitOfMeasureCode.USQA_USQuart, com.tools20022.repository.codeset.UnitOfMeasureCode.USGA_USGallon, com.tools20022.repository.codeset.UnitOfMeasureCode.MMET_Millimetre,
						com.tools20022.repository.codeset.UnitOfMeasureCode.KMET_Kilometre, com.tools20022.repository.codeset.UnitOfMeasureCode.SQYA_SquareYard, com.tools20022.repository.codeset.UnitOfMeasureCode.ACRE_Acre,
						com.tools20022.repository.codeset.UnitOfMeasureCode.ARES_Are, com.tools20022.repository.codeset.UnitOfMeasureCode.SMIL_SquareMillimetre, com.tools20022.repository.codeset.UnitOfMeasureCode.SCMT_SquareCentimetre,
						com.tools20022.repository.codeset.UnitOfMeasureCode.HECT_Hectare, com.tools20022.repository.codeset.UnitOfMeasureCode.SQKI_SquareKilometre, com.tools20022.repository.codeset.UnitOfMeasureCode.MILI_MilliLitre,
						com.tools20022.repository.codeset.UnitOfMeasureCode.CELI_Centilitre, com.tools20022.repository.codeset.UnitOfMeasureCode.LITR_Litre, com.tools20022.repository.codeset.UnitOfMeasureCode.PUND_Pound,
						com.tools20022.repository.codeset.UnitOfMeasureCode.ALOW_Allowances, com.tools20022.repository.codeset.UnitOfMeasureCode.ACCY_AmountOfCurrency, com.tools20022.repository.codeset.UnitOfMeasureCode.BARL_Barrels,
						com.tools20022.repository.codeset.UnitOfMeasureCode.BCUF_BillionCubicFeet, com.tools20022.repository.codeset.UnitOfMeasureCode.BDFT_BoardFeet, com.tools20022.repository.codeset.UnitOfMeasureCode.BUSL_Bushels,
						com.tools20022.repository.codeset.UnitOfMeasureCode.CEER_CertifiedEmissionsReduction, com.tools20022.repository.codeset.UnitOfMeasureCode.CLRT_ClimateReserveTonnes,
						com.tools20022.repository.codeset.UnitOfMeasureCode.CBME_CubicMeters, com.tools20022.repository.codeset.UnitOfMeasureCode.DAYS_Days, com.tools20022.repository.codeset.UnitOfMeasureCode.DMET_DryMetricTons,
						com.tools20022.repository.codeset.UnitOfMeasureCode.ENVC_EnvironmentalCredit, com.tools20022.repository.codeset.UnitOfMeasureCode.ENVO_EnvironmentalOffset,
						com.tools20022.repository.codeset.UnitOfMeasureCode.HUWG_Hundredweight, com.tools20022.repository.codeset.UnitOfMeasureCode.KWDC_KilowattDayCapacity,
						com.tools20022.repository.codeset.UnitOfMeasureCode.KWHO_KilowattHours, com.tools20022.repository.codeset.UnitOfMeasureCode.KWHC_KilowattHoursCapacity,
						com.tools20022.repository.codeset.UnitOfMeasureCode.KMOC_KilowattMinuteCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.KWMC_KilowattMonthCapacity,
						com.tools20022.repository.codeset.UnitOfMeasureCode.KWYC_KilowattYearCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.MWDC_MegawattDayCapacity,
						com.tools20022.repository.codeset.UnitOfMeasureCode.MWHO_MegawattHours, com.tools20022.repository.codeset.UnitOfMeasureCode.MWHC_MegawattHoursCapacity,
						com.tools20022.repository.codeset.UnitOfMeasureCode.MWMC_MegawattMinuteCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.MMOC_MegawattMonthCapacity,
						com.tools20022.repository.codeset.UnitOfMeasureCode.MWYC_MegawattYearCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.TONE_MetricTons,
						com.tools20022.repository.codeset.UnitOfMeasureCode.MIBA_MillionBarrels, com.tools20022.repository.codeset.UnitOfMeasureCode.MBTU_OneMillionBTU, com.tools20022.repository.codeset.UnitOfMeasureCode.OZTR_TroyOunces,
						com.tools20022.repository.codeset.UnitOfMeasureCode.UCWT_USHundredweight, com.tools20022.repository.codeset.UnitOfMeasureCode.IPNT_IndexPoint,
						com.tools20022.repository.codeset.UnitOfMeasureCode.PWRD_PrincipalWithRelationToDebtInstrument, com.tools20022.repository.codeset.UnitOfMeasureCode.DGEU_DieselGallonEquivalent,
						com.tools20022.repository.codeset.UnitOfMeasureCode.GGEU_GasolineGallonEquivalent, com.tools20022.repository.codeset.UnitOfMeasureCode.TOCD_TonsOfCarbonDioxide,
						com.tools20022.repository.codeset.UnitOfMeasureCode.SHAS_Shares, com.tools20022.repository.codeset.UnitOfMeasureCode.THMS_Therms, com.tools20022.repository.codeset.UnitOfMeasureCode.FUTU_Future,
						com.tools20022.repository.codeset.UnitOfMeasureCode.GWHO_GigawattHours, com.tools20022.repository.codeset.UnitOfMeasureCode.BRTU_BritishThermalUnit, com.tools20022.repository.codeset.UnitOfMeasureCode.LOTS_Lot,
						com.tools20022.repository.codeset.UnitOfMeasureCode.BAGG_Bag, com.tools20022.repository.codeset.UnitOfMeasureCode.BALE_Bale, com.tools20022.repository.codeset.UnitOfMeasureCode.BOTL_Bottle,
						com.tools20022.repository.codeset.UnitOfMeasureCode.BOXX_Box, com.tools20022.repository.codeset.UnitOfMeasureCode.CRTN_Carton, com.tools20022.repository.codeset.UnitOfMeasureCode.CNTR_Container,
						com.tools20022.repository.codeset.UnitOfMeasureCode.CRAT_Crate, com.tools20022.repository.codeset.UnitOfMeasureCode.CBIN_CubicInch, com.tools20022.repository.codeset.UnitOfMeasureCode.CBML_CubicMillimetre,
						com.tools20022.repository.codeset.UnitOfMeasureCode.GBFO_GBFuildOunce, com.tools20022.repository.codeset.UnitOfMeasureCode.GBTN_GBTon, com.tools20022.repository.codeset.UnitOfMeasureCode.USBA_USBarrel,
						com.tools20022.repository.codeset.UnitOfMeasureCode.USFO_USFluidOunce, com.tools20022.repository.codeset.UnitOfMeasureCode.USTN_USTon));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(KILO_Kilogram.getCodeName().get(), KILO_Kilogram);
		codesByName.put(PIEC_Piece.getCodeName().get(), PIEC_Piece);
		codesByName.put(TONS_Ton.getCodeName().get(), TONS_Ton);
		codesByName.put(METR_Metre.getCodeName().get(), METR_Metre);
		codesByName.put(INCH_Inch.getCodeName().get(), INCH_Inch);
		codesByName.put(YARD_Yard.getCodeName().get(), YARD_Yard);
		codesByName.put(GBGA_GBGallon.getCodeName().get(), GBGA_GBGallon);
		codesByName.put(GRAM_Gram.getCodeName().get(), GRAM_Gram);
		codesByName.put(CMET_Centimetre.getCodeName().get(), CMET_Centimetre);
		codesByName.put(SMET_SquareMetre.getCodeName().get(), SMET_SquareMetre);
		codesByName.put(FOOT_Foot.getCodeName().get(), FOOT_Foot);
		codesByName.put(MILE_Mile.getCodeName().get(), MILE_Mile);
		codesByName.put(SQIN_SquareInch.getCodeName().get(), SQIN_SquareInch);
		codesByName.put(SQFO_SquareFoot.getCodeName().get(), SQFO_SquareFoot);
		codesByName.put(SQMI_SquareMile.getCodeName().get(), SQMI_SquareMile);
		codesByName.put(GBOU_GBOunce.getCodeName().get(), GBOU_GBOunce);
		codesByName.put(USOU_USOunce.getCodeName().get(), USOU_USOunce);
		codesByName.put(GBPI_GBPint.getCodeName().get(), GBPI_GBPint);
		codesByName.put(USPI_USPint.getCodeName().get(), USPI_USPint);
		codesByName.put(GBQA_GBQuart.getCodeName().get(), GBQA_GBQuart);
		codesByName.put(USQA_USQuart.getCodeName().get(), USQA_USQuart);
		codesByName.put(USGA_USGallon.getCodeName().get(), USGA_USGallon);
		codesByName.put(MMET_Millimetre.getCodeName().get(), MMET_Millimetre);
		codesByName.put(KMET_Kilometre.getCodeName().get(), KMET_Kilometre);
		codesByName.put(SQYA_SquareYard.getCodeName().get(), SQYA_SquareYard);
		codesByName.put(ACRE_Acre.getCodeName().get(), ACRE_Acre);
		codesByName.put(ARES_Are.getCodeName().get(), ARES_Are);
		codesByName.put(SMIL_SquareMillimetre.getCodeName().get(), SMIL_SquareMillimetre);
		codesByName.put(SCMT_SquareCentimetre.getCodeName().get(), SCMT_SquareCentimetre);
		codesByName.put(HECT_Hectare.getCodeName().get(), HECT_Hectare);
		codesByName.put(SQKI_SquareKilometre.getCodeName().get(), SQKI_SquareKilometre);
		codesByName.put(MILI_MilliLitre.getCodeName().get(), MILI_MilliLitre);
		codesByName.put(CELI_Centilitre.getCodeName().get(), CELI_Centilitre);
		codesByName.put(LITR_Litre.getCodeName().get(), LITR_Litre);
		codesByName.put(PUND_Pound.getCodeName().get(), PUND_Pound);
		codesByName.put(ALOW_Allowances.getCodeName().get(), ALOW_Allowances);
		codesByName.put(ACCY_AmountOfCurrency.getCodeName().get(), ACCY_AmountOfCurrency);
		codesByName.put(BARL_Barrels.getCodeName().get(), BARL_Barrels);
		codesByName.put(BCUF_BillionCubicFeet.getCodeName().get(), BCUF_BillionCubicFeet);
		codesByName.put(BDFT_BoardFeet.getCodeName().get(), BDFT_BoardFeet);
		codesByName.put(BUSL_Bushels.getCodeName().get(), BUSL_Bushels);
		codesByName.put(CEER_CertifiedEmissionsReduction.getCodeName().get(), CEER_CertifiedEmissionsReduction);
		codesByName.put(CLRT_ClimateReserveTonnes.getCodeName().get(), CLRT_ClimateReserveTonnes);
		codesByName.put(CBME_CubicMeters.getCodeName().get(), CBME_CubicMeters);
		codesByName.put(DAYS_Days.getCodeName().get(), DAYS_Days);
		codesByName.put(DMET_DryMetricTons.getCodeName().get(), DMET_DryMetricTons);
		codesByName.put(ENVC_EnvironmentalCredit.getCodeName().get(), ENVC_EnvironmentalCredit);
		codesByName.put(ENVO_EnvironmentalOffset.getCodeName().get(), ENVO_EnvironmentalOffset);
		codesByName.put(HUWG_Hundredweight.getCodeName().get(), HUWG_Hundredweight);
		codesByName.put(KWDC_KilowattDayCapacity.getCodeName().get(), KWDC_KilowattDayCapacity);
		codesByName.put(KWHO_KilowattHours.getCodeName().get(), KWHO_KilowattHours);
		codesByName.put(KWHC_KilowattHoursCapacity.getCodeName().get(), KWHC_KilowattHoursCapacity);
		codesByName.put(KMOC_KilowattMinuteCapacity.getCodeName().get(), KMOC_KilowattMinuteCapacity);
		codesByName.put(KWMC_KilowattMonthCapacity.getCodeName().get(), KWMC_KilowattMonthCapacity);
		codesByName.put(KWYC_KilowattYearCapacity.getCodeName().get(), KWYC_KilowattYearCapacity);
		codesByName.put(MWDC_MegawattDayCapacity.getCodeName().get(), MWDC_MegawattDayCapacity);
		codesByName.put(MWHO_MegawattHours.getCodeName().get(), MWHO_MegawattHours);
		codesByName.put(MWHC_MegawattHoursCapacity.getCodeName().get(), MWHC_MegawattHoursCapacity);
		codesByName.put(MWMC_MegawattMinuteCapacity.getCodeName().get(), MWMC_MegawattMinuteCapacity);
		codesByName.put(MMOC_MegawattMonthCapacity.getCodeName().get(), MMOC_MegawattMonthCapacity);
		codesByName.put(MWYC_MegawattYearCapacity.getCodeName().get(), MWYC_MegawattYearCapacity);
		codesByName.put(TONE_MetricTons.getCodeName().get(), TONE_MetricTons);
		codesByName.put(MIBA_MillionBarrels.getCodeName().get(), MIBA_MillionBarrels);
		codesByName.put(MBTU_OneMillionBTU.getCodeName().get(), MBTU_OneMillionBTU);
		codesByName.put(OZTR_TroyOunces.getCodeName().get(), OZTR_TroyOunces);
		codesByName.put(UCWT_USHundredweight.getCodeName().get(), UCWT_USHundredweight);
		codesByName.put(IPNT_IndexPoint.getCodeName().get(), IPNT_IndexPoint);
		codesByName.put(PWRD_PrincipalWithRelationToDebtInstrument.getCodeName().get(), PWRD_PrincipalWithRelationToDebtInstrument);
		codesByName.put(DGEU_DieselGallonEquivalent.getCodeName().get(), DGEU_DieselGallonEquivalent);
		codesByName.put(GGEU_GasolineGallonEquivalent.getCodeName().get(), GGEU_GasolineGallonEquivalent);
		codesByName.put(TOCD_TonsOfCarbonDioxide.getCodeName().get(), TOCD_TonsOfCarbonDioxide);
		codesByName.put(SHAS_Shares.getCodeName().get(), SHAS_Shares);
		codesByName.put(THMS_Therms.getCodeName().get(), THMS_Therms);
		codesByName.put(FUTU_Future.getCodeName().get(), FUTU_Future);
		codesByName.put(GWHO_GigawattHours.getCodeName().get(), GWHO_GigawattHours);
		codesByName.put(BRTU_BritishThermalUnit.getCodeName().get(), BRTU_BritishThermalUnit);
		codesByName.put(LOTS_Lot.getCodeName().get(), LOTS_Lot);
		codesByName.put(BAGG_Bag.getCodeName().get(), BAGG_Bag);
		codesByName.put(BALE_Bale.getCodeName().get(), BALE_Bale);
		codesByName.put(BOTL_Bottle.getCodeName().get(), BOTL_Bottle);
		codesByName.put(BOXX_Box.getCodeName().get(), BOXX_Box);
		codesByName.put(CRTN_Carton.getCodeName().get(), CRTN_Carton);
		codesByName.put(CNTR_Container.getCodeName().get(), CNTR_Container);
		codesByName.put(CRAT_Crate.getCodeName().get(), CRAT_Crate);
		codesByName.put(CBIN_CubicInch.getCodeName().get(), CBIN_CubicInch);
		codesByName.put(CBML_CubicMillimetre.getCodeName().get(), CBML_CubicMillimetre);
		codesByName.put(GBFO_GBFuildOunce.getCodeName().get(), GBFO_GBFuildOunce);
		codesByName.put(GBTN_GBTon.getCodeName().get(), GBTN_GBTon);
		codesByName.put(USBA_USBarrel.getCodeName().get(), USBA_USBarrel);
		codesByName.put(USFO_USFluidOunce.getCodeName().get(), USFO_USFluidOunce);
		codesByName.put(USTN_USTon.getCodeName().get(), USTN_USTon);
	}

	public static UnitOfMeasureCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnitOfMeasureCode[] values() {
		UnitOfMeasureCode[] values = new UnitOfMeasureCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnitOfMeasureCode> {
		@Override
		public UnitOfMeasureCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnitOfMeasureCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}