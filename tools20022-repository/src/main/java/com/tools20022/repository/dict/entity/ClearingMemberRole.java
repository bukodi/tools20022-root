package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SystemPartyRole;
import com.tools20022.repository.dict.entity.CashClearingSystemMember;
import com.tools20022.repository.dict.codeset.ClearingSideCode;
import com.tools20022.repository.dict.entity.SecuritiesAccount;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.ClearingMemberRole;

/**
 * Member of an exchange's clearing corporation, responsible for executing
 * client trades and involved in the clearing of trades.
 */
public class ClearingMemberRole extends SystemPartyRole {

	private CashClearingSystemMember ClearingSystemMemberIdentification;
	private ClearingSideCode Side;
	private SecuritiesAccount ClearingAccount;
	private SecuritiesAccount MarginAccount;
	private SecuritiesAccount DeliveryAccount;
	private Account DefaultFundAccount;
	private ClearingMemberRole ClearingSegment;
	private ClearingMemberRole RelatedClearingMemberRole;

	public CashClearingSystemMember getClearingSystemMemberIdentification() {
		return ClearingSystemMemberIdentification;
	}

	public void setClearingSystemMemberIdentification(
			CashClearingSystemMember ClearingSystemMemberIdentification) {
		this.ClearingSystemMemberIdentification = ClearingSystemMemberIdentification;
	}

	public ClearingSideCode getSide() {
		return Side;
	}

	public void setSide(ClearingSideCode Side) {
		this.Side = Side;
	}

	public SecuritiesAccount getClearingAccount() {
		return ClearingAccount;
	}

	public void setClearingAccount(SecuritiesAccount ClearingAccount) {
		this.ClearingAccount = ClearingAccount;
	}

	public SecuritiesAccount getMarginAccount() {
		return MarginAccount;
	}

	public void setMarginAccount(SecuritiesAccount MarginAccount) {
		this.MarginAccount = MarginAccount;
	}

	public SecuritiesAccount getDeliveryAccount() {
		return DeliveryAccount;
	}

	public void setDeliveryAccount(SecuritiesAccount DeliveryAccount) {
		this.DeliveryAccount = DeliveryAccount;
	}

	public Account getDefaultFundAccount() {
		return DefaultFundAccount;
	}

	public void setDefaultFundAccount(Account DefaultFundAccount) {
		this.DefaultFundAccount = DefaultFundAccount;
	}

	public ClearingMemberRole getClearingSegment() {
		return ClearingSegment;
	}

	public void setClearingSegment(ClearingMemberRole ClearingSegment) {
		this.ClearingSegment = ClearingSegment;
	}

	public ClearingMemberRole getRelatedClearingMemberRole() {
		return RelatedClearingMemberRole;
	}

	public void setRelatedClearingMemberRole(
			ClearingMemberRole RelatedClearingMemberRole) {
		this.RelatedClearingMemberRole = RelatedClearingMemberRole;
	}
}