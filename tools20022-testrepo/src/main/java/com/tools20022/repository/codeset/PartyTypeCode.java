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
import com.tools20022.repository.codeset.PartyTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the entitled party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#SALE_SaleSystem
 * PartyTypeCode.SALE_SaleSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#PCPT_POIComponent
 * PartyTypeCode.PCPT_POIComponent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#ISUR_Issuer
 * PartyTypeCode.ISUR_Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#HLDR_Holder
 * PartyTypeCode.HLDR_Holder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#INVE_Investor
 * PartyTypeCode.INVE_Investor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#EXEC_ExecutingFirm
 * PartyTypeCode.EXEC_ExecutingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#BROK_BrokerOfCredit
 * PartyTypeCode.BROK_BrokerOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#CORR_CorrespondentClearingFirm
 * PartyTypeCode.CORR_CorrespondentClearingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#COFI_ContraFirm
 * PartyTypeCode.COFI_ContraFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#COCL_ContraClearingFirm
 * PartyTypeCode.COCL_ContraClearingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#UNDE_UnderlyingContraFirm
 * PartyTypeCode.UNDE_UnderlyingContraFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#GIVE_GiveUpClearingFirm
 * PartyTypeCode.GIVE_GiveUpClearingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#ORDE_OrderOriginationFirm
 * PartyTypeCode.ORDE_OrderOriginationFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#SPON_SponsoringFirm
 * PartyTypeCode.SPON_SponsoringFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#CLEA_Clearingfirm
 * PartyTypeCode.CLEA_Clearingfirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#INTR_IntroducingFirm
 * PartyTypeCode.INTR_IntroducingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#ENTE_EnteringFirm
 * PartyTypeCode.ENTE_EnteringFirm}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#CLIE_Client
 * PartyTypeCode.CLIE_Client}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#STEP_StepInBroker
 * PartyTypeCode.STEP_StepInBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#AFFI_AffirmingParty
 * PartyTypeCode.AFFI_AffirmingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#ETC1_ETCServiceProvider1
 * PartyTypeCode.ETC1_ETCServiceProvider1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#ETC2_ETCServiceProvider2
 * PartyTypeCode.ETC2_ETCServiceProvider2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#RQBR_RequestedBroker
 * PartyTypeCode.RQBR_RequestedBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#TAXH_TaxAuthority
 * PartyTypeCode.TAXH_TaxAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#DLIS_DelegateIssuer
 * PartyTypeCode.DLIS_DelegateIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#OPOI_OriginatingPOI
 * PartyTypeCode.OPOI_OriginatingPOI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#CISS_CardIssuer
 * PartyTypeCode.CISS_CardIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#ACCP_Acceptor
 * PartyTypeCode.ACCP_Acceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#MERC_Merchant
 * PartyTypeCode.MERC_Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#ACQR_Acquirer
 * PartyTypeCode.ACQR_Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#ITAG_IntermediaryAgent
 * PartyTypeCode.ITAG_IntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#MTMG_MasterTerminalManager
 * PartyTypeCode.MTMG_MasterTerminalManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#TMGT_TerminalManager
 * PartyTypeCode.TMGT_TerminalManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#ACQP_AcquirerProcessor
 * PartyTypeCode.ACQP_AcquirerProcessor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#CISP_CardIssuerProcessor
 * PartyTypeCode.CISP_CardIssuerProcessor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#CSCH_CardScheme
 * PartyTypeCode.CSCH_CardScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#SCHP_CardSchemeProcessor
 * PartyTypeCode.SCHP_CardSchemeProcessor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#ATMG_ATMManager
 * PartyTypeCode.ATMG_ATMManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#HSTG_HostingEntity
 * PartyTypeCode.HSTG_HostingEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#OATM_OriginatingATM
 * PartyTypeCode.OATM_OriginatingATM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#OTRM_OriginatingTerminal
 * PartyTypeCode.OTRM_OriginatingTerminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#ICCA_CardApplication
 * PartyTypeCode.ICCA_CardApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#PSYS_POISystem
 * PartyTypeCode.PSYS_POISystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#PGRP_POIGroup
 * PartyTypeCode.PGRP_POIGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#PSNG_SinglePOI
 * PartyTypeCode.PSNG_SinglePOI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#BKAF_AccountFromBank
 * PartyTypeCode.BKAF_AccountFromBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#BKAT_AccountToBank
 * PartyTypeCode.BKAT_AccountToBank}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType3Code
 * PartyType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType4Code
 * PartyType4Code}</li>
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
 * <li>"ISUR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyTypeCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartyTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SALE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleSystem"</li>
	 * </ul>
	 */
	public static final PartyTypeCode SALE_SaleSystem = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SaleSystem";
			definition = "Party selling goods and services.";
			codeName = "SALE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCPT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIComponent"</li>
	 * </ul>
	 */
	public static final PartyTypeCode PCPT_POIComponent = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "POIComponent";
			definition = "Party component of a POI system or POI terminal (Point of Interaction).";
			codeName = "PCPT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISUR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * </ul>
	 */
	public static final PartyTypeCode ISUR_Issuer = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issuer";
			definition = "Issuer is the entitled party.";
			codeName = "ISUR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HLDR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Holder"</li>
	 * </ul>
	 */
	public static final PartyTypeCode HLDR_Holder = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Holder";
			definition = "Holder is the entitled party.";
			codeName = "HLDR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * </ul>
	 */
	public static final PartyTypeCode INVE_Investor = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			codeName = "INVE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXEC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingFirm"</li>
	 * </ul>
	 */
	public static final PartyTypeCode EXEC_ExecutingFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingFirm";
			definition = "Party that identifies an executing / give-up broker.";
			codeName = "EXEC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BROK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerOfCredit"</li>
	 * </ul>
	 */
	public static final PartyTypeCode BROK_BrokerOfCredit = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerOfCredit";
			definition = "Party that receives the trade credit.";
			codeName = "BROK";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentClearingFirm"</li>
	 * </ul>
	 */
	public static final PartyTypeCode CORR_CorrespondentClearingFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentClearingFirm";
			definition = "Party that is going to carry the position on their books at another clearinghouse (exchanges).";
			codeName = "CORR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COFI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContraFirm"</li>
	 * </ul>
	 */
	public static final PartyTypeCode COFI_ContraFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraFirm";
			definition = "Party that is the counterparty in a trade.";
			codeName = "COFI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COCL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContraClearingFirm"</li>
	 * </ul>
	 */
	public static final PartyTypeCode COCL_ContraClearingFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraClearingFirm";
			definition = "Party that is the clearing firm of the counterparty in a trade.";
			codeName = "COCL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNDE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingContraFirm"</li>
	 * </ul>
	 */
	public static final PartyTypeCode UNDE_UnderlyingContraFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingContraFirm";
			definition = "Party (broker or other firm), which is the contra side of the trade for the underlying security.";
			codeName = "UNDE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GIVE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GiveUpClearingFirm"</li>
	 * </ul>
	 */
	public static final PartyTypeCode GIVE_GiveUpClearingFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GiveUpClearingFirm";
			definition = "Party to which the trade is given up (carries the position that results from a trade).";
			codeName = "GIVE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORDE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginationFirm"</li>
	 * </ul>
	 */
	public static final PartyTypeCode ORDE_OrderOriginationFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginationFirm";
			definition = "Party that originates an order.";
			codeName = "ORDE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPON"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SponsoringFirm"</li>
	 * </ul>
	 */
	public static final PartyTypeCode SPON_SponsoringFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SponsoringFirm";
			definition = "Party (member of an exchange)that is sponsoring an entering firm to send orders directly to the exchange.";
			codeName = "SPON";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLEA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clearingfirm"</li>
	 * </ul>
	 */
	public static final PartyTypeCode CLEA_Clearingfirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Clearingfirm";
			definition = "Party (broker) that settles security transactions from another broker for a fee = take up broker.";
			codeName = "CLEA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntroducingFirm"</li>
	 * </ul>
	 */
	public static final PartyTypeCode INTR_IntroducingFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntroducingFirm";
			definition = "Party that can relay an order directly to the trading floor, or give clients direct access to the floor. The introducing firm delegates the work of the floor operation, trade execution and accounting.";
			codeName = "INTR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENTE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnteringFirm"</li>
	 * </ul>
	 */
	public static final PartyTypeCode ENTE_EnteringFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnteringFirm";
			definition = "Party that has recorded or reported an execution of a trade. When an entering firm that is not a party to a trade enters the trade into a trade recording system, any inquiries can be directed to the appropriate source.";
			codeName = "ENTE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLIE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Client"</li>
	 * </ul>
	 */
	public static final PartyTypeCode CLIE_Client = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			definition = "A client is identified in third party-transactions or for investor in intermediary transactions.";
			codeName = "CLIE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STEP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepInBroker"</li>
	 * </ul>
	 */
	public static final PartyTypeCode STEP_StepInBroker = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepInBroker";
			definition = "Broker to which the investment manager directs the execution of a portion of the trade.";
			codeName = "STEP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AFFI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmingParty"</li>
	 * </ul>
	 */
	public static final PartyTypeCode AFFI_AffirmingParty = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmingParty";
			definition = "Party (buyer or seller) that positively affirms the details of a previously agreed security trade confirmation.";
			codeName = "AFFI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ETC1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ETCServiceProvider1"</li>
	 * </ul>
	 */
	public static final PartyTypeCode ETC1_ETCServiceProvider1 = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ETCServiceProvider1";
			definition = "Party acting as the Electronic Trade Confirmation (ETC) service provider 1.";
			codeName = "ETC1";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ETC2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ETCServiceProvider2"</li>
	 * </ul>
	 */
	public static final PartyTypeCode ETC2_ETCServiceProvider2 = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ETCServiceProvider2";
			definition = "Party acting as the Electronic Trade Confirmation (ETC) service provider 2.";
			codeName = "ETC2";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RQBR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedBroker"</li>
	 * </ul>
	 */
	public static final PartyTypeCode RQBR_RequestedBroker = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedBroker";
			definition = "In a directed order, broker with which the Receiver of the message is requested to execute the order.";
			codeName = "RQBR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAuthority"</li>
	 * </ul>
	 */
	public static final PartyTypeCode TAXH_TaxAuthority = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxAuthority";
			definition = "Tax authority.";
			codeName = "TAXH";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLIS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegateIssuer"</li>
	 * </ul>
	 */
	public static final PartyTypeCode DLIS_DelegateIssuer = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DelegateIssuer";
			definition = "Party to whom the card issuer delegates to authorise card payment transactions.";
			codeName = "DLIS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPOI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingPOI"</li>
	 * </ul>
	 */
	public static final PartyTypeCode OPOI_OriginatingPOI = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginatingPOI";
			definition = "Point Of Interaction initiating the card payment transaction.";
			codeName = "OPOI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CISS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardIssuer"</li>
	 * </ul>
	 */
	public static final PartyTypeCode CISS_CardIssuer = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardIssuer";
			definition = "Party that issues cards.";
			codeName = "CISS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acceptor"</li>
	 * </ul>
	 */
	public static final PartyTypeCode ACCP_Acceptor = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Acceptor";
			definition = "Card acceptor, party accepting the card and presenting transaction data to the acquirer.";
			codeName = "ACCP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MERC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * </ul>
	 */
	public static final PartyTypeCode MERC_Merchant = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Merchant";
			definition = "Merchant providing goods and service in the card payment transaction.";
			codeName = "MERC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACQR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * </ul>
	 */
	public static final PartyTypeCode ACQR_Acquirer = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Acquirer";
			definition = "Entity acquiring card transactions.";
			codeName = "ACQR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ITAG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent"</li>
	 * </ul>
	 */
	public static final PartyTypeCode ITAG_IntermediaryAgent = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediaryAgent";
			definition = "Party acting on behalf of other parties to process or forward data to other parties.";
			codeName = "ITAG";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTMG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterTerminalManager"</li>
	 * </ul>
	 */
	public static final PartyTypeCode MTMG_MasterTerminalManager = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MasterTerminalManager";
			definition = "Responsible for the maintenance of a card payment acceptance terminal.";
			codeName = "MTMG";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TMGT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManager"</li>
	 * </ul>
	 */
	public static final PartyTypeCode TMGT_TerminalManager = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalManager";
			definition = "Responsible for one or several maintenance functions of a card payment acceptance terminal.";
			codeName = "TMGT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACQP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerProcessor"</li>
	 * </ul>
	 */
	public static final PartyTypeCode ACQP_AcquirerProcessor = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerProcessor";
			definition = "Entity providing acquiring card payment processing services on behalf on an acquirer.";
			codeName = "ACQP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CISP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardIssuerProcessor"</li>
	 * </ul>
	 */
	public static final PartyTypeCode CISP_CardIssuerProcessor = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardIssuerProcessor";
			definition = "Entity providing issuing card payment processing services on behalf on an issuer.";
			codeName = "CISP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSCH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardScheme"</li>
	 * </ul>
	 */
	public static final PartyTypeCode CSCH_CardScheme = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardScheme";
			definition = "Entity defining rules and procedures for card payment transactions acting as an intermediary between an acquirer and an issuer.";
			codeName = "CSCH";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCHP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardSchemeProcessor"</li>
	 * </ul>
	 */
	public static final PartyTypeCode SCHP_CardSchemeProcessor = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardSchemeProcessor";
			definition = "Entity providing card payment processing services acting on behalf of a card scheme.";
			codeName = "SCHP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATMG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMManager"</li>
	 * </ul>
	 */
	public static final PartyTypeCode ATMG_ATMManager = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMManager";
			definition = "Entity managing the ATM.";
			codeName = "ATMG";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HSTG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostingEntity"</li>
	 * </ul>
	 */
	public static final PartyTypeCode HSTG_HostingEntity = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostingEntity";
			definition = "Entity hosting the ATM.";
			codeName = "HSTG";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OATM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingATM"</li>
	 * </ul>
	 */
	public static final PartyTypeCode OATM_OriginatingATM = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingATM";
			definition = "ATM initiating the transaction.";
			codeName = "OATM";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTRM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingTerminal"</li>
	 * </ul>
	 */
	public static final PartyTypeCode OTRM_OriginatingTerminal = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingTerminal";
			definition = "Application on the terminal which has initiated the transaction.";
			codeName = "OTRM";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICCA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardApplication"</li>
	 * </ul>
	 */
	public static final PartyTypeCode ICCA_CardApplication = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardApplication";
			definition = "Application in the smart card.";
			codeName = "ICCA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSYS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POISystem"</li>
	 * </ul>
	 */
	public static final PartyTypeCode PSYS_POISystem = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POISystem";
			definition = "Configuration to apply to the whole POI system.";
			codeName = "PSYS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PGRP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIGroup"</li>
	 * </ul>
	 */
	public static final PartyTypeCode PGRP_POIGroup = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIGroup";
			definition = "Configuration to apply to a subset of the whole POI system.";
			codeName = "PGRP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSNG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SinglePOI"</li>
	 * </ul>
	 */
	public static final PartyTypeCode PSNG_SinglePOI = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SinglePOI";
			definition = "Configuration to apply to a single POI terminal.";
			codeName = "PSNG";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKAF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountFromBank"</li>
	 * </ul>
	 */
	public static final PartyTypeCode BKAF_AccountFromBank = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountFromBank";
			definition = "The bank of the source account.";
			codeName = "BKAF";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKAT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountToBank"</li>
	 * </ul>
	 */
	public static final PartyTypeCode BKAT_AccountToBank = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountToBank";
			definition = "The bank of the destination account.";
			codeName = "BKAT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PartyTypeCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, PartyTypeCode> codesByName = new LinkedHashMap<>();

	protected PartyTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("ISUR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyTypeCode";
				definition = "Specifies the entitled party.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(PartyType3Code.mmObject(), PartyType4Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.PartyTypeCode.SALE_SaleSystem, com.tools20022.repository.codeset.PartyTypeCode.PCPT_POIComponent,
						com.tools20022.repository.codeset.PartyTypeCode.ISUR_Issuer, com.tools20022.repository.codeset.PartyTypeCode.HLDR_Holder, com.tools20022.repository.codeset.PartyTypeCode.INVE_Investor,
						com.tools20022.repository.codeset.PartyTypeCode.EXEC_ExecutingFirm, com.tools20022.repository.codeset.PartyTypeCode.BROK_BrokerOfCredit,
						com.tools20022.repository.codeset.PartyTypeCode.CORR_CorrespondentClearingFirm, com.tools20022.repository.codeset.PartyTypeCode.COFI_ContraFirm,
						com.tools20022.repository.codeset.PartyTypeCode.COCL_ContraClearingFirm, com.tools20022.repository.codeset.PartyTypeCode.UNDE_UnderlyingContraFirm,
						com.tools20022.repository.codeset.PartyTypeCode.GIVE_GiveUpClearingFirm, com.tools20022.repository.codeset.PartyTypeCode.ORDE_OrderOriginationFirm,
						com.tools20022.repository.codeset.PartyTypeCode.SPON_SponsoringFirm, com.tools20022.repository.codeset.PartyTypeCode.CLEA_Clearingfirm, com.tools20022.repository.codeset.PartyTypeCode.INTR_IntroducingFirm,
						com.tools20022.repository.codeset.PartyTypeCode.ENTE_EnteringFirm, com.tools20022.repository.codeset.PartyTypeCode.CLIE_Client, com.tools20022.repository.codeset.PartyTypeCode.STEP_StepInBroker,
						com.tools20022.repository.codeset.PartyTypeCode.AFFI_AffirmingParty, com.tools20022.repository.codeset.PartyTypeCode.ETC1_ETCServiceProvider1,
						com.tools20022.repository.codeset.PartyTypeCode.ETC2_ETCServiceProvider2, com.tools20022.repository.codeset.PartyTypeCode.RQBR_RequestedBroker, com.tools20022.repository.codeset.PartyTypeCode.TAXH_TaxAuthority,
						com.tools20022.repository.codeset.PartyTypeCode.DLIS_DelegateIssuer, com.tools20022.repository.codeset.PartyTypeCode.OPOI_OriginatingPOI, com.tools20022.repository.codeset.PartyTypeCode.CISS_CardIssuer,
						com.tools20022.repository.codeset.PartyTypeCode.ACCP_Acceptor, com.tools20022.repository.codeset.PartyTypeCode.MERC_Merchant, com.tools20022.repository.codeset.PartyTypeCode.ACQR_Acquirer,
						com.tools20022.repository.codeset.PartyTypeCode.ITAG_IntermediaryAgent, com.tools20022.repository.codeset.PartyTypeCode.MTMG_MasterTerminalManager,
						com.tools20022.repository.codeset.PartyTypeCode.TMGT_TerminalManager, com.tools20022.repository.codeset.PartyTypeCode.ACQP_AcquirerProcessor, com.tools20022.repository.codeset.PartyTypeCode.CISP_CardIssuerProcessor,
						com.tools20022.repository.codeset.PartyTypeCode.CSCH_CardScheme, com.tools20022.repository.codeset.PartyTypeCode.SCHP_CardSchemeProcessor, com.tools20022.repository.codeset.PartyTypeCode.ATMG_ATMManager,
						com.tools20022.repository.codeset.PartyTypeCode.HSTG_HostingEntity, com.tools20022.repository.codeset.PartyTypeCode.OATM_OriginatingATM, com.tools20022.repository.codeset.PartyTypeCode.OTRM_OriginatingTerminal,
						com.tools20022.repository.codeset.PartyTypeCode.ICCA_CardApplication, com.tools20022.repository.codeset.PartyTypeCode.PSYS_POISystem, com.tools20022.repository.codeset.PartyTypeCode.PGRP_POIGroup,
						com.tools20022.repository.codeset.PartyTypeCode.PSNG_SinglePOI, com.tools20022.repository.codeset.PartyTypeCode.BKAF_AccountFromBank, com.tools20022.repository.codeset.PartyTypeCode.BKAT_AccountToBank));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SALE_SaleSystem.getCodeName().get(), SALE_SaleSystem);
		codesByName.put(PCPT_POIComponent.getCodeName().get(), PCPT_POIComponent);
		codesByName.put(ISUR_Issuer.getCodeName().get(), ISUR_Issuer);
		codesByName.put(HLDR_Holder.getCodeName().get(), HLDR_Holder);
		codesByName.put(INVE_Investor.getCodeName().get(), INVE_Investor);
		codesByName.put(EXEC_ExecutingFirm.getCodeName().get(), EXEC_ExecutingFirm);
		codesByName.put(BROK_BrokerOfCredit.getCodeName().get(), BROK_BrokerOfCredit);
		codesByName.put(CORR_CorrespondentClearingFirm.getCodeName().get(), CORR_CorrespondentClearingFirm);
		codesByName.put(COFI_ContraFirm.getCodeName().get(), COFI_ContraFirm);
		codesByName.put(COCL_ContraClearingFirm.getCodeName().get(), COCL_ContraClearingFirm);
		codesByName.put(UNDE_UnderlyingContraFirm.getCodeName().get(), UNDE_UnderlyingContraFirm);
		codesByName.put(GIVE_GiveUpClearingFirm.getCodeName().get(), GIVE_GiveUpClearingFirm);
		codesByName.put(ORDE_OrderOriginationFirm.getCodeName().get(), ORDE_OrderOriginationFirm);
		codesByName.put(SPON_SponsoringFirm.getCodeName().get(), SPON_SponsoringFirm);
		codesByName.put(CLEA_Clearingfirm.getCodeName().get(), CLEA_Clearingfirm);
		codesByName.put(INTR_IntroducingFirm.getCodeName().get(), INTR_IntroducingFirm);
		codesByName.put(ENTE_EnteringFirm.getCodeName().get(), ENTE_EnteringFirm);
		codesByName.put(CLIE_Client.getCodeName().get(), CLIE_Client);
		codesByName.put(STEP_StepInBroker.getCodeName().get(), STEP_StepInBroker);
		codesByName.put(AFFI_AffirmingParty.getCodeName().get(), AFFI_AffirmingParty);
		codesByName.put(ETC1_ETCServiceProvider1.getCodeName().get(), ETC1_ETCServiceProvider1);
		codesByName.put(ETC2_ETCServiceProvider2.getCodeName().get(), ETC2_ETCServiceProvider2);
		codesByName.put(RQBR_RequestedBroker.getCodeName().get(), RQBR_RequestedBroker);
		codesByName.put(TAXH_TaxAuthority.getCodeName().get(), TAXH_TaxAuthority);
		codesByName.put(DLIS_DelegateIssuer.getCodeName().get(), DLIS_DelegateIssuer);
		codesByName.put(OPOI_OriginatingPOI.getCodeName().get(), OPOI_OriginatingPOI);
		codesByName.put(CISS_CardIssuer.getCodeName().get(), CISS_CardIssuer);
		codesByName.put(ACCP_Acceptor.getCodeName().get(), ACCP_Acceptor);
		codesByName.put(MERC_Merchant.getCodeName().get(), MERC_Merchant);
		codesByName.put(ACQR_Acquirer.getCodeName().get(), ACQR_Acquirer);
		codesByName.put(ITAG_IntermediaryAgent.getCodeName().get(), ITAG_IntermediaryAgent);
		codesByName.put(MTMG_MasterTerminalManager.getCodeName().get(), MTMG_MasterTerminalManager);
		codesByName.put(TMGT_TerminalManager.getCodeName().get(), TMGT_TerminalManager);
		codesByName.put(ACQP_AcquirerProcessor.getCodeName().get(), ACQP_AcquirerProcessor);
		codesByName.put(CISP_CardIssuerProcessor.getCodeName().get(), CISP_CardIssuerProcessor);
		codesByName.put(CSCH_CardScheme.getCodeName().get(), CSCH_CardScheme);
		codesByName.put(SCHP_CardSchemeProcessor.getCodeName().get(), SCHP_CardSchemeProcessor);
		codesByName.put(ATMG_ATMManager.getCodeName().get(), ATMG_ATMManager);
		codesByName.put(HSTG_HostingEntity.getCodeName().get(), HSTG_HostingEntity);
		codesByName.put(OATM_OriginatingATM.getCodeName().get(), OATM_OriginatingATM);
		codesByName.put(OTRM_OriginatingTerminal.getCodeName().get(), OTRM_OriginatingTerminal);
		codesByName.put(ICCA_CardApplication.getCodeName().get(), ICCA_CardApplication);
		codesByName.put(PSYS_POISystem.getCodeName().get(), PSYS_POISystem);
		codesByName.put(PGRP_POIGroup.getCodeName().get(), PGRP_POIGroup);
		codesByName.put(PSNG_SinglePOI.getCodeName().get(), PSNG_SinglePOI);
		codesByName.put(BKAF_AccountFromBank.getCodeName().get(), BKAF_AccountFromBank);
		codesByName.put(BKAT_AccountToBank.getCodeName().get(), BKAT_AccountToBank);
	}

	public static PartyTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartyTypeCode[] values() {
		PartyTypeCode[] values = new PartyTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartyTypeCode> {
		@Override
		public PartyTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartyTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}