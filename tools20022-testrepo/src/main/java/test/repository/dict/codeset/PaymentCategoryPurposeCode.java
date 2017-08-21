package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.PaymentCategoryPurposeCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class PaymentCategoryPurposeCode extends MMCodeSet {

	private final static AtomicReference<PaymentCategoryPurposeCode> repoTypeRef = new AtomicReference<>();

	public static PaymentCategoryPurposeCode repoType() {
		repoTypeRef.compareAndSet(null, new PaymentCategoryPurposeCode());
		return repoTypeRef.get();
	}

	private PaymentCategoryPurposeCode() {
		super.code = Arrays.asList(IntraCompanyPayment.repoType(),
				TradeSettlementPayment.repoType(), SalaryPayment.repoType(),
				TreasuryPayment.repoType(), CashManagementTransfer.repoType(),
				Dividend.repoType(), GovernmentPayment.repoType(),
				Interest.repoType(), Loan.repoType(),
				PensionPayment.repoType(), Securities.repoType(),
				SocialSecurityBenefit.repoType(), TaxPayment.repoType(),
				ValueAddedTaxPayment.repoType(), SupplierPayment.repoType(),
				Hedging.repoType(), Trade.repoType(), WithHolding.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("INTC");
		super.name = "PaymentCategoryPurposeCode";
		super.definition = "Specifies the type of transaction that resulted in the payment.";
	}

	static public class IntraCompanyPayment extends MMCode {
		private final static AtomicReference<IntraCompanyPayment> repoTypeRef = new AtomicReference<>();

		public static IntraCompanyPayment repoType() {
			repoTypeRef.compareAndSet(null, new IntraCompanyPayment());
			return repoTypeRef.get();
		}

		private IntraCompanyPayment() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "INTC";
			super.name = "IntraCompanyPayment";
			super.definition = "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group.";
		}
	}

	static public class TradeSettlementPayment extends MMCode {
		private final static AtomicReference<TradeSettlementPayment> repoTypeRef = new AtomicReference<>();

		public static TradeSettlementPayment repoType() {
			repoTypeRef.compareAndSet(null, new TradeSettlementPayment());
			return repoTypeRef.get();
		}

		private TradeSettlementPayment() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "CORT";
			super.name = "TradeSettlementPayment";
			super.definition = "Transaction is related to settlement of a trade, eg a foreign exchange deal or a securities transaction.";
		}
	}

	static public class SalaryPayment extends MMCode {
		private final static AtomicReference<SalaryPayment> repoTypeRef = new AtomicReference<>();

		public static SalaryPayment repoType() {
			repoTypeRef.compareAndSet(null, new SalaryPayment());
			return repoTypeRef.get();
		}

		private SalaryPayment() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "SALA";
			super.name = "SalaryPayment";
			super.definition = "Transaction is the payment of salaries.";
		}
	}

	static public class TreasuryPayment extends MMCode {
		private final static AtomicReference<TreasuryPayment> repoTypeRef = new AtomicReference<>();

		public static TreasuryPayment repoType() {
			repoTypeRef.compareAndSet(null, new TreasuryPayment());
			return repoTypeRef.get();
		}

		private TreasuryPayment() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "TREA";
			super.name = "TreasuryPayment";
			super.definition = "Transaction is related to treasury operations.";
		}
	}

	static public class CashManagementTransfer extends MMCode {
		private final static AtomicReference<CashManagementTransfer> repoTypeRef = new AtomicReference<>();

		public static CashManagementTransfer repoType() {
			repoTypeRef.compareAndSet(null, new CashManagementTransfer());
			return repoTypeRef.get();
		}

		private CashManagementTransfer() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "CASH";
			super.name = "CashManagementTransfer";
			super.definition = "Transaction is a general cash management instruction.";
		}
	}

	static public class Dividend extends MMCode {
		private final static AtomicReference<Dividend> repoTypeRef = new AtomicReference<>();

		public static Dividend repoType() {
			repoTypeRef.compareAndSet(null, new Dividend());
			return repoTypeRef.get();
		}

		private Dividend() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "DIVI";
			super.name = "Dividend";
			super.definition = "Transaction is the payment of dividends.";
		}
	}

	static public class GovernmentPayment extends MMCode {
		private final static AtomicReference<GovernmentPayment> repoTypeRef = new AtomicReference<>();

		public static GovernmentPayment repoType() {
			repoTypeRef.compareAndSet(null, new GovernmentPayment());
			return repoTypeRef.get();
		}

		private GovernmentPayment() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "GOVT";
			super.name = "GovernmentPayment";
			super.definition = "Transaction is a payment to or from a government department.";
		}
	}

	static public class Interest extends MMCode {
		private final static AtomicReference<Interest> repoTypeRef = new AtomicReference<>();

		public static Interest repoType() {
			repoTypeRef.compareAndSet(null, new Interest());
			return repoTypeRef.get();
		}

		private Interest() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "INTE";
			super.name = "Interest";
			super.definition = "Transaction is the payment of interest.";
		}
	}

	static public class Loan extends MMCode {
		private final static AtomicReference<Loan> repoTypeRef = new AtomicReference<>();

		public static Loan repoType() {
			repoTypeRef.compareAndSet(null, new Loan());
			return repoTypeRef.get();
		}

		private Loan() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "LOAN";
			super.name = "Loan";
			super.definition = "Transaction is related to the transfer of a loan to a borrower.";
		}
	}

	static public class PensionPayment extends MMCode {
		private final static AtomicReference<PensionPayment> repoTypeRef = new AtomicReference<>();

		public static PensionPayment repoType() {
			repoTypeRef.compareAndSet(null, new PensionPayment());
			return repoTypeRef.get();
		}

		private PensionPayment() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "PENS";
			super.name = "PensionPayment";
			super.definition = "Transaction is the payment of pension.";
		}
	}

	static public class Securities extends MMCode {
		private final static AtomicReference<Securities> repoTypeRef = new AtomicReference<>();

		public static Securities repoType() {
			repoTypeRef.compareAndSet(null, new Securities());
			return repoTypeRef.get();
		}

		private Securities() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "SECU";
			super.name = "Securities";
			super.definition = "Transaction is the payment of securities.";
		}
	}

	static public class SocialSecurityBenefit extends MMCode {
		private final static AtomicReference<SocialSecurityBenefit> repoTypeRef = new AtomicReference<>();

		public static SocialSecurityBenefit repoType() {
			repoTypeRef.compareAndSet(null, new SocialSecurityBenefit());
			return repoTypeRef.get();
		}

		private SocialSecurityBenefit() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "SSBE";
			super.name = "SocialSecurityBenefit";
			super.definition = "Transaction is a social security benefit, ie payment made by a government to support individuals.";
		}
	}

	static public class TaxPayment extends MMCode {
		private final static AtomicReference<TaxPayment> repoTypeRef = new AtomicReference<>();

		public static TaxPayment repoType() {
			repoTypeRef.compareAndSet(null, new TaxPayment());
			return repoTypeRef.get();
		}

		private TaxPayment() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "TAXS";
			super.name = "TaxPayment";
			super.definition = "Transaction is the payment of taxes.";
		}
	}

	static public class ValueAddedTaxPayment extends MMCode {
		private final static AtomicReference<ValueAddedTaxPayment> repoTypeRef = new AtomicReference<>();

		public static ValueAddedTaxPayment repoType() {
			repoTypeRef.compareAndSet(null, new ValueAddedTaxPayment());
			return repoTypeRef.get();
		}

		private ValueAddedTaxPayment() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "VATX";
			super.name = "ValueAddedTaxPayment";
			super.definition = "Transaction is the payment of value added tax.";
		}
	}

	static public class SupplierPayment extends MMCode {
		private final static AtomicReference<SupplierPayment> repoTypeRef = new AtomicReference<>();

		public static SupplierPayment repoType() {
			repoTypeRef.compareAndSet(null, new SupplierPayment());
			return repoTypeRef.get();
		}

		private SupplierPayment() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "SUPP";
			super.name = "SupplierPayment";
			super.definition = "Transaction is related to a payment to a supplier.";
		}
	}

	static public class Hedging extends MMCode {
		private final static AtomicReference<Hedging> repoTypeRef = new AtomicReference<>();

		public static Hedging repoType() {
			repoTypeRef.compareAndSet(null, new Hedging());
			return repoTypeRef.get();
		}

		private Hedging() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "HEDG";
			super.name = "Hedging";
			super.definition = "Transaction is related to the payment of a hedging operation.";
		}
	}

	static public class Trade extends MMCode {
		private final static AtomicReference<Trade> repoTypeRef = new AtomicReference<>();

		public static Trade repoType() {
			repoTypeRef.compareAndSet(null, new Trade());
			return repoTypeRef.get();
		}

		private Trade() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "TRAD";
			super.name = "Trade";
			super.definition = "Transaction is related to the payment of a trade transaction.";
		}
	}

	static public class WithHolding extends MMCode {
		private final static AtomicReference<WithHolding> repoTypeRef = new AtomicReference<>();

		public static WithHolding repoType() {
			repoTypeRef.compareAndSet(null, new WithHolding());
			return repoTypeRef.get();
		}

		private WithHolding() {
			super.owner_lazy = () -> PaymentCategoryPurposeCode.repoType();
			super.codeName = "WHLD";
			super.name = "WithHolding";
			super.definition = "Transaction is the payment of withholding tax.";
		}
	}
}