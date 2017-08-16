package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.OptionFeaturesFormat5Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.OptionFeaturesFormat12Choice;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.OptionFeaturesFormat17Choice;

/**
 * Choice between a standard code or a proprietary code to specify the features
 * that may apply to a corporate action option.
 */
@PreviousVersion(OptionFeaturesFormat5Choice.class)
@NextVersion(OptionFeaturesFormat12Choice.class)
@NextVersion(OptionFeaturesFormat17Choice.class)
public class OptionFeaturesFormat9Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}