package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionCancellationAdviceV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.CorporateActionCancellation1;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation8;
import com.tools20022.repository.dict.choice.AccountIdentification6Choice;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope An account servicer sends the CorporateActionCancellationAdvice message
 * to an account owner or its designated agent to cancel a previously announced
 * corporate action event in case of error from the account servicer or in case
 * of withdrawal by the issuer. Usage The message may also be used to: - re-send
 * a message previously sent (the sub-function of the message is Duplicate), -
 * provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy), - re-send to a third party a copy of a
 * message for information (the sub-function of the message is Copy Duplicate).
 * ISO 15022 - 20022 COEXISTENCE This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@NextVersion(CorporateActionCancellationAdviceV02.class)
public class CorporateActionCancellationAdviceV01 {

	private DocumentIdentification11 Identification;
	private CorporateActionCancellation1 CancellationAdviceGeneralInformation;
	private CorporateActionGeneralInformation8 CorporateActionGeneralInformation;
	private AccountIdentification6Choice AccountsDetails;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<PartyIdentification10Choice> IssuerAgent;
	private Optional<PartyIdentification10Choice> PayingAgent;
	private Optional<PartyIdentification10Choice> SubPayingAgent;
	private Optional<PartyIdentification10Choice> Registrar;
	private Optional<PartyIdentification10Choice> ResellingAgent;
	private Optional<PartyIdentification10Choice> PhysicalSecuritiesAgent;
	private Optional<PartyIdentification10Choice> DropAgent;
	private Optional<PartyIdentification10Choice> SolicitationAgent;
	private Optional<PartyIdentification10Choice> InformationAgent;
	private Optional<Extension2> Extension;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public CorporateActionCancellation1 getCancellationAdviceGeneralInformation() {
		return CancellationAdviceGeneralInformation;
	}

	public void setCancellationAdviceGeneralInformation(
			CorporateActionCancellation1 CancellationAdviceGeneralInformation) {
		this.CancellationAdviceGeneralInformation = CancellationAdviceGeneralInformation;
	}

	public CorporateActionGeneralInformation8 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation8 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification6Choice getAccountsDetails() {
		return AccountsDetails;
	}

	public void setAccountsDetails(AccountIdentification6Choice AccountsDetails) {
		this.AccountsDetails = AccountsDetails;
	}

	public Optional<PartyIdentification10Choice> getMessageOriginator() {
		return MessageOriginator;
	}

	public void setMessageOriginator(
			Optional<PartyIdentification10Choice> MessageOriginator) {
		this.MessageOriginator = MessageOriginator;
	}

	public Optional<PartyIdentification10Choice> getMessageRecipient() {
		return MessageRecipient;
	}

	public void setMessageRecipient(
			Optional<PartyIdentification10Choice> MessageRecipient) {
		this.MessageRecipient = MessageRecipient;
	}

	public Optional<PartyIdentification10Choice> getIssuerAgent() {
		return IssuerAgent;
	}

	public void setIssuerAgent(Optional<PartyIdentification10Choice> IssuerAgent) {
		this.IssuerAgent = IssuerAgent;
	}

	public Optional<PartyIdentification10Choice> getPayingAgent() {
		return PayingAgent;
	}

	public void setPayingAgent(Optional<PartyIdentification10Choice> PayingAgent) {
		this.PayingAgent = PayingAgent;
	}

	public Optional<PartyIdentification10Choice> getSubPayingAgent() {
		return SubPayingAgent;
	}

	public void setSubPayingAgent(
			Optional<PartyIdentification10Choice> SubPayingAgent) {
		this.SubPayingAgent = SubPayingAgent;
	}

	public Optional<PartyIdentification10Choice> getRegistrar() {
		return Registrar;
	}

	public void setRegistrar(Optional<PartyIdentification10Choice> Registrar) {
		this.Registrar = Registrar;
	}

	public Optional<PartyIdentification10Choice> getResellingAgent() {
		return ResellingAgent;
	}

	public void setResellingAgent(
			Optional<PartyIdentification10Choice> ResellingAgent) {
		this.ResellingAgent = ResellingAgent;
	}

	public Optional<PartyIdentification10Choice> getPhysicalSecuritiesAgent() {
		return PhysicalSecuritiesAgent;
	}

	public void setPhysicalSecuritiesAgent(
			Optional<PartyIdentification10Choice> PhysicalSecuritiesAgent) {
		this.PhysicalSecuritiesAgent = PhysicalSecuritiesAgent;
	}

	public Optional<PartyIdentification10Choice> getDropAgent() {
		return DropAgent;
	}

	public void setDropAgent(Optional<PartyIdentification10Choice> DropAgent) {
		this.DropAgent = DropAgent;
	}

	public Optional<PartyIdentification10Choice> getSolicitationAgent() {
		return SolicitationAgent;
	}

	public void setSolicitationAgent(
			Optional<PartyIdentification10Choice> SolicitationAgent) {
		this.SolicitationAgent = SolicitationAgent;
	}

	public Optional<PartyIdentification10Choice> getInformationAgent() {
		return InformationAgent;
	}

	public void setInformationAgent(
			Optional<PartyIdentification10Choice> InformationAgent) {
		this.InformationAgent = InformationAgent;
	}

	public Optional<Extension2> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension2> Extension) {
		this.Extension = Extension;
	}
}