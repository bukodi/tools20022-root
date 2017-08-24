package com.tools20022.repository.catalogue.area;

import com.tools20022.metamodel.MMBusinessArea;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.catalogue.msgdef.pain.MandateInitiationRequestV05;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class PaymentsInitiationLatestVersion extends MMBusinessArea {

	private final static AtomicReference<PaymentsInitiationLatestVersion> repoTypeRef = new AtomicReference<>();

	public static PaymentsInitiationLatestVersion repoType() {
		repoTypeRef.compareAndSet(null, new PaymentsInitiationLatestVersion());
		return repoTypeRef.get();
	}

	private PaymentsInitiationLatestVersion() {
		super.code = "pain";
		super.messageDefinition = Arrays.asList(MandateInitiationRequestV05
				.repoType());
		super.businessProcessCatalogue_lazy = () -> GeneratedRepository
				.repoType().catalogue;
		super.name = "Payments Initiation - Latest version - master";
		super.definition = "Messages that support the initiation of a payment from the ordering customer to a financial institution that services a cash account and reporting its status";
	}
}