package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionStatementReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionStatementReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement12;
import com.tools20022.repository.dict.msg.AccountIdentification23;
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
 * sub-function of the message is Copy Duplicate). using the relevant elements
 * in the business application header (BAH). ISO 15022 - 20022 COEXISTENCE This
 * ISO 20022 message is reversed engineered from ISO 15022. Both standards will
 * coexist for a certain number of years. Until this coexistence period ends,
 * the usage of certain data types is restricted to ensure interoperability
 * between ISO 15022 and 20022 users. Compliance to these rules is mandatory in
 * a coexistence environment. The coexistence restrictions are described in a
 * Textual Rule linked to the Message Items they concern. These coexistence
 * textual rules are clearly identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(CorporateActionInstructionStatementReportV02.class)
@NextVersion(CorporateActionInstructionStatementReportV04.class)
public class CorporateActionInstructionStatementReportV03 {

	private Pagination Pagination;
	private Statement12 StatementGeneralDetails;
	private AccountIdentification23 AccountAndStatementDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement12 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement12 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public AccountIdentification23 getAccountAndStatementDetails() {
		return AccountAndStatementDetails;
	}

	public void setAccountAndStatementDetails(
			AccountIdentification23 AccountAndStatementDetails) {
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