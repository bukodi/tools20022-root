package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTFrequency6Code;
import com.tools20022.repository.dict.msg.RTFrequencyPeriod1;
import com.tools20022.repository.dict.datatype.RTDecimalNumber;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Defines a frequency in terms on counts per period for a specific period type.
 */
public class RTFrequencyPeriod1 extends MMMessageComponent {

	private final static AtomicReference<RTFrequencyPeriod1> repoTypeRef = new AtomicReference<>();
	/**
	 * Period for which the number of instructions are to be created and processed.
	 */
	public final MMMessageAttribute attrType = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTFrequency6Code.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTFrequencyPeriod1.repoType();
			super.xmlTag = "Tp";
			super.name = "Type";
			super.definition = "Period for which the number of instructions are to be created and processed.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Number of instructions to be created and processed during the specified period
	 */
	public final MMMessageAttribute attrCountPerPeriod = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTDecimalNumber.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTFrequencyPeriod1.repoType();
			super.xmlTag = "CntPerPrd";
			super.name = "CountPerPeriod";
			super.definition = "Number of instructions to be created and processed during the specified period";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTFrequencyPeriod1 repoType() {
		repoTypeRef.compareAndSet(null, new RTFrequencyPeriod1());
		return repoTypeRef.get();
	}

	private RTFrequencyPeriod1() {
		super.messageElement = Arrays.asList(attrType, attrCountPerPeriod);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "FrequencyPeriod1";
		super.definition = "Defines a frequency in terms on counts per period for a specific period type.";
	} }