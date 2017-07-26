package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.TransferOutInstructionV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.TransferOutInstructionV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.choice.DateFormat1Choice;
import com.tools20022.repository.dict.msg.Transfer11;
import com.tools20022.repository.dict.msg.InvestmentAccount22;
import com.tools20022.repository.dict.msg.ReceiveInformation5;
import com.tools20022.repository.dict.msg.CopyInformation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An instructing party, for example, an investment manager or its
 * authorised representative, sends the TransferOutInstruction message to the
 * executing party, for example, a transfer agent, to instruct the delivery of a
 * financial instrument, free of payment, on a given date from a specified
 * party. This message may also be used to instruct the delivery of a financial
 * instrument, free of payment, to another of the instructing parties own
 * accounts or to a third party. Usage The TransferOutInstruction message is
 * used to instruct the withdrawal of a financial instrument from one account
 * and deliver it to either another account or to a third party.
 */
@PreviousVersion(TransferOutInstructionV02.class)
@NextVersion(TransferOutInstructionV04.class)
public class TransferOutInstructionV03 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference2> PoolReference;
	private Optional<AdditionalReference2> PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Optional<Max35Text> MasterReference;
	private Optional<DateFormat1Choice> RequestedTransferDate;
	private Transfer11 TransferDetails;
	private InvestmentAccount22 AccountDetails;
	private ReceiveInformation5 SettlementDetails;
	private Optional<CopyInformation2> CopyDetails;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<AdditionalReference2> getPoolReference() {
		return PoolReference;
	}

	public void setPoolReference(Optional<AdditionalReference2> PoolReference) {
		this.PoolReference = PoolReference;
	}

	public Optional<AdditionalReference2> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference2> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference2> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference2> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public Optional<Max35Text> getMasterReference() {
		return MasterReference;
	}

	public void setMasterReference(Optional<Max35Text> MasterReference) {
		this.MasterReference = MasterReference;
	}

	public Optional<DateFormat1Choice> getRequestedTransferDate() {
		return RequestedTransferDate;
	}

	public void setRequestedTransferDate(
			Optional<DateFormat1Choice> RequestedTransferDate) {
		this.RequestedTransferDate = RequestedTransferDate;
	}

	public Transfer11 getTransferDetails() {
		return TransferDetails;
	}

	public void setTransferDetails(Transfer11 TransferDetails) {
		this.TransferDetails = TransferDetails;
	}

	public InvestmentAccount22 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(InvestmentAccount22 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public ReceiveInformation5 getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(ReceiveInformation5 SettlementDetails) {
		this.SettlementDetails = SettlementDetails;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation2> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}