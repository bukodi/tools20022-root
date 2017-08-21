package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTMax35Text;
import test.repository.dict.entity.RTPaymentIdentification;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPaymentIdentification extends MMBusinessComponent {

	private final static AtomicReference<RTPaymentIdentification> repoTypeRef = new AtomicReference<>();

	public static RTPaymentIdentification repoType() {
		repoTypeRef.compareAndSet(null, new RTPaymentIdentification());
		return repoTypeRef.get();
	}

	private RTPaymentIdentification() {
		super.element = Arrays.asList(ExecutionIdentification.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PaymentIdentification";
		super.definition = "Specifies the different identifications associated with a payment transaction.";
	}

	static public class ExecutionIdentification extends MMBusinessAttribute {
		private final static AtomicReference<ExecutionIdentification> repoTypeRef = new AtomicReference<>();

		public static ExecutionIdentification repoType() {
			repoTypeRef.compareAndSet(null, new ExecutionIdentification());
			return repoTypeRef.get();
		}

		private ExecutionIdentification() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPaymentIdentification
					.repoType();
			super.isDerived = false;
			super.name = "ExecutionIdentification";
			super.definition = "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}