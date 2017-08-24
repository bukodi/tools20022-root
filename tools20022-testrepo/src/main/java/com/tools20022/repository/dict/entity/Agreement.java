package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.Agreement;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.Document;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class Agreement extends MMBusinessComponent {

	private final static AtomicReference<Agreement> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrDescription = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max350Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Agreement.repoType();
			super.name = "Description";
			super.definition = "Full name of an agreement, annexes and amendments in place between the principals.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAssociationEnd refValidityPeriod = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> DateTimePeriod.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Agreement.repoType();
			super.name = "ValidityPeriod";
			super.definition = "Period during which the agreement is valid";
			super.minOccurs = 0;
		}
	};
	public final MMBusinessAssociationEnd refDocument = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> Document.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Agreement.repoType();
			super.name = "Document";
			super.definition = "Document which materialises the agreement.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static Agreement repoType() {
		repoTypeRef.compareAndSet(null, new Agreement());
		return repoTypeRef.get();
	}

	private Agreement() {
		super.element = Arrays.asList(attrDescription, refValidityPeriod,
				refDocument);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Agreement";
		super.definition = "Contractual details related to an agreement between parties.";
	}
}