package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.RegulatoryReportingTypeCode;
import com.tools20022.repository.dict.entity.RegulatoryAuthorityRole;
import com.tools20022.repository.dict.datatype.Max10Text;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.FinancialTransaction;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.ReportingPartyRole;

/**
 * Information needed due to regulatory and statutory requirements.
 */
public class RegulatoryReport {

	private RegulatoryReportingTypeCode DebitCreditReportingIndicator;
	private RegulatoryAuthorityRole Authority;
	private Max10Text Code;
	private CurrencyAndAmount Amount;
	private Max35Text Description;
	private Max35Text Type;
	private ISODate Date;
	private FinancialTransaction ReportedTransaction;
	private Max35Text UnderlyingProduct;
	private YesNoIndicator NonStandardFlag;
	private ReportingPartyRole ReportingPartyRole;

	public RegulatoryReportingTypeCode getDebitCreditReportingIndicator() {
		return DebitCreditReportingIndicator;
	}

	public void setDebitCreditReportingIndicator(
			RegulatoryReportingTypeCode DebitCreditReportingIndicator) {
		this.DebitCreditReportingIndicator = DebitCreditReportingIndicator;
	}

	public RegulatoryAuthorityRole getAuthority() {
		return Authority;
	}

	public void setAuthority(RegulatoryAuthorityRole Authority) {
		this.Authority = Authority;
	}

	public Max10Text getCode() {
		return Code;
	}

	public void setCode(Max10Text Code) {
		this.Code = Code;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public Max35Text getDescription() {
		return Description;
	}

	public void setDescription(Max35Text Description) {
		this.Description = Description;
	}

	public Max35Text getType() {
		return Type;
	}

	public void setType(Max35Text Type) {
		this.Type = Type;
	}

	public ISODate getDate() {
		return Date;
	}

	public void setDate(ISODate Date) {
		this.Date = Date;
	}

	public FinancialTransaction getReportedTransaction() {
		return ReportedTransaction;
	}

	public void setReportedTransaction(FinancialTransaction ReportedTransaction) {
		this.ReportedTransaction = ReportedTransaction;
	}

	public Max35Text getUnderlyingProduct() {
		return UnderlyingProduct;
	}

	public void setUnderlyingProduct(Max35Text UnderlyingProduct) {
		this.UnderlyingProduct = UnderlyingProduct;
	}

	public YesNoIndicator getNonStandardFlag() {
		return NonStandardFlag;
	}

	public void setNonStandardFlag(YesNoIndicator NonStandardFlag) {
		this.NonStandardFlag = NonStandardFlag;
	}

	public ReportingPartyRole getReportingPartyRole() {
		return ReportingPartyRole;
	}

	public void setReportingPartyRole(ReportingPartyRole ReportingPartyRole) {
		this.ReportingPartyRole = ReportingPartyRole;
	}
}