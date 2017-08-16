package com.tools20022.repository.catalogue.msgdef.reda;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.RequestData1;
import com.tools20022.repository.dict.msg.NettingCutOff1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The Netting Cut Off Reference Data Update Request message is sent to a
 * central system by a participant to request an update to a participant's
 * netting cut off held at the central system.
 */
public class NettingCutOffReferenceDataUpdateRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private RequestData1 RequestData;
	private NettingCutOff1 NettingCutOffRequest;
	private Optional<SupplementaryData1> SupplementaryData;

	public RequestData1 getRequestData() {
		return RequestData;
	}

	public void setRequestData(RequestData1 RequestData) {
		this.RequestData = RequestData;
	}

	public NettingCutOff1 getNettingCutOffRequest() {
		return NettingCutOffRequest;
	}

	public void setNettingCutOffRequest(NettingCutOff1 NettingCutOffRequest) {
		this.NettingCutOffRequest = NettingCutOffRequest;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}