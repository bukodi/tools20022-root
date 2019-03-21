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
import com.tools20022.repository.codeset.CardPaymentServiceTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Service provided by a card payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CAFT_CardsFundTransfer
 * CardPaymentServiceTypeCode.CAFT_CardsFundTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#ORCR_OriginalCredit
 * CardPaymentServiceTypeCode.ORCR_OriginalCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CRDP_CardPayment
 * CardPaymentServiceTypeCode.CRDP_CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CSHB_CashBack
 * CardPaymentServiceTypeCode.CSHB_CashBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CSHW_CashAdvance
 * CardPaymentServiceTypeCode.CSHW_CashAdvance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CSHD_CashDeposit
 * CardPaymentServiceTypeCode.CSHD_CashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#DEFR_DeferredPayment
 * CardPaymentServiceTypeCode.DEFR_DeferredPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#RESA_Reservation
 * CardPaymentServiceTypeCode.RESA_Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#LOAD_Loading
 * CardPaymentServiceTypeCode.LOAD_Loading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#RFND_Refund
 * CardPaymentServiceTypeCode.RFND_Refund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#QUCH_QuasiCash
 * CardPaymentServiceTypeCode.QUCH_QuasiCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#BALC_Balance
 * CardPaymentServiceTypeCode.BALC_Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CACT_CardActivation
 * CardPaymentServiceTypeCode.CACT_CardActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CAVR_CardVerification
 * CardPaymentServiceTypeCode.CAVR_CardVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PINC_PINChange
 * CardPaymentServiceTypeCode.PINC_PINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#VALC_ValidityCheck
 * CardPaymentServiceTypeCode.VALC_ValidityCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#AGGR_Aggregation
 * CardPaymentServiceTypeCode.AGGR_Aggregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#DCCV_DCC
 * CardPaymentServiceTypeCode.DCCV_DCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#GRTT_Gratuity
 * CardPaymentServiceTypeCode.GRTT_Gratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#INSP_Instalment
 * CardPaymentServiceTypeCode.INSP_Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#LOYT_Loyalty
 * CardPaymentServiceTypeCode.LOYT_Loyalty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#NRES_NoShow
 * CardPaymentServiceTypeCode.NRES_NoShow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PUCO_PurchaseCorporate
 * CardPaymentServiceTypeCode.PUCO_PurchaseCorporate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#RECP_RecurringPayment
 * CardPaymentServiceTypeCode.RECP_RecurringPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#SOAF_SolicitedAvailableFunds
 * CardPaymentServiceTypeCode.SOAF_SolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#UNAF_UnsolicitedAvailableFunds
 * CardPaymentServiceTypeCode.UNAF_UnsolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#VCAU_VoiceAuthorisation
 * CardPaymentServiceTypeCode.VCAU_VoiceAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#IRES_InitialReservation
 * CardPaymentServiceTypeCode.IRES_InitialReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#URES_UpdateReservation
 * CardPaymentServiceTypeCode.URES_UpdateReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PRES_PaymentReservation
 * CardPaymentServiceTypeCode.PRES_PaymentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#ARES_AdditionalPayment
 * CardPaymentServiceTypeCode.ARES_AdditionalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#FREC_FirstRecurring
 * CardPaymentServiceTypeCode.FREC_FirstRecurring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#RREC_FollowingRecurring
 * CardPaymentServiceTypeCode.RREC_FollowingRecurring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TP2B_PersonToBusiness
 * CardPaymentServiceTypeCode.TP2B_PersonToBusiness}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TP2P_PersonToPerson
 * CardPaymentServiceTypeCode.TP2P_PersonToPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#INSA_AcceptorInstalment
 * CardPaymentServiceTypeCode.INSA_AcceptorInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#INSI_IssuerInstalment
 * CardPaymentServiceTypeCode.INSI_IssuerInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#UNLD_Unloading
 * CardPaymentServiceTypeCode.UNLD_Unloading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CAFH_CardsFundTransferPush
 * CardPaymentServiceTypeCode.CAFH_CardsFundTransferPush}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CAFL_CardsFundTransferPull
 * CardPaymentServiceTypeCode.CAFL_CardsFundTransferPull}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CHWD_CashWithdrawal
 * CardPaymentServiceTypeCode.CHWD_CashWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PINU_PINUnblock
 * CardPaymentServiceTypeCode.PINU_PINUnblock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CSWD_ChosenWithdrawal
 * CardPaymentServiceTypeCode.CSWD_ChosenWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#AUWS_PreAuthorisedWithdrawal
 * CardPaymentServiceTypeCode.AUWS_PreAuthorisedWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PFWD_ProfileWithdrawal
 * CardPaymentServiceTypeCode.PFWD_ProfileWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#SDWD_StandardWithdrawal
 * CardPaymentServiceTypeCode.SDWD_StandardWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TFBL_TransferCardBillPayment
 * CardPaymentServiceTypeCode.TFBL_TransferCardBillPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TFCS_TransferFromCash
 * CardPaymentServiceTypeCode.TFCS_TransferFromCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TFCH_TransferFromCheque
 * CardPaymentServiceTypeCode.TFCH_TransferFromCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TFDB_TransferFundsDisbursementGeneral
 * CardPaymentServiceTypeCode.TFDB_TransferFundsDisbursementGeneral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TFGD_TransferGovernmentDisbursement
 * CardPaymentServiceTypeCode.TFGD_TransferGovernmentDisbursement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TFMD_TransferMerchantDisbursement
 * CardPaymentServiceTypeCode.TFMD_TransferMerchantDisbursement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TFPD_TransferPayrollPensionDisbursement
 * CardPaymentServiceTypeCode.TFPD_TransferPayrollPensionDisbursement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#NRFD_NonRefundable
 * CardPaymentServiceTypeCode.NRFD_NonRefundable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#INST_Instant
 * CardPaymentServiceTypeCode.INST_Instant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CADJ_CreditAdjustement
 * CardPaymentServiceTypeCode.CADJ_CreditAdjustement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#DADJ_DebitAdjustement
 * CardPaymentServiceTypeCode.DADJ_DebitAdjustement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CRTC_CreateCertificate
 * CardPaymentServiceTypeCode.CRTC_CreateCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CRTR_RenewCerificate
 * CardPaymentServiceTypeCode.CRTR_RenewCerificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CRTK_RevokeCertificate
 * CardPaymentServiceTypeCode.CRTK_RevokeCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#WLSA_AddWhiteList
 * CardPaymentServiceTypeCode.WLSA_AddWhiteList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#WLSR_RemoveWhiteList
 * CardPaymentServiceTypeCode.WLSR_RemoveWhiteList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CIDD_CardInitiatingDirectDebit
 * CardPaymentServiceTypeCode.CIDD_CardInitiatingDirectDebit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
 * CardPaymentServiceType2Code}</li>
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
 * <li>"CAFT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentServiceTypeCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardPaymentServiceTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAFT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransfer"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CAFT_CardsFundTransfer = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardsFundTransfer";
			definition = "Transfer of funds to and/or from a card account.";
			codeName = "CAFT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORCR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCredit"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode ORCR_OriginalCredit = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalCredit";
			definition = "Original credit.";
			codeName = "ORCR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CRDP_CardPayment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Card payment.";
			codeName = "CRDP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBack"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CSHB_CashBack = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashBack";
			definition = "Card payment with cash-back.";
			codeName = "CSHB";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHW"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAdvance"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CSHW_CashAdvance = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAdvance";
			definition = "Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.";
			codeName = "CSHW";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDeposit"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CSHD_CashDeposit = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDeposit";
			definition = "Cash deposit.";
			codeName = "CSHD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEFR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeferredPayment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode DEFR_DeferredPayment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeferredPayment";
			definition = "Deferred payment.";
			codeName = "DEFR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode RESA_Reservation = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Reservation (pre-authorisation).";
			codeName = "RESA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOAD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loading"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode LOAD_Loading = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Loading";
			definition = "Loading or reloading non-financial account.";
			codeName = "LOAD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RFND"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode RFND_Refund = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Refund";
			definition = "Refund transaction.";
			codeName = "RFND";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUCH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuasiCash"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode QUCH_QuasiCash = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuasiCash";
			definition = "Quasi-cash.";
			codeName = "QUCH";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BALC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode BALC_Balance = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance enquiry.";
			codeName = "BALC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CACT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardActivation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CACT_CardActivation = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardActivation";
			definition = "Card activation.";
			codeName = "CACT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAVR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerification"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CAVR_CardVerification = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardVerification";
			definition = "Card verification.";
			codeName = "CAVR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChange"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode PINC_PINChange = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PINChange";
			definition = "PIN (Personal Identification Number) change.";
			codeName = "PINC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VALC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityCheck"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode VALC_ValidityCheck = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityCheck";
			definition = "Card validity check.";
			codeName = "VALC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGGR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aggregation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode AGGR_Aggregation = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Aggregation";
			definition = "Aggregation of low payments.";
			codeName = "AGGR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCCV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DCC"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode DCCV_DCC = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DCC";
			definition = "Dynamic currency conversion (DCC).";
			codeName = "DCCV";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRTT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gratuity"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode GRTT_Gratuity = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gratuity";
			definition = "Card payment with gratuity.";
			codeName = "GRTT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instalment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode INSP_Instalment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Instalment";
			definition = "Instalment payment.";
			codeName = "INSP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOYT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loyalty"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode LOYT_Loyalty = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Loyalty";
			definition = "Loyalty services.";
			codeName = "LOYT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRES"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoShow"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode NRES_NoShow = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoShow";
			definition = "No show after reservation.";
			codeName = "NRES";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUCO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseCorporate"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode PUCO_PurchaseCorporate = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PurchaseCorporate";
			definition = "Purchase and corporate data.";
			codeName = "PUCO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringPayment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode RECP_RecurringPayment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecurringPayment";
			definition = "Recurring payment.";
			codeName = "RECP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOAF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitedAvailableFunds"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode SOAF_SolicitedAvailableFunds = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SolicitedAvailableFunds";
			definition = "Solicited available funds.";
			codeName = "SOAF";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNAF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsolicitedAvailableFunds"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode UNAF_UnsolicitedAvailableFunds = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnsolicitedAvailableFunds";
			definition = "Unsolicited available funds.";
			codeName = "UNAF";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VCAU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoiceAuthorisation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode VCAU_VoiceAuthorisation = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoiceAuthorisation";
			definition = "Voice authorisation.";
			codeName = "VCAU";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRES"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialReservation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode IRES_InitialReservation = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InitialReservation";
			definition = "Initial reservation.";
			codeName = "IRES";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "URES"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateReservation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode URES_UpdateReservation = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UpdateReservation";
			definition = "Update reservation.";
			codeName = "URES";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRES"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentReservation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode PRES_PaymentReservation = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentReservation";
			definition = "Payment after reservation.";
			codeName = "PRES";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPayment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode ARES_AdditionalPayment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalPayment";
			definition = "Additional payment after reservation.";
			codeName = "ARES";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FREC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstRecurring"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode FREC_FirstRecurring = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstRecurring";
			definition = "Initial recurring payment.";
			codeName = "FREC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RREC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FollowingRecurring"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode RREC_FollowingRecurring = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FollowingRecurring";
			definition = "Repeat recurring payment.";
			codeName = "RREC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TP2B"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonToBusiness"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode TP2B_PersonToBusiness = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PersonToBusiness";
			definition = "Card payment transaction transfer from person to business.";
			codeName = "TP2B";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TP2P"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonToPerson"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode TP2P_PersonToPerson = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PersonToPerson";
			definition = "Card payment transaction transfer from person to person.";
			codeName = "TP2P";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorInstalment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode INSA_AcceptorInstalment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorInstalment";
			definition = "Instalment payment transaction performed by the acceptor or the acquirer.";
			codeName = "INSA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInstalment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode INSI_IssuerInstalment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInstalment";
			definition = "Instalment payment transaction performed by the card issuer.";
			codeName = "INSI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNLD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unloading"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode UNLD_Unloading = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unloading";
			definition = "Unloading non-financial account.";
			codeName = "UNLD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAFH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransferPush"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CAFH_CardsFundTransferPush = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransferPush";
			definition = "Transfer of funds to a card or an account.";
			codeName = "CAFH";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAFL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransferPull"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CAFL_CardsFundTransferPull = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransferPull";
			definition = "Transfer of funds from a card or an account.";
			codeName = "CAFL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHWD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashWithdrawal"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CHWD_CashWithdrawal = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashWithdrawal";
			definition = "Withdrawal of cash on an ATM.";
			codeName = "CHWD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINUnblock"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode PINU_PINUnblock = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINUnblock";
			definition = "Unblock the cardholder PIN.";
			codeName = "PINU";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSWD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChosenWithdrawal"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CSWD_ChosenWithdrawal = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChosenWithdrawal";
			definition = "Amount and notes values are chosen by the customer.";
			codeName = "CSWD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUWS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAuthorisedWithdrawal"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode AUWS_PreAuthorisedWithdrawal = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAuthorisedWithdrawal";
			definition = "Withdrawal transaction was pre-authorised by another channel (amount could be absent).";
			codeName = "AUWS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PFWD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileWithdrawal"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode PFWD_ProfileWithdrawal = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileWithdrawal";
			definition = "Amount and Notes Values are pre-defined by the customer profile.";
			codeName = "PFWD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDWD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardWithdrawal"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode SDWD_StandardWithdrawal = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardWithdrawal";
			definition = "Customer pressed a button associated with a withdrawal of unique amount and notes mix.";
			codeName = "SDWD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFBL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferCardBillPayment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode TFBL_TransferCardBillPayment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferCardBillPayment";
			definition = "Transfer for payment of bills.";
			codeName = "TFBL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFCS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferFromCash"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode TFCS_TransferFromCash = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferFromCash";
			definition = "Transfer from cash deposit.";
			codeName = "TFCS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFCH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferFromCheque"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode TFCH_TransferFromCheque = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferFromCheque";
			definition = "Transfer from cheque deposit.";
			codeName = "TFCH";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFDB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferFundsDisbursementGeneral"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode TFDB_TransferFundsDisbursementGeneral = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferFundsDisbursementGeneral";
			definition = "Transfer for general disbursement.";
			codeName = "TFDB";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFGD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferGovernmentDisbursement"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode TFGD_TransferGovernmentDisbursement = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferGovernmentDisbursement";
			definition = "Transfer for government disbursement.";
			codeName = "TFGD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFMD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferMerchantDisbursement"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode TFMD_TransferMerchantDisbursement = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferMerchantDisbursement";
			definition = "Transfer for merchant disbursement.";
			codeName = "TFMD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFPD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferPayrollPensionDisbursement"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode TFPD_TransferPayrollPensionDisbursement = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferPayrollPensionDisbursement";
			definition = "Transfer for payroll pension disbursement.";
			codeName = "TFPD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRFD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonRefundable"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode NRFD_NonRefundable = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonRefundable";
			definition = "Payment of goods or services which are not refundable, for instance low cost airline tickets.";
			codeName = "NRFD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INST"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instant"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode INST_Instant = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instant";
			definition = "Instant transaction.";
			codeName = "INST";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADJ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAdjustement"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CADJ_CreditAdjustement = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAdjustement";
			definition = "Credit adjustment to a previous transaction.";
			codeName = "CADJ";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DADJ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAdjustement"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode DADJ_DebitAdjustement = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitAdjustement";
			definition = "Debit adjustment to a previous transaction.";
			codeName = "DADJ";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreateCertificate"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CRTC_CreateCertificate = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreateCertificate";
			definition = "Creation of an X.509 certificate with the public key and the information of the owner of the asymmetric key provided by the requestor.";
			codeName = "CRTC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenewCerificate"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CRTR_RenewCerificate = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenewCerificate";
			definition = "Renewal of an X.509 certificate, protected by the certificate to renew.";
			codeName = "CRTR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevokeCertificate"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CRTK_RevokeCertificate = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevokeCertificate";
			definition = "Revocation of an active X.509 certificate.";
			codeName = "CRTK";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WLSA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddWhiteList"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode WLSA_AddWhiteList = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddWhiteList";
			definition = "Add a POI in the white list of the terminal manager.";
			codeName = "WLSA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WLSR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemoveWhiteList"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode WLSR_RemoveWhiteList = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemoveWhiteList";
			definition = "Remove a POI from the white list of the terminal manager.";
			codeName = "WLSR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CIDD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardInitiatingDirectDebit"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceTypeCode CIDD_CardInitiatingDirectDebit = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardInitiatingDirectDebit";
			definition = "Direct Debit initiated by Card.";
			codeName = "CIDD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, CardPaymentServiceTypeCode> codesByName = new LinkedHashMap<>();

	protected CardPaymentServiceTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("CAFT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceTypeCode";
				definition = "Service provided by a card payment transaction.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(CardPaymentServiceType2Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CAFT_CardsFundTransfer, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.ORCR_OriginalCredit,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CRDP_CardPayment, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CSHB_CashBack,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CSHW_CashAdvance, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CSHD_CashDeposit,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.DEFR_DeferredPayment, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.RESA_Reservation,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.LOAD_Loading, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.RFND_Refund,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.QUCH_QuasiCash, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.BALC_Balance,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CACT_CardActivation, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CAVR_CardVerification,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PINC_PINChange, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.VALC_ValidityCheck,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.AGGR_Aggregation, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.DCCV_DCC,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.GRTT_Gratuity, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.INSP_Instalment,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.LOYT_Loyalty, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.NRES_NoShow,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PUCO_PurchaseCorporate, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.RECP_RecurringPayment,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.SOAF_SolicitedAvailableFunds, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.UNAF_UnsolicitedAvailableFunds,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.VCAU_VoiceAuthorisation, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.IRES_InitialReservation,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.URES_UpdateReservation, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PRES_PaymentReservation,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.ARES_AdditionalPayment, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.FREC_FirstRecurring,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.RREC_FollowingRecurring, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TP2B_PersonToBusiness,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TP2P_PersonToPerson, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.INSA_AcceptorInstalment,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.INSI_IssuerInstalment, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.UNLD_Unloading,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CAFH_CardsFundTransferPush, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CAFL_CardsFundTransferPull,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CHWD_CashWithdrawal, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PINU_PINUnblock,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CSWD_ChosenWithdrawal, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.AUWS_PreAuthorisedWithdrawal,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PFWD_ProfileWithdrawal, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.SDWD_StandardWithdrawal,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TFBL_TransferCardBillPayment, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TFCS_TransferFromCash,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TFCH_TransferFromCheque, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TFDB_TransferFundsDisbursementGeneral,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TFGD_TransferGovernmentDisbursement, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TFMD_TransferMerchantDisbursement,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TFPD_TransferPayrollPensionDisbursement, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.NRFD_NonRefundable,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.INST_Instant, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CADJ_CreditAdjustement,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.DADJ_DebitAdjustement, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CRTC_CreateCertificate,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CRTR_RenewCerificate, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CRTK_RevokeCertificate,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.WLSA_AddWhiteList, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.WLSR_RemoveWhiteList,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CIDD_CardInitiatingDirectDebit));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CAFT_CardsFundTransfer.getCodeName().get(), CAFT_CardsFundTransfer);
		codesByName.put(ORCR_OriginalCredit.getCodeName().get(), ORCR_OriginalCredit);
		codesByName.put(CRDP_CardPayment.getCodeName().get(), CRDP_CardPayment);
		codesByName.put(CSHB_CashBack.getCodeName().get(), CSHB_CashBack);
		codesByName.put(CSHW_CashAdvance.getCodeName().get(), CSHW_CashAdvance);
		codesByName.put(CSHD_CashDeposit.getCodeName().get(), CSHD_CashDeposit);
		codesByName.put(DEFR_DeferredPayment.getCodeName().get(), DEFR_DeferredPayment);
		codesByName.put(RESA_Reservation.getCodeName().get(), RESA_Reservation);
		codesByName.put(LOAD_Loading.getCodeName().get(), LOAD_Loading);
		codesByName.put(RFND_Refund.getCodeName().get(), RFND_Refund);
		codesByName.put(QUCH_QuasiCash.getCodeName().get(), QUCH_QuasiCash);
		codesByName.put(BALC_Balance.getCodeName().get(), BALC_Balance);
		codesByName.put(CACT_CardActivation.getCodeName().get(), CACT_CardActivation);
		codesByName.put(CAVR_CardVerification.getCodeName().get(), CAVR_CardVerification);
		codesByName.put(PINC_PINChange.getCodeName().get(), PINC_PINChange);
		codesByName.put(VALC_ValidityCheck.getCodeName().get(), VALC_ValidityCheck);
		codesByName.put(AGGR_Aggregation.getCodeName().get(), AGGR_Aggregation);
		codesByName.put(DCCV_DCC.getCodeName().get(), DCCV_DCC);
		codesByName.put(GRTT_Gratuity.getCodeName().get(), GRTT_Gratuity);
		codesByName.put(INSP_Instalment.getCodeName().get(), INSP_Instalment);
		codesByName.put(LOYT_Loyalty.getCodeName().get(), LOYT_Loyalty);
		codesByName.put(NRES_NoShow.getCodeName().get(), NRES_NoShow);
		codesByName.put(PUCO_PurchaseCorporate.getCodeName().get(), PUCO_PurchaseCorporate);
		codesByName.put(RECP_RecurringPayment.getCodeName().get(), RECP_RecurringPayment);
		codesByName.put(SOAF_SolicitedAvailableFunds.getCodeName().get(), SOAF_SolicitedAvailableFunds);
		codesByName.put(UNAF_UnsolicitedAvailableFunds.getCodeName().get(), UNAF_UnsolicitedAvailableFunds);
		codesByName.put(VCAU_VoiceAuthorisation.getCodeName().get(), VCAU_VoiceAuthorisation);
		codesByName.put(IRES_InitialReservation.getCodeName().get(), IRES_InitialReservation);
		codesByName.put(URES_UpdateReservation.getCodeName().get(), URES_UpdateReservation);
		codesByName.put(PRES_PaymentReservation.getCodeName().get(), PRES_PaymentReservation);
		codesByName.put(ARES_AdditionalPayment.getCodeName().get(), ARES_AdditionalPayment);
		codesByName.put(FREC_FirstRecurring.getCodeName().get(), FREC_FirstRecurring);
		codesByName.put(RREC_FollowingRecurring.getCodeName().get(), RREC_FollowingRecurring);
		codesByName.put(TP2B_PersonToBusiness.getCodeName().get(), TP2B_PersonToBusiness);
		codesByName.put(TP2P_PersonToPerson.getCodeName().get(), TP2P_PersonToPerson);
		codesByName.put(INSA_AcceptorInstalment.getCodeName().get(), INSA_AcceptorInstalment);
		codesByName.put(INSI_IssuerInstalment.getCodeName().get(), INSI_IssuerInstalment);
		codesByName.put(UNLD_Unloading.getCodeName().get(), UNLD_Unloading);
		codesByName.put(CAFH_CardsFundTransferPush.getCodeName().get(), CAFH_CardsFundTransferPush);
		codesByName.put(CAFL_CardsFundTransferPull.getCodeName().get(), CAFL_CardsFundTransferPull);
		codesByName.put(CHWD_CashWithdrawal.getCodeName().get(), CHWD_CashWithdrawal);
		codesByName.put(PINU_PINUnblock.getCodeName().get(), PINU_PINUnblock);
		codesByName.put(CSWD_ChosenWithdrawal.getCodeName().get(), CSWD_ChosenWithdrawal);
		codesByName.put(AUWS_PreAuthorisedWithdrawal.getCodeName().get(), AUWS_PreAuthorisedWithdrawal);
		codesByName.put(PFWD_ProfileWithdrawal.getCodeName().get(), PFWD_ProfileWithdrawal);
		codesByName.put(SDWD_StandardWithdrawal.getCodeName().get(), SDWD_StandardWithdrawal);
		codesByName.put(TFBL_TransferCardBillPayment.getCodeName().get(), TFBL_TransferCardBillPayment);
		codesByName.put(TFCS_TransferFromCash.getCodeName().get(), TFCS_TransferFromCash);
		codesByName.put(TFCH_TransferFromCheque.getCodeName().get(), TFCH_TransferFromCheque);
		codesByName.put(TFDB_TransferFundsDisbursementGeneral.getCodeName().get(), TFDB_TransferFundsDisbursementGeneral);
		codesByName.put(TFGD_TransferGovernmentDisbursement.getCodeName().get(), TFGD_TransferGovernmentDisbursement);
		codesByName.put(TFMD_TransferMerchantDisbursement.getCodeName().get(), TFMD_TransferMerchantDisbursement);
		codesByName.put(TFPD_TransferPayrollPensionDisbursement.getCodeName().get(), TFPD_TransferPayrollPensionDisbursement);
		codesByName.put(NRFD_NonRefundable.getCodeName().get(), NRFD_NonRefundable);
		codesByName.put(INST_Instant.getCodeName().get(), INST_Instant);
		codesByName.put(CADJ_CreditAdjustement.getCodeName().get(), CADJ_CreditAdjustement);
		codesByName.put(DADJ_DebitAdjustement.getCodeName().get(), DADJ_DebitAdjustement);
		codesByName.put(CRTC_CreateCertificate.getCodeName().get(), CRTC_CreateCertificate);
		codesByName.put(CRTR_RenewCerificate.getCodeName().get(), CRTR_RenewCerificate);
		codesByName.put(CRTK_RevokeCertificate.getCodeName().get(), CRTK_RevokeCertificate);
		codesByName.put(WLSA_AddWhiteList.getCodeName().get(), WLSA_AddWhiteList);
		codesByName.put(WLSR_RemoveWhiteList.getCodeName().get(), WLSR_RemoveWhiteList);
		codesByName.put(CIDD_CardInitiatingDirectDebit.getCodeName().get(), CIDD_CardInitiatingDirectDebit);
	}

	public static CardPaymentServiceTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardPaymentServiceTypeCode[] values() {
		CardPaymentServiceTypeCode[] values = new CardPaymentServiceTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardPaymentServiceTypeCode> {
		@Override
		public CardPaymentServiceTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardPaymentServiceTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}