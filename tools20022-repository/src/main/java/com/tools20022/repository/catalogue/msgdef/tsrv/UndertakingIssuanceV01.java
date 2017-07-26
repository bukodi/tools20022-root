package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.repository.dict.msg.Undertaking3;
import com.tools20022.repository.dict.datatype.Max2000Text;
import java.util.List;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The UndertakingIssuance message is sent (and is thus issued) by the party
 * issuing the undertaking to the beneficiary. The message may be sent either to
 * the beneficiary directly or via an advising party. The undertaking could be a
 * demand guarantee, standby letter of credit, or counter-undertaking
 * (counter-guarantee or counter-standby). It contains details on the applicable
 * rules, expiry date, the amount, required documents, and terms and conditions
 * of the undertaking. The message constitutes an operative financial
 * instrument. Under the United Nations Convention on Independent Guarantees and
 * Stand-by Letters of Credit (http://www.uncitral.org), 1996, Article 2,
 * "an undertaking is an independent commitment, known in international practice as an independent guarantee or as a standby letter of credit, given by a bank or other institution or person ('guarantor/issuer') to pay to the beneficiary a certain or determinable amount upon simple demand or upon demand accompanied by other documents, in conformity with the terms and any documentary conditions of the undertaking, indicating, or from which it is to be inferred, that payment is due because of a default in the performance of an obligation, or because of another contingency, or for money borrowed or advanced, or on account of any mature indebtedness undertaken by the principal/applicant or another person"
 * .
 */
public class UndertakingIssuanceV01 {

	private Undertaking3 UndertakingIssuanceDetails;
	private List<Max2000Text> BankToBeneficiaryInformation;
	private List<Max2000Text> BankToBankInformation;
	private Optional<PartyAndSignature2> DigitalSignature;

	public Undertaking3 getUndertakingIssuanceDetails() {
		return UndertakingIssuanceDetails;
	}

	public void setUndertakingIssuanceDetails(
			Undertaking3 UndertakingIssuanceDetails) {
		this.UndertakingIssuanceDetails = UndertakingIssuanceDetails;
	}

	public List<Max2000Text> getBankToBeneficiaryInformation() {
		return BankToBeneficiaryInformation;
	}

	public void setBankToBeneficiaryInformation(
			List<Max2000Text> BankToBeneficiaryInformation) {
		this.BankToBeneficiaryInformation = BankToBeneficiaryInformation;
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