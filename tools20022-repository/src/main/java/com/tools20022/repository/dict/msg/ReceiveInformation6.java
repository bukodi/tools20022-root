package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.ReceiveInformation4;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.ReceiveInformation11;
import com.tools20022.core.repo.NextVersion;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 */
@PreviousVersion(ReceiveInformation4.class)
@NextVersion(ReceiveInformation11.class)
public class ReceiveInformation6 {
}