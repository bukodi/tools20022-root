package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.RTNamePrefix1Code;
import com.tools20022.repository.dict.entity.RTPersonName;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Name by which a person is known and that is usually used to identify that person.
 */
public class RTPersonName extends MMBusinessComponent {

	private final static AtomicReference<RTPersonName> repoTypeRef = new AtomicReference<>();
	/**
	 * Specifies the terms used to formally address a person.
	 */
	public final MMBusinessAttribute attrNamePrefix = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTNamePrefix1Code.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPersonName.repoType();
			super.name = "NamePrefix";
			super.definition = "Specifies the terms used to formally address a person.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTPersonName repoType() {
		repoTypeRef.compareAndSet(null, new RTPersonName());
		return repoTypeRef.get();
	}

	private RTPersonName() {
		super.element = Arrays.asList(attrNamePrefix);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PersonName";
		super.definition = "Name by which a person is known and that is usually used to identify that person.";
	} }