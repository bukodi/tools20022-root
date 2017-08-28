package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTISODateTime;
import com.tools20022.repository.dict.entity.RTPaymentExecution;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions.
 */
public class RTPaymentExecution extends MMBusinessComponent {

	private final static AtomicReference<RTPaymentExecution> repoTypeRef = new AtomicReference<>();
	/**
	 * Date and time at which the payment execution was created by the instructing agent.
	 */
	public final MMBusinessAttribute attrCreationDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTISODateTime.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPaymentExecution.repoType();
			super.name = "CreationDate";
			super.definition = "Date and time at which the payment execution was created by the instructing agent.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTPaymentExecution repoType() {
		repoTypeRef.compareAndSet(null, new RTPaymentExecution());
		return repoTypeRef.get();
	}

	private RTPaymentExecution() {
		super.element = Arrays.asList(attrCreationDate);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PaymentExecution";
		super.definition = "Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions.";
	} }