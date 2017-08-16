package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionCancellationRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionCancellationRequestV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification15;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation26;
import com.tools20022.repository.dict.msg.AccountIdentification17;
import com.tools20022.repository.dict.msg.CorporateActionOption21;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account owner sends the
 * CorporateActionInstructionCancellationRequest message to an account servicer
 * to request cancellation of a previously sent corporate action election
 * instruction. Usage The message may also be used to: - re-send a message
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
@PreviousVersion(CorporateActionInstructionCancellationRequestV01.class)
@NextVersion(CorporateActionInstructionCancellationRequestV03.class)
public class CorporateActionInstructionCancellationRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<YesNoIndicator> ChangeInstructionIndicator;
	private DocumentIdentification15 InstructionIdentification;
	private CorporateActionGeneralInformation26 CorporateActionGeneralInformation;
	private AccountIdentification17 AccountDetails;
	private CorporateActionOption21 CorporateActionInstruction;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<YesNoIndicator> getChangeInstructionIndicator() {
		return ChangeInstructionIndicator;
	}

	public void setChangeInstructionIndicator(
			Optional<YesNoIndicator> ChangeInstructionIndicator) {
		this.ChangeInstructionIndicator = ChangeInstructionIndicator;
	}

	public DocumentIdentification15 getInstructionIdentification() {
		return InstructionIdentification;
	}

	public void setInstructionIdentification(
			DocumentIdentification15 InstructionIdentification) {
		this.InstructionIdentification = InstructionIdentification;
	}

	public CorporateActionGeneralInformation26 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation26 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification17 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountIdentification17 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public CorporateActionOption21 getCorporateActionInstruction() {
		return CorporateActionInstruction;
	}

	public void setCorporateActionInstruction(
			CorporateActionOption21 CorporateActionInstruction) {
		this.CorporateActionInstruction = CorporateActionInstruction;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}