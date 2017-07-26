package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.AcceptorCompletionAdvice2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdvice4;
import com.tools20022.core.repo.NextVersion;

/**
 * Notification to the acquirer of the completion of the card payment at the
 * acceptor.
 */
@PreviousVersion(AcceptorCompletionAdvice2.class)
@NextVersion(AcceptorCompletionAdvice4.class)
public class AcceptorCompletionAdvice3 {
}