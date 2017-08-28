package com.tools20022.repository.dict.choice;


import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTFrequency10Code;
import com.tools20022.repository.dict.choice.RTFrequency37Choice;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Choice of format for a frequency, for example, the frequency of payment.
 */
public class RTFrequency37Choice extends MMChoiceComponent {

	private final static AtomicReference<RTFrequency37Choice> repoTypeRef = new AtomicReference<>();
	/**
	 * Frequency expressed as an ISO 20022 code.
	 */
	public final MMMessageAttribute attrCode = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTFrequency10Code.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTFrequency37Choice.repoType();
			super.xmlTag = "Cd";
			super.name = "Code";
			super.definition = "Frequency expressed as an ISO 20022 code.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Frequency expressed as a proprietary code.
	 */
	public final MMMessageAttribute attrProprietary = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTFrequency37Choice.repoType();
			super.xmlTag = "Prtry";
			super.name = "Proprietary";
			super.definition = "Frequency expressed as a proprietary code.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTFrequency37Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTFrequency37Choice());
		return repoTypeRef.get();
	}

	private RTFrequency37Choice() {
		super.messageElement = Arrays.asList(attrCode, attrProprietary);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Frequency37Choice";
		super.definition = "Choice of format for a frequency, for example, the frequency of payment.";
	} }