package com.tools20022.repository.dict.choice;


import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTExternalCategoryPurpose1Code;
import com.tools20022.repository.dict.choice.RTCategoryPurpose1Choice;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the high level purpose of the instruction based on a set of pre-defined categories.
Usage: This is used by the initiating party to provide information concerning the processing of the payment. It is likely to trigger special processing by any of the agents involved in the payment chain.
 */
public class RTCategoryPurpose1Choice extends MMChoiceComponent {

	private final static AtomicReference<RTCategoryPurpose1Choice> repoTypeRef = new AtomicReference<>();
	/**
	 * Category purpose, as published in an external category purpose code list.
	 */
	public final MMMessageAttribute attrCode = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTExternalCategoryPurpose1Code
					.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTCategoryPurpose1Choice
					.repoType();
			super.xmlTag = "Cd";
			super.name = "Code";
			super.definition = "Category purpose, as published in an external category purpose code list.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Category purpose, in a proprietary form.
	 */
	public final MMMessageAttribute attrProprietary = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTCategoryPurpose1Choice
					.repoType();
			super.xmlTag = "Prtry";
			super.name = "Proprietary";
			super.definition = "Category purpose, in a proprietary form.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTCategoryPurpose1Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTCategoryPurpose1Choice());
		return repoTypeRef.get();
	}

	private RTCategoryPurpose1Choice() {
		super.messageElement = Arrays.asList(attrCode, attrProprietary);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CategoryPurpose1Choice";
		super.definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.\nUsage: This is used by the initiating party to provide information concerning the processing of the payment. It is likely to trigger special processing by any of the agents involved in the payment chain.";
	} }