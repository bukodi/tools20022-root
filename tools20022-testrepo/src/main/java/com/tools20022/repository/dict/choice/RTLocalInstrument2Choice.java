package com.tools20022.repository.dict.choice;


import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTExternalLocalInstrument1Code;
import com.tools20022.repository.dict.choice.RTLocalInstrument2Choice;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Set of elements that further identifies the type of local instruments being requested by the initiating party.
 */
public class RTLocalInstrument2Choice extends MMChoiceComponent {

	private final static AtomicReference<RTLocalInstrument2Choice> repoTypeRef = new AtomicReference<>();
	/**
	 * Specifies the local instrument, as published in an external local instrument code list.
	 */
	public final MMMessageAttribute attrCode = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTExternalLocalInstrument1Code
					.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTLocalInstrument2Choice
					.repoType();
			super.xmlTag = "Cd";
			super.name = "Code";
			super.definition = "Specifies the local instrument, as published in an external local instrument code list.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies the local instrument, as a proprietary code.
	 */
	public final MMMessageAttribute attrProprietary = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTLocalInstrument2Choice
					.repoType();
			super.xmlTag = "Prtry";
			super.name = "Proprietary";
			super.definition = "Specifies the local instrument, as a proprietary code.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTLocalInstrument2Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTLocalInstrument2Choice());
		return repoTypeRef.get();
	}

	private RTLocalInstrument2Choice() {
		super.messageElement = Arrays.asList(attrCode, attrProprietary);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "LocalInstrument2Choice";
		super.definition = "Set of elements that further identifies the type of local instruments being requested by the initiating party.";
	} }