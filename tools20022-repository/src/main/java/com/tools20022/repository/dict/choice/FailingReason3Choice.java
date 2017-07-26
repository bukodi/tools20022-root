package com.tools20022.repository.dict.choice;

import com.tools20022.repository.dict.choice.FailingReason1Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.FailingReason5Choice;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.FailingReason8Choice;

/**
 * Choice of format for the failing reason.
 */
@PreviousVersion(FailingReason1Choice.class)
@NextVersion(FailingReason5Choice.class)
@NextVersion(FailingReason8Choice.class)
public class FailingReason3Choice {
}