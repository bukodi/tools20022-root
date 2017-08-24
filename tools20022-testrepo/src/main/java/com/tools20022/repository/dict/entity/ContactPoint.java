package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.AnyBICIdentifier;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.Party;
import com.tools20022.repository.GeneratedRepository;

public class ContactPoint extends MMBusinessComponent {

	private final static AtomicReference<ContactPoint> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrBICAddress = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> AnyBICIdentifier.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> ContactPoint.repoType();
			super.name = "BICAddress";
			super.definition = "BIC address which identifies the contact point.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrTemporaryIndicator = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> YesNoIndicator.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> ContactPoint.repoType();
			super.name = "TemporaryIndicator";
			super.definition = "Indicates whether the address is a temporary address.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static ContactPoint repoType() {
		repoTypeRef.compareAndSet(null, new ContactPoint());
		return repoTypeRef.get();
	}

	private ContactPoint() {
		super.element = Arrays.asList(attrBICAddress, attrTemporaryIndicator);
		super.associationDomain_lazy = () -> Arrays
				.asList(Party.repoType().refContactPoint);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ContactPoint";
		super.definition = "Number, physical or virtual address, used for communication.";
	}
}