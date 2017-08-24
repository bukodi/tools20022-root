package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.CountryCode;
import com.tools20022.repository.dict.entity.Country;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class Country extends MMBusinessComponent {

	private final static AtomicReference<Country> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> CountryCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Country.repoType();
			super.name = "Code";
			super.definition = "Identifies a nation with its own government (ISO 3166).";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static Country repoType() {
		repoTypeRef.compareAndSet(null, new Country());
		return repoTypeRef.get();
	}

	private Country() {
		super.element = Arrays.asList(attrCode);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Country";
		super.definition = "Nation with its own government.";
	}
}