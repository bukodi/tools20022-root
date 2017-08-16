package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionNarrativeV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionNarrativeV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.AccountIdentification14Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecurityIdentification14;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation40;
import com.tools20022.repository.dict.msg.UpdatedAdditionalInformation2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The CorporateActionNarrative message is sent between an account
 * servicer and an account owner or its designated agent to cater for tax
 * reclaims, restrictions, documentation requirements. This message is
 * bi-directional. Usage The message may also be used to: - re-send a message
 * previously sent (the sub-function of the message is Duplicate), - provide a
 * third party with a copy of a message for information (the sub-function of the
 * message is Copy), - re-send to a third party a copy of a message for
 * information (the sub-function of the message is Copy Duplicate), using the
 * relevant elements in the business application header (BAH). ISO 15022 - 20022
 * COEXISTENCE This ISO 20022 message is reversed engineered from ISO 15022.
 * Both standards will coexist for a certain number of years. Until this
 * coexistence period ends, the usage of certain data types is restricted to
 * ensure interoperability between ISO 15022 and 20022 users. Compliance to
 * these rules is mandatory in a coexistence environment. The coexistence
 * restrictions are described in a Textual Rule linked to the Message Items they
 * concern. These coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 */
@PreviousVersion(CorporateActionNarrativeV02.class)
@NextVersion(CorporateActionNarrativeV04.class)
public class CorporateActionNarrativeV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<AccountIdentification14Choice> AccountDetails;
	private Optional<SecurityIdentification14> UnderlyingSecurity;
	private CorporateActionGeneralInformation40 CorporateActionGeneralInformation;
	private UpdatedAdditionalInformation2 AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<AccountIdentification14Choice> getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(
			Optional<AccountIdentification14Choice> AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<SecurityIdentification14> getUnderlyingSecurity() {
		return UnderlyingSecurity;
	}

	public void setUnderlyingSecurity(
			Optional<SecurityIdentification14> UnderlyingSecurity) {
		this.UnderlyingSecurity = UnderlyingSecurity;
	}

	public CorporateActionGeneralInformation40 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation40 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public UpdatedAdditionalInformation2 getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			UpdatedAdditionalInformation2 AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}