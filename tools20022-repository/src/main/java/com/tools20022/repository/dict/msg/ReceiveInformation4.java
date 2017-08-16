package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.ReceiveInformation8;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.ReceiveInformation6;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 */
@NextVersion(ReceiveInformation8.class)
@NextVersion(ReceiveInformation6.class)
public class ReceiveInformation4
		implements
			GeneratedRepoBean<MMMessageComponent> {
}