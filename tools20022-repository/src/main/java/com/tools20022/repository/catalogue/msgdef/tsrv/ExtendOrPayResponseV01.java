package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.repository.dict.msg.ExtendOrPayQuery2;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The ExtendOrPayResponse message is sent by the party that requested issuance
 * of the undertaking (applicant or obligor) to the party that issued the
 * undertaking, in response to the issuer's request for the applicant's response
 * to the beneficiary’s request to extend or pay.
 */
public class ExtendOrPayResponseV01 {

	private ExtendOrPayQuery2 ExtendOrPayResponseDetails;
	private Optional<PartyAndSignature2> DigitalSignature;

	public ExtendOrPayQuery2 getExtendOrPayResponseDetails() {
		return ExtendOrPayResponseDetails;
	}

	public void setExtendOrPayResponseDetails(
			ExtendOrPayQuery2 ExtendOrPayResponseDetails) {
		this.ExtendOrPayResponseDetails = ExtendOrPayResponseDetails;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}