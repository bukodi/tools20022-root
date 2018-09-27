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
import com.tools20022.repository.codeset.DocumentTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a type of financial or commercial document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#MSIN_MeteredServiceInvoice
 * DocumentTypeCode.MSIN_MeteredServiceInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#CNFA_CreditNoteRelatedToFinancialAdjustment
 * DocumentTypeCode.CNFA_CreditNoteRelatedToFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#DNFA_DebitNoteRelatedToFinancialAdjustment
 * DocumentTypeCode.DNFA_DebitNoteRelatedToFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#CINV_CommercialInvoice
 * DocumentTypeCode.CINV_CommercialInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#CREN_CreditNote
 * DocumentTypeCode.CREN_CreditNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#DEBN_DebitNote
 * DocumentTypeCode.DEBN_DebitNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#HIRI_HireInvoice
 * DocumentTypeCode.HIRI_HireInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#SBIN_SelfBilledInvoice
 * DocumentTypeCode.SBIN_SelfBilledInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#RADM_RemittanceAdviceMessage
 * DocumentTypeCode.RADM_RemittanceAdviceMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#RPIN_RelatedPaymentInstruction
 * DocumentTypeCode.RPIN_RelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#CMCN_CommercialContract
 * DocumentTypeCode.CMCN_CommercialContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#FXDR_ForeignExchangeDealReference
 * DocumentTypeCode.FXDR_ForeignExchangeDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#SOAC_StatementOfAccount
 * DocumentTypeCode.SOAC_StatementOfAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#DISP_DispatchAdvice
 * DocumentTypeCode.DISP_DispatchAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#PUOR_PurchaseOrder
 * DocumentTypeCode.PUOR_PurchaseOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#SCOR_StructuredCommunicationReference
 * DocumentTypeCode.SCOR_StructuredCommunicationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#BOLD_BillOfLading
 * DocumentTypeCode.BOLD_BillOfLading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#VCHR_Voucher
 * DocumentTypeCode.VCHR_Voucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#AROI_AccountReceivableOpenItem
 * DocumentTypeCode.AROI_AccountReceivableOpenItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#TSUT_TradeServicesUtilityTransaction
 * DocumentTypeCode.TSUT_TradeServicesUtilityTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DocumentType3Code
 * DocumentType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DocumentType5Code
 * DocumentType5Code}</li>
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
 * <li>"MSIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DocumentTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of financial or commercial document."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DocumentTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Document is an invoice claiming payment for the supply of metered
	 * services, for example gas or electricity supplied to a fixed meter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeteredServiceInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is an invoice claiming payment for the supply of metered services, for example gas or electricity supplied to a fixed meter."
	 * </li>
	 * </ul>
	 */
	public static final DocumentTypeCode MSIN_MeteredServiceInvoice = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeteredServiceInvoice";
			definition = "Document is an invoice claiming payment for the supply of metered services, for example gas or electricity supplied to a fixed meter.";
			codeName = "MSIN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is a credit note for the final amount settled for a commercial
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNFA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNoteRelatedToFinancialAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a credit note for the final amount settled for a commercial transaction."
	 * </li>
	 * </ul>
	 */
	public static final DocumentTypeCode CNFA_CreditNoteRelatedToFinancialAdjustment = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditNoteRelatedToFinancialAdjustment";
			definition = "Document is a credit note for the final amount settled for a commercial transaction.";
			codeName = "CNFA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is a debit note for the final amount settled for a commercial
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DNFA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitNoteRelatedToFinancialAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a debit note for the final amount settled for a commercial transaction."
	 * </li>
	 * </ul>
	 */
	public static final DocumentTypeCode DNFA_DebitNoteRelatedToFinancialAdjustment = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitNoteRelatedToFinancialAdjustment";
			definition = "Document is a debit note for the final amount settled for a commercial transaction.";
			codeName = "DNFA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is an invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CINV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is an invoice."</li>
	 * </ul>
	 */
	public static final DocumentTypeCode CINV_CommercialInvoice = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialInvoice";
			definition = "Document is an invoice.";
			codeName = "CINV";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is a credit note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CREN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is a credit note."</li>
	 * </ul>
	 */
	public static final DocumentTypeCode CREN_CreditNote = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditNote";
			definition = "Document is a credit note.";
			codeName = "CREN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is a debit note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEBN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is a debit note."</li>
	 * </ul>
	 */
	public static final DocumentTypeCode DEBN_DebitNote = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitNote";
			definition = "Document is a debit note.";
			codeName = "DEBN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is an invoice for the hiring of human resources or renting goods
	 * or equipment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HIRI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HireInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is an invoice for the hiring of human resources or renting goods or equipment."
	 * </li>
	 * </ul>
	 */
	public static final DocumentTypeCode HIRI_HireInvoice = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HireInvoice";
			definition = "Document is an invoice for the hiring of human resources or renting goods or equipment.";
			codeName = "HIRI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is an invoice issued by the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfBilledInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is an invoice issued by the debtor."</li>
	 * </ul>
	 */
	public static final DocumentTypeCode SBIN_SelfBilledInvoice = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SelfBilledInvoice";
			definition = "Document is an invoice issued by the debtor.";
			codeName = "SBIN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is a remittance advice sent separately from the current
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RADM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceAdviceMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a remittance advice sent separately from the current transaction."
	 * </li>
	 * </ul>
	 */
	public static final DocumentTypeCode RADM_RemittanceAdviceMessage = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemittanceAdviceMessage";
			definition = "Document is a remittance advice sent separately from the current transaction.";
			codeName = "RADM";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is a linked payment instruction to which the current payment
	 * instruction is related, eg, in a cover scenario.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a linked payment instruction to which the current payment instruction is related, eg, in a cover scenario."
	 * </li>
	 * </ul>
	 */
	public static final DocumentTypeCode RPIN_RelatedPaymentInstruction = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentInstruction";
			definition = "Document is a linked payment instruction to which the current payment instruction is related, eg, in a cover scenario.";
			codeName = "RPIN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is an agreement between the parties, stipulating the terms and
	 * conditions of the delivery of goods or services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMCN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is an agreement between the parties, stipulating the terms and conditions of the delivery of goods or services."
	 * </li>
	 * </ul>
	 */
	public static final DocumentTypeCode CMCN_CommercialContract = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialContract";
			definition = "Document is an agreement between the parties, stipulating the terms and conditions of the delivery of goods or services.";
			codeName = "CMCN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is a pre-agreed or pre-arranged foreign exchange transaction to
	 * which the payment transaction refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FXDR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDealReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a pre-agreed or pre-arranged foreign exchange transaction to which the payment transaction refers."
	 * </li>
	 * </ul>
	 */
	public static final DocumentTypeCode FXDR_ForeignExchangeDealReference = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeDealReference";
			definition = "Document is a pre-agreed or pre-arranged foreign exchange transaction to which the payment transaction refers.";
			codeName = "FXDR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is a statement of the transactions posted to the debtor's
	 * account at the supplier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOAC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementOfAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a statement of the transactions posted to the debtor's account at the supplier."
	 * </li>
	 * </ul>
	 */
	public static final DocumentTypeCode SOAC_StatementOfAccount = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatementOfAccount";
			definition = "Document is a statement of the transactions posted to the debtor's account at the supplier.";
			codeName = "SOAC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is a dispatch advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DispatchAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is a dispatch advice."</li>
	 * </ul>
	 */
	public static final DocumentTypeCode DISP_DispatchAdvice = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DispatchAdvice";
			definition = "Document is a dispatch advice.";
			codeName = "DISP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is a purchase order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUOR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is a purchase order."</li>
	 * </ul>
	 */
	public static final DocumentTypeCode PUOR_PurchaseOrder = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PurchaseOrder";
			definition = "Document is a purchase order.";
			codeName = "PUOR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is a structured communication reference provided by the creditor
	 * to identify the referred transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCOR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StructuredCommunicationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a structured communication reference provided by the creditor to identify the referred transaction."
	 * </li>
	 * </ul>
	 */
	public static final DocumentTypeCode SCOR_StructuredCommunicationReference = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StructuredCommunicationReference";
			definition = "Document is a structured communication reference provided by the creditor to identify the referred transaction.";
			codeName = "SCOR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is a shipping notice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOLD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillOfLading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is a shipping notice."</li>
	 * </ul>
	 */
	public static final DocumentTypeCode BOLD_BillOfLading = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BillOfLading";
			definition = "Document is a shipping notice.";
			codeName = "BOLD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is an electronic payment document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VCHR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Voucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is an electronic payment document."</li>
	 * </ul>
	 */
	public static final DocumentTypeCode VCHR_Voucher = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Voucher";
			definition = "Document is an electronic payment document.";
			codeName = "VCHR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is a payment that applies to a specific source document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AROI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountReceivableOpenItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a payment that applies to a specific source document."</li>
	 * </ul>
	 */
	public static final DocumentTypeCode AROI_AccountReceivableOpenItem = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountReceivableOpenItem";
			definition = "Document is a payment that applies to a specific source document.";
			codeName = "AROI";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	/**
	 * Document is a transaction identifier as assigned by the Trade Services
	 * Utility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TSUT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeServicesUtilityTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a transaction identifier as assigned by the Trade Services Utility."
	 * </li>
	 * </ul>
	 */
	public static final DocumentTypeCode TSUT_TradeServicesUtilityTransaction = new DocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeServicesUtilityTransaction";
			definition = "Document is a transaction identifier as assigned by the Trade Services Utility.";
			codeName = "TSUT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentTypeCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, DocumentTypeCode> codesByName = new LinkedHashMap<>();

	protected DocumentTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("MSIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentTypeCode";
				definition = "Specifies a type of financial or commercial document.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(DocumentType3Code.mmObject(), DocumentType5Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.DocumentTypeCode.MSIN_MeteredServiceInvoice,
						com.tools20022.repository.codeset.DocumentTypeCode.CNFA_CreditNoteRelatedToFinancialAdjustment, com.tools20022.repository.codeset.DocumentTypeCode.DNFA_DebitNoteRelatedToFinancialAdjustment,
						com.tools20022.repository.codeset.DocumentTypeCode.CINV_CommercialInvoice, com.tools20022.repository.codeset.DocumentTypeCode.CREN_CreditNote, com.tools20022.repository.codeset.DocumentTypeCode.DEBN_DebitNote,
						com.tools20022.repository.codeset.DocumentTypeCode.HIRI_HireInvoice, com.tools20022.repository.codeset.DocumentTypeCode.SBIN_SelfBilledInvoice,
						com.tools20022.repository.codeset.DocumentTypeCode.RADM_RemittanceAdviceMessage, com.tools20022.repository.codeset.DocumentTypeCode.RPIN_RelatedPaymentInstruction,
						com.tools20022.repository.codeset.DocumentTypeCode.CMCN_CommercialContract, com.tools20022.repository.codeset.DocumentTypeCode.FXDR_ForeignExchangeDealReference,
						com.tools20022.repository.codeset.DocumentTypeCode.SOAC_StatementOfAccount, com.tools20022.repository.codeset.DocumentTypeCode.DISP_DispatchAdvice,
						com.tools20022.repository.codeset.DocumentTypeCode.PUOR_PurchaseOrder, com.tools20022.repository.codeset.DocumentTypeCode.SCOR_StructuredCommunicationReference,
						com.tools20022.repository.codeset.DocumentTypeCode.BOLD_BillOfLading, com.tools20022.repository.codeset.DocumentTypeCode.VCHR_Voucher,
						com.tools20022.repository.codeset.DocumentTypeCode.AROI_AccountReceivableOpenItem, com.tools20022.repository.codeset.DocumentTypeCode.TSUT_TradeServicesUtilityTransaction));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MSIN_MeteredServiceInvoice.getCodeName().get(), MSIN_MeteredServiceInvoice);
		codesByName.put(CNFA_CreditNoteRelatedToFinancialAdjustment.getCodeName().get(), CNFA_CreditNoteRelatedToFinancialAdjustment);
		codesByName.put(DNFA_DebitNoteRelatedToFinancialAdjustment.getCodeName().get(), DNFA_DebitNoteRelatedToFinancialAdjustment);
		codesByName.put(CINV_CommercialInvoice.getCodeName().get(), CINV_CommercialInvoice);
		codesByName.put(CREN_CreditNote.getCodeName().get(), CREN_CreditNote);
		codesByName.put(DEBN_DebitNote.getCodeName().get(), DEBN_DebitNote);
		codesByName.put(HIRI_HireInvoice.getCodeName().get(), HIRI_HireInvoice);
		codesByName.put(SBIN_SelfBilledInvoice.getCodeName().get(), SBIN_SelfBilledInvoice);
		codesByName.put(RADM_RemittanceAdviceMessage.getCodeName().get(), RADM_RemittanceAdviceMessage);
		codesByName.put(RPIN_RelatedPaymentInstruction.getCodeName().get(), RPIN_RelatedPaymentInstruction);
		codesByName.put(CMCN_CommercialContract.getCodeName().get(), CMCN_CommercialContract);
		codesByName.put(FXDR_ForeignExchangeDealReference.getCodeName().get(), FXDR_ForeignExchangeDealReference);
		codesByName.put(SOAC_StatementOfAccount.getCodeName().get(), SOAC_StatementOfAccount);
		codesByName.put(DISP_DispatchAdvice.getCodeName().get(), DISP_DispatchAdvice);
		codesByName.put(PUOR_PurchaseOrder.getCodeName().get(), PUOR_PurchaseOrder);
		codesByName.put(SCOR_StructuredCommunicationReference.getCodeName().get(), SCOR_StructuredCommunicationReference);
		codesByName.put(BOLD_BillOfLading.getCodeName().get(), BOLD_BillOfLading);
		codesByName.put(VCHR_Voucher.getCodeName().get(), VCHR_Voucher);
		codesByName.put(AROI_AccountReceivableOpenItem.getCodeName().get(), AROI_AccountReceivableOpenItem);
		codesByName.put(TSUT_TradeServicesUtilityTransaction.getCodeName().get(), TSUT_TradeServicesUtilityTransaction);
	}

	public static DocumentTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DocumentTypeCode[] values() {
		DocumentTypeCode[] values = new DocumentTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DocumentTypeCode> {
		@Override
		public DocumentTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DocumentTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}