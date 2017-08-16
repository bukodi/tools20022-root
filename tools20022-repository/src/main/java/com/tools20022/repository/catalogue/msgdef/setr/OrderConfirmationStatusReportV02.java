package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.OrderConfirmationStatusReportV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.choice.References61Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.IndividualOrderConfirmationStatusAndReason2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The OrderConfirmationStatusReport message is sent by an instructing
 * party, for example, an investment manager or its authorised representative,
 * to the executing party, for example, a transfer agent, to report the status
 * of an order confirmation or an order confirmation amendment. Usage The
 * OrderConfirmationStatusReport message is used to report on the status of one
 * or more individual: - subscription confirmations, - subscription confirmation
 * amendments, - redemption confirmations, - redemption confirmation amendments,
 * - switch order confirmations, - switch order confirmation amendments. One of
 * the following statuses can be reported: - confirmation rejected, or, -
 * amendment rejected, or, - sent to next party, or, - communication problem
 * with next party, or, - confirmation accepted, or, - confirmation received. It
 * is likely that the OrderConfirmationStatusReport is only sent by the order
 * instructing party to the order executing party to reject an order
 * confirmation or to reject an order confirmation amendment, although if an
 * intermediary party is used, the statuses sent to next party and communication
 * problem with next party are also likely be used. The statuses confirmation
 * accepted and confirmation received would only be used in the event the order
 * executing party sends a RequestForOrderConfirmationStatusReport message and
 * one of the other statuses does not apply. If the status being reported is
 * either confirmation rejected or amendment rejected, then a reason for the
 * rejection must be given. The individual order confirmation or confirmation
 * amendment for which the status is given is identified with its order
 * reference. The message identification of the message in which the individual
 * order confirmation or confirmation amendment was conveyed may also be quoted
 * in RelatedReference, but this is not recommended.
 */
@PreviousVersion(OrderConfirmationStatusReportV01.class)
public class OrderConfirmationStatusReportV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<References61Choice> Reference;
	private IndividualOrderConfirmationStatusAndReason2 IndividualOrderConfirmationDetailsReport;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<References61Choice> getReference() {
		return Reference;
	}

	public void setReference(Optional<References61Choice> Reference) {
		this.Reference = Reference;
	}

	public IndividualOrderConfirmationStatusAndReason2 getIndividualOrderConfirmationDetailsReport() {
		return IndividualOrderConfirmationDetailsReport;
	}

	public void setIndividualOrderConfirmationDetailsReport(
			IndividualOrderConfirmationStatusAndReason2 IndividualOrderConfirmationDetailsReport) {
		this.IndividualOrderConfirmationDetailsReport = IndividualOrderConfirmationDetailsReport;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}