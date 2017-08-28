package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.datatype.RTMax140Text;
import com.tools20022.repository.dict.entity.RTPartyName;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Name by which a party is known and which is usually used to identify that party.
 */
public class RTPartyName extends MMBusinessComponent {

	private final static AtomicReference<RTPartyName> repoTypeRef = new AtomicReference<>();
	/**
	 * Name by which a party is known and which is usually used to identify that party. This name is derived from the concatenation of the elements that compose the name of a person or from the legal name of an organisation.
	 */
	public final MMBusinessAttribute attrName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax140Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPartyName.repoType();
			super.name = "Name";
			super.definition = "Name by which a party is known and which is usually used to identify that party. This name is derived from the concatenation of the elements that compose the name of a person or from the legal name of an organisation.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTPartyName repoType() {
		repoTypeRef.compareAndSet(null, new RTPartyName());
		return repoTypeRef.get();
	}

	private RTPartyName() {
		super.element = Arrays.asList(attrName);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PartyName";
		super.definition = "Name by which a party is known and which is usually used to identify that party.";
	} }