package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.Max256Text;
import com.tools20022.repository.dict.entity.ElectronicAddress;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class ElectronicAddress extends MMBusinessComponent {

	private final static AtomicReference<ElectronicAddress> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrEmailAddress = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max256Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> ElectronicAddress.repoType();
			super.name = "EmailAddress";
			super.definition = "Address for electronic mail (e-mail).";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static ElectronicAddress repoType() {
		repoTypeRef.compareAndSet(null, new ElectronicAddress());
		return repoTypeRef.get();
	}

	private ElectronicAddress() {
		super.element = Arrays.asList(attrEmailAddress);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ElectronicAddress";
		super.definition = "Address which is accessed by electronic means.";
	}
}