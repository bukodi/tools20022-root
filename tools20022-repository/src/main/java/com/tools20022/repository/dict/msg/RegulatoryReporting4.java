package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.RegulatoryReporting1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.RegulatoryReporting6;
import com.tools20022.core.repo.NextVersion;

/**
 * Includes data elements that can be used for reporting to trade repositories,
 * it is not to be used on regular trade confirmations. Although some fields,
 * for example, unique transaction identifier and prior unique transaction
 * identifier, might be used on regular trade confirmations.
 */
@PreviousVersion(RegulatoryReporting1.class)
@NextVersion(RegulatoryReporting6.class)
public class RegulatoryReporting4
		implements
			GeneratedRepoBean<MMMessageComponent> {
}