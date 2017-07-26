package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionInformation1;
import com.tools20022.repository.dict.msg.SecuritiesAccount7;
import com.tools20022.repository.dict.msg.CorporateActionElection1;
import com.tools20022.repository.dict.msg.CorporateActionElection2;
import com.tools20022.repository.dict.msg.ContactPerson1;
import java.util.Optional;

/**
 * Scope This message is sent by a CSD to the issuer (or its agent) to request
 * the authorisation of an amendment of a previously sent Agent Corporate Action
 * Election Advice message. Usage This message is used to request the amendment
 * of a previously sent Agent Corporate Action Election Advice message. Once the
 * amendment request has been accepted by the issuer (or its agent), the CSD
 * will process any resource movement and send an Agent Corporate Action
 * Election Advice message with the function, option change, to confirm that the
 * amendment has been booked at the CSD. This message is used when the terms and
 * conditions of the corporate action event allow amendments.
 */
public class AgentCAElectionAmendmentRequestV01 {

	private DocumentIdentification8 Identification;
	private DocumentIdentification8 AgentCAElectionAdviceIdentification;
	private CorporateActionInformation1 CorporateActionGeneralInformation;
	private SecuritiesAccount7 AccountDetails;
	private CorporateActionElection1 OriginalElectionDetails;
	private CorporateActionElection2 AmendedElectionDetails;
	private Optional<ContactPerson1> ContactDetails;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public DocumentIdentification8 getAgentCAElectionAdviceIdentification() {
		return AgentCAElectionAdviceIdentification;
	}

	public void setAgentCAElectionAdviceIdentification(
			DocumentIdentification8 AgentCAElectionAdviceIdentification) {
		this.AgentCAElectionAdviceIdentification = AgentCAElectionAdviceIdentification;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation1 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public SecuritiesAccount7 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(SecuritiesAccount7 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public CorporateActionElection1 getOriginalElectionDetails() {
		return OriginalElectionDetails;
	}

	public void setOriginalElectionDetails(
			CorporateActionElection1 OriginalElectionDetails) {
		this.OriginalElectionDetails = OriginalElectionDetails;
	}

	public CorporateActionElection2 getAmendedElectionDetails() {
		return AmendedElectionDetails;
	}

	public void setAmendedElectionDetails(
			CorporateActionElection2 AmendedElectionDetails) {
		this.AmendedElectionDetails = AmendedElectionDetails;
	}

	public Optional<ContactPerson1> getContactDetails() {
		return ContactDetails;
	}

	public void setContactDetails(Optional<ContactPerson1> ContactDetails) {
		this.ContactDetails = ContactDetails;
	}
}