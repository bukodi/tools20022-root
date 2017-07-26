package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.Transfer13;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Transfer28;
import com.tools20022.core.repo.NextVersion;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 */
@PreviousVersion(Transfer13.class)
@NextVersion(Transfer28.class)
public class Transfer23 {
}