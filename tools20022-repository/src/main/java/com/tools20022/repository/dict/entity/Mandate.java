package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Contract;
import com.tools20022.repository.dict.entity.SignatureCondition;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Mandate;
import com.tools20022.repository.dict.entity.MandatePartyRole;
import com.tools20022.repository.dict.entity.MandateStatus;
import com.tools20022.repository.dict.entity.AccountContract;
import com.tools20022.repository.dict.entity.Authentication;
import com.tools20022.repository.dict.datatype.Max35NumericText;
import com.tools20022.repository.dict.datatype.TrueFalseIndicator;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Authorisation given by an issuing party to a holder party to act on the
 * issuer's behalf.
 */
public class Mandate extends Contract {

	private SignatureCondition SignatureConditions;
	private Max35Text MandateIdentification;
	private Mandate OriginalMandate;
	private Mandate Amendment;
	private MandatePartyRole MandatePartyRole;
	private MandateStatus MandateStatus;
	private AccountContract AccountContract;
	private Authentication Authentication;
	private Max35NumericText TrackingDays;
	private TrueFalseIndicator TrackingIndicator;
	private PercentageRate Rate;

	public SignatureCondition getSignatureConditions() {
		return SignatureConditions;
	}

	public void setSignatureConditions(SignatureCondition SignatureConditions) {
		this.SignatureConditions = SignatureConditions;
	}

	public Max35Text getMandateIdentification() {
		return MandateIdentification;
	}

	public void setMandateIdentification(Max35Text MandateIdentification) {
		this.MandateIdentification = MandateIdentification;
	}

	public Mandate getOriginalMandate() {
		return OriginalMandate;
	}

	public void setOriginalMandate(Mandate OriginalMandate) {
		this.OriginalMandate = OriginalMandate;
	}

	public Mandate getAmendment() {
		return Amendment;
	}

	public void setAmendment(Mandate Amendment) {
		this.Amendment = Amendment;
	}

	public MandatePartyRole getMandatePartyRole() {
		return MandatePartyRole;
	}

	public void setMandatePartyRole(MandatePartyRole MandatePartyRole) {
		this.MandatePartyRole = MandatePartyRole;
	}

	public MandateStatus getMandateStatus() {
		return MandateStatus;
	}

	public void setMandateStatus(MandateStatus MandateStatus) {
		this.MandateStatus = MandateStatus;
	}

	public AccountContract getAccountContract() {
		return AccountContract;
	}

	public void setAccountContract(AccountContract AccountContract) {
		this.AccountContract = AccountContract;
	}

	public Authentication getAuthentication() {
		return Authentication;
	}

	public void setAuthentication(Authentication Authentication) {
		this.Authentication = Authentication;
	}

	public Max35NumericText getTrackingDays() {
		return TrackingDays;
	}

	public void setTrackingDays(Max35NumericText TrackingDays) {
		this.TrackingDays = TrackingDays;
	}

	public TrueFalseIndicator getTrackingIndicator() {
		return TrackingIndicator;
	}

	public void setTrackingIndicator(TrueFalseIndicator TrackingIndicator) {
		this.TrackingIndicator = TrackingIndicator;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}
}