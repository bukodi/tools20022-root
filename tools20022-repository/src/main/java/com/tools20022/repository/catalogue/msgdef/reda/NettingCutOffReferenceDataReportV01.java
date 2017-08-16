package com.tools20022.repository.catalogue.msgdef.reda;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.NettingCutOffReportData1;
import com.tools20022.repository.dict.msg.CutOffData1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The Netting Cut Off Reference Data Report message is sent to a participant by
 * a central system to provide details of scheduled, changed, existing and
 * previous netting cut off data held at a central system.
 */
public class NettingCutOffReferenceDataReportV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private NettingCutOffReportData1 ReportData;
	private CutOffData1 ParticipantNettingCutOffData;
	private Optional<SupplementaryData1> SupplementaryData;

	public NettingCutOffReportData1 getReportData() {
		return ReportData;
	}

	public void setReportData(NettingCutOffReportData1 ReportData) {
		this.ReportData = ReportData;
	}

	public CutOffData1 getParticipantNettingCutOffData() {
		return ParticipantNettingCutOffData;
	}

	public void setParticipantNettingCutOffData(
			CutOffData1 ParticipantNettingCutOffData) {
		this.ParticipantNettingCutOffData = ParticipantNettingCutOffData;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}