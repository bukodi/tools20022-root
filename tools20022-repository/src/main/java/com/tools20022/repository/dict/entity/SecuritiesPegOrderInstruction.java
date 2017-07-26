package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.PegTypeCode;
import com.tools20022.repository.dict.codeset.MoveTypeCode;
import com.tools20022.repository.dict.codeset.OffsetTypeCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.PriceProtectionScopeCode;
import com.tools20022.repository.dict.datatype.PlusOrMinusIndicator;
import com.tools20022.repository.dict.entity.SecuritiesOrderParameters;
import com.tools20022.repository.dict.entity.RoundingParameters;

/**
 * Instructions specific to pegged orders, which consist in an investor buying
 * large amounts of the underlying asset of a derivative it holds.
 */
public class SecuritiesPegOrderInstruction {

	private CurrencyAndAmount Offset;
	private PegTypeCode PriceType;
	private MoveTypeCode MoveType;
	private OffsetTypeCode OffsetType;
	private Max35Text LimitType;
	private PriceProtectionScopeCode Scope;
	private PlusOrMinusIndicator OffsetSign;
	private SecuritiesOrderParameters Order;
	private RoundingParameters RoundDirection;

	public CurrencyAndAmount getOffset() {
		return Offset;
	}

	public void setOffset(CurrencyAndAmount Offset) {
		this.Offset = Offset;
	}

	public PegTypeCode getPriceType() {
		return PriceType;
	}

	public void setPriceType(PegTypeCode PriceType) {
		this.PriceType = PriceType;
	}

	public MoveTypeCode getMoveType() {
		return MoveType;
	}

	public void setMoveType(MoveTypeCode MoveType) {
		this.MoveType = MoveType;
	}

	public OffsetTypeCode getOffsetType() {
		return OffsetType;
	}

	public void setOffsetType(OffsetTypeCode OffsetType) {
		this.OffsetType = OffsetType;
	}

	public Max35Text getLimitType() {
		return LimitType;
	}

	public void setLimitType(Max35Text LimitType) {
		this.LimitType = LimitType;
	}

	public PriceProtectionScopeCode getScope() {
		return Scope;
	}

	public void setScope(PriceProtectionScopeCode Scope) {
		this.Scope = Scope;
	}

	public PlusOrMinusIndicator getOffsetSign() {
		return OffsetSign;
	}

	public void setOffsetSign(PlusOrMinusIndicator OffsetSign) {
		this.OffsetSign = OffsetSign;
	}

	public SecuritiesOrderParameters getOrder() {
		return Order;
	}

	public void setOrder(SecuritiesOrderParameters Order) {
		this.Order = Order;
	}

	public RoundingParameters getRoundDirection() {
		return RoundDirection;
	}

	public void setRoundDirection(RoundingParameters RoundDirection) {
		this.RoundDirection = RoundDirection;
	}
}