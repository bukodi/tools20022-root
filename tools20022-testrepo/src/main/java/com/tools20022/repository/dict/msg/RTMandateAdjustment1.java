package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.datatype.RTTrueFalseIndicator;
import com.tools20022.repository.dict.msg.RTMandateAdjustment1;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.choice.RTFrequency37Choice;
import com.tools20022.repository.dict.datatype.RTActiveCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.RTPercentageRate;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the details for the adjustment of the mandate.
 */
public class RTMandateAdjustment1 extends MMMessageComponent {

	private final static AtomicReference<RTMandateAdjustment1> repoTypeRef = new AtomicReference<>();
	/**
	 * Specifies whether an adjustment is to be applied on pre-agreed collection date or not.
	 */
	public final MMMessageAttribute attrDateAdjustmentRuleIndicator = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTTrueFalseIndicator.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateAdjustment1.repoType();
			super.xmlTag = "DtAdjstmntRuleInd";
			super.name = "DateAdjustmentRuleIndicator";
			super.definition = "Specifies whether an adjustment is to be applied on pre-agreed collection date or not.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Defines the category of adjustment.
	 */
	public final MMMessageAssociationEnd refCategory = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTFrequency37Choice.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateAdjustment1.repoType();
			super.xmlTag = "Ctgy";
			super.name = "Category";
			super.definition = "Defines the category of adjustment.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Pre-agreed amount to increase or decrease the mandate amount as justified per information in the category.
	 */
	public final MMMessageAttribute attrAmount = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTActiveCurrencyAndAmount.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateAdjustment1.repoType();
			super.xmlTag = "Amt";
			super.name = "Amount";
			super.definition = "Pre-agreed amount to increase or decrease the mandate amount as justified per information in the category.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Pre-agreed increase or decrease rate that will be applied to the collection amount.
	 */
	public final MMMessageAttribute attrRate = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTPercentageRate.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateAdjustment1.repoType();
			super.xmlTag = "Rate";
			super.name = "Rate";
			super.definition = "Pre-agreed increase or decrease rate that will be applied to the collection amount.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTMandateAdjustment1 repoType() {
		repoTypeRef.compareAndSet(null, new RTMandateAdjustment1());
		return repoTypeRef.get();
	}

	private RTMandateAdjustment1() {
		super.messageElement = Arrays.asList(attrDateAdjustmentRuleIndicator,
				refCategory, attrAmount, attrRate);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "MandateAdjustment1";
		super.definition = "Specifies the details for the adjustment of the mandate.";
	} }