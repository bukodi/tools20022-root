package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.datatype.ISINOct2015Identifier;
import com.tools20022.repository.dict.datatype.RICIdentifier;
import com.tools20022.repository.dict.datatype.TickerIdentifier;
import com.tools20022.repository.dict.datatype.Bloomberg2Identifier;
import com.tools20022.repository.dict.datatype.ConsolidatedTapeAssociationIdentifier;
import com.tools20022.repository.dict.datatype.EuroclearClearstreamIdentifier;
import com.tools20022.repository.dict.entity.LocalName;
import com.tools20022.repository.dict.datatype.SEDOLIdentifier;
import com.tools20022.repository.dict.datatype.CUSIPIdentifier;
import com.tools20022.repository.dict.datatype.QUICKIdentifier;
import com.tools20022.repository.dict.datatype.WertpapierIdentifier;
import com.tools20022.repository.dict.datatype.DutchIdentifier;
import com.tools20022.repository.dict.datatype.ValorenIdentifier;
import com.tools20022.repository.dict.datatype.SicovamIdentifier;
import com.tools20022.repository.dict.datatype.BelgianIdentifier;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.TradingMarket;
import com.tools20022.repository.dict.entity.SecuritiesIdentification;
import com.tools20022.repository.dict.datatype.Max70Text;

/**
 * Unique and unambiguous identifier of a security, assigned under a formal or
 * proprietary identification scheme.
 */
public class SecuritiesIdentification {

	private Security IdentifiedSecurity;
	private ISINOct2015Identifier SecurityIdentification;
	private RICIdentifier RIC;
	private TickerIdentifier TickerSymbol;
	private Bloomberg2Identifier Bloomberg;
	private ConsolidatedTapeAssociationIdentifier CTA;
	private EuroclearClearstreamIdentifier Common;
	private LocalName Name;
	private SEDOLIdentifier SEDOL;
	private CUSIPIdentifier CUSIP;
	private QUICKIdentifier QUICK;
	private WertpapierIdentifier Wertpapier;
	private DutchIdentifier Dutch;
	private ValorenIdentifier Valoren;
	private SicovamIdentifier Sicovam;
	private BelgianIdentifier Belgian;
	private Max35Text IdentificationSuffix;
	private GenericIdentification GenericIdentification;
	private DateTimePeriod ValidityPeriod;
	private TradingMarket ApplicableTradingMarket;
	private SecuritiesIdentification PrimeIdentification;
	private SecuritiesIdentification RelatedOtherIdentification;
	private Max70Text TradingIdentification;

	public Security getIdentifiedSecurity() {
		return IdentifiedSecurity;
	}

	public void setIdentifiedSecurity(Security IdentifiedSecurity) {
		this.IdentifiedSecurity = IdentifiedSecurity;
	}

	public ISINOct2015Identifier getSecurityIdentification() {
		return SecurityIdentification;
	}

	public void setSecurityIdentification(
			ISINOct2015Identifier SecurityIdentification) {
		this.SecurityIdentification = SecurityIdentification;
	}

	public RICIdentifier getRIC() {
		return RIC;
	}

	public void setRIC(RICIdentifier RIC) {
		this.RIC = RIC;
	}

	public TickerIdentifier getTickerSymbol() {
		return TickerSymbol;
	}

	public void setTickerSymbol(TickerIdentifier TickerSymbol) {
		this.TickerSymbol = TickerSymbol;
	}

	public Bloomberg2Identifier getBloomberg() {
		return Bloomberg;
	}

	public void setBloomberg(Bloomberg2Identifier Bloomberg) {
		this.Bloomberg = Bloomberg;
	}

	public ConsolidatedTapeAssociationIdentifier getCTA() {
		return CTA;
	}

	public void setCTA(ConsolidatedTapeAssociationIdentifier CTA) {
		this.CTA = CTA;
	}

	public EuroclearClearstreamIdentifier getCommon() {
		return Common;
	}

	public void setCommon(EuroclearClearstreamIdentifier Common) {
		this.Common = Common;
	}

	public LocalName getName() {
		return Name;
	}

	public void setName(LocalName Name) {
		this.Name = Name;
	}

	public SEDOLIdentifier getSEDOL() {
		return SEDOL;
	}

	public void setSEDOL(SEDOLIdentifier SEDOL) {
		this.SEDOL = SEDOL;
	}

	public CUSIPIdentifier getCUSIP() {
		return CUSIP;
	}

	public void setCUSIP(CUSIPIdentifier CUSIP) {
		this.CUSIP = CUSIP;
	}

	public QUICKIdentifier getQUICK() {
		return QUICK;
	}

	public void setQUICK(QUICKIdentifier QUICK) {
		this.QUICK = QUICK;
	}

	public WertpapierIdentifier getWertpapier() {
		return Wertpapier;
	}

	public void setWertpapier(WertpapierIdentifier Wertpapier) {
		this.Wertpapier = Wertpapier;
	}

	public DutchIdentifier getDutch() {
		return Dutch;
	}

	public void setDutch(DutchIdentifier Dutch) {
		this.Dutch = Dutch;
	}

	public ValorenIdentifier getValoren() {
		return Valoren;
	}

	public void setValoren(ValorenIdentifier Valoren) {
		this.Valoren = Valoren;
	}

	public SicovamIdentifier getSicovam() {
		return Sicovam;
	}

	public void setSicovam(SicovamIdentifier Sicovam) {
		this.Sicovam = Sicovam;
	}

	public BelgianIdentifier getBelgian() {
		return Belgian;
	}

	public void setBelgian(BelgianIdentifier Belgian) {
		this.Belgian = Belgian;
	}

	public Max35Text getIdentificationSuffix() {
		return IdentificationSuffix;
	}

	public void setIdentificationSuffix(Max35Text IdentificationSuffix) {
		this.IdentificationSuffix = IdentificationSuffix;
	}

	public GenericIdentification getGenericIdentification() {
		return GenericIdentification;
	}

	public void setGenericIdentification(
			GenericIdentification GenericIdentification) {
		this.GenericIdentification = GenericIdentification;
	}

	public DateTimePeriod getValidityPeriod() {
		return ValidityPeriod;
	}

	public void setValidityPeriod(DateTimePeriod ValidityPeriod) {
		this.ValidityPeriod = ValidityPeriod;
	}

	public TradingMarket getApplicableTradingMarket() {
		return ApplicableTradingMarket;
	}

	public void setApplicableTradingMarket(TradingMarket ApplicableTradingMarket) {
		this.ApplicableTradingMarket = ApplicableTradingMarket;
	}

	public SecuritiesIdentification getPrimeIdentification() {
		return PrimeIdentification;
	}

	public void setPrimeIdentification(
			SecuritiesIdentification PrimeIdentification) {
		this.PrimeIdentification = PrimeIdentification;
	}

	public SecuritiesIdentification getRelatedOtherIdentification() {
		return RelatedOtherIdentification;
	}

	public void setRelatedOtherIdentification(
			SecuritiesIdentification RelatedOtherIdentification) {
		this.RelatedOtherIdentification = RelatedOtherIdentification;
	}

	public Max70Text getTradingIdentification() {
		return TradingIdentification;
	}

	public void setTradingIdentification(Max70Text TradingIdentification) {
		this.TradingIdentification = TradingIdentification;
	}
}