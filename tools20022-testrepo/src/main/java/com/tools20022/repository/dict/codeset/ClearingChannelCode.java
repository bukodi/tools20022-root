package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.ClearingChannelCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class ClearingChannelCode extends MMCodeSet {

	private final static AtomicReference<ClearingChannelCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeRealTimeGrossSettlementSystem = new MMCode() {
		{
			super.owner_lazy = () -> ClearingChannelCode.repoType();
			super.codeName = "RTGS";
			super.name = "RealTimeGrossSettlementSystem";
			super.definition = "Clearing channel is a real-time gross settlement system.";
		}
	};
	public final MMCode codeRealTimeNetSettlementSystem = new MMCode() {
		{
			super.owner_lazy = () -> ClearingChannelCode.repoType();
			super.codeName = "RTNS";
			super.name = "RealTimeNetSettlementSystem";
			super.definition = "Clearing channel is a real-time net settlement system.";
		}
	};
	public final MMCode codeMassPaymentNetSystem = new MMCode() {
		{
			super.owner_lazy = () -> ClearingChannelCode.repoType();
			super.codeName = "MPNS";
			super.name = "MassPaymentNetSystem";
			super.definition = "Clearing channel is a mass payment net settlement system.";
		}
	};
	public final MMCode codeBookTransfer = new MMCode() {
		{
			super.owner_lazy = () -> ClearingChannelCode.repoType();
			super.codeName = "BOOK";
			super.name = "BookTransfer";
			super.definition = "Payment through internal book transfer.";
		}
	};

	public static ClearingChannelCode repoType() {
		repoTypeRef.compareAndSet(null, new ClearingChannelCode());
		return repoTypeRef.get();
	}

	private ClearingChannelCode() {
		super.code = Arrays.asList(codeRealTimeGrossSettlementSystem,
				codeRealTimeNetSettlementSystem, codeMassPaymentNetSystem,
				codeBookTransfer);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ClearingChannelCode";
		super.definition = "Specifies the clearing channel for the routing of the transaction, as part of the payment type identification.";
		super.example = Arrays.asList("RTGS");
	}
}