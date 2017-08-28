package com.tools20022.repository.dict.choice;


import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTExternalMandateSetupReason1Code;
import com.tools20022.repository.dict.choice.RTMandateSetupReason1Choice;
import com.tools20022.repository.dict.datatype.RTMax70Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the reason for the setup of the mandate.
 */
public class RTMandateSetupReason1Choice extends MMChoiceComponent {

	private final static AtomicReference<RTMandateSetupReason1Choice> repoTypeRef = new AtomicReference<>();
	/**
	 * Reason for the return, as published in an external reason code list.
	 */
	public final MMMessageAttribute attrCode = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTExternalMandateSetupReason1Code
					.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateSetupReason1Choice
					.repoType();
			super.xmlTag = "Cd";
			super.name = "Code";
			super.definition = "Reason for the return, as published in an external reason code list.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Reason for the return, in a proprietary form.
	 */
	public final MMMessageAttribute attrProprietary = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTMandateSetupReason1Choice
					.repoType();
			super.xmlTag = "Prtry";
			super.name = "Proprietary";
			super.definition = "Reason for the return, in a proprietary form.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTMandateSetupReason1Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTMandateSetupReason1Choice());
		return repoTypeRef.get();
	}

	private RTMandateSetupReason1Choice() {
		super.messageElement = Arrays.asList(attrCode, attrProprietary);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "MandateSetupReason1Choice";
		super.definition = "Specifies the reason for the setup of the mandate.";
	} }