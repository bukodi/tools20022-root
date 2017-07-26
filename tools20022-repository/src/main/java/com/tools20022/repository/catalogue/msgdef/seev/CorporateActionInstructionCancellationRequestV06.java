package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionCancellationRequestV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionCancellationRequestV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification31;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation90;
import com.tools20022.repository.dict.msg.AccountIdentification31;
import com.tools20022.repository.dict.msg.CorporateActionOption120;
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
 * relevant elements in the business application header (BAH).
 */
@PreviousVersion(CorporateActionInstructionCancellationRequestV05.class)
@NextVersion(CorporateActionInstructionCancellationRequestV07.class)
public class CorporateActionInstructionCancellationRequestV06 {

	private Optional<YesNoIndicator> ChangeInstructionIndicator;
	private DocumentIdentification31 InstructionIdentification;
	private CorporateActionGeneralInformation90 CorporateActionGeneralInformation;
	private AccountIdentification31 AccountDetails;
	private CorporateActionOption120 CorporateActionInstruction;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<YesNoIndicator> getChangeInstructionIndicator() {
		return ChangeInstructionIndicator;
	}

	public void setChangeInstructionIndicator(
			Optional<YesNoIndicator> ChangeInstructionIndicator) {
		this.ChangeInstructionIndicator = ChangeInstructionIndicator;
	}

	public DocumentIdentification31 getInstructionIdentification() {
		return InstructionIdentification;
	}

	public void setInstructionIdentification(
			DocumentIdentification31 InstructionIdentification) {
		this.InstructionIdentification = InstructionIdentification;
	}

	public CorporateActionGeneralInformation90 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation90 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification31 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountIdentification31 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public CorporateActionOption120 getCorporateActionInstruction() {
		return CorporateActionInstruction;
	}

	public void setCorporateActionInstruction(
			CorporateActionOption120 CorporateActionInstruction) {
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