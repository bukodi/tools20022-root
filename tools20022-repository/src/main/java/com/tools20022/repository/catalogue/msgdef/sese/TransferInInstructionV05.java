package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInInstructionV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInInstructionV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Transfer21;
import com.tools20022.repository.dict.msg.InvestmentAccount40;
import com.tools20022.repository.dict.msg.DeliverInformation13;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.CopyInformation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An instructing party, for example, an investment manager or its
 * authorised representative, sends the TransferInInstruction message to the
 * executing party, for example, a transfer agent, to instruct the receipt of a
 * financial instrument, free of payment, on a given date from a specified
 * party. This message may also be used to instruct the receipt of a financial
 * instrument, free of payment, from another of the instructing parties own
 * accounts or from a third party. Usage The TransferInInstruction message is
 * used to instruct the receipt of a financial instrument from another account,
 * either owned by the instructing party or by a third party.
 */
@PreviousVersion(TransferInInstructionV04.class)
@NextVersion(TransferInInstructionV06.class)
public class TransferInInstructionV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference2> PoolReference;
	private Optional<AdditionalReference2> PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Optional<Max35Text> MasterReference;
	private Transfer21 TransferDetails;
	private InvestmentAccount40 AccountDetails;
	private Optional<DeliverInformation13> SettlementDetails;
	private Optional<MarketPracticeVersion1> MarketPracticeVersion;
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

	public Transfer21 getTransferDetails() {
		return TransferDetails;
	}

	public void setTransferDetails(Transfer21 TransferDetails) {
		this.TransferDetails = TransferDetails;
	}

	public InvestmentAccount40 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(InvestmentAccount40 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<DeliverInformation13> getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(
			Optional<DeliverInformation13> SettlementDetails) {
		this.SettlementDetails = SettlementDetails;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return MarketPracticeVersion;
	}

	public void setMarketPracticeVersion(
			Optional<MarketPracticeVersion1> MarketPracticeVersion) {
		this.MarketPracticeVersion = MarketPracticeVersion;
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