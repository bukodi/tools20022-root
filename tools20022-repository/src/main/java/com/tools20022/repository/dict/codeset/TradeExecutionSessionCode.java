package com.tools20022.repository.dict.codeset;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMCodeSet;

/**
 * Represents a specific market trading session. It is used to identify a
 * portion of the session where the execution might take place ("after market",
 * "pre-market"). It is used to support order routing, quoting, and trade and
 * market data reporting. For instance, orders can be routed to one or more
 * Trading Sessions. Examples of Trading Session usage may be to facilitate
 * extended hours trading, to differentiate between concurrent electronic and
 * open-outcry trading, or to differentiate block and/or oddlot trading. It is
 * used by Exchanges, ECN's, and ATS's.
 */
public class TradeExecutionSessionCode implements GeneratedRepoBean<MMCodeSet> {
}