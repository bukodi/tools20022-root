package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.SystemBusinessInformation;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.PriorityCode;

/**
 * Further qualifies the information provided in terms of its importance and its
 * format.
 */
public class InformationQualifier extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SystemBusinessInformation SystemBusinessInformation;
	private YesNoIndicator IsFormatted;
	private PriorityCode Priority;

	public SystemBusinessInformation getSystemBusinessInformation() {
		return SystemBusinessInformation;
	}

	public void setSystemBusinessInformation(
			SystemBusinessInformation SystemBusinessInformation) {
		this.SystemBusinessInformation = SystemBusinessInformation;
	}

	public YesNoIndicator getIsFormatted() {
		return IsFormatted;
	}

	public void setIsFormatted(YesNoIndicator IsFormatted) {
		this.IsFormatted = IsFormatted;
	}

	public PriorityCode getPriority() {
		return Priority;
	}

	public void setPriority(PriorityCode Priority) {
		this.Priority = Priority;
	}
}