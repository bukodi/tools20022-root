package com.tools20022.repository.dict.choice;


import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTExternalCashAccountType1Code;
import com.tools20022.repository.dict.choice.RTCashAccountType2Choice;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Nature or use of the account.
 */
public class RTCashAccountType2Choice extends MMChoiceComponent {

	private final static AtomicReference<RTCashAccountType2Choice> repoTypeRef = new AtomicReference<>();
	/**
	 * Account type, in a coded form.
	 */
	public final MMMessageAttribute attrCode = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTExternalCashAccountType1Code
					.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTCashAccountType2Choice
					.repoType();
			super.xmlTag = "Cd";
			super.name = "Code";
			super.definition = "Account type, in a coded form.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Nature or use of the account in a proprietary form.
	 */
	public final MMMessageAttribute attrProprietary = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTCashAccountType2Choice
					.repoType();
			super.xmlTag = "Prtry";
			super.name = "Proprietary";
			super.definition = "Nature or use of the account in a proprietary form.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTCashAccountType2Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTCashAccountType2Choice());
		return repoTypeRef.get();
	}

	private RTCashAccountType2Choice() {
		super.messageElement = Arrays.asList(attrCode, attrProprietary);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CashAccountType2Choice";
		super.definition = "Nature or use of the account.";
	} }