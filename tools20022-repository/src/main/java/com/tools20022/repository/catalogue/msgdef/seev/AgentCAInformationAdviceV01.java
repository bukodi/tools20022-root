package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification8;
import java.util.Optional;
import com.tools20022.repository.dict.msg.CorporateActionInformation1;
import com.tools20022.repository.dict.msg.SecuritiesAccount7;
import com.tools20022.repository.dict.msg.CorporateActionAdditionalInformation1;
import com.tools20022.repository.dict.msg.ContactPerson1;

/**
 * Scope This message is sent by a CSD to an issuer (or its agent) to provide
 * information about the certification and/or the delivery details to the issuer
 * (or its agent). Usage This message can be used in the case of a corporate
 * action event without an election. This message can also be used in the case
 * of a corporate action event with election when the election details and the
 * additional information cannot be provided in the same message. In this case,
 * the Agent Corporate Action Election Advice Identification must be used to
 * link this message to the election advice for which additional information is
 * provided.
 */
public class AgentCAInformationAdviceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification8 Identification;
	private Optional<DocumentIdentification8> AgentCAElectionAdviceIdentification;
	private CorporateActionInformation1 CorporateActionGeneralInformation;
	private SecuritiesAccount7 AccountDetails;
	private CorporateActionAdditionalInformation1 CorporateActionAdditionalInformation;
	private Optional<ContactPerson1> ContactDetails;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public Optional<DocumentIdentification8> getAgentCAElectionAdviceIdentification() {
		return AgentCAElectionAdviceIdentification;
	}

	public void setAgentCAElectionAdviceIdentification(
			Optional<DocumentIdentification8> AgentCAElectionAdviceIdentification) {
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

	public CorporateActionAdditionalInformation1 getCorporateActionAdditionalInformation() {
		return CorporateActionAdditionalInformation;
	}

	public void setCorporateActionAdditionalInformation(
			CorporateActionAdditionalInformation1 CorporateActionAdditionalInformation) {
		this.CorporateActionAdditionalInformation = CorporateActionAdditionalInformation;
	}

	public Optional<ContactPerson1> getContactDetails() {
		return ContactDetails;
	}

	public void setContactDetails(Optional<ContactPerson1> ContactDetails) {
		this.ContactDetails = ContactDetails;
	}
}