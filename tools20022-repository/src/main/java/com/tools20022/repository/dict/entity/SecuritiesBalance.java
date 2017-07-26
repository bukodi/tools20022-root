package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Balance;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.SecuritiesAccount;
import com.tools20022.repository.dict.entity.CorporateActionEntitlement;
import com.tools20022.repository.dict.codeset.ShortLongCode;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.SecuritiesBalance;
import com.tools20022.repository.dict.codeset.SecuritiesBalanceTypeV2Code;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.MeetingEntitlement;
import com.tools20022.repository.dict.entity.SafekeepingPlace;
import com.tools20022.repository.dict.entity.SecuritiesEntry;
import com.tools20022.repository.dict.entity.IntraPositionTransfer;
import com.tools20022.repository.dict.entity.Pledgee;

/**
 * Net position of a segregated holding, in a single security, within the
 * overall position held in a securities account. A securities balance is
 * calculated from the sum of securities' receipts minus the sum of securities'
 * deliveries.
 */
public class SecuritiesBalance extends Balance {

	private CurrencyAndAmount NetGainLoss;
	private SecuritiesAccount SecuritiesAccount;
	private CorporateActionEntitlement EligibleBalanceRelatedEntitlement;
	private ShortLongCode ShortLong;
	private SecuritiesQuantity AggregateQuantity;
	private CorporateActionEntitlement CorporateActionEntitlement;
	private CorporateActionEntitlement InstructedBalanceRelatedEntitlement;
	private CorporateActionEntitlement UninstructedBalanceRelatedEntitlement;
	private SecuritiesBalance MainSecuritiesBalance;
	private SecuritiesBalance SecuritiesSubBalance;
	private SecuritiesBalanceTypeV2Code SecuritiesBalanceType;
	private SecuritiesQuantity SubBalanceQuantity;
	private Security Security;
	private CurrencyExchange ExchangeRate;
	private YesNoIndicator AvailabilityIndicator;
	private SecuritiesQuantity AvailableQuantity;
	private MeetingEntitlement RelatedMeetingEntitlement;
	private SecuritiesQuantity UnavailableQuantity;
	private SafekeepingPlace SafekeepingPlace;
	private SecuritiesEntry SecuritiesEntry;
	private CorporateActionEntitlement NotEligibleBalanceRelatedEntitlement;
	private IntraPositionTransfer RelatedIntraPositionTransfer;
	private CurrencyAndAmount CostAdjustment;
	private Pledgee Pledgee;

	public CurrencyAndAmount getNetGainLoss() {
		return NetGainLoss;
	}

	public void setNetGainLoss(CurrencyAndAmount NetGainLoss) {
		this.NetGainLoss = NetGainLoss;
	}

	public SecuritiesAccount getSecuritiesAccount() {
		return SecuritiesAccount;
	}

	public void setSecuritiesAccount(SecuritiesAccount SecuritiesAccount) {
		this.SecuritiesAccount = SecuritiesAccount;
	}

	public CorporateActionEntitlement getEligibleBalanceRelatedEntitlement() {
		return EligibleBalanceRelatedEntitlement;
	}

	public void setEligibleBalanceRelatedEntitlement(
			CorporateActionEntitlement EligibleBalanceRelatedEntitlement) {
		this.EligibleBalanceRelatedEntitlement = EligibleBalanceRelatedEntitlement;
	}

	public ShortLongCode getShortLong() {
		return ShortLong;
	}

	public void setShortLong(ShortLongCode ShortLong) {
		this.ShortLong = ShortLong;
	}

	public SecuritiesQuantity getAggregateQuantity() {
		return AggregateQuantity;
	}

	public void setAggregateQuantity(SecuritiesQuantity AggregateQuantity) {
		this.AggregateQuantity = AggregateQuantity;
	}

	public CorporateActionEntitlement getCorporateActionEntitlement() {
		return CorporateActionEntitlement;
	}

	public void setCorporateActionEntitlement(
			CorporateActionEntitlement CorporateActionEntitlement) {
		this.CorporateActionEntitlement = CorporateActionEntitlement;
	}

	public CorporateActionEntitlement getInstructedBalanceRelatedEntitlement() {
		return InstructedBalanceRelatedEntitlement;
	}

	public void setInstructedBalanceRelatedEntitlement(
			CorporateActionEntitlement InstructedBalanceRelatedEntitlement) {
		this.InstructedBalanceRelatedEntitlement = InstructedBalanceRelatedEntitlement;
	}

	public CorporateActionEntitlement getUninstructedBalanceRelatedEntitlement() {
		return UninstructedBalanceRelatedEntitlement;
	}

	public void setUninstructedBalanceRelatedEntitlement(
			CorporateActionEntitlement UninstructedBalanceRelatedEntitlement) {
		this.UninstructedBalanceRelatedEntitlement = UninstructedBalanceRelatedEntitlement;
	}

	public SecuritiesBalance getMainSecuritiesBalance() {
		return MainSecuritiesBalance;
	}

	public void setMainSecuritiesBalance(SecuritiesBalance MainSecuritiesBalance) {
		this.MainSecuritiesBalance = MainSecuritiesBalance;
	}

	public SecuritiesBalance getSecuritiesSubBalance() {
		return SecuritiesSubBalance;
	}

	public void setSecuritiesSubBalance(SecuritiesBalance SecuritiesSubBalance) {
		this.SecuritiesSubBalance = SecuritiesSubBalance;
	}

	public SecuritiesBalanceTypeV2Code getSecuritiesBalanceType() {
		return SecuritiesBalanceType;
	}

	public void setSecuritiesBalanceType(
			SecuritiesBalanceTypeV2Code SecuritiesBalanceType) {
		this.SecuritiesBalanceType = SecuritiesBalanceType;
	}

	public SecuritiesQuantity getSubBalanceQuantity() {
		return SubBalanceQuantity;
	}

	public void setSubBalanceQuantity(SecuritiesQuantity SubBalanceQuantity) {
		this.SubBalanceQuantity = SubBalanceQuantity;
	}

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public CurrencyExchange getExchangeRate() {
		return ExchangeRate;
	}

	public void setExchangeRate(CurrencyExchange ExchangeRate) {
		this.ExchangeRate = ExchangeRate;
	}

	public YesNoIndicator getAvailabilityIndicator() {
		return AvailabilityIndicator;
	}

	public void setAvailabilityIndicator(YesNoIndicator AvailabilityIndicator) {
		this.AvailabilityIndicator = AvailabilityIndicator;
	}

	public SecuritiesQuantity getAvailableQuantity() {
		return AvailableQuantity;
	}

	public void setAvailableQuantity(SecuritiesQuantity AvailableQuantity) {
		this.AvailableQuantity = AvailableQuantity;
	}

	public MeetingEntitlement getRelatedMeetingEntitlement() {
		return RelatedMeetingEntitlement;
	}

	public void setRelatedMeetingEntitlement(
			MeetingEntitlement RelatedMeetingEntitlement) {
		this.RelatedMeetingEntitlement = RelatedMeetingEntitlement;
	}

	public SecuritiesQuantity getUnavailableQuantity() {
		return UnavailableQuantity;
	}

	public void setUnavailableQuantity(SecuritiesQuantity UnavailableQuantity) {
		this.UnavailableQuantity = UnavailableQuantity;
	}

	public SafekeepingPlace getSafekeepingPlace() {
		return SafekeepingPlace;
	}

	public void setSafekeepingPlace(SafekeepingPlace SafekeepingPlace) {
		this.SafekeepingPlace = SafekeepingPlace;
	}

	public SecuritiesEntry getSecuritiesEntry() {
		return SecuritiesEntry;
	}

	public void setSecuritiesEntry(SecuritiesEntry SecuritiesEntry) {
		this.SecuritiesEntry = SecuritiesEntry;
	}

	public CorporateActionEntitlement getNotEligibleBalanceRelatedEntitlement() {
		return NotEligibleBalanceRelatedEntitlement;
	}

	public void setNotEligibleBalanceRelatedEntitlement(
			CorporateActionEntitlement NotEligibleBalanceRelatedEntitlement) {
		this.NotEligibleBalanceRelatedEntitlement = NotEligibleBalanceRelatedEntitlement;
	}

	public IntraPositionTransfer getRelatedIntraPositionTransfer() {
		return RelatedIntraPositionTransfer;
	}

	public void setRelatedIntraPositionTransfer(
			IntraPositionTransfer RelatedIntraPositionTransfer) {
		this.RelatedIntraPositionTransfer = RelatedIntraPositionTransfer;
	}

	public CurrencyAndAmount getCostAdjustment() {
		return CostAdjustment;
	}

	public void setCostAdjustment(CurrencyAndAmount CostAdjustment) {
		this.CostAdjustment = CostAdjustment;
	}

	public Pledgee getPledgee() {
		return Pledgee;
	}

	public void setPledgee(Pledgee Pledgee) {
		this.Pledgee = Pledgee;
	}
}