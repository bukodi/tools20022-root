package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.StatusReport3;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.StatusReport5;
import com.tools20022.core.repo.NextVersion;

/**
 * Status of the acceptor system containing the identification of the POI (Point
 * Of Interaction), its components and their installed versions.
 */
@PreviousVersion(StatusReport3.class)
@NextVersion(StatusReport5.class)
public class StatusReport4 {
}