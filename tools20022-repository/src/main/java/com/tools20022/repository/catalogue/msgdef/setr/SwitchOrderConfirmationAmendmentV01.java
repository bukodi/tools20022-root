package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SwitchExecution4;
import com.tools20022.repository.dict.msg.CopyInformation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An executing party, for example, a transfer agent, sends the
 * SwitchOrderConfirmationAmendment message to the instructing party, for
 * example, an investment manager or its authorised representative to amend a
 * previously sent SwitchOrderConfirmation message. Usage The
 * SwitchOrderConfirmationAmendment message is used to amend a previously sent
 * switch order confirmation. Each order confirmation amendment specified is
 * identified in DealReference. The reference of the original order is specified
 * in OrderReference. The message identification of the SwitchOrder message in
 * which the switch order was conveyed may also be quoted in RelatedReference.
 * The message identification of the SwitchOrderConfirmation message in which
 * the original switch order confirmation was conveyed may also be quoted in
 * PreviousReference.
 */
public class SwitchOrderConfirmationAmendmentV01 {

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