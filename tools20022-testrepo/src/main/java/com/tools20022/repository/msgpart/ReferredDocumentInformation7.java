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
import com.tools20022.repository.msgpart.DocumentLineInformation1;
import com.tools20022.repository.msgpart.ReferredDocumentType4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to identify the documents referred to in the remittance
 * information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReferredDocumentInformation7#mmType
 * ReferredDocumentInformation7.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReferredDocumentInformation7#mmNumber
 * ReferredDocumentInformation7.mmNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReferredDocumentInformation7#mmRelatedDate
 * ReferredDocumentInformation7.mmRelatedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReferredDocumentInformation7#mmLineDetails
 * ReferredDocumentInformation7.mmLineDetails}</li>
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
 * "ReferredDocumentInformation7"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReferredDocumentInformation7", propOrder = {"type", "number", "relatedDate", "lineDetails"})
public class ReferredDocumentInformation7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp")
	protected ReferredDocumentType4 type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.ReferredDocumentType4
	 * ReferredDocumentType4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReferredDocumentInformation7
	 * ReferredDocumentInformation7}</li>
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
	public static final MMMessageAssociationEnd<ReferredDocumentInformation7, Optional<ReferredDocumentType4>> mmType = new MMMessageAssociationEnd<ReferredDocumentInformation7, Optional<ReferredDocumentType4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReferredDocumentInformation7.mmObject());
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of referred document.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> ReferredDocumentType4.mmObject());
		}

		@Override
		public Optional<ReferredDocumentType4> getValue(ReferredDocumentInformation7 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(ReferredDocumentInformation7 obj, Optional<ReferredDocumentType4> value) {
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
	 * {@linkplain com.tools20022.repository.msgpart.ReferredDocumentInformation7
	 * ReferredDocumentInformation7}</li>
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
	public static final MMMessageAttribute<ReferredDocumentInformation7, Optional<Max35Text>> mmNumber = new MMMessageAttribute<ReferredDocumentInformation7, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReferredDocumentInformation7.mmObject());
			isDerived = false;
			xmlTag = "Nb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Number";
			definition = "Unique and unambiguous identification of the referred document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(ReferredDocumentInformation7 obj) {
			return obj.getNumber();
		}

		@Override
		public void setValue(ReferredDocumentInformation7 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msgpart.ReferredDocumentInformation7
	 * ReferredDocumentInformation7}</li>
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
	public static final MMMessageAttribute<ReferredDocumentInformation7, Optional<ISODate>> mmRelatedDate = new MMMessageAttribute<ReferredDocumentInformation7, Optional<ISODate>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReferredDocumentInformation7.mmObject());
			isDerived = false;
			xmlTag = "RltdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDate";
			definition = "Date associated with the referred document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISODate.mmObject());
		}

		@Override
		public Optional<ISODate> getValue(ReferredDocumentInformation7 obj) {
			return obj.getRelatedDate();
		}

		@Override
		public void setValue(ReferredDocumentInformation7 obj, Optional<ISODate> value) {
			obj.setRelatedDate(value.orElse(null));
		}
	};
	@XmlElement(name = "LineDtls")
	protected List<DocumentLineInformation1> lineDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.DocumentLineInformation1
	 * DocumentLineInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReferredDocumentInformation7
	 * ReferredDocumentInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineDetails"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReferredDocumentInformation7, List<DocumentLineInformation1>> mmLineDetails = new MMMessageAssociationEnd<ReferredDocumentInformation7, List<DocumentLineInformation1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReferredDocumentInformation7.mmObject());
			isDerived = false;
			xmlTag = "LineDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineDetails";
			definition = "Set of elements used to provide the content of the referred document line.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> DocumentLineInformation1.mmObject());
		}

		@Override
		public List<DocumentLineInformation1> getValue(ReferredDocumentInformation7 obj) {
			return obj.getLineDetails();
		}

		@Override
		public void setValue(ReferredDocumentInformation7 obj, List<DocumentLineInformation1> value) {
			obj.setLineDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.ReferredDocumentInformation7.mmType, com.tools20022.repository.msgpart.ReferredDocumentInformation7.mmNumber,
						com.tools20022.repository.msgpart.ReferredDocumentInformation7.mmRelatedDate, com.tools20022.repository.msgpart.ReferredDocumentInformation7.mmLineDetails));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReferredDocumentInformation7";
				definition = "Set of elements used to identify the documents referred to in the remittance information.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ReferredDocumentType4> getType() {
		return Optional.ofNullable(type);
	}

	public ReferredDocumentInformation7 setType(ReferredDocumentType4 type) {
		this.type = type;
		return this;
	}

	public Optional<Max35Text> getNumber() {
		return Optional.ofNullable(number);
	}

	public ReferredDocumentInformation7 setNumber(Max35Text number) {
		this.number = number;
		return this;
	}

	public Optional<ISODate> getRelatedDate() {
		return Optional.ofNullable(relatedDate);
	}

	public ReferredDocumentInformation7 setRelatedDate(ISODate relatedDate) {
		this.relatedDate = relatedDate;
		return this;
	}

	public List<DocumentLineInformation1> getLineDetails() {
		return lineDetails == null ? lineDetails = new ArrayList<>() : lineDetails;
	}

	public ReferredDocumentInformation7 setLineDetails(List<DocumentLineInformation1> lineDetails) {
		this.lineDetails = Objects.requireNonNull(lineDetails);
		return this;
	}
}