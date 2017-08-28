package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTClearingChannelCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the clearing channel for the routing of the transaction, as part of the payment type identification.
 */
public class RTClearingChannelCode extends MMCodeSet {

	private final static AtomicReference<RTClearingChannelCode> repoTypeRef = new AtomicReference<>();
	/**
	 * Clearing channel is a real-time gross settlement system.
	 */
	public final MMCode codeRealTimeGrossSettlementSystem = new MMCode() {
		{
			super.owner_lazy = () -> RTClearingChannelCode.repoType();
			super.codeName = "RTGS";
			super.name = "RealTimeGrossSettlementSystem";
			super.definition = "Clearing channel is a real-time gross settlement system.";
		}
	};
	/**
	 * Clearing channel is a real-time net settlement system.
	 */
	public final MMCode codeRealTimeNetSettlementSystem = new MMCode() {
		{
			super.owner_lazy = () -> RTClearingChannelCode.repoType();
			super.codeName = "RTNS";
			super.name = "RealTimeNetSettlementSystem";
			super.definition = "Clearing channel is a real-time net settlement system.";
		}
	};
	/**
	 * Clearing channel is a mass payment net settlement system.
	 */
	public final MMCode codeMassPaymentNetSystem = new MMCode() {
		{
			super.owner_lazy = () -> RTClearingChannelCode.repoType();
			super.codeName = "MPNS";
			super.name = "MassPaymentNetSystem";
			super.definition = "Clearing channel is a mass payment net settlement system.";
		}
	};
	/**
	 * Payment through internal book transfer.
	 */
	public final MMCode codeBookTransfer = new MMCode() {
		{
			super.owner_lazy = () -> RTClearingChannelCode.repoType();
			super.codeName = "BOOK";
			super.name = "BookTransfer";
			super.definition = "Payment through internal book transfer.";
		}
	};

	public static RTClearingChannelCode repoType() {
		repoTypeRef.compareAndSet(null, new RTClearingChannelCode());
		return repoTypeRef.get();
	}

	private RTClearingChannelCode() {
		super.code = Arrays.asList(codeRealTimeGrossSettlementSystem,
				codeRealTimeNetSettlementSystem, codeMassPaymentNetSystem,
				codeBookTransfer);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ClearingChannelCode";
		super.definition = "Specifies the clearing channel for the routing of the transaction, as part of the payment type identification.";
		super.example = Arrays.asList("RTGS");
	} }