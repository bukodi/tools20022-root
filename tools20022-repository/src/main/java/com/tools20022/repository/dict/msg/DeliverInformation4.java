package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.DeliverInformation7;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DeliverInformation6;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 */
@NextVersion(DeliverInformation7.class)
@NextVersion(DeliverInformation6.class)
public class DeliverInformation4
		implements
			GeneratedRepoBean<MMMessageComponent> {
}