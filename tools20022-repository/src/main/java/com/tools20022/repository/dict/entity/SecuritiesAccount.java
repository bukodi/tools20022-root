package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.codeset.SecuritiesAccountPurposeTypeCode;
import com.tools20022.repository.dict.entity.InvestmentAccount;
import com.tools20022.repository.dict.entity.SecuritiesTransfer;
import com.tools20022.repository.dict.entity.SecuritiesPartyRole;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.entity.RegistrarRole;
import com.tools20022.repository.dict.entity.SafekeepingPlace;
import com.tools20022.repository.dict.entity.SecuritiesBalance;
import com.tools20022.repository.dict.entity.CorporateActionServicing;
import com.tools20022.repository.dict.entity.Allocation;
import com.tools20022.repository.dict.entity.SecuritiesEntry;
import com.tools20022.repository.dict.entity.ClearingMemberRole;
import com.tools20022.repository.dict.entity.PowerOfAttorney;
import com.tools20022.repository.dict.entity.InstructionForMeeting;
import com.tools20022.repository.dict.codeset.ClearingAccountTypeCode;
import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.entity.DisclosedListTrading;
import com.tools20022.repository.dict.entity.AccountLink;

/**
 * Account to or from which a securities entry is made.
 */
public class SecuritiesAccount extends Account
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesAccountPurposeTypeCode SecuritiesAccountType;
	private InvestmentAccount RelatedInvestmentAccount;
	private SecuritiesTransfer RelatedTransfer;
	private SecuritiesPartyRole SecuritiesPartyRole;
	private Security Security;
	private RegistrarRole RelatedRegistrar;
	private SafekeepingPlace SafekeepingPlace;
	private SecuritiesBalance SecuritiesBalance;
	private CorporateActionServicing CorporateActionServicing;
	private Allocation RelatedAllocation;
	private SecuritiesEntry SecuritiesEntry;
	private ClearingMemberRole ClearingAccountOwner;
	private ClearingMemberRole MarginAccountOwner;
	private ClearingMemberRole DeliveryAccountOwner;
	private PowerOfAttorney RelatedPowerOfAttorney;
	private InstructionForMeeting RelatedMeetingInstruction;
	private ClearingAccountTypeCode ClearingAccountType;
	private SecuritiesOrder RelatedOrder;
	private DisclosedListTrading DisclosedListTrading;
	private AccountLink AccountLink;

	public SecuritiesAccountPurposeTypeCode getSecuritiesAccountType() {
		return SecuritiesAccountType;
	}

	public void setSecuritiesAccountType(
			SecuritiesAccountPurposeTypeCode SecuritiesAccountType) {
		this.SecuritiesAccountType = SecuritiesAccountType;
	}

	public InvestmentAccount getRelatedInvestmentAccount() {
		return RelatedInvestmentAccount;
	}

	public void setRelatedInvestmentAccount(
			InvestmentAccount RelatedInvestmentAccount) {
		this.RelatedInvestmentAccount = RelatedInvestmentAccount;
	}

	public SecuritiesTransfer getRelatedTransfer() {
		return RelatedTransfer;
	}

	public void setRelatedTransfer(SecuritiesTransfer RelatedTransfer) {
		this.RelatedTransfer = RelatedTransfer;
	}

	public SecuritiesPartyRole getSecuritiesPartyRole() {
		return SecuritiesPartyRole;
	}

	public void setSecuritiesPartyRole(SecuritiesPartyRole SecuritiesPartyRole) {
		this.SecuritiesPartyRole = SecuritiesPartyRole;
	}

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public RegistrarRole getRelatedRegistrar() {
		return RelatedRegistrar;
	}

	public void setRelatedRegistrar(RegistrarRole RelatedRegistrar) {
		this.RelatedRegistrar = RelatedRegistrar;
	}

	public SafekeepingPlace getSafekeepingPlace() {
		return SafekeepingPlace;
	}

	public void setSafekeepingPlace(SafekeepingPlace SafekeepingPlace) {
		this.SafekeepingPlace = SafekeepingPlace;
	}

	public SecuritiesBalance getSecuritiesBalance() {
		return SecuritiesBalance;
	}

	public void setSecuritiesBalance(SecuritiesBalance SecuritiesBalance) {
		this.SecuritiesBalance = SecuritiesBalance;
	}

	public CorporateActionServicing getCorporateActionServicing() {
		return CorporateActionServicing;
	}

	public void setCorporateActionServicing(
			CorporateActionServicing CorporateActionServicing) {
		this.CorporateActionServicing = CorporateActionServicing;
	}

	public Allocation getRelatedAllocation() {
		return RelatedAllocation;
	}

	public void setRelatedAllocation(Allocation RelatedAllocation) {
		this.RelatedAllocation = RelatedAllocation;
	}

	public SecuritiesEntry getSecuritiesEntry() {
		return SecuritiesEntry;
	}

	public void setSecuritiesEntry(SecuritiesEntry SecuritiesEntry) {
		this.SecuritiesEntry = SecuritiesEntry;
	}

	public ClearingMemberRole getClearingAccountOwner() {
		return ClearingAccountOwner;
	}

	public void setClearingAccountOwner(ClearingMemberRole ClearingAccountOwner) {
		this.ClearingAccountOwner = ClearingAccountOwner;
	}

	public ClearingMemberRole getMarginAccountOwner() {
		return MarginAccountOwner;
	}

	public void setMarginAccountOwner(ClearingMemberRole MarginAccountOwner) {
		this.MarginAccountOwner = MarginAccountOwner;
	}

	public ClearingMemberRole getDeliveryAccountOwner() {
		return DeliveryAccountOwner;
	}

	public void setDeliveryAccountOwner(ClearingMemberRole DeliveryAccountOwner) {
		this.DeliveryAccountOwner = DeliveryAccountOwner;
	}

	public PowerOfAttorney getRelatedPowerOfAttorney() {
		return RelatedPowerOfAttorney;
	}

	public void setRelatedPowerOfAttorney(PowerOfAttorney RelatedPowerOfAttorney) {
		this.RelatedPowerOfAttorney = RelatedPowerOfAttorney;
	}

	public InstructionForMeeting getRelatedMeetingInstruction() {
		return RelatedMeetingInstruction;
	}

	public void setRelatedMeetingInstruction(
			InstructionForMeeting RelatedMeetingInstruction) {
		this.RelatedMeetingInstruction = RelatedMeetingInstruction;
	}

	public ClearingAccountTypeCode getClearingAccountType() {
		return ClearingAccountType;
	}

	public void setClearingAccountType(
			ClearingAccountTypeCode ClearingAccountType) {
		this.ClearingAccountType = ClearingAccountType;
	}

	public SecuritiesOrder getRelatedOrder() {
		return RelatedOrder;
	}

	public void setRelatedOrder(SecuritiesOrder RelatedOrder) {
		this.RelatedOrder = RelatedOrder;
	}

	public DisclosedListTrading getDisclosedListTrading() {
		return DisclosedListTrading;
	}

	public void setDisclosedListTrading(
			DisclosedListTrading DisclosedListTrading) {
		this.DisclosedListTrading = DisclosedListTrading;
	}

	public AccountLink getAccountLink() {
		return AccountLink;
	}

	public void setAccountLink(AccountLink AccountLink) {
		this.AccountLink = AccountLink;
	}
}