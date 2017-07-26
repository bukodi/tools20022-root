package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionNarrativeV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.choice.AccountIdentification9Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.UnderlyingSecurity1;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation10;
import com.tools20022.repository.dict.msg.UpdatedAdditionalInformation2;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope The CorporateActionNarrative message is sent between an account
 * servicer and an account owner or its designated agent to cater for tax
 * reclaims, restrictions, documentation requirements. This message is
 * bi-directional. Usage The message may also be used to: - re-send a message
 * previously sent (the sub-function of the message is Duplicate), - provide a
 * third party with a copy of a message for information (the sub-function of the
 * message is Copy), - re-send to a third party a copy of a message for
 * information (the sub-function of the message is Copy Duplicate). ISO 15022 -
 * 20022 COEXISTENCE This ISO 20022 message is reversed engineered from ISO
 * 15022. Both standards will coexist for a certain number of years. Until this
 * coexistence period ends, the usage of certain data types is restricted to
 * ensure interoperability between ISO 15022 and 20022 users. Compliance to
 * these rules is mandatory in a coexistence environment. The coexistence
 * restrictions are described in a Textual Rule linked to the Message Items they
 * concern. These coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 */
@NextVersion(CorporateActionNarrativeV02.class)
public class CorporateActionNarrativeV01 {

	private DocumentIdentification11 Identification;
	private Optional<AccountIdentification9Choice> AccountDetails;
	private Optional<UnderlyingSecurity1> UnderlyingSecurity;
	private CorporateActionGeneralInformation10 CorporateActionGeneralInformation;
	private UpdatedAdditionalInformation2 AdditionalInformation;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<Extension2> Extension;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public Optional<AccountIdentification9Choice> getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(
			Optional<AccountIdentification9Choice> AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<UnderlyingSecurity1> getUnderlyingSecurity() {
		return UnderlyingSecurity;
	}

	public void setUnderlyingSecurity(
			Optional<UnderlyingSecurity1> UnderlyingSecurity) {
		this.UnderlyingSecurity = UnderlyingSecurity;
	}

	public CorporateActionGeneralInformation10 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation10 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public UpdatedAdditionalInformation2 getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			UpdatedAdditionalInformation2 AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}

	public Optional<PartyIdentification10Choice> getMessageOriginator() {
		return MessageOriginator;
	}

	public void setMessageOriginator(
			Optional<PartyIdentification10Choice> MessageOriginator) {
		this.MessageOriginator = MessageOriginator;
	}

	public Optional<PartyIdentification10Choice> getMessageRecipient() {
		return MessageRecipient;
	}

	public void setMessageRecipient(
			Optional<PartyIdentification10Choice> MessageRecipient) {
		this.MessageRecipient = MessageRecipient;
	}

	public Optional<Extension2> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension2> Extension) {
		this.Extension = Extension;
	}
}