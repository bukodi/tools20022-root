package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.OrganisationIdentification;
import com.tools20022.repository.dict.datatype.CHIPSUniversalIdentifier;
import com.tools20022.repository.dict.datatype.NewZealandNCCIdentifier;
import com.tools20022.repository.dict.datatype.IrishNSCIdentifier;
import com.tools20022.repository.dict.datatype.UKDomesticSortCodeIdentifier;
import com.tools20022.repository.dict.datatype.CHIPSParticipantIdentifier;
import com.tools20022.repository.dict.datatype.SwissBCIdentifier;
import com.tools20022.repository.dict.datatype.FedwireRoutingNumberIdentifier;
import com.tools20022.repository.dict.datatype.PortugueseNCCIdentifier;
import com.tools20022.repository.dict.datatype.RussianCentralBankIdentificationCodeIdentifier;
import com.tools20022.repository.dict.datatype.ItalianDomesticIdentifier;
import com.tools20022.repository.dict.datatype.AustrianBankleitzahlIdentifier;
import com.tools20022.repository.dict.datatype.CanadianPaymentsARNIdentifier;
import com.tools20022.repository.dict.datatype.SwissSICIdentifier;
import com.tools20022.repository.dict.datatype.GermanBankleitzahlIdentifier;
import com.tools20022.repository.dict.datatype.SpanishDomesticInterbankingIdentifier;
import com.tools20022.repository.dict.datatype.SouthAfricanNCCIdentifier;
import com.tools20022.repository.dict.datatype.HongKongBankIdentifier;
import com.tools20022.repository.dict.entity.ClearingMemberRole;
import com.tools20022.repository.dict.datatype.IndianFinancialSystemCodeIdentifier;
import com.tools20022.repository.dict.datatype.HellenicBankIdentificationCodeIdentifier;
import com.tools20022.repository.dict.datatype.PolishNationalClearingCodeIdentifier;
import com.tools20022.repository.dict.entity.AustralianBSBIdentification;

/**
 * Unique and unambiguous identifier for a clearing system member, as assigned
 * by the clearing system. In some clearing systems, the accounts of the
 * clearing system members are also assigned an identifier. The identifier can
 * be used when transmitting, reconciling and confirming payment orders or
 * security transfer instructions prior to settlement, and may include the
 * netting of instructions and the establishment of final positions for
 * settlement.
 */
public class CashClearingSystemMember extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private OrganisationIdentification OrganisationIdentification;
	private CHIPSUniversalIdentifier CHIPSUniversalIdentification;
	private NewZealandNCCIdentifier NewZealandNCC;
	private IrishNSCIdentifier IrishNSC;
	private UKDomesticSortCodeIdentifier UKSortCode;
	private CHIPSParticipantIdentifier CHIPSParticipantIdentification;
	private SwissBCIdentifier SwissBC;
	private FedwireRoutingNumberIdentifier FedwireRoutingNumber;
	private PortugueseNCCIdentifier PortugueseNCC;
	private RussianCentralBankIdentificationCodeIdentifier RussianCentralBankIdentificationCode;
	private ItalianDomesticIdentifier ItalianDomesticIdentificationCode;
	private AustrianBankleitzahlIdentifier AustrianBankleitzahl;
	private CanadianPaymentsARNIdentifier CanadianPaymentsAssociationRoutingNumber;
	private SwissSICIdentifier SwissSIC;
	private GermanBankleitzahlIdentifier GermanBankleitzahl;
	private SpanishDomesticInterbankingIdentifier SpanishDomesticInterbankingCode;
	private SouthAfricanNCCIdentifier SouthAfricanNCC;
	private HongKongBankIdentifier HongKongBankCode;
	private ClearingMemberRole ClearingMember;
	private IndianFinancialSystemCodeIdentifier IndianFinancialSystemCode;
	private HellenicBankIdentificationCodeIdentifier HellenicBankIdentificationCode;
	private PolishNationalClearingCodeIdentifier PolishNationalClearingCode;
	private AustralianBSBIdentification AustralianBSBCode;

	public OrganisationIdentification getOrganisationIdentification() {
		return OrganisationIdentification;
	}

	public void setOrganisationIdentification(
			OrganisationIdentification OrganisationIdentification) {
		this.OrganisationIdentification = OrganisationIdentification;
	}

	public CHIPSUniversalIdentifier getCHIPSUniversalIdentification() {
		return CHIPSUniversalIdentification;
	}

	public void setCHIPSUniversalIdentification(
			CHIPSUniversalIdentifier CHIPSUniversalIdentification) {
		this.CHIPSUniversalIdentification = CHIPSUniversalIdentification;
	}

	public NewZealandNCCIdentifier getNewZealandNCC() {
		return NewZealandNCC;
	}

	public void setNewZealandNCC(NewZealandNCCIdentifier NewZealandNCC) {
		this.NewZealandNCC = NewZealandNCC;
	}

	public IrishNSCIdentifier getIrishNSC() {
		return IrishNSC;
	}

	public void setIrishNSC(IrishNSCIdentifier IrishNSC) {
		this.IrishNSC = IrishNSC;
	}

	public UKDomesticSortCodeIdentifier getUKSortCode() {
		return UKSortCode;
	}

	public void setUKSortCode(UKDomesticSortCodeIdentifier UKSortCode) {
		this.UKSortCode = UKSortCode;
	}

	public CHIPSParticipantIdentifier getCHIPSParticipantIdentification() {
		return CHIPSParticipantIdentification;
	}

	public void setCHIPSParticipantIdentification(
			CHIPSParticipantIdentifier CHIPSParticipantIdentification) {
		this.CHIPSParticipantIdentification = CHIPSParticipantIdentification;
	}

	public SwissBCIdentifier getSwissBC() {
		return SwissBC;
	}

	public void setSwissBC(SwissBCIdentifier SwissBC) {
		this.SwissBC = SwissBC;
	}

	public FedwireRoutingNumberIdentifier getFedwireRoutingNumber() {
		return FedwireRoutingNumber;
	}

	public void setFedwireRoutingNumber(
			FedwireRoutingNumberIdentifier FedwireRoutingNumber) {
		this.FedwireRoutingNumber = FedwireRoutingNumber;
	}

	public PortugueseNCCIdentifier getPortugueseNCC() {
		return PortugueseNCC;
	}

	public void setPortugueseNCC(PortugueseNCCIdentifier PortugueseNCC) {
		this.PortugueseNCC = PortugueseNCC;
	}

	public RussianCentralBankIdentificationCodeIdentifier getRussianCentralBankIdentificationCode() {
		return RussianCentralBankIdentificationCode;
	}

	public void setRussianCentralBankIdentificationCode(
			RussianCentralBankIdentificationCodeIdentifier RussianCentralBankIdentificationCode) {
		this.RussianCentralBankIdentificationCode = RussianCentralBankIdentificationCode;
	}

	public ItalianDomesticIdentifier getItalianDomesticIdentificationCode() {
		return ItalianDomesticIdentificationCode;
	}

	public void setItalianDomesticIdentificationCode(
			ItalianDomesticIdentifier ItalianDomesticIdentificationCode) {
		this.ItalianDomesticIdentificationCode = ItalianDomesticIdentificationCode;
	}

	public AustrianBankleitzahlIdentifier getAustrianBankleitzahl() {
		return AustrianBankleitzahl;
	}

	public void setAustrianBankleitzahl(
			AustrianBankleitzahlIdentifier AustrianBankleitzahl) {
		this.AustrianBankleitzahl = AustrianBankleitzahl;
	}

	public CanadianPaymentsARNIdentifier getCanadianPaymentsAssociationRoutingNumber() {
		return CanadianPaymentsAssociationRoutingNumber;
	}

	public void setCanadianPaymentsAssociationRoutingNumber(
			CanadianPaymentsARNIdentifier CanadianPaymentsAssociationRoutingNumber) {
		this.CanadianPaymentsAssociationRoutingNumber = CanadianPaymentsAssociationRoutingNumber;
	}

	public SwissSICIdentifier getSwissSIC() {
		return SwissSIC;
	}

	public void setSwissSIC(SwissSICIdentifier SwissSIC) {
		this.SwissSIC = SwissSIC;
	}

	public GermanBankleitzahlIdentifier getGermanBankleitzahl() {
		return GermanBankleitzahl;
	}

	public void setGermanBankleitzahl(
			GermanBankleitzahlIdentifier GermanBankleitzahl) {
		this.GermanBankleitzahl = GermanBankleitzahl;
	}

	public SpanishDomesticInterbankingIdentifier getSpanishDomesticInterbankingCode() {
		return SpanishDomesticInterbankingCode;
	}

	public void setSpanishDomesticInterbankingCode(
			SpanishDomesticInterbankingIdentifier SpanishDomesticInterbankingCode) {
		this.SpanishDomesticInterbankingCode = SpanishDomesticInterbankingCode;
	}

	public SouthAfricanNCCIdentifier getSouthAfricanNCC() {
		return SouthAfricanNCC;
	}

	public void setSouthAfricanNCC(SouthAfricanNCCIdentifier SouthAfricanNCC) {
		this.SouthAfricanNCC = SouthAfricanNCC;
	}

	public HongKongBankIdentifier getHongKongBankCode() {
		return HongKongBankCode;
	}

	public void setHongKongBankCode(HongKongBankIdentifier HongKongBankCode) {
		this.HongKongBankCode = HongKongBankCode;
	}

	public ClearingMemberRole getClearingMember() {
		return ClearingMember;
	}

	public void setClearingMember(ClearingMemberRole ClearingMember) {
		this.ClearingMember = ClearingMember;
	}

	public IndianFinancialSystemCodeIdentifier getIndianFinancialSystemCode() {
		return IndianFinancialSystemCode;
	}

	public void setIndianFinancialSystemCode(
			IndianFinancialSystemCodeIdentifier IndianFinancialSystemCode) {
		this.IndianFinancialSystemCode = IndianFinancialSystemCode;
	}

	public HellenicBankIdentificationCodeIdentifier getHellenicBankIdentificationCode() {
		return HellenicBankIdentificationCode;
	}

	public void setHellenicBankIdentificationCode(
			HellenicBankIdentificationCodeIdentifier HellenicBankIdentificationCode) {
		this.HellenicBankIdentificationCode = HellenicBankIdentificationCode;
	}

	public PolishNationalClearingCodeIdentifier getPolishNationalClearingCode() {
		return PolishNationalClearingCode;
	}

	public void setPolishNationalClearingCode(
			PolishNationalClearingCodeIdentifier PolishNationalClearingCode) {
		this.PolishNationalClearingCode = PolishNationalClearingCode;
	}

	public AustralianBSBIdentification getAustralianBSBCode() {
		return AustralianBSBCode;
	}

	public void setAustralianBSBCode(
			AustralianBSBIdentification AustralianBSBCode) {
		this.AustralianBSBCode = AustralianBSBCode;
	}
}