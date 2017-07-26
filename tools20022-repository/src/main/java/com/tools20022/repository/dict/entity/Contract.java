package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Agreement;
import com.tools20022.repository.dict.entity.MasterAgreement;

/**
 * Document that contains the information of the contract agreed between both
 * parties.
 */
public class Contract extends Agreement {

	private MasterAgreement MasterAgreement;

	public MasterAgreement getMasterAgreement() {
		return MasterAgreement;
	}

	public void setMasterAgreement(MasterAgreement MasterAgreement) {
		this.MasterAgreement = MasterAgreement;
	}
}