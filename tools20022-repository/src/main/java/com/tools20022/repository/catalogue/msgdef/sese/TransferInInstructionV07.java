package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.TransferInInstructionV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference6;
import java.util.Optional;
import com.tools20022.repository.dict.codeset.TransferInFunction1Code;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Transfer32;
import com.tools20022.repository.dict.msg.InvestmentAccount56;
import com.tools20022.repository.dict.msg.DeliverInformation16;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.CopyInformation4;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An instructing party, for example, an investment manager or its
 * authorised representative, sends the TransferInInstruction message to the
 * executing party, for example, a transfer agent, to instruct the receipt of a
 * financial instrument, free of payment, on a given date from a specified
 * party. This message may also be used to instruct the receipt of a financial
 * instrument, free of payment, from another of the instructing parties own
 * accounts or from a third party. This message may also be used as an advice
 * and request, that is, the message is used to inform the receiver to expect an
 * unsolicited transfer in confirmation and to request account information for
 * the transfer. Usage The TransferInInstruction message is used to instruct the
 * receipt of a financial instrument from another account, either owned by the
 * instructing party or by a third party.
 */
@PreviousVersion(TransferInInstructionV06.class)
public class TransferInInstructionV07 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference6> PoolReference;
	private Optional<AdditionalReference6> PreviousReference;
	private Optional<AdditionalReference6> RelatedReference;
	private Optional<TransferInFunction1Code> Function;
	private Optional<Max35Text> MasterReference;
	private Transfer32 TransferDetails;
	private InvestmentAccount56 AccountDetails;
	private Optional<DeliverInformation16> SettlementDetails;
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

	public Optional<TransferInFunction1Code> getFunction() {
		return Function;
	}

	public void setFunction(Optional<TransferInFunction1Code> Function) {
		this.Function = Function;
	}

	public Optional<Max35Text> getMasterReference() {
		return MasterReference;
	}

	public void setMasterReference(Optional<Max35Text> MasterReference) {
		this.MasterReference = MasterReference;
	}

	public Transfer32 getTransferDetails() {
		return TransferDetails;
	}

	public void setTransferDetails(Transfer32 TransferDetails) {
		this.TransferDetails = TransferDetails;
	}

	public InvestmentAccount56 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(InvestmentAccount56 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<DeliverInformation16> getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(
			Optional<DeliverInformation16> SettlementDetails) {
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