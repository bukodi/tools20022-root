package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Agreement;
import com.tools20022.repository.dict.entity.CollateralAgreement;
import com.tools20022.repository.dict.codeset.AgreementFrameworkCode;
import com.tools20022.repository.dict.entity.Trade;
import com.tools20022.repository.dict.entity.Contract;
import com.tools20022.repository.dict.codeset.CountryCode;

/**
 * Agreement which defines the framework of a contract between two trading
 * parties in different domains such as collateral, derivatives, trade..
 */
public class MasterAgreement extends Agreement {

	private CollateralAgreement CollateralAgreement;
	private AgreementFrameworkCode MasterAgreementType;
	private Trade GovernedTrades;
	private Contract GovernedContract;
	private CountryCode GoverningLaw;

	public CollateralAgreement getCollateralAgreement() {
		return CollateralAgreement;
	}

	public void setCollateralAgreement(CollateralAgreement CollateralAgreement) {
		this.CollateralAgreement = CollateralAgreement;
	}

	public AgreementFrameworkCode getMasterAgreementType() {
		return MasterAgreementType;
	}

	public void setMasterAgreementType(
			AgreementFrameworkCode MasterAgreementType) {
		this.MasterAgreementType = MasterAgreementType;
	}

	public Trade getGovernedTrades() {
		return GovernedTrades;
	}

	public void setGovernedTrades(Trade GovernedTrades) {
		this.GovernedTrades = GovernedTrades;
	}

	public Contract getGovernedContract() {
		return GovernedContract;
	}

	public void setGovernedContract(Contract GovernedContract) {
		this.GovernedContract = GovernedContract;
	}

	public CountryCode getGoverningLaw() {
		return GoverningLaw;
	}

	public void setGoverningLaw(CountryCode GoverningLaw) {
		this.GoverningLaw = GoverningLaw;
	}
}