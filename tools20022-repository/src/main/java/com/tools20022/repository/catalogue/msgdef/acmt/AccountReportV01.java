package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountReportV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.References5;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.dict.msg.Organisation6;
import com.tools20022.repository.dict.msg.AccountReport1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyAndSignature1;

/**
 * Scope The AccountReport message is sent from a financial institution to an
 * organisation for reporting purposes. Usage It can be sent unsolicited as part
 * of opening, maintenance, or closing process, or it can be sent as response to
 * an AccountReportRequest message.
 */
@NextVersion(AccountReportV02.class)
public class AccountReportV01 implements GeneratedRepoBean<MMMessageDefinition> {

	private References5 References;
	private BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification;
	private Organisation6 Organisation;
	private Optional<AccountReport1> Report;
	private Optional<PartyAndSignature1> DigitalSignature;

	public References5 getReferences() {
		return References;
	}

	public void setReferences(References5 References) {
		this.References = References;
	}

	public BranchAndFinancialInstitutionIdentification4 getAccountServicerIdentification() {
		return AccountServicerIdentification;
	}

	public void setAccountServicerIdentification(
			BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification) {
		this.AccountServicerIdentification = AccountServicerIdentification;
	}

	public Organisation6 getOrganisation() {
		return Organisation;
	}

	public void setOrganisation(Organisation6 Organisation) {
		this.Organisation = Organisation;
	}

	public Optional<AccountReport1> getReport() {
		return Report;
	}

	public void setReport(Optional<AccountReport1> Report) {
		this.Report = Report;
	}

	public Optional<PartyAndSignature1> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature1> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}