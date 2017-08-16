package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.PortfolioTransferConfirmationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.IndividualPerson8;
import com.tools20022.repository.dict.msg.Organisation4;
import com.tools20022.repository.dict.msg.Account5;
import com.tools20022.repository.dict.msg.Account6;
import com.tools20022.repository.dict.choice.PartyIdentification2Choice;
import com.tools20022.repository.dict.msg.CashAccount11;
import com.tools20022.repository.dict.msg.PEPISATransfer4;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An executing party, eg, a (old) plan manager, sends the
 * PEPOrISAOrPortfolioTransferConfirmation message to the instructing party, eg,
 * a (new) plan manager, to confirm the transfer of one or more PEP or ISA or
 * portfolio products from the client's account at the old plan manager to the
 * client's account at the new plan manager through a nominee account. Usage The
 * PEPOrISAOrPortfolioTransferConfirmation message is used to confirm the
 * transfer of one or more PEP or ISA or portfolio products. The reference of
 * each product transfer confirmation is identified in
 * TransferConfirmationIdentification. The reference of the original product
 * transfer is specified in TransferInstructionReference. The message
 * identification of the PEPOrISAPOrPortfolioTransferInstruction message in
 * which the product transfers were conveyed may also be quoted in
 * RelatedReference.
 */
@NextVersion(PortfolioTransferConfirmationV03.class)
public class PEPOrISAOrPortfolioTransferConfirmationV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageReference;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Optional<IndividualPerson8> PrimaryIndividualInvestor;
	private Optional<IndividualPerson8> SecondaryIndividualInvestor;
	private Optional<IndividualPerson8> OtherIndividualInvestor;
	private Optional<Organisation4> PrimaryCorporateInvestor;
	private Optional<Organisation4> SecondaryCorporateInvestor;
	private Optional<Organisation4> OtherCorporateInvestor;
	private Account5 ClientAccount;
	private Optional<Account6> NomineeAccount;
	private PartyIdentification2Choice NewPlanManager;
	private Optional<CashAccount11> CashAccount;
	private PEPISATransfer4 ProductTransfer;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageReference() {
		return MessageReference;
	}

	public void setMessageReference(MessageIdentification1 MessageReference) {
		this.MessageReference = MessageReference;
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

	public Optional<IndividualPerson8> getPrimaryIndividualInvestor() {
		return PrimaryIndividualInvestor;
	}

	public void setPrimaryIndividualInvestor(
			Optional<IndividualPerson8> PrimaryIndividualInvestor) {
		this.PrimaryIndividualInvestor = PrimaryIndividualInvestor;
	}

	public Optional<IndividualPerson8> getSecondaryIndividualInvestor() {
		return SecondaryIndividualInvestor;
	}

	public void setSecondaryIndividualInvestor(
			Optional<IndividualPerson8> SecondaryIndividualInvestor) {
		this.SecondaryIndividualInvestor = SecondaryIndividualInvestor;
	}

	public Optional<IndividualPerson8> getOtherIndividualInvestor() {
		return OtherIndividualInvestor;
	}

	public void setOtherIndividualInvestor(
			Optional<IndividualPerson8> OtherIndividualInvestor) {
		this.OtherIndividualInvestor = OtherIndividualInvestor;
	}

	public Optional<Organisation4> getPrimaryCorporateInvestor() {
		return PrimaryCorporateInvestor;
	}

	public void setPrimaryCorporateInvestor(
			Optional<Organisation4> PrimaryCorporateInvestor) {
		this.PrimaryCorporateInvestor = PrimaryCorporateInvestor;
	}

	public Optional<Organisation4> getSecondaryCorporateInvestor() {
		return SecondaryCorporateInvestor;
	}

	public void setSecondaryCorporateInvestor(
			Optional<Organisation4> SecondaryCorporateInvestor) {
		this.SecondaryCorporateInvestor = SecondaryCorporateInvestor;
	}

	public Optional<Organisation4> getOtherCorporateInvestor() {
		return OtherCorporateInvestor;
	}

	public void setOtherCorporateInvestor(
			Optional<Organisation4> OtherCorporateInvestor) {
		this.OtherCorporateInvestor = OtherCorporateInvestor;
	}

	public Account5 getClientAccount() {
		return ClientAccount;
	}

	public void setClientAccount(Account5 ClientAccount) {
		this.ClientAccount = ClientAccount;
	}

	public Optional<Account6> getNomineeAccount() {
		return NomineeAccount;
	}

	public void setNomineeAccount(Optional<Account6> NomineeAccount) {
		this.NomineeAccount = NomineeAccount;
	}

	public PartyIdentification2Choice getNewPlanManager() {
		return NewPlanManager;
	}

	public void setNewPlanManager(PartyIdentification2Choice NewPlanManager) {
		this.NewPlanManager = NewPlanManager;
	}

	public Optional<CashAccount11> getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(Optional<CashAccount11> CashAccount) {
		this.CashAccount = CashAccount;
	}

	public PEPISATransfer4 getProductTransfer() {
		return ProductTransfer;
	}

	public void setProductTransfer(PEPISATransfer4 ProductTransfer) {
		this.ProductTransfer = ProductTransfer;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}