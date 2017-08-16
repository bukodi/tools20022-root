package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.TaxRecord;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.codeset.TaxRecordPeriodCode;
import com.tools20022.repository.dict.entity.DateTimePeriod;

/**
 * Period of time details related to the tax payment.
 */
public class TaxPeriod extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private TaxRecord TaxRecord;
	private ISODate Year;
	private TaxRecordPeriodCode Type;
	private DateTimePeriod FromToDate;
	private ISODate EndOfFiscalYear;

	public TaxRecord getTaxRecord() {
		return TaxRecord;
	}

	public void setTaxRecord(TaxRecord TaxRecord) {
		this.TaxRecord = TaxRecord;
	}

	public ISODate getYear() {
		return Year;
	}

	public void setYear(ISODate Year) {
		this.Year = Year;
	}

	public TaxRecordPeriodCode getType() {
		return Type;
	}

	public void setType(TaxRecordPeriodCode Type) {
		this.Type = Type;
	}

	public DateTimePeriod getFromToDate() {
		return FromToDate;
	}

	public void setFromToDate(DateTimePeriod FromToDate) {
		this.FromToDate = FromToDate;
	}

	public ISODate getEndOfFiscalYear() {
		return EndOfFiscalYear;
	}

	public void setEndOfFiscalYear(ISODate EndOfFiscalYear) {
		this.EndOfFiscalYear = EndOfFiscalYear;
	}
}