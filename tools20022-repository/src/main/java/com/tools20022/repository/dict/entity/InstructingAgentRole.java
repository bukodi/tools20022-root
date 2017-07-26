package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.PaymentPartyRole;
import com.tools20022.repository.dict.datatype.YesNoIndicator;

/**
 * Agent that instructs the next party in the chain to carry out the (set of)
 * instruction(s).
 */
public class InstructingAgentRole extends PaymentPartyRole {

	private YesNoIndicator Previous;

	public YesNoIndicator getPrevious() {
		return Previous;
	}

	public void setPrevious(YesNoIndicator Previous) {
		this.Previous = Previous;
	}
}