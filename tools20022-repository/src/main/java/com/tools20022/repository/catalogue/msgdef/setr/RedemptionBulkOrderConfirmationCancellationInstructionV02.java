package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference8;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.InvestmentFundOrder11;
import com.tools20022.repository.dict.msg.CopyInformation4;

/**
 * Scope The RedemptionBulkOrderConfirmationCancellationInstruction message is
 * sent by an executing party, for example, a transfer agent, to the instructing
 * party, for example, an investment manager or its authorised representative,
 * to cancel a previously sent RedemptionBulkOrderConfirmation. Usage To request
 * the cancellation of one or more individual order executions, the order
 * reference and deal reference of each individual order execution in the
 * original RedemptionBulkOrderConfirmation are specified in the order reference
 * and deal reference elements respectively. The message identification of the
 * RedemptionBulkOrderConfirmation message in which the individual order
 * execution was conveyed may also be quoted in PreviousReference but this is
 * not recommended. The AmendmentIndicator is used to specify whether the
 * redemption order confirmation cancellation is to be followed by an amendment
 * An amendment of a redemption order confirmation is carried out by sending a
 * RedemptionBulkOrderConfirmation message in which the AmendmentIndicator
 * contains the value ‘true’.
 */
@PreviousVersion(RedemptionBulkOrderConfirmationCancellationInstructionV01.class)
public class RedemptionBulkOrderConfirmationCancellationInstructionV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference9> PoolReference;
	private Optional<AdditionalReference8> PreviousReference;
	private Optional<AdditionalReference8> RelatedReference;
	private YesNoIndicator AmendmentIndicator;
	private Optional<Max35Text> MasterReference;
	private InvestmentFundOrder11 OrderReferences;
	private Optional<CopyInformation4> CopyDetails;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<AdditionalReference9> getPoolReference() {
		return PoolReference;
	}

	public void setPoolReference(Optional<AdditionalReference9> PoolReference) {
		this.PoolReference = PoolReference;
	}

	public Optional<AdditionalReference8> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference8> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference8> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference8> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public YesNoIndicator getAmendmentIndicator() {
		return AmendmentIndicator;
	}

	public void setAmendmentIndicator(YesNoIndicator AmendmentIndicator) {
		this.AmendmentIndicator = AmendmentIndicator;
	}

	public Optional<Max35Text> getMasterReference() {
		return MasterReference;
	}

	public void setMasterReference(Optional<Max35Text> MasterReference) {
		this.MasterReference = MasterReference;
	}

	public InvestmentFundOrder11 getOrderReferences() {
		return OrderReferences;
	}

	public void setOrderReferences(InvestmentFundOrder11 OrderReferences) {
		this.OrderReferences = OrderReferences;
	}

	public Optional<CopyInformation4> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation4> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}
}