package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification8;
import java.util.Optional;
import com.tools20022.repository.dict.msg.CorporateActionInformation1;
import com.tools20022.repository.dict.msg.CorporateActionMovement1;
import com.tools20022.repository.dict.msg.UnderlyingSecurityMovement1;
import com.tools20022.repository.dict.msg.CashMovement2;
import com.tools20022.repository.dict.msg.ProceedsMovement1;

/**
 * Scope This message is sent by an issuer (or its agent) to a CSD to order: -
 * the global or individual debit of exercised resources (cash and/or
 * securities), per event and optionally per option and per resource for all or
 * individual CSD client's accounts; - and/or the individual credits of the
 * outturn resources per event and optionally per option and per resource for a
 * given CSD client's account. Usage This message is used to instruct: - the
 * global debit of the exercised resources from the CSD client's available or
 * sequestered balance, in which case, the order type must be 'global debit
 * order'; - the individual debits and credits: - the individual debit of the
 * exercised resources from the CSD client's available or sequestered balance
 * and/or - the individual credit of the outturn resources to the CSD client's
 * account. The order type must be 'individual order'; - a return order, in the
 * case of a scaleback, i.e. the return of the exercised resources to the CSD
 * client's account. The order type must be either 'global return order' or
 * 'individual return order'; and change of option, e.g. in the case of the
 * closure of an option, by moving the exercised resources from one option to
 * another option within the sequestered balances in accordance to the new
 * option conditions. The order type must be 'option change order'.
 */
public class AgentCAMovementInstructionV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification8 Identification;
	private Optional<DocumentIdentification8> AgentCAElectionAdviceIdentification;
	private CorporateActionInformation1 CorporateActionGeneralInformation;
	private CorporateActionMovement1 MovementGeneralInformation;
	private Optional<UnderlyingSecurityMovement1> UnderlyingSecuritiesMovementDetails;
	private Optional<CashMovement2> UnderlyingCashMovementDetails;
	private Optional<ProceedsMovement1> ProceedsMovementDetails;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public Optional<DocumentIdentification8> getAgentCAElectionAdviceIdentification() {
		return AgentCAElectionAdviceIdentification;
	}

	public void setAgentCAElectionAdviceIdentification(
			Optional<DocumentIdentification8> AgentCAElectionAdviceIdentification) {
		this.AgentCAElectionAdviceIdentification = AgentCAElectionAdviceIdentification;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation1 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public CorporateActionMovement1 getMovementGeneralInformation() {
		return MovementGeneralInformation;
	}

	public void setMovementGeneralInformation(
			CorporateActionMovement1 MovementGeneralInformation) {
		this.MovementGeneralInformation = MovementGeneralInformation;
	}

	public Optional<UnderlyingSecurityMovement1> getUnderlyingSecuritiesMovementDetails() {
		return UnderlyingSecuritiesMovementDetails;
	}

	public void setUnderlyingSecuritiesMovementDetails(
			Optional<UnderlyingSecurityMovement1> UnderlyingSecuritiesMovementDetails) {
		this.UnderlyingSecuritiesMovementDetails = UnderlyingSecuritiesMovementDetails;
	}

	public Optional<CashMovement2> getUnderlyingCashMovementDetails() {
		return UnderlyingCashMovementDetails;
	}

	public void setUnderlyingCashMovementDetails(
			Optional<CashMovement2> UnderlyingCashMovementDetails) {
		this.UnderlyingCashMovementDetails = UnderlyingCashMovementDetails;
	}

	public Optional<ProceedsMovement1> getProceedsMovementDetails() {
		return ProceedsMovementDetails;
	}

	public void setProceedsMovementDetails(
			Optional<ProceedsMovement1> ProceedsMovementDetails) {
		this.ProceedsMovementDetails = ProceedsMovementDetails;
	}
}