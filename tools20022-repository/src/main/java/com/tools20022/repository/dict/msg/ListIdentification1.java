package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;

/**
 * Unique identifier for a list as assigned by institution, used to associate
 * multiple individual orders. Uniqueness must be guaranteed within a single
 * trading day. Institutions which generate multi-day orders should consider
 * embedding a date to assure uniqueness across days.
 */
public class ListIdentification1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}