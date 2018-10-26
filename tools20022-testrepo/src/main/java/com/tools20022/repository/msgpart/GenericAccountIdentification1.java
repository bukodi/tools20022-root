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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AccountSchemeName1Choice;
import com.tools20022.repository.datatype.Max34Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to a generic account identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GenericAccountIdentification1#mmIdentification
 * GenericAccountIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GenericAccountIdentification1#mmSchemeName
 * GenericAccountIdentification1.mmSchemeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GenericAccountIdentification1#mmIssuer
 * GenericAccountIdentification1.mmIssuer}</li>
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
 * "GenericAccountIdentification1"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GenericAccountIdentification1", propOrder = {"identification", "schemeName", "issuer"})
public class GenericAccountIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max34Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max34Text
	 * Max34Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GenericAccountIdentification1
	 * GenericAccountIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GenericAccountIdentification1, Max34Text> mmIdentification = new MMMessageAttribute<GenericAccountIdentification1, Max34Text>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GenericAccountIdentification1.mmObject());
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by an institution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> Max34Text.mmObject());
		}

		@Override
		public Max34Text getValue(GenericAccountIdentification1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(GenericAccountIdentification1 obj, Max34Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "SchmeNm")
	protected AccountSchemeName1Choice schemeName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountSchemeName1Choice
	 * AccountSchemeName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GenericAccountIdentification1
	 * GenericAccountIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchmeNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SchemeName"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GenericAccountIdentification1, Optional<AccountSchemeName1Choice>> mmSchemeName = new MMMessageAssociationEnd<GenericAccountIdentification1, Optional<AccountSchemeName1Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GenericAccountIdentification1.mmObject());
			isDerived = false;
			xmlTag = "SchmeNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SchemeName";
			definition = "Name of the identification scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> AccountSchemeName1Choice.mmObject());
		}

		@Override
		public Optional<AccountSchemeName1Choice> getValue(GenericAccountIdentification1 obj) {
			return obj.getSchemeName();
		}

		@Override
		public void setValue(GenericAccountIdentification1 obj, Optional<AccountSchemeName1Choice> value) {
			obj.setSchemeName(value.orElse(null));
		}
	};
	@XmlElement(name = "Issr")
	protected Max35Text issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GenericAccountIdentification1
	 * GenericAccountIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GenericAccountIdentification1, Optional<Max35Text>> mmIssuer = new MMMessageAttribute<GenericAccountIdentification1, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GenericAccountIdentification1.mmObject());
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Entity that assigns the identification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(GenericAccountIdentification1 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(GenericAccountIdentification1 obj, Optional<Max35Text> value) {
			obj.setIssuer(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.GenericAccountIdentification1.mmIdentification, com.tools20022.repository.msgpart.GenericAccountIdentification1.mmSchemeName,
						com.tools20022.repository.msgpart.GenericAccountIdentification1.mmIssuer));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GenericAccountIdentification1";
				definition = "Information related to a generic account identification.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max34Text getIdentification() {
		return identification;
	}

	public GenericAccountIdentification1 setIdentification(Max34Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<AccountSchemeName1Choice> getSchemeName() {
		return Optional.ofNullable(schemeName);
	}

	public GenericAccountIdentification1 setSchemeName(AccountSchemeName1Choice schemeName) {
		this.schemeName = schemeName;
		return this;
	}

	public Optional<Max35Text> getIssuer() {
		return Optional.ofNullable(issuer);
	}

	public GenericAccountIdentification1 setIssuer(Max35Text issuer) {
		this.issuer = issuer;
		return this;
	}
}