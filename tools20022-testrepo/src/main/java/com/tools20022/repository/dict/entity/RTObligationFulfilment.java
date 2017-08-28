package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTISODate;
import com.tools20022.repository.dict.entity.RTObligationFulfilment;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Processes by which an obligation is extinguished fully or partially.
 */
public class RTObligationFulfilment extends MMBusinessComponent {

	private final static AtomicReference<RTObligationFulfilment> repoTypeRef = new AtomicReference<>();
	/**
	 * Date and time on which assets become available.
	 */
	public final MMBusinessAttribute attrDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTISODate.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTObligationFulfilment.repoType();
			super.name = "Date";
			super.definition = "Date and time on which assets become available.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTObligationFulfilment repoType() {
		repoTypeRef.compareAndSet(null, new RTObligationFulfilment());
		return repoTypeRef.get();
	}

	private RTObligationFulfilment() {
		super.element = Arrays.asList(attrDate);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ObligationFulfilment";
		super.definition = "Processes by which an obligation is extinguished fully or partially.";
	} }