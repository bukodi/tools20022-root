package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.ReceivingSettlementParty;

/**
 * Organisation holding securities to enable book entry transfer of securities.
 * These organisations may also carry out centralised comparison and transaction
 * processing such as clearing and settlement of securities. The physical
 * securities may be immobilised by the depository, or securities may be
 * dematerialised (so that they exist only as electronic records). Also
 * responsible for compliance of the portfolio with legal ratios etc. The
 * depository may delegate custody to another entity (custodian).
 */
public class ReceivingDepositoryRole extends ReceivingSettlementParty
		implements
			GeneratedRepoBean<MMBusinessComponent> {
}