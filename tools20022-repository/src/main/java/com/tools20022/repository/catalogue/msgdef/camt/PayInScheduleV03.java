package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.choice.PartyIdentification73Choice;
import com.tools20022.repository.dict.msg.ReportData4;
import com.tools20022.repository.dict.msg.BalanceStatus2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PayInScheduleItems1;
import com.tools20022.repository.dict.msg.PayInFactors1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The PayInSchedule message is sent by a central settlement system to the
 * participant to provide notification of a series of timed payments scheduled
 * for each currency at the time and date of the schedule generation. The
 * central settlement system may send information about how the timed payments
 * have been calculated.
 */
public class PayInScheduleV03 implements GeneratedRepoBean<MMMessageDefinition> {

	private PartyIdentification73Choice PartyIdentification;
	private ReportData4 ReportData;
	private Optional<BalanceStatus2> PayInScheduleLongBalance;
	private Optional<PayInScheduleItems1> PayInScheduleItem;
	private Optional<PayInFactors1> PayInFactors;
	private Optional<SupplementaryData1> SupplementaryData;

	public PartyIdentification73Choice getPartyIdentification() {
		return PartyIdentification;
	}

	public void setPartyIdentification(
			PartyIdentification73Choice PartyIdentification) {
		this.PartyIdentification = PartyIdentification;
	}

	public ReportData4 getReportData() {
		return ReportData;
	}

	public void setReportData(ReportData4 ReportData) {
		this.ReportData = ReportData;
	}

	public Optional<BalanceStatus2> getPayInScheduleLongBalance() {
		return PayInScheduleLongBalance;
	}

	public void setPayInScheduleLongBalance(
			Optional<BalanceStatus2> PayInScheduleLongBalance) {
		this.PayInScheduleLongBalance = PayInScheduleLongBalance;
	}

	public Optional<PayInScheduleItems1> getPayInScheduleItem() {
		return PayInScheduleItem;
	}

	public void setPayInScheduleItem(
			Optional<PayInScheduleItems1> PayInScheduleItem) {
		this.PayInScheduleItem = PayInScheduleItem;
	}

	public Optional<PayInFactors1> getPayInFactors() {
		return PayInFactors;
	}

	public void setPayInFactors(Optional<PayInFactors1> PayInFactors) {
		this.PayInFactors = PayInFactors;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}