package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.AcceptorCompletionAdviceResponse1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdviceResponse3;
import com.tools20022.core.repo.NextVersion;

/**
 * Acknowledgement by the acquirer, of the completion advice of the card payment
 * at the acceptor.
 */
@PreviousVersion(AcceptorCompletionAdviceResponse1.class)
@NextVersion(AcceptorCompletionAdviceResponse3.class)
public class AcceptorCompletionAdviceResponse2 {
}