package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.FinancialProduct;
import com.tools20022.repository.dict.entity.Country;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.entity.InvestmentFundClass;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.TreasuryTradingParty;
import com.tools20022.repository.dict.datatype.BICNonFIIdentifier;
import com.tools20022.repository.dict.entity.CustodianRole;
import com.tools20022.repository.dict.entity.InvestmentFundPartyRole;
import com.tools20022.repository.dict.entity.InvestmentFundFamily;
import com.tools20022.repository.dict.codeset.FundStructureCode;
import com.tools20022.repository.dict.codeset.FundLegalFormCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.UmbrellaFund;
import com.tools20022.repository.dict.codeset.CountryCode;

/**
 * Distinct pool of financial instruments managed by a single investment policy.
 * May or not be part of an umbrella fund. The pool is issued in at least one
 * investment fund class.
 */
public class InvestmentFund extends FinancialProduct {

	private Country DomicileCountry;
	private ContactPoint OrderDesk;
	private InvestmentFundClass InvestmentFundClass;
	private Max35Text FundType;
	private TreasuryTradingParty TreasuryTradingParty;
	private BICNonFIIdentifier Identification;
	private CustodianRole Custodian;
	private InvestmentFundPartyRole PartyRole;
	private InvestmentFundFamily Family;
	private FundStructureCode Structure;
	private FundLegalFormCode LegalForm;
	private YesNoIndicator SubFundIndicator;
	private ISODate EndOfFiscalYear;
	private ISODate AccountingYearEndDate;
	private ISODate FirstAccountingYearEndDate;
	private UmbrellaFund UmbrellaFund;
	private CountryCode AuthorisedCountry;

	public Country getDomicileCountry() {
		return DomicileCountry;
	}

	public void setDomicileCountry(Country DomicileCountry) {
		this.DomicileCountry = DomicileCountry;
	}

	public ContactPoint getOrderDesk() {
		return OrderDesk;
	}

	public void setOrderDesk(ContactPoint OrderDesk) {
		this.OrderDesk = OrderDesk;
	}

	public InvestmentFundClass getInvestmentFundClass() {
		return InvestmentFundClass;
	}

	public void setInvestmentFundClass(InvestmentFundClass InvestmentFundClass) {
		this.InvestmentFundClass = InvestmentFundClass;
	}

	public Max35Text getFundType() {
		return FundType;
	}

	public void setFundType(Max35Text FundType) {
		this.FundType = FundType;
	}

	public TreasuryTradingParty getTreasuryTradingParty() {
		return TreasuryTradingParty;
	}

	public void setTreasuryTradingParty(
			TreasuryTradingParty TreasuryTradingParty) {
		this.TreasuryTradingParty = TreasuryTradingParty;
	}

	public BICNonFIIdentifier getIdentification() {
		return Identification;
	}

	public void setIdentification(BICNonFIIdentifier Identification) {
		this.Identification = Identification;
	}

	public CustodianRole getCustodian() {
		return Custodian;
	}

	public void setCustodian(CustodianRole Custodian) {
		this.Custodian = Custodian;
	}

	public InvestmentFundPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(InvestmentFundPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public InvestmentFundFamily getFamily() {
		return Family;
	}

	public void setFamily(InvestmentFundFamily Family) {
		this.Family = Family;
	}

	public FundStructureCode getStructure() {
		return Structure;
	}

	public void setStructure(FundStructureCode Structure) {
		this.Structure = Structure;
	}

	public FundLegalFormCode getLegalForm() {
		return LegalForm;
	}

	public void setLegalForm(FundLegalFormCode LegalForm) {
		this.LegalForm = LegalForm;
	}

	public YesNoIndicator getSubFundIndicator() {
		return SubFundIndicator;
	}

	public void setSubFundIndicator(YesNoIndicator SubFundIndicator) {
		this.SubFundIndicator = SubFundIndicator;
	}

	public ISODate getEndOfFiscalYear() {
		return EndOfFiscalYear;
	}

	public void setEndOfFiscalYear(ISODate EndOfFiscalYear) {
		this.EndOfFiscalYear = EndOfFiscalYear;
	}

	public ISODate getAccountingYearEndDate() {
		return AccountingYearEndDate;
	}

	public void setAccountingYearEndDate(ISODate AccountingYearEndDate) {
		this.AccountingYearEndDate = AccountingYearEndDate;
	}

	public ISODate getFirstAccountingYearEndDate() {
		return FirstAccountingYearEndDate;
	}

	public void setFirstAccountingYearEndDate(ISODate FirstAccountingYearEndDate) {
		this.FirstAccountingYearEndDate = FirstAccountingYearEndDate;
	}

	public UmbrellaFund getUmbrellaFund() {
		return UmbrellaFund;
	}

	public void setUmbrellaFund(UmbrellaFund UmbrellaFund) {
		this.UmbrellaFund = UmbrellaFund;
	}

	public CountryCode getAuthorisedCountry() {
		return AuthorisedCountry;
	}

	public void setAuthorisedCountry(CountryCode AuthorisedCountry) {
		this.AuthorisedCountry = AuthorisedCountry;
	}
}