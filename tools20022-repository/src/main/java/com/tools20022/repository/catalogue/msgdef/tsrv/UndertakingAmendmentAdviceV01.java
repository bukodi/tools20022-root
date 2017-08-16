package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.PartyIdentification43;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.msg.Amendment2;
import com.tools20022.repository.dict.datatype.Max2000Text;
import java.util.List;
import com.tools20022.repository.dict.msg.PartyAndSignature2;

/**
 * The UndertakingAmendmentAdvice message is sent by an advising party to the
 * beneficiary, either directly or via one or more other advising parties in the
 * transaction chain, to advise the content of a proposed amendment to an
 * undertaking. Information about the message may also be sent to other
 * interested parties. The proposed undertaking amendment could be to a demand
 * guarantee, standby letter of credit, or counter-undertaking
 * (counter-guarantee or counter-standby). In addition to providing the terms of
 * the proposed amendment and relevant details on proposed changes to the
 * undertaking, the message may provide information from the sender such as
 * confirmation details. It may also be used to advise the proposed termination
 * or cancellation of the undertaking.
 */
public class UndertakingAmendmentAdviceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private PartyIdentification43 AdvisingParty;
	private Optional<PartyIdentification43> SecondAdvisingParty;
	private ISODate DateOfAdvice;
	private Amendment2 UndertakingAmendmentAdviceDetails;
	private List<Max2000Text> BankToBankInformation;
	private Optional<PartyAndSignature2> DigitalSignature;

	public PartyIdentification43 getAdvisingParty() {
		return AdvisingParty;
	}

	public void setAdvisingParty(PartyIdentification43 AdvisingParty) {
		this.AdvisingParty = AdvisingParty;
	}

	public Optional<PartyIdentification43> getSecondAdvisingParty() {
		return SecondAdvisingParty;
	}

	public void setSecondAdvisingParty(
			Optional<PartyIdentification43> SecondAdvisingParty) {
		this.SecondAdvisingParty = SecondAdvisingParty;
	}

	public ISODate getDateOfAdvice() {
		return DateOfAdvice;
	}

	public void setDateOfAdvice(ISODate DateOfAdvice) {
		this.DateOfAdvice = DateOfAdvice;
	}

	public Amendment2 getUndertakingAmendmentAdviceDetails() {
		return UndertakingAmendmentAdviceDetails;
	}

	public void setUndertakingAmendmentAdviceDetails(
			Amendment2 UndertakingAmendmentAdviceDetails) {
		this.UndertakingAmendmentAdviceDetails = UndertakingAmendmentAdviceDetails;
	}

	public List<Max2000Text> getBankToBankInformation() {
		return BankToBankInformation;
	}

	public void setBankToBankInformation(List<Max2000Text> BankToBankInformation) {
		this.BankToBankInformation = BankToBankInformation;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}