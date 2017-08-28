package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.RTCurrencyCode;
import com.tools20022.repository.dict.entity.RTAccount;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.RTAccountIdentification;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Record of transactions in specific types of assets, maintained by a servicing party on behalf of one or more owning parties. Business relationship between an account servicer and one or more account owners.
 */
public class RTAccount extends MMBusinessComponent {

	private final static AtomicReference<RTAccount> repoTypeRef = new AtomicReference<>();
	/**
	 * Base currency of the account.
	 */
	public final MMBusinessAttribute attrBaseCurrency = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTCurrencyCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAccount.repoType();
			super.name = "BaseCurrency";
			super.definition = "Base currency of the account.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Unique and unambiguous identification for the account between the account owner and the account servicer.
	 */
	public final MMBusinessAssociationEnd refIdentification = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTAccountIdentification.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAccount.repoType();
			super.name = "Identification";
			super.definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTAccount repoType() {
		repoTypeRef.compareAndSet(null, new RTAccount());
		return repoTypeRef.get();
	}

	private RTAccount() {
		super.element = Arrays.asList(attrBaseCurrency, refIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Account";
		super.definition = "Record of transactions in specific types of assets, maintained by a servicing party on behalf of one or more owning parties. Business relationship between an account servicer and one or more account owners.";
	} }