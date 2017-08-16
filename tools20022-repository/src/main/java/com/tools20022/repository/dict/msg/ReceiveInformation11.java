package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.ReceiveInformation6;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.ReceiveInformation12;
import com.tools20022.core.repo.NextVersion;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 */
@PreviousVersion(ReceiveInformation6.class)
@NextVersion(ReceiveInformation12.class)
public class ReceiveInformation11
		implements
			GeneratedRepoBean<MMMessageComponent> {
}