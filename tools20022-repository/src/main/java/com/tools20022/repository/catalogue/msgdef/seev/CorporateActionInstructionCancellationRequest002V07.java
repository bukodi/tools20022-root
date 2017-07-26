package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.dict.datatype.YesNoIndicator;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification37;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation121;
import com.tools20022.repository.dict.msg.AccountIdentification42;
import com.tools20022.repository.dict.msg.CorporateActionOption128;
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
public class CorporateActionInstructionCancellationRequest002V07 {

	private Optional<YesNoIndicator> ChangeInstructionIndicator;
	private DocumentIdentification37 InstructionIdentification;
	private CorporateActionGeneralInformation121 CorporateActionGeneralInformation;
	private AccountIdentification42 AccountDetails;
	private CorporateActionOption128 CorporateActionInstruction;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<YesNoIndicator> getChangeInstructionIndicator() {
		return ChangeInstructionIndicator;
	}

	public void setChangeInstructionIndicator(
			Optional<YesNoIndicator> ChangeInstructionIndicator) {
		this.ChangeInstructionIndicator = ChangeInstructionIndicator;
	}

	public DocumentIdentification37 getInstructionIdentification() {
		return InstructionIdentification;
	}

	public void setInstructionIdentification(
			DocumentIdentification37 InstructionIdentification) {
		this.InstructionIdentification = InstructionIdentification;
	}

	public CorporateActionGeneralInformation121 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation121 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification42 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountIdentification42 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public CorporateActionOption128 getCorporateActionInstruction() {
		return CorporateActionInstruction;
	}

	public void setCorporateActionInstruction(
			CorporateActionOption128 CorporateActionInstruction) {
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