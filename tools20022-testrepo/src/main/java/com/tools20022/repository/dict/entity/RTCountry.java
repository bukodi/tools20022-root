package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.RTCountryCode;
import com.tools20022.repository.dict.entity.RTCountry;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Nation with its own government.
 */
public class RTCountry extends MMBusinessComponent {

	private final static AtomicReference<RTCountry> repoTypeRef = new AtomicReference<>();
	/**
	 * Identifies a nation with its own government (ISO 3166).
	 */
	public final MMBusinessAttribute attrCode = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTCountryCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTCountry.repoType();
			super.name = "Code";
			super.definition = "Identifies a nation with its own government (ISO 3166).";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTCountry repoType() {
		repoTypeRef.compareAndSet(null, new RTCountry());
		return repoTypeRef.get();
	}

	private RTCountry() {
		super.element = Arrays.asList(attrCode);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Country";
		super.definition = "Nation with its own government.";
	} }