package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdvice4;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdvice6;
import com.tools20022.core.repo.NextVersion;

/**
 * Notification to the acquirer of the completion of the card payment at the
 * acceptor.
 */
@PreviousVersion(AcceptorCompletionAdvice4.class)
@NextVersion(AcceptorCompletionAdvice6.class)
public class AcceptorCompletionAdvice5
		implements
			GeneratedRepoBean<MMMessageComponent> {
}