package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.AllOrNoneIndicator;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.StayOnSideTypeCode;
import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.entity.Discretion;

/**
 * Identifies the instructions for order handling
 */
public class SecuritiesOrderExecutionInstruction
		extends
			AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private AllOrNoneIndicator AllOrNone;
	private YesNoIndicator CallFirst;
	private YesNoIndicator Cross;
	private YesNoIndicator CustomerDisplay;
	private YesNoIndicator Hold;
	private YesNoIndicator Increase;
	private YesNoIndicator InstitutionsOnly;
	private YesNoIndicator NonNegotiable;
	private YesNoIndicator OverTheDay;
	private YesNoIndicator ParticipateDontInitiate;
	private YesNoIndicator PercentOfVolume;
	private YesNoIndicator Scale;
	private StayOnSideTypeCode StayOnSide;
	private YesNoIndicator Work;
	private YesNoIndicator GoAlong;
	private YesNoIndicator TryScale;
	private YesNoIndicator DoNotReduce;
	private YesNoIndicator CancelOnSystemFailure;
	private YesNoIndicator CancelOnTradingHalt;
	private YesNoIndicator TradeAlong;
	private YesNoIndicator StrictLimit;
	private YesNoIndicator IgnorePriceValidityChecks;
	private YesNoIndicator ReinstateOnSystemFailure;
	private YesNoIndicator ReinstateOnTradingHalt;
	private YesNoIndicator CancelIfNotBest;
	private YesNoIndicator ExternalRoutingAllowed;
	private YesNoIndicator ExternalRoutingNotAllowed;
	private YesNoIndicator ImbalanceOnly;
	private YesNoIndicator IntermarketSweep;
	private YesNoIndicator Netting;
	private SecuritiesOrder RelatedOrder;
	private YesNoIndicator ForeignExchangeNetting;
	private YesNoIndicator StrictScale;
	private YesNoIndicator Suspend;
	private YesNoIndicator TryToStop;
	private Discretion OrderPriceStrategy;

	public AllOrNoneIndicator getAllOrNone() {
		return AllOrNone;
	}

	public void setAllOrNone(AllOrNoneIndicator AllOrNone) {
		this.AllOrNone = AllOrNone;
	}

	public YesNoIndicator getCallFirst() {
		return CallFirst;
	}

	public void setCallFirst(YesNoIndicator CallFirst) {
		this.CallFirst = CallFirst;
	}

	public YesNoIndicator getCross() {
		return Cross;
	}

	public void setCross(YesNoIndicator Cross) {
		this.Cross = Cross;
	}

	public YesNoIndicator getCustomerDisplay() {
		return CustomerDisplay;
	}

	public void setCustomerDisplay(YesNoIndicator CustomerDisplay) {
		this.CustomerDisplay = CustomerDisplay;
	}

	public YesNoIndicator getHold() {
		return Hold;
	}

	public void setHold(YesNoIndicator Hold) {
		this.Hold = Hold;
	}

	public YesNoIndicator getIncrease() {
		return Increase;
	}

	public void setIncrease(YesNoIndicator Increase) {
		this.Increase = Increase;
	}

	public YesNoIndicator getInstitutionsOnly() {
		return InstitutionsOnly;
	}

	public void setInstitutionsOnly(YesNoIndicator InstitutionsOnly) {
		this.InstitutionsOnly = InstitutionsOnly;
	}

	public YesNoIndicator getNonNegotiable() {
		return NonNegotiable;
	}

	public void setNonNegotiable(YesNoIndicator NonNegotiable) {
		this.NonNegotiable = NonNegotiable;
	}

	public YesNoIndicator getOverTheDay() {
		return OverTheDay;
	}

	public void setOverTheDay(YesNoIndicator OverTheDay) {
		this.OverTheDay = OverTheDay;
	}

	public YesNoIndicator getParticipateDontInitiate() {
		return ParticipateDontInitiate;
	}

	public void setParticipateDontInitiate(
			YesNoIndicator ParticipateDontInitiate) {
		this.ParticipateDontInitiate = ParticipateDontInitiate;
	}

	public YesNoIndicator getPercentOfVolume() {
		return PercentOfVolume;
	}

	public void setPercentOfVolume(YesNoIndicator PercentOfVolume) {
		this.PercentOfVolume = PercentOfVolume;
	}

	public YesNoIndicator getScale() {
		return Scale;
	}

	public void setScale(YesNoIndicator Scale) {
		this.Scale = Scale;
	}

	public StayOnSideTypeCode getStayOnSide() {
		return StayOnSide;
	}

	public void setStayOnSide(StayOnSideTypeCode StayOnSide) {
		this.StayOnSide = StayOnSide;
	}

	public YesNoIndicator getWork() {
		return Work;
	}

	public void setWork(YesNoIndicator Work) {
		this.Work = Work;
	}

	public YesNoIndicator getGoAlong() {
		return GoAlong;
	}

	public void setGoAlong(YesNoIndicator GoAlong) {
		this.GoAlong = GoAlong;
	}

	public YesNoIndicator getTryScale() {
		return TryScale;
	}

	public void setTryScale(YesNoIndicator TryScale) {
		this.TryScale = TryScale;
	}

	public YesNoIndicator getDoNotReduce() {
		return DoNotReduce;
	}

	public void setDoNotReduce(YesNoIndicator DoNotReduce) {
		this.DoNotReduce = DoNotReduce;
	}

	public YesNoIndicator getCancelOnSystemFailure() {
		return CancelOnSystemFailure;
	}

	public void setCancelOnSystemFailure(YesNoIndicator CancelOnSystemFailure) {
		this.CancelOnSystemFailure = CancelOnSystemFailure;
	}

	public YesNoIndicator getCancelOnTradingHalt() {
		return CancelOnTradingHalt;
	}

	public void setCancelOnTradingHalt(YesNoIndicator CancelOnTradingHalt) {
		this.CancelOnTradingHalt = CancelOnTradingHalt;
	}

	public YesNoIndicator getTradeAlong() {
		return TradeAlong;
	}

	public void setTradeAlong(YesNoIndicator TradeAlong) {
		this.TradeAlong = TradeAlong;
	}

	public YesNoIndicator getStrictLimit() {
		return StrictLimit;
	}

	public void setStrictLimit(YesNoIndicator StrictLimit) {
		this.StrictLimit = StrictLimit;
	}

	public YesNoIndicator getIgnorePriceValidityChecks() {
		return IgnorePriceValidityChecks;
	}

	public void setIgnorePriceValidityChecks(
			YesNoIndicator IgnorePriceValidityChecks) {
		this.IgnorePriceValidityChecks = IgnorePriceValidityChecks;
	}

	public YesNoIndicator getReinstateOnSystemFailure() {
		return ReinstateOnSystemFailure;
	}

	public void setReinstateOnSystemFailure(
			YesNoIndicator ReinstateOnSystemFailure) {
		this.ReinstateOnSystemFailure = ReinstateOnSystemFailure;
	}

	public YesNoIndicator getReinstateOnTradingHalt() {
		return ReinstateOnTradingHalt;
	}

	public void setReinstateOnTradingHalt(YesNoIndicator ReinstateOnTradingHalt) {
		this.ReinstateOnTradingHalt = ReinstateOnTradingHalt;
	}

	public YesNoIndicator getCancelIfNotBest() {
		return CancelIfNotBest;
	}

	public void setCancelIfNotBest(YesNoIndicator CancelIfNotBest) {
		this.CancelIfNotBest = CancelIfNotBest;
	}

	public YesNoIndicator getExternalRoutingAllowed() {
		return ExternalRoutingAllowed;
	}

	public void setExternalRoutingAllowed(YesNoIndicator ExternalRoutingAllowed) {
		this.ExternalRoutingAllowed = ExternalRoutingAllowed;
	}

	public YesNoIndicator getExternalRoutingNotAllowed() {
		return ExternalRoutingNotAllowed;
	}

	public void setExternalRoutingNotAllowed(
			YesNoIndicator ExternalRoutingNotAllowed) {
		this.ExternalRoutingNotAllowed = ExternalRoutingNotAllowed;
	}

	public YesNoIndicator getImbalanceOnly() {
		return ImbalanceOnly;
	}

	public void setImbalanceOnly(YesNoIndicator ImbalanceOnly) {
		this.ImbalanceOnly = ImbalanceOnly;
	}

	public YesNoIndicator getIntermarketSweep() {
		return IntermarketSweep;
	}

	public void setIntermarketSweep(YesNoIndicator IntermarketSweep) {
		this.IntermarketSweep = IntermarketSweep;
	}

	public YesNoIndicator getNetting() {
		return Netting;
	}

	public void setNetting(YesNoIndicator Netting) {
		this.Netting = Netting;
	}

	public SecuritiesOrder getRelatedOrder() {
		return RelatedOrder;
	}

	public void setRelatedOrder(SecuritiesOrder RelatedOrder) {
		this.RelatedOrder = RelatedOrder;
	}

	public YesNoIndicator getForeignExchangeNetting() {
		return ForeignExchangeNetting;
	}

	public void setForeignExchangeNetting(YesNoIndicator ForeignExchangeNetting) {
		this.ForeignExchangeNetting = ForeignExchangeNetting;
	}

	public YesNoIndicator getStrictScale() {
		return StrictScale;
	}

	public void setStrictScale(YesNoIndicator StrictScale) {
		this.StrictScale = StrictScale;
	}

	public YesNoIndicator getSuspend() {
		return Suspend;
	}

	public void setSuspend(YesNoIndicator Suspend) {
		this.Suspend = Suspend;
	}

	public YesNoIndicator getTryToStop() {
		return TryToStop;
	}

	public void setTryToStop(YesNoIndicator TryToStop) {
		this.TryToStop = TryToStop;
	}

	public Discretion getOrderPriceStrategy() {
		return OrderPriceStrategy;
	}

	public void setOrderPriceStrategy(Discretion OrderPriceStrategy) {
		this.OrderPriceStrategy = OrderPriceStrategy;
	}
}