package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CashAccountService;
import com.tools20022.repository.dict.entity.RiskManagementLimit;
import com.tools20022.repository.dict.entity.CashStandingOrder;
import com.tools20022.repository.dict.entity.TransactionAdministrator;
import com.tools20022.repository.dict.entity.LiquidityManagementLimit;
import com.tools20022.repository.dict.codeset.CallInCode;

/**
 * Set of applications that provides services which facilitate the management of
 * cash positions on an account.
 */
public class CashManagementService extends CashAccountService {

	private RiskManagementLimit RiskManagementLimit;
	private CashStandingOrder StandingOrder;
	private TransactionAdministrator RelatedTransactionAdministrator;
	private LiquidityManagementLimit LiquidityManagementLimit;
	private CallInCode CallInType;

	public RiskManagementLimit getRiskManagementLimit() {
		return RiskManagementLimit;
	}

	public void setRiskManagementLimit(RiskManagementLimit RiskManagementLimit) {
		this.RiskManagementLimit = RiskManagementLimit;
	}

	public CashStandingOrder getStandingOrder() {
		return StandingOrder;
	}

	public void setStandingOrder(CashStandingOrder StandingOrder) {
		this.StandingOrder = StandingOrder;
	}

	public TransactionAdministrator getRelatedTransactionAdministrator() {
		return RelatedTransactionAdministrator;
	}

	public void setRelatedTransactionAdministrator(
			TransactionAdministrator RelatedTransactionAdministrator) {
		this.RelatedTransactionAdministrator = RelatedTransactionAdministrator;
	}

	public LiquidityManagementLimit getLiquidityManagementLimit() {
		return LiquidityManagementLimit;
	}

	public void setLiquidityManagementLimit(
			LiquidityManagementLimit LiquidityManagementLimit) {
		this.LiquidityManagementLimit = LiquidityManagementLimit;
	}

	public CallInCode getCallInType() {
		return CallInType;
	}

	public void setCallInType(CallInCode CallInType) {
		this.CallInType = CallInType;
	}
}