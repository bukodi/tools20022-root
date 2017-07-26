package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.CollateralValuation;
import com.tools20022.repository.dict.codeset.CollateralTypeCode;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.codeset.CollateralPurposeCode;
import com.tools20022.repository.dict.entity.CollateralBalance;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.CollateralManagement;
import com.tools20022.repository.dict.entity.CollateralPartyRole;
import com.tools20022.repository.dict.entity.CollateralStatus;
import com.tools20022.repository.dict.entity.AssetHolding;
import com.tools20022.repository.dict.entity.CollateralAgreement;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.CollateralSubstitution;

/**
 * Assets pledged by a debtor to secure a loan or an exposure and subject to
 * seizure in the event of default.
 */
public class Collateral {

	private CurrencyAndAmount CollateralAmount;
	private CollateralValuation Valuation;
	private CollateralTypeCode CollateralType;
	private ActiveCurrencyAndAmount BaseCurrencyAmount;
	private CollateralPurposeCode CollateralPurpose;
	private CollateralBalance CollateralBalance;
	private Account CollateralAccount;
	private CollateralManagement CollateralManagement;
	private CollateralPartyRole CollateralPartyRole;
	private CollateralStatus Status;
	private AssetHolding AssetHolding;
	private AssetHolding VariationMarginAssetHolding;
	private AssetHolding SegregatedIndependentAmountAssetHolding;
	private CollateralAgreement CollateralAgreement;
	private Max35Text CollateralOwnership;
	private CollateralSubstitution RelatedCollateralSubstitution;

	public CurrencyAndAmount getCollateralAmount() {
		return CollateralAmount;
	}

	public void setCollateralAmount(CurrencyAndAmount CollateralAmount) {
		this.CollateralAmount = CollateralAmount;
	}

	public CollateralValuation getValuation() {
		return Valuation;
	}

	public void setValuation(CollateralValuation Valuation) {
		this.Valuation = Valuation;
	}

	public CollateralTypeCode getCollateralType() {
		return CollateralType;
	}

	public void setCollateralType(CollateralTypeCode CollateralType) {
		this.CollateralType = CollateralType;
	}

	public ActiveCurrencyAndAmount getBaseCurrencyAmount() {
		return BaseCurrencyAmount;
	}

	public void setBaseCurrencyAmount(ActiveCurrencyAndAmount BaseCurrencyAmount) {
		this.BaseCurrencyAmount = BaseCurrencyAmount;
	}

	public CollateralPurposeCode getCollateralPurpose() {
		return CollateralPurpose;
	}

	public void setCollateralPurpose(CollateralPurposeCode CollateralPurpose) {
		this.CollateralPurpose = CollateralPurpose;
	}

	public CollateralBalance getCollateralBalance() {
		return CollateralBalance;
	}

	public void setCollateralBalance(CollateralBalance CollateralBalance) {
		this.CollateralBalance = CollateralBalance;
	}

	public Account getCollateralAccount() {
		return CollateralAccount;
	}

	public void setCollateralAccount(Account CollateralAccount) {
		this.CollateralAccount = CollateralAccount;
	}

	public CollateralManagement getCollateralManagement() {
		return CollateralManagement;
	}

	public void setCollateralManagement(
			CollateralManagement CollateralManagement) {
		this.CollateralManagement = CollateralManagement;
	}

	public CollateralPartyRole getCollateralPartyRole() {
		return CollateralPartyRole;
	}

	public void setCollateralPartyRole(CollateralPartyRole CollateralPartyRole) {
		this.CollateralPartyRole = CollateralPartyRole;
	}

	public CollateralStatus getStatus() {
		return Status;
	}

	public void setStatus(CollateralStatus Status) {
		this.Status = Status;
	}

	public AssetHolding getAssetHolding() {
		return AssetHolding;
	}

	public void setAssetHolding(AssetHolding AssetHolding) {
		this.AssetHolding = AssetHolding;
	}

	public AssetHolding getVariationMarginAssetHolding() {
		return VariationMarginAssetHolding;
	}

	public void setVariationMarginAssetHolding(
			AssetHolding VariationMarginAssetHolding) {
		this.VariationMarginAssetHolding = VariationMarginAssetHolding;
	}

	public AssetHolding getSegregatedIndependentAmountAssetHolding() {
		return SegregatedIndependentAmountAssetHolding;
	}

	public void setSegregatedIndependentAmountAssetHolding(
			AssetHolding SegregatedIndependentAmountAssetHolding) {
		this.SegregatedIndependentAmountAssetHolding = SegregatedIndependentAmountAssetHolding;
	}

	public CollateralAgreement getCollateralAgreement() {
		return CollateralAgreement;
	}

	public void setCollateralAgreement(CollateralAgreement CollateralAgreement) {
		this.CollateralAgreement = CollateralAgreement;
	}

	public Max35Text getCollateralOwnership() {
		return CollateralOwnership;
	}

	public void setCollateralOwnership(Max35Text CollateralOwnership) {
		this.CollateralOwnership = CollateralOwnership;
	}

	public CollateralSubstitution getRelatedCollateralSubstitution() {
		return RelatedCollateralSubstitution;
	}

	public void setRelatedCollateralSubstitution(
			CollateralSubstitution RelatedCollateralSubstitution) {
		this.RelatedCollateralSubstitution = RelatedCollateralSubstitution;
	}
}