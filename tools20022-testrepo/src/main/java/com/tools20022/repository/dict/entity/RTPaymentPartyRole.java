package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.RTCashAccount;
import com.tools20022.repository.dict.entity.RTPaymentPartyRole;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Role played by a party in the context of a payment.
 */
public class RTPaymentPartyRole extends MMBusinessComponent {

	private final static AtomicReference<RTPaymentPartyRole> repoTypeRef = new AtomicReference<>();
	/**
	 * Unambiguous identification of the account used in the context of the party role such as debtor account, instructing agent account...
	 */
	public final MMBusinessAssociationEnd refCashAccount = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTCashAccount.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPaymentPartyRole.repoType();
			super.name = "CashAccount";
			super.definition = "Unambiguous identification of the account used in the context of the party role such as debtor account, instructing agent account...";
			super.minOccurs = 0;
		}
	};

	public static RTPaymentPartyRole repoType() {
		repoTypeRef.compareAndSet(null, new RTPaymentPartyRole());
		return repoTypeRef.get();
	}

	private RTPaymentPartyRole() {
		super.element = Arrays.asList(refCashAccount);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PaymentPartyRole";
		super.definition = "Role played by a party in the context of a payment.";
	} }