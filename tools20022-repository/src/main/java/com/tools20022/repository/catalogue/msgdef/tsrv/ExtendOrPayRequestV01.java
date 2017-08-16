package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.ExtendOrPayQuery1;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The ExtendOrPayRequest message is sent by the party that issued the
 * undertaking to the party that requested issuance of the undertaking
 * (applicant or obligor), to request the applicant's response to a beneficiary
 * request to extend or pay.
 */
public class ExtendOrPayRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private ExtendOrPayQuery1 ExtendOrPayRequestDetails;
	private Optional<PartyAndSignature2> DigitalSignature;

	public ExtendOrPayQuery1 getExtendOrPayRequestDetails() {
		return ExtendOrPayRequestDetails;
	}

	public void setExtendOrPayRequestDetails(
			ExtendOrPayQuery1 ExtendOrPayRequestDetails) {
		this.ExtendOrPayRequestDetails = ExtendOrPayRequestDetails;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}