package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountRequestAcknowledgementV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.References5;
import com.tools20022.repository.dict.msg.OrganisationIdentification8;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AccountForAction1;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The AccountRequestAcknowledgement message is sent from a financial
 * institution to an organisation. This message is sent in response to a request
 * message from the organisation. It is sent after the request has been
 * validated from an authentication and authorization point of view. The
 * business content has not yet been validated at this stage.
 */
@PreviousVersion(AccountRequestAcknowledgementV01.class)
public class AccountRequestAcknowledgementV02 {

	private References5 References;
	private Optional<OrganisationIdentification8> From;
	private Optional<AccountForAction1> AccountIdentification;
	private OrganisationIdentification8 OrganisationIdentification;
	private BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification;
	private Optional<PartyAndSignature2> DigitalSignature;
	private Optional<SupplementaryData1> SupplementaryData;

	public References5 getReferences() {
		return References;
	}

	public void setReferences(References5 References) {
		this.References = References;
	}

	public Optional<OrganisationIdentification8> getFrom() {
		return From;
	}

	public void setFrom(Optional<OrganisationIdentification8> From) {
		this.From = From;
	}

	public Optional<AccountForAction1> getAccountIdentification() {
		return AccountIdentification;
	}

	public void setAccountIdentification(
			Optional<AccountForAction1> AccountIdentification) {
		this.AccountIdentification = AccountIdentification;
	}

	public OrganisationIdentification8 getOrganisationIdentification() {
		return OrganisationIdentification;
	}

	public void setOrganisationIdentification(
			OrganisationIdentification8 OrganisationIdentification) {
		this.OrganisationIdentification = OrganisationIdentification;
	}

	public BranchAndFinancialInstitutionIdentification5 getAccountServicerIdentification() {
		return AccountServicerIdentification;
	}

	public void setAccountServicerIdentification(
			BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification) {
		this.AccountServicerIdentification = AccountServicerIdentification;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}