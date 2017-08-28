package com.tools20022.repository.dict.choice;


import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTExternalServiceLevel1Code;
import com.tools20022.repository.dict.choice.RTServiceLevel8Choice;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the service level of the transaction.
 */
public class RTServiceLevel8Choice extends MMChoiceComponent {

	private final static AtomicReference<RTServiceLevel8Choice> repoTypeRef = new AtomicReference<>();
	/**
	 * Specifies a pre-agreed service or level of service between the parties, as published in an external service level code list.
	 */
	public final MMMessageAttribute attrCode = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTExternalServiceLevel1Code
					.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTServiceLevel8Choice
					.repoType();
			super.xmlTag = "Cd";
			super.name = "Code";
			super.definition = "Specifies a pre-agreed service or level of service between the parties, as published in an external service level code list.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies a pre-agreed service or level of service between the parties, as a proprietary code.
	 */
	public final MMMessageAttribute attrProprietary = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTServiceLevel8Choice
					.repoType();
			super.xmlTag = "Prtry";
			super.name = "Proprietary";
			super.definition = "Specifies a pre-agreed service or level of service between the parties, as a proprietary code.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTServiceLevel8Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTServiceLevel8Choice());
		return repoTypeRef.get();
	}

	private RTServiceLevel8Choice() {
		super.messageElement = Arrays.asList(attrCode, attrProprietary);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ServiceLevel8Choice";
		super.definition = "Specifies the service level of the transaction.";
	} }