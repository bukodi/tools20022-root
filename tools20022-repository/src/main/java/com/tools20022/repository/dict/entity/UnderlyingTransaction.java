package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Undertaking;
import com.tools20022.repository.dict.codeset.ExternalUnderlyingTradeTransactionTypeCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.CommercialTrade;

/**
 * Reference information on a commercial obligation between the beneficiary and
 * applicant for which an undertaking is issued.
 */
public class UnderlyingTransaction {

	private Undertaking Undertaking;
	private ExternalUnderlyingTradeTransactionTypeCode Type;
	private Max35Text Identification;
	private ISODate IssueDate;
	private ISODate TenderClosingDate;
	private CurrencyAndAmount TotalAmount;
	private PercentageRate ContractAmountPercentage;
	private CommercialTrade CommercialTrade;

	public Undertaking getUndertaking() {
		return Undertaking;
	}

	public void setUndertaking(Undertaking Undertaking) {
		this.Undertaking = Undertaking;
	}

	public ExternalUnderlyingTradeTransactionTypeCode getType() {
		return Type;
	}

	public void setType(ExternalUnderlyingTradeTransactionTypeCode Type) {
		this.Type = Type;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public ISODate getIssueDate() {
		return IssueDate;
	}

	public void setIssueDate(ISODate IssueDate) {
		this.IssueDate = IssueDate;
	}

	public ISODate getTenderClosingDate() {
		return TenderClosingDate;
	}

	public void setTenderClosingDate(ISODate TenderClosingDate) {
		this.TenderClosingDate = TenderClosingDate;
	}

	public CurrencyAndAmount getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(CurrencyAndAmount TotalAmount) {
		this.TotalAmount = TotalAmount;
	}

	public PercentageRate getContractAmountPercentage() {
		return ContractAmountPercentage;
	}

	public void setContractAmountPercentage(
			PercentageRate ContractAmountPercentage) {
		this.ContractAmountPercentage = ContractAmountPercentage;
	}

	public CommercialTrade getCommercialTrade() {
		return CommercialTrade;
	}

	public void setCommercialTrade(CommercialTrade CommercialTrade) {
		this.CommercialTrade = CommercialTrade;
	}
}