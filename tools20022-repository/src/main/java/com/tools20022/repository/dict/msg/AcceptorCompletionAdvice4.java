package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdvice3;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdvice5;
import com.tools20022.core.repo.NextVersion;

/**
 * Notification to the acquirer of the completion of the card payment at the
 * acceptor.
 */
@PreviousVersion(AcceptorCompletionAdvice3.class)
@NextVersion(AcceptorCompletionAdvice5.class)
public class AcceptorCompletionAdvice4
		implements
			GeneratedRepoBean<MMMessageComponent> {
}