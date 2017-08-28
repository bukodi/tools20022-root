package com.tools20022.repository.dict.choice;


import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTAuthorisation1Code;
import com.tools20022.repository.dict.choice.RTAuthorisation1Choice;
import com.tools20022.repository.dict.datatype.RTMax128Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Provides the details on the user identification or any user key that allows to check if the initiating party is allowed to issue the transaction.
 */
public class RTAuthorisation1Choice extends MMChoiceComponent {

	private final static AtomicReference<RTAuthorisation1Choice> repoTypeRef = new AtomicReference<>();
	/**
	 * Specifies the authorisation, in a coded form.
	 */
	public final MMMessageAttribute attrCode = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTAuthorisation1Code.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTAuthorisation1Choice
					.repoType();
			super.xmlTag = "Cd";
			super.name = "Code";
			super.definition = "Specifies the authorisation, in a coded form.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies the authorisation, in a free text form.
	 */
	public final MMMessageAttribute attrProprietary = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax128Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTAuthorisation1Choice
					.repoType();
			super.xmlTag = "Prtry";
			super.name = "Proprietary";
			super.definition = "Specifies the authorisation, in a free text form.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTAuthorisation1Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTAuthorisation1Choice());
		return repoTypeRef.get();
	}

	private RTAuthorisation1Choice() {
		super.messageElement = Arrays.asList(attrCode, attrProprietary);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Authorisation1Choice";
		super.definition = "Provides the details on the user identification or any user key that allows to check if the initiating party is allowed to issue the transaction.";
	} }