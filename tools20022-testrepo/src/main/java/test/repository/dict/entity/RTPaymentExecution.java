package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTISODateTime;
import test.repository.dict.entity.RTPaymentExecution;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPaymentExecution extends MMBusinessComponent {

	private final static AtomicReference<RTPaymentExecution> repoTypeRef = new AtomicReference<>();

	public static RTPaymentExecution repoType() {
		repoTypeRef.compareAndSet(null, new RTPaymentExecution());
		return repoTypeRef.get();
	}

	private RTPaymentExecution() {
		super.element = Arrays.asList(CreationDate.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PaymentExecution";
		super.definition = "Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions.";
	}

	static public class CreationDate extends MMBusinessAttribute {
		private final static AtomicReference<CreationDate> repoTypeRef = new AtomicReference<>();

		public static CreationDate repoType() {
			repoTypeRef.compareAndSet(null, new CreationDate());
			return repoTypeRef.get();
		}

		private CreationDate() {
			super.simpleType_lazy = () -> RTISODateTime.repoType();
			super.elementContext_lazy = () -> RTPaymentExecution.repoType();
			super.isDerived = false;
			super.name = "CreationDate";
			super.definition = "Date and time at which the payment execution was created by the instructing agent.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}