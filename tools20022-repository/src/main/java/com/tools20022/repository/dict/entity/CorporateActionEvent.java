package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.CorporateActionEventTypeV3Code;
import com.tools20022.repository.dict.codeset.CorporateActionMandatoryVoluntaryCode;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.entity.CorporateActionPrice;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.Deadline;
import com.tools20022.repository.dict.codeset.AdditionalBusinessProcessCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.CorporateActionFeesAndCharges;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.codeset.CorporateActionEventProcessingTypeCode;
import com.tools20022.repository.dict.entity.CorporateActionStatus;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.CorporateActionEventStageCode;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.entity.CorporateActionPartyRole;
import com.tools20022.repository.dict.entity.MarketClaim;
import com.tools20022.repository.dict.entity.BiddingConditions;
import com.tools20022.repository.dict.entity.ClassAction;
import com.tools20022.repository.dict.entity.CorporateActionEventRegistration;
import com.tools20022.repository.dict.entity.SuspensionPeriod;
import com.tools20022.repository.dict.entity.Lottery;
import com.tools20022.repository.dict.codeset.RemarketingMarginTypeCode;
import com.tools20022.repository.dict.entity.Meeting;
import com.tools20022.repository.dict.entity.CorporateActionServicing;
import com.tools20022.repository.dict.entity.Issuance;
import com.tools20022.repository.dict.entity.SecuritiesModification;
import com.tools20022.repository.dict.entity.Tax;
import com.tools20022.repository.dict.codeset.ConsentTypeCode;
import com.tools20022.repository.dict.entity.ProceedsDefinition;

/**
 * An event determined by a corporation's board of directors, that changes the
 * existing corporate capital structure or financial condition.
 */
public class CorporateActionEvent extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CorporateActionEventTypeV3Code Type;
	private CorporateActionMandatoryVoluntaryCode MandatoryVoluntaryEventType;
	private Security UnderlyingSecurity;
	private CorporateActionPrice CorporateActionPrice;
	private CurrencyExchange ExchangeRate;
	private Max350Text RegistrationDetails;
	private Max350Text BasketOrIndexInformation;
	private Deadline Deadline;
	private AdditionalBusinessProcessCode AdditionalBusinessProcess;
	private ISODateTime TradingDate;
	private CorporateActionFeesAndCharges CorporateActionCharge;
	private ISODateTime PariPassuDate;
	private Max350Text InformationConditions;
	private SecuritiesQuantity FractionalQuantity;
	private CorporateActionEventProcessingTypeCode EventProcessingType;
	private CorporateActionStatus CorporateActionStatus;
	private ISODateTime AnnouncementDate;
	private ISODateTime EffectiveDate;
	private ISODateTime FurtherDetailsAnnouncementDate;
	private ISODateTime MarginFixingDate;
	private ISODate ResultPublicationDate;
	private ISODateTime UnconditionalDate;
	private ISODateTime WhollyUnconditionalDate;
	private ISODateTime LapsedDate;
	private DateTimePeriod BookClosurePeriod;
	private SecuritiesQuantity SecuritiesQuantity;
	private YesNoIndicator RestrictionIndicator;
	private CorporateActionEventStageCode EventStage;
	private ContactPoint DocumentationLocation;
	private SecuritiesQuantity SecuritiesQuantitySought;
	private YesNoIndicator PartialElectionIndicator;
	private CorporateActionPartyRole CorporateActionPartyRole;
	private MarketClaim MarketClaim;
	private BiddingConditions BiddingConditions;
	private ClassAction RelatedClassAction;
	private CorporateActionEventRegistration CorporateActionEventRegistration;
	private SuspensionPeriod SuspensionPeriod;
	private Lottery Lottery;
	private RemarketingMarginTypeCode MarginType;
	private Meeting RelatedMeeting;
	private CorporateActionServicing Services;
	private Issuance Issuance;
	private SecuritiesModification SecuritiesModification;
	private DateTimePeriod TradingPeriod;
	private Tax TransactionTax;
	private ConsentTypeCode ConsentType;
	private ProceedsDefinition ProceedsDefinition;

	public CorporateActionEventTypeV3Code getType() {
		return Type;
	}

	public void setType(CorporateActionEventTypeV3Code Type) {
		this.Type = Type;
	}

	public CorporateActionMandatoryVoluntaryCode getMandatoryVoluntaryEventType() {
		return MandatoryVoluntaryEventType;
	}

	public void setMandatoryVoluntaryEventType(
			CorporateActionMandatoryVoluntaryCode MandatoryVoluntaryEventType) {
		this.MandatoryVoluntaryEventType = MandatoryVoluntaryEventType;
	}

	public Security getUnderlyingSecurity() {
		return UnderlyingSecurity;
	}

	public void setUnderlyingSecurity(Security UnderlyingSecurity) {
		this.UnderlyingSecurity = UnderlyingSecurity;
	}

	public CorporateActionPrice getCorporateActionPrice() {
		return CorporateActionPrice;
	}

	public void setCorporateActionPrice(
			CorporateActionPrice CorporateActionPrice) {
		this.CorporateActionPrice = CorporateActionPrice;
	}

	public CurrencyExchange getExchangeRate() {
		return ExchangeRate;
	}

	public void setExchangeRate(CurrencyExchange ExchangeRate) {
		this.ExchangeRate = ExchangeRate;
	}

	public Max350Text getRegistrationDetails() {
		return RegistrationDetails;
	}

	public void setRegistrationDetails(Max350Text RegistrationDetails) {
		this.RegistrationDetails = RegistrationDetails;
	}

	public Max350Text getBasketOrIndexInformation() {
		return BasketOrIndexInformation;
	}

	public void setBasketOrIndexInformation(Max350Text BasketOrIndexInformation) {
		this.BasketOrIndexInformation = BasketOrIndexInformation;
	}

	public Deadline getDeadline() {
		return Deadline;
	}

	public void setDeadline(Deadline Deadline) {
		this.Deadline = Deadline;
	}

	public AdditionalBusinessProcessCode getAdditionalBusinessProcess() {
		return AdditionalBusinessProcess;
	}

	public void setAdditionalBusinessProcess(
			AdditionalBusinessProcessCode AdditionalBusinessProcess) {
		this.AdditionalBusinessProcess = AdditionalBusinessProcess;
	}

	public ISODateTime getTradingDate() {
		return TradingDate;
	}

	public void setTradingDate(ISODateTime TradingDate) {
		this.TradingDate = TradingDate;
	}

	public CorporateActionFeesAndCharges getCorporateActionCharge() {
		return CorporateActionCharge;
	}

	public void setCorporateActionCharge(
			CorporateActionFeesAndCharges CorporateActionCharge) {
		this.CorporateActionCharge = CorporateActionCharge;
	}

	public ISODateTime getPariPassuDate() {
		return PariPassuDate;
	}

	public void setPariPassuDate(ISODateTime PariPassuDate) {
		this.PariPassuDate = PariPassuDate;
	}

	public Max350Text getInformationConditions() {
		return InformationConditions;
	}

	public void setInformationConditions(Max350Text InformationConditions) {
		this.InformationConditions = InformationConditions;
	}

	public SecuritiesQuantity getFractionalQuantity() {
		return FractionalQuantity;
	}

	public void setFractionalQuantity(SecuritiesQuantity FractionalQuantity) {
		this.FractionalQuantity = FractionalQuantity;
	}

	public CorporateActionEventProcessingTypeCode getEventProcessingType() {
		return EventProcessingType;
	}

	public void setEventProcessingType(
			CorporateActionEventProcessingTypeCode EventProcessingType) {
		this.EventProcessingType = EventProcessingType;
	}

	public CorporateActionStatus getCorporateActionStatus() {
		return CorporateActionStatus;
	}

	public void setCorporateActionStatus(
			CorporateActionStatus CorporateActionStatus) {
		this.CorporateActionStatus = CorporateActionStatus;
	}

	public ISODateTime getAnnouncementDate() {
		return AnnouncementDate;
	}

	public void setAnnouncementDate(ISODateTime AnnouncementDate) {
		this.AnnouncementDate = AnnouncementDate;
	}

	public ISODateTime getEffectiveDate() {
		return EffectiveDate;
	}

	public void setEffectiveDate(ISODateTime EffectiveDate) {
		this.EffectiveDate = EffectiveDate;
	}

	public ISODateTime getFurtherDetailsAnnouncementDate() {
		return FurtherDetailsAnnouncementDate;
	}

	public void setFurtherDetailsAnnouncementDate(
			ISODateTime FurtherDetailsAnnouncementDate) {
		this.FurtherDetailsAnnouncementDate = FurtherDetailsAnnouncementDate;
	}

	public ISODateTime getMarginFixingDate() {
		return MarginFixingDate;
	}

	public void setMarginFixingDate(ISODateTime MarginFixingDate) {
		this.MarginFixingDate = MarginFixingDate;
	}

	public ISODate getResultPublicationDate() {
		return ResultPublicationDate;
	}

	public void setResultPublicationDate(ISODate ResultPublicationDate) {
		this.ResultPublicationDate = ResultPublicationDate;
	}

	public ISODateTime getUnconditionalDate() {
		return UnconditionalDate;
	}

	public void setUnconditionalDate(ISODateTime UnconditionalDate) {
		this.UnconditionalDate = UnconditionalDate;
	}

	public ISODateTime getWhollyUnconditionalDate() {
		return WhollyUnconditionalDate;
	}

	public void setWhollyUnconditionalDate(ISODateTime WhollyUnconditionalDate) {
		this.WhollyUnconditionalDate = WhollyUnconditionalDate;
	}

	public ISODateTime getLapsedDate() {
		return LapsedDate;
	}

	public void setLapsedDate(ISODateTime LapsedDate) {
		this.LapsedDate = LapsedDate;
	}

	public DateTimePeriod getBookClosurePeriod() {
		return BookClosurePeriod;
	}

	public void setBookClosurePeriod(DateTimePeriod BookClosurePeriod) {
		this.BookClosurePeriod = BookClosurePeriod;
	}

	public SecuritiesQuantity getSecuritiesQuantity() {
		return SecuritiesQuantity;
	}

	public void setSecuritiesQuantity(SecuritiesQuantity SecuritiesQuantity) {
		this.SecuritiesQuantity = SecuritiesQuantity;
	}

	public YesNoIndicator getRestrictionIndicator() {
		return RestrictionIndicator;
	}

	public void setRestrictionIndicator(YesNoIndicator RestrictionIndicator) {
		this.RestrictionIndicator = RestrictionIndicator;
	}

	public CorporateActionEventStageCode getEventStage() {
		return EventStage;
	}

	public void setEventStage(CorporateActionEventStageCode EventStage) {
		this.EventStage = EventStage;
	}

	public ContactPoint getDocumentationLocation() {
		return DocumentationLocation;
	}

	public void setDocumentationLocation(ContactPoint DocumentationLocation) {
		this.DocumentationLocation = DocumentationLocation;
	}

	public SecuritiesQuantity getSecuritiesQuantitySought() {
		return SecuritiesQuantitySought;
	}

	public void setSecuritiesQuantitySought(
			SecuritiesQuantity SecuritiesQuantitySought) {
		this.SecuritiesQuantitySought = SecuritiesQuantitySought;
	}

	public YesNoIndicator getPartialElectionIndicator() {
		return PartialElectionIndicator;
	}

	public void setPartialElectionIndicator(
			YesNoIndicator PartialElectionIndicator) {
		this.PartialElectionIndicator = PartialElectionIndicator;
	}

	public CorporateActionPartyRole getCorporateActionPartyRole() {
		return CorporateActionPartyRole;
	}

	public void setCorporateActionPartyRole(
			CorporateActionPartyRole CorporateActionPartyRole) {
		this.CorporateActionPartyRole = CorporateActionPartyRole;
	}

	public MarketClaim getMarketClaim() {
		return MarketClaim;
	}

	public void setMarketClaim(MarketClaim MarketClaim) {
		this.MarketClaim = MarketClaim;
	}

	public BiddingConditions getBiddingConditions() {
		return BiddingConditions;
	}

	public void setBiddingConditions(BiddingConditions BiddingConditions) {
		this.BiddingConditions = BiddingConditions;
	}

	public ClassAction getRelatedClassAction() {
		return RelatedClassAction;
	}

	public void setRelatedClassAction(ClassAction RelatedClassAction) {
		this.RelatedClassAction = RelatedClassAction;
	}

	public CorporateActionEventRegistration getCorporateActionEventRegistration() {
		return CorporateActionEventRegistration;
	}

	public void setCorporateActionEventRegistration(
			CorporateActionEventRegistration CorporateActionEventRegistration) {
		this.CorporateActionEventRegistration = CorporateActionEventRegistration;
	}

	public SuspensionPeriod getSuspensionPeriod() {
		return SuspensionPeriod;
	}

	public void setSuspensionPeriod(SuspensionPeriod SuspensionPeriod) {
		this.SuspensionPeriod = SuspensionPeriod;
	}

	public Lottery getLottery() {
		return Lottery;
	}

	public void setLottery(Lottery Lottery) {
		this.Lottery = Lottery;
	}

	public RemarketingMarginTypeCode getMarginType() {
		return MarginType;
	}

	public void setMarginType(RemarketingMarginTypeCode MarginType) {
		this.MarginType = MarginType;
	}

	public Meeting getRelatedMeeting() {
		return RelatedMeeting;
	}

	public void setRelatedMeeting(Meeting RelatedMeeting) {
		this.RelatedMeeting = RelatedMeeting;
	}

	public CorporateActionServicing getServices() {
		return Services;
	}

	public void setServices(CorporateActionServicing Services) {
		this.Services = Services;
	}

	public Issuance getIssuance() {
		return Issuance;
	}

	public void setIssuance(Issuance Issuance) {
		this.Issuance = Issuance;
	}

	public SecuritiesModification getSecuritiesModification() {
		return SecuritiesModification;
	}

	public void setSecuritiesModification(
			SecuritiesModification SecuritiesModification) {
		this.SecuritiesModification = SecuritiesModification;
	}

	public DateTimePeriod getTradingPeriod() {
		return TradingPeriod;
	}

	public void setTradingPeriod(DateTimePeriod TradingPeriod) {
		this.TradingPeriod = TradingPeriod;
	}

	public Tax getTransactionTax() {
		return TransactionTax;
	}

	public void setTransactionTax(Tax TransactionTax) {
		this.TransactionTax = TransactionTax;
	}

	public ConsentTypeCode getConsentType() {
		return ConsentType;
	}

	public void setConsentType(ConsentTypeCode ConsentType) {
		this.ConsentType = ConsentType;
	}

	public ProceedsDefinition getProceedsDefinition() {
		return ProceedsDefinition;
	}

	public void setProceedsDefinition(ProceedsDefinition ProceedsDefinition) {
		this.ProceedsDefinition = ProceedsDefinition;
	}
}