package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.DocumentToSend1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.DocumentToSend3;
import com.tools20022.core.repo.NextVersion;

/**
 * Determine the type of document and the type of communication method to be
 * used to notify a Party.
 */
@PreviousVersion(DocumentToSend1.class)
@NextVersion(DocumentToSend3.class)
public class DocumentToSend2 implements GeneratedRepoBean<MMMessageComponent> {
}