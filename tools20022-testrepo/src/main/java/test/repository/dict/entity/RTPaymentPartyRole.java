package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import test.repository.dict.entity.RTCashAccount;
import test.repository.dict.entity.RTPaymentPartyRole;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPaymentPartyRole extends MMBusinessComponent {

	private final static AtomicReference<RTPaymentPartyRole> repoTypeRef = new AtomicReference<>();

	public static RTPaymentPartyRole repoType() {
		repoTypeRef.compareAndSet(null, new RTPaymentPartyRole());
		return repoTypeRef.get();
	}

	private RTPaymentPartyRole() {
		super.element = Arrays.asList(CashAccount.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PaymentPartyRole";
		super.definition = "Role played by a party in the context of a payment.";
	}

	static public class CashAccount extends MMBusinessAssociationEnd {
		private final static AtomicReference<CashAccount> repoTypeRef = new AtomicReference<>();

		public static CashAccount repoType() {
			repoTypeRef.compareAndSet(null, new CashAccount());
			return repoTypeRef.get();
		}

		private CashAccount() {
			super.type_lazy = () -> RTCashAccount.repoType();
			super.elementContext_lazy = () -> RTPaymentPartyRole.repoType();
			super.isDerived = false;
			super.name = "CashAccount";
			super.definition = "Unambiguous identification of the account used in the context of the party role such as debtor account, instructing agent account...";
			super.minOccurs = 0;
		}
	}
}