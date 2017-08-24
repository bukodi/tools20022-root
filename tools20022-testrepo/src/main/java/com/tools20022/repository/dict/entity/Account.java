package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.AccountIdentification;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class Account extends MMBusinessComponent {

	private final static AtomicReference<Account> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrBaseCurrency = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> CurrencyCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Account.repoType();
			super.name = "BaseCurrency";
			super.definition = "Base currency of the account.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAssociationEnd refIdentification = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> AccountIdentification.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Account.repoType();
			super.name = "Identification";
			super.definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static Account repoType() {
		repoTypeRef.compareAndSet(null, new Account());
		return repoTypeRef.get();
	}

	private Account() {
		super.element = Arrays.asList(attrBaseCurrency, refIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Account";
		super.definition = "Record of transactions in specific types of assets, maintained by a servicing party on behalf of one or more owning parties. Business relationship between an account servicer and one or more account owners.";
	}
}