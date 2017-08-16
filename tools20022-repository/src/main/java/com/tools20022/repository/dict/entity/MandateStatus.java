package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.ExternalCode;
import com.tools20022.repository.dict.entity.Mandate;
import com.tools20022.repository.dict.codeset.ExternalMandateReason1Code;

/**
 * Specifies whether a mandate is accepted or rejected.
 */
public class MandateStatus extends Status
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private YesNoIndicator Accepted;
	private ExternalCode RejectReason;
	private Mandate Mandate;
	private ExternalMandateReason1Code MandateReason;

	public YesNoIndicator getAccepted() {
		return Accepted;
	}

	public void setAccepted(YesNoIndicator Accepted) {
		this.Accepted = Accepted;
	}

	public ExternalCode getRejectReason() {
		return RejectReason;
	}

	public void setRejectReason(ExternalCode RejectReason) {
		this.RejectReason = RejectReason;
	}

	public Mandate getMandate() {
		return Mandate;
	}

	public void setMandate(Mandate Mandate) {
		this.Mandate = Mandate;
	}

	public ExternalMandateReason1Code getMandateReason() {
		return MandateReason;
	}

	public void setMandateReason(ExternalMandateReason1Code MandateReason) {
		this.MandateReason = MandateReason;
	}
}