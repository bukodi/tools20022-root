package com.tools20022.repository.dict.choice;


import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTExternalPersonIdentification1Code;
import com.tools20022.repository.dict.choice.RTPersonIdentificationSchemeName1Choice;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Sets of elements to identify a name of the identification scheme.
 */
public class RTPersonIdentificationSchemeName1Choice extends MMChoiceComponent {

	private final static AtomicReference<RTPersonIdentificationSchemeName1Choice> repoTypeRef = new AtomicReference<>();
	/**
	 * Name of the identification scheme, in a coded form as published in an external list.
	 */
	public final MMMessageAttribute attrCode = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTExternalPersonIdentification1Code
					.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPersonIdentificationSchemeName1Choice
					.repoType();
			super.xmlTag = "Cd";
			super.name = "Code";
			super.definition = "Name of the identification scheme, in a coded form as published in an external list.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Name of the identification scheme, in a free text form.
	 */
	public final MMMessageAttribute attrProprietary = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPersonIdentificationSchemeName1Choice
					.repoType();
			super.xmlTag = "Prtry";
			super.name = "Proprietary";
			super.definition = "Name of the identification scheme, in a free text form.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTPersonIdentificationSchemeName1Choice repoType() {
		repoTypeRef.compareAndSet(null,
				new RTPersonIdentificationSchemeName1Choice());
		return repoTypeRef.get();
	}

	private RTPersonIdentificationSchemeName1Choice() {
		super.messageElement = Arrays.asList(attrCode, attrProprietary);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PersonIdentificationSchemeName1Choice";
		super.definition = "Sets of elements to identify a name of the identification scheme.";
	} }