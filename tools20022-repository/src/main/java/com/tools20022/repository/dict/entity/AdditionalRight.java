package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Meeting;
import com.tools20022.repository.dict.codeset.AdditionalRightCode;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Specifies how the additional rights can be granted to the shareholder. These
 * rights can be exercised at shareholders meetings (for example, the right to
 * ask questions, the right to add items to the agenda or table draft
 * resolutions).
 */
public class AdditionalRight {

	private Meeting Meeting;
	private AdditionalRightCode Type;
	private Max350Text AdditionalRightThreshold;
	private PercentageRate AdditionalRightThresholdPercentage;

	public Meeting getMeeting() {
		return Meeting;
	}

	public void setMeeting(Meeting Meeting) {
		this.Meeting = Meeting;
	}

	public AdditionalRightCode getType() {
		return Type;
	}

	public void setType(AdditionalRightCode Type) {
		this.Type = Type;
	}

	public Max350Text getAdditionalRightThreshold() {
		return AdditionalRightThreshold;
	}

	public void setAdditionalRightThreshold(Max350Text AdditionalRightThreshold) {
		this.AdditionalRightThreshold = AdditionalRightThreshold;
	}

	public PercentageRate getAdditionalRightThresholdPercentage() {
		return AdditionalRightThresholdPercentage;
	}

	public void setAdditionalRightThresholdPercentage(
			PercentageRate AdditionalRightThresholdPercentage) {
		this.AdditionalRightThresholdPercentage = AdditionalRightThresholdPercentage;
	}
}