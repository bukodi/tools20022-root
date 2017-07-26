package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.Exact3NumericText;
import com.tools20022.repository.dict.codeset.CorporateActionOptionCode;
import com.tools20022.repository.dict.codeset.FractionDispositionTypeCode;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.ChoiceCorporateAction;
import com.tools20022.repository.dict.entity.CorporateActionElection;
import com.tools20022.repository.dict.codeset.OptionFeaturesCode;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.codeset.OfferTypeV2Code;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.CorporateActionOptionServicing;
import com.tools20022.repository.dict.entity.ProceedsDefinition;
import com.tools20022.repository.dict.entity.CorporateActionDistribution;

/**
 * Provides information about the alternatives available to an account owner
 * when participating to a corporate action event. This is defined at a general
 * level without looking at the specificities of the securities balances.
 */
public class CorporateActionOption {

	private Exact3NumericText OptionNumber;
	private CorporateActionOptionCode OptionType;
	private FractionDispositionTypeCode FractionDisposition;
	private CurrencyCode CurrencyOption;
	private ChoiceCorporateAction RelatedChoiceCorporateAction;
	private CorporateActionElection CorporateActionElection;
	private OptionFeaturesCode OptionFeatures;
	private DateTimePeriod ActionPeriod;
	private OfferTypeV2Code OfferType;
	private YesNoIndicator ChargesAppliedIndicator;
	private YesNoIndicator WithdrawalAllowedIndicator;
	private YesNoIndicator ChangeAllowedIndicator;
	private CorporateActionOptionServicing CorporateActionOptionServicing;
	private ProceedsDefinition ProceedsDefinition;
	private CorporateActionDistribution Distribution;
	private YesNoIndicator Default;

	public Exact3NumericText getOptionNumber() {
		return OptionNumber;
	}

	public void setOptionNumber(Exact3NumericText OptionNumber) {
		this.OptionNumber = OptionNumber;
	}

	public CorporateActionOptionCode getOptionType() {
		return OptionType;
	}

	public void setOptionType(CorporateActionOptionCode OptionType) {
		this.OptionType = OptionType;
	}

	public FractionDispositionTypeCode getFractionDisposition() {
		return FractionDisposition;
	}

	public void setFractionDisposition(
			FractionDispositionTypeCode FractionDisposition) {
		this.FractionDisposition = FractionDisposition;
	}

	public CurrencyCode getCurrencyOption() {
		return CurrencyOption;
	}

	public void setCurrencyOption(CurrencyCode CurrencyOption) {
		this.CurrencyOption = CurrencyOption;
	}

	public ChoiceCorporateAction getRelatedChoiceCorporateAction() {
		return RelatedChoiceCorporateAction;
	}

	public void setRelatedChoiceCorporateAction(
			ChoiceCorporateAction RelatedChoiceCorporateAction) {
		this.RelatedChoiceCorporateAction = RelatedChoiceCorporateAction;
	}

	public CorporateActionElection getCorporateActionElection() {
		return CorporateActionElection;
	}

	public void setCorporateActionElection(
			CorporateActionElection CorporateActionElection) {
		this.CorporateActionElection = CorporateActionElection;
	}

	public OptionFeaturesCode getOptionFeatures() {
		return OptionFeatures;
	}

	public void setOptionFeatures(OptionFeaturesCode OptionFeatures) {
		this.OptionFeatures = OptionFeatures;
	}

	public DateTimePeriod getActionPeriod() {
		return ActionPeriod;
	}

	public void setActionPeriod(DateTimePeriod ActionPeriod) {
		this.ActionPeriod = ActionPeriod;
	}

	public OfferTypeV2Code getOfferType() {
		return OfferType;
	}

	public void setOfferType(OfferTypeV2Code OfferType) {
		this.OfferType = OfferType;
	}

	public YesNoIndicator getChargesAppliedIndicator() {
		return ChargesAppliedIndicator;
	}

	public void setChargesAppliedIndicator(
			YesNoIndicator ChargesAppliedIndicator) {
		this.ChargesAppliedIndicator = ChargesAppliedIndicator;
	}

	public YesNoIndicator getWithdrawalAllowedIndicator() {
		return WithdrawalAllowedIndicator;
	}

	public void setWithdrawalAllowedIndicator(
			YesNoIndicator WithdrawalAllowedIndicator) {
		this.WithdrawalAllowedIndicator = WithdrawalAllowedIndicator;
	}

	public YesNoIndicator getChangeAllowedIndicator() {
		return ChangeAllowedIndicator;
	}

	public void setChangeAllowedIndicator(YesNoIndicator ChangeAllowedIndicator) {
		this.ChangeAllowedIndicator = ChangeAllowedIndicator;
	}

	public CorporateActionOptionServicing getCorporateActionOptionServicing() {
		return CorporateActionOptionServicing;
	}

	public void setCorporateActionOptionServicing(
			CorporateActionOptionServicing CorporateActionOptionServicing) {
		this.CorporateActionOptionServicing = CorporateActionOptionServicing;
	}

	public ProceedsDefinition getProceedsDefinition() {
		return ProceedsDefinition;
	}

	public void setProceedsDefinition(ProceedsDefinition ProceedsDefinition) {
		this.ProceedsDefinition = ProceedsDefinition;
	}

	public CorporateActionDistribution getDistribution() {
		return Distribution;
	}

	public void setDistribution(CorporateActionDistribution Distribution) {
		this.Distribution = Distribution;
	}

	public YesNoIndicator getDefault() {
		return Default;
	}

	public void setDefault(YesNoIndicator Default) {
		this.Default = Default;
	}
}