package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.ServiceLevelCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class ServiceLevelCode extends MMCodeSet {

	private final static AtomicReference<ServiceLevelCode> repoTypeRef = new AtomicReference<>();
	public final MMCode codeSameDayValue = new MMCode() {
		{
			super.owner_lazy = () -> ServiceLevelCode.repoType();
			super.codeName = "SDVA";
			super.name = "SameDayValue";
			super.definition = "Payment must be executed with same day value to the creditor.";
		}
	};
	public final MMCode codeSingleEuroPaymentsArea = new MMCode() {
		{
			super.owner_lazy = () -> ServiceLevelCode.repoType();
			super.codeName = "SEPA";
			super.name = "SingleEuroPaymentsArea";
			super.definition = "Payment must be executed following the Single Euro Payments Area scheme.";
		}
	};
	public final MMCode codeEBAPriorityService = new MMCode() {
		{
			super.owner_lazy = () -> ServiceLevelCode.repoType();
			super.codeName = "PRPT";
			super.name = "EBAPriorityService";
			super.definition = "Transaction must be processed according to the EBA\nPriority Service.";
		}
	};

	public static ServiceLevelCode repoType() {
		repoTypeRef.compareAndSet(null, new ServiceLevelCode());
		return repoTypeRef.get();
	}

	private ServiceLevelCode() {
		super.code = Arrays.asList(codeSameDayValue,
				codeSingleEuroPaymentsArea, codeEBAPriorityService);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ServiceLevelCode";
		super.definition = "Specifies the pre-agreed level of service between the parties.";
		super.example = Arrays.asList("SDVA");
	}
}