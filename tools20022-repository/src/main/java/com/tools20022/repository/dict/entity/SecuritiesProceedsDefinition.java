package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.ProceedsDefinition;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.QuantityRatio;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.IntermediateSecurityDistributionTypeCode;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.ShareRankingCode;

/**
 * The definition of the securities proceeds for a corporate action in generic
 * terms; that is, before applying it to specific securities holding. An example
 * would be the definition of a bonus rights issue where all the information
 * will be given in general on a per share basis.
 */
public class SecuritiesProceedsDefinition extends ProceedsDefinition
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesQuantity SecuritiesQuantity;
	private SecuritiesQuantity ConditionalQuantity;
	private SecuritiesQuantity OverAndAboveNormalEnsuredEntitlementQuantity;
	private SecuritiesQuantity QuantityToReceive;
	private SecuritiesQuantity StatusQuantity;
	private DateTimePeriod ParallelTradingPeriod;
	private QuantityRatio AdditionalQuantityForSubscribedResultantSecurities;
	private QuantityRatio AdditionalQuantityForExistingSecurities;
	private QuantityRatio NewToOld;
	private QuantityRatio NewSecuritiesToUnderlyingSecurities;
	private CurrencyAndAmount ReinvestmentAmount;
	private IntermediateSecurityDistributionTypeCode IntermediateSecuritiesDistributionType;
	private SecuritiesQuantity BoardLotSecuritiesQuantity;
	private SecuritiesQuantity NewDenominationSecuritiesQuantity;
	private QuantityRatio IntermediateSecuritiesToUnderlyingRatio;
	private PercentageRate ReinvestmentDiscountToMarket;
	private ISODateTime RedemptionDate;
	private DateTimePeriod AssentedLinePeriod;
	private DateTimePeriod SellThruIssuerPeriod;
	private ShareRankingCode ShareRanking;

	public SecuritiesQuantity getSecuritiesQuantity() {
		return SecuritiesQuantity;
	}

	public void setSecuritiesQuantity(SecuritiesQuantity SecuritiesQuantity) {
		this.SecuritiesQuantity = SecuritiesQuantity;
	}

	public SecuritiesQuantity getConditionalQuantity() {
		return ConditionalQuantity;
	}

	public void setConditionalQuantity(SecuritiesQuantity ConditionalQuantity) {
		this.ConditionalQuantity = ConditionalQuantity;
	}

	public SecuritiesQuantity getOverAndAboveNormalEnsuredEntitlementQuantity() {
		return OverAndAboveNormalEnsuredEntitlementQuantity;
	}

	public void setOverAndAboveNormalEnsuredEntitlementQuantity(
			SecuritiesQuantity OverAndAboveNormalEnsuredEntitlementQuantity) {
		this.OverAndAboveNormalEnsuredEntitlementQuantity = OverAndAboveNormalEnsuredEntitlementQuantity;
	}

	public SecuritiesQuantity getQuantityToReceive() {
		return QuantityToReceive;
	}

	public void setQuantityToReceive(SecuritiesQuantity QuantityToReceive) {
		this.QuantityToReceive = QuantityToReceive;
	}

	public SecuritiesQuantity getStatusQuantity() {
		return StatusQuantity;
	}

	public void setStatusQuantity(SecuritiesQuantity StatusQuantity) {
		this.StatusQuantity = StatusQuantity;
	}

	public DateTimePeriod getParallelTradingPeriod() {
		return ParallelTradingPeriod;
	}

	public void setParallelTradingPeriod(DateTimePeriod ParallelTradingPeriod) {
		this.ParallelTradingPeriod = ParallelTradingPeriod;
	}

	public QuantityRatio getAdditionalQuantityForSubscribedResultantSecurities() {
		return AdditionalQuantityForSubscribedResultantSecurities;
	}

	public void setAdditionalQuantityForSubscribedResultantSecurities(
			QuantityRatio AdditionalQuantityForSubscribedResultantSecurities) {
		this.AdditionalQuantityForSubscribedResultantSecurities = AdditionalQuantityForSubscribedResultantSecurities;
	}

	public QuantityRatio getAdditionalQuantityForExistingSecurities() {
		return AdditionalQuantityForExistingSecurities;
	}

	public void setAdditionalQuantityForExistingSecurities(
			QuantityRatio AdditionalQuantityForExistingSecurities) {
		this.AdditionalQuantityForExistingSecurities = AdditionalQuantityForExistingSecurities;
	}

	public QuantityRatio getNewToOld() {
		return NewToOld;
	}

	public void setNewToOld(QuantityRatio NewToOld) {
		this.NewToOld = NewToOld;
	}

	public QuantityRatio getNewSecuritiesToUnderlyingSecurities() {
		return NewSecuritiesToUnderlyingSecurities;
	}

	public void setNewSecuritiesToUnderlyingSecurities(
			QuantityRatio NewSecuritiesToUnderlyingSecurities) {
		this.NewSecuritiesToUnderlyingSecurities = NewSecuritiesToUnderlyingSecurities;
	}

	public CurrencyAndAmount getReinvestmentAmount() {
		return ReinvestmentAmount;
	}

	public void setReinvestmentAmount(CurrencyAndAmount ReinvestmentAmount) {
		this.ReinvestmentAmount = ReinvestmentAmount;
	}

	public IntermediateSecurityDistributionTypeCode getIntermediateSecuritiesDistributionType() {
		return IntermediateSecuritiesDistributionType;
	}

	public void setIntermediateSecuritiesDistributionType(
			IntermediateSecurityDistributionTypeCode IntermediateSecuritiesDistributionType) {
		this.IntermediateSecuritiesDistributionType = IntermediateSecuritiesDistributionType;
	}

	public SecuritiesQuantity getBoardLotSecuritiesQuantity() {
		return BoardLotSecuritiesQuantity;
	}

	public void setBoardLotSecuritiesQuantity(
			SecuritiesQuantity BoardLotSecuritiesQuantity) {
		this.BoardLotSecuritiesQuantity = BoardLotSecuritiesQuantity;
	}

	public SecuritiesQuantity getNewDenominationSecuritiesQuantity() {
		return NewDenominationSecuritiesQuantity;
	}

	public void setNewDenominationSecuritiesQuantity(
			SecuritiesQuantity NewDenominationSecuritiesQuantity) {
		this.NewDenominationSecuritiesQuantity = NewDenominationSecuritiesQuantity;
	}

	public QuantityRatio getIntermediateSecuritiesToUnderlyingRatio() {
		return IntermediateSecuritiesToUnderlyingRatio;
	}

	public void setIntermediateSecuritiesToUnderlyingRatio(
			QuantityRatio IntermediateSecuritiesToUnderlyingRatio) {
		this.IntermediateSecuritiesToUnderlyingRatio = IntermediateSecuritiesToUnderlyingRatio;
	}

	public PercentageRate getReinvestmentDiscountToMarket() {
		return ReinvestmentDiscountToMarket;
	}

	public void setReinvestmentDiscountToMarket(
			PercentageRate ReinvestmentDiscountToMarket) {
		this.ReinvestmentDiscountToMarket = ReinvestmentDiscountToMarket;
	}

	public ISODateTime getRedemptionDate() {
		return RedemptionDate;
	}

	public void setRedemptionDate(ISODateTime RedemptionDate) {
		this.RedemptionDate = RedemptionDate;
	}

	public DateTimePeriod getAssentedLinePeriod() {
		return AssentedLinePeriod;
	}

	public void setAssentedLinePeriod(DateTimePeriod AssentedLinePeriod) {
		this.AssentedLinePeriod = AssentedLinePeriod;
	}

	public DateTimePeriod getSellThruIssuerPeriod() {
		return SellThruIssuerPeriod;
	}

	public void setSellThruIssuerPeriod(DateTimePeriod SellThruIssuerPeriod) {
		this.SellThruIssuerPeriod = SellThruIssuerPeriod;
	}

	public ShareRankingCode getShareRanking() {
		return ShareRanking;
	}

	public void setShareRanking(ShareRankingCode ShareRanking) {
		this.ShareRanking = ShareRanking;
	}
}