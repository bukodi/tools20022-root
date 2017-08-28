package com.tools20022.repository.dict.choice;


import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTExternalClearingSystemIdentification1Code;
import com.tools20022.repository.dict.choice.RTClearingSystemIdentification2Choice;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Choice of a clearing system identifier.
 */
public class RTClearingSystemIdentification2Choice extends MMChoiceComponent {

	private final static AtomicReference<RTClearingSystemIdentification2Choice> repoTypeRef = new AtomicReference<>();
	/**
	 * Identification of a clearing system, in a coded form as published in an external list.
	 */
	public final MMMessageAttribute attrCode = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTExternalClearingSystemIdentification1Code
					.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTClearingSystemIdentification2Choice
					.repoType();
			super.xmlTag = "Cd";
			super.name = "Code";
			super.definition = "Identification of a clearing system, in a coded form as published in an external list.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Identification code for a clearing system, that has not yet been identified in the list of clearing systems.
	 */
	public final MMMessageAttribute attrProprietary = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTClearingSystemIdentification2Choice
					.repoType();
			super.xmlTag = "Prtry";
			super.name = "Proprietary";
			super.definition = "Identification code for a clearing system, that has not yet been identified in the list of clearing systems.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTClearingSystemIdentification2Choice repoType() {
		repoTypeRef.compareAndSet(null,
				new RTClearingSystemIdentification2Choice());
		return repoTypeRef.get();
	}

	private RTClearingSystemIdentification2Choice() {
		super.messageElement = Arrays.asList(attrCode, attrProprietary);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ClearingSystemIdentification2Choice";
		super.definition = "Choice of a clearing system identifier.";
	} }