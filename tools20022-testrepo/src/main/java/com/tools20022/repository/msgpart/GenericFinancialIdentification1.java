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
import com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice;
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
 * Information related to an identification of a financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GenericFinancialIdentification1#mmIdentification
 * GenericFinancialIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GenericFinancialIdentification1#mmSchemeName
 * GenericFinancialIdentification1.mmSchemeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GenericFinancialIdentification1#mmIssuer
 * GenericFinancialIdentification1.mmIssuer}</li>
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
 * "GenericFinancialIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to an identification of a financial institution."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GenericFinancialIdentification1", propOrder = {"identification", "schemeName", "issuer"})
public class GenericFinancialIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.msgpart.GenericFinancialIdentification1
	 * GenericFinancialIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identification of a person."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GenericFinancialIdentification1, Max35Text> mmIdentification = new MMMessageAttribute<GenericFinancialIdentification1, Max35Text>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GenericFinancialIdentification1.mmObject());
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Max35Text getValue(GenericFinancialIdentification1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(GenericFinancialIdentification1 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "SchmeNm")
	protected FinancialIdentificationSchemeName1Choice schemeName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice
	 * FinancialIdentificationSchemeName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GenericFinancialIdentification1
	 * GenericFinancialIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchmeNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SchemeName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the identification scheme."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GenericFinancialIdentification1, Optional<FinancialIdentificationSchemeName1Choice>> mmSchemeName = new MMMessageAssociationEnd<GenericFinancialIdentification1, Optional<FinancialIdentificationSchemeName1Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GenericFinancialIdentification1.mmObject());
			isDerived = false;
			xmlTag = "SchmeNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SchemeName";
			definition = "Name of the identification scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> FinancialIdentificationSchemeName1Choice.mmObject());
		}

		@Override
		public Optional<FinancialIdentificationSchemeName1Choice> getValue(GenericFinancialIdentification1 obj) {
			return obj.getSchemeName();
		}

		@Override
		public void setValue(GenericFinancialIdentification1 obj, Optional<FinancialIdentificationSchemeName1Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msgpart.GenericFinancialIdentification1
	 * GenericFinancialIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity that assigns the identification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GenericFinancialIdentification1, Optional<Max35Text>> mmIssuer = new MMMessageAttribute<GenericFinancialIdentification1, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GenericFinancialIdentification1.mmObject());
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
		public Optional<Max35Text> getValue(GenericFinancialIdentification1 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(GenericFinancialIdentification1 obj, Optional<Max35Text> value) {
			obj.setIssuer(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.GenericFinancialIdentification1.mmIdentification,
						com.tools20022.repository.msgpart.GenericFinancialIdentification1.mmSchemeName, com.tools20022.repository.msgpart.GenericFinancialIdentification1.mmIssuer));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GenericFinancialIdentification1";
				definition = "Information related to an identification of a financial institution.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public GenericFinancialIdentification1 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<FinancialIdentificationSchemeName1Choice> getSchemeName() {
		return Optional.ofNullable(schemeName);
	}

	public GenericFinancialIdentification1 setSchemeName(FinancialIdentificationSchemeName1Choice schemeName) {
		this.schemeName = schemeName;
		return this;
	}

	public Optional<Max35Text> getIssuer() {
		return Optional.ofNullable(issuer);
	}

	public GenericFinancialIdentification1 setIssuer(Max35Text issuer) {
		this.issuer = issuer;
		return this;
	}
}