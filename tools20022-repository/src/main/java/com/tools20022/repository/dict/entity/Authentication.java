package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CardholderRole;
import com.tools20022.repository.dict.codeset.AuthenticationMethodCode;
import com.tools20022.repository.dict.codeset.AuthenticationEntityCode;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.codeset.PINFormatCode;
import com.tools20022.repository.dict.datatype.Max140Binary;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Mandate;
import com.tools20022.repository.dict.codeset.AuthenticationResultCode;

/**
 * Data related to the authentication of the cardholder.
 */
public class Authentication {

	private CardholderRole Cardholder;
	private AuthenticationMethodCode AuthenticationMethod;
	private AuthenticationEntityCode AuthenticationEntity;
	private Max70Text AuthenticationValue;
	private PINFormatCode PINFormat;
	private Max140Binary PIN;
	private Max35Text AuthenticationSupport;
	private Max35Text CollectionIndicator;
	private Mandate Mandate;
	private AuthenticationResultCode AuthenticationResult;

	public CardholderRole getCardholder() {
		return Cardholder;
	}

	public void setCardholder(CardholderRole Cardholder) {
		this.Cardholder = Cardholder;
	}

	public AuthenticationMethodCode getAuthenticationMethod() {
		return AuthenticationMethod;
	}

	public void setAuthenticationMethod(
			AuthenticationMethodCode AuthenticationMethod) {
		this.AuthenticationMethod = AuthenticationMethod;
	}

	public AuthenticationEntityCode getAuthenticationEntity() {
		return AuthenticationEntity;
	}

	public void setAuthenticationEntity(
			AuthenticationEntityCode AuthenticationEntity) {
		this.AuthenticationEntity = AuthenticationEntity;
	}

	public Max70Text getAuthenticationValue() {
		return AuthenticationValue;
	}

	public void setAuthenticationValue(Max70Text AuthenticationValue) {
		this.AuthenticationValue = AuthenticationValue;
	}

	public PINFormatCode getPINFormat() {
		return PINFormat;
	}

	public void setPINFormat(PINFormatCode PINFormat) {
		this.PINFormat = PINFormat;
	}

	public Max140Binary getPIN() {
		return PIN;
	}

	public void setPIN(Max140Binary PIN) {
		this.PIN = PIN;
	}

	public Max35Text getAuthenticationSupport() {
		return AuthenticationSupport;
	}

	public void setAuthenticationSupport(Max35Text AuthenticationSupport) {
		this.AuthenticationSupport = AuthenticationSupport;
	}

	public Max35Text getCollectionIndicator() {
		return CollectionIndicator;
	}

	public void setCollectionIndicator(Max35Text CollectionIndicator) {
		this.CollectionIndicator = CollectionIndicator;
	}

	public Mandate getMandate() {
		return Mandate;
	}

	public void setMandate(Mandate Mandate) {
		this.Mandate = Mandate;
	}

	public AuthenticationResultCode getAuthenticationResult() {
		return AuthenticationResult;
	}

	public void setAuthenticationResult(
			AuthenticationResultCode AuthenticationResult) {
		this.AuthenticationResult = AuthenticationResult;
	}
}