package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Document;

/**
 * Element such as signature that can be used to prove a fact.
 */
public class Evidence extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Document RelatedDocument;

	public Document getRelatedDocument() {
		return RelatedDocument;
	}

	public void setRelatedDocument(Document RelatedDocument) {
		this.RelatedDocument = RelatedDocument;
	}
}