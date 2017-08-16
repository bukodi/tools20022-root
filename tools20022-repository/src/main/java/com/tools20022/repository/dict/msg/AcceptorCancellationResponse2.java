package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.AcceptorCancellationResponse1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AcceptorCancellationResponse3;
import com.tools20022.core.repo.NextVersion;

/**
 * Cancellation response from the acquirer.
 */
@PreviousVersion(AcceptorCancellationResponse1.class)
@NextVersion(AcceptorCancellationResponse3.class)
public class AcceptorCancellationResponse2
		implements
			GeneratedRepoBean<MMMessageComponent> {
}