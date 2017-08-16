package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.PlusOrMinusIndicator;
import com.tools20022.repository.dict.datatype.ISOTime;
import com.tools20022.repository.dict.entity.Location;

/**
 * Offset of the time before or after 00:00 hour UTC.
 */
public class UTCOffset extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private PlusOrMinusIndicator Sign;
	private ISOTime NumberOfHours;
	private Location Location;

	public PlusOrMinusIndicator getSign() {
		return Sign;
	}

	public void setSign(PlusOrMinusIndicator Sign) {
		this.Sign = Sign;
	}

	public ISOTime getNumberOfHours() {
		return NumberOfHours;
	}

	public void setNumberOfHours(ISOTime NumberOfHours) {
		this.NumberOfHours = NumberOfHours;
	}

	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location Location) {
		this.Location = Location;
	}
}