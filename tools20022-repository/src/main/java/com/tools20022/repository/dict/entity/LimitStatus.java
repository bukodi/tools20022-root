package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.entity.Limit;
import com.tools20022.repository.dict.codeset.LimitStatusCode;

/**
 * Current status of the limit.
 */
public class LimitStatus extends Status {

	private Limit Limit;
	private LimitStatusCode Status;

	public Limit getLimit() {
		return Limit;
	}

	public void setLimit(Limit Limit) {
		this.Limit = Limit;
	}

	public LimitStatusCode getStatus() {
		return Status;
	}

	public void setStatus(LimitStatusCode Status) {
		this.Status = Status;
	}
}