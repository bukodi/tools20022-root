package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.PaymentIdentification;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class PaymentIdentification extends MMBusinessComponent {

	private final static AtomicReference<PaymentIdentification> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrExecutionIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PaymentIdentification.repoType();
			super.name = "ExecutionIdentification";
			super.definition = "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static PaymentIdentification repoType() {
		repoTypeRef.compareAndSet(null, new PaymentIdentification());
		return repoTypeRef.get();
	}

	private PaymentIdentification() {
		super.element = Arrays.asList(attrExecutionIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PaymentIdentification";
		super.definition = "Specifies the different identifications associated with a payment transaction.";
	}
}