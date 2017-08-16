package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.Reversal1Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.Reversal5Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Choice between reversal by reference or by reversal details.
 */
@PreviousVersion(Reversal1Choice.class)
@NextVersion(Reversal5Choice.class)
public class Reversal3Choice implements GeneratedRepoBean<MMChoiceComponent> {
}