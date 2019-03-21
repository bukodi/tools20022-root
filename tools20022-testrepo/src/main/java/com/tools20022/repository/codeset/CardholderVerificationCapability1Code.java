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
import com.tools20022.repository.codeset.CardholderVerificationCapability1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
 * CardholderVerificationCapabilityCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#MNSG_ManualSignature
 * CardholderVerificationCapability1Code.MNSG_ManualSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#NPIN_OnLinePIN
 * CardholderVerificationCapability1Code.NPIN_OnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#FCPN_OfflinePINClear
 * CardholderVerificationCapability1Code.FCPN_OfflinePINClear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#FEPN_OfflinePINEncrypted
 * CardholderVerificationCapability1Code.FEPN_OfflinePINEncrypted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#FDSG_OfflineDigitalSignature
 * CardholderVerificationCapability1Code.FDSG_OfflineDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#FBIO_OfflineBiometrics
 * CardholderVerificationCapability1Code.FBIO_OfflineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#MNVR_ManualVerification
 * CardholderVerificationCapability1Code.MNVR_ManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#FBIG_OfflineBiographics
 * CardholderVerificationCapability1Code.FBIG_OfflineBiographics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#APKI_AccountDigitalSignature
 * CardholderVerificationCapability1Code.APKI_AccountDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#PKIS_PKISignature
 * CardholderVerificationCapability1Code.PKIS_PKISignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#CHDT_CardholderData
 * CardholderVerificationCapability1Code.CHDT_CardholderData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#SCEC_SecureElectronicCommerce
 * CardholderVerificationCapability1Code.SCEC_SecureElectronicCommerce}</li>
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
 * "CardholderVerificationCapability1Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardholderVerificationCapability1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualSignature"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability1Code MNSG_ManualSignature = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualSignature";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject());
			codeName = CardholderVerificationCapabilityCode.MNSG_ManualSignature.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability1Code NPIN_OnLinePIN = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject());
			codeName = CardholderVerificationCapabilityCode.NPIN_OnLinePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePINClear"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability1Code FCPN_OfflinePINClear = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePINClear";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject());
			codeName = CardholderVerificationCapabilityCode.FCPN_OfflinePINClear.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePINEncrypted"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability1Code FEPN_OfflinePINEncrypted = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePINEncrypted";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject());
			codeName = CardholderVerificationCapabilityCode.FEPN_OfflinePINEncrypted.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineDigitalSignature"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability1Code FDSG_OfflineDigitalSignature = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineDigitalSignature";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject());
			codeName = CardholderVerificationCapabilityCode.FDSG_OfflineDigitalSignature.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineBiometrics"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability1Code FBIO_OfflineBiometrics = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineBiometrics";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject());
			codeName = CardholderVerificationCapabilityCode.FBIO_OfflineBiometrics.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualVerification"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability1Code MNVR_ManualVerification = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualVerification";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject());
			codeName = CardholderVerificationCapabilityCode.MNVR_ManualVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineBiographics"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability1Code FBIG_OfflineBiographics = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineBiographics";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject());
			codeName = CardholderVerificationCapabilityCode.FBIG_OfflineBiographics.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDigitalSignature"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability1Code APKI_AccountDigitalSignature = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDigitalSignature";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject());
			codeName = CardholderVerificationCapabilityCode.APKI_AccountDigitalSignature.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PKISignature"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability1Code PKIS_PKISignature = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PKISignature";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject());
			codeName = CardholderVerificationCapabilityCode.PKIS_PKISignature.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderData"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability1Code CHDT_CardholderData = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderData";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject());
			codeName = CardholderVerificationCapabilityCode.CHDT_CardholderData.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureElectronicCommerce"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability1Code SCEC_SecureElectronicCommerce = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject());
			codeName = CardholderVerificationCapabilityCode.SCEC_SecureElectronicCommerce.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardholderVerificationCapability1Code> codesByName = new LinkedHashMap<>();

	protected CardholderVerificationCapability1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("MNSG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderVerificationCapability1Code";
				definition = "Cardholder verification capabilities of the POI (Personal Identification Number) performing the transaction.";
				trace_lazy = LazyReference.create(() -> CardholderVerificationCapabilityCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.CardholderVerificationCapability1Code.MNSG_ManualSignature,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.NPIN_OnLinePIN, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.FCPN_OfflinePINClear,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.FEPN_OfflinePINEncrypted, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.FDSG_OfflineDigitalSignature,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.FBIO_OfflineBiometrics, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.MNVR_ManualVerification,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.FBIG_OfflineBiographics, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.APKI_AccountDigitalSignature,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.PKIS_PKISignature, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.CHDT_CardholderData,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.SCEC_SecureElectronicCommerce));
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
	}

	public static CardholderVerificationCapability1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardholderVerificationCapability1Code[] values() {
		CardholderVerificationCapability1Code[] values = new CardholderVerificationCapability1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardholderVerificationCapability1Code> {
		@Override
		public CardholderVerificationCapability1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardholderVerificationCapability1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}