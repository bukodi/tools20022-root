package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.entity.PaymentPartyRole;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class PaymentPartyRole extends MMBusinessComponent {

	private final static AtomicReference<PaymentPartyRole> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAssociationEnd refCashAccount = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> CashAccount.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PaymentPartyRole.repoType();
			super.name = "CashAccount";
			super.definition = "Unambiguous identification of the account used in the context of the party role such as debtor account, instructing agent account...";
			super.minOccurs = 0;
		}
	};

	public static PaymentPartyRole repoType() {
		repoTypeRef.compareAndSet(null, new PaymentPartyRole());
		return repoTypeRef.get();
	}

	private PaymentPartyRole() {
		super.element = Arrays.asList(refCashAccount);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PaymentPartyRole";
		super.definition = "Role played by a party in the context of a payment.";
	}
}