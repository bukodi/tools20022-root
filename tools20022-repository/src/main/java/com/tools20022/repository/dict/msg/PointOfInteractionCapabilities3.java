package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.PointOfInteractionCapabilities2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PointOfInteractionCapabilities4;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.PointOfInteractionCapabilities5;
import com.tools20022.repository.dict.msg.PointOfInteractionCapabilities6;

/**
 * Capabilities of the POI (Point Of Interaction) performing the transaction.
 */
@PreviousVersion(PointOfInteractionCapabilities2.class)
@NextVersion(PointOfInteractionCapabilities4.class)
@NextVersion(PointOfInteractionCapabilities5.class)
@NextVersion(PointOfInteractionCapabilities6.class)
public class PointOfInteractionCapabilities3
		implements
			GeneratedRepoBean<MMMessageComponent> {
}