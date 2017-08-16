package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.CorporateActionEvent;

/**
 * Corporate action that will result in only one possibility for account
 * holders. The shareholder is just a passive beneficiary of these actions.
 */
public class MandatoryCorporateAction extends CorporateActionEvent
		implements
			GeneratedRepoBean<MMBusinessComponent> {
}