package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.Max4AlphaNumericText;
import com.tools20022.repository.dict.entity.Trade;
import com.tools20022.repository.dict.entity.TransactionRisk;
import com.tools20022.repository.dict.entity.Obligation;
import com.tools20022.repository.dict.entity.ObligationFulfilment;
import com.tools20022.repository.dict.codeset.ExposureTypeV2Code;

/**
 * Specifies the assets (quantity of securities, goods, services, and cash
 * amounts) that have to be delivered.
 */
public class Obligation extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ISODateTime RequestedSettlementDate;
	private CurrencyAndAmount RequestedSettlementAmount;
	private Max4AlphaNumericText Priority;
	private Trade Trade;
	private TransactionRisk TransactionRisk;
	private Obligation ParentObligation;
	private Obligation SubObligation;
	private ObligationFulfilment Offset;
	private ObligationFulfilment OriginalObligationProcess;
	private ExposureTypeV2Code ExposureType;

	public ISODateTime getRequestedSettlementDate() {
		return RequestedSettlementDate;
	}

	public void setRequestedSettlementDate(ISODateTime RequestedSettlementDate) {
		this.RequestedSettlementDate = RequestedSettlementDate;
	}

	public CurrencyAndAmount getRequestedSettlementAmount() {
		return RequestedSettlementAmount;
	}

	public void setRequestedSettlementAmount(
			CurrencyAndAmount RequestedSettlementAmount) {
		this.RequestedSettlementAmount = RequestedSettlementAmount;
	}

	public Max4AlphaNumericText getPriority() {
		return Priority;
	}

	public void setPriority(Max4AlphaNumericText Priority) {
		this.Priority = Priority;
	}

	public Trade getTrade() {
		return Trade;
	}

	public void setTrade(Trade Trade) {
		this.Trade = Trade;
	}

	public TransactionRisk getTransactionRisk() {
		return TransactionRisk;
	}

	public void setTransactionRisk(TransactionRisk TransactionRisk) {
		this.TransactionRisk = TransactionRisk;
	}

	public Obligation getParentObligation() {
		return ParentObligation;
	}

	public void setParentObligation(Obligation ParentObligation) {
		this.ParentObligation = ParentObligation;
	}

	public Obligation getSubObligation() {
		return SubObligation;
	}

	public void setSubObligation(Obligation SubObligation) {
		this.SubObligation = SubObligation;
	}

	public ObligationFulfilment getOffset() {
		return Offset;
	}

	public void setOffset(ObligationFulfilment Offset) {
		this.Offset = Offset;
	}

	public ObligationFulfilment getOriginalObligationProcess() {
		return OriginalObligationProcess;
	}

	public void setOriginalObligationProcess(
			ObligationFulfilment OriginalObligationProcess) {
		this.OriginalObligationProcess = OriginalObligationProcess;
	}

	public ExposureTypeV2Code getExposureType() {
		return ExposureType;
	}

	public void setExposureType(ExposureTypeV2Code ExposureType) {
		this.ExposureType = ExposureType;
	}
}