package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.InstanceOf;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.Scheme;

/**
 * Information related to a non-standardised identification, such as a
 * proprietary party identification or account identification.
 */
public class GenericIdentification implements InstanceOf<MMBusinessComponent> {

	private Max35Text Identification;
	private ISODate IssueDate;
	private ISODate ExpiryDate;
	private Scheme Scheme;

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public ISODate getIssueDate() {
		return IssueDate;
	}

	public void setIssueDate(ISODate IssueDate) {
		this.IssueDate = IssueDate;
	}

	public ISODate getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(ISODate ExpiryDate) {
		this.ExpiryDate = ExpiryDate;
	}

	public Scheme getScheme() {
		return Scheme;
	}

	public void setScheme(Scheme Scheme) {
		this.Scheme = Scheme;
	}
}