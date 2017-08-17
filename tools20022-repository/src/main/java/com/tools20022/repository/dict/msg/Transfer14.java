package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.Transfer10;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Transfer24;
import com.tools20022.core.repo.NextVersion;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 */
@PreviousVersion(Transfer10.class)
@NextVersion(Transfer24.class)
public class Transfer14 implements GeneratedRepoBean<MMMessageComponent> {
}