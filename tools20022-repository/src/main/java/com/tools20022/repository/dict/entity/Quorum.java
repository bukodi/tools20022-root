package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.Meeting;

/**
 * Specifies whether a quorum is required or not together with the quorum
 * parameters.
 */
public class Quorum {

	private Max35Text Quantity;
	private PercentageRate Percentage;
	private YesNoIndicator QuorumRequired;
	private Meeting Meeting;

	public Max35Text getQuantity() {
		return Quantity;
	}

	public void setQuantity(Max35Text Quantity) {
		this.Quantity = Quantity;
	}

	public PercentageRate getPercentage() {
		return Percentage;
	}

	public void setPercentage(PercentageRate Percentage) {
		this.Percentage = Percentage;
	}

	public YesNoIndicator getQuorumRequired() {
		return QuorumRequired;
	}

	public void setQuorumRequired(YesNoIndicator QuorumRequired) {
		this.QuorumRequired = QuorumRequired;
	}

	public Meeting getMeeting() {
		return Meeting;
	}

	public void setMeeting(Meeting Meeting) {
		this.Meeting = Meeting;
	}
}