package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.RolePlayer;
import com.tools20022.repository.dict.entity.SystemIdentification;
import com.tools20022.repository.dict.entity.Location;
import com.tools20022.repository.dict.entity.Reconciliation;
import com.tools20022.repository.dict.entity.SystemAvailability;
import com.tools20022.repository.dict.entity.SystemEventInformation;
import com.tools20022.repository.dict.entity.SystemPartyRole;
import com.tools20022.repository.dict.entity.SystemStatus;
import com.tools20022.repository.dict.entity.SystemBusinessInformation;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.Negotiation;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.Trade;
import com.tools20022.repository.dict.entity.Assessment;
import com.tools20022.repository.dict.entity.Position;
import com.tools20022.repository.dict.codeset.ISO2ALanguageCode;

/**
 * Set of integrated applications that provides centralised services such as
 * clearing, netting, reconciliation, trading and/or settlement.
 */
public class System extends RolePlayer
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SystemIdentification SystemIdentification;
	private Location Location;
	private Reconciliation Reconciliation;
	private SystemAvailability Availability;
	private SystemEventInformation Event;
	private SystemPartyRole PartyRole;
	private SystemStatus Status;
	private SystemBusinessInformation SystemGeneratedInformation;
	private DateTimePeriod VersionValidityPeriod;
	private ISODateTime SystemDateTime;
	private Negotiation Negotiation;
	private Account Account;
	private Trade Trade;
	private Assessment Assessment;
	private Position TradesPosition;
	private ISO2ALanguageCode SystemLanguage;

	public SystemIdentification getSystemIdentification() {
		return SystemIdentification;
	}

	public void setSystemIdentification(
			SystemIdentification SystemIdentification) {
		this.SystemIdentification = SystemIdentification;
	}

	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location Location) {
		this.Location = Location;
	}

	public Reconciliation getReconciliation() {
		return Reconciliation;
	}

	public void setReconciliation(Reconciliation Reconciliation) {
		this.Reconciliation = Reconciliation;
	}

	public SystemAvailability getAvailability() {
		return Availability;
	}

	public void setAvailability(SystemAvailability Availability) {
		this.Availability = Availability;
	}

	public SystemEventInformation getEvent() {
		return Event;
	}

	public void setEvent(SystemEventInformation Event) {
		this.Event = Event;
	}

	public SystemPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(SystemPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public SystemStatus getStatus() {
		return Status;
	}

	public void setStatus(SystemStatus Status) {
		this.Status = Status;
	}

	public SystemBusinessInformation getSystemGeneratedInformation() {
		return SystemGeneratedInformation;
	}

	public void setSystemGeneratedInformation(
			SystemBusinessInformation SystemGeneratedInformation) {
		this.SystemGeneratedInformation = SystemGeneratedInformation;
	}

	public DateTimePeriod getVersionValidityPeriod() {
		return VersionValidityPeriod;
	}

	public void setVersionValidityPeriod(DateTimePeriod VersionValidityPeriod) {
		this.VersionValidityPeriod = VersionValidityPeriod;
	}

	public ISODateTime getSystemDateTime() {
		return SystemDateTime;
	}

	public void setSystemDateTime(ISODateTime SystemDateTime) {
		this.SystemDateTime = SystemDateTime;
	}

	public Negotiation getNegotiation() {
		return Negotiation;
	}

	public void setNegotiation(Negotiation Negotiation) {
		this.Negotiation = Negotiation;
	}

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}

	public Trade getTrade() {
		return Trade;
	}

	public void setTrade(Trade Trade) {
		this.Trade = Trade;
	}

	public Assessment getAssessment() {
		return Assessment;
	}

	public void setAssessment(Assessment Assessment) {
		this.Assessment = Assessment;
	}

	public Position getTradesPosition() {
		return TradesPosition;
	}

	public void setTradesPosition(Position TradesPosition) {
		this.TradesPosition = TradesPosition;
	}

	public ISO2ALanguageCode getSystemLanguage() {
		return SystemLanguage;
	}

	public void setSystemLanguage(ISO2ALanguageCode SystemLanguage) {
		this.SystemLanguage = SystemLanguage;
	}
}