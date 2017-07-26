package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.BankServicesBillingStatementV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.ReportHeader3;
import com.tools20022.repository.dict.msg.StatementGroup2;

/**
 * Scope The BankServicesBillingStatement message is used to send from a
 * Financial Institution (FI) to its wholesale customers (corporations,
 * governments, institutions, etc.), information describing the FI’s billing of
 * services rendered in the form of an electronic statement in a standardised
 * format. The BankServicesBillingStatement is a periodic (usually end of month)
 * recounting of all service chargeable events that occurred during a reporting
 * cycle, typically a calendar month, along with detailed tax and currency
 * translation information. Account balance information, although strongly
 * recommended, is not required. Usage The BankServicesBillingStatement message
 * is designed to provide details related to invoices (or an advice of debit)
 * which a financial institution may supply to its customers. The
 * BankServicesBillingStatement is not expressly designed to be an invoice, nor
 * to replace invoices currently in use. The message may be used as an invoice
 * by agreement between the sender and the receiver. No regulatory or
 * legislative requirements were considered when creating this message standard.
 * Users of the BankServicesBillingStatement message are cautioned to be aware
 * of any regulatory or legal requirement for invoices before replacing existing
 * invoices. The BankServicesBillingStatement message can supply the detail
 * supporting separate invoices or debits but it is not the invoice or advice of
 * debit of record. The BankServicesBillingStatement message must accurately
 * reflect all the charge and tax related events that occurred during the
 * calendar month and how the FI and taxing authorities were compensated for
 * these events. The BankServicesBillingStatement does not ask the financial
 * institution to revise its established pricing and billing procedures. How,
 * when and what the customer is actually charged for remains in place. The
 * BankServicesBillingStatement message asks the financial institution to
 * aggregate and report what actually happened during the calendar month. The
 * BankServicesBillingStatement message is intended for use with the ISO 20022
 * Business Application Header.
 */
@PreviousVersion(BankServicesBillingStatementV01.class)
public class BankServicesBillingStatementV02 {

	private ReportHeader3 ReportHeader;
	private StatementGroup2 BillingStatementGroup;

	public ReportHeader3 getReportHeader() {
		return ReportHeader;
	}

	public void setReportHeader(ReportHeader3 ReportHeader) {
		this.ReportHeader = ReportHeader;
	}

	public StatementGroup2 getBillingStatementGroup() {
		return BillingStatementGroup;
	}

	public void setBillingStatementGroup(StatementGroup2 BillingStatementGroup) {
		this.BillingStatementGroup = BillingStatementGroup;
	}
}