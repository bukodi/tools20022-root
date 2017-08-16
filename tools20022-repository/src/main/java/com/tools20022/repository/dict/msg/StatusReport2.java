package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.StatusReport1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.StatusReport3;
import com.tools20022.core.repo.NextVersion;

/**
 * Status of the acceptor system containing the identification of the POI, its
 * components and their installed versions.
 */
@PreviousVersion(StatusReport1.class)
@NextVersion(StatusReport3.class)
public class StatusReport2 implements GeneratedRepoBean<MMMessageComponent> {
}