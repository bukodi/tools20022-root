package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.SwitchOrderConfirmationV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference8;
import com.tools20022.repository.dict.msg.SwitchExecution7;
import com.tools20022.repository.dict.msg.CopyInformation4;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The SwitchOrderConfirmation message is sent by an executing party, for
 * example, a transfer agent, to the instructing party, for example, an
 * investment manager or its authorised representative, to confirm the details
 * of the execution of a previously received SwitchOrder instruction. Usage The
 * SwitchOrderConfirmation message is used to confirm that all the legs of the
 * previously instructed switch order have been executed. The reference of the
 * switch order confirmation is identified in DealReference. The reference of
 * the original switch order is specified in OrderReference. The message
 * identification of the SwitchOrder message in which the switch order was
 * conveyed may also be quoted in RelatedReference but this is not recommended.
 * When the message is used to convey a confirmation amendment/s, the
 * AmendmentIndicator must be present with the value ‘true’ or ‘1’. When this is
 * the case, the message must only contain a confirmation amendment/s and not
 * contain both a confirmation amendment/s and a ‘new’ confirmation/s.
 */
@PreviousVersion(SwitchOrderConfirmationV03.class)
public class SwitchOrderConfirmationV04 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference9> PoolReference;
	private Optional<AdditionalReference8> PreviousReference;
	private Optional<AdditionalReference8> RelatedReference;
	private SwitchExecution7 SwitchExecutionDetails;
	private Optional<CopyInformation4> CopyDetails;
	private Optional<Extension1> Extension;

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

	public SwitchExecution7 getSwitchExecutionDetails() {
		return SwitchExecutionDetails;
	}

	public void setSwitchExecutionDetails(
			SwitchExecution7 SwitchExecutionDetails) {
		this.SwitchExecutionDetails = SwitchExecutionDetails;
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