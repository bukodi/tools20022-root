package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.InsuranceCertificate;

/**
 * Role played by a party in the context of insurance.
 */
public class InsurancePartyRole extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private InsuranceCertificate InsuranceCertificate;

	public InsuranceCertificate getInsuranceCertificate() {
		return InsuranceCertificate;
	}

	public void setInsuranceCertificate(
			InsuranceCertificate InsuranceCertificate) {
		this.InsuranceCertificate = InsuranceCertificate;
	}
}