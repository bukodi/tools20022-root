package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.ElectronicSignature;
import com.tools20022.repository.dict.entity.UndertakingStatus;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Demand;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.UndertakingAmount;
import com.tools20022.repository.dict.entity.Expiry;
import com.tools20022.repository.dict.entity.UndertakingPartyRole;
import com.tools20022.repository.dict.entity.AmendmentOfUndertaking;
import com.tools20022.repository.dict.entity.UndertakingDocument;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.UndertakingNameCode;
import com.tools20022.repository.dict.codeset.ExternalUndertakingTypeCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.ExternalTypeOfPartyCode;
import com.tools20022.repository.dict.entity.UnderlyingTransaction;
import com.tools20022.repository.dict.entity.ModelForm;
import com.tools20022.repository.dict.entity.AutomaticVariation;
import com.tools20022.repository.dict.entity.Charges;
import com.tools20022.repository.dict.entity.Presentation;
import com.tools20022.repository.dict.entity.UndertakingExtension;

/**
 * Independent undertaking, such as a demand guarantee or standby letter of
 * credit, that provides financial assurance, to be collected on the
 * presentation of documents that comply with its terms and conditions.
 */
public class Undertaking extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ElectronicSignature ElectronicSignature;
	private UndertakingStatus UndertakingStatus;
	private Max35Text Identification;
	private Demand Demand;
	private ISODate TerminationDate;
	private UndertakingAmount UndertakingAmount;
	private Expiry Expiry;
	private UndertakingPartyRole PartyRole;
	private AmendmentOfUndertaking UndertakingAmendment;
	private UndertakingDocument SpecifiedDocument;
	private ISODateTime DateOfAdvice;
	private Max35Text Purpose;
	private UndertakingNameCode UndertakingName;
	private ExternalUndertakingTypeCode Type;
	private YesNoIndicator ConfirmationIndicator;
	private YesNoIndicator CounterUndertakingIndicator;
	private ExternalTypeOfPartyCode RelatedChargesPayableBy;
	private YesNoIndicator StandardClaimDocumentIndicator;
	private UnderlyingTransaction UnderlyingTransaction;
	private ModelForm ModelForm;
	private YesNoIndicator MultipleDemandIndicator;
	private YesNoIndicator PartialDemandIndicator;
	private YesNoIndicator TransferIndicator;
	private AutomaticVariation PredefinedVariation;
	private Charges Charges;
	private Presentation Presentation;
	private UndertakingExtension UndertakingExtension;

	public ElectronicSignature getElectronicSignature() {
		return ElectronicSignature;
	}

	public void setElectronicSignature(ElectronicSignature ElectronicSignature) {
		this.ElectronicSignature = ElectronicSignature;
	}

	public UndertakingStatus getUndertakingStatus() {
		return UndertakingStatus;
	}

	public void setUndertakingStatus(UndertakingStatus UndertakingStatus) {
		this.UndertakingStatus = UndertakingStatus;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public Demand getDemand() {
		return Demand;
	}

	public void setDemand(Demand Demand) {
		this.Demand = Demand;
	}

	public ISODate getTerminationDate() {
		return TerminationDate;
	}

	public void setTerminationDate(ISODate TerminationDate) {
		this.TerminationDate = TerminationDate;
	}

	public UndertakingAmount getUndertakingAmount() {
		return UndertakingAmount;
	}

	public void setUndertakingAmount(UndertakingAmount UndertakingAmount) {
		this.UndertakingAmount = UndertakingAmount;
	}

	public Expiry getExpiry() {
		return Expiry;
	}

	public void setExpiry(Expiry Expiry) {
		this.Expiry = Expiry;
	}

	public UndertakingPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(UndertakingPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public AmendmentOfUndertaking getUndertakingAmendment() {
		return UndertakingAmendment;
	}

	public void setUndertakingAmendment(
			AmendmentOfUndertaking UndertakingAmendment) {
		this.UndertakingAmendment = UndertakingAmendment;
	}

	public UndertakingDocument getSpecifiedDocument() {
		return SpecifiedDocument;
	}

	public void setSpecifiedDocument(UndertakingDocument SpecifiedDocument) {
		this.SpecifiedDocument = SpecifiedDocument;
	}

	public ISODateTime getDateOfAdvice() {
		return DateOfAdvice;
	}

	public void setDateOfAdvice(ISODateTime DateOfAdvice) {
		this.DateOfAdvice = DateOfAdvice;
	}

	public Max35Text getPurpose() {
		return Purpose;
	}

	public void setPurpose(Max35Text Purpose) {
		this.Purpose = Purpose;
	}

	public UndertakingNameCode getUndertakingName() {
		return UndertakingName;
	}

	public void setUndertakingName(UndertakingNameCode UndertakingName) {
		this.UndertakingName = UndertakingName;
	}

	public ExternalUndertakingTypeCode getType() {
		return Type;
	}

	public void setType(ExternalUndertakingTypeCode Type) {
		this.Type = Type;
	}

	public YesNoIndicator getConfirmationIndicator() {
		return ConfirmationIndicator;
	}

	public void setConfirmationIndicator(YesNoIndicator ConfirmationIndicator) {
		this.ConfirmationIndicator = ConfirmationIndicator;
	}

	public YesNoIndicator getCounterUndertakingIndicator() {
		return CounterUndertakingIndicator;
	}

	public void setCounterUndertakingIndicator(
			YesNoIndicator CounterUndertakingIndicator) {
		this.CounterUndertakingIndicator = CounterUndertakingIndicator;
	}

	public ExternalTypeOfPartyCode getRelatedChargesPayableBy() {
		return RelatedChargesPayableBy;
	}

	public void setRelatedChargesPayableBy(
			ExternalTypeOfPartyCode RelatedChargesPayableBy) {
		this.RelatedChargesPayableBy = RelatedChargesPayableBy;
	}

	public YesNoIndicator getStandardClaimDocumentIndicator() {
		return StandardClaimDocumentIndicator;
	}

	public void setStandardClaimDocumentIndicator(
			YesNoIndicator StandardClaimDocumentIndicator) {
		this.StandardClaimDocumentIndicator = StandardClaimDocumentIndicator;
	}

	public UnderlyingTransaction getUnderlyingTransaction() {
		return UnderlyingTransaction;
	}

	public void setUnderlyingTransaction(
			UnderlyingTransaction UnderlyingTransaction) {
		this.UnderlyingTransaction = UnderlyingTransaction;
	}

	public ModelForm getModelForm() {
		return ModelForm;
	}

	public void setModelForm(ModelForm ModelForm) {
		this.ModelForm = ModelForm;
	}

	public YesNoIndicator getMultipleDemandIndicator() {
		return MultipleDemandIndicator;
	}

	public void setMultipleDemandIndicator(
			YesNoIndicator MultipleDemandIndicator) {
		this.MultipleDemandIndicator = MultipleDemandIndicator;
	}

	public YesNoIndicator getPartialDemandIndicator() {
		return PartialDemandIndicator;
	}

	public void setPartialDemandIndicator(YesNoIndicator PartialDemandIndicator) {
		this.PartialDemandIndicator = PartialDemandIndicator;
	}

	public YesNoIndicator getTransferIndicator() {
		return TransferIndicator;
	}

	public void setTransferIndicator(YesNoIndicator TransferIndicator) {
		this.TransferIndicator = TransferIndicator;
	}

	public AutomaticVariation getPredefinedVariation() {
		return PredefinedVariation;
	}

	public void setPredefinedVariation(AutomaticVariation PredefinedVariation) {
		this.PredefinedVariation = PredefinedVariation;
	}

	public Charges getCharges() {
		return Charges;
	}

	public void setCharges(Charges Charges) {
		this.Charges = Charges;
	}

	public Presentation getPresentation() {
		return Presentation;
	}

	public void setPresentation(Presentation Presentation) {
		this.Presentation = Presentation;
	}

	public UndertakingExtension getUndertakingExtension() {
		return UndertakingExtension;
	}

	public void setUndertakingExtension(
			UndertakingExtension UndertakingExtension) {
		this.UndertakingExtension = UndertakingExtension;
	}
}