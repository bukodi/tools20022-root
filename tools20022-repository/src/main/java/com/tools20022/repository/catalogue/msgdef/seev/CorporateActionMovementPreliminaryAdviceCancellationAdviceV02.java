package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.CorporateActionProcessingStatus1Choice;
import com.tools20022.repository.dict.msg.DocumentIdentification15;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation25;
import com.tools20022.repository.dict.choice.AccountIdentification13Choice;
import com.tools20022.repository.dict.choice.PartyIdentification46Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends the
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice message to an
 * account owner or its designated agent to cancel a previously announced
 * CorporateActionMovementPreliminaryAdvice. Usage The message may also be used
 * to: - re-send a message previously sent (the sub-function of the message is
 * Duplicate), - provide a third party with a copy of a message for information
 * (the sub-function of the message is Copy), - re-send to a third party a copy
 * of a message for information (the sub-function of the message is Copy
 * Duplicate), using the relevant elements in the business application header
 * (BAH). ISO 15022 - 20022 COEXISTENCE This ISO 20022 message is reversed
 * engineered from ISO 15022. Both standards will coexist for a certain number
 * of years. Until this coexistence period ends, the usage of certain data types
 * is restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.class)
@NextVersion(CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.class)
public class CorporateActionMovementPreliminaryAdviceCancellationAdviceV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CorporateActionProcessingStatus1Choice CancellationAdviceGeneralInformation;
	private DocumentIdentification15 MovementPreliminaryAdviceIdentification;
	private CorporateActionGeneralInformation25 CorporateActionGeneralInformation;
	private AccountIdentification13Choice AccountDetails;
	private Optional<PartyIdentification46Choice> IssuerAgent;
	private Optional<PartyIdentification46Choice> PayingAgent;
	private Optional<PartyIdentification46Choice> SubPayingAgent;
	private Optional<PartyIdentification46Choice> Registrar;
	private Optional<PartyIdentification46Choice> ResellingAgent;
	private Optional<PartyIdentification46Choice> PhysicalSecuritiesAgent;
	private Optional<PartyIdentification46Choice> DropAgent;
	private Optional<PartyIdentification46Choice> SolicitationAgent;
	private Optional<PartyIdentification46Choice> InformationAgent;
	private Optional<SupplementaryData1> SupplementaryData;

	public CorporateActionProcessingStatus1Choice getCancellationAdviceGeneralInformation() {
		return CancellationAdviceGeneralInformation;
	}

	public void setCancellationAdviceGeneralInformation(
			CorporateActionProcessingStatus1Choice CancellationAdviceGeneralInformation) {
		this.CancellationAdviceGeneralInformation = CancellationAdviceGeneralInformation;
	}

	public DocumentIdentification15 getMovementPreliminaryAdviceIdentification() {
		return MovementPreliminaryAdviceIdentification;
	}

	public void setMovementPreliminaryAdviceIdentification(
			DocumentIdentification15 MovementPreliminaryAdviceIdentification) {
		this.MovementPreliminaryAdviceIdentification = MovementPreliminaryAdviceIdentification;
	}

	public CorporateActionGeneralInformation25 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation25 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification13Choice getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountIdentification13Choice AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<PartyIdentification46Choice> getIssuerAgent() {
		return IssuerAgent;
	}

	public void setIssuerAgent(Optional<PartyIdentification46Choice> IssuerAgent) {
		this.IssuerAgent = IssuerAgent;
	}

	public Optional<PartyIdentification46Choice> getPayingAgent() {
		return PayingAgent;
	}

	public void setPayingAgent(Optional<PartyIdentification46Choice> PayingAgent) {
		this.PayingAgent = PayingAgent;
	}

	public Optional<PartyIdentification46Choice> getSubPayingAgent() {
		return SubPayingAgent;
	}

	public void setSubPayingAgent(
			Optional<PartyIdentification46Choice> SubPayingAgent) {
		this.SubPayingAgent = SubPayingAgent;
	}

	public Optional<PartyIdentification46Choice> getRegistrar() {
		return Registrar;
	}

	public void setRegistrar(Optional<PartyIdentification46Choice> Registrar) {
		this.Registrar = Registrar;
	}

	public Optional<PartyIdentification46Choice> getResellingAgent() {
		return ResellingAgent;
	}

	public void setResellingAgent(
			Optional<PartyIdentification46Choice> ResellingAgent) {
		this.ResellingAgent = ResellingAgent;
	}

	public Optional<PartyIdentification46Choice> getPhysicalSecuritiesAgent() {
		return PhysicalSecuritiesAgent;
	}

	public void setPhysicalSecuritiesAgent(
			Optional<PartyIdentification46Choice> PhysicalSecuritiesAgent) {
		this.PhysicalSecuritiesAgent = PhysicalSecuritiesAgent;
	}

	public Optional<PartyIdentification46Choice> getDropAgent() {
		return DropAgent;
	}

	public void setDropAgent(Optional<PartyIdentification46Choice> DropAgent) {
		this.DropAgent = DropAgent;
	}

	public Optional<PartyIdentification46Choice> getSolicitationAgent() {
		return SolicitationAgent;
	}

	public void setSolicitationAgent(
			Optional<PartyIdentification46Choice> SolicitationAgent) {
		this.SolicitationAgent = SolicitationAgent;
	}

	public Optional<PartyIdentification46Choice> getInformationAgent() {
		return InformationAgent;
	}

	public void setInformationAgent(
			Optional<PartyIdentification46Choice> InformationAgent) {
		this.InformationAgent = InformationAgent;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}