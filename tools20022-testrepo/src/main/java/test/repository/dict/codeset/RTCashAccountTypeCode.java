package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTCashAccountTypeCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTCashAccountTypeCode extends MMCodeSet {

	private final static AtomicReference<RTCashAccountTypeCode> repoTypeRef = new AtomicReference<>();

	public static RTCashAccountTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new RTCashAccountTypeCode());
		return repoTypeRef.get();
	}

	private RTCashAccountTypeCode() {
		super.code = Arrays.asList(CashPayment.repoType(), Charges.repoType(),
				Commission.repoType(), Tax.repoType(), CashIncome.repoType(),
				CashTrading.repoType(), Settlement.repoType(),
				Current.repoType(), Savings.repoType(),
				OverNightDeposit.repoType(), MarginalLending.repoType(),
				NonResidentExternal.repoType(), MoneyMarket.repoType(),
				Loan.repoType(), Salary.repoType(), Overdraft.repoType(),
				Lending.repoType(), Collateral.repoType(),
				FinancialSettlement.repoType(), MarginReturn.repoType(),
				Segregated.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.semanticMarkup = Arrays.asList();
		super.example = Arrays.asList("CASH");
		super.name = "CashAccountTypeCode";
		super.definition = "Specifies the nature, or  use, of the cash account.";
	}

	static public class CashPayment extends MMCode {
		private final static AtomicReference<CashPayment> repoTypeRef = new AtomicReference<>();

		public static CashPayment repoType() {
			repoTypeRef.compareAndSet(null, new CashPayment());
			return repoTypeRef.get();
		}

		private CashPayment() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "CASH";
			super.semanticMarkup = Arrays.asList();
			super.name = "CashPayment";
			super.definition = "Account used for the payment of cash.";
		}
	}

	static public class Charges extends MMCode {
		private final static AtomicReference<Charges> repoTypeRef = new AtomicReference<>();

		public static Charges repoType() {
			repoTypeRef.compareAndSet(null, new Charges());
			return repoTypeRef.get();
		}

		private Charges() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "CHAR";
			super.semanticMarkup = Arrays.asList();
			super.name = "Charges";
			super.definition = "Account used for charges if different from the account for payment.";
		}
	}

	static public class Commission extends MMCode {
		private final static AtomicReference<Commission> repoTypeRef = new AtomicReference<>();

		public static Commission repoType() {
			repoTypeRef.compareAndSet(null, new Commission());
			return repoTypeRef.get();
		}

		private Commission() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "COMM";
			super.semanticMarkup = Arrays.asList();
			super.name = "Commission";
			super.definition = "Account used for commission if different from the account for payment.";
		}
	}

	static public class Tax extends MMCode {
		private final static AtomicReference<Tax> repoTypeRef = new AtomicReference<>();

		public static Tax repoType() {
			repoTypeRef.compareAndSet(null, new Tax());
			return repoTypeRef.get();
		}

		private Tax() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "TAXE";
			super.semanticMarkup = Arrays.asList();
			super.name = "Tax";
			super.definition = "Account used for taxes if different from the account for payment.";
		}
	}

	static public class CashIncome extends MMCode {
		private final static AtomicReference<CashIncome> repoTypeRef = new AtomicReference<>();

		public static CashIncome repoType() {
			repoTypeRef.compareAndSet(null, new CashIncome());
			return repoTypeRef.get();
		}

		private CashIncome() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "CISH";
			super.name = "CashIncome";
			super.definition = "Account used for payment of income if different from the current cash account.";
		}
	}

	static public class CashTrading extends MMCode {
		private final static AtomicReference<CashTrading> repoTypeRef = new AtomicReference<>();

		public static CashTrading repoType() {
			repoTypeRef.compareAndSet(null, new CashTrading());
			return repoTypeRef.get();
		}

		private CashTrading() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "TRAS";
			super.name = "CashTrading";
			super.definition = "Account used for trading if different from the current cash account.";
		}
	}

	static public class Settlement extends MMCode {
		private final static AtomicReference<Settlement> repoTypeRef = new AtomicReference<>();

		public static Settlement repoType() {
			repoTypeRef.compareAndSet(null, new Settlement());
			return repoTypeRef.get();
		}

		private Settlement() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "SACC";
			super.name = "Settlement";
			super.definition = "Account used to post debit and credit entries, as a result of transactions cleared and settled through a specific clearing and settlement system.";
		}
	}

	static public class Current extends MMCode {
		private final static AtomicReference<Current> repoTypeRef = new AtomicReference<>();

		public static Current repoType() {
			repoTypeRef.compareAndSet(null, new Current());
			return repoTypeRef.get();
		}

		private Current() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "CACC";
			super.name = "Current";
			super.definition = "Account used to post debits and credits when no specific account has been nominated.";
		}
	}

	static public class Savings extends MMCode {
		private final static AtomicReference<Savings> repoTypeRef = new AtomicReference<>();

		public static Savings repoType() {
			repoTypeRef.compareAndSet(null, new Savings());
			return repoTypeRef.get();
		}

		private Savings() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "SVGS";
			super.name = "Savings";
			super.definition = "Account used for savings.";
		}
	}

	static public class OverNightDeposit extends MMCode {
		private final static AtomicReference<OverNightDeposit> repoTypeRef = new AtomicReference<>();

		public static OverNightDeposit repoType() {
			repoTypeRef.compareAndSet(null, new OverNightDeposit());
			return repoTypeRef.get();
		}

		private OverNightDeposit() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "ONDP";
			super.name = "OverNightDeposit";
			super.definition = "Account used for overnight deposits.";
		}
	}

	static public class MarginalLending extends MMCode {
		private final static AtomicReference<MarginalLending> repoTypeRef = new AtomicReference<>();

		public static MarginalLending repoType() {
			repoTypeRef.compareAndSet(null, new MarginalLending());
			return repoTypeRef.get();
		}

		private MarginalLending() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "MGLD";
			super.name = "MarginalLending";
			super.definition = "Account used for a marginal lending facility.";
		}
	}

	static public class NonResidentExternal extends MMCode {
		private final static AtomicReference<NonResidentExternal> repoTypeRef = new AtomicReference<>();

		public static NonResidentExternal repoType() {
			repoTypeRef.compareAndSet(null, new NonResidentExternal());
			return repoTypeRef.get();
		}

		private NonResidentExternal() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "NREX";
			super.name = "NonResidentExternal";
			super.definition = "Account used for non-resident external.";
		}
	}

	static public class MoneyMarket extends MMCode {
		private final static AtomicReference<MoneyMarket> repoTypeRef = new AtomicReference<>();

		public static MoneyMarket repoType() {
			repoTypeRef.compareAndSet(null, new MoneyMarket());
			return repoTypeRef.get();
		}

		private MoneyMarket() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "MOMA";
			super.name = "MoneyMarket";
			super.definition = "Account used for money markets if different from the cash account.";
		}
	}

	static public class Loan extends MMCode {
		private final static AtomicReference<Loan> repoTypeRef = new AtomicReference<>();

		public static Loan repoType() {
			repoTypeRef.compareAndSet(null, new Loan());
			return repoTypeRef.get();
		}

		private Loan() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "LOAN";
			super.name = "Loan";
			super.definition = "Account used for loans.";
		}
	}

	static public class Salary extends MMCode {
		private final static AtomicReference<Salary> repoTypeRef = new AtomicReference<>();

		public static Salary repoType() {
			repoTypeRef.compareAndSet(null, new Salary());
			return repoTypeRef.get();
		}

		private Salary() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "SLRY";
			super.name = "Salary";
			super.definition = "Accounts used for salary payments.";
		}
	}

	static public class Overdraft extends MMCode {
		private final static AtomicReference<Overdraft> repoTypeRef = new AtomicReference<>();

		public static Overdraft repoType() {
			repoTypeRef.compareAndSet(null, new Overdraft());
			return repoTypeRef.get();
		}

		private Overdraft() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "ODFT";
			super.name = "Overdraft";
			super.definition = "Account is used for overdrafts.";
		}
	}

	static public class Lending extends MMCode {
		private final static AtomicReference<Lending> repoTypeRef = new AtomicReference<>();

		public static Lending repoType() {
			repoTypeRef.compareAndSet(null, new Lending());
			return repoTypeRef.get();
		}

		private Lending() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "LEND";
			super.name = "Lending";
			super.definition = "Account is for the coverage of lending.";
		}
	}

	static public class Collateral extends MMCode {
		private final static AtomicReference<Collateral> repoTypeRef = new AtomicReference<>();

		public static Collateral repoType() {
			repoTypeRef.compareAndSet(null, new Collateral());
			return repoTypeRef.get();
		}

		private Collateral() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "COLL";
			super.name = "Collateral";
			super.definition = "Account is for collateral.";
		}
	}

	static public class FinancialSettlement extends MMCode {
		private final static AtomicReference<FinancialSettlement> repoTypeRef = new AtomicReference<>();

		public static FinancialSettlement repoType() {
			repoTypeRef.compareAndSet(null, new FinancialSettlement());
			return repoTypeRef.get();
		}

		private FinancialSettlement() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "SETT";
			super.name = "FinancialSettlement";
			super.definition = "Account is for financial settlements.";
		}
	}

	static public class MarginReturn extends MMCode {
		private final static AtomicReference<MarginReturn> repoTypeRef = new AtomicReference<>();

		public static MarginReturn repoType() {
			repoTypeRef.compareAndSet(null, new MarginReturn());
			return repoTypeRef.get();
		}

		private MarginReturn() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "MARR";
			super.name = "MarginReturn";
			super.definition = "Account is for margin returns.";
		}
	}

	static public class Segregated extends MMCode {
		private final static AtomicReference<Segregated> repoTypeRef = new AtomicReference<>();

		public static Segregated repoType() {
			repoTypeRef.compareAndSet(null, new Segregated());
			return repoTypeRef.get();
		}

		private Segregated() {
			super.owner_lazy = () -> RTCashAccountTypeCode.repoType();
			super.codeName = "SEGT";
			super.name = "Segregated";
			super.definition = "Account is an segregated account.";
		}
	}
}