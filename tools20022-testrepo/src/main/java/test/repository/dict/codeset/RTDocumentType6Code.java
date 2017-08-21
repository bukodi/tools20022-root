package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTDocumentType6Code;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTDocumentType6Code extends MMCodeSet {

	private final static AtomicReference<RTDocumentType6Code> repoTypeRef = new AtomicReference<>();

	public static RTDocumentType6Code repoType() {
		repoTypeRef.compareAndSet(null, new RTDocumentType6Code());
		return repoTypeRef.get();
	}

	private RTDocumentType6Code() {
		super.code = Arrays.asList(MeteredServiceInvoice.repoType(),
				CreditNoteRelatedToFinancialAdjustment.repoType(),
				DebitNoteRelatedToFinancialAdjustment.repoType(),
				CommercialInvoice.repoType(), CreditNote.repoType(),
				DebitNote.repoType(), HireInvoice.repoType(),
				SelfBilledInvoice.repoType(), CommercialContract.repoType(),
				StatementOfAccount.repoType(), DispatchAdvice.repoType(),
				BillOfLading.repoType(), Voucher.repoType(),
				AccountReceivableOpenItem.repoType(),
				TradeServicesUtilityTransaction.repoType(),
				PurchaseOrder.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("MSIN");
		super.name = "DocumentType6Code";
		super.definition = "Specifies a type of financial or commercial document.";
	}

	static public class MeteredServiceInvoice extends MMCode {
		private final static AtomicReference<MeteredServiceInvoice> repoTypeRef = new AtomicReference<>();

		public static MeteredServiceInvoice repoType() {
			repoTypeRef.compareAndSet(null, new MeteredServiceInvoice());
			return repoTypeRef.get();
		}

		private MeteredServiceInvoice() {
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "MeteredServiceInvoice";
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
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "CreditNoteRelatedToFinancialAdjustment";
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
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "DebitNoteRelatedToFinancialAdjustment";
		}
	}

	static public class CommercialInvoice extends MMCode {
		private final static AtomicReference<CommercialInvoice> repoTypeRef = new AtomicReference<>();

		public static CommercialInvoice repoType() {
			repoTypeRef.compareAndSet(null, new CommercialInvoice());
			return repoTypeRef.get();
		}

		private CommercialInvoice() {
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "CommercialInvoice";
		}
	}

	static public class CreditNote extends MMCode {
		private final static AtomicReference<CreditNote> repoTypeRef = new AtomicReference<>();

		public static CreditNote repoType() {
			repoTypeRef.compareAndSet(null, new CreditNote());
			return repoTypeRef.get();
		}

		private CreditNote() {
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "CreditNote";
		}
	}

	static public class DebitNote extends MMCode {
		private final static AtomicReference<DebitNote> repoTypeRef = new AtomicReference<>();

		public static DebitNote repoType() {
			repoTypeRef.compareAndSet(null, new DebitNote());
			return repoTypeRef.get();
		}

		private DebitNote() {
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "DebitNote";
		}
	}

	static public class HireInvoice extends MMCode {
		private final static AtomicReference<HireInvoice> repoTypeRef = new AtomicReference<>();

		public static HireInvoice repoType() {
			repoTypeRef.compareAndSet(null, new HireInvoice());
			return repoTypeRef.get();
		}

		private HireInvoice() {
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "HireInvoice";
		}
	}

	static public class SelfBilledInvoice extends MMCode {
		private final static AtomicReference<SelfBilledInvoice> repoTypeRef = new AtomicReference<>();

		public static SelfBilledInvoice repoType() {
			repoTypeRef.compareAndSet(null, new SelfBilledInvoice());
			return repoTypeRef.get();
		}

		private SelfBilledInvoice() {
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "SelfBilledInvoice";
		}
	}

	static public class CommercialContract extends MMCode {
		private final static AtomicReference<CommercialContract> repoTypeRef = new AtomicReference<>();

		public static CommercialContract repoType() {
			repoTypeRef.compareAndSet(null, new CommercialContract());
			return repoTypeRef.get();
		}

		private CommercialContract() {
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "CommercialContract";
		}
	}

	static public class StatementOfAccount extends MMCode {
		private final static AtomicReference<StatementOfAccount> repoTypeRef = new AtomicReference<>();

		public static StatementOfAccount repoType() {
			repoTypeRef.compareAndSet(null, new StatementOfAccount());
			return repoTypeRef.get();
		}

		private StatementOfAccount() {
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "StatementOfAccount";
		}
	}

	static public class DispatchAdvice extends MMCode {
		private final static AtomicReference<DispatchAdvice> repoTypeRef = new AtomicReference<>();

		public static DispatchAdvice repoType() {
			repoTypeRef.compareAndSet(null, new DispatchAdvice());
			return repoTypeRef.get();
		}

		private DispatchAdvice() {
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "DispatchAdvice";
		}
	}

	static public class BillOfLading extends MMCode {
		private final static AtomicReference<BillOfLading> repoTypeRef = new AtomicReference<>();

		public static BillOfLading repoType() {
			repoTypeRef.compareAndSet(null, new BillOfLading());
			return repoTypeRef.get();
		}

		private BillOfLading() {
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "BillOfLading";
		}
	}

	static public class Voucher extends MMCode {
		private final static AtomicReference<Voucher> repoTypeRef = new AtomicReference<>();

		public static Voucher repoType() {
			repoTypeRef.compareAndSet(null, new Voucher());
			return repoTypeRef.get();
		}

		private Voucher() {
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "Voucher";
		}
	}

	static public class AccountReceivableOpenItem extends MMCode {
		private final static AtomicReference<AccountReceivableOpenItem> repoTypeRef = new AtomicReference<>();

		public static AccountReceivableOpenItem repoType() {
			repoTypeRef.compareAndSet(null, new AccountReceivableOpenItem());
			return repoTypeRef.get();
		}

		private AccountReceivableOpenItem() {
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "AccountReceivableOpenItem";
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
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "TradeServicesUtilityTransaction";
		}
	}

	static public class PurchaseOrder extends MMCode {
		private final static AtomicReference<PurchaseOrder> repoTypeRef = new AtomicReference<>();

		public static PurchaseOrder repoType() {
			repoTypeRef.compareAndSet(null, new PurchaseOrder());
			return repoTypeRef.get();
		}

		private PurchaseOrder() {
			super.owner_lazy = () -> RTDocumentType6Code.repoType();
			super.name = "PurchaseOrder";
		}
	}
}