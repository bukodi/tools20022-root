package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.choice.NameOrSector1Choice;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.ReportedPartyIdentification1;

/**
 * Provides the identification of the reported party through the sector and the
 * location.
 */
@NextVersion(NameOrSector1Choice.class)
@NextVersion(ReportedPartyIdentification1.class)
public class SectorAndLocation1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}