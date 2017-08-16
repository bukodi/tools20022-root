package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.Transfer7;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Transfer25;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Transfer18;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 */
@PreviousVersion(Transfer7.class)
@NextVersion(Transfer25.class)
@NextVersion(Transfer18.class)
public class Transfer17 implements GeneratedRepoBean<MMMessageComponent> {
}