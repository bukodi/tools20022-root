package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CardPaymentPartyRole;
import com.tools20022.repository.dict.datatype.Min3Max4Text;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Party performing the card payment transaction.
 */
public class MerchantRole extends CardPaymentPartyRole {

	private Min3Max4Text MerchantCategoryCode;
	private Max35Text MerchantIdentification;

	public Min3Max4Text getMerchantCategoryCode() {
		return MerchantCategoryCode;
	}

	public void setMerchantCategoryCode(Min3Max4Text MerchantCategoryCode) {
		this.MerchantCategoryCode = MerchantCategoryCode;
	}

	public Max35Text getMerchantIdentification() {
		return MerchantIdentification;
	}

	public void setMerchantIdentification(Max35Text MerchantIdentification) {
		this.MerchantIdentification = MerchantIdentification;
	}
}