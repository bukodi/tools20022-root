package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.AccountHoldingInformationV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.AccountHoldingInformationV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.codeset.BusinessFlowDirectionType1Code;
import com.tools20022.repository.dict.msg.IndividualPerson8;
import com.tools20022.repository.dict.msg.Organisation4;
import com.tools20022.repository.dict.msg.Account15;
import com.tools20022.repository.dict.msg.Account16;
import com.tools20022.repository.dict.choice.PartyIdentification2Choice;
import com.tools20022.repository.dict.msg.ISATransfer14;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An executing party, for example, a (old) plan manager (Transferor),
 * sends the AccountHoldingInformation message to the instructing party, for
 * example, a (new) plan manager (Transferee), to provide information about
 * financial instruments held on behalf of a client. Usage The
 * AccountHoldingInformation message is used to provide information about one or
 * more ISA or portfolio products held in a client's account.
 */
@PreviousVersion(AccountHoldingInformationV03.class)
@NextVersion(AccountHoldingInformationV05.class)
public class AccountHoldingInformationV04 {

	private MessageIdentification1 MessageReference;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Optional<BusinessFlowDirectionType1Code> BusinessFlowDirectionType;
	private Optional<IndividualPerson8> PrimaryIndividualInvestor;
	private Optional<IndividualPerson8> SecondaryIndividualInvestor;
	private Optional<IndividualPerson8> OtherIndividualInvestor;
	private Optional<Organisation4> PrimaryCorporateInvestor;
	private Optional<Organisation4> SecondaryCorporateInvestor;
	private Optional<Organisation4> OtherCorporateInvestor;
	private Account15 TransferorAccount;
	private Optional<Account16> NomineeAccount;
	private PartyIdentification2Choice Transferee;
	private ISATransfer14 ProductTransfer;
	private Optional<MarketPracticeVersion1> MarketPracticeVersion;
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

	public Optional<BusinessFlowDirectionType1Code> getBusinessFlowDirectionType() {
		return BusinessFlowDirectionType;
	}

	public void setBusinessFlowDirectionType(
			Optional<BusinessFlowDirectionType1Code> BusinessFlowDirectionType) {
		this.BusinessFlowDirectionType = BusinessFlowDirectionType;
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

	public Account15 getTransferorAccount() {
		return TransferorAccount;
	}

	public void setTransferorAccount(Account15 TransferorAccount) {
		this.TransferorAccount = TransferorAccount;
	}

	public Optional<Account16> getNomineeAccount() {
		return NomineeAccount;
	}

	public void setNomineeAccount(Optional<Account16> NomineeAccount) {
		this.NomineeAccount = NomineeAccount;
	}

	public PartyIdentification2Choice getTransferee() {
		return Transferee;
	}

	public void setTransferee(PartyIdentification2Choice Transferee) {
		this.Transferee = Transferee;
	}

	public ISATransfer14 getProductTransfer() {
		return ProductTransfer;
	}

	public void setProductTransfer(ISATransfer14 ProductTransfer) {
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