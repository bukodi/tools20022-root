package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountReportV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.References5;
import com.tools20022.repository.dict.msg.OrganisationIdentification8;
import java.util.Optional;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.dict.msg.Organisation12;
import com.tools20022.repository.dict.msg.AccountReport15;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The AccountReport message is sent from a financial institution to an
 * organisation for reporting purposes. It can be sent unsolicited as part of
 * opening, maintenance, or closing process, or it can be sent as response to an
 * AccountReportRequest message.
 */
@PreviousVersion(AccountReportV01.class)
public class AccountReportV02 implements GeneratedRepoBean<MMMessageDefinition> {

	private References5 References;
	private Optional<OrganisationIdentification8> From;
	private BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification;
	private Organisation12 Organisation;
	private Optional<AccountReport15> Report;
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

	public BranchAndFinancialInstitutionIdentification5 getAccountServicerIdentification() {
		return AccountServicerIdentification;
	}

	public void setAccountServicerIdentification(
			BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification) {
		this.AccountServicerIdentification = AccountServicerIdentification;
	}

	public Organisation12 getOrganisation() {
		return Organisation;
	}

	public void setOrganisation(Organisation12 Organisation) {
		this.Organisation = Organisation;
	}

	public Optional<AccountReport15> getReport() {
		return Report;
	}

	public void setReport(Optional<AccountReport15> Report) {
		this.Report = Report;
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