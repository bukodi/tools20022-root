package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.CorporateActionCancellation4;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation120;
import com.tools20022.repository.dict.choice.AccountIdentification34Choice;
import com.tools20022.repository.dict.msg.CorporateAction35;
import java.util.Optional;
import com.tools20022.repository.dict.choice.PartyIdentification104Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends the CorporateActionCancellationAdvice message
 * to an account owner or its designated agent to cancel a previously announced
 * corporate action event in case of error from the account servicer or in case
 * of withdrawal by the issuer. Usage The message may also be used to: - re-send
 * a message previously sent (the sub-function of the message is Duplicate), -
 * provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy), - re-send to a third party a copy of a
 * message for information (the sub-function of the message is Copy Duplicate),
 * using the relevant elements in the business application header (BAH).
 */
public class CorporateActionCancellationAdvice002V07
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CorporateActionCancellation4 CancellationAdviceGeneralInformation;
	private CorporateActionGeneralInformation120 CorporateActionGeneralInformation;
	private AccountIdentification34Choice AccountsDetails;
	private Optional<CorporateAction35> CorporateActionDetails;
	private Optional<PartyIdentification104Choice> IssuerAgent;
	private Optional<PartyIdentification104Choice> PayingAgent;
	private Optional<PartyIdentification104Choice> SubPayingAgent;
	private Optional<PartyIdentification104Choice> Registrar;
	private Optional<PartyIdentification104Choice> ResellingAgent;
	private Optional<PartyIdentification104Choice> PhysicalSecuritiesAgent;
	private Optional<PartyIdentification104Choice> DropAgent;
	private Optional<PartyIdentification104Choice> SolicitationAgent;
	private Optional<PartyIdentification104Choice> InformationAgent;
	private Optional<SupplementaryData1> SupplementaryData;

	public CorporateActionCancellation4 getCancellationAdviceGeneralInformation() {
		return CancellationAdviceGeneralInformation;
	}

	public void setCancellationAdviceGeneralInformation(
			CorporateActionCancellation4 CancellationAdviceGeneralInformation) {
		this.CancellationAdviceGeneralInformation = CancellationAdviceGeneralInformation;
	}

	public CorporateActionGeneralInformation120 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation120 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification34Choice getAccountsDetails() {
		return AccountsDetails;
	}

	public void setAccountsDetails(AccountIdentification34Choice AccountsDetails) {
		this.AccountsDetails = AccountsDetails;
	}

	public Optional<CorporateAction35> getCorporateActionDetails() {
		return CorporateActionDetails;
	}

	public void setCorporateActionDetails(
			Optional<CorporateAction35> CorporateActionDetails) {
		this.CorporateActionDetails = CorporateActionDetails;
	}

	public Optional<PartyIdentification104Choice> getIssuerAgent() {
		return IssuerAgent;
	}

	public void setIssuerAgent(
			Optional<PartyIdentification104Choice> IssuerAgent) {
		this.IssuerAgent = IssuerAgent;
	}

	public Optional<PartyIdentification104Choice> getPayingAgent() {
		return PayingAgent;
	}

	public void setPayingAgent(
			Optional<PartyIdentification104Choice> PayingAgent) {
		this.PayingAgent = PayingAgent;
	}

	public Optional<PartyIdentification104Choice> getSubPayingAgent() {
		return SubPayingAgent;
	}

	public void setSubPayingAgent(
			Optional<PartyIdentification104Choice> SubPayingAgent) {
		this.SubPayingAgent = SubPayingAgent;
	}

	public Optional<PartyIdentification104Choice> getRegistrar() {
		return Registrar;
	}

	public void setRegistrar(Optional<PartyIdentification104Choice> Registrar) {
		this.Registrar = Registrar;
	}

	public Optional<PartyIdentification104Choice> getResellingAgent() {
		return ResellingAgent;
	}

	public void setResellingAgent(
			Optional<PartyIdentification104Choice> ResellingAgent) {
		this.ResellingAgent = ResellingAgent;
	}

	public Optional<PartyIdentification104Choice> getPhysicalSecuritiesAgent() {
		return PhysicalSecuritiesAgent;
	}

	public void setPhysicalSecuritiesAgent(
			Optional<PartyIdentification104Choice> PhysicalSecuritiesAgent) {
		this.PhysicalSecuritiesAgent = PhysicalSecuritiesAgent;
	}

	public Optional<PartyIdentification104Choice> getDropAgent() {
		return DropAgent;
	}

	public void setDropAgent(Optional<PartyIdentification104Choice> DropAgent) {
		this.DropAgent = DropAgent;
	}

	public Optional<PartyIdentification104Choice> getSolicitationAgent() {
		return SolicitationAgent;
	}

	public void setSolicitationAgent(
			Optional<PartyIdentification104Choice> SolicitationAgent) {
		this.SolicitationAgent = SolicitationAgent;
	}

	public Optional<PartyIdentification104Choice> getInformationAgent() {
		return InformationAgent;
	}

	public void setInformationAgent(
			Optional<PartyIdentification104Choice> InformationAgent) {
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