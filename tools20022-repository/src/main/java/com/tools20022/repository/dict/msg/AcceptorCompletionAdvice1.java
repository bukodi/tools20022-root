package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdvice2;
import com.tools20022.core.repo.NextVersion;

/**
 * Notification to the acquirer of the completion of the card payment at the
 * acceptor.
 */
@NextVersion(AcceptorCompletionAdvice2.class)
public class AcceptorCompletionAdvice1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}