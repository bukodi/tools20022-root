package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.TransferOutConfirmationV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference6;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Transfer31;
import com.tools20022.repository.dict.msg.InvestmentAccount54;
import com.tools20022.repository.dict.msg.ReceiveInformation17;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.CopyInformation4;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An executing party, for example, a transfer agent, sends the
 * TransferOutConfirmation message to the instructing party, for example, an
 * investment manager or its authorised representative, to confirm the delivery
 * of a financial instrument, free of payment, on a given date, to a specified
 * party. This message may also be used to confirm the delivery of a financial
 * instrument, free of payment, to another of the instructing parties own
 * accounts or to a third party. Usage The TransferOutConfirmation message is
 * used to confirm the withdrawal of a financial instrument from the owner's
 * account and its delivery to another own account, or to a third party, has
 * taken place. The reference of the transfer confirmation is identified in
 * TransferConfirmationReference. The reference of the original transfer
 * instruction is specified in TransferReference. The message identification of
 * the TransferOutInstruction message in which the transfer instruction was
 * conveyed may also be quoted in RelatedReference.
 */
@PreviousVersion(TransferOutConfirmationV06.class)
public class TransferOutConfirmationV07 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference6> PoolReference;
	private Optional<AdditionalReference6> PreviousReference;
	private Optional<AdditionalReference6> RelatedReference;
	private Optional<Max35Text> MasterReference;
	private Transfer31 TransferDetails;
	private InvestmentAccount54 AccountDetails;
	private Optional<ReceiveInformation17> SettlementDetails;
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

	public Transfer31 getTransferDetails() {
		return TransferDetails;
	}

	public void setTransferDetails(Transfer31 TransferDetails) {
		this.TransferDetails = TransferDetails;
	}

	public InvestmentAccount54 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(InvestmentAccount54 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<ReceiveInformation17> getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(
			Optional<ReceiveInformation17> SettlementDetails) {
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