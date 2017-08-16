package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.GrossDividendRateFormat9Choice;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.GrossDividendRateFormat7Choice;

/**
 * Choice between an amount or an unspecified rate.
 */
@NextVersion(GrossDividendRateFormat9Choice.class)
@NextVersion(GrossDividendRateFormat7Choice.class)
public class GrossDividendRateFormat5Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}