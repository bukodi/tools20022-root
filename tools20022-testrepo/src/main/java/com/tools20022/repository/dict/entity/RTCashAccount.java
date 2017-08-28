package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.RTCashAccountTypeCode;
import com.tools20022.repository.dict.entity.RTCashAccount;
import java.util.Arrays;
import com.tools20022.repository.dict.codeset.RTAccountLevelCode;
import com.tools20022.repository.dict.codeset.RTCurrencyCode;
import com.tools20022.repository.dict.entity.RTPaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;/**
 * Account to or from which a cash entry is made.
 */
public class RTCashAccount extends MMBusinessComponent {

	private final static AtomicReference<RTCashAccount> repoTypeRef = new AtomicReference<>();
	/**
	 * Specifies the nature, or use, of the cash account.
	 */
	public final MMBusinessAttribute attrCashAccountType = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTCashAccountTypeCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashAccount.repoType();
			super.name = "CashAccountType";
			super.definition = "Specifies the nature, or use, of the cash account.";
			super.semanticMarkup = Arrays.asList();
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Defines the level of an account within the account hierarchy.
	 */
	public final MMBusinessAttribute attrLevel = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTAccountLevelCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashAccount.repoType();
			super.name = "Level";
			super.definition = "Defines the level of an account within the account hierarchy.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies the currency used for settlement, if different from the account currency.
	 */
	public final MMBusinessAttribute attrSettlementCurrency = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTCurrencyCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashAccount.repoType();
			super.name = "SettlementCurrency";
			super.definition = "Specifies the currency used for settlement, if different from the account currency.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTCashAccount repoType() {
		repoTypeRef.compareAndSet(null, new RTCashAccount());
		return repoTypeRef.get();
	}

	private RTCashAccount() {
		super.element = Arrays.asList(attrCashAccountType, attrLevel,
				attrSettlementCurrency);
		super.associationDomain_lazy = () -> Arrays.asList(RTPaymentPartyRole
				.repoType().refCashAccount);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CashAccount";
		super.definition = "Account to or from which a cash entry is made.";
		super.semanticMarkup = Arrays.asList();
	} }