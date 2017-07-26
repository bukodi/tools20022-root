package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Money;
import com.tools20022.repository.dict.codeset.DepositTypeCode;
import com.tools20022.repository.dict.entity.Interest;

/**
 * An arrangement in which a lender gives money or property to a borrower, and
 * the borrower agrees to return the property or repay the money, usually along
 * with interest, at some future point(s) in time.
 */
public class Deposit extends Money {

	private DepositTypeCode DepositType;
	private Interest Interest;

	public DepositTypeCode getDepositType() {
		return DepositType;
	}

	public void setDepositType(DepositTypeCode DepositType) {
		this.DepositType = DepositType;
	}

	public Interest getInterest() {
		return Interest;
	}

	public void setInterest(Interest Interest) {
		this.Interest = Interest;
	}
}