package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.StatusReport2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.StatusReport4;
import com.tools20022.core.repo.NextVersion;

/**
 * Status of the acceptor system containing the identification of the POI (Point
 * Of Interaction), its components and their installed versions.
 */
@PreviousVersion(StatusReport2.class)
@NextVersion(StatusReport4.class)
public class StatusReport3 {
}