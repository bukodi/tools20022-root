package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.ActionMessage2;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.ActionMessage5;

/**
 * Message to be displayed to the cardholder or the cashier.
 */
@NextVersion(ActionMessage2.class)
@NextVersion(ActionMessage5.class)
public class ActionMessage1 implements GeneratedRepoBean<MMMessageComponent> {
}