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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.DocumentLineType1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the documents referred to in the remittance information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.DocumentLineIdentification1#mmType
 * DocumentLineIdentification1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.DocumentLineIdentification1#mmNumber
 * DocumentLineIdentification1.mmNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.DocumentLineIdentification1#mmRelatedDate
 * DocumentLineIdentification1.mmRelatedDate}</li>
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
 * "DocumentLineIdentification1"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DocumentLineIdentification1", propOrder = {"type", "number", "relatedDate"})
public class DocumentLineIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp")
	protected DocumentLineType1 type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.DocumentLineType1
	 * DocumentLineType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.DocumentLineIdentification1
	 * DocumentLineIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DocumentLineIdentification1, Optional<DocumentLineType1>> mmType = new MMMessageAssociationEnd<DocumentLineIdentification1, Optional<DocumentLineType1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.DocumentLineIdentification1.mmObject());
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of referred document line identification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> DocumentLineType1.mmObject());
		}

		@Override
		public Optional<DocumentLineType1> getValue(DocumentLineIdentification1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(DocumentLineIdentification1 obj, Optional<DocumentLineType1> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Nb")
	protected Max35Text number;
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
	 * {@linkplain com.tools20022.repository.msgpart.DocumentLineIdentification1
	 * DocumentLineIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DocumentLineIdentification1, Optional<Max35Text>> mmNumber = new MMMessageAttribute<DocumentLineIdentification1, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.DocumentLineIdentification1.mmObject());
			isDerived = false;
			xmlTag = "Nb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Number";
			definition = "Identification of the type specified for the referred document line.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(DocumentLineIdentification1 obj) {
			return obj.getNumber();
		}

		@Override
		public void setValue(DocumentLineIdentification1 obj, Optional<Max35Text> value) {
			obj.setNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdDt")
	protected ISODate relatedDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.DocumentLineIdentification1
	 * DocumentLineIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDate"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DocumentLineIdentification1, Optional<ISODate>> mmRelatedDate = new MMMessageAttribute<DocumentLineIdentification1, Optional<ISODate>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.DocumentLineIdentification1.mmObject());
			isDerived = false;
			xmlTag = "RltdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDate";
			definition = "Date associated with the referred document line.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISODate.mmObject());
		}

		@Override
		public Optional<ISODate> getValue(DocumentLineIdentification1 obj) {
			return obj.getRelatedDate();
		}

		@Override
		public void setValue(DocumentLineIdentification1 obj, Optional<ISODate> value) {
			obj.setRelatedDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.DocumentLineIdentification1.mmType, com.tools20022.repository.msgpart.DocumentLineIdentification1.mmNumber,
						com.tools20022.repository.msgpart.DocumentLineIdentification1.mmRelatedDate));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentLineIdentification1";
				definition = "Identifies the documents referred to in the remittance information.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DocumentLineType1> getType() {
		return Optional.ofNullable(type);
	}

	public DocumentLineIdentification1 setType(DocumentLineType1 type) {
		this.type = type;
		return this;
	}

	public Optional<Max35Text> getNumber() {
		return Optional.ofNullable(number);
	}

	public DocumentLineIdentification1 setNumber(Max35Text number) {
		this.number = number;
		return this;
	}

	public Optional<ISODate> getRelatedDate() {
		return Optional.ofNullable(relatedDate);
	}

	public DocumentLineIdentification1 setRelatedDate(ISODate relatedDate) {
		this.relatedDate = relatedDate;
		return this;
	}
}