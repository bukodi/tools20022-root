package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Entry;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.SecuritiesAccount;
import com.tools20022.repository.dict.entity.SecuritiesBalance;
import com.tools20022.repository.dict.entity.SecuritiesTransfer;

/**
 * Posting to a securities account as a result of a securities creation,
 * deletion or transfer in the context of a securities transaction.
 */
public class SecuritiesEntry extends Entry {

	private ISODate AcquisitionDate;
	private SecuritiesQuantity FinancialInstrumentQuantity;
	private SecuritiesAccount SecuritiesAccount;
	private SecuritiesBalance SecuritiesBalance;
	private SecuritiesTransfer TriggeringSecuritiesTransfer;

	public ISODate getAcquisitionDate() {
		return AcquisitionDate;
	}

	public void setAcquisitionDate(ISODate AcquisitionDate) {
		this.AcquisitionDate = AcquisitionDate;
	}

	public SecuritiesQuantity getFinancialInstrumentQuantity() {
		return FinancialInstrumentQuantity;
	}

	public void setFinancialInstrumentQuantity(
			SecuritiesQuantity FinancialInstrumentQuantity) {
		this.FinancialInstrumentQuantity = FinancialInstrumentQuantity;
	}

	public SecuritiesAccount getSecuritiesAccount() {
		return SecuritiesAccount;
	}

	public void setSecuritiesAccount(SecuritiesAccount SecuritiesAccount) {
		this.SecuritiesAccount = SecuritiesAccount;
	}

	public SecuritiesBalance getSecuritiesBalance() {
		return SecuritiesBalance;
	}

	public void setSecuritiesBalance(SecuritiesBalance SecuritiesBalance) {
		this.SecuritiesBalance = SecuritiesBalance;
	}

	public SecuritiesTransfer getTriggeringSecuritiesTransfer() {
		return TriggeringSecuritiesTransfer;
	}

	public void setTriggeringSecuritiesTransfer(
			SecuritiesTransfer TriggeringSecuritiesTransfer) {
		this.TriggeringSecuritiesTransfer = TriggeringSecuritiesTransfer;
	}
}