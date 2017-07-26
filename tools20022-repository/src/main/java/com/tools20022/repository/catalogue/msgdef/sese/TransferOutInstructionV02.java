package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.TransferOutInstruction;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.TransferOutInstructionV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Transfer8;
import com.tools20022.repository.dict.msg.FinancialInstrument13;
import com.tools20022.repository.dict.msg.InvestmentAccount22;
import com.tools20022.repository.dict.msg.ReceiveInformation3;
import com.tools20022.repository.dict.msg.CopyInformation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An instructing party, eg, an investment manager or its authorised
 * representative, sends the TransferOutInstruction message to the executing
 * party, eg, a transfer agent, to instruct the delivery of a financial
 * instrument, free of payment, on a given date from a specified party. This
 * message may also be used to instruct the delivery of a financial instrument,
 * free of payment, to another of the instructing parties own accounts or to a
 * third party. Usage The TransferOutInstruction message is used to instruct the
 * withdrawal of a financial instrument from one account and deliver it to
 * either another account or to a third party.
 */
@PreviousVersion(TransferOutInstruction.class)
@NextVersion(TransferOutInstructionV03.class)
public class TransferOutInstructionV02 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference2> PoolReference;
	private Optional<AdditionalReference2> PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Transfer8 TransferDetails;
	private FinancialInstrument13 FinancialInstrumentDetails;
	private InvestmentAccount22 AccountDetails;
	private ReceiveInformation3 SettlementDetails;
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

	public Transfer8 getTransferDetails() {
		return TransferDetails;
	}

	public void setTransferDetails(Transfer8 TransferDetails) {
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

	public ReceiveInformation3 getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(ReceiveInformation3 SettlementDetails) {
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