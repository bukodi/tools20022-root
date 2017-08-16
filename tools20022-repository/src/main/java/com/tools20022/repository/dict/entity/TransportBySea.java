package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Transport;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.datatype.Exact7NumericText;

/**
 * Information related for the transportation of goods by sea.
 */
public class TransportBySea extends Transport
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text VesselName;
	private Max35Text VoyageNumber;
	private Max70Text ChartererName;
	private Max70Text MasterName;
	private Max70Text OwnerName;
	private Exact7NumericText IMONumber;

	public Max35Text getVesselName() {
		return VesselName;
	}

	public void setVesselName(Max35Text VesselName) {
		this.VesselName = VesselName;
	}

	public Max35Text getVoyageNumber() {
		return VoyageNumber;
	}

	public void setVoyageNumber(Max35Text VoyageNumber) {
		this.VoyageNumber = VoyageNumber;
	}

	public Max70Text getChartererName() {
		return ChartererName;
	}

	public void setChartererName(Max70Text ChartererName) {
		this.ChartererName = ChartererName;
	}

	public Max70Text getMasterName() {
		return MasterName;
	}

	public void setMasterName(Max70Text MasterName) {
		this.MasterName = MasterName;
	}

	public Max70Text getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(Max70Text OwnerName) {
		this.OwnerName = OwnerName;
	}

	public Exact7NumericText getIMONumber() {
		return IMONumber;
	}

	public void setIMONumber(Exact7NumericText IMONumber) {
		this.IMONumber = IMONumber;
	}
}