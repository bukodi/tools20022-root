package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.ServiceLevelCode;
import com.tools20022.repository.dict.entity.ServiceLevel;
import com.tools20022.repository.dict.codeset.SWIFTServiceLevelCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.PaymentProcessing;
import com.tools20022.repository.GeneratedRepository;

public class ServiceLevel extends MMBusinessComponent {

	private final static AtomicReference<ServiceLevel> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> ServiceLevelCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> ServiceLevel.repoType();
			super.name = "Code";
			super.definition = "Identification of a pre-agreed level of service between the parties in a coded form.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrOther = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> SWIFTServiceLevelCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> ServiceLevel.repoType();
			super.name = "Other";
			super.definition = "SWIFT defined service level applies to the payment instruction.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrBilateral = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> ServiceLevel.repoType();
			super.name = "Bilateral";
			super.definition = "Unambiguous identification of a pre-agreed level of service between the parties.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static ServiceLevel repoType() {
		repoTypeRef.compareAndSet(null, new ServiceLevel());
		return repoTypeRef.get();
	}

	private ServiceLevel() {
		super.element = Arrays.asList(attrCode, attrOther, attrBilateral);
		super.associationDomain_lazy = () -> Arrays.asList(PaymentProcessing
				.repoType().refServiceLevel);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ServiceLevel";
		super.definition = "Agreement under which or rules under which the transaction should be processed.";
	}
}