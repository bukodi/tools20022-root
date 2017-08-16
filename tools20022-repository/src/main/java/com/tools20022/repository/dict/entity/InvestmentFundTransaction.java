package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesTrade;
import com.tools20022.repository.dict.entity.InvestmentFundOrder;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.InvestmentFundTransactionTypeCode;
import com.tools20022.repository.dict.entity.Charges;
import com.tools20022.repository.dict.entity.InvestmentAccount;
import com.tools20022.repository.dict.entity.InvestmentFundClass;
import com.tools20022.repository.dict.entity.InvestmentFundTax;
import com.tools20022.repository.dict.codeset.DebitCreditCode;
import com.tools20022.repository.dict.entity.InvestmentFundOrderExecution;

/**
 * Process of buying, selling, switching or transferring fund units.
 */
public class InvestmentFundTransaction extends SecuritiesTrade
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private InvestmentFundOrder InvestmentFundOrder;
	private Max35Text ClientReference;
	private InvestmentFundTransactionTypeCode Type;
	private Charges TransactionCharge;
	private InvestmentAccount InvestmentAccount;
	private InvestmentFundClass InvestmentFundClass;
	private InvestmentFundTax TransactionTax;
	private DebitCreditCode CreditDebitIndicator;
	private InvestmentFundOrderExecution InvestmentFundOrderExecution;

	public InvestmentFundOrder getInvestmentFundOrder() {
		return InvestmentFundOrder;
	}

	public void setInvestmentFundOrder(InvestmentFundOrder InvestmentFundOrder) {
		this.InvestmentFundOrder = InvestmentFundOrder;
	}

	public Max35Text getClientReference() {
		return ClientReference;
	}

	public void setClientReference(Max35Text ClientReference) {
		this.ClientReference = ClientReference;
	}

	public InvestmentFundTransactionTypeCode getType() {
		return Type;
	}

	public void setType(InvestmentFundTransactionTypeCode Type) {
		this.Type = Type;
	}

	public Charges getTransactionCharge() {
		return TransactionCharge;
	}

	public void setTransactionCharge(Charges TransactionCharge) {
		this.TransactionCharge = TransactionCharge;
	}

	public InvestmentAccount getInvestmentAccount() {
		return InvestmentAccount;
	}

	public void setInvestmentAccount(InvestmentAccount InvestmentAccount) {
		this.InvestmentAccount = InvestmentAccount;
	}

	public InvestmentFundClass getInvestmentFundClass() {
		return InvestmentFundClass;
	}

	public void setInvestmentFundClass(InvestmentFundClass InvestmentFundClass) {
		this.InvestmentFundClass = InvestmentFundClass;
	}

	public InvestmentFundTax getTransactionTax() {
		return TransactionTax;
	}

	public void setTransactionTax(InvestmentFundTax TransactionTax) {
		this.TransactionTax = TransactionTax;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return CreditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode CreditDebitIndicator) {
		this.CreditDebitIndicator = CreditDebitIndicator;
	}

	public InvestmentFundOrderExecution getInvestmentFundOrderExecution() {
		return InvestmentFundOrderExecution;
	}

	public void setInvestmentFundOrderExecution(
			InvestmentFundOrderExecution InvestmentFundOrderExecution) {
		this.InvestmentFundOrderExecution = InvestmentFundOrderExecution;
	}
}