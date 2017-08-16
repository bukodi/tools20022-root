package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.DeliverInformation7;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.DeliverInformation12;
import com.tools20022.core.repo.NextVersion;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 */
@PreviousVersion(DeliverInformation7.class)
@NextVersion(DeliverInformation12.class)
public class DeliverInformation11
		implements
			GeneratedRepoBean<MMMessageComponent> {
}