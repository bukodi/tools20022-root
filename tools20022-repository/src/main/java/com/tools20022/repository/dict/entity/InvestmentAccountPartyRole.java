package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.AccountPartyRole;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.InvestmentAccount;
import com.tools20022.repository.dict.codeset.FATCAFormTypeCode;
import com.tools20022.repository.dict.entity.FATCAStatus;
import com.tools20022.repository.dict.entity.CRSStatus;

/**
 * Specifies roles played by a party that are related to an investment account.
 */
public class InvestmentAccountPartyRole extends AccountPartyRole {

	private PercentageRate OwnershipBeneficiaryRate;
	private InvestmentAccount InvestmentAccount;
	private FATCAFormTypeCode FATCAFormType;
	private FATCAStatus FATCAStatus;
	private CRSStatus CRSStatus;

	public PercentageRate getOwnershipBeneficiaryRate() {
		return OwnershipBeneficiaryRate;
	}

	public void setOwnershipBeneficiaryRate(
			PercentageRate OwnershipBeneficiaryRate) {
		this.OwnershipBeneficiaryRate = OwnershipBeneficiaryRate;
	}

	public InvestmentAccount getInvestmentAccount() {
		return InvestmentAccount;
	}

	public void setInvestmentAccount(InvestmentAccount InvestmentAccount) {
		this.InvestmentAccount = InvestmentAccount;
	}

	public FATCAFormTypeCode getFATCAFormType() {
		return FATCAFormType;
	}

	public void setFATCAFormType(FATCAFormTypeCode FATCAFormType) {
		this.FATCAFormType = FATCAFormType;
	}

	public FATCAStatus getFATCAStatus() {
		return FATCAStatus;
	}

	public void setFATCAStatus(FATCAStatus FATCAStatus) {
		this.FATCAStatus = FATCAStatus;
	}

	public CRSStatus getCRSStatus() {
		return CRSStatus;
	}

	public void setCRSStatus(CRSStatus CRSStatus) {
		this.CRSStatus = CRSStatus;
	}
}