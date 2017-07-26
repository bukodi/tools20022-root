package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountRequestRejectionV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.References6;
import com.tools20022.repository.dict.msg.OrganisationIdentification8;
import java.util.Optional;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.dict.msg.AccountForAction1;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The AccountRequestRejection message is sent from a financial institution to
 * an organisation. This message is sent in response to a request message from
 * the organisation, if the business content is not valid.
 */
@PreviousVersion(AccountRequestRejectionV01.class)
public class AccountRequestRejectionV02 {

	private References6 References;
	private Optional<OrganisationIdentification8> From;
	private BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification;
	private Optional<AccountForAction1> AccountIdentification;
	private OrganisationIdentification8 OrganisationIdentification;
	private Optional<PartyAndSignature2> DigitalSignature;
	private Optional<SupplementaryData1> SupplementaryData;

	public References6 getReferences() {
		return References;
	}

	public void setReferences(References6 References) {
		this.References = References;
	}

	public Optional<OrganisationIdentification8> getFrom() {
		return From;
	}

	public void setFrom(Optional<OrganisationIdentification8> From) {
		this.From = From;
	}

	public BranchAndFinancialInstitutionIdentification5 getAccountServicerIdentification() {
		return AccountServicerIdentification;
	}

	public void setAccountServicerIdentification(
			BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification) {
		this.AccountServicerIdentification = AccountServicerIdentification;
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