package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionCancellationAdviceV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionCancellationAdviceV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CorporateActionCancellation3;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation86;
import com.tools20022.repository.dict.choice.AccountIdentification29Choice;
import com.tools20022.repository.dict.msg.CorporateAction34;
import java.util.Optional;
import com.tools20022.repository.dict.choice.PartyIdentification71Choice;
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
@PreviousVersion(CorporateActionCancellationAdviceV05.class)
@NextVersion(CorporateActionCancellationAdviceV07.class)
public class CorporateActionCancellationAdviceV06 {

	private CorporateActionCancellation3 CancellationAdviceGeneralInformation;
	private CorporateActionGeneralInformation86 CorporateActionGeneralInformation;
	private AccountIdentification29Choice AccountsDetails;
	private Optional<CorporateAction34> CorporateActionDetails;
	private Optional<PartyIdentification71Choice> IssuerAgent;
	private Optional<PartyIdentification71Choice> PayingAgent;
	private Optional<PartyIdentification71Choice> SubPayingAgent;
	private Optional<PartyIdentification71Choice> Registrar;
	private Optional<PartyIdentification71Choice> ResellingAgent;
	private Optional<PartyIdentification71Choice> PhysicalSecuritiesAgent;
	private Optional<PartyIdentification71Choice> DropAgent;
	private Optional<PartyIdentification71Choice> SolicitationAgent;
	private Optional<PartyIdentification71Choice> InformationAgent;
	private Optional<SupplementaryData1> SupplementaryData;

	public CorporateActionCancellation3 getCancellationAdviceGeneralInformation() {
		return CancellationAdviceGeneralInformation;
	}

	public void setCancellationAdviceGeneralInformation(
			CorporateActionCancellation3 CancellationAdviceGeneralInformation) {
		this.CancellationAdviceGeneralInformation = CancellationAdviceGeneralInformation;
	}

	public CorporateActionGeneralInformation86 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation86 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification29Choice getAccountsDetails() {
		return AccountsDetails;
	}

	public void setAccountsDetails(AccountIdentification29Choice AccountsDetails) {
		this.AccountsDetails = AccountsDetails;
	}

	public Optional<CorporateAction34> getCorporateActionDetails() {
		return CorporateActionDetails;
	}

	public void setCorporateActionDetails(
			Optional<CorporateAction34> CorporateActionDetails) {
		this.CorporateActionDetails = CorporateActionDetails;
	}

	public Optional<PartyIdentification71Choice> getIssuerAgent() {
		return IssuerAgent;
	}

	public void setIssuerAgent(Optional<PartyIdentification71Choice> IssuerAgent) {
		this.IssuerAgent = IssuerAgent;
	}

	public Optional<PartyIdentification71Choice> getPayingAgent() {
		return PayingAgent;
	}

	public void setPayingAgent(Optional<PartyIdentification71Choice> PayingAgent) {
		this.PayingAgent = PayingAgent;
	}

	public Optional<PartyIdentification71Choice> getSubPayingAgent() {
		return SubPayingAgent;
	}

	public void setSubPayingAgent(
			Optional<PartyIdentification71Choice> SubPayingAgent) {
		this.SubPayingAgent = SubPayingAgent;
	}

	public Optional<PartyIdentification71Choice> getRegistrar() {
		return Registrar;
	}

	public void setRegistrar(Optional<PartyIdentification71Choice> Registrar) {
		this.Registrar = Registrar;
	}

	public Optional<PartyIdentification71Choice> getResellingAgent() {
		return ResellingAgent;
	}

	public void setResellingAgent(
			Optional<PartyIdentification71Choice> ResellingAgent) {
		this.ResellingAgent = ResellingAgent;
	}

	public Optional<PartyIdentification71Choice> getPhysicalSecuritiesAgent() {
		return PhysicalSecuritiesAgent;
	}

	public void setPhysicalSecuritiesAgent(
			Optional<PartyIdentification71Choice> PhysicalSecuritiesAgent) {
		this.PhysicalSecuritiesAgent = PhysicalSecuritiesAgent;
	}

	public Optional<PartyIdentification71Choice> getDropAgent() {
		return DropAgent;
	}

	public void setDropAgent(Optional<PartyIdentification71Choice> DropAgent) {
		this.DropAgent = DropAgent;
	}

	public Optional<PartyIdentification71Choice> getSolicitationAgent() {
		return SolicitationAgent;
	}

	public void setSolicitationAgent(
			Optional<PartyIdentification71Choice> SolicitationAgent) {
		this.SolicitationAgent = SolicitationAgent;
	}

	public Optional<PartyIdentification71Choice> getInformationAgent() {
		return InformationAgent;
	}

	public void setInformationAgent(
			Optional<PartyIdentification71Choice> InformationAgent) {
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