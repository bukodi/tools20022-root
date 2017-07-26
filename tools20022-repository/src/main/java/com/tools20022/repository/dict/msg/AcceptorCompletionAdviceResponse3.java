package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.AcceptorCompletionAdviceResponse2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdviceResponse4;
import com.tools20022.core.repo.NextVersion;

/**
 * Acknowledgement by the acquirer, of the completion advice of the card payment
 * at the acceptor.
 */
@PreviousVersion(AcceptorCompletionAdviceResponse2.class)
@NextVersion(AcceptorCompletionAdviceResponse4.class)
public class AcceptorCompletionAdviceResponse3 {
}