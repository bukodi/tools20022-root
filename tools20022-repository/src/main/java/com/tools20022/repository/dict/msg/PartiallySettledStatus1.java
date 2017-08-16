package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.PartiallySettledStatus10;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.PartiallySettled21Choice;

/**
 * Status is partially settled.
 */
@NextVersion(PartiallySettledStatus10.class)
@NextVersion(PartiallySettled21Choice.class)
public class PartiallySettledStatus1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}