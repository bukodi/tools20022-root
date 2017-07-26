package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.TransferInConfirmation;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInConfirmationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Transfer7;
import com.tools20022.repository.dict.msg.FinancialInstrument13;
import com.tools20022.repository.dict.msg.InvestmentAccount22;
import com.tools20022.repository.dict.msg.DeliverInformation4;
import com.tools20022.repository.dict.msg.CopyInformation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An executing party, eg, a transfer agent, sends the
 * TransferInConfirmation message to the instructing party, eg, an investment
 * manager or its authorised representative, to confirm the receipt of a
 * financial instrument, free of payment, on a given date, from a specified
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
@PreviousVersion(TransferInConfirmation.class)
@NextVersion(TransferInConfirmationV03.class)
public class TransferInConfirmationV02 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference2> RelatedReference;
	private Optional<AdditionalReference2> PoolReference;
	private Optional<AdditionalReference2> PreviousReference;
	private Transfer7 TransferDetails;
	private FinancialInstrument13 FinancialInstrumentDetails;
	private InvestmentAccount22 AccountDetails;
	private DeliverInformation4 SettlementDetails;
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

	public Transfer7 getTransferDetails() {
		return TransferDetails;
	}

	public void setTransferDetails(Transfer7 TransferDetails) {
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

	public DeliverInformation4 getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(DeliverInformation4 SettlementDetails) {
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