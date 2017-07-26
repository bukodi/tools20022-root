package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Distribution;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.SecuritiesDistribution;
import com.tools20022.repository.dict.entity.CashDistribution;

/**
 * Characteristics for a mixed cash and securities distribution event.
 */
public class SecuritiesAndCashDistribution extends Distribution {

	private SecuritiesQuantity IntermediateToUnderlyingDenominator;
	private SecuritiesQuantity MaximumHolding;
	private SecuritiesQuantity MaximumExercisableQuantity;
	private SecuritiesQuantity MinimumExercisableQuantity;
	private SecuritiesQuantity DistributedToUnderlyingDenominator;
	private SecuritiesQuantity IntermediateToUnderlyingNumerator;
	private SecuritiesQuantity MinimumHolding;
	private SecuritiesQuantity DistributedToUnderlyingNumerator;
	private SecuritiesDistribution SecuritiesDistribution;
	private CashDistribution CashDistribution;

	public SecuritiesQuantity getIntermediateToUnderlyingDenominator() {
		return IntermediateToUnderlyingDenominator;
	}

	public void setIntermediateToUnderlyingDenominator(
			SecuritiesQuantity IntermediateToUnderlyingDenominator) {
		this.IntermediateToUnderlyingDenominator = IntermediateToUnderlyingDenominator;
	}

	public SecuritiesQuantity getMaximumHolding() {
		return MaximumHolding;
	}

	public void setMaximumHolding(SecuritiesQuantity MaximumHolding) {
		this.MaximumHolding = MaximumHolding;
	}

	public SecuritiesQuantity getMaximumExercisableQuantity() {
		return MaximumExercisableQuantity;
	}

	public void setMaximumExercisableQuantity(
			SecuritiesQuantity MaximumExercisableQuantity) {
		this.MaximumExercisableQuantity = MaximumExercisableQuantity;
	}

	public SecuritiesQuantity getMinimumExercisableQuantity() {
		return MinimumExercisableQuantity;
	}

	public void setMinimumExercisableQuantity(
			SecuritiesQuantity MinimumExercisableQuantity) {
		this.MinimumExercisableQuantity = MinimumExercisableQuantity;
	}

	public SecuritiesQuantity getDistributedToUnderlyingDenominator() {
		return DistributedToUnderlyingDenominator;
	}

	public void setDistributedToUnderlyingDenominator(
			SecuritiesQuantity DistributedToUnderlyingDenominator) {
		this.DistributedToUnderlyingDenominator = DistributedToUnderlyingDenominator;
	}

	public SecuritiesQuantity getIntermediateToUnderlyingNumerator() {
		return IntermediateToUnderlyingNumerator;
	}

	public void setIntermediateToUnderlyingNumerator(
			SecuritiesQuantity IntermediateToUnderlyingNumerator) {
		this.IntermediateToUnderlyingNumerator = IntermediateToUnderlyingNumerator;
	}

	public SecuritiesQuantity getMinimumHolding() {
		return MinimumHolding;
	}

	public void setMinimumHolding(SecuritiesQuantity MinimumHolding) {
		this.MinimumHolding = MinimumHolding;
	}

	public SecuritiesQuantity getDistributedToUnderlyingNumerator() {
		return DistributedToUnderlyingNumerator;
	}

	public void setDistributedToUnderlyingNumerator(
			SecuritiesQuantity DistributedToUnderlyingNumerator) {
		this.DistributedToUnderlyingNumerator = DistributedToUnderlyingNumerator;
	}

	public SecuritiesDistribution getSecuritiesDistribution() {
		return SecuritiesDistribution;
	}

	public void setSecuritiesDistribution(
			SecuritiesDistribution SecuritiesDistribution) {
		this.SecuritiesDistribution = SecuritiesDistribution;
	}

	public CashDistribution getCashDistribution() {
		return CashDistribution;
	}

	public void setCashDistribution(CashDistribution CashDistribution) {
		this.CashDistribution = CashDistribution;
	}
}