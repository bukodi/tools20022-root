package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionCancellationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification12;
import com.tools20022.repository.dict.msg.DocumentIdentification15;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation7;
import com.tools20022.repository.dict.msg.AccountIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionOption6;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope An account owner sends the
 * CorporateActionInstructionCancellationRequest message to an account servicer
 * to request cancellation of a previously sent corporate action election
 * instruction. Usage The message may also be used to: - re-send a message
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
@NextVersion(CorporateActionInstructionCancellationRequestV02.class)
public class CorporateActionInstructionCancellationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification12 Identification;
	private DocumentIdentification15 InstructionIdentification;
	private CorporateActionGeneralInformation7 CorporateActionGeneralInformation;
	private AccountIdentification8 AccountDetails;
	private CorporateActionOption6 CorporateActionInstruction;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<Extension2> Extension;

	public DocumentIdentification12 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification12 Identification) {
		this.Identification = Identification;
	}

	public DocumentIdentification15 getInstructionIdentification() {
		return InstructionIdentification;
	}

	public void setInstructionIdentification(
			DocumentIdentification15 InstructionIdentification) {
		this.InstructionIdentification = InstructionIdentification;
	}

	public CorporateActionGeneralInformation7 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation7 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification8 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountIdentification8 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public CorporateActionOption6 getCorporateActionInstruction() {
		return CorporateActionInstruction;
	}

	public void setCorporateActionInstruction(
			CorporateActionOption6 CorporateActionInstruction) {
		this.CorporateActionInstruction = CorporateActionInstruction;
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