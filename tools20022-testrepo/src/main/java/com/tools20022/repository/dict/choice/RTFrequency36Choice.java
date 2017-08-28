package com.tools20022.repository.dict.choice;


import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTFrequency6Code;
import com.tools20022.repository.dict.choice.RTFrequency36Choice;
import com.tools20022.repository.dict.msg.RTFrequencyPeriod1;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.msg.RTFrequencyAndMoment1;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Choice of format for a frequency, for example, the frequency of payment.
 */
public class RTFrequency36Choice extends MMChoiceComponent {

	private final static AtomicReference<RTFrequency36Choice> repoTypeRef = new AtomicReference<>();
	/**
	 * Specifies a frequency in terms of a specified period type.
	 */
	public final MMMessageAttribute attrType = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTFrequency6Code.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTFrequency36Choice.repoType();
			super.xmlTag = "Tp";
			super.name = "Type";
			super.definition = "Specifies a frequency in terms of a specified period type.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies a frequency in terms of a count per period within a specified period type.
	 */
	public final MMMessageAttribute attrPeriod = new MMMessageAttribute() {
		{
			super.complexType_lazy = () -> RTFrequencyPeriod1.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTFrequency36Choice.repoType();
			super.xmlTag = "Prd";
			super.name = "Period";
			super.definition = "Specifies a frequency in terms of a count per period within a specified period type.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies a frequency in terms of an exact point in time or moment within a specified period type.
	 */
	public final MMMessageAssociationEnd refPointInTime = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTFrequencyAndMoment1.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTFrequency36Choice.repoType();
			super.xmlTag = "PtInTm";
			super.name = "PointInTime";
			super.definition = "Specifies a frequency in terms of an exact point in time or moment within a specified period type.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTFrequency36Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTFrequency36Choice());
		return repoTypeRef.get();
	}

	private RTFrequency36Choice() {
		super.messageElement = Arrays.asList(attrType, attrPeriod,
				refPointInTime);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Frequency36Choice";
		super.definition = "Choice of format for a frequency, for example, the frequency of payment.";
	} }