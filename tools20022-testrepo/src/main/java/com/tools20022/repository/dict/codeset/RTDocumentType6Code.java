package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTDocumentType6Code;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies a type of financial or commercial document.
 */
public class RTDocumentType6Code extends MMCodeSet {

	private final static AtomicReference<RTDocumentType6Code> repoTypeRef = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public final MMCode codeMeteredServiceInvoice = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "MeteredServiceInvoice";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeCreditNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "CreditNoteRelatedToFinancialAdjustment";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeDebitNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "DebitNoteRelatedToFinancialAdjustment";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeCommercialInvoice = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "CommercialInvoice";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeCreditNote = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "CreditNote";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeDebitNote = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "DebitNote";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeHireInvoice = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "HireInvoice";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeSelfBilledInvoice = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "SelfBilledInvoice";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeCommercialContract = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "CommercialContract";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeStatementOfAccount = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "StatementOfAccount";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeDispatchAdvice = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "DispatchAdvice";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeBillOfLading = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "BillOfLading";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeVoucher = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "Voucher";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeAccountReceivableOpenItem = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "AccountReceivableOpenItem";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeTradeServicesUtilityTransaction = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "TradeServicesUtilityTransaction";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codePurchaseOrder = new MMCode() {
		{
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "PurchaseOrder";
		}
	};

	public static RTDocumentType6Code repoType() {
		repoTypeRef.compareAndSet(null, new RTDocumentType6Code());
		return repoTypeRef.get();
	}

	private RTDocumentType6Code() {
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
	} }