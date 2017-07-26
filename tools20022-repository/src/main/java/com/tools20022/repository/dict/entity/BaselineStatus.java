package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.codeset.BaselineStatusCode;
import com.tools20022.repository.dict.entity.CommercialTrade;

/**
 * Indicates the status of a baseline.
 */
public class BaselineStatus extends Status {

	private BaselineStatusCode Status;
	private CommercialTrade CommercialTrade;

	public BaselineStatusCode getStatus() {
		return Status;
	}

	public void setStatus(BaselineStatusCode Status) {
		this.Status = Status;
	}

	public CommercialTrade getCommercialTrade() {
		return CommercialTrade;
	}

	public void setCommercialTrade(CommercialTrade CommercialTrade) {
		this.CommercialTrade = CommercialTrade;
	}
}