package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.FinancialDocument;
import com.tools20022.repository.dict.codeset.ExternalUndertakingDocumentTypeCode;
import com.tools20022.repository.dict.codeset.ExternalDocumentFormatCode;
import com.tools20022.repository.dict.entity.Undertaking;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.Demand;

/**
 * Document presented.
 */
public class UndertakingDocument extends FinancialDocument
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ExternalUndertakingDocumentTypeCode DocumentType;
	private ExternalDocumentFormatCode Format;
	private Undertaking Undertaking;
	private YesNoIndicator CopyIndicator;
	private Demand Demand;

	public ExternalUndertakingDocumentTypeCode getDocumentType() {
		return DocumentType;
	}

	public void setDocumentType(ExternalUndertakingDocumentTypeCode DocumentType) {
		this.DocumentType = DocumentType;
	}

	public ExternalDocumentFormatCode getFormat() {
		return Format;
	}

	public void setFormat(ExternalDocumentFormatCode Format) {
		this.Format = Format;
	}

	public Undertaking getUndertaking() {
		return Undertaking;
	}

	public void setUndertaking(Undertaking Undertaking) {
		this.Undertaking = Undertaking;
	}

	public YesNoIndicator getCopyIndicator() {
		return CopyIndicator;
	}

	public void setCopyIndicator(YesNoIndicator CopyIndicator) {
		this.CopyIndicator = CopyIndicator;
	}

	public Demand getDemand() {
		return Demand;
	}

	public void setDemand(Demand Demand) {
		this.Demand = Demand;
	}
}