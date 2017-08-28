package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.entity.RTPaymentIdentification;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the different identifications associated with a payment transaction.
 */
public class RTPaymentIdentification extends MMBusinessComponent {

	private final static AtomicReference<RTPaymentIdentification> repoTypeRef = new AtomicReference<>();
	/**
	 * Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party.
	 */
	public final MMBusinessAttribute attrExecutionIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPaymentIdentification
					.repoType();
			super.name = "ExecutionIdentification";
			super.definition = "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTPaymentIdentification repoType() {
		repoTypeRef.compareAndSet(null, new RTPaymentIdentification());
		return repoTypeRef.get();
	}

	private RTPaymentIdentification() {
		super.element = Arrays.asList(attrExecutionIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PaymentIdentification";
		super.definition = "Specifies the different identifications associated with a payment transaction.";
	} }