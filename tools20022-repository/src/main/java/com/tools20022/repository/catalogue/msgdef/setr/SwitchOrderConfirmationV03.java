package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.SwitchOrderConfirmationV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.setr.SwitchOrderConfirmationV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SwitchExecution4;
import com.tools20022.repository.dict.msg.CopyInformation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An executing party, for example, a transfer agent, sends the
 * SwitchOrderConfirmation message to the instructing party, for example, an
 * investment manager or its authorised representative to confirm the details of
 * the execution of a previously received SwitchOrder instruction. Usage The
 * SwitchOrderConfirmation message is used to confirm that all the legs of the
 * previously instructed switch order have been executed. The reference of the
 * switch order confirmation is identified in DealReference. The reference of
 * the original switch order is specified in OrderReference. The message
 * identification of the SwitchOrder message in which the switch order was
 * conveyed may also be quoted in RelatedReference. If the
 * SwitchOrderConfirmation Details sequence is present more than once, then the
 * redemption leg details and subscription leg details sequences may only be
 * present once. If Switch Confirmation Order Details\Investment Account is
 * used, then the Investment Account Details sequences in Subscription Leg
 * Details and Redemption Leg Details are not allowed. If the
 * SwitchOrderConfirmation Details sequence is present more than once, then the
 * redemption leg details and subscription leg details sequences may only be
 * present once. If SwitchOrderConfirmationDetails\InvestmentAccount is used,
 * then the InvestmentAccountDetails sequences in SubscriptionLegDetails and
 * RedemptionLegDetails are not allowed. This functionality is to be used by
 * institutions that set up two accounts per investor, rather than one
 * investment account.
 */
@PreviousVersion(SwitchOrderConfirmationV02.class)
@NextVersion(SwitchOrderConfirmationV04.class)
public class SwitchOrderConfirmationV03 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private SwitchExecution4 SwitchExecutionDetails;
	private Optional<CopyInformation2> CopyDetails;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
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

	public Optional<AdditionalReference3> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference3> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public SwitchExecution4 getSwitchExecutionDetails() {
		return SwitchExecutionDetails;
	}

	public void setSwitchExecutionDetails(
			SwitchExecution4 SwitchExecutionDetails) {
		this.SwitchExecutionDetails = SwitchExecutionDetails;
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