package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.SettlementDetails45;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.SettlementDetails90;
import com.tools20022.core.repo.NextVersion;

/**
 * Parameters which explicitly state the conditions that must be fulfilled
 * before a particular transaction of a financial instrument can be settled.
 * These parameters are defined by the instructing party in compliance with
 * settlement rules in the market the transaction will settle in.
 */
@PreviousVersion(SettlementDetails45.class)
@NextVersion(SettlementDetails90.class)
public class SettlementDetails70 {
}