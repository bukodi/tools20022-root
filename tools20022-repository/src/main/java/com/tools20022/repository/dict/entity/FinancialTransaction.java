package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.CorporateActionDistribution;
import com.tools20022.repository.dict.entity.InterestManagement;
import com.tools20022.repository.dict.entity.Trade;
import com.tools20022.repository.dict.entity.CollateralMovement;
import com.tools20022.repository.dict.entity.BankingTransaction;
import com.tools20022.repository.dict.entity.RegulatoryReport;

/**
 * Process which includes the order, the execution, the settlement of trades in
 * the financial domain.
 */
public class FinancialTransaction extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CorporateActionDistribution CorporateActionDistribution;
	private InterestManagement InterestManagement;
	private Trade Trade;
	private CollateralMovement CollateralMovement;
	private BankingTransaction BankingTransaction;
	private RegulatoryReport RegulatoryReport;

	public CorporateActionDistribution getCorporateActionDistribution() {
		return CorporateActionDistribution;
	}

	public void setCorporateActionDistribution(
			CorporateActionDistribution CorporateActionDistribution) {
		this.CorporateActionDistribution = CorporateActionDistribution;
	}

	public InterestManagement getInterestManagement() {
		return InterestManagement;
	}

	public void setInterestManagement(InterestManagement InterestManagement) {
		this.InterestManagement = InterestManagement;
	}

	public Trade getTrade() {
		return Trade;
	}

	public void setTrade(Trade Trade) {
		this.Trade = Trade;
	}

	public CollateralMovement getCollateralMovement() {
		return CollateralMovement;
	}

	public void setCollateralMovement(CollateralMovement CollateralMovement) {
		this.CollateralMovement = CollateralMovement;
	}

	public BankingTransaction getBankingTransaction() {
		return BankingTransaction;
	}

	public void setBankingTransaction(BankingTransaction BankingTransaction) {
		this.BankingTransaction = BankingTransaction;
	}

	public RegulatoryReport getRegulatoryReport() {
		return RegulatoryReport;
	}

	public void setRegulatoryReport(RegulatoryReport RegulatoryReport) {
		this.RegulatoryReport = RegulatoryReport;
	}
}