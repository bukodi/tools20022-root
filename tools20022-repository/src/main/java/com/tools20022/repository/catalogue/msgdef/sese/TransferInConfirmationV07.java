package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInConfirmationV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference6;
import java.util.Optional;
import com.tools20022.repository.dict.codeset.TransferInFunction2Code;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Transfer33;
import com.tools20022.repository.dict.msg.InvestmentAccount56;
import com.tools20022.repository.dict.msg.DeliverInformation17;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.CopyInformation4;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An executing party, for example, a transfer agent, sends the
 * TransferInConfirmation message to the instructing party, for example, an
 * investment manager or its authorised representative, to confirm the receipt
 * of a financial instrument, free of payment, on a given date, from a specified
 * party. This message may also be used to confirm the receipt of a financial
 * instrument, free of payment, from another of the instructing parties own
 * accounts or from a third party. This message may also be used as an advice,
 * that is, the message is used to provide account information. Usage The
 * TransferInConfirmation message is used to confirm receipt of a financial
 * instrument, either from another account owned by the instructing party or
 * from a third party. The reference of the transfer confirmation is identified
 * in TransferConfirmationReference. The reference of the original transfer
 * instruction is specified in TransferReference. The message identification of
 * the TransferInInstruction message in which the transfer instruction was
 * conveyed may also be quoted in RelatedReference.
 */
@PreviousVersion(TransferInConfirmationV06.class)
public class TransferInConfirmationV07
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference6> PoolReference;
	private Optional<AdditionalReference6> PreviousReference;
	private Optional<AdditionalReference6> RelatedReference;
	private Optional<TransferInFunction2Code> Function;
	private Optional<Max35Text> MasterReference;
	private Transfer33 TransferDetails;
	private InvestmentAccount56 AccountDetails;
	private Optional<DeliverInformation17> SettlementDetails;
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

	public Optional<TransferInFunction2Code> getFunction() {
		return Function;
	}

	public void setFunction(Optional<TransferInFunction2Code> Function) {
		this.Function = Function;
	}

	public Optional<Max35Text> getMasterReference() {
		return MasterReference;
	}

	public void setMasterReference(Optional<Max35Text> MasterReference) {
		this.MasterReference = MasterReference;
	}

	public Transfer33 getTransferDetails() {
		return TransferDetails;
	}

	public void setTransferDetails(Transfer33 TransferDetails) {
		this.TransferDetails = TransferDetails;
	}

	public InvestmentAccount56 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(InvestmentAccount56 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<DeliverInformation17> getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(
			Optional<DeliverInformation17> SettlementDetails) {
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