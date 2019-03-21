/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msgpart;

import com.tools20022.core.repo.LazyReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AuthenticationEntity1Code;
import com.tools20022.repository.codeset.AuthenticationMethod1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Data related to the authentication of the cardholder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardholderAuthentication2#mmAuthenticationMethod
 * CardholderAuthentication2.mmAuthenticationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardholderAuthentication2#mmAuthenticationEntity
 * CardholderAuthentication2.mmAuthenticationEntity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardholderAuthentication2"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardholderAuthentication2", propOrder = {"authenticationMethod", "authenticationEntity"})
public class CardholderAuthentication2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AuthntcnMtd", required = true)
	protected AuthenticationMethod1Code authenticationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CardholderAuthentication2
	 * CardholderAuthentication2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationMethod"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardholderAuthentication2, AuthenticationMethod1Code> mmAuthenticationMethod = new MMMessageAttribute<CardholderAuthentication2, AuthenticationMethod1Code>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardholderAuthentication2.mmObject());
			isDerived = false;
			xmlTag = "AuthntcnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationMethod";
			definition = "Method used to authenticate the cardholder.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> AuthenticationMethod1Code.mmObject());
		}

		@Override
		public AuthenticationMethod1Code getValue(CardholderAuthentication2 obj) {
			return obj.getAuthenticationMethod();
		}

		@Override
		public void setValue(CardholderAuthentication2 obj, AuthenticationMethod1Code value) {
			obj.setAuthenticationMethod(value);
		}
	};
	@XmlElement(name = "AuthntcnNtty", required = true)
	protected AuthenticationEntity1Code authenticationEntity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code
	 * AuthenticationEntity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CardholderAuthentication2
	 * CardholderAuthentication2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnNtty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationEntity"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardholderAuthentication2, AuthenticationEntity1Code> mmAuthenticationEntity = new MMMessageAttribute<CardholderAuthentication2, AuthenticationEntity1Code>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardholderAuthentication2.mmObject());
			isDerived = false;
			xmlTag = "AuthntcnNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationEntity";
			definition = "Entity or object in charge of verifying the cardholder authenticity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> AuthenticationEntity1Code.mmObject());
		}

		@Override
		public AuthenticationEntity1Code getValue(CardholderAuthentication2 obj) {
			return obj.getAuthenticationEntity();
		}

		@Override
		public void setValue(CardholderAuthentication2 obj, AuthenticationEntity1Code value) {
			obj.setAuthenticationEntity(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.CardholderAuthentication2.mmAuthenticationMethod,
						com.tools20022.repository.msgpart.CardholderAuthentication2.mmAuthenticationEntity));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderAuthentication2";
				definition = "Data related to the authentication of the cardholder.";
			}
		});
		return mmObject_lazy.get();
	}

	public AuthenticationMethod1Code getAuthenticationMethod() {
		return authenticationMethod;
	}

	public CardholderAuthentication2 setAuthenticationMethod(AuthenticationMethod1Code authenticationMethod) {
		this.authenticationMethod = Objects.requireNonNull(authenticationMethod);
		return this;
	}

	public AuthenticationEntity1Code getAuthenticationEntity() {
		return authenticationEntity;
	}

	public CardholderAuthentication2 setAuthenticationEntity(AuthenticationEntity1Code authenticationEntity) {
		this.authenticationEntity = Objects.requireNonNull(authenticationEntity);
		return this;
	}
}