package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.AccountIdentification18Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.AccountIdentification23Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Choice between all accounts (GENR - General in ISO 15022) or one or more
 * selected accounts and balance information.
 */
@PreviousVersion(AccountIdentification18Choice.class)
@NextVersion(AccountIdentification23Choice.class)
public class AccountIdentification21Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}