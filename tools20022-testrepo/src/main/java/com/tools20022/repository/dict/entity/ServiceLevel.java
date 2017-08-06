package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.ServiceLevelCode;
import com.tools20022.repository.dict.codeset.SWIFTServiceLevelCode;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Agreement under which or rules under which the transaction should be
 * processed.
 */
public class ServiceLevel {

	private ServiceLevelCode Code;
	private SWIFTServiceLevelCode Other;
	private Max35Text Bilateral;

	public ServiceLevelCode getCode() {
		return Code;
	}

	public void setCode(ServiceLevelCode Code) {
		this.Code = Code;
	}

	public SWIFTServiceLevelCode getOther() {
		return Other;
	}

	public void setOther(SWIFTServiceLevelCode Other) {
		this.Other = Other;
	}

	public Max35Text getBilateral() {
		return Bilateral;
	}

	public void setBilateral(Max35Text Bilateral) {
		this.Bilateral = Bilateral;
	}
}