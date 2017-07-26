package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.TransferInInstructionV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Transfer3;
import com.tools20022.repository.dict.msg.FinancialInstrument3;
import com.tools20022.repository.dict.msg.InvestmentAccount10;
import com.tools20022.repository.dict.msg.DeliverInformation1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The TransferInInstruction message is sent by an instructing party, or
 * an instructing party's designated agent, to the executing party. This message
 * is used to instruct the receipt of a financial instrument, free of payment,
 * at a given date, from a specified party. This message may also be used to
 * instruct the receipt of a financial instrument from an own account or from a
 * third party. Usage The TransferInInstruction message is used by an
 * instructing party to instruct the executing party to receive a financial
 * instrument from another account, either owned by the instructing party or by
 * a third party.
 */
@NextVersion(TransferInInstructionV02.class)
public class TransferInInstruction {

	private Optional<AdditionalReference2> PoolReference;
	private Optional<AdditionalReference2> PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Transfer3 TransferDetails;
	private FinancialInstrument3 FinancialInstrumentDetails;
	private InvestmentAccount10 AccountDetails;
	private DeliverInformation1 SettlementDetails;
	private Optional<Extension1> Extension;

	public Optional<AdditionalReference2> getPoolReference() {
		return PoolReference;
	}

	public void setPoolReference(Optional<AdditionalReference2> PoolReference) {
		this.PoolReference = PoolReference;
	}

	public Optional<AdditionalReference2> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference2> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference2> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference2> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public Transfer3 getTransferDetails() {
		return TransferDetails;
	}

	public void setTransferDetails(Transfer3 TransferDetails) {
		this.TransferDetails = TransferDetails;
	}

	public FinancialInstrument3 getFinancialInstrumentDetails() {
		return FinancialInstrumentDetails;
	}

	public void setFinancialInstrumentDetails(
			FinancialInstrument3 FinancialInstrumentDetails) {
		this.FinancialInstrumentDetails = FinancialInstrumentDetails;
	}

	public InvestmentAccount10 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(InvestmentAccount10 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public DeliverInformation1 getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(DeliverInformation1 SettlementDetails) {
		this.SettlementDetails = SettlementDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}