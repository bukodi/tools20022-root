package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.Mandate;
import com.tools20022.repository.dict.datatype.TrueFalseIndicator;
import com.tools20022.repository.dict.datatype.Max15PlusSignedNumericText;
import com.tools20022.repository.dict.entity.Signature;

/**
 * Specifies the signature requirements for managing an account.
 */
public class SignatureCondition extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Number RequiredSignatureNumber;
	private YesNoIndicator SignatoryRightIndicator;
	private Mandate Mandate;
	private TrueFalseIndicator SignatureOrderIndicator;
	private Max15PlusSignedNumericText SignatureOrder;
	private Signature Signature;

	public Number getRequiredSignatureNumber() {
		return RequiredSignatureNumber;
	}

	public void setRequiredSignatureNumber(Number RequiredSignatureNumber) {
		this.RequiredSignatureNumber = RequiredSignatureNumber;
	}

	public YesNoIndicator getSignatoryRightIndicator() {
		return SignatoryRightIndicator;
	}

	public void setSignatoryRightIndicator(
			YesNoIndicator SignatoryRightIndicator) {
		this.SignatoryRightIndicator = SignatoryRightIndicator;
	}

	public Mandate getMandate() {
		return Mandate;
	}

	public void setMandate(Mandate Mandate) {
		this.Mandate = Mandate;
	}

	public TrueFalseIndicator getSignatureOrderIndicator() {
		return SignatureOrderIndicator;
	}

	public void setSignatureOrderIndicator(
			TrueFalseIndicator SignatureOrderIndicator) {
		this.SignatureOrderIndicator = SignatureOrderIndicator;
	}

	public Max15PlusSignedNumericText getSignatureOrder() {
		return SignatureOrder;
	}

	public void setSignatureOrder(Max15PlusSignedNumericText SignatureOrder) {
		this.SignatureOrder = SignatureOrder;
	}

	public Signature getSignature() {
		return Signature;
	}

	public void setSignature(Signature Signature) {
		this.Signature = Signature;
	}
}