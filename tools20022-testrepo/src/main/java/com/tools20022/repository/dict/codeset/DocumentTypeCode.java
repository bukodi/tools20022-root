package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.DocumentTypeCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class DocumentTypeCode extends MMCodeSet {

	private final static AtomicReference<DocumentTypeCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeMeteredServiceInvoice = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "MSIN";
			super.name = "MeteredServiceInvoice";
			super.definition = "Document is an invoice claiming payment for the supply of metered services, for example gas or electricity supplied to a fixed meter.";
		}
	};
	public final MMCode codeCreditNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "CNFA";
			super.name = "CreditNoteRelatedToFinancialAdjustment";
			super.definition = "Document is a credit note for the final amount settled for a commercial transaction.";
		}
	};
	public final MMCode codeDebitNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "DNFA";
			super.name = "DebitNoteRelatedToFinancialAdjustment";
			super.definition = "Document is a debit note for the final amount settled for a commercial transaction.";
		}
	};
	public final MMCode codeCommercialInvoice = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "CINV";
			super.name = "CommercialInvoice";
			super.definition = "Document is an invoice.";
		}
	};
	public final MMCode codeCreditNote = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "CREN";
			super.name = "CreditNote";
			super.definition = "Document is a credit note.";
		}
	};
	public final MMCode codeDebitNote = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "DEBN";
			super.name = "DebitNote";
			super.definition = "Document is a debit note.";
		}
	};
	public final MMCode codeHireInvoice = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "HIRI";
			super.name = "HireInvoice";
			super.definition = "Document is an invoice for the hiring of human resources or renting goods or equipment.";
		}
	};
	public final MMCode codeSelfBilledInvoice = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "SBIN";
			super.name = "SelfBilledInvoice";
			super.definition = "Document is an invoice issued by the debtor.";
		}
	};
	public final MMCode codeRemittanceAdviceMessage = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "RADM";
			super.name = "RemittanceAdviceMessage";
			super.definition = "Document is a remittance advice sent separately from the current transaction.";
		}
	};
	public final MMCode codeRelatedPaymentInstruction = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "RPIN";
			super.name = "RelatedPaymentInstruction";
			super.definition = "Document is a linked payment instruction to which the current payment instruction is related, eg, in a cover scenario.";
		}
	};
	public final MMCode codeCommercialContract = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "CMCN";
			super.name = "CommercialContract";
			super.definition = "Document is an agreement between the parties, stipulating the terms and conditions of the delivery of goods or services.";
		}
	};
	public final MMCode codeForeignExchangeDealReference = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "FXDR";
			super.name = "ForeignExchangeDealReference";
			super.definition = "Document is a pre-agreed or pre-arranged foreign exchange transaction to which the payment transaction refers.";
		}
	};
	public final MMCode codeStatementOfAccount = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "SOAC";
			super.name = "StatementOfAccount";
			super.definition = "Document is a statement of the transactions posted to the debtor's account at the supplier.";
		}
	};
	public final MMCode codeDispatchAdvice = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "DISP";
			super.name = "DispatchAdvice";
			super.definition = "Document is a dispatch advice.";
		}
	};
	public final MMCode codePurchaseOrder = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "PUOR";
			super.name = "PurchaseOrder";
			super.definition = "Document is a purchase order.";
		}
	};
	public final MMCode codeStructuredCommunicationReference = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "SCOR";
			super.name = "StructuredCommunicationReference";
			super.definition = "Document is a structured communication reference provided by the creditor to identify the referred transaction.";
		}
	};
	public final MMCode codeBillOfLading = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "BOLD";
			super.name = "BillOfLading";
			super.definition = "Document is a shipping notice.";
		}
	};
	public final MMCode codeVoucher = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "VCHR";
			super.name = "Voucher";
			super.definition = "Document is an electronic payment document.";
		}
	};
	public final MMCode codeAccountReceivableOpenItem = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "AROI";
			super.name = "AccountReceivableOpenItem";
			super.definition = "Document is a payment that applies to a specific source document.";
		}
	};
	public final MMCode codeTradeServicesUtilityTransaction = new MMCode() {
		{
			super.owner_lazy = () -> DocumentTypeCode.repoType();
			super.codeName = "TSUT";
			super.name = "TradeServicesUtilityTransaction";
			super.definition = "Document is a transaction identifier as assigned by the Trade Services Utility.";
		}
	};

	public static DocumentTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new DocumentTypeCode());
		return repoTypeRef.get();
	}

	private DocumentTypeCode() {
		super.code = Arrays.asList(codeMeteredServiceInvoice,
				codeCreditNoteRelatedToFinancialAdjustment,
				codeDebitNoteRelatedToFinancialAdjustment,
				codeCommercialInvoice, codeCreditNote, codeDebitNote,
				codeHireInvoice, codeSelfBilledInvoice,
				codeRemittanceAdviceMessage, codeRelatedPaymentInstruction,
				codeCommercialContract, codeForeignExchangeDealReference,
				codeStatementOfAccount, codeDispatchAdvice, codePurchaseOrder,
				codeStructuredCommunicationReference, codeBillOfLading,
				codeVoucher, codeAccountReceivableOpenItem,
				codeTradeServicesUtilityTransaction);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "DocumentTypeCode";
		super.definition = "Specifies a type of financial or commercial document.";
		super.example = Arrays.asList("MSIN");
	}
}