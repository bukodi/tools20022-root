package com.tools20022.repository.catalogue.msgdef.secl;

import com.tools20022.repository.dict.msg.Statement31;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.choice.PartyIdentification35Choice;
import com.tools20022.repository.dict.msg.SecuritiesAccount18;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TradeLegStatement3;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The TradeLegStatement message is sent by the central counterparty (CCP)
 * to a clearing member to report all trades that have been executed by the
 * trading platform.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage The TradeLegStatement message may be either sent: - during the day (to
 * report trades execution by batch) or - as an end of day report.
 */
public class TradeLegStatementV03 {

	private Statement31 StatementParameters;
	private Pagination Pagination;
	private PartyIdentification35Choice ClearingMember;
	private Optional<SecuritiesAccount18> ClearingAccount;
	private TradeLegStatement3 StatementDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Statement31 getStatementParameters() {
		return StatementParameters;
	}

	public void setStatementParameters(Statement31 StatementParameters) {
		this.StatementParameters = StatementParameters;
	}

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public PartyIdentification35Choice getClearingMember() {
		return ClearingMember;
	}

	public void setClearingMember(PartyIdentification35Choice ClearingMember) {
		this.ClearingMember = ClearingMember;
	}

	public Optional<SecuritiesAccount18> getClearingAccount() {
		return ClearingAccount;
	}

	public void setClearingAccount(Optional<SecuritiesAccount18> ClearingAccount) {
		this.ClearingAccount = ClearingAccount;
	}

	public TradeLegStatement3 getStatementDetails() {
		return StatementDetails;
	}

	public void setStatementDetails(TradeLegStatement3 StatementDetails) {
		this.StatementDetails = StatementDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}