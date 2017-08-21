package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.codeset.RTCashAccountTypeCode;
import test.repository.dict.entity.RTCashAccount;
import java.util.Arrays;
import test.repository.dict.codeset.RTAccountLevelCode;
import test.repository.dict.codeset.RTCurrencyCode;
import test.repository.dict.entity.RTPaymentPartyRole.CashAccount;
import test.repository.GeneratedRepository.DataDictionary;

public class RTCashAccount extends MMBusinessComponent {

	private final static AtomicReference<RTCashAccount> repoTypeRef = new AtomicReference<>();

	public static RTCashAccount repoType() {
		repoTypeRef.compareAndSet(null, new RTCashAccount());
		return repoTypeRef.get();
	}

	private RTCashAccount() {
		super.element = Arrays.asList(CashAccountType.repoType(),
				Level.repoType(), SettlementCurrency.repoType());
		super.associationDomain_lazy = () -> Arrays.asList(CashAccount
				.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.semanticMarkup = Arrays.asList();
		super.name = "CashAccount";
		super.definition = "Account to or from which a cash entry is made.";
	}

	static public class CashAccountType extends MMBusinessAttribute {
		private final static AtomicReference<CashAccountType> repoTypeRef = new AtomicReference<>();

		public static CashAccountType repoType() {
			repoTypeRef.compareAndSet(null, new CashAccountType());
			return repoTypeRef.get();
		}

		private CashAccountType() {
			super.simpleType_lazy = () -> RTCashAccountTypeCode.repoType();
			super.elementContext_lazy = () -> RTCashAccount.repoType();
			super.isDerived = false;
			super.semanticMarkup = Arrays.asList();
			super.name = "CashAccountType";
			super.definition = "Specifies the nature, or use, of the cash account.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Level extends MMBusinessAttribute {
		private final static AtomicReference<Level> repoTypeRef = new AtomicReference<>();

		public static Level repoType() {
			repoTypeRef.compareAndSet(null, new Level());
			return repoTypeRef.get();
		}

		private Level() {
			super.simpleType_lazy = () -> RTAccountLevelCode.repoType();
			super.elementContext_lazy = () -> RTCashAccount.repoType();
			super.isDerived = false;
			super.name = "Level";
			super.definition = "Defines the level of an account within the account hierarchy.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class SettlementCurrency extends MMBusinessAttribute {
		private final static AtomicReference<SettlementCurrency> repoTypeRef = new AtomicReference<>();

		public static SettlementCurrency repoType() {
			repoTypeRef.compareAndSet(null, new SettlementCurrency());
			return repoTypeRef.get();
		}

		private SettlementCurrency() {
			super.simpleType_lazy = () -> RTCurrencyCode.repoType();
			super.elementContext_lazy = () -> RTCashAccount.repoType();
			super.isDerived = false;
			super.name = "SettlementCurrency";
			super.definition = "Specifies the currency used for settlement, if different from the account currency.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}