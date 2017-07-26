package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Deadline;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.datatype.ISODateTime;

/**
 * Time constraints for processing corporate actions.
 */
public class CorporateActionDeadline extends Deadline {

	private DateTimePeriod RevocabilityPeriod;
	private ISODateTime ProtectDate;
	private ISODateTime TradingSuspendedDate;
	private ISODateTime ThirdPartyDeadline;
	private ISODateTime CertificationDeadline;
	private ISODateTime DeadlineToSplit;
	private ISODateTime SpecialExDate;
	private ISODateTime DeadlineForTaxBreakdownInstruction;
	private ISODateTime EarlyClosingDate;
	private ISODateTime RecordDate;
	private ISODateTime CoverExpirationDate;
	private ISODateTime ElectionToCounterpartyDeadline;
	private ISODateTime ExpiryDate;
	private ISODateTime EarlyThirdPartyDeadline;
	private ISODateTime DepositoryCoverExpirationDate;
	private ISODateTime ResponseDeadline;
	private ISODateTime ConsentExpirationDate;
	private ISODateTime RegistrationDeadline;
	private ISODateTime StockLendingDeadline;
	private ISODateTime ConsentRecordDate;
	private ISODateTime EarlyResponseDeadline;
	private ISODateTime GuaranteedParticipationDate;

	public DateTimePeriod getRevocabilityPeriod() {
		return RevocabilityPeriod;
	}

	public void setRevocabilityPeriod(DateTimePeriod RevocabilityPeriod) {
		this.RevocabilityPeriod = RevocabilityPeriod;
	}

	public ISODateTime getProtectDate() {
		return ProtectDate;
	}

	public void setProtectDate(ISODateTime ProtectDate) {
		this.ProtectDate = ProtectDate;
	}

	public ISODateTime getTradingSuspendedDate() {
		return TradingSuspendedDate;
	}

	public void setTradingSuspendedDate(ISODateTime TradingSuspendedDate) {
		this.TradingSuspendedDate = TradingSuspendedDate;
	}

	public ISODateTime getThirdPartyDeadline() {
		return ThirdPartyDeadline;
	}

	public void setThirdPartyDeadline(ISODateTime ThirdPartyDeadline) {
		this.ThirdPartyDeadline = ThirdPartyDeadline;
	}

	public ISODateTime getCertificationDeadline() {
		return CertificationDeadline;
	}

	public void setCertificationDeadline(ISODateTime CertificationDeadline) {
		this.CertificationDeadline = CertificationDeadline;
	}

	public ISODateTime getDeadlineToSplit() {
		return DeadlineToSplit;
	}

	public void setDeadlineToSplit(ISODateTime DeadlineToSplit) {
		this.DeadlineToSplit = DeadlineToSplit;
	}

	public ISODateTime getSpecialExDate() {
		return SpecialExDate;
	}

	public void setSpecialExDate(ISODateTime SpecialExDate) {
		this.SpecialExDate = SpecialExDate;
	}

	public ISODateTime getDeadlineForTaxBreakdownInstruction() {
		return DeadlineForTaxBreakdownInstruction;
	}

	public void setDeadlineForTaxBreakdownInstruction(
			ISODateTime DeadlineForTaxBreakdownInstruction) {
		this.DeadlineForTaxBreakdownInstruction = DeadlineForTaxBreakdownInstruction;
	}

	public ISODateTime getEarlyClosingDate() {
		return EarlyClosingDate;
	}

	public void setEarlyClosingDate(ISODateTime EarlyClosingDate) {
		this.EarlyClosingDate = EarlyClosingDate;
	}

	public ISODateTime getRecordDate() {
		return RecordDate;
	}

	public void setRecordDate(ISODateTime RecordDate) {
		this.RecordDate = RecordDate;
	}

	public ISODateTime getCoverExpirationDate() {
		return CoverExpirationDate;
	}

	public void setCoverExpirationDate(ISODateTime CoverExpirationDate) {
		this.CoverExpirationDate = CoverExpirationDate;
	}

	public ISODateTime getElectionToCounterpartyDeadline() {
		return ElectionToCounterpartyDeadline;
	}

	public void setElectionToCounterpartyDeadline(
			ISODateTime ElectionToCounterpartyDeadline) {
		this.ElectionToCounterpartyDeadline = ElectionToCounterpartyDeadline;
	}

	public ISODateTime getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(ISODateTime ExpiryDate) {
		this.ExpiryDate = ExpiryDate;
	}

	public ISODateTime getEarlyThirdPartyDeadline() {
		return EarlyThirdPartyDeadline;
	}

	public void setEarlyThirdPartyDeadline(ISODateTime EarlyThirdPartyDeadline) {
		this.EarlyThirdPartyDeadline = EarlyThirdPartyDeadline;
	}

	public ISODateTime getDepositoryCoverExpirationDate() {
		return DepositoryCoverExpirationDate;
	}

	public void setDepositoryCoverExpirationDate(
			ISODateTime DepositoryCoverExpirationDate) {
		this.DepositoryCoverExpirationDate = DepositoryCoverExpirationDate;
	}

	public ISODateTime getResponseDeadline() {
		return ResponseDeadline;
	}

	public void setResponseDeadline(ISODateTime ResponseDeadline) {
		this.ResponseDeadline = ResponseDeadline;
	}

	public ISODateTime getConsentExpirationDate() {
		return ConsentExpirationDate;
	}

	public void setConsentExpirationDate(ISODateTime ConsentExpirationDate) {
		this.ConsentExpirationDate = ConsentExpirationDate;
	}

	public ISODateTime getRegistrationDeadline() {
		return RegistrationDeadline;
	}

	public void setRegistrationDeadline(ISODateTime RegistrationDeadline) {
		this.RegistrationDeadline = RegistrationDeadline;
	}

	public ISODateTime getStockLendingDeadline() {
		return StockLendingDeadline;
	}

	public void setStockLendingDeadline(ISODateTime StockLendingDeadline) {
		this.StockLendingDeadline = StockLendingDeadline;
	}

	public ISODateTime getConsentRecordDate() {
		return ConsentRecordDate;
	}

	public void setConsentRecordDate(ISODateTime ConsentRecordDate) {
		this.ConsentRecordDate = ConsentRecordDate;
	}

	public ISODateTime getEarlyResponseDeadline() {
		return EarlyResponseDeadline;
	}

	public void setEarlyResponseDeadline(ISODateTime EarlyResponseDeadline) {
		this.EarlyResponseDeadline = EarlyResponseDeadline;
	}

	public ISODateTime getGuaranteedParticipationDate() {
		return GuaranteedParticipationDate;
	}

	public void setGuaranteedParticipationDate(
			ISODateTime GuaranteedParticipationDate) {
		this.GuaranteedParticipationDate = GuaranteedParticipationDate;
	}
}