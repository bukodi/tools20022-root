package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CardTransaction15;
import com.tools20022.core.repo.PreviousVersion;

/**
 * Identification of the original transaction. It corresponds to ISO 8583, field
 * number 90 for the version 87, and 56 for the other versions.
 */
@PreviousVersion(CardTransaction15.class)
public class CardTransaction3 implements GeneratedRepoBean<MMMessageComponent> {
}