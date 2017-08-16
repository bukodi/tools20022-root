package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.codeset.SecuritiesPaymentStatusCode;
import com.tools20022.repository.dict.codeset.SecurityStatusCode;
import com.tools20022.repository.dict.codeset.RegistrationProcessingStatusCode;
import com.tools20022.repository.dict.entity.Security;

/**
 * Specifies the status of the security within its lifecycle.
 */
public class SecuritiesStatus extends Status
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesPaymentStatusCode PaymentStatus;
	private SecurityStatusCode Status;
	private RegistrationProcessingStatusCode RegistrationStatus;
	private Security Security;

	public SecuritiesPaymentStatusCode getPaymentStatus() {
		return PaymentStatus;
	}

	public void setPaymentStatus(SecuritiesPaymentStatusCode PaymentStatus) {
		this.PaymentStatus = PaymentStatus;
	}

	public SecurityStatusCode getStatus() {
		return Status;
	}

	public void setStatus(SecurityStatusCode Status) {
		this.Status = Status;
	}

	public RegistrationProcessingStatusCode getRegistrationStatus() {
		return RegistrationStatus;
	}

	public void setRegistrationStatus(
			RegistrationProcessingStatusCode RegistrationStatus) {
		this.RegistrationStatus = RegistrationStatus;
	}

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}
}