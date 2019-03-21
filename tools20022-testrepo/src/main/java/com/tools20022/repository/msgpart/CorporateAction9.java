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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * An event determined by a corporation's board of directors, that changes the
 * existing corporate capital structure or financial condition.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CorporateAction9#mmEventType
 * CorporateAction9.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CorporateAction9#mmEventIdentification
 * CorporateAction9.mmEventIdentification}</li>
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
 * "CorporateAction9"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateAction9", propOrder = {"eventType", "eventIdentification"})
public class CorporateAction9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "EvtTp", required = true)
	protected Max35Text eventType;
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
	 * {@linkplain com.tools20022.repository.msgpart.CorporateAction9
	 * CorporateAction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction9, Max35Text> mmEventType = new MMMessageAttribute<CorporateAction9, Max35Text>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CorporateAction9.mmObject());
			isDerived = false;
			xmlTag = "EvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "Type of corporate action event, in a free-text format.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Max35Text getValue(CorporateAction9 obj) {
			return obj.getEventType();
		}

		@Override
		public void setValue(CorporateAction9 obj, Max35Text value) {
			obj.setEventType(value);
		}
	};
	@XmlElement(name = "EvtId", required = true)
	protected Max35Text eventIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.CorporateAction9
	 * CorporateAction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction9, Max35Text> mmEventIdentification = new MMMessageAttribute<CorporateAction9, Max35Text>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CorporateAction9.mmObject());
			isDerived = false;
			xmlTag = "EvtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventIdentification";
			definition = "Identification of a corporate action assigned by an official central body/entity within a given market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Max35Text getValue(CorporateAction9 obj) {
			return obj.getEventIdentification();
		}

		@Override
		public void setValue(CorporateAction9 obj, Max35Text value) {
			obj.setEventIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.CorporateAction9.mmEventType, com.tools20022.repository.msgpart.CorporateAction9.mmEventIdentification));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateAction9";
				definition = "An event determined by a corporation's board of directors, that changes the existing corporate capital structure or financial condition.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getEventType() {
		return eventType;
	}

	public CorporateAction9 setEventType(Max35Text eventType) {
		this.eventType = Objects.requireNonNull(eventType);
		return this;
	}

	public Max35Text getEventIdentification() {
		return eventIdentification;
	}

	public CorporateAction9 setEventIdentification(Max35Text eventIdentification) {
		this.eventIdentification = Objects.requireNonNull(eventIdentification);
		return this;
	}
}