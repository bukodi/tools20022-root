package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionNarrativeV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.AccountIdentification33Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecurityIdentification19;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation92;
import com.tools20022.repository.dict.msg.UpdatedAdditionalInformation8;
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
@PreviousVersion(CorporateActionNarrativeV03.class)
public class CorporateActionNarrativeV04 {

	private Optional<AccountIdentification33Choice> AccountDetails;
	private Optional<SecurityIdentification19> UnderlyingSecurity;
	private CorporateActionGeneralInformation92 CorporateActionGeneralInformation;
	private UpdatedAdditionalInformation8 AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<AccountIdentification33Choice> getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(
			Optional<AccountIdentification33Choice> AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<SecurityIdentification19> getUnderlyingSecurity() {
		return UnderlyingSecurity;
	}

	public void setUnderlyingSecurity(
			Optional<SecurityIdentification19> UnderlyingSecurity) {
		this.UnderlyingSecurity = UnderlyingSecurity;
	}

	public CorporateActionGeneralInformation92 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation92 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public UpdatedAdditionalInformation8 getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			UpdatedAdditionalInformation8 AdditionalInformation) {
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