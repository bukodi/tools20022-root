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
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.GenericIdentification32;
import com.tools20022.repository.msgpart.PointOfInteractionCapabilities1;
import com.tools20022.repository.msgpart.PointOfInteractionComponent1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Point of interaction (POI) performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PointOfInteraction1#mmIdentification
 * PointOfInteraction1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PointOfInteraction1#mmSystemName
 * PointOfInteraction1.mmSystemName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PointOfInteraction1#mmGroupIdentification
 * PointOfInteraction1.mmGroupIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PointOfInteraction1#mmCapabilities
 * PointOfInteraction1.mmCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PointOfInteraction1#mmComponent
 * PointOfInteraction1.mmComponent}</li>
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
 * "PointOfInteraction1"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PointOfInteraction1", propOrder = {"identification", "systemName", "groupIdentification", "capabilities", "component"})
public class PointOfInteraction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected GenericIdentification32 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteraction1
	 * PointOfInteraction1}</li>
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
	public static final MMMessageAssociationEnd<PointOfInteraction1, GenericIdentification32> mmIdentification = new MMMessageAssociationEnd<PointOfInteraction1, GenericIdentification32>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PointOfInteraction1.mmObject());
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the POI (Point Of Interaction) for the acquirer or its agent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = LazyReference.create(() -> GenericIdentification32.mmObject());
		}

		@Override
		public GenericIdentification32 getValue(PointOfInteraction1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(PointOfInteraction1 obj, GenericIdentification32 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "SysNm")
	protected Max70Text systemName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteraction1
	 * PointOfInteraction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemName"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteraction1, Optional<Max70Text>> mmSystemName = new MMMessageAttribute<PointOfInteraction1, Optional<Max70Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PointOfInteraction1.mmObject());
			isDerived = false;
			xmlTag = "SysNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemName";
			definition = "Common name assigned by the acquirer to the POI system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max70Text.mmObject());
		}

		@Override
		public Optional<Max70Text> getValue(PointOfInteraction1 obj) {
			return obj.getSystemName();
		}

		@Override
		public void setValue(PointOfInteraction1 obj, Optional<Max70Text> value) {
			obj.setSystemName(value.orElse(null));
		}
	};
	@XmlElement(name = "GrpId")
	protected Max35Text groupIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteraction1
	 * PointOfInteraction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteraction1, Optional<Max35Text>> mmGroupIdentification = new MMMessageAttribute<PointOfInteraction1, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PointOfInteraction1.mmObject());
			isDerived = false;
			xmlTag = "GrpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupIdentification";
			definition = "Identifier assigned by the merchant identifying a set of POI terminals performing some categories of transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(PointOfInteraction1 obj) {
			return obj.getGroupIdentification();
		}

		@Override
		public void setValue(PointOfInteraction1 obj, Optional<Max35Text> value) {
			obj.setGroupIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Cpblties")
	protected PointOfInteractionCapabilities1 capabilities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionCapabilities1
	 * PointOfInteractionCapabilities1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteraction1
	 * PointOfInteraction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capabilities"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PointOfInteraction1, Optional<PointOfInteractionCapabilities1>> mmCapabilities = new MMMessageAssociationEnd<PointOfInteraction1, Optional<PointOfInteractionCapabilities1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PointOfInteraction1.mmObject());
			isDerived = false;
			xmlTag = "Cpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capabilities";
			definition = "Capabilities of the POI performing the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PointOfInteractionCapabilities1.mmObject());
		}

		@Override
		public Optional<PointOfInteractionCapabilities1> getValue(PointOfInteraction1 obj) {
			return obj.getCapabilities();
		}

		@Override
		public void setValue(PointOfInteraction1 obj, Optional<PointOfInteractionCapabilities1> value) {
			obj.setCapabilities(value.orElse(null));
		}
	};
	@XmlElement(name = "Cmpnt")
	protected List<PointOfInteractionComponent1> component;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionComponent1
	 * PointOfInteractionComponent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteraction1
	 * PointOfInteraction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmpnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Component"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PointOfInteraction1, List<PointOfInteractionComponent1>> mmComponent = new MMMessageAssociationEnd<PointOfInteraction1, List<PointOfInteractionComponent1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PointOfInteraction1.mmObject());
			isDerived = false;
			xmlTag = "Cmpnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Component";
			definition = "Data related to a component of the POI performing the transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PointOfInteractionComponent1.mmObject());
		}

		@Override
		public List<PointOfInteractionComponent1> getValue(PointOfInteraction1 obj) {
			return obj.getComponent();
		}

		@Override
		public void setValue(PointOfInteraction1 obj, List<PointOfInteractionComponent1> value) {
			obj.setComponent(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.PointOfInteraction1.mmIdentification, com.tools20022.repository.msgpart.PointOfInteraction1.mmSystemName,
						com.tools20022.repository.msgpart.PointOfInteraction1.mmGroupIdentification, com.tools20022.repository.msgpart.PointOfInteraction1.mmCapabilities, com.tools20022.repository.msgpart.PointOfInteraction1.mmComponent));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteraction1";
				definition = "Point of interaction (POI) performing the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification32 getIdentification() {
		return identification;
	}

	public PointOfInteraction1 setIdentification(GenericIdentification32 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max70Text> getSystemName() {
		return Optional.ofNullable(systemName);
	}

	public PointOfInteraction1 setSystemName(Max70Text systemName) {
		this.systemName = systemName;
		return this;
	}

	public Optional<Max35Text> getGroupIdentification() {
		return Optional.ofNullable(groupIdentification);
	}

	public PointOfInteraction1 setGroupIdentification(Max35Text groupIdentification) {
		this.groupIdentification = groupIdentification;
		return this;
	}

	public Optional<PointOfInteractionCapabilities1> getCapabilities() {
		return Optional.ofNullable(capabilities);
	}

	public PointOfInteraction1 setCapabilities(PointOfInteractionCapabilities1 capabilities) {
		this.capabilities = capabilities;
		return this;
	}

	public List<PointOfInteractionComponent1> getComponent() {
		return component == null ? component = new ArrayList<>() : component;
	}

	public PointOfInteraction1 setComponent(List<PointOfInteractionComponent1> component) {
		this.component = Objects.requireNonNull(component);
		return this;
	}
}