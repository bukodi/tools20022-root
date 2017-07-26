package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.TransferInConfirmationV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInConfirmationV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Transfer26;
import com.tools20022.repository.dict.msg.InvestmentAccount22;
import com.tools20022.repository.dict.msg.DeliverInformation11;
import com.tools20022.repository.dict.msg.CopyInformation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An executing party, for example, a transfer agent, sends the
 * TransferInConfirmation message to the instructing party, for example, an
 * investment manager or its authorised representative, to confirm the receipt
 * of a financial instrument, free of payment, on a given date, from a specified
 * party. This message may also be used to confirm the receipt of a financial
 * instrument, free of payment, from another of the instructing parties own
 * accounts or from a third party. Usage The TransferInConfirmation message is
 * used to confirm receipt of a financial instrument, either from another
 * account owned by the instructing party or from a third party. The reference
 * of the transfer confirmation is identified in TransferConfirmationReference.
 * The reference of the original transfer instruction is specified in
 * TransferReference. The message identification of the TransferInInstruction
 * message in which the transfer instruction was conveyed may also be quoted in
 * RelatedReference.
 */
@PreviousVersion(TransferInConfirmationV03.class)
@NextVersion(TransferInConfirmationV05.class)
public class TransferInConfirmationV04 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference2> PoolReference;
	private Optional<AdditionalReference2> PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Optional<Max35Text> MasterReference;
	private Transfer26 TransferDetails;
	private InvestmentAccount22 AccountDetails;
	private Optional<DeliverInformation11> SettlementDetails;
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

	public Transfer26 getTransferDetails() {
		return TransferDetails;
	}

	public void setTransferDetails(Transfer26 TransferDetails) {
		this.TransferDetails = TransferDetails;
	}

	public InvestmentAccount22 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(InvestmentAccount22 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<DeliverInformation11> getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(
			Optional<DeliverInformation11> SettlementDetails) {
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