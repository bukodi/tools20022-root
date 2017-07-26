package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.StatusTrail2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.StatusTrail6;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides the history of status and reasons for a pending, posted or cancelled
 * transaction.
 */
@PreviousVersion(StatusTrail2.class)
@NextVersion(StatusTrail6.class)
public class StatusTrail4 {
}