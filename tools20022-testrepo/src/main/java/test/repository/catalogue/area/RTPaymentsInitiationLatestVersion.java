package test.repository.catalogue.area;

import com.tools20022.metamodel.MMBusinessArea;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.catalogue.msgdef.pain.RTMandateInitiationRequestV05;
import java.util.Arrays;
import test.repository.GeneratedRepository.BusinessProcessCatalogue;

public class RTPaymentsInitiationLatestVersion extends MMBusinessArea {

	private final static AtomicReference<RTPaymentsInitiationLatestVersion> repoTypeRef = new AtomicReference<>();

	public static RTPaymentsInitiationLatestVersion repoType() {
		repoTypeRef
				.compareAndSet(null, new RTPaymentsInitiationLatestVersion());
		return repoTypeRef.get();
	}

	private RTPaymentsInitiationLatestVersion() {
		super.code = "pain";
		super.messageDefinition = Arrays.asList(RTMandateInitiationRequestV05
				.repoType());
		super.businessProcessCatalogue_lazy = () -> BusinessProcessCatalogue
				.repoType();
		super.name = "Payments Initiation - Latest version - master";
		super.definition = "Messages that support the initiation of a payment from the ordering customer to a financial institution that services a cash account and reporting its status";
	}
}