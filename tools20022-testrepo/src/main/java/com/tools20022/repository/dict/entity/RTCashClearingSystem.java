package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.RTCashClearingSystemCode;
import com.tools20022.repository.dict.entity.RTCashClearingSystem;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Clearing system that processes only cash transfers.
 */
public class RTCashClearingSystem extends MMBusinessComponent {

	private final static AtomicReference<RTCashClearingSystem> repoTypeRef = new AtomicReference<>();
	/**
	 * Information used to identify a cash clearing system.
	 */
	public final MMBusinessAttribute attrIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTCashClearingSystemCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCashClearingSystem.repoType();
			super.name = "Identification";
			super.definition = "Information used to identify a cash clearing system.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTCashClearingSystem repoType() {
		repoTypeRef.compareAndSet(null, new RTCashClearingSystem());
		return repoTypeRef.get();
	}

	private RTCashClearingSystem() {
		super.element = Arrays.asList(attrIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CashClearingSystem";
		super.definition = "Clearing system that processes only cash transfers.";
	} }