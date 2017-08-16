package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.codeset.BenchmarkCurveNameCode;
import com.tools20022.repository.dict.datatype.Max256Text;
import com.tools20022.repository.dict.entity.Spread;

/**
 * Describes a benchmark curve.
 */
public class Curve extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CurrencyCode Currency;
	private BenchmarkCurveNameCode Name;
	private Max256Text Point;
	private Spread Spread;

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}

	public BenchmarkCurveNameCode getName() {
		return Name;
	}

	public void setName(BenchmarkCurveNameCode Name) {
		this.Name = Name;
	}

	public Max256Text getPoint() {
		return Point;
	}

	public void setPoint(Max256Text Point) {
		this.Point = Point;
	}

	public Spread getSpread() {
		return Spread;
	}

	public void setSpread(Spread Spread) {
		this.Spread = Spread;
	}
}