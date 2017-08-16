package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionStandingInstructionGeneralInformation1;
import com.tools20022.repository.dict.msg.CorporateActionStandingInstruction1;
import com.tools20022.repository.dict.msg.ContactPerson1;
import java.util.Optional;

/**
 * Scope This message is sent by a CSD to the issuer (or its agent) to provide
 * the issuer (or its agent) with the CSD's client details for the distribution
 * of the proceeds of a corporate action event: - Gross or net payments. -
 * Delivery details for securities that have to be delivered outside of the CSD.
 * - Delivery details for cash amounts that have to be delivered outside of the
 * CSD. Usage This message is used to request the issuer (or its agent) to put a
 * standing instruction in place for proceeds. The amendment of a standing
 * instruction is done through a cancel-and-replace mechanism. First a standing
 * instruction cancellation request is sent followed by a new standing
 * instruction request.
 */
public class AgentCAStandingInstructionRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification8 Identification;
	private CorporateActionStandingInstructionGeneralInformation1 StandingInstructionGeneralInformation;
	private CorporateActionStandingInstruction1 StandingInstructionDetails;
	private Optional<ContactPerson1> ContactDetails;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public CorporateActionStandingInstructionGeneralInformation1 getStandingInstructionGeneralInformation() {
		return StandingInstructionGeneralInformation;
	}

	public void setStandingInstructionGeneralInformation(
			CorporateActionStandingInstructionGeneralInformation1 StandingInstructionGeneralInformation) {
		this.StandingInstructionGeneralInformation = StandingInstructionGeneralInformation;
	}

	public CorporateActionStandingInstruction1 getStandingInstructionDetails() {
		return StandingInstructionDetails;
	}

	public void setStandingInstructionDetails(
			CorporateActionStandingInstruction1 StandingInstructionDetails) {
		this.StandingInstructionDetails = StandingInstructionDetails;
	}

	public Optional<ContactPerson1> getContactDetails() {
		return ContactDetails;
	}

	public void setContactDetails(Optional<ContactPerson1> ContactDetails) {
		this.ContactDetails = ContactDetails;
	}
}