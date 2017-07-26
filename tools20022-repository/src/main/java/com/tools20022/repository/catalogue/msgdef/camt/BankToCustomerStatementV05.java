package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.BankToCustomerStatementV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.camt.BankToCustomerStatementV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader58;
import com.tools20022.repository.dict.msg.AccountStatement5;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The BankToCustomerStatement message is sent by the account servicer to
 * an account owner or to a party authorised by the account owner to receive the
 * message. It is used to inform the account owner, or authorised party, of the
 * entries booked to the account, and to provide the owner with balance
 * information on the account at a given point in time. Usage The
 * BankToCustomerStatement message can contain reports for more than one
 * account. It provides information for cash management and/or reconciliation.
 * It contains information on booked entries only. It can include underlying
 * details of transactions that have been included in the entry. The message is
 * exchanged as defined between the account servicer and the account owner. It
 * provides information on items that have been booked to the account and also
 * balance information. Depending on services and schedule agreed between banks
 * and their customers, statements may be generated and exchanged accordingly,
 * for example for intraday or prior day periods. It is possible that the
 * receiver of the message is not the account owner, but a party entitled
 * through arrangement with the account owner to receive the account information
 * (also known as recipient).
 */
@PreviousVersion(BankToCustomerStatementV04.class)
@NextVersion(BankToCustomerStatementV06.class)
public class BankToCustomerStatementV05 {

	private GroupHeader58 GroupHeader;
	private AccountStatement5 Statement;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader58 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader58 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public AccountStatement5 getStatement() {
		return Statement;
	}

	public void setStatement(AccountStatement5 Statement) {
		this.Statement = Statement;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}