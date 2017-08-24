package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.CashAccountTypeCode;
import com.tools20022.repository.dict.entity.CashAccount;
import java.util.Arrays;
import com.tools20022.repository.dict.codeset.AccountLevelCode;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.PaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;

public class CashAccount extends MMBusinessComponent {

	private final static AtomicReference<CashAccount> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrCashAccountType = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> CashAccountTypeCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashAccount.repoType();
			super.name = "CashAccountType";
			super.definition = "Specifies the nature, or use, of the cash account.";
			super.semanticMarkup = Arrays.asList();
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrLevel = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> AccountLevelCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashAccount.repoType();
			super.name = "Level";
			super.definition = "Defines the level of an account within the account hierarchy.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrSettlementCurrency = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> CurrencyCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashAccount.repoType();
			super.name = "SettlementCurrency";
			super.definition = "Specifies the currency used for settlement, if different from the account currency.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static CashAccount repoType() {
		repoTypeRef.compareAndSet(null, new CashAccount());
		return repoTypeRef.get();
	}

	private CashAccount() {
		super.element = Arrays.asList(attrCashAccountType, attrLevel,
				attrSettlementCurrency);
		super.associationDomain_lazy = () -> Arrays.asList(PaymentPartyRole
				.repoType().refCashAccount);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CashAccount";
		super.definition = "Account to or from which a cash entry is made.";
		super.semanticMarkup = Arrays.asList();
	}
}