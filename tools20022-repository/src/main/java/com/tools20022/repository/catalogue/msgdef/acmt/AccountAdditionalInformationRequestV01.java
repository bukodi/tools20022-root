package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountAdditionalInformationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.References3;
import com.tools20022.repository.dict.msg.OrganisationIdentification6;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.dict.msg.AccountForAction1;
import com.tools20022.repository.dict.msg.PartyAndSignature1;
import java.util.Optional;

/**
 * Scope The AccountAdditionalInformationRequest message is sent from a
 * financial institution to an organisation as part of maintenance process. This
 * message is sent in response to a request message from the organisation, if
 * the business content is valid, but additional information is required. Usage
 * This message should only be sent if additional information is required as
 * part of the account maintenance process.
 */
@NextVersion(AccountAdditionalInformationRequestV02.class)
public class AccountAdditionalInformationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private References3 References;
	private OrganisationIdentification6 OrganisationIdentification;
	private BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification;
	private AccountForAction1 AccountIdentification;
	private Optional<PartyAndSignature1> DigitalSignature;

	public References3 getReferences() {
		return References;
	}

	public void setReferences(References3 References) {
		this.References = References;
	}

	public OrganisationIdentification6 getOrganisationIdentification() {
		return OrganisationIdentification;
	}

	public void setOrganisationIdentification(
			OrganisationIdentification6 OrganisationIdentification) {
		this.OrganisationIdentification = OrganisationIdentification;
	}

	public BranchAndFinancialInstitutionIdentification4 getAccountServicerIdentification() {
		return AccountServicerIdentification;
	}

	public void setAccountServicerIdentification(
			BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification) {
		this.AccountServicerIdentification = AccountServicerIdentification;
	}

	public AccountForAction1 getAccountIdentification() {
		return AccountIdentification;
	}

	public void setAccountIdentification(AccountForAction1 AccountIdentification) {
		this.AccountIdentification = AccountIdentification;
	}

	public Optional<PartyAndSignature1> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature1> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}