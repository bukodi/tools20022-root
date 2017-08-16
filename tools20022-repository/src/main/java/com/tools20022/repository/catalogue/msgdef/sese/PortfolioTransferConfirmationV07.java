package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.PortfolioTransferConfirmationV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference6;
import java.util.Optional;
import com.tools20022.repository.dict.msg.IndividualPerson8;
import com.tools20022.repository.dict.msg.Organisation21;
import com.tools20022.repository.dict.msg.Account19;
import com.tools20022.repository.dict.choice.PartyIdentification70Choice;
import com.tools20022.repository.dict.msg.Intermediary34;
import com.tools20022.repository.dict.msg.CashAccount34;
import com.tools20022.repository.dict.msg.ISATransfer26;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An executing party, for example, a (old) plan manager (Transferor),
 * sends the PortfolioTransferConfirmation message to the instructing party, for
 * example, a (new) plan manager (Transferee), to confirm the transfer of one or
 * more ISA or portfolio products from the client's account at the old plan
 * manager (Transferor) to the client's account at the new plan manager
 * (Transferee) through a nominee account. Usage The
 * PortfolioTransferConfirmation message is used to confirm the transfer of one
 * or more ISA or portfolio products. The reference of each product transfer
 * confirmation is identified in TransferConfirmationIdentification. The
 * reference of the original product transfer is specified in
 * TransferInstructionReference. The message identification of the
 * PortfolioTransferInstruction message in which the product transfers were
 * conveyed may also be quoted in RelatedReference.
 */
@PreviousVersion(PortfolioTransferConfirmationV06.class)
public class PortfolioTransferConfirmationV07
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageReference;
	private Optional<AdditionalReference6> PoolReference;
	private Optional<AdditionalReference6> PreviousReference;
	private Optional<AdditionalReference6> RelatedReference;
	private Optional<IndividualPerson8> PrimaryIndividualInvestor;
	private Optional<IndividualPerson8> SecondaryIndividualInvestor;
	private Optional<IndividualPerson8> OtherIndividualInvestor;
	private Optional<Organisation21> PrimaryCorporateInvestor;
	private Optional<Organisation21> SecondaryCorporateInvestor;
	private Optional<Organisation21> OtherCorporateInvestor;
	private Account19 TransferorAccount;
	private Optional<Account19> NomineeAccount;
	private PartyIdentification70Choice Transferee;
	private Optional<Intermediary34> IntermediaryInformation;
	private Optional<CashAccount34> CashAccount;
	private ISATransfer26 ProductTransfer;
	private Optional<MarketPracticeVersion1> MarketPracticeVersion;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageReference() {
		return MessageReference;
	}

	public void setMessageReference(MessageIdentification1 MessageReference) {
		this.MessageReference = MessageReference;
	}

	public Optional<AdditionalReference6> getPoolReference() {
		return PoolReference;
	}

	public void setPoolReference(Optional<AdditionalReference6> PoolReference) {
		this.PoolReference = PoolReference;
	}

	public Optional<AdditionalReference6> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference6> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference6> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference6> RelatedReference) {
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

	public Optional<Organisation21> getPrimaryCorporateInvestor() {
		return PrimaryCorporateInvestor;
	}

	public void setPrimaryCorporateInvestor(
			Optional<Organisation21> PrimaryCorporateInvestor) {
		this.PrimaryCorporateInvestor = PrimaryCorporateInvestor;
	}

	public Optional<Organisation21> getSecondaryCorporateInvestor() {
		return SecondaryCorporateInvestor;
	}

	public void setSecondaryCorporateInvestor(
			Optional<Organisation21> SecondaryCorporateInvestor) {
		this.SecondaryCorporateInvestor = SecondaryCorporateInvestor;
	}

	public Optional<Organisation21> getOtherCorporateInvestor() {
		return OtherCorporateInvestor;
	}

	public void setOtherCorporateInvestor(
			Optional<Organisation21> OtherCorporateInvestor) {
		this.OtherCorporateInvestor = OtherCorporateInvestor;
	}

	public Account19 getTransferorAccount() {
		return TransferorAccount;
	}

	public void setTransferorAccount(Account19 TransferorAccount) {
		this.TransferorAccount = TransferorAccount;
	}

	public Optional<Account19> getNomineeAccount() {
		return NomineeAccount;
	}

	public void setNomineeAccount(Optional<Account19> NomineeAccount) {
		this.NomineeAccount = NomineeAccount;
	}

	public PartyIdentification70Choice getTransferee() {
		return Transferee;
	}

	public void setTransferee(PartyIdentification70Choice Transferee) {
		this.Transferee = Transferee;
	}

	public Optional<Intermediary34> getIntermediaryInformation() {
		return IntermediaryInformation;
	}

	public void setIntermediaryInformation(
			Optional<Intermediary34> IntermediaryInformation) {
		this.IntermediaryInformation = IntermediaryInformation;
	}

	public Optional<CashAccount34> getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(Optional<CashAccount34> CashAccount) {
		this.CashAccount = CashAccount;
	}

	public ISATransfer26 getProductTransfer() {
		return ProductTransfer;
	}

	public void setProductTransfer(ISATransfer26 ProductTransfer) {
		this.ProductTransfer = ProductTransfer;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return MarketPracticeVersion;
	}

	public void setMarketPracticeVersion(
			Optional<MarketPracticeVersion1> MarketPracticeVersion) {
		this.MarketPracticeVersion = MarketPracticeVersion;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}