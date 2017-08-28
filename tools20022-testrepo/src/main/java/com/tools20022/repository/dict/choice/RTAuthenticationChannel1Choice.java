package com.tools20022.repository.dict.choice;


import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTExternalAuthenticationChannel1Code;
import com.tools20022.repository.dict.choice.RTAuthenticationChannel1Choice;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Choice of format for an authentication channel.
 */
public class RTAuthenticationChannel1Choice extends MMChoiceComponent {

	private final static AtomicReference<RTAuthenticationChannel1Choice> repoTypeRef = new AtomicReference<>();
	/**
	 * Authentication channel expressed as an external ISO 20022 code.
	 */
	public final MMMessageAttribute attrCode = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTExternalAuthenticationChannel1Code
					.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTAuthenticationChannel1Choice
					.repoType();
			super.xmlTag = "Cd";
			super.name = "Code";
			super.definition = "Authentication channel expressed as an external ISO 20022 code.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Authentication channel expressed as a proprietary code.
	 */
	public final MMMessageAttribute attrProprietary = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTAuthenticationChannel1Choice
					.repoType();
			super.xmlTag = "Prtry";
			super.name = "Proprietary";
			super.definition = "Authentication channel expressed as a proprietary code.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTAuthenticationChannel1Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTAuthenticationChannel1Choice());
		return repoTypeRef.get();
	}

	private RTAuthenticationChannel1Choice() {
		super.messageElement = Arrays.asList(attrCode, attrProprietary);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AuthenticationChannel1Choice";
		super.definition = "Choice of format for an authentication channel.";
	} }