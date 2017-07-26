package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountAdditionalInformationRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.References3;
import com.tools20022.repository.dict.msg.OrganisationIdentification8;
import java.util.Optional;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.dict.msg.AccountForAction1;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The AccountAdditionalInformationRequest message is sent from a financial
 * institution to an organisation as part of maintenance process. This message
 * is sent in response to a maintenance request message from the organisation,
 * if the business content is valid, but additional information is required.
 */
@PreviousVersion(AccountAdditionalInformationRequestV01.class)
public class AccountAdditionalInformationRequestV02 {

	private References3 References;
	private Optional<OrganisationIdentification8> From;
	private OrganisationIdentification8 OrganisationIdentification;
	private BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification;
	private AccountForAction1 AccountIdentification;
	private Optional<PartyAndSignature2> DigitalSignature;
	private Optional<SupplementaryData1> SupplementaryData;

	public References3 getReferences() {
		return References;
	}

	public void setReferences(References3 References) {
		this.References = References;
	}

	public Optional<OrganisationIdentification8> getFrom() {
		return From;
	}

	public void setFrom(Optional<OrganisationIdentification8> From) {
		this.From = From;
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

	public AccountForAction1 getAccountIdentification() {
		return AccountIdentification;
	}

	public void setAccountIdentification(AccountForAction1 AccountIdentification) {
		this.AccountIdentification = AccountIdentification;
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