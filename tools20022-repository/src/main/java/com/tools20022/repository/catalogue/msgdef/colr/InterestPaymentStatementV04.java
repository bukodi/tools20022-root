package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.repository.catalogue.msgdef.colr.InterestPaymentStatementV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Agreement4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Obligation4;
import com.tools20022.repository.dict.msg.Statement32;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.InterestStatement4;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The InterestPaymentStatement message is sent by either the collateral
 * giver or its collateral manager to the collateral taker or its collateral
 * manager. It is used to report the interest amounts calculated based on the
 * effective posted collateral amount, over a specific period of time agreed by
 * both parties.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage The InterestPaymentStatement message is used for reporting the interest
 * per period on collateral held.
 */
@PreviousVersion(InterestPaymentStatementV03.class)
public class InterestPaymentStatementV04 {

	private Max35Text TransactionIdentification;
	private Optional<Agreement4> Agreement;
	private Obligation4 Obligation;
	private Statement32 StatementParameters;
	private Optional<Pagination> Pagination;
	private InterestStatement4 InterestStatement;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<Agreement4> getAgreement() {
		return Agreement;
	}

	public void setAgreement(Optional<Agreement4> Agreement) {
		this.Agreement = Agreement;
	}

	public Obligation4 getObligation() {
		return Obligation;
	}

	public void setObligation(Obligation4 Obligation) {
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

	public InterestStatement4 getInterestStatement() {
		return InterestStatement;
	}

	public void setInterestStatement(InterestStatement4 InterestStatement) {
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