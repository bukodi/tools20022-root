package com.tools20022.repository.dict.choice;

import com.tools20022.repository.dict.choice.AccountIdentification21Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.AccountIdentification32Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Choice between all accounts (GENR - General in ISO 15022) or one or more
 * selected accounts and balance information.
 */
@PreviousVersion(AccountIdentification21Choice.class)
@NextVersion(AccountIdentification32Choice.class)
public class AccountIdentification23Choice {
}