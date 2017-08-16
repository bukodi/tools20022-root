package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Document;

/**
 * Role played by a party in the context of a document.
 */
public class DocumentPartyRole extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Document Document;

	public Document getDocument() {
		return Document;
	}

	public void setDocument(Document Document) {
		this.Document = Document;
	}
}