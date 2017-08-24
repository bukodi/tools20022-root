package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.AuthenticationMethodCode;
import com.tools20022.repository.dict.entity.Authentication;
import com.tools20022.repository.dict.codeset.AuthenticationEntityCode;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.codeset.PINFormatCode;
import com.tools20022.repository.dict.datatype.Max140Binary;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.AuthenticationResultCode;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.Mandate;
import com.tools20022.repository.GeneratedRepository;

public class Authentication extends MMBusinessComponent {

	private final static AtomicReference<Authentication> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrAuthenticationMethod = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> AuthenticationMethodCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Authentication.repoType();
			super.name = "AuthenticationMethod";
			super.definition = "Method used to authenticate a person.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrAuthenticationEntity = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> AuthenticationEntityCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Authentication.repoType();
			super.name = "AuthenticationEntity";
			super.definition = "Entity or object in charge of verifying the person authenticity.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrAuthenticationValue = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max70Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Authentication.repoType();
			super.name = "AuthenticationValue";
			super.definition = "Value used to authenticate the owner of the payment card.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrPINFormat = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> PINFormatCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Authentication.repoType();
			super.name = "PINFormat";
			super.definition = "Encrypted personal identification number (PIN) format.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrPIN = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max140Binary.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Authentication.repoType();
			super.name = "PIN";
			super.definition = "Personal Identification Number (PIN) for authentication.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrAuthenticationSupport = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Authentication.repoType();
			super.name = "AuthenticationSupport";
			super.definition = "This indicator identifies whether person authentication is supported and data is available.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrCollectionIndicator = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Authentication.repoType();
			super.name = "CollectionIndicator";
			super.definition = "Identifies in electronic commerce transactions whether customer authentication is supported and data is available.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrAuthenticationResult = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> AuthenticationResultCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Authentication.repoType();
			super.name = "AuthenticationResult";
			super.definition = "Specifies the result of the authentication.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static Authentication repoType() {
		repoTypeRef.compareAndSet(null, new Authentication());
		return repoTypeRef.get();
	}

	private Authentication() {
		super.element = Arrays.asList(attrAuthenticationMethod,
				attrAuthenticationEntity, attrAuthenticationValue,
				attrPINFormat, attrPIN, attrAuthenticationSupport,
				attrCollectionIndicator, attrAuthenticationResult);
		super.associationDomain_lazy = () -> Arrays
				.asList(Mandate.repoType().refAuthentication);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Authentication";
		super.definition = "Data related to the authentication of the cardholder.";
	}
}