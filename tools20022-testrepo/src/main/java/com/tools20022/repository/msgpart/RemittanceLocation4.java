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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.RemittanceLocationDetails1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide information on the remittance advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocation4#mmRemittanceIdentification
 * RemittanceLocation4.mmRemittanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocation4#mmRemittanceLocationDetails
 * RemittanceLocation4.mmRemittanceLocationDetails}</li>
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
 * "RemittanceLocation4"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RemittanceLocation4", propOrder = {"remittanceIdentification", "remittanceLocationDetails"})
public class RemittanceLocation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RmtId")
	protected Max35Text remittanceIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocation4
	 * RemittanceLocation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RemittanceLocation4, Optional<Max35Text>> mmRemittanceIdentification = new MMMessageAttribute<RemittanceLocation4, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.RemittanceLocation4.mmObject());
			isDerived = false;
			xmlTag = "RmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceIdentification";
			definition = "Unique identification, as assigned by the initiating party, to unambiguously identify the remittance information sent separately from the payment instruction, such as a remittance advice.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(RemittanceLocation4 obj) {
			return obj.getRemittanceIdentification();
		}

		@Override
		public void setValue(RemittanceLocation4 obj, Optional<Max35Text> value) {
			obj.setRemittanceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RmtLctnDtls")
	protected List<RemittanceLocationDetails1> remittanceLocationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocationDetails1
	 * RemittanceLocationDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocation4
	 * RemittanceLocation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtLctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceLocationDetails"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RemittanceLocation4, List<RemittanceLocationDetails1>> mmRemittanceLocationDetails = new MMMessageAssociationEnd<RemittanceLocation4, List<RemittanceLocationDetails1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.RemittanceLocation4.mmObject());
			isDerived = false;
			xmlTag = "RmtLctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceLocationDetails";
			definition = "Set of elements used to provide information on the location and/or delivery of the remittance information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> RemittanceLocationDetails1.mmObject());
		}

		@Override
		public List<RemittanceLocationDetails1> getValue(RemittanceLocation4 obj) {
			return obj.getRemittanceLocationDetails();
		}

		@Override
		public void setValue(RemittanceLocation4 obj, List<RemittanceLocationDetails1> value) {
			obj.setRemittanceLocationDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.RemittanceLocation4.mmRemittanceIdentification,
						com.tools20022.repository.msgpart.RemittanceLocation4.mmRemittanceLocationDetails));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RemittanceLocation4";
				definition = "Set of elements used to provide information on the remittance advice.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getRemittanceIdentification() {
		return Optional.ofNullable(remittanceIdentification);
	}

	public RemittanceLocation4 setRemittanceIdentification(Max35Text remittanceIdentification) {
		this.remittanceIdentification = remittanceIdentification;
		return this;
	}

	public List<RemittanceLocationDetails1> getRemittanceLocationDetails() {
		return remittanceLocationDetails == null ? remittanceLocationDetails = new ArrayList<>() : remittanceLocationDetails;
	}

	public RemittanceLocation4 setRemittanceLocationDetails(List<RemittanceLocationDetails1> remittanceLocationDetails) {
		this.remittanceLocationDetails = Objects.requireNonNull(remittanceLocationDetails);
		return this;
	}
}