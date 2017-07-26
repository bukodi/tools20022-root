package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.Meeting;

/**
 * Specifies the number of voting rights and of outstanding securities.
 */
public class MeetingParticipation {

	private CurrencyAndAmount TotalNumberOfSecuritiesOutstanding;
	private Number TotalNumberOfVotingRights;
	private ISODate CalculationDate;
	private Number TotalNumberOfSecurities;
	private Meeting Meeting;

	public CurrencyAndAmount getTotalNumberOfSecuritiesOutstanding() {
		return TotalNumberOfSecuritiesOutstanding;
	}

	public void setTotalNumberOfSecuritiesOutstanding(
			CurrencyAndAmount TotalNumberOfSecuritiesOutstanding) {
		this.TotalNumberOfSecuritiesOutstanding = TotalNumberOfSecuritiesOutstanding;
	}

	public Number getTotalNumberOfVotingRights() {
		return TotalNumberOfVotingRights;
	}

	public void setTotalNumberOfVotingRights(Number TotalNumberOfVotingRights) {
		this.TotalNumberOfVotingRights = TotalNumberOfVotingRights;
	}

	public ISODate getCalculationDate() {
		return CalculationDate;
	}

	public void setCalculationDate(ISODate CalculationDate) {
		this.CalculationDate = CalculationDate;
	}

	public Number getTotalNumberOfSecurities() {
		return TotalNumberOfSecurities;
	}

	public void setTotalNumberOfSecurities(Number TotalNumberOfSecurities) {
		this.TotalNumberOfSecurities = TotalNumberOfSecurities;
	}

	public Meeting getMeeting() {
		return Meeting;
	}

	public void setMeeting(Meeting Meeting) {
		this.Meeting = Meeting;
	}
}