package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.TradePartyRole;
import com.tools20022.repository.dict.codeset.RankCode;
import com.tools20022.repository.dict.codeset.EligibilityCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.InvestorTypeCode;

/**
 * Party that makes investment decisions. Identifies the beneficiary or its
 * broker.
 */
public class InvestorRole extends TradePartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private RankCode IndividualInvestor;
	private RankCode CorporateInvestor;
	private EligibilityCode Capacity;
	private YesNoIndicator InvestorProtectionAssociationMembership;
	private InvestorTypeCode Type;

	public RankCode getIndividualInvestor() {
		return IndividualInvestor;
	}

	public void setIndividualInvestor(RankCode IndividualInvestor) {
		this.IndividualInvestor = IndividualInvestor;
	}

	public RankCode getCorporateInvestor() {
		return CorporateInvestor;
	}

	public void setCorporateInvestor(RankCode CorporateInvestor) {
		this.CorporateInvestor = CorporateInvestor;
	}

	public EligibilityCode getCapacity() {
		return Capacity;
	}

	public void setCapacity(EligibilityCode Capacity) {
		this.Capacity = Capacity;
	}

	public YesNoIndicator getInvestorProtectionAssociationMembership() {
		return InvestorProtectionAssociationMembership;
	}

	public void setInvestorProtectionAssociationMembership(
			YesNoIndicator InvestorProtectionAssociationMembership) {
		this.InvestorProtectionAssociationMembership = InvestorProtectionAssociationMembership;
	}

	public InvestorTypeCode getType() {
		return Type;
	}

	public void setType(InvestorTypeCode Type) {
		this.Type = Type;
	}
}