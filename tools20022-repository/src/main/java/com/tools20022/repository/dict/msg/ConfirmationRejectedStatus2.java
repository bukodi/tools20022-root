package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.ConfirmationRejectedStatus1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.ConfirmationRejectedReason1Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Rejection of a confirmation.
 */
@PreviousVersion(ConfirmationRejectedStatus1.class)
@NextVersion(ConfirmationRejectedReason1Choice.class)
public class ConfirmationRejectedStatus2
		implements
			GeneratedRepoBean<MMMessageComponent> {
}