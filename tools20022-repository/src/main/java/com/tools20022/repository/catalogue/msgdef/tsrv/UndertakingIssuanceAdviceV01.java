package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.repository.dict.msg.PartyIdentification43;
import java.util.Optional;
import com.tools20022.repository.dict.choice.DateAndDateTimeChoice;
import com.tools20022.repository.dict.msg.UndertakingAdvice1;
import com.tools20022.repository.dict.datatype.Max2000Text;
import java.util.List;
import com.tools20022.repository.dict.msg.PartyAndSignature2;

/**
 * The UndertakingIssuanceAdvice message is sent by an advising party to the
 * beneficiary, either directly or via one or more other advising parties in the
 * transaction chain, to advise the issuance of an undertaking. Other interested
 * parties may also be informed of the advice. The undertaking advised could be
 * a demand guarantee, standby letter of credit, or counter-undertaking
 * (counter-guarantee or counter-standby). In addition to providing details on
 * the applicable rules, expiry date, the amount, required documents, and terms
 * and conditions of the undertaking, the advice may provide information from
 * the sender such as confirmation details.
 */
public class UndertakingIssuanceAdviceV01 {

	private PartyIdentification43 AdvisingParty;
	private Optional<PartyIdentification43> SecondAdvisingParty;
	private DateAndDateTimeChoice DateOfAdvice;
	private UndertakingAdvice1 UndertakingIssuanceAdviceDetails;
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

	public DateAndDateTimeChoice getDateOfAdvice() {
		return DateOfAdvice;
	}

	public void setDateOfAdvice(DateAndDateTimeChoice DateOfAdvice) {
		this.DateOfAdvice = DateOfAdvice;
	}

	public UndertakingAdvice1 getUndertakingIssuanceAdviceDetails() {
		return UndertakingIssuanceAdviceDetails;
	}

	public void setUndertakingIssuanceAdviceDetails(
			UndertakingAdvice1 UndertakingIssuanceAdviceDetails) {
		this.UndertakingIssuanceAdviceDetails = UndertakingIssuanceAdviceDetails;
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