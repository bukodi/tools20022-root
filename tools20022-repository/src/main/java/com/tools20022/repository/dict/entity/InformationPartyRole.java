package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.entity.HaircutValuation;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.entity.Scheme;
import com.tools20022.repository.dict.entity.Quote;
import com.tools20022.repository.dict.entity.TreasuryTrade;

/**
 * Role played by a party as source of information.
 */
public class InformationPartyRole extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private GenericIdentification GenericIdentification;
	private HaircutValuation HaircutValuation;
	private SecuritiesPricing Price;
	private Scheme Scheme;
	private Quote Quote;
	private TreasuryTrade TreasuryTrade;

	public GenericIdentification getGenericIdentification() {
		return GenericIdentification;
	}

	public void setGenericIdentification(
			GenericIdentification GenericIdentification) {
		this.GenericIdentification = GenericIdentification;
	}

	public HaircutValuation getHaircutValuation() {
		return HaircutValuation;
	}

	public void setHaircutValuation(HaircutValuation HaircutValuation) {
		this.HaircutValuation = HaircutValuation;
	}

	public SecuritiesPricing getPrice() {
		return Price;
	}

	public void setPrice(SecuritiesPricing Price) {
		this.Price = Price;
	}

	public Scheme getScheme() {
		return Scheme;
	}

	public void setScheme(Scheme Scheme) {
		this.Scheme = Scheme;
	}

	public Quote getQuote() {
		return Quote;
	}

	public void setQuote(Quote Quote) {
		this.Quote = Quote;
	}

	public TreasuryTrade getTreasuryTrade() {
		return TreasuryTrade;
	}

	public void setTreasuryTrade(TreasuryTrade TreasuryTrade) {
		this.TreasuryTrade = TreasuryTrade;
	}
}