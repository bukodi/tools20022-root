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
import com.tools20022.repository.datatype.Max2048Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.DocumentLineIdentification1;
import com.tools20022.repository.msgpart.RemittanceAmount3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides document line information.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.DocumentLineInformation1#mmIdentification
 * DocumentLineInformation1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.DocumentLineInformation1#mmDescription
 * DocumentLineInformation1.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.DocumentLineInformation1#mmAmount
 * DocumentLineInformation1.mmAmount}</li>
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
 * "DocumentLineInformation1"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DocumentLineInformation1", propOrder = {"identification", "description", "amount"})
public class DocumentLineInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected List<DocumentLineIdentification1> identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.DocumentLineIdentification1
	 * DocumentLineIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.DocumentLineInformation1
	 * DocumentLineInformation1}</li>
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
	public static final MMMessageAssociationEnd<DocumentLineInformation1, List<DocumentLineIdentification1>> mmIdentification = new MMMessageAssociationEnd<DocumentLineInformation1, List<DocumentLineIdentification1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.DocumentLineInformation1.mmObject());
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Provides identification of the document line.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = LazyReference.create(() -> DocumentLineIdentification1.mmObject());
		}

		@Override
		public List<DocumentLineIdentification1> getValue(DocumentLineInformation1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(DocumentLineInformation1 obj, List<DocumentLineIdentification1> value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Desc")
	protected Max2048Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2048Text
	 * Max2048Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.DocumentLineInformation1
	 * DocumentLineInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DocumentLineInformation1, Optional<Max2048Text>> mmDescription = new MMMessageAttribute<DocumentLineInformation1, Optional<Max2048Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.DocumentLineInformation1.mmObject());
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Description associated with the document line.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max2048Text.mmObject());
		}

		@Override
		public Optional<Max2048Text> getValue(DocumentLineInformation1 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(DocumentLineInformation1 obj, Optional<Max2048Text> value) {
			obj.setDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "Amt")
	protected RemittanceAmount3 amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.RemittanceAmount3
	 * RemittanceAmount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.DocumentLineInformation1
	 * DocumentLineInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DocumentLineInformation1, Optional<RemittanceAmount3>> mmAmount = new MMMessageAssociationEnd<DocumentLineInformation1, Optional<RemittanceAmount3>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.DocumentLineInformation1.mmObject());
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Provides details on the amounts of the document line.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> RemittanceAmount3.mmObject());
		}

		@Override
		public Optional<RemittanceAmount3> getValue(DocumentLineInformation1 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(DocumentLineInformation1 obj, Optional<RemittanceAmount3> value) {
			obj.setAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.DocumentLineInformation1.mmIdentification, com.tools20022.repository.msgpart.DocumentLineInformation1.mmDescription,
						com.tools20022.repository.msgpart.DocumentLineInformation1.mmAmount));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentLineInformation1";
				definition = "Provides document line information.\r\n";
			}
		});
		return mmObject_lazy.get();
	}

	public List<DocumentLineIdentification1> getIdentification() {
		return identification == null ? identification = new ArrayList<>() : identification;
	}

	public DocumentLineInformation1 setIdentification(List<DocumentLineIdentification1> identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max2048Text> getDescription() {
		return Optional.ofNullable(description);
	}

	public DocumentLineInformation1 setDescription(Max2048Text description) {
		this.description = description;
		return this;
	}

	public Optional<RemittanceAmount3> getAmount() {
		return Optional.ofNullable(amount);
	}

	public DocumentLineInformation1 setAmount(RemittanceAmount3 amount) {
		this.amount = amount;
		return this;
	}
}