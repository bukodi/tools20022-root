package com.tools20022.repository.dict.codeset;

import com.tools20022.repository.dict.codeset.FailingReason2Code;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.codeset.FailingReason3Code;

/**
 * Specifies the reason the transaction/instruction is failing settlement.
 * Settlement on the instructed settlement date is no longer possible.
 */
@NextVersion(FailingReason2Code.class)
@NextVersion(FailingReason3Code.class)
public class FailingReason1Code {
}