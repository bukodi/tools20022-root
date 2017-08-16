package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.TransportDetails2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.TransportDetails4;
import com.tools20022.core.repo.NextVersion;

/**
 * Information on the shipment date, the charges, the routing and the goods
 * described in the transport document.
 */
@PreviousVersion(TransportDetails2.class)
@NextVersion(TransportDetails4.class)
public class TransportDetails3 implements GeneratedRepoBean<MMMessageComponent> {
}