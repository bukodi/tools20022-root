package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.DocumentType6Code;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class DocumentType6Code extends MMCodeSet {

	private final static AtomicReference<DocumentType6Code> repoTypeRef = new AtomicReference<>();
	public final MMCode codeMeteredServiceInvoice = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "MeteredServiceInvoice";
		}
	};
	public final MMCode codeCreditNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "CreditNoteRelatedToFinancialAdjustment";
		}
	};
	public final MMCode codeDebitNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "DebitNoteRelatedToFinancialAdjustment";
		}
	};
	public final MMCode codeCommercialInvoice = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "CommercialInvoice";
		}
	};
	public final MMCode codeCreditNote = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "CreditNote";
		}
	};
	public final MMCode codeDebitNote = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "DebitNote";
		}
	};
	public final MMCode codeHireInvoice = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "HireInvoice";
		}
	};
	public final MMCode codeSelfBilledInvoice = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "SelfBilledInvoice";
		}
	};
	public final MMCode codeCommercialContract = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "CommercialContract";
		}
	};
	public final MMCode codeStatementOfAccount = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "StatementOfAccount";
		}
	};
	public final MMCode codeDispatchAdvice = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "DispatchAdvice";
		}
	};
	public final MMCode codeBillOfLading = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "BillOfLading";
		}
	};
	public final MMCode codeVoucher = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "Voucher";
		}
	};
	public final MMCode codeAccountReceivableOpenItem = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "AccountReceivableOpenItem";
		}
	};
	public final MMCode codeTradeServicesUtilityTransaction = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "TradeServicesUtilityTransaction";
		}
	};
	public final MMCode codePurchaseOrder = new MMCode() {
		{
			super.owner_lazy = () -> DocumentType6Code.repoType();
			super.name = "PurchaseOrder";
		}
	};

	public static DocumentType6Code repoType() {
		repoTypeRef.compareAndSet(null, new DocumentType6Code());
		return repoTypeRef.get();
	}

	private DocumentType6Code() {
		super.code = Arrays.asList(codeMeteredServiceInvoice,
				codeCreditNoteRelatedToFinancialAdjustment,
				codeDebitNoteRelatedToFinancialAdjustment,
				codeCommercialInvoice, codeCreditNote, codeDebitNote,
				codeHireInvoice, codeSelfBilledInvoice, codeCommercialContract,
				codeStatementOfAccount, codeDispatchAdvice, codeBillOfLading,
				codeVoucher, codeAccountReceivableOpenItem,
				codeTradeServicesUtilityTransaction, codePurchaseOrder);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "DocumentType6Code";
		super.definition = "Specifies a type of financial or commercial document.";
		super.example = Arrays.asList("MSIN");
	}
}