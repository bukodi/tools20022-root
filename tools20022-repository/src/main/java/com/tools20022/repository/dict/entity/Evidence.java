package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Document;

/**
 * Element such as signature that can be used to prove a fact.
 */
public class Evidence {

	private Document RelatedDocument;

	public Document getRelatedDocument() {
		return RelatedDocument;
	}

	public void setRelatedDocument(Document RelatedDocument) {
		this.RelatedDocument = RelatedDocument;
	}
}