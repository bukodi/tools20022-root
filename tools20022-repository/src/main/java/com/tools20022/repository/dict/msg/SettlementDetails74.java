package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.SettlementDetails47;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.SettlementDetails92;
import com.tools20022.core.repo.NextVersion;

/**
 * Parameters which explicitly state the conditions that must be fulfilled
 * before a particular transaction of a financial instrument can be settled.
 * These parameters are defined by the instructing party in compliance with
 * settlement rules in the market the transaction will settle in.
 */
@PreviousVersion(SettlementDetails47.class)
@NextVersion(SettlementDetails92.class)
public class SettlementDetails74
		implements
			GeneratedRepoBean<MMMessageComponent> {
}