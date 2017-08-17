package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.TransferOutInstructionV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference6;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.choice.DateFormat1Choice;
import com.tools20022.repository.dict.msg.Transfer30;
import com.tools20022.repository.dict.msg.InvestmentAccount54;
import com.tools20022.repository.dict.msg.ReceiveInformation16;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.CopyInformation4;
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
@PreviousVersion(TransferOutInstructionV06.class)
public class TransferOutInstructionV07
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference6> PoolReference;
	private Optional<AdditionalReference6> PreviousReference;
	private Optional<AdditionalReference6> RelatedReference;
	private Optional<Max35Text> MasterReference;
	private Optional<DateFormat1Choice> RequestedTransferDate;
	private Transfer30 TransferDetails;
	private InvestmentAccount54 AccountDetails;
	private Optional<ReceiveInformation16> SettlementDetails;
	private Optional<MarketPracticeVersion1> MarketPracticeVersion;
	private Optional<CopyInformation4> CopyDetails;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<AdditionalReference6> getPoolReference() {
		return PoolReference;
	}

	public void setPoolReference(Optional<AdditionalReference6> PoolReference) {
		this.PoolReference = PoolReference;
	}

	public Optional<AdditionalReference6> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference6> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference6> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference6> RelatedReference) {
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

	public Transfer30 getTransferDetails() {
		return TransferDetails;
	}

	public void setTransferDetails(Transfer30 TransferDetails) {
		this.TransferDetails = TransferDetails;
	}

	public InvestmentAccount54 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(InvestmentAccount54 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<ReceiveInformation16> getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(
			Optional<ReceiveInformation16> SettlementDetails) {
		this.SettlementDetails = SettlementDetails;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return MarketPracticeVersion;
	}

	public void setMarketPracticeVersion(
			Optional<MarketPracticeVersion1> MarketPracticeVersion) {
		this.MarketPracticeVersion = MarketPracticeVersion;
	}

	public Optional<CopyInformation4> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation4> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}