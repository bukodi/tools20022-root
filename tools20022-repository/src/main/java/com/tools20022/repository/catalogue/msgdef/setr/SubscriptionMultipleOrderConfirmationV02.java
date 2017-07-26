package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.SubscriptionOrderConfirmationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SubscriptionMultipleExecution2;
import com.tools20022.repository.dict.msg.Intermediary4;
import java.util.List;
import com.tools20022.repository.dict.msg.CopyInformation1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The SubscriptionMultipleOrderConfirmation message is sent by an
 * executing party, eg, a transfer agent, to the instructing party, eg, an
 * investment manager or its authorised representative. There may be one or more
 * intermediary parties between the executing party and the instruction party.
 * The intermediary party is, for example, an intermediary or a concentrator.
 * This message is used to confirm the details of the execution of a
 * SubscriptionMultipleOrder message. Usage The
 * SubscriptionMultipleOrderConfirmation message is sent, after the price has
 * been determined, to confirm the execution of the individual orders. A
 * SubscriptionMultipleOrder may be responded to by more than one
 * SubscriptionMultipleOrderConfirmation message, as the valuation cycle of the
 * financial instruments in each individual order may be different. When the
 * executing party sends several confirmations, there is no specific indication
 * in the message that it is an incomplete confirmation. Reconciliation must be
 * based on the references. A SubscriptionMultipleOrder must in all cases be
 * responded to by a SubscriptionMultipleOrderConfirmation message/s and in no
 * circumstances by a SubscriptionBulkOrderConfirmation message/s. If the
 * executing party needs to confirm a SubscriptionBulkOrder message, then a
 * SubscriptionBulkOrderConfirmation message must be used.
 */
@NextVersion(SubscriptionOrderConfirmationV03.class)
public class SubscriptionMultipleOrderConfirmationV02 {

	private Optional<AdditionalReference3> MasterReference;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private AdditionalReference3 RelatedReference;
	private SubscriptionMultipleExecution2 MultipleExecutionDetails;
	private List<Intermediary4> IntermediaryDetails;
	private Optional<CopyInformation1> CopyDetails;
	private Optional<Extension1> Extension;

	public Optional<AdditionalReference3> getMasterReference() {
		return MasterReference;
	}

	public void setMasterReference(
			Optional<AdditionalReference3> MasterReference) {
		this.MasterReference = MasterReference;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return PoolReference;
	}

	public void setPoolReference(Optional<AdditionalReference3> PoolReference) {
		this.PoolReference = PoolReference;
	}

	public Optional<AdditionalReference3> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference3> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public AdditionalReference3 getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(AdditionalReference3 RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public SubscriptionMultipleExecution2 getMultipleExecutionDetails() {
		return MultipleExecutionDetails;
	}

	public void setMultipleExecutionDetails(
			SubscriptionMultipleExecution2 MultipleExecutionDetails) {
		this.MultipleExecutionDetails = MultipleExecutionDetails;
	}

	public List<Intermediary4> getIntermediaryDetails() {
		return IntermediaryDetails;
	}

	public void setIntermediaryDetails(List<Intermediary4> IntermediaryDetails) {
		this.IntermediaryDetails = IntermediaryDetails;
	}

	public Optional<CopyInformation1> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation1> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}