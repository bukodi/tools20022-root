package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesOrderExecutionInstruction;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.PlusOrMinusIndicator;
import com.tools20022.repository.dict.codeset.TypeOfDiscretionPriceCode;
import com.tools20022.repository.dict.codeset.MoveTypeCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.PriceProtectionScopeCode;
import com.tools20022.repository.dict.codeset.OffsetTypeCode;

/**
 * Indicates on an order that the trader wishes to display one price in the
 * market but will accept trades at another price.
 */
public class Discretion extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesOrderExecutionInstruction RelatedOrderExecution;
	private CurrencyAndAmount Offset;
	private PlusOrMinusIndicator OffsetSign;
	private TypeOfDiscretionPriceCode RelatedPriceType;
	private MoveTypeCode MoveType;
	private Max35Text LimitType;
	private Max35Text RoundDirection;
	private PriceProtectionScopeCode Scope;
	private OffsetTypeCode OffsetType;

	public SecuritiesOrderExecutionInstruction getRelatedOrderExecution() {
		return RelatedOrderExecution;
	}

	public void setRelatedOrderExecution(
			SecuritiesOrderExecutionInstruction RelatedOrderExecution) {
		this.RelatedOrderExecution = RelatedOrderExecution;
	}

	public CurrencyAndAmount getOffset() {
		return Offset;
	}

	public void setOffset(CurrencyAndAmount Offset) {
		this.Offset = Offset;
	}

	public PlusOrMinusIndicator getOffsetSign() {
		return OffsetSign;
	}

	public void setOffsetSign(PlusOrMinusIndicator OffsetSign) {
		this.OffsetSign = OffsetSign;
	}

	public TypeOfDiscretionPriceCode getRelatedPriceType() {
		return RelatedPriceType;
	}

	public void setRelatedPriceType(TypeOfDiscretionPriceCode RelatedPriceType) {
		this.RelatedPriceType = RelatedPriceType;
	}

	public MoveTypeCode getMoveType() {
		return MoveType;
	}

	public void setMoveType(MoveTypeCode MoveType) {
		this.MoveType = MoveType;
	}

	public Max35Text getLimitType() {
		return LimitType;
	}

	public void setLimitType(Max35Text LimitType) {
		this.LimitType = LimitType;
	}

	public Max35Text getRoundDirection() {
		return RoundDirection;
	}

	public void setRoundDirection(Max35Text RoundDirection) {
		this.RoundDirection = RoundDirection;
	}

	public PriceProtectionScopeCode getScope() {
		return Scope;
	}

	public void setScope(PriceProtectionScopeCode Scope) {
		this.Scope = Scope;
	}

	public OffsetTypeCode getOffsetType() {
		return OffsetType;
	}

	public void setOffsetType(OffsetTypeCode OffsetType) {
		this.OffsetType = OffsetType;
	}
}