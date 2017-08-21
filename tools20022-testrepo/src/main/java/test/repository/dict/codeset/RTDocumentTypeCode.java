package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTDocumentTypeCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTDocumentTypeCode extends MMCodeSet {

	private final static AtomicReference<RTDocumentTypeCode> repoTypeRef = new AtomicReference<>();

	public static RTDocumentTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new RTDocumentTypeCode());
		return repoTypeRef.get();
	}

	private RTDocumentTypeCode() {
		super.code = Arrays.asList(MeteredServiceInvoice.repoType(),
				CreditNoteRelatedToFinancialAdjustment.repoType(),
				DebitNoteRelatedToFinancialAdjustment.repoType(),
				CommercialInvoice.repoType(), CreditNote.repoType(),
				DebitNote.repoType(), HireInvoice.repoType(),
				SelfBilledInvoice.repoType(),
				RemittanceAdviceMessage.repoType(),
				RelatedPaymentInstruction.repoType(),
				CommercialContract.repoType(),
				ForeignExchangeDealReference.repoType(),
				StatementOfAccount.repoType(), DispatchAdvice.repoType(),
				PurchaseOrder.repoType(),
				StructuredCommunicationReference.repoType(),
				BillOfLading.repoType(), Voucher.repoType(),
				AccountReceivableOpenItem.repoType(),
				TradeServicesUtilityTransaction.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("MSIN");
		super.name = "DocumentTypeCode";
		super.definition = "Specifies a type of financial or commercial document.";
	}

	static public class MeteredServiceInvoice extends MMCode {
		private final static AtomicReference<MeteredServiceInvoice> repoTypeRef = new AtomicReference<>();

		public static MeteredServiceInvoice repoType() {
			repoTypeRef.compareAndSet(null, new MeteredServiceInvoice());
			return repoTypeRef.get();
		}

		private MeteredServiceInvoice() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "MSIN";
			super.name = "MeteredServiceInvoice";
			super.definition = "Document is an invoice claiming payment for the supply of metered services, for example gas or electricity supplied to a fixed meter.";
		}
	}

	static public class CreditNoteRelatedToFinancialAdjustment extends MMCode {
		private final static AtomicReference<CreditNoteRelatedToFinancialAdjustment> repoTypeRef = new AtomicReference<>();

		public static CreditNoteRelatedToFinancialAdjustment repoType() {
			repoTypeRef.compareAndSet(null,
					new CreditNoteRelatedToFinancialAdjustment());
			return repoTypeRef.get();
		}

		private CreditNoteRelatedToFinancialAdjustment() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "CNFA";
			super.name = "CreditNoteRelatedToFinancialAdjustment";
			super.definition = "Document is a credit note for the final amount settled for a commercial transaction.";
		}
	}

	static public class DebitNoteRelatedToFinancialAdjustment extends MMCode {
		private final static AtomicReference<DebitNoteRelatedToFinancialAdjustment> repoTypeRef = new AtomicReference<>();

		public static DebitNoteRelatedToFinancialAdjustment repoType() {
			repoTypeRef.compareAndSet(null,
					new DebitNoteRelatedToFinancialAdjustment());
			return repoTypeRef.get();
		}

		private DebitNoteRelatedToFinancialAdjustment() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "DNFA";
			super.name = "DebitNoteRelatedToFinancialAdjustment";
			super.definition = "Document is a debit note for the final amount settled for a commercial transaction.";
		}
	}

	static public class CommercialInvoice extends MMCode {
		private final static AtomicReference<CommercialInvoice> repoTypeRef = new AtomicReference<>();

		public static CommercialInvoice repoType() {
			repoTypeRef.compareAndSet(null, new CommercialInvoice());
			return repoTypeRef.get();
		}

		private CommercialInvoice() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "CINV";
			super.name = "CommercialInvoice";
			super.definition = "Document is an invoice.";
		}
	}

	static public class CreditNote extends MMCode {
		private final static AtomicReference<CreditNote> repoTypeRef = new AtomicReference<>();

		public static CreditNote repoType() {
			repoTypeRef.compareAndSet(null, new CreditNote());
			return repoTypeRef.get();
		}

		private CreditNote() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "CREN";
			super.name = "CreditNote";
			super.definition = "Document is a credit note.";
		}
	}

	static public class DebitNote extends MMCode {
		private final static AtomicReference<DebitNote> repoTypeRef = new AtomicReference<>();

		public static DebitNote repoType() {
			repoTypeRef.compareAndSet(null, new DebitNote());
			return repoTypeRef.get();
		}

		private DebitNote() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "DEBN";
			super.name = "DebitNote";
			super.definition = "Document is a debit note.";
		}
	}

	static public class HireInvoice extends MMCode {
		private final static AtomicReference<HireInvoice> repoTypeRef = new AtomicReference<>();

		public static HireInvoice repoType() {
			repoTypeRef.compareAndSet(null, new HireInvoice());
			return repoTypeRef.get();
		}

		private HireInvoice() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "HIRI";
			super.name = "HireInvoice";
			super.definition = "Document is an invoice for the hiring of human resources or renting goods or equipment.";
		}
	}

	static public class SelfBilledInvoice extends MMCode {
		private final static AtomicReference<SelfBilledInvoice> repoTypeRef = new AtomicReference<>();

		public static SelfBilledInvoice repoType() {
			repoTypeRef.compareAndSet(null, new SelfBilledInvoice());
			return repoTypeRef.get();
		}

		private SelfBilledInvoice() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "SBIN";
			super.name = "SelfBilledInvoice";
			super.definition = "Document is an invoice issued by the debtor.";
		}
	}

	static public class RemittanceAdviceMessage extends MMCode {
		private final static AtomicReference<RemittanceAdviceMessage> repoTypeRef = new AtomicReference<>();

		public static RemittanceAdviceMessage repoType() {
			repoTypeRef.compareAndSet(null, new RemittanceAdviceMessage());
			return repoTypeRef.get();
		}

		private RemittanceAdviceMessage() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "RADM";
			super.name = "RemittanceAdviceMessage";
			super.definition = "Document is a remittance advice sent separately from the current transaction.";
		}
	}

	static public class RelatedPaymentInstruction extends MMCode {
		private final static AtomicReference<RelatedPaymentInstruction> repoTypeRef = new AtomicReference<>();

		public static RelatedPaymentInstruction repoType() {
			repoTypeRef.compareAndSet(null, new RelatedPaymentInstruction());
			return repoTypeRef.get();
		}

		private RelatedPaymentInstruction() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "RPIN";
			super.name = "RelatedPaymentInstruction";
			super.definition = "Document is a linked payment instruction to which the current payment instruction is related, eg, in a cover scenario.";
		}
	}

	static public class CommercialContract extends MMCode {
		private final static AtomicReference<CommercialContract> repoTypeRef = new AtomicReference<>();

		public static CommercialContract repoType() {
			repoTypeRef.compareAndSet(null, new CommercialContract());
			return repoTypeRef.get();
		}

		private CommercialContract() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "CMCN";
			super.name = "CommercialContract";
			super.definition = "Document is an agreement between the parties, stipulating the terms and conditions of the delivery of goods or services.";
		}
	}

	static public class ForeignExchangeDealReference extends MMCode {
		private final static AtomicReference<ForeignExchangeDealReference> repoTypeRef = new AtomicReference<>();

		public static ForeignExchangeDealReference repoType() {
			repoTypeRef.compareAndSet(null, new ForeignExchangeDealReference());
			return repoTypeRef.get();
		}

		private ForeignExchangeDealReference() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "FXDR";
			super.name = "ForeignExchangeDealReference";
			super.definition = "Document is a pre-agreed or pre-arranged foreign exchange transaction to which the payment transaction refers.";
		}
	}

	static public class StatementOfAccount extends MMCode {
		private final static AtomicReference<StatementOfAccount> repoTypeRef = new AtomicReference<>();

		public static StatementOfAccount repoType() {
			repoTypeRef.compareAndSet(null, new StatementOfAccount());
			return repoTypeRef.get();
		}

		private StatementOfAccount() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "SOAC";
			super.name = "StatementOfAccount";
			super.definition = "Document is a statement of the transactions posted to the debtor's account at the supplier.";
		}
	}

	static public class DispatchAdvice extends MMCode {
		private final static AtomicReference<DispatchAdvice> repoTypeRef = new AtomicReference<>();

		public static DispatchAdvice repoType() {
			repoTypeRef.compareAndSet(null, new DispatchAdvice());
			return repoTypeRef.get();
		}

		private DispatchAdvice() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "DISP";
			super.name = "DispatchAdvice";
			super.definition = "Document is a dispatch advice.";
		}
	}

	static public class PurchaseOrder extends MMCode {
		private final static AtomicReference<PurchaseOrder> repoTypeRef = new AtomicReference<>();

		public static PurchaseOrder repoType() {
			repoTypeRef.compareAndSet(null, new PurchaseOrder());
			return repoTypeRef.get();
		}

		private PurchaseOrder() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "PUOR";
			super.name = "PurchaseOrder";
			super.definition = "Document is a purchase order.";
		}
	}

	static public class StructuredCommunicationReference extends MMCode {
		private final static AtomicReference<StructuredCommunicationReference> repoTypeRef = new AtomicReference<>();

		public static StructuredCommunicationReference repoType() {
			repoTypeRef.compareAndSet(null,
					new StructuredCommunicationReference());
			return repoTypeRef.get();
		}

		private StructuredCommunicationReference() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "SCOR";
			super.name = "StructuredCommunicationReference";
			super.definition = "Document is a structured communication reference provided by the creditor to identify the referred transaction.";
		}
	}

	static public class BillOfLading extends MMCode {
		private final static AtomicReference<BillOfLading> repoTypeRef = new AtomicReference<>();

		public static BillOfLading repoType() {
			repoTypeRef.compareAndSet(null, new BillOfLading());
			return repoTypeRef.get();
		}

		private BillOfLading() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "BOLD";
			super.name = "BillOfLading";
			super.definition = "Document is a shipping notice.";
		}
	}

	static public class Voucher extends MMCode {
		private final static AtomicReference<Voucher> repoTypeRef = new AtomicReference<>();

		public static Voucher repoType() {
			repoTypeRef.compareAndSet(null, new Voucher());
			return repoTypeRef.get();
		}

		private Voucher() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "VCHR";
			super.name = "Voucher";
			super.definition = "Document is an electronic payment document.";
		}
	}

	static public class AccountReceivableOpenItem extends MMCode {
		private final static AtomicReference<AccountReceivableOpenItem> repoTypeRef = new AtomicReference<>();

		public static AccountReceivableOpenItem repoType() {
			repoTypeRef.compareAndSet(null, new AccountReceivableOpenItem());
			return repoTypeRef.get();
		}

		private AccountReceivableOpenItem() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "AROI";
			super.name = "AccountReceivableOpenItem";
			super.definition = "Document is a payment that applies to a specific source document.";
		}
	}

	static public class TradeServicesUtilityTransaction extends MMCode {
		private final static AtomicReference<TradeServicesUtilityTransaction> repoTypeRef = new AtomicReference<>();

		public static TradeServicesUtilityTransaction repoType() {
			repoTypeRef.compareAndSet(null,
					new TradeServicesUtilityTransaction());
			return repoTypeRef.get();
		}

		private TradeServicesUtilityTransaction() {
			super.owner_lazy = () -> RTDocumentTypeCode.repoType();
			super.codeName = "TSUT";
			super.name = "TradeServicesUtilityTransaction";
			super.definition = "Document is a transaction identifier as assigned by the Trade Services Utility.";
		}
	}
}