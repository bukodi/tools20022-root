package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.NamePrefix1Code;
import com.tools20022.repository.dict.entity.PersonName;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class PersonName extends MMBusinessComponent {

	private final static AtomicReference<PersonName> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrNamePrefix = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> NamePrefix1Code.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PersonName.repoType();
			super.name = "NamePrefix";
			super.definition = "Specifies the terms used to formally address a person.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static PersonName repoType() {
		repoTypeRef.compareAndSet(null, new PersonName());
		return repoTypeRef.get();
	}

	private PersonName() {
		super.element = Arrays.asList(attrNamePrefix);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PersonName";
		super.definition = "Name by which a person is known and that is usually used to identify that person.";
	}
}