package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;

/**
 * Specifies an identification of a document assigned by and relative to the
 * issuing party (of the identification). Optionally, the component can contain
 * a copy of the identified document and a URI/URL (Universal Resource
 * Information/Location) facilitating retrieval of the document. The component
 * may also contain a cryptographic hash of the referenced document. Financial
 * items are identified by three parts: (1) the creator of the document, (2) an
 * identification of a dossier, and (3) an identification of a financial item.
 * The two latter identifiers are independent permitting to identify the same
 * item in several lists. The element identification is of schema type ID, it
 * can be referenced by IDREF typed elements (composite=false).
 */
public class QualifiedDocumentInformation1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}