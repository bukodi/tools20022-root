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
import com.tools20022.repository.codeset.POIComponentType1Code;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Data related to a component of the POI performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionComponent1#mmPOIComponentType
 * PointOfInteractionComponent1.mmPOIComponentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionComponent1#mmManufacturerIdentification
 * PointOfInteractionComponent1.mmManufacturerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionComponent1#mmModel
 * PointOfInteractionComponent1.mmModel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionComponent1#mmVersionNumber
 * PointOfInteractionComponent1.mmVersionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionComponent1#mmSerialNumber
 * PointOfInteractionComponent1.mmSerialNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionComponent1#mmApprovalNumber
 * PointOfInteractionComponent1.mmApprovalNumber}</li>
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
 * "PointOfInteractionComponent1"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PointOfInteractionComponent1", propOrder = {"pOIComponentType", "manufacturerIdentification", "model", "versionNumber", "serialNumber", "approvalNumber"})
public class PointOfInteractionComponent1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "POICmpntTp", required = true)
	protected POIComponentType1Code pOIComponentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionComponent1
	 * PointOfInteractionComponent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POICmpntTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIComponentType"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponent1, POIComponentType1Code> mmPOIComponentType = new MMMessageAttribute<PointOfInteractionComponent1, POIComponentType1Code>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PointOfInteractionComponent1.mmObject());
			isDerived = false;
			xmlTag = "POICmpntTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIComponentType";
			definition = "Type of component belonging to a POI Terminal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> POIComponentType1Code.mmObject());
		}

		@Override
		public POIComponentType1Code getValue(PointOfInteractionComponent1 obj) {
			return obj.getPOIComponentType();
		}

		@Override
		public void setValue(PointOfInteractionComponent1 obj, POIComponentType1Code value) {
			obj.setPOIComponentType(value);
		}
	};
	@XmlElement(name = "ManfctrId")
	protected Max35Text manufacturerIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionComponent1
	 * PointOfInteractionComponent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ManfctrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManufacturerIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponent1, Optional<Max35Text>> mmManufacturerIdentification = new MMMessageAttribute<PointOfInteractionComponent1, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PointOfInteractionComponent1.mmObject());
			isDerived = false;
			xmlTag = "ManfctrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManufacturerIdentification";
			definition = "Identification of the software, hardware or system provider of the POI component.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(PointOfInteractionComponent1 obj) {
			return obj.getManufacturerIdentification();
		}

		@Override
		public void setValue(PointOfInteractionComponent1 obj, Optional<Max35Text> value) {
			obj.setManufacturerIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Mdl")
	protected Max35Text model;
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
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionComponent1
	 * PointOfInteractionComponent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mdl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Model"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponent1, Optional<Max35Text>> mmModel = new MMMessageAttribute<PointOfInteractionComponent1, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PointOfInteractionComponent1.mmObject());
			isDerived = false;
			xmlTag = "Mdl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Model";
			definition = "Identification of a model of POI component for a given manufacturer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(PointOfInteractionComponent1 obj) {
			return obj.getModel();
		}

		@Override
		public void setValue(PointOfInteractionComponent1 obj, Optional<Max35Text> value) {
			obj.setModel(value.orElse(null));
		}
	};
	@XmlElement(name = "VrsnNb")
	protected Max16Text versionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionComponent1
	 * PointOfInteractionComponent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VrsnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VersionNumber"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponent1, Optional<Max16Text>> mmVersionNumber = new MMMessageAttribute<PointOfInteractionComponent1, Optional<Max16Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PointOfInteractionComponent1.mmObject());
			isDerived = false;
			xmlTag = "VrsnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VersionNumber";
			definition = "Version of component belonging to a given model.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max16Text.mmObject());
		}

		@Override
		public Optional<Max16Text> getValue(PointOfInteractionComponent1 obj) {
			return obj.getVersionNumber();
		}

		@Override
		public void setValue(PointOfInteractionComponent1 obj, Optional<Max16Text> value) {
			obj.setVersionNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "SrlNb")
	protected Max35Text serialNumber;
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
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionComponent1
	 * PointOfInteractionComponent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SerialNumber"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponent1, Optional<Max35Text>> mmSerialNumber = new MMMessageAttribute<PointOfInteractionComponent1, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PointOfInteractionComponent1.mmObject());
			isDerived = false;
			xmlTag = "SrlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SerialNumber";
			definition = "Serial number of a component.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(PointOfInteractionComponent1 obj) {
			return obj.getSerialNumber();
		}

		@Override
		public void setValue(PointOfInteractionComponent1 obj, Optional<Max35Text> value) {
			obj.setSerialNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "ApprvlNb")
	protected List<Max70Text> approvalNumber;
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
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteractionComponent1
	 * PointOfInteractionComponent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApprvlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovalNumber"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponent1, List<Max70Text>> mmApprovalNumber = new MMMessageAttribute<PointOfInteractionComponent1, List<Max70Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PointOfInteractionComponent1.mmObject());
			isDerived = false;
			xmlTag = "ApprvlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovalNumber";
			definition = "Unique approval number for a component, delivered by a certification body.\r\nUsage: More than one approval number could be present, when assigned by different bodies. The certification body identification must be provided within the approval number (for example at the beginning of the value).";
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max70Text.mmObject());
		}

		@Override
		public List<Max70Text> getValue(PointOfInteractionComponent1 obj) {
			return obj.getApprovalNumber();
		}

		@Override
		public void setValue(PointOfInteractionComponent1 obj, List<Max70Text> value) {
			obj.setApprovalNumber(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.PointOfInteractionComponent1.mmPOIComponentType,
						com.tools20022.repository.msgpart.PointOfInteractionComponent1.mmManufacturerIdentification, com.tools20022.repository.msgpart.PointOfInteractionComponent1.mmModel,
						com.tools20022.repository.msgpart.PointOfInteractionComponent1.mmVersionNumber, com.tools20022.repository.msgpart.PointOfInteractionComponent1.mmSerialNumber,
						com.tools20022.repository.msgpart.PointOfInteractionComponent1.mmApprovalNumber));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionComponent1";
				definition = "Data related to a component of the POI performing the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public POIComponentType1Code getPOIComponentType() {
		return pOIComponentType;
	}

	public PointOfInteractionComponent1 setPOIComponentType(POIComponentType1Code pOIComponentType) {
		this.pOIComponentType = Objects.requireNonNull(pOIComponentType);
		return this;
	}

	public Optional<Max35Text> getManufacturerIdentification() {
		return Optional.ofNullable(manufacturerIdentification);
	}

	public PointOfInteractionComponent1 setManufacturerIdentification(Max35Text manufacturerIdentification) {
		this.manufacturerIdentification = manufacturerIdentification;
		return this;
	}

	public Optional<Max35Text> getModel() {
		return Optional.ofNullable(model);
	}

	public PointOfInteractionComponent1 setModel(Max35Text model) {
		this.model = model;
		return this;
	}

	public Optional<Max16Text> getVersionNumber() {
		return Optional.ofNullable(versionNumber);
	}

	public PointOfInteractionComponent1 setVersionNumber(Max16Text versionNumber) {
		this.versionNumber = versionNumber;
		return this;
	}

	public Optional<Max35Text> getSerialNumber() {
		return Optional.ofNullable(serialNumber);
	}

	public PointOfInteractionComponent1 setSerialNumber(Max35Text serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	public List<Max70Text> getApprovalNumber() {
		return approvalNumber == null ? approvalNumber = new ArrayList<>() : approvalNumber;
	}

	public PointOfInteractionComponent1 setApprovalNumber(List<Max70Text> approvalNumber) {
		this.approvalNumber = Objects.requireNonNull(approvalNumber);
		return this;
	}
}