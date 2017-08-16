package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.Reversal2Choice;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.Reversal3Choice;

/**
 * Choice between reversal by reference or by reversal details.
 */
@NextVersion(Reversal2Choice.class)
@NextVersion(Reversal3Choice.class)
public class Reversal1Choice implements GeneratedRepoBean<MMChoiceComponent> {
}