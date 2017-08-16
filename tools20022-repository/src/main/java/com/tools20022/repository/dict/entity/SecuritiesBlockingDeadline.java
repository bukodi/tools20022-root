package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Deadline;
import com.tools20022.repository.dict.entity.DateTimePeriod;

/**
 * Date by which the securities should be blocked.
 */
public class SecuritiesBlockingDeadline extends Deadline
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private DateTimePeriod BlockingPeriod;

	public DateTimePeriod getBlockingPeriod() {
		return BlockingPeriod;
	}

	public void setBlockingPeriod(DateTimePeriod BlockingPeriod) {
		this.BlockingPeriod = BlockingPeriod;
	}
}