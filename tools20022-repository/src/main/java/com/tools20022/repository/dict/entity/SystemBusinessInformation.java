package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.InformationQualifier;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.System;

/**
 * Details about business information related to a system.
 */
public class SystemBusinessInformation extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private InformationQualifier Qualifier;
	private Max35Text Subject;
	private Max350Text SubjectDetails;
	private Max35Text Identification;
	private Max35Text Reference;
	private System System;

	public InformationQualifier getQualifier() {
		return Qualifier;
	}

	public void setQualifier(InformationQualifier Qualifier) {
		this.Qualifier = Qualifier;
	}

	public Max35Text getSubject() {
		return Subject;
	}

	public void setSubject(Max35Text Subject) {
		this.Subject = Subject;
	}

	public Max350Text getSubjectDetails() {
		return SubjectDetails;
	}

	public void setSubjectDetails(Max350Text SubjectDetails) {
		this.SubjectDetails = SubjectDetails;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public Max35Text getReference() {
		return Reference;
	}

	public void setReference(Max35Text Reference) {
		this.Reference = Reference;
	}

	public System getSystem() {
		return System;
	}

	public void setSystem(System System) {
		this.System = System;
	}
}