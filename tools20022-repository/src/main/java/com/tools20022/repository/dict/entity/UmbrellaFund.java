package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.InvestmentFund;

/**
 * In securities, a collective investment scheme that has a contractual or a
 * corporate form. When it has a contractual form, a fund is constituted under
 * either the law of contract or under the trust law and thus it is not a legal
 * entity. In its corporate form, a fund is a legal entity and is structured as
 * a company. It has several distinct sub-funds which in effect are traded as
 * individual investment funds.
 */
public class UmbrellaFund {

	private Max350Text Name;
	private InvestmentFund SubFund;

	public Max350Text getName() {
		return Name;
	}

	public void setName(Max350Text Name) {
		this.Name = Name;
	}

	public InvestmentFund getSubFund() {
		return SubFund;
	}

	public void setSubFund(InvestmentFund SubFund) {
		this.SubFund = SubFund;
	}
}