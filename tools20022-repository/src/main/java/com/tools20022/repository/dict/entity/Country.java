package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.InvestmentFund;
import com.tools20022.repository.dict.codeset.CountryCode;
import com.tools20022.repository.dict.entity.Person;
import com.tools20022.repository.dict.entity.Tax;
import com.tools20022.repository.dict.entity.SafekeepingPlace;
import com.tools20022.repository.dict.entity.BeneficialOwner;
import com.tools20022.repository.dict.entity.Product;
import com.tools20022.repository.dict.entity.RegulatoryAuthorityRole;
import com.tools20022.repository.dict.entity.CardPaymentAcquiring;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.PostalAddress;
import com.tools20022.repository.dict.entity.InvestmentFundClassProcessingCharacteristics;
import com.tools20022.repository.dict.entity.Market;
import com.tools20022.repository.dict.entity.PaymentCard;

/**
 * Nation with its own government.
 */
public class Country extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private InvestmentFund DomiciledFunds;
	private CountryCode Code;
	private Person Citizen;
	private Tax Tax;
	private SafekeepingPlace CountryForSafekeepingPlace;
	private BeneficialOwner CountryForBeneficialOwner;
	private Product ProducedProducts;
	private RegulatoryAuthorityRole NationalRegulatoryAuthority;
	private CardPaymentAcquiring RelatedCardPayment;
	private Max35Text Name;
	private PostalAddress PostalAddressSpecification;
	private InvestmentFundClassProcessingCharacteristics CountryRelatedInvestmentFundProcessing;
	private Market Market;
	private PaymentCard RelatedPaymentCard;

	public InvestmentFund getDomiciledFunds() {
		return DomiciledFunds;
	}

	public void setDomiciledFunds(InvestmentFund DomiciledFunds) {
		this.DomiciledFunds = DomiciledFunds;
	}

	public CountryCode getCode() {
		return Code;
	}

	public void setCode(CountryCode Code) {
		this.Code = Code;
	}

	public Person getCitizen() {
		return Citizen;
	}

	public void setCitizen(Person Citizen) {
		this.Citizen = Citizen;
	}

	public Tax getTax() {
		return Tax;
	}

	public void setTax(Tax Tax) {
		this.Tax = Tax;
	}

	public SafekeepingPlace getCountryForSafekeepingPlace() {
		return CountryForSafekeepingPlace;
	}

	public void setCountryForSafekeepingPlace(
			SafekeepingPlace CountryForSafekeepingPlace) {
		this.CountryForSafekeepingPlace = CountryForSafekeepingPlace;
	}

	public BeneficialOwner getCountryForBeneficialOwner() {
		return CountryForBeneficialOwner;
	}

	public void setCountryForBeneficialOwner(
			BeneficialOwner CountryForBeneficialOwner) {
		this.CountryForBeneficialOwner = CountryForBeneficialOwner;
	}

	public Product getProducedProducts() {
		return ProducedProducts;
	}

	public void setProducedProducts(Product ProducedProducts) {
		this.ProducedProducts = ProducedProducts;
	}

	public RegulatoryAuthorityRole getNationalRegulatoryAuthority() {
		return NationalRegulatoryAuthority;
	}

	public void setNationalRegulatoryAuthority(
			RegulatoryAuthorityRole NationalRegulatoryAuthority) {
		this.NationalRegulatoryAuthority = NationalRegulatoryAuthority;
	}

	public CardPaymentAcquiring getRelatedCardPayment() {
		return RelatedCardPayment;
	}

	public void setRelatedCardPayment(CardPaymentAcquiring RelatedCardPayment) {
		this.RelatedCardPayment = RelatedCardPayment;
	}

	public Max35Text getName() {
		return Name;
	}

	public void setName(Max35Text Name) {
		this.Name = Name;
	}

	public PostalAddress getPostalAddressSpecification() {
		return PostalAddressSpecification;
	}

	public void setPostalAddressSpecification(
			PostalAddress PostalAddressSpecification) {
		this.PostalAddressSpecification = PostalAddressSpecification;
	}

	public InvestmentFundClassProcessingCharacteristics getCountryRelatedInvestmentFundProcessing() {
		return CountryRelatedInvestmentFundProcessing;
	}

	public void setCountryRelatedInvestmentFundProcessing(
			InvestmentFundClassProcessingCharacteristics CountryRelatedInvestmentFundProcessing) {
		this.CountryRelatedInvestmentFundProcessing = CountryRelatedInvestmentFundProcessing;
	}

	public Market getMarket() {
		return Market;
	}

	public void setMarket(Market Market) {
		this.Market = Market;
	}

	public PaymentCard getRelatedPaymentCard() {
		return RelatedPaymentCard;
	}

	public void setRelatedPaymentCard(PaymentCard RelatedPaymentCard) {
		this.RelatedPaymentCard = RelatedPaymentCard;
	}
}