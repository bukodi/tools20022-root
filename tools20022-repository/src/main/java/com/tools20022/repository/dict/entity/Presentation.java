package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.ExternalChannelCode;
import com.tools20022.repository.dict.entity.Undertaking;
import com.tools20022.repository.dict.codeset.PresentationMediumCode;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.entity.ElectronicAddress;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.codeset.CommunicationMethodCode;

/**
 * Presentation of documents.
 */
public class Presentation {

	private ExternalChannelCode CommunicationMethod;
	private Undertaking PresentedUndertaking;
	private PresentationMediumCode Medium;
	private Document PresentedDocument;
	private ElectronicAddress ElectronicPresentationAddress;
	private ISODate PresentationDate;
	private CommunicationMethodCode ApplicableChannel;

	public ExternalChannelCode getCommunicationMethod() {
		return CommunicationMethod;
	}

	public void setCommunicationMethod(ExternalChannelCode CommunicationMethod) {
		this.CommunicationMethod = CommunicationMethod;
	}

	public Undertaking getPresentedUndertaking() {
		return PresentedUndertaking;
	}

	public void setPresentedUndertaking(Undertaking PresentedUndertaking) {
		this.PresentedUndertaking = PresentedUndertaking;
	}

	public PresentationMediumCode getMedium() {
		return Medium;
	}

	public void setMedium(PresentationMediumCode Medium) {
		this.Medium = Medium;
	}

	public Document getPresentedDocument() {
		return PresentedDocument;
	}

	public void setPresentedDocument(Document PresentedDocument) {
		this.PresentedDocument = PresentedDocument;
	}

	public ElectronicAddress getElectronicPresentationAddress() {
		return ElectronicPresentationAddress;
	}

	public void setElectronicPresentationAddress(
			ElectronicAddress ElectronicPresentationAddress) {
		this.ElectronicPresentationAddress = ElectronicPresentationAddress;
	}

	public ISODate getPresentationDate() {
		return PresentationDate;
	}

	public void setPresentationDate(ISODate PresentationDate) {
		this.PresentationDate = PresentationDate;
	}

	public CommunicationMethodCode getApplicableChannel() {
		return ApplicableChannel;
	}

	public void setApplicableChannel(CommunicationMethodCode ApplicableChannel) {
		this.ApplicableChannel = ApplicableChannel;
	}
}