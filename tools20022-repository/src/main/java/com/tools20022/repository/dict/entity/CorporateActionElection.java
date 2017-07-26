package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.CorporateActionOption;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.codeset.ElectionMovementTypeCode;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.CorporateActionServicing;

/**
 * Decision taken by the account holder regarding the corporate action event.
 */
public class CorporateActionElection {

	private ISODateTime ExecutionRequestedDateTime;
	private CorporateActionOption Option;
	private CashAccount CashAccount;
	private ElectionMovementTypeCode ElectionType;
	private SecuritiesQuantity Quantity;
	private Max350Text AmendmentReason;
	private CorporateActionServicing RelatedServicing;

	public ISODateTime getExecutionRequestedDateTime() {
		return ExecutionRequestedDateTime;
	}

	public void setExecutionRequestedDateTime(
			ISODateTime ExecutionRequestedDateTime) {
		this.ExecutionRequestedDateTime = ExecutionRequestedDateTime;
	}

	public CorporateActionOption getOption() {
		return Option;
	}

	public void setOption(CorporateActionOption Option) {
		this.Option = Option;
	}

	public CashAccount getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(CashAccount CashAccount) {
		this.CashAccount = CashAccount;
	}

	public ElectionMovementTypeCode getElectionType() {
		return ElectionType;
	}

	public void setElectionType(ElectionMovementTypeCode ElectionType) {
		this.ElectionType = ElectionType;
	}

	public SecuritiesQuantity getQuantity() {
		return Quantity;
	}

	public void setQuantity(SecuritiesQuantity Quantity) {
		this.Quantity = Quantity;
	}

	public Max350Text getAmendmentReason() {
		return AmendmentReason;
	}

	public void setAmendmentReason(Max350Text AmendmentReason) {
		this.AmendmentReason = AmendmentReason;
	}

	public CorporateActionServicing getRelatedServicing() {
		return RelatedServicing;
	}

	public void setRelatedServicing(CorporateActionServicing RelatedServicing) {
		this.RelatedServicing = RelatedServicing;
	}
}