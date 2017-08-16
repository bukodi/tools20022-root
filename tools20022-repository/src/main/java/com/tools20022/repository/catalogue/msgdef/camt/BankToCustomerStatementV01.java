package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.BankToCustomerStatementV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader23;
import com.tools20022.repository.dict.msg.AccountStatement1;

/**
 * Scope The Bank-to-Customer Statement message is sent by the account servicer
 * to an account owner or to a party authorised by the account owner to receive
 * the message. It is used to inform the account owner, or authorised party, of
 * the entries booked to the account, and to provide the owner with balance
 * information on the account at a given point in time. Usage The
 * Bank-to-Customer Statement message can contain reports for more than 1
 * account. It provides information for cash management and/or reconciliation.
 * It contains information on booked entries only. It can include underlying
 * details of transactions that have been included in the entry. The message is
 * exchanged as defined between the account servicer and the account owner. It
 * provides information on items that have been booked to the account (and
 * therefore are "binding" and also balance information. Depending on services
 * agreed between banks and their customers, "binding" statements can be
 * generated and exchanged intraday. Depending on legal requirements in local
 * jurisdictions, "end-of-day" statements may need to be mandatorily generated
 * and exchanged. It is possible that the receiver of the message is not the
 * account owner, but a party entitled through arrangement with the account
 * owner to receive the account information (also known as recipient).
 */
@NextVersion(BankToCustomerStatementV02.class)
public class BankToCustomerStatementV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader23 GroupHeader;
	private AccountStatement1 Statement;

	public GroupHeader23 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader23 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public AccountStatement1 getStatement() {
		return Statement;
	}

	public void setStatement(AccountStatement1 Statement) {
		this.Statement = Statement;
	}
}