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
import com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Cardholder verification capabilities of the POI (Personal Identification
 * Number) performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#MNSG_ManualSignature
 * CardholderVerificationCapabilityCode.MNSG_ManualSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#NPIN_OnLinePIN
 * CardholderVerificationCapabilityCode.NPIN_OnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#FCPN_OfflinePINClear
 * CardholderVerificationCapabilityCode.FCPN_OfflinePINClear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#FEPN_OfflinePINEncrypted
 * CardholderVerificationCapabilityCode.FEPN_OfflinePINEncrypted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#FDSG_OfflineDigitalSignature
 * CardholderVerificationCapabilityCode.FDSG_OfflineDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#FBIO_OfflineBiometrics
 * CardholderVerificationCapabilityCode.FBIO_OfflineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#MNVR_ManualVerification
 * CardholderVerificationCapabilityCode.MNVR_ManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#FBIG_OfflineBiographics
 * CardholderVerificationCapabilityCode.FBIG_OfflineBiographics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#APKI_AccountDigitalSignature
 * CardholderVerificationCapabilityCode.APKI_AccountDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#PKIS_PKISignature
 * CardholderVerificationCapabilityCode.PKIS_PKISignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#CHDT_CardholderData
 * CardholderVerificationCapabilityCode.CHDT_CardholderData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#SCEC_SecureElectronicCommerce
 * CardholderVerificationCapabilityCode.SCEC_SecureElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#UNKW_Unknown
 * CardholderVerificationCapabilityCode.UNKW_Unknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#PCOD_PersonalCode
 * CardholderVerificationCapabilityCode.PCOD_PersonalCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#NOVF_NoCapabilities
 * CardholderVerificationCapabilityCode.NOVF_NoCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#NBIO_OnLineBiometrics
 * CardholderVerificationCapabilityCode.NBIO_OnLineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#OTHR_Other
 * CardholderVerificationCapabilityCode.OTHR_Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
 * CardholderVerificationCapability1Code}</li>
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
 * <li>"MNSG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardholderVerificationCapabilityCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardholderVerificationCapabilityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNSG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualSignature"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode MNSG_ManualSignature = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManualSignature";
			definition = "Manual signature verification.";
			codeName = "MNSG";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode NPIN_OnLinePIN = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnLinePIN";
			definition = "Online PIN (Personal Identification Number).";
			codeName = "NPIN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCPN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePINClear"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode FCPN_OfflinePINClear = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfflinePINClear";
			definition = "Offline PIN in clear (Personal Identification Number).";
			codeName = "FCPN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEPN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePINEncrypted"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode FEPN_OfflinePINEncrypted = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfflinePINEncrypted";
			definition = "Offline PIN encrypted (Personal Identification Number).";
			codeName = "FEPN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FDSG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineDigitalSignature"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode FDSG_OfflineDigitalSignature = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfflineDigitalSignature";
			definition = "Offline digital signature analysis.";
			codeName = "FDSG";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FBIO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineBiometrics"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode FBIO_OfflineBiometrics = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfflineBiometrics";
			definition = "Offline biometrics.";
			codeName = "FBIO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNVR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualVerification"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode MNVR_ManualVerification = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManualVerification";
			definition = "Other manual verification, for example passport or drivers license.";
			codeName = "MNVR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FBIG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineBiographics"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode FBIG_OfflineBiographics = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfflineBiographics";
			definition = "Offline biographics.";
			codeName = "FBIG";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APKI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDigitalSignature"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode APKI_AccountDigitalSignature = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountDigitalSignature";
			definition = "Account based digital signature.";
			codeName = "APKI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PKIS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PKISignature"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode PKIS_PKISignature = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PKISignature";
			definition = "PKI (Public Key Infrastructure) based digital signature.";
			codeName = "PKIS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHDT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderData"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode CHDT_CardholderData = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardholderData";
			definition = "Cardholder authentication data.";
			codeName = "CHDT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCEC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureElectronicCommerce"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode SCEC_SecureElectronicCommerce = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecureElectronicCommerce";
			definition = "Three domain secure (three domain secure authentication of the cardholder).";
			codeName = "SCEC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode UNKW_Unknown = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "Unknown cardholder verification capability.";
			codeName = "UNKW";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCOD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonalCode"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode PCOD_PersonalCode = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonalCode";
			definition = "Personal code of the customer for banking services.";
			codeName = "PCOD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOVF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCapabilities"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode NOVF_NoCapabilities = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCapabilities";
			definition = "No cardholder verification capability.";
			codeName = "NOVF";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NBIO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineBiometrics"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode NBIO_OnLineBiometrics = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineBiometrics";
			definition = "Online biometrics.";
			codeName = "NBIO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapabilityCode OTHR_Other = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other cardholder verification capabilities.";
			codeName = "OTHR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, CardholderVerificationCapabilityCode> codesByName = new LinkedHashMap<>();

	protected CardholderVerificationCapabilityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("MNSG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderVerificationCapabilityCode";
				definition = "Cardholder verification capabilities of the POI (Personal Identification Number) performing the transaction.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(CardholderVerificationCapability1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.MNSG_ManualSignature,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.NPIN_OnLinePIN, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.FCPN_OfflinePINClear,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.FEPN_OfflinePINEncrypted, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.FDSG_OfflineDigitalSignature,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.FBIO_OfflineBiometrics, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.MNVR_ManualVerification,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.FBIG_OfflineBiographics, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.APKI_AccountDigitalSignature,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.PKIS_PKISignature, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.CHDT_CardholderData,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.SCEC_SecureElectronicCommerce, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.UNKW_Unknown,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.PCOD_PersonalCode, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.NOVF_NoCapabilities,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.NBIO_OnLineBiometrics, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OTHR_Other));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MNSG_ManualSignature.getCodeName().get(), MNSG_ManualSignature);
		codesByName.put(NPIN_OnLinePIN.getCodeName().get(), NPIN_OnLinePIN);
		codesByName.put(FCPN_OfflinePINClear.getCodeName().get(), FCPN_OfflinePINClear);
		codesByName.put(FEPN_OfflinePINEncrypted.getCodeName().get(), FEPN_OfflinePINEncrypted);
		codesByName.put(FDSG_OfflineDigitalSignature.getCodeName().get(), FDSG_OfflineDigitalSignature);
		codesByName.put(FBIO_OfflineBiometrics.getCodeName().get(), FBIO_OfflineBiometrics);
		codesByName.put(MNVR_ManualVerification.getCodeName().get(), MNVR_ManualVerification);
		codesByName.put(FBIG_OfflineBiographics.getCodeName().get(), FBIG_OfflineBiographics);
		codesByName.put(APKI_AccountDigitalSignature.getCodeName().get(), APKI_AccountDigitalSignature);
		codesByName.put(PKIS_PKISignature.getCodeName().get(), PKIS_PKISignature);
		codesByName.put(CHDT_CardholderData.getCodeName().get(), CHDT_CardholderData);
		codesByName.put(SCEC_SecureElectronicCommerce.getCodeName().get(), SCEC_SecureElectronicCommerce);
		codesByName.put(UNKW_Unknown.getCodeName().get(), UNKW_Unknown);
		codesByName.put(PCOD_PersonalCode.getCodeName().get(), PCOD_PersonalCode);
		codesByName.put(NOVF_NoCapabilities.getCodeName().get(), NOVF_NoCapabilities);
		codesByName.put(NBIO_OnLineBiometrics.getCodeName().get(), NBIO_OnLineBiometrics);
		codesByName.put(OTHR_Other.getCodeName().get(), OTHR_Other);
	}

	public static CardholderVerificationCapabilityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardholderVerificationCapabilityCode[] values() {
		CardholderVerificationCapabilityCode[] values = new CardholderVerificationCapabilityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardholderVerificationCapabilityCode> {
		@Override
		public CardholderVerificationCapabilityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardholderVerificationCapabilityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}