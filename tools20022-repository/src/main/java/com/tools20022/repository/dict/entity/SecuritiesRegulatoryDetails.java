package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.OrderClassificationCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.SecuritiesOrder;

/**
 * Information related to order and required for regulatory purposes.
 */
public class SecuritiesRegulatoryDetails extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private OrderClassificationCode OrderRestrictions;
	private YesNoIndicator BrokerSolicitedTrade;
	private SecuritiesOrder RelatedOrder;

	public OrderClassificationCode getOrderRestrictions() {
		return OrderRestrictions;
	}

	public void setOrderRestrictions(OrderClassificationCode OrderRestrictions) {
		this.OrderRestrictions = OrderRestrictions;
	}

	public YesNoIndicator getBrokerSolicitedTrade() {
		return BrokerSolicitedTrade;
	}

	public void setBrokerSolicitedTrade(YesNoIndicator BrokerSolicitedTrade) {
		this.BrokerSolicitedTrade = BrokerSolicitedTrade;
	}

	public SecuritiesOrder getRelatedOrder() {
		return RelatedOrder;
	}

	public void setRelatedOrder(SecuritiesOrder RelatedOrder) {
		this.RelatedOrder = RelatedOrder;
	}
}