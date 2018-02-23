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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.IBAN2007Identifier;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericAccountIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the unique identification of an account as assigned by the account
 * servicer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice#mmIBAN
 * AccountIdentification4Choice.mmIBAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice#mmOther
 * AccountIdentification4Choice.mmOther}</li>
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
 * "AccountIdentification4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the unique identification of an account as assigned by the account servicer."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountIdentification4Choice", propOrder = {"iBAN", "other"})
public class AccountIdentification4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IBAN", required = true)
	protected IBAN2007Identifier iBAN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IBAN2007Identifier
	 * IBAN2007Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountIdentification4Choice, IBAN2007Identifier> mmIBAN = new MMMessageAttribute<AccountIdentification4Choice, IBAN2007Identifier>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification4Choice.mmObject();
			isDerived = false;
			xmlTag = "IBAN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IBAN";
			definition = "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IBAN2007Identifier.mmObject();
		}

		@Override
		public IBAN2007Identifier getValue(AccountIdentification4Choice obj) {
			return obj.getIBAN();
		}

		@Override
		public void setValue(AccountIdentification4Choice obj, IBAN2007Identifier value) {
			obj.setIBAN(value);
		}
	};
	@XmlElement(name = "Othr", required = true)
	protected GenericAccountIdentification1 other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericAccountIdentification1
	 * GenericAccountIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of an account, as assigned by the account servicer, using an identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountIdentification4Choice, GenericAccountIdentification1> mmOther = new MMMessageAssociationEnd<AccountIdentification4Choice, GenericAccountIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification4Choice.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Unique identification of an account, as assigned by the account servicer, using an identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericAccountIdentification1.mmObject();
		}

		@Override
		public GenericAccountIdentification1 getValue(AccountIdentification4Choice obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(AccountIdentification4Choice obj, GenericAccountIdentification1 value) {
			obj.setOther(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentification4Choice.mmIBAN, com.tools20022.repository.choice.AccountIdentification4Choice.mmOther);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountIdentification4Choice";
				definition = "Specifies the unique identification of an account as assigned by the account servicer.";
			}
		});
		return mmObject_lazy.get();
	}

	public IBAN2007Identifier getIBAN() {
		return iBAN;
	}

	public AccountIdentification4Choice setIBAN(IBAN2007Identifier iBAN) {
		this.iBAN = Objects.requireNonNull(iBAN);
		return this;
	}

	public GenericAccountIdentification1 getOther() {
		return other;
	}

	public AccountIdentification4Choice setOther(GenericAccountIdentification1 other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}
}