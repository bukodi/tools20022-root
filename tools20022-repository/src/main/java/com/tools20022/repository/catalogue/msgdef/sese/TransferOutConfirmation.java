package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.TransferOutConfirmationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Transfer2;
import com.tools20022.repository.dict.msg.FinancialInstrument3;
import com.tools20022.repository.dict.msg.InvestmentAccount10;
import com.tools20022.repository.dict.msg.ReceiveInformation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The TransferOutConfirmation message is sent by an executing party to
 * the instructing party or the instructing party's designated agent. This
 * message is used to confirm the delivery of a financial instrument, free of
 * payment, at a given date, to a specified party. This message can be used to
 * confirm the transfer of a financial instrument to an own account or to a
 * third party. Usage The TransferOutConfirmation message is used by an
 * executing party to confirm to the instructing party that the withdrawal of a
 * financial instrument from the owner's account and its delivery to another own
 * account, or to a third party, has taken place.
 */
@NextVersion(TransferOutConfirmationV02.class)
public class TransferOutConfirmation
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private AdditionalReference2 RelatedReference;
	private Optional<AdditionalReference2> PoolReference;
	private Optional<AdditionalReference2> PreviousReference;
	private Transfer2 TransferDetails;
	private FinancialInstrument3 FinancialInstrumentDetails;
	private InvestmentAccount10 AccountDetails;
	private ReceiveInformation2 SettlementDetails;
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

	public Transfer2 getTransferDetails() {
		return TransferDetails;
	}

	public void setTransferDetails(Transfer2 TransferDetails) {
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

	public ReceiveInformation2 getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(ReceiveInformation2 SettlementDetails) {
		this.SettlementDetails = SettlementDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}