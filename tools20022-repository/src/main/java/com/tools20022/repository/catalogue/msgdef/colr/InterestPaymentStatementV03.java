package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.repository.catalogue.msgdef.colr.InterestPaymentStatementV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Agreement2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Obligation3;
import com.tools20022.repository.dict.msg.Statement32;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.InterestStatement3;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope This message is sent by either the collateral giver or its collateral
 * manager to the collateral taker or its collateral manager. It is used to
 * report the interest amounts calculated based on the effective posted
 * collateral amount, over a specific period of time agreed by both parties.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage The InterestPaymentStatement message is used for reporting the interest
 * per period on collateral held.
 */
@NextVersion(InterestPaymentStatementV04.class)
public class InterestPaymentStatementV03 {

	private Max35Text TransactionIdentification;
	private Optional<Agreement2> Agreement;
	private Obligation3 Obligation;
	private Statement32 StatementParameters;
	private Optional<Pagination> Pagination;
	private InterestStatement3 InterestStatement;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<Agreement2> getAgreement() {
		return Agreement;
	}

	public void setAgreement(Optional<Agreement2> Agreement) {
		this.Agreement = Agreement;
	}

	public Obligation3 getObligation() {
		return Obligation;
	}

	public void setObligation(Obligation3 Obligation) {
		this.Obligation = Obligation;
	}

	public Statement32 getStatementParameters() {
		return StatementParameters;
	}

	public void setStatementParameters(Statement32 StatementParameters) {
		this.StatementParameters = StatementParameters;
	}

	public Optional<Pagination> getPagination() {
		return Pagination;
	}

	public void setPagination(Optional<Pagination> Pagination) {
		this.Pagination = Pagination;
	}

	public InterestStatement3 getInterestStatement() {
		return InterestStatement;
	}

	public void setInterestStatement(InterestStatement3 InterestStatement) {
		this.InterestStatement = InterestStatement;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}