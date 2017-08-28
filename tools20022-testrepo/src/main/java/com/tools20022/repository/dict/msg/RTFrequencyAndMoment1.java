package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTFrequency6Code;
import com.tools20022.repository.dict.msg.RTFrequencyAndMoment1;
import com.tools20022.repository.dict.datatype.RTExact2NumericText;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Defines a frequency in terms a specific moment within a specified period type.
 */
public class RTFrequencyAndMoment1 extends MMMessageComponent {

	private final static AtomicReference<RTFrequencyAndMoment1> repoTypeRef = new AtomicReference<>();
	/**
	 * Period for which the number of instructions are to be created and processed.
	 */
	public final MMMessageAttribute attrType = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTFrequency6Code.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTFrequencyAndMoment1
					.repoType();
			super.xmlTag = "Tp";
			super.name = "Type";
			super.definition = "Period for which the number of instructions are to be created and processed.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Further information on the exact point in time the event should take place.
	 */
	public final MMMessageAttribute attrPointInTime = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTExact2NumericText.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTFrequencyAndMoment1
					.repoType();
			super.xmlTag = "PtInTm";
			super.name = "PointInTime";
			super.definition = "Further information on the exact point in time the event should take place.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTFrequencyAndMoment1 repoType() {
		repoTypeRef.compareAndSet(null, new RTFrequencyAndMoment1());
		return repoTypeRef.get();
	}

	private RTFrequencyAndMoment1() {
		super.messageElement = Arrays.asList(attrType, attrPointInTime);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "FrequencyAndMoment1";
		super.definition = "Defines a frequency in terms a specific moment within a specified period type.";
	} }