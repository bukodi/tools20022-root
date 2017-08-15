package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.InstanceOf;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.Document;

/**
 * Contractual details related to an agreement between parties.
 */
public class Agreement implements InstanceOf<MMBusinessComponent> {

	private Max350Text Description;
	private DateTimePeriod ValidityPeriod;
	private Document Document;

	public Max350Text getDescription() {
		return Description;
	}

	public void setDescription(Max350Text Description) {
		this.Description = Description;
	}

	public DateTimePeriod getValidityPeriod() {
		return ValidityPeriod;
	}

	public void setValidityPeriod(DateTimePeriod ValidityPeriod) {
		this.ValidityPeriod = ValidityPeriod;
	}

	public Document getDocument() {
		return Document;
	}

	public void setDocument(Document Document) {
		this.Document = Document;
	}
}