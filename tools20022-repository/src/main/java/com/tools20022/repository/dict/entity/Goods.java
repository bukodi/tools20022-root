package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Product;
import com.tools20022.repository.dict.entity.Transport;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.GoodsPartyRole;

/**
 * Good is a physical product that can be delivered to a purchaser and that
 * involves the transfer of ownership from seller to customer.
 */
public class Goods extends Product {

	private Transport Transport;
	private Max70Text Analysis;
	private YesNoIndicator HealthCheck;
	private YesNoIndicator PhytosanitaryInspection;
	private GoodsPartyRole PartyRole;

	public Transport getTransport() {
		return Transport;
	}

	public void setTransport(Transport Transport) {
		this.Transport = Transport;
	}

	public Max70Text getAnalysis() {
		return Analysis;
	}

	public void setAnalysis(Max70Text Analysis) {
		this.Analysis = Analysis;
	}

	public YesNoIndicator getHealthCheck() {
		return HealthCheck;
	}

	public void setHealthCheck(YesNoIndicator HealthCheck) {
		this.HealthCheck = HealthCheck;
	}

	public YesNoIndicator getPhytosanitaryInspection() {
		return PhytosanitaryInspection;
	}

	public void setPhytosanitaryInspection(
			YesNoIndicator PhytosanitaryInspection) {
		this.PhytosanitaryInspection = PhytosanitaryInspection;
	}

	public GoodsPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(GoodsPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}
}