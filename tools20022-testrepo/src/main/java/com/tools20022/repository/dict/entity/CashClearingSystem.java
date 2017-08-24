package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.CashClearingSystemCode;
import com.tools20022.repository.dict.entity.CashClearingSystem;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class CashClearingSystem extends MMBusinessComponent {

	private final static AtomicReference<CashClearingSystem> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> CashClearingSystemCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> CashClearingSystem.repoType();
			super.name = "Identification";
			super.definition = "Information used to identify a cash clearing system.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static CashClearingSystem repoType() {
		repoTypeRef.compareAndSet(null, new CashClearingSystem());
		return repoTypeRef.get();
	}

	private CashClearingSystem() {
		super.element = Arrays.asList(attrIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CashClearingSystem";
		super.definition = "Clearing system that processes only cash transfers.";
	}
}