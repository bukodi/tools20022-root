package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Issuance;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.CapitalTypeCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.DecimalNumber;

/**
 * Amount of money targeted to be raised through the issuance of a security.
 */
public class Capital extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Issuance AssetIssuance;
	private ISODateTime Date;
	private CapitalTypeCode Type;
	private CurrencyAndAmount Amount;
	private DecimalNumber Unit;

	public Issuance getAssetIssuance() {
		return AssetIssuance;
	}

	public void setAssetIssuance(Issuance AssetIssuance) {
		this.AssetIssuance = AssetIssuance;
	}

	public ISODateTime getDate() {
		return Date;
	}

	public void setDate(ISODateTime Date) {
		this.Date = Date;
	}

	public CapitalTypeCode getType() {
		return Type;
	}

	public void setType(CapitalTypeCode Type) {
		this.Type = Type;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public DecimalNumber getUnit() {
		return Unit;
	}

	public void setUnit(DecimalNumber Unit) {
		this.Unit = Unit;
	}
}