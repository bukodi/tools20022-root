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
import com.tools20022.repository.codeset.DocumentType6Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
 * DocumentTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#MSIN_MeteredServiceInvoice
 * DocumentType6Code.MSIN_MeteredServiceInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#CNFA_CreditNoteRelatedToFinancialAdjustment
 * DocumentType6Code.CNFA_CreditNoteRelatedToFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#DNFA_DebitNoteRelatedToFinancialAdjustment
 * DocumentType6Code.DNFA_DebitNoteRelatedToFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#CINV_CommercialInvoice
 * DocumentType6Code.CINV_CommercialInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#CREN_CreditNote
 * DocumentType6Code.CREN_CreditNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#DEBN_DebitNote
 * DocumentType6Code.DEBN_DebitNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#HIRI_HireInvoice
 * DocumentType6Code.HIRI_HireInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#SBIN_SelfBilledInvoice
 * DocumentType6Code.SBIN_SelfBilledInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#CMCN_CommercialContract
 * DocumentType6Code.CMCN_CommercialContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#SOAC_StatementOfAccount
 * DocumentType6Code.SOAC_StatementOfAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#DISP_DispatchAdvice
 * DocumentType6Code.DISP_DispatchAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#BOLD_BillOfLading
 * DocumentType6Code.BOLD_BillOfLading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#VCHR_Voucher
 * DocumentType6Code.VCHR_Voucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#AROI_AccountReceivableOpenItem
 * DocumentType6Code.AROI_AccountReceivableOpenItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#TSUT_TradeServicesUtilityTransaction
 * DocumentType6Code.TSUT_TradeServicesUtilityTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#PUOR_PurchaseOrder
 * DocumentType6Code.PUOR_PurchaseOrder}</li>
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
 * "DocumentType6Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DocumentType6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeteredServiceInvoice"</li>
	 * </ul>
	 */
	public static final DocumentType6Code MSIN_MeteredServiceInvoice = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeteredServiceInvoice";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.MSIN_MeteredServiceInvoice.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNoteRelatedToFinancialAdjustment"</li>
	 * </ul>
	 */
	public static final DocumentType6Code CNFA_CreditNoteRelatedToFinancialAdjustment = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNoteRelatedToFinancialAdjustment";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.CNFA_CreditNoteRelatedToFinancialAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitNoteRelatedToFinancialAdjustment"</li>
	 * </ul>
	 */
	public static final DocumentType6Code DNFA_DebitNoteRelatedToFinancialAdjustment = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitNoteRelatedToFinancialAdjustment";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.DNFA_DebitNoteRelatedToFinancialAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialInvoice"</li>
	 * </ul>
	 */
	public static final DocumentType6Code CINV_CommercialInvoice = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialInvoice";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.CINV_CommercialInvoice.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNote"</li>
	 * </ul>
	 */
	public static final DocumentType6Code CREN_CreditNote = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNote";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.CREN_CreditNote.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitNote"</li>
	 * </ul>
	 */
	public static final DocumentType6Code DEBN_DebitNote = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitNote";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.DEBN_DebitNote.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HireInvoice"</li>
	 * </ul>
	 */
	public static final DocumentType6Code HIRI_HireInvoice = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HireInvoice";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.HIRI_HireInvoice.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfBilledInvoice"</li>
	 * </ul>
	 */
	public static final DocumentType6Code SBIN_SelfBilledInvoice = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfBilledInvoice";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.SBIN_SelfBilledInvoice.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialContract"</li>
	 * </ul>
	 */
	public static final DocumentType6Code CMCN_CommercialContract = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialContract";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.CMCN_CommercialContract.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementOfAccount"</li>
	 * </ul>
	 */
	public static final DocumentType6Code SOAC_StatementOfAccount = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementOfAccount";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.SOAC_StatementOfAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DispatchAdvice"</li>
	 * </ul>
	 */
	public static final DocumentType6Code DISP_DispatchAdvice = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DispatchAdvice";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.DISP_DispatchAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillOfLading"</li>
	 * </ul>
	 */
	public static final DocumentType6Code BOLD_BillOfLading = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillOfLading";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.BOLD_BillOfLading.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Voucher"</li>
	 * </ul>
	 */
	public static final DocumentType6Code VCHR_Voucher = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Voucher";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.VCHR_Voucher.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountReceivableOpenItem"</li>
	 * </ul>
	 */
	public static final DocumentType6Code AROI_AccountReceivableOpenItem = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountReceivableOpenItem";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.AROI_AccountReceivableOpenItem.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeServicesUtilityTransaction"</li>
	 * </ul>
	 */
	public static final DocumentType6Code TSUT_TradeServicesUtilityTransaction = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeServicesUtilityTransaction";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.TSUT_TradeServicesUtilityTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrder"</li>
	 * </ul>
	 */
	public static final DocumentType6Code PUOR_PurchaseOrder = new DocumentType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrder";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.DocumentType6Code.mmObject());
			codeName = DocumentTypeCode.PUOR_PurchaseOrder.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DocumentType6Code> codesByName = new LinkedHashMap<>();

	protected DocumentType6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("MSIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentType6Code";
				definition = "Specifies a type of financial or commercial document.";
				trace_lazy = LazyReference.create(() -> DocumentTypeCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.DocumentType6Code.MSIN_MeteredServiceInvoice,
						com.tools20022.repository.codeset.DocumentType6Code.CNFA_CreditNoteRelatedToFinancialAdjustment, com.tools20022.repository.codeset.DocumentType6Code.DNFA_DebitNoteRelatedToFinancialAdjustment,
						com.tools20022.repository.codeset.DocumentType6Code.CINV_CommercialInvoice, com.tools20022.repository.codeset.DocumentType6Code.CREN_CreditNote, com.tools20022.repository.codeset.DocumentType6Code.DEBN_DebitNote,
						com.tools20022.repository.codeset.DocumentType6Code.HIRI_HireInvoice, com.tools20022.repository.codeset.DocumentType6Code.SBIN_SelfBilledInvoice,
						com.tools20022.repository.codeset.DocumentType6Code.CMCN_CommercialContract, com.tools20022.repository.codeset.DocumentType6Code.SOAC_StatementOfAccount,
						com.tools20022.repository.codeset.DocumentType6Code.DISP_DispatchAdvice, com.tools20022.repository.codeset.DocumentType6Code.BOLD_BillOfLading, com.tools20022.repository.codeset.DocumentType6Code.VCHR_Voucher,
						com.tools20022.repository.codeset.DocumentType6Code.AROI_AccountReceivableOpenItem, com.tools20022.repository.codeset.DocumentType6Code.TSUT_TradeServicesUtilityTransaction,
						com.tools20022.repository.codeset.DocumentType6Code.PUOR_PurchaseOrder));
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
		codesByName.put(CMCN_CommercialContract.getCodeName().get(), CMCN_CommercialContract);
		codesByName.put(SOAC_StatementOfAccount.getCodeName().get(), SOAC_StatementOfAccount);
		codesByName.put(DISP_DispatchAdvice.getCodeName().get(), DISP_DispatchAdvice);
		codesByName.put(BOLD_BillOfLading.getCodeName().get(), BOLD_BillOfLading);
		codesByName.put(VCHR_Voucher.getCodeName().get(), VCHR_Voucher);
		codesByName.put(AROI_AccountReceivableOpenItem.getCodeName().get(), AROI_AccountReceivableOpenItem);
		codesByName.put(TSUT_TradeServicesUtilityTransaction.getCodeName().get(), TSUT_TradeServicesUtilityTransaction);
		codesByName.put(PUOR_PurchaseOrder.getCodeName().get(), PUOR_PurchaseOrder);
	}

	public static DocumentType6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DocumentType6Code[] values() {
		DocumentType6Code[] values = new DocumentType6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DocumentType6Code> {
		@Override
		public DocumentType6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DocumentType6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}