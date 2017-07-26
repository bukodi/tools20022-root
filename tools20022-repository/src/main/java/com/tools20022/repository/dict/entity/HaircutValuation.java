package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.AssetHolding;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.PlusOrMinusIndicator;
import com.tools20022.repository.dict.entity.InformationPartyRole;

/**
 * Basic valuation details of an asset's market value.
 */
public class HaircutValuation {

	private AssetHolding AssetHolding;
	private PercentageRate Haircut;
	private PlusOrMinusIndicator Sign;
	private InformationPartyRole PartyRole;

	public AssetHolding getAssetHolding() {
		return AssetHolding;
	}

	public void setAssetHolding(AssetHolding AssetHolding) {
		this.AssetHolding = AssetHolding;
	}

	public PercentageRate getHaircut() {
		return Haircut;
	}

	public void setHaircut(PercentageRate Haircut) {
		this.Haircut = Haircut;
	}

	public PlusOrMinusIndicator getSign() {
		return Sign;
	}

	public void setSign(PlusOrMinusIndicator Sign) {
		this.Sign = Sign;
	}

	public InformationPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(InformationPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}
}