package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.PortfolioTransferInstructionV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.PortfolioTransferInstructionV05;
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
import com.tools20022.repository.dict.msg.ISATransfer7;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An instructing party, for example, a (new) plan manager (Transferee),
 * sends the PortfolioTransferInstruction message to the executing party, for
 * example, a (old) plan manager (Transferor), on behalf of the initiating
 * party, for example, an investor (client), to instruct the transfer of
 * financial instruments from the clients account at the old plan manager
 * (Transferor) to the clients account at the new plan manager (Transferee)
 * through a nominee account. Usage The PortfolioTransferInstruction message is
 * used to instruct the withdrawal of one or more ISA or portfolio products from
 * one account and deliver them to another account. The
 * PortfolioTransferInstruction message is used to instruct one or more
 * transfers for one client. Each transfer is for delivery to the same account.
 * The account may be owned by one or more individual investors or one or more
 * corporate investors. Each transfer is identified in TransferIdentification.
 * If the instructing party does not have enough information to instruct the
 * transfer, then it must first send a AccountHoldingInformationRequest message
 * to the executing party in order to receive a AccountHoldingInformation
 * message.
 */
@PreviousVersion(PortfolioTransferInstructionV03.class)
@NextVersion(PortfolioTransferInstructionV05.class)
public class PortfolioTransferInstructionV04 {

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
	private Account5 TransferorAccount;
	private Optional<Account6> NomineeAccount;
	private PartyIdentification2Choice Transferee;
	private Optional<CashAccount11> CashAccount;
	private ISATransfer7 ProductTransfer;
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

	public Account5 getTransferorAccount() {
		return TransferorAccount;
	}

	public void setTransferorAccount(Account5 TransferorAccount) {
		this.TransferorAccount = TransferorAccount;
	}

	public Optional<Account6> getNomineeAccount() {
		return NomineeAccount;
	}

	public void setNomineeAccount(Optional<Account6> NomineeAccount) {
		this.NomineeAccount = NomineeAccount;
	}

	public PartyIdentification2Choice getTransferee() {
		return Transferee;
	}

	public void setTransferee(PartyIdentification2Choice Transferee) {
		this.Transferee = Transferee;
	}

	public Optional<CashAccount11> getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(Optional<CashAccount11> CashAccount) {
		this.CashAccount = CashAccount;
	}

	public ISATransfer7 getProductTransfer() {
		return ProductTransfer;
	}

	public void setProductTransfer(ISATransfer7 ProductTransfer) {
		this.ProductTransfer = ProductTransfer;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}