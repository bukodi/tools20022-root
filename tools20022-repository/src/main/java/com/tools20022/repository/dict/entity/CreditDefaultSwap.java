package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Swaps;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.datatype.ISOYearMonth;
import com.tools20022.repository.dict.datatype.Number;

/**
 * Credit default swap is a particular type of swap designed to transfer the
 * credit exposure of fixed income products between two or more parties.
 */
public class CreditDefaultSwap extends Swaps
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ISODate RollDate;
	private ISOYearMonth RollMonth;
	private Number Series;

	public ISODate getRollDate() {
		return RollDate;
	}

	public void setRollDate(ISODate RollDate) {
		this.RollDate = RollDate;
	}

	public ISOYearMonth getRollMonth() {
		return RollMonth;
	}

	public void setRollMonth(ISOYearMonth RollMonth) {
		this.RollMonth = RollMonth;
	}

	public Number getSeries() {
		return Series;
	}

	public void setSeries(Number Series) {
		this.Series = Series;
	}
}