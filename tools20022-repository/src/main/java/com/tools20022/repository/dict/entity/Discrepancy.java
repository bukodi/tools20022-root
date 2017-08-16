package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.UndertakingStatusReason;
import com.tools20022.repository.dict.codeset.ExternalDiscrepancyCode;
import com.tools20022.repository.dict.datatype.Max2000Text;

/**
 * Identification of a discrepancy.
 */
public class Discrepancy extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private UndertakingStatusReason UndertakingStatusReason;
	private ExternalDiscrepancyCode Type;
	private Max2000Text Description;

	public UndertakingStatusReason getUndertakingStatusReason() {
		return UndertakingStatusReason;
	}

	public void setUndertakingStatusReason(
			UndertakingStatusReason UndertakingStatusReason) {
		this.UndertakingStatusReason = UndertakingStatusReason;
	}

	public ExternalDiscrepancyCode getType() {
		return Type;
	}

	public void setType(ExternalDiscrepancyCode Type) {
		this.Type = Type;
	}

	public Max2000Text getDescription() {
		return Description;
	}

	public void setDescription(Max2000Text Description) {
		this.Description = Description;
	}
}