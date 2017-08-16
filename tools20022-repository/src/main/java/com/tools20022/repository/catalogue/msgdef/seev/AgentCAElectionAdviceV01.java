package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.ElectionAdviceFunction1;
import com.tools20022.repository.dict.msg.CorporateActionInformation1;
import com.tools20022.repository.dict.msg.CorporateActionElection3;
import com.tools20022.repository.dict.msg.CorporateActionAdditionalInformation1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ContactPerson1;

/**
 * Scope This message is sent by a CSD to the issuer (or its agent) to provide
 * information about the clients' election instruction, the registration
 * details, the delivery details, etc. In case of an election with underlying
 * resource movements, it also confirms that these have been completed. This
 * message may also be sent in case of an amendment of an election, once the CSD
 * has completed the required resource movements. Usage This message can be used
 * for a new election advice or an amended election advice. If this message is
 * used for a new election advice, the function of the message must be 'new
 * election'. If this message is used for an amended election advice, the
 * function of the message must be 'option change' and the identification of the
 * previously sent election advice must be present. This message can include the
 * cash movements and/or securities movements in the case of an election with
 * underlying resource movements. Additionally, this message can include
 * delivery, certification and beneficial owner details. Note: this information
 * can be also sent separately in the Agent Corporate Action Information advice
 * message.
 */
public class AgentCAElectionAdviceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification8 Identification;
	private ElectionAdviceFunction1 ElectionAdviceTypeAndLinkage;
	private CorporateActionInformation1 CorporateActionGeneralInformation;
	private CorporateActionElection3 ElectionDetails;
	private Optional<CorporateActionAdditionalInformation1> AdditionalInformation;
	private Optional<ContactPerson1> ContactDetails;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public ElectionAdviceFunction1 getElectionAdviceTypeAndLinkage() {
		return ElectionAdviceTypeAndLinkage;
	}

	public void setElectionAdviceTypeAndLinkage(
			ElectionAdviceFunction1 ElectionAdviceTypeAndLinkage) {
		this.ElectionAdviceTypeAndLinkage = ElectionAdviceTypeAndLinkage;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation1 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public CorporateActionElection3 getElectionDetails() {
		return ElectionDetails;
	}

	public void setElectionDetails(CorporateActionElection3 ElectionDetails) {
		this.ElectionDetails = ElectionDetails;
	}

	public Optional<CorporateActionAdditionalInformation1> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionAdditionalInformation1> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}

	public Optional<ContactPerson1> getContactDetails() {
		return ContactDetails;
	}

	public void setContactDetails(Optional<ContactPerson1> ContactDetails) {
		this.ContactDetails = ContactDetails;
	}
}