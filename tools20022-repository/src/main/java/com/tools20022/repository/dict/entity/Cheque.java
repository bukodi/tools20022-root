package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.FinancialDocument;
import com.tools20022.repository.dict.entity.ChequeIssue;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.ChequeTypeCode;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.ChequePayment;
import com.tools20022.repository.dict.entity.ChequePartyRole;
import com.tools20022.repository.dict.entity.CashAccount;

/**
 * Negotiable instrument instructing a financial institution to pay a specific
 * amount of a specific currency from the account of the drawer with that
 * institution.
 */
public class Cheque extends FinancialDocument
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ChequeIssue ChequeDelivery;
	private Max35Text Number;
	private ChequeTypeCode ChequeType;
	private ISODate MaturityDate;
	private Max35Text FormsCode;
	private Max35Text MemoField;
	private Max35Text RegionalClearingZone;
	private ChequePayment RelatedPayment;
	private ChequePartyRole ChequePartyRole;
	private CashAccount CashAccount;

	public ChequeIssue getChequeDelivery() {
		return ChequeDelivery;
	}

	public void setChequeDelivery(ChequeIssue ChequeDelivery) {
		this.ChequeDelivery = ChequeDelivery;
	}

	public Max35Text getNumber() {
		return Number;
	}

	public void setNumber(Max35Text Number) {
		this.Number = Number;
	}

	public ChequeTypeCode getChequeType() {
		return ChequeType;
	}

	public void setChequeType(ChequeTypeCode ChequeType) {
		this.ChequeType = ChequeType;
	}

	public ISODate getMaturityDate() {
		return MaturityDate;
	}

	public void setMaturityDate(ISODate MaturityDate) {
		this.MaturityDate = MaturityDate;
	}

	public Max35Text getFormsCode() {
		return FormsCode;
	}

	public void setFormsCode(Max35Text FormsCode) {
		this.FormsCode = FormsCode;
	}

	public Max35Text getMemoField() {
		return MemoField;
	}

	public void setMemoField(Max35Text MemoField) {
		this.MemoField = MemoField;
	}

	public Max35Text getRegionalClearingZone() {
		return RegionalClearingZone;
	}

	public void setRegionalClearingZone(Max35Text RegionalClearingZone) {
		this.RegionalClearingZone = RegionalClearingZone;
	}

	public ChequePayment getRelatedPayment() {
		return RelatedPayment;
	}

	public void setRelatedPayment(ChequePayment RelatedPayment) {
		this.RelatedPayment = RelatedPayment;
	}

	public ChequePartyRole getChequePartyRole() {
		return ChequePartyRole;
	}

	public void setChequePartyRole(ChequePartyRole ChequePartyRole) {
		this.ChequePartyRole = ChequePartyRole;
	}

	public CashAccount getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(CashAccount CashAccount) {
		this.CashAccount = CashAccount;
	}
}