package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionStatementReportV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionStatementReportV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement47;
import com.tools20022.repository.dict.msg.AccountIdentification33;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope An account servicer sends the CorporateActionInstructionStatementReport
 * message to an account owner or its designated agent to report balances at the
 * safekeeping account level for one or more corporate action events or at the
 * corporate action event level for one or more safekeeping accounts. Usage The
 * message may also be used to: - re-send a message previously sent (the
 * sub-function of the message is Duplicate), - provide a third party with a
 * copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate), using the relevant elements
 * in the business application header (BAH).
 */
@PreviousVersion(CorporateActionInstructionStatementReportV04.class)
@NextVersion(CorporateActionInstructionStatementReportV06.class)
public class CorporateActionInstructionStatementReportV05 {

	private Pagination Pagination;
	private Statement47 StatementGeneralDetails;
	private AccountIdentification33 AccountAndStatementDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement47 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement47 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public AccountIdentification33 getAccountAndStatementDetails() {
		return AccountAndStatementDetails;
	}

	public void setAccountAndStatementDetails(
			AccountIdentification33 AccountAndStatementDetails) {
		this.AccountAndStatementDetails = AccountAndStatementDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}