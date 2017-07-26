package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.TransferOutConfirmation;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.TransferOutConfirmationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Transfer10;
import com.tools20022.repository.dict.msg.FinancialInstrument13;
import com.tools20022.repository.dict.msg.InvestmentAccount22;
import com.tools20022.repository.dict.msg.ReceiveInformation4;
import com.tools20022.repository.dict.msg.CopyInformation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An executing party, eg, a transfer agent, sends the
 * TransferOutConfirmation message to the instructing party, eg, an investment
 * manager or its authorised representative, to confirm the delivery of a
 * financial instrument, free of payment, on a given date, to a specified party.
 * This message may also be used to confirm the delivery of a financial
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
@PreviousVersion(TransferOutConfirmation.class)
@NextVersion(TransferOutConfirmationV03.class)
public class TransferOutConfirmationV02 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference2> RelatedReference;
	private Optional<AdditionalReference2> PoolReference;
	private Optional<AdditionalReference2> PreviousReference;
	private Transfer10 TransferDetails;
	private FinancialInstrument13 FinancialInstrumentDetails;
	private InvestmentAccount22 AccountDetails;
	private ReceiveInformation4 SettlementDetails;
	private Optional<CopyInformation2> CopyDetails;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<AdditionalReference2> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference2> RelatedReference) {
		this.RelatedReference = RelatedReference;
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

	public Transfer10 getTransferDetails() {
		return TransferDetails;
	}

	public void setTransferDetails(Transfer10 TransferDetails) {
		this.TransferDetails = TransferDetails;
	}

	public FinancialInstrument13 getFinancialInstrumentDetails() {
		return FinancialInstrumentDetails;
	}

	public void setFinancialInstrumentDetails(
			FinancialInstrument13 FinancialInstrumentDetails) {
		this.FinancialInstrumentDetails = FinancialInstrumentDetails;
	}

	public InvestmentAccount22 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(InvestmentAccount22 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public ReceiveInformation4 getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(ReceiveInformation4 SettlementDetails) {
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