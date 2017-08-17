package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.RegulatoryReporting4;
import com.tools20022.core.repo.NextVersion;

/**
 * Includes data elements that can be used for reporting to trade repositories,
 * it is not to be used on regular trade confirmations. Although some fields,
 * for example, unique transaction identifier and prior unique transaction
 * identifier, might be used on regular confirmations.
 */
@NextVersion(RegulatoryReporting4.class)
public class RegulatoryReporting1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}