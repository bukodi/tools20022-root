package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountRequestAcknowledgementV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.References5;
import com.tools20022.repository.dict.msg.AccountForAction1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.OrganisationIdentification6;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.dict.msg.PartyAndSignature1;

/**
 * Scope The AccountRequestAcknowledgement message is sent from a financial
 * institution to an organisation. This message is sent in response to a request
 * message from the organisation. It is sent after the request has been
 * validated from an authentication and authorization point of view. The
 * business content has not yet been validated at this stage. Usage This message
 * should only be sent after the request has been validated from an
 * authentication and authorization point of view.
 */
@NextVersion(AccountRequestAcknowledgementV02.class)
public class AccountRequestAcknowledgementV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private References5 References;
	private Optional<AccountForAction1> AccountIdentification;
	private OrganisationIdentification6 OrganisationIdentification;
	private BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification;
	private Optional<PartyAndSignature1> DigitalSignature;

	public References5 getReferences() {
		return References;
	}

	public void setReferences(References5 References) {
		this.References = References;
	}

	public Optional<AccountForAction1> getAccountIdentification() {
		return AccountIdentification;
	}

	public void setAccountIdentification(
			Optional<AccountForAction1> AccountIdentification) {
		this.AccountIdentification = AccountIdentification;
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

	public Optional<PartyAndSignature1> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature1> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}