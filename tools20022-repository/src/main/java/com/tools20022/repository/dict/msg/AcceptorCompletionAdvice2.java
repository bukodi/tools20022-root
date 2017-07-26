package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.AcceptorCompletionAdvice1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdvice3;
import com.tools20022.core.repo.NextVersion;

/**
 * Notification to the acquirer of the completion of the card payment at the
 * acceptor.
 */
@PreviousVersion(AcceptorCompletionAdvice1.class)
@NextVersion(AcceptorCompletionAdvice3.class)
public class AcceptorCompletionAdvice2 {
}