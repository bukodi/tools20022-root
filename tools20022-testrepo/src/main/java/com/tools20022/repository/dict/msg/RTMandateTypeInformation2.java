package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.dict.choice.RTServiceLevel8Choice;
import com.tools20022.repository.dict.msg.RTMandateTypeInformation2;
import com.tools20022.repository.dict.choice.RTLocalInstrument2Choice;
import com.tools20022.repository.dict.choice.RTCategoryPurpose1Choice;
import com.tools20022.repository.dict.choice.RTMandateClassification1Choice;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Set of elements used to further detail the information related to the type of payment.
 */
public class RTMandateTypeInformation2 extends MMMessageComponent {

	private final static AtomicReference<RTMandateTypeInformation2> repoTypeRef = new AtomicReference<>();
	/**
	 * Agreement under which or rules under which the mandate resides.
	 */
	public final MMMessageAssociationEnd refServiceLevel = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTServiceLevel8Choice.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateTypeInformation2
					.repoType();
			super.xmlTag = "SvcLvl";
			super.name = "ServiceLevel";
			super.definition = "Agreement under which or rules under which the mandate resides.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * User community specific instrument.
	Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.
	 */
	public final MMMessageAssociationEnd refLocalInstrument = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTLocalInstrument2Choice.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateTypeInformation2
					.repoType();
			super.xmlTag = "LclInstrm";
			super.name = "LocalInstrument";
			super.definition = "User community specific instrument.\nUsage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Specifies the high level purpose of the mandate based on a set of pre-defined categories.
	 */
	public final MMMessageAssociationEnd refCategoryPurpose = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTCategoryPurpose1Choice.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateTypeInformation2
					.repoType();
			super.xmlTag = "CtgyPurp";
			super.name = "CategoryPurpose";
			super.definition = "Specifies the high level purpose of the mandate based on a set of pre-defined categories.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Type of direct debit instruction.
	 */
	public final MMMessageAssociationEnd refClassification = new MMMessageAssociationEnd() {
		{
			super.type_lazy = () -> RTMandateClassification1Choice.repoType();
			super.isComposite = true;
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateTypeInformation2
					.repoType();
			super.xmlTag = "Clssfctn";
			super.name = "Classification";
			super.definition = "Type of direct debit instruction.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};

	public static RTMandateTypeInformation2 repoType() {
		repoTypeRef.compareAndSet(null, new RTMandateTypeInformation2());
		return repoTypeRef.get();
	}

	private RTMandateTypeInformation2() {
		super.messageElement = Arrays.asList(refServiceLevel,
				refLocalInstrument, refCategoryPurpose, refClassification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "MandateTypeInformation2";
		super.definition = "Set of elements used to further detail the information related to the type of payment.";
	} }