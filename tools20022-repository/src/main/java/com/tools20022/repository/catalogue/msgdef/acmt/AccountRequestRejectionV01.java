package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountRequestRejectionV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.References6;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.dict.msg.AccountForAction1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.OrganisationIdentification6;
import com.tools20022.repository.dict.msg.PartyAndSignature1;

/**
 * Scope The AccountRequestRejection message is sent from a financial
 * institution to an organisation. This message is sent in response to a request
 * message from the organisation, if the business content is not valid. Usage
 */
@NextVersion(AccountRequestRejectionV02.class)
public class AccountRequestRejectionV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private References6 References;
	private BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification;
	private Optional<AccountForAction1> AccountIdentification;
	private OrganisationIdentification6 OrganisationIdentification;
	private Optional<PartyAndSignature1> DigitalSignature;

	public References6 getReferences() {
		return References;
	}

	public void setReferences(References6 References) {
		this.References = References;
	}

	public BranchAndFinancialInstitutionIdentification4 getAccountServicerIdentification() {
		return AccountServicerIdentification;
	}

	public void setAccountServicerIdentification(
			BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification) {
		this.AccountServicerIdentification = AccountServicerIdentification;
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

	public Optional<PartyAndSignature1> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature1> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}