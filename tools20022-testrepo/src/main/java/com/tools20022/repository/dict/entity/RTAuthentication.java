package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.RTAuthenticationMethodCode;
import com.tools20022.repository.dict.entity.RTAuthentication;
import com.tools20022.repository.dict.codeset.RTAuthenticationEntityCode;
import com.tools20022.repository.dict.datatype.RTMax70Text;
import com.tools20022.repository.dict.codeset.RTPINFormatCode;
import com.tools20022.repository.dict.datatype.RTMax140Binary;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.codeset.RTAuthenticationResultCode;
import java.util.Arrays;
import com.tools20022.repository.dict.entity.RTMandate;
import com.tools20022.repository.GeneratedRepository;/**
 * Data related to the authentication of the cardholder.
 */
public class RTAuthentication extends MMBusinessComponent {

	private final static AtomicReference<RTAuthentication> repoTypeRef = new AtomicReference<>();
	/**
	 * Method used to authenticate a person.
	 */
	public final MMBusinessAttribute attrAuthenticationMethod = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTAuthenticationMethodCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.name = "AuthenticationMethod";
			super.definition = "Method used to authenticate a person.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Entity or object in charge of verifying the person authenticity.
	 */
	public final MMBusinessAttribute attrAuthenticationEntity = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTAuthenticationEntityCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.name = "AuthenticationEntity";
			super.definition = "Entity or object in charge of verifying the person authenticity.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Value used to authenticate the owner of the payment card.
	 */
	public final MMBusinessAttribute attrAuthenticationValue = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.name = "AuthenticationValue";
			super.definition = "Value used to authenticate the owner of the payment card.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Encrypted personal identification number (PIN) format.
	 */
	public final MMBusinessAttribute attrPINFormat = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTPINFormatCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.name = "PINFormat";
			super.definition = "Encrypted personal identification number (PIN) format.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Personal Identification Number (PIN) for authentication.
	 */
	public final MMBusinessAttribute attrPIN = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax140Binary.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.name = "PIN";
			super.definition = "Personal Identification Number (PIN) for authentication.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * This indicator identifies whether person authentication is supported and data is available.
	 */
	public final MMBusinessAttribute attrAuthenticationSupport = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.name = "AuthenticationSupport";
			super.definition = "This indicator identifies whether person authentication is supported and data is available.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Identifies in electronic commerce transactions whether customer authentication is supported and data is available.
	 */
	public final MMBusinessAttribute attrCollectionIndicator = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.name = "CollectionIndicator";
			super.definition = "Identifies in electronic commerce transactions whether customer authentication is supported and data is available.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specifies the result of the authentication.
	 */
	public final MMBusinessAttribute attrAuthenticationResult = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTAuthenticationResultCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTAuthentication.repoType();
			super.name = "AuthenticationResult";
			super.definition = "Specifies the result of the authentication.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTAuthentication repoType() {
		repoTypeRef.compareAndSet(null, new RTAuthentication());
		return repoTypeRef.get();
	}

	private RTAuthentication() {
		super.element = Arrays.asList(attrAuthenticationMethod,
				attrAuthenticationEntity, attrAuthenticationValue,
				attrPINFormat, attrPIN, attrAuthenticationSupport,
				attrCollectionIndicator, attrAuthenticationResult);
		super.associationDomain_lazy = () -> Arrays
				.asList(RTMandate.repoType().refAuthentication);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Authentication";
		super.definition = "Data related to the authentication of the cardholder.";
	} }