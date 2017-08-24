package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.ObligationFulfilment;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class ObligationFulfilment extends MMBusinessComponent {

	private final static AtomicReference<ObligationFulfilment> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrDate = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ISODate.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> ObligationFulfilment.repoType();
			super.name = "Date";
			super.definition = "Date and time on which assets become available.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static ObligationFulfilment repoType() {
		repoTypeRef.compareAndSet(null, new ObligationFulfilment());
		return repoTypeRef.get();
	}

	private ObligationFulfilment() {
		super.element = Arrays.asList(attrDate);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ObligationFulfilment";
		super.definition = "Processes by which an obligation is extinguished fully or partially.";
	}
}