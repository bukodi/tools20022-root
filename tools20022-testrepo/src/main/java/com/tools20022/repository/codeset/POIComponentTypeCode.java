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
import com.tools20022.repository.codeset.POIComponentTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Generic component type belonging to a POI (Point of Interaction) Terminal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#SOFT_Soft
 * POIComponentTypeCode.SOFT_Soft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#EMVK_EMVKernel
 * POIComponentTypeCode.EMVK_EMVKernel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#EMVO_EMVLevel1
 * POIComponentTypeCode.EMVO_EMVLevel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#MRIT_MerchantInterface
 * POIComponentTypeCode.MRIT_MerchantInterface}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#CHIT_CardholderInterface
 * POIComponentTypeCode.CHIT_CardholderInterface}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#SECM_SecureModule
 * POIComponentTypeCode.SECM_SecureModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#PEDV_PINEntryDevice
 * POIComponentTypeCode.PEDV_PINEntryDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#AQPR_AcquirerParameters
 * POIComponentTypeCode.AQPR_AcquirerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#MRPR_MerchantParameters
 * POIComponentTypeCode.MRPR_MerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#VDPR_VendorParameters
 * POIComponentTypeCode.VDPR_VendorParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#AQPP_AcquirerProtocolParameters
 * POIComponentTypeCode.AQPP_AcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#APPR_ApplicationParameters
 * POIComponentTypeCode.APPR_ApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#DVCE_Device
 * POIComponentTypeCode.DVCE_Device}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#DRVR_Driver
 * POIComponentTypeCode.DRVR_Driver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#MDWR_Middleware
 * POIComponentTypeCode.MDWR_Middleware}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#OPST_OperatingSystem
 * POIComponentTypeCode.OPST_OperatingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#APLI_PaymentApplication
 * POIComponentTypeCode.APLI_PaymentApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#SCPR_SecurityParameters
 * POIComponentTypeCode.SCPR_SecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#SERV_Server
 * POIComponentTypeCode.SERV_Server}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#TERM_Terminal
 * POIComponentTypeCode.TERM_Terminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#TLPR_TerminalParameters
 * POIComponentTypeCode.TLPR_TerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#CRTF_CertificateParameters
 * POIComponentTypeCode.CRTF_CertificateParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#TMSP_TMSProtocolParameters
 * POIComponentTypeCode.TMSP_TMSProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#SAPR_SaleToPOIProtocolParameters
 * POIComponentTypeCode.SAPR_SaleToPOIProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#SACP_SaleComponent
 * POIComponentTypeCode.SACP_SaleComponent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.POIComponentType1Code
 * POIComponentType1Code}</li>
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
 * <li>"SOFT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "POIComponentTypeCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class POIComponentTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOFT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Soft"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode SOFT_Soft = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Soft";
			definition = "Payment or other software application.";
			codeName = "SOFT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMVK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVKernel"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode EMVK_EMVKernel = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EMVKernel";
			definition = "EMV application kernel (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa).";
			codeName = "EMVK";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMVO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVLevel1"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode EMVO_EMVLevel1 = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EMVLevel1";
			definition = "EMV physical interface (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa).";
			codeName = "EMVO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRIT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantInterface"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode MRIT_MerchantInterface = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantInterface";
			definition = "Merchant interface.";
			codeName = "MRIT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHIT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderInterface"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode CHIT_CardholderInterface = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardholderInterface";
			definition = "Cardholder Interface.";
			codeName = "CHIT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureModule"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode SECM_SecureModule = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecureModule";
			definition = "Security module.";
			codeName = "SECM";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEDV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINEntryDevice"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode PEDV_PINEntryDevice = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PINEntryDevice";
			definition = "Personal identification number (or PIN) entry device (PED).";
			codeName = "PEDV";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AQPR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerParameters"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode AQPR_AcquirerParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcquirerParameters";
			definition = "Acquirer specific configuration parameters for the point of interaction (POI) system.";
			codeName = "AQPR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRPR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode MRPR_MerchantParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantParameters";
			definition = "Merchant configuration parameters for the point of interaction (POI).";
			codeName = "MRPR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VDPR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorParameters"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode VDPR_VendorParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VendorParameters";
			definition = "Point of interaction parameters defined by the manufacturer for instance the PIN verification capabilities.";
			codeName = "VDPR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AQPP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerProtocolParameters"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode AQPP_AcquirerProtocolParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcquirerProtocolParameters";
			definition = "Parameters for acquirer interface of the point of interaction, including acquirer host configuration parameters.";
			codeName = "AQPP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APPR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode APPR_ApplicationParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicationParameters";
			definition = "Parameters of a payment application running on the point of interaction.";
			codeName = "APPR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVCE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Device"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode DVCE_Device = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Device";
			definition = "Device sub-component of a component of the point of interaction.";
			codeName = "DVCE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRVR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Driver"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode DRVR_Driver = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Driver";
			definition = "Driver module of the point of interaction.";
			codeName = "DRVR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MDWR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Middleware"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode MDWR_Middleware = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Middleware";
			definition = "Software module of the point of interaction.";
			codeName = "MDWR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPST"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperatingSystem"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode OPST_OperatingSystem = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OperatingSystem";
			definition = "Software that manages hardware to provide common services to the applications.";
			codeName = "OPST";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APLI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentApplication"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode APLI_PaymentApplication = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentApplication";
			definition = "Payment application software.";
			codeName = "APLI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCPR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityParameters"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode SCPR_SecurityParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityParameters";
			definition = "Security parameters of the point of interaction.";
			codeName = "SCPR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SERV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Server"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode SERV_Server = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Server";
			definition = "Payment server of a point of interaction system.";
			codeName = "SERV";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TERM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Terminal"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode TERM_Terminal = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Terminal";
			definition = "Payment terminal point of interaction.";
			codeName = "TERM";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TLPR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode TLPR_TerminalParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalParameters";
			definition = "Manufacturer configuration parameters of the point of interaction.";
			codeName = "TLPR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateParameters"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode CRTF_CertificateParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateParameters";
			definition = "Certificate provided by a terminal manager.";
			codeName = "CRTF";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TMSP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocolParameters"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode TMSP_TMSProtocolParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolParameters";
			definition = "Configuration parameters for the TMS protocol.";
			codeName = "TMSP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAPR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleToPOIProtocolParameters"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode SAPR_SaleToPOIProtocolParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleToPOIProtocolParameters";
			definition = "Parameters related to the Sale to POI protocol.";
			codeName = "SAPR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SACP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleComponent"</li>
	 * </ul>
	 */
	public static final POIComponentTypeCode SACP_SaleComponent = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleComponent";
			definition = "Component of the Sale system.";
			codeName = "SACP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, POIComponentTypeCode> codesByName = new LinkedHashMap<>();

	protected POIComponentTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("SOFT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "POIComponentTypeCode";
				definition = "Generic component type belonging to a POI (Point of Interaction) Terminal.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(POIComponentType1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.POIComponentTypeCode.SOFT_Soft, com.tools20022.repository.codeset.POIComponentTypeCode.EMVK_EMVKernel,
						com.tools20022.repository.codeset.POIComponentTypeCode.EMVO_EMVLevel1, com.tools20022.repository.codeset.POIComponentTypeCode.MRIT_MerchantInterface,
						com.tools20022.repository.codeset.POIComponentTypeCode.CHIT_CardholderInterface, com.tools20022.repository.codeset.POIComponentTypeCode.SECM_SecureModule,
						com.tools20022.repository.codeset.POIComponentTypeCode.PEDV_PINEntryDevice, com.tools20022.repository.codeset.POIComponentTypeCode.AQPR_AcquirerParameters,
						com.tools20022.repository.codeset.POIComponentTypeCode.MRPR_MerchantParameters, com.tools20022.repository.codeset.POIComponentTypeCode.VDPR_VendorParameters,
						com.tools20022.repository.codeset.POIComponentTypeCode.AQPP_AcquirerProtocolParameters, com.tools20022.repository.codeset.POIComponentTypeCode.APPR_ApplicationParameters,
						com.tools20022.repository.codeset.POIComponentTypeCode.DVCE_Device, com.tools20022.repository.codeset.POIComponentTypeCode.DRVR_Driver, com.tools20022.repository.codeset.POIComponentTypeCode.MDWR_Middleware,
						com.tools20022.repository.codeset.POIComponentTypeCode.OPST_OperatingSystem, com.tools20022.repository.codeset.POIComponentTypeCode.APLI_PaymentApplication,
						com.tools20022.repository.codeset.POIComponentTypeCode.SCPR_SecurityParameters, com.tools20022.repository.codeset.POIComponentTypeCode.SERV_Server,
						com.tools20022.repository.codeset.POIComponentTypeCode.TERM_Terminal, com.tools20022.repository.codeset.POIComponentTypeCode.TLPR_TerminalParameters,
						com.tools20022.repository.codeset.POIComponentTypeCode.CRTF_CertificateParameters, com.tools20022.repository.codeset.POIComponentTypeCode.TMSP_TMSProtocolParameters,
						com.tools20022.repository.codeset.POIComponentTypeCode.SAPR_SaleToPOIProtocolParameters, com.tools20022.repository.codeset.POIComponentTypeCode.SACP_SaleComponent));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SOFT_Soft.getCodeName().get(), SOFT_Soft);
		codesByName.put(EMVK_EMVKernel.getCodeName().get(), EMVK_EMVKernel);
		codesByName.put(EMVO_EMVLevel1.getCodeName().get(), EMVO_EMVLevel1);
		codesByName.put(MRIT_MerchantInterface.getCodeName().get(), MRIT_MerchantInterface);
		codesByName.put(CHIT_CardholderInterface.getCodeName().get(), CHIT_CardholderInterface);
		codesByName.put(SECM_SecureModule.getCodeName().get(), SECM_SecureModule);
		codesByName.put(PEDV_PINEntryDevice.getCodeName().get(), PEDV_PINEntryDevice);
		codesByName.put(AQPR_AcquirerParameters.getCodeName().get(), AQPR_AcquirerParameters);
		codesByName.put(MRPR_MerchantParameters.getCodeName().get(), MRPR_MerchantParameters);
		codesByName.put(VDPR_VendorParameters.getCodeName().get(), VDPR_VendorParameters);
		codesByName.put(AQPP_AcquirerProtocolParameters.getCodeName().get(), AQPP_AcquirerProtocolParameters);
		codesByName.put(APPR_ApplicationParameters.getCodeName().get(), APPR_ApplicationParameters);
		codesByName.put(DVCE_Device.getCodeName().get(), DVCE_Device);
		codesByName.put(DRVR_Driver.getCodeName().get(), DRVR_Driver);
		codesByName.put(MDWR_Middleware.getCodeName().get(), MDWR_Middleware);
		codesByName.put(OPST_OperatingSystem.getCodeName().get(), OPST_OperatingSystem);
		codesByName.put(APLI_PaymentApplication.getCodeName().get(), APLI_PaymentApplication);
		codesByName.put(SCPR_SecurityParameters.getCodeName().get(), SCPR_SecurityParameters);
		codesByName.put(SERV_Server.getCodeName().get(), SERV_Server);
		codesByName.put(TERM_Terminal.getCodeName().get(), TERM_Terminal);
		codesByName.put(TLPR_TerminalParameters.getCodeName().get(), TLPR_TerminalParameters);
		codesByName.put(CRTF_CertificateParameters.getCodeName().get(), CRTF_CertificateParameters);
		codesByName.put(TMSP_TMSProtocolParameters.getCodeName().get(), TMSP_TMSProtocolParameters);
		codesByName.put(SAPR_SaleToPOIProtocolParameters.getCodeName().get(), SAPR_SaleToPOIProtocolParameters);
		codesByName.put(SACP_SaleComponent.getCodeName().get(), SACP_SaleComponent);
	}

	public static POIComponentTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static POIComponentTypeCode[] values() {
		POIComponentTypeCode[] values = new POIComponentTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, POIComponentTypeCode> {
		@Override
		public POIComponentTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(POIComponentTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}