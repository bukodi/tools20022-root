package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.ServiceLevelCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class ServiceLevelCode extends MMCodeSet {

	private final static AtomicReference<ServiceLevelCode> repoTypeRef = new AtomicReference<>();

	public static ServiceLevelCode repoType() {
		repoTypeRef.compareAndSet(null, new ServiceLevelCode());
		return repoTypeRef.get();
	}

	private ServiceLevelCode() {
		super.code = Arrays.asList(SameDayValue.repoType(),
				SingleEuroPaymentsArea.repoType(),
				EBAPriorityService.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("SDVA");
		super.name = "ServiceLevelCode";
		super.definition = "Specifies the pre-agreed level of service between the parties.";
	}

	static public class SameDayValue extends MMCode {
		private final static AtomicReference<SameDayValue> repoTypeRef = new AtomicReference<>();

		public static SameDayValue repoType() {
			repoTypeRef.compareAndSet(null, new SameDayValue());
			return repoTypeRef.get();
		}

		private SameDayValue() {
			super.owner_lazy = () -> ServiceLevelCode.repoType();
			super.codeName = "SDVA";
			super.name = "SameDayValue";
			super.definition = "Payment must be executed with same day value to the creditor.";
		}
	}

	static public class SingleEuroPaymentsArea extends MMCode {
		private final static AtomicReference<SingleEuroPaymentsArea> repoTypeRef = new AtomicReference<>();

		public static SingleEuroPaymentsArea repoType() {
			repoTypeRef.compareAndSet(null, new SingleEuroPaymentsArea());
			return repoTypeRef.get();
		}

		private SingleEuroPaymentsArea() {
			super.owner_lazy = () -> ServiceLevelCode.repoType();
			super.codeName = "SEPA";
			super.name = "SingleEuroPaymentsArea";
			super.definition = "Payment must be executed following the Single Euro Payments Area scheme.";
		}
	}

	static public class EBAPriorityService extends MMCode {
		private final static AtomicReference<EBAPriorityService> repoTypeRef = new AtomicReference<>();

		public static EBAPriorityService repoType() {
			repoTypeRef.compareAndSet(null, new EBAPriorityService());
			return repoTypeRef.get();
		}

		private EBAPriorityService() {
			super.owner_lazy = () -> ServiceLevelCode.repoType();
			super.codeName = "PRPT";
			super.name = "EBAPriorityService";
			super.definition = "Transaction must be processed according to the EBA\nPriority Service.";
		}
	}
}