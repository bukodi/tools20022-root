package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.Proposal2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Proposal4;
import com.tools20022.core.repo.NextVersion;

/**
 * Indicates the type of proposal and if the proposal is for the variation
 * margin and the segregated independent amount, or the segregated independent
 * amount only.
 */
@PreviousVersion(Proposal2.class)
@NextVersion(Proposal4.class)
public class Proposal3 implements GeneratedRepoBean<MMMessageComponent> {
}