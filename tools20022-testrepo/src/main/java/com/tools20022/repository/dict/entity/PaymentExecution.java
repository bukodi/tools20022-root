package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.PaymentExecution;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class PaymentExecution extends MMBusinessComponent {

	private final static AtomicReference<PaymentExecution> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrCreationDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ISODateTime.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PaymentExecution.repoType();
			super.name = "CreationDate";
			super.definition = "Date and time at which the payment execution was created by the instructing agent.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static PaymentExecution repoType() {
		repoTypeRef.compareAndSet(null, new PaymentExecution());
		return repoTypeRef.get();
	}

	private PaymentExecution() {
		super.element = Arrays.asList(attrCreationDate);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PaymentExecution";
		super.definition = "Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions.";
	}
}