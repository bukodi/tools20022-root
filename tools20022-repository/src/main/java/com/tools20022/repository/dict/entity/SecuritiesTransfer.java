package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.ObligationFulfilment;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.SecuritiesAccount;
import com.tools20022.repository.dict.codeset.TransferTypeCode;
import com.tools20022.repository.dict.entity.SecuritiesSettlement;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.PhysicalDelivery;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.Tax;
import com.tools20022.repository.dict.codeset.TransferReasonCode;
import com.tools20022.repository.dict.codeset.PartialSettlementCode;
import com.tools20022.repository.dict.entity.SecuritiesDeliveryObligation;
import com.tools20022.repository.dict.entity.SecuritiesEntry;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.entity.SecuritiesTradeStatus;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 */
public class SecuritiesTransfer extends ObligationFulfilment {

	private Max35Text Identification;
	private SecuritiesQuantity TransferredQuantity;
	private SecuritiesAccount Account;
	private TransferTypeCode TransferType;
	private SecuritiesSettlement RelatedSettlement;
	private YesNoIndicator OwnAccountTransferIndicator;
	private PhysicalDelivery PhysicalDelivery;
	private ISODateTime LateDeliveryDate;
	private Tax TransferTax;
	private TransferReasonCode TransferReason;
	private PartialSettlementCode PartialSettlementType;
	private SecuritiesDeliveryObligation SecuritiesDeliveryObligation;
	private SecuritiesEntry BookEntry;
	private Max35Text TransactionIdentification;
	private Security Security;
	private SecuritiesTradeStatus Status;

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public SecuritiesQuantity getTransferredQuantity() {
		return TransferredQuantity;
	}

	public void setTransferredQuantity(SecuritiesQuantity TransferredQuantity) {
		this.TransferredQuantity = TransferredQuantity;
	}

	public SecuritiesAccount getAccount() {
		return Account;
	}

	public void setAccount(SecuritiesAccount Account) {
		this.Account = Account;
	}

	public TransferTypeCode getTransferType() {
		return TransferType;
	}

	public void setTransferType(TransferTypeCode TransferType) {
		this.TransferType = TransferType;
	}

	public SecuritiesSettlement getRelatedSettlement() {
		return RelatedSettlement;
	}

	public void setRelatedSettlement(SecuritiesSettlement RelatedSettlement) {
		this.RelatedSettlement = RelatedSettlement;
	}

	public YesNoIndicator getOwnAccountTransferIndicator() {
		return OwnAccountTransferIndicator;
	}

	public void setOwnAccountTransferIndicator(
			YesNoIndicator OwnAccountTransferIndicator) {
		this.OwnAccountTransferIndicator = OwnAccountTransferIndicator;
	}

	public PhysicalDelivery getPhysicalDelivery() {
		return PhysicalDelivery;
	}

	public void setPhysicalDelivery(PhysicalDelivery PhysicalDelivery) {
		this.PhysicalDelivery = PhysicalDelivery;
	}

	public ISODateTime getLateDeliveryDate() {
		return LateDeliveryDate;
	}

	public void setLateDeliveryDate(ISODateTime LateDeliveryDate) {
		this.LateDeliveryDate = LateDeliveryDate;
	}

	public Tax getTransferTax() {
		return TransferTax;
	}

	public void setTransferTax(Tax TransferTax) {
		this.TransferTax = TransferTax;
	}

	public TransferReasonCode getTransferReason() {
		return TransferReason;
	}

	public void setTransferReason(TransferReasonCode TransferReason) {
		this.TransferReason = TransferReason;
	}

	public PartialSettlementCode getPartialSettlementType() {
		return PartialSettlementType;
	}

	public void setPartialSettlementType(
			PartialSettlementCode PartialSettlementType) {
		this.PartialSettlementType = PartialSettlementType;
	}

	public SecuritiesDeliveryObligation getSecuritiesDeliveryObligation() {
		return SecuritiesDeliveryObligation;
	}

	public void setSecuritiesDeliveryObligation(
			SecuritiesDeliveryObligation SecuritiesDeliveryObligation) {
		this.SecuritiesDeliveryObligation = SecuritiesDeliveryObligation;
	}

	public SecuritiesEntry getBookEntry() {
		return BookEntry;
	}

	public void setBookEntry(SecuritiesEntry BookEntry) {
		this.BookEntry = BookEntry;
	}

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public SecuritiesTradeStatus getStatus() {
		return Status;
	}

	public void setStatus(SecuritiesTradeStatus Status) {
		this.Status = Status;
	}
}