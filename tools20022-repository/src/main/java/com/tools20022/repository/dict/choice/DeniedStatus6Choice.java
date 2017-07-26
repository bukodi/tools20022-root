package com.tools20022.repository.dict.choice;

import com.tools20022.repository.dict.choice.DeniedStatus2Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.DeniedStatus10Choice;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.DeniedStatus16Choice;

/**
 * Specifies whether the status is provided with a reason or not.
 */
@PreviousVersion(DeniedStatus2Choice.class)
@NextVersion(DeniedStatus10Choice.class)
@NextVersion(DeniedStatus16Choice.class)
public class DeniedStatus6Choice {
}