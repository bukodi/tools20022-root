package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.UndertakingPartyRole;
import com.tools20022.repository.dict.codeset.PresentationPartyCode;

/**
 * Place at which the documents must be presented.
 */
public class UndertakingPlaceOfPresentation extends UndertakingPartyRole {

	private PresentationPartyCode PresentationUnderConfirmation;

	public PresentationPartyCode getPresentationUnderConfirmation() {
		return PresentationUnderConfirmation;
	}

	public void setPresentationUnderConfirmation(
			PresentationPartyCode PresentationUnderConfirmation) {
		this.PresentationUnderConfirmation = PresentationUnderConfirmation;
	}
}