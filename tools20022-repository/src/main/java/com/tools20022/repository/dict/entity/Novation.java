package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.ObligationFulfilment;
import com.tools20022.repository.dict.entity.SecuritiesClearing;
import com.tools20022.repository.dict.codeset.NovationStatusCode;

/**
 * Act of either replacing an obligation to perform with a new obligation, or
 * replacing a party to an agreement with a new party.
 */
public class Novation extends ObligationFulfilment {

	private SecuritiesClearing SecuritiesClearing;
	private NovationStatusCode NovationStatus;

	public SecuritiesClearing getSecuritiesClearing() {
		return SecuritiesClearing;
	}

	public void setSecuritiesClearing(SecuritiesClearing SecuritiesClearing) {
		this.SecuritiesClearing = SecuritiesClearing;
	}

	public NovationStatusCode getNovationStatus() {
		return NovationStatus;
	}

	public void setNovationStatus(NovationStatusCode NovationStatus) {
		this.NovationStatus = NovationStatus;
	}
}