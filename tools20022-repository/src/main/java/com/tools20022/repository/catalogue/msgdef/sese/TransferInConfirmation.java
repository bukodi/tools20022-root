package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInConfirmationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Transfer4;
import com.tools20022.repository.dict.msg.FinancialInstrument3;
import com.tools20022.repository.dict.msg.InvestmentAccount10;
import com.tools20022.repository.dict.msg.DeliverInformation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope TheTransferInConfirmation message is sent by an executing party to the
 * instructing party or the instructing party's designated agent. This message
 * is used to confirm the receipt of a financial instrument, free of payment, at
 * a given date, from a specified party. This message can also be used to
 * confirm the transfer a financial instrument from an own account or from a
 * third party. Usage TheTransferInConfirmation message is used by an executing
 * party to confirm to the instructing party receipt of a financial instrument,
 * either from another account owned by the instructing party or from a third
 * party.
 */
@NextVersion(TransferInConfirmationV02.class)
public class TransferInConfirmation
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private AdditionalReference2 RelatedReference;
	private Optional<AdditionalReference2> PoolReference;
	private Optional<AdditionalReference2> PreviousReference;
	private Transfer4 TransferDetails;
	private FinancialInstrument3 FinancialInstrumentDetails;
	private InvestmentAccount10 AccountDetails;
	private DeliverInformation2 SettlementDetails;
	private Optional<Extension1> Extension;

	public AdditionalReference2 getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(AdditionalReference2 RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

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

	public Transfer4 getTransferDetails() {
		return TransferDetails;
	}

	public void setTransferDetails(Transfer4 TransferDetails) {
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

	public DeliverInformation2 getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(DeliverInformation2 SettlementDetails) {
		this.SettlementDetails = SettlementDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}