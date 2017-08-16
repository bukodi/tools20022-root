package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.choice.AccountIdentification37Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecurityIdentification20;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation102;
import com.tools20022.repository.dict.msg.UpdatedAdditionalInformation10;
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
 * relevant elements in the business application header (BAH).
 */
public class CorporateActionNarrative002V04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<AccountIdentification37Choice> AccountDetails;
	private Optional<SecurityIdentification20> UnderlyingSecurity;
	private CorporateActionGeneralInformation102 CorporateActionGeneralInformation;
	private UpdatedAdditionalInformation10 AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<AccountIdentification37Choice> getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(
			Optional<AccountIdentification37Choice> AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<SecurityIdentification20> getUnderlyingSecurity() {
		return UnderlyingSecurity;
	}

	public void setUnderlyingSecurity(
			Optional<SecurityIdentification20> UnderlyingSecurity) {
		this.UnderlyingSecurity = UnderlyingSecurity;
	}

	public CorporateActionGeneralInformation102 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation102 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public UpdatedAdditionalInformation10 getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			UpdatedAdditionalInformation10 AdditionalInformation) {
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