package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.PointOfInteraction1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PointOfInteraction3;
import com.tools20022.core.repo.NextVersion;

/**
 * Point of interaction (POI) performing the transaction.
 */
@PreviousVersion(PointOfInteraction1.class)
@NextVersion(PointOfInteraction3.class)
public class PointOfInteraction2
		implements
			GeneratedRepoBean<MMMessageComponent> {
}