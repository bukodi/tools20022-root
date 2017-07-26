package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesProceedsDefinition;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.entity.Warrant;

/**
 * Ratio expressed as a quotient of quantities.
 */
public class QuantityRatio {

	private SecuritiesProceedsDefinition AdditionalQuantityForResultantSecuritiesProceedsDefinition;
	private DecimalNumber Quantity1;
	private DecimalNumber Quantity2;
	private SecuritiesProceedsDefinition AdditionalQuantityForSubscribedSecuritiesProceedsDefinition;
	private SecuritiesProceedsDefinition NewToOldProceedsDefinition;
	private SecuritiesProceedsDefinition NewToUnderlyingProceedsDefinition;
	private SecuritiesProceedsDefinition IntermediateSecuritiesProceedsDefinition;
	private Warrant warrant;

	public SecuritiesProceedsDefinition getAdditionalQuantityForResultantSecuritiesProceedsDefinition() {
		return AdditionalQuantityForResultantSecuritiesProceedsDefinition;
	}

	public void setAdditionalQuantityForResultantSecuritiesProceedsDefinition(
			SecuritiesProceedsDefinition AdditionalQuantityForResultantSecuritiesProceedsDefinition) {
		this.AdditionalQuantityForResultantSecuritiesProceedsDefinition = AdditionalQuantityForResultantSecuritiesProceedsDefinition;
	}

	public DecimalNumber getQuantity1() {
		return Quantity1;
	}

	public void setQuantity1(DecimalNumber Quantity1) {
		this.Quantity1 = Quantity1;
	}

	public DecimalNumber getQuantity2() {
		return Quantity2;
	}

	public void setQuantity2(DecimalNumber Quantity2) {
		this.Quantity2 = Quantity2;
	}

	public SecuritiesProceedsDefinition getAdditionalQuantityForSubscribedSecuritiesProceedsDefinition() {
		return AdditionalQuantityForSubscribedSecuritiesProceedsDefinition;
	}

	public void setAdditionalQuantityForSubscribedSecuritiesProceedsDefinition(
			SecuritiesProceedsDefinition AdditionalQuantityForSubscribedSecuritiesProceedsDefinition) {
		this.AdditionalQuantityForSubscribedSecuritiesProceedsDefinition = AdditionalQuantityForSubscribedSecuritiesProceedsDefinition;
	}

	public SecuritiesProceedsDefinition getNewToOldProceedsDefinition() {
		return NewToOldProceedsDefinition;
	}

	public void setNewToOldProceedsDefinition(
			SecuritiesProceedsDefinition NewToOldProceedsDefinition) {
		this.NewToOldProceedsDefinition = NewToOldProceedsDefinition;
	}

	public SecuritiesProceedsDefinition getNewToUnderlyingProceedsDefinition() {
		return NewToUnderlyingProceedsDefinition;
	}

	public void setNewToUnderlyingProceedsDefinition(
			SecuritiesProceedsDefinition NewToUnderlyingProceedsDefinition) {
		this.NewToUnderlyingProceedsDefinition = NewToUnderlyingProceedsDefinition;
	}

	public SecuritiesProceedsDefinition getIntermediateSecuritiesProceedsDefinition() {
		return IntermediateSecuritiesProceedsDefinition;
	}

	public void setIntermediateSecuritiesProceedsDefinition(
			SecuritiesProceedsDefinition IntermediateSecuritiesProceedsDefinition) {
		this.IntermediateSecuritiesProceedsDefinition = IntermediateSecuritiesProceedsDefinition;
	}

	public Warrant getWarrant() {
		return warrant;
	}

	public void setWarrant(Warrant warrant) {
		this.warrant = warrant;
	}
}