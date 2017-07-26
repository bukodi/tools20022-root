package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Obligation;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.CorporateActionProceedsDeliveryInstruction;
import com.tools20022.repository.dict.entity.CollateralMovement;
import com.tools20022.repository.dict.entity.SecuritiesTradeExecution;
import com.tools20022.repository.dict.entity.PortfolioTransfer;
import com.tools20022.repository.dict.entity.SecuritiesTransfer;
import com.tools20022.repository.dict.codeset.SettlementDateCode;
import com.tools20022.repository.dict.entity.SecuritiesLending;

/**
 * Obligation for one party to deliver securities to another party.
 */
public class SecuritiesDeliveryObligation extends Obligation {

	private YesNoIndicator CCPEligibility;
	private YesNoIndicator NettingEligibility;
	private ISODateTime TransferInstructionDate;
	private CurrencyCode TransferCurrency;
	private CorporateActionProceedsDeliveryInstruction RelatedCorporateAction;
	private CollateralMovement RelatedCollateralMovement;
	private SecuritiesTradeExecution SecuritiesTradeExecution;
	private PortfolioTransfer RelatedPortfolioTransfer;
	private SecuritiesTransfer SecuritiesTransfer;
	private YesNoIndicator SettlementInstructionGeneration;
	private SettlementDateCode SettlementDateCode;
	private SecuritiesLending SecuritiesLending;

	public YesNoIndicator getCCPEligibility() {
		return CCPEligibility;
	}

	public void setCCPEligibility(YesNoIndicator CCPEligibility) {
		this.CCPEligibility = CCPEligibility;
	}

	public YesNoIndicator getNettingEligibility() {
		return NettingEligibility;
	}

	public void setNettingEligibility(YesNoIndicator NettingEligibility) {
		this.NettingEligibility = NettingEligibility;
	}

	public ISODateTime getTransferInstructionDate() {
		return TransferInstructionDate;
	}

	public void setTransferInstructionDate(ISODateTime TransferInstructionDate) {
		this.TransferInstructionDate = TransferInstructionDate;
	}

	public CurrencyCode getTransferCurrency() {
		return TransferCurrency;
	}

	public void setTransferCurrency(CurrencyCode TransferCurrency) {
		this.TransferCurrency = TransferCurrency;
	}

	public CorporateActionProceedsDeliveryInstruction getRelatedCorporateAction() {
		return RelatedCorporateAction;
	}

	public void setRelatedCorporateAction(
			CorporateActionProceedsDeliveryInstruction RelatedCorporateAction) {
		this.RelatedCorporateAction = RelatedCorporateAction;
	}

	public CollateralMovement getRelatedCollateralMovement() {
		return RelatedCollateralMovement;
	}

	public void setRelatedCollateralMovement(
			CollateralMovement RelatedCollateralMovement) {
		this.RelatedCollateralMovement = RelatedCollateralMovement;
	}

	public SecuritiesTradeExecution getSecuritiesTradeExecution() {
		return SecuritiesTradeExecution;
	}

	public void setSecuritiesTradeExecution(
			SecuritiesTradeExecution SecuritiesTradeExecution) {
		this.SecuritiesTradeExecution = SecuritiesTradeExecution;
	}

	public PortfolioTransfer getRelatedPortfolioTransfer() {
		return RelatedPortfolioTransfer;
	}

	public void setRelatedPortfolioTransfer(
			PortfolioTransfer RelatedPortfolioTransfer) {
		this.RelatedPortfolioTransfer = RelatedPortfolioTransfer;
	}

	public SecuritiesTransfer getSecuritiesTransfer() {
		return SecuritiesTransfer;
	}

	public void setSecuritiesTransfer(SecuritiesTransfer SecuritiesTransfer) {
		this.SecuritiesTransfer = SecuritiesTransfer;
	}

	public YesNoIndicator getSettlementInstructionGeneration() {
		return SettlementInstructionGeneration;
	}

	public void setSettlementInstructionGeneration(
			YesNoIndicator SettlementInstructionGeneration) {
		this.SettlementInstructionGeneration = SettlementInstructionGeneration;
	}

	public SettlementDateCode getSettlementDateCode() {
		return SettlementDateCode;
	}

	public void setSettlementDateCode(SettlementDateCode SettlementDateCode) {
		this.SettlementDateCode = SettlementDateCode;
	}

	public SecuritiesLending getSecuritiesLending() {
		return SecuritiesLending;
	}

	public void setSecuritiesLending(SecuritiesLending SecuritiesLending) {
		this.SecuritiesLending = SecuritiesLending;
	}
}