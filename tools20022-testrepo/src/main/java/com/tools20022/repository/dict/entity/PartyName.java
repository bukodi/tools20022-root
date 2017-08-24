package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.entity.PartyName;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class PartyName extends MMBusinessComponent {

	private final static AtomicReference<PartyName> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max140Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PartyName.repoType();
			super.name = "Name";
			super.definition = "Name by which a party is known and which is usually used to identify that party. This name is derived from the concatenation of the elements that compose the name of a person or from the legal name of an organisation.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static PartyName repoType() {
		repoTypeRef.compareAndSet(null, new PartyName());
		return repoTypeRef.get();
	}

	private PartyName() {
		super.element = Arrays.asList(attrName);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PartyName";
		super.definition = "Name by which a party is known and which is usually used to identify that party.";
	}
}