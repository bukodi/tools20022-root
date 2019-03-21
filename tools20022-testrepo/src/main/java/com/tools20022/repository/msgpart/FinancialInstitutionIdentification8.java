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
import com.tools20022.repository.datatype.BICFIIdentifier;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.ClearingSystemMemberIdentification2;
import com.tools20022.repository.msgpart.GenericFinancialIdentification1;
import com.tools20022.repository.msgpart.PostalAddress6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to identify a financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.FinancialInstitutionIdentification8#mmBICFI
 * FinancialInstitutionIdentification8.mmBICFI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.FinancialInstitutionIdentification8#mmClearingSystemMemberIdentification
 * FinancialInstitutionIdentification8.mmClearingSystemMemberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.FinancialInstitutionIdentification8#mmName
 * FinancialInstitutionIdentification8.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.FinancialInstitutionIdentification8#mmPostalAddress
 * FinancialInstitutionIdentification8.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.FinancialInstitutionIdentification8#mmOther
 * FinancialInstitutionIdentification8.mmOther}</li>
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
 * "FinancialInstitutionIdentification8"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstitutionIdentification8", propOrder = {"bICFI", "clearingSystemMemberIdentification", "name", "postalAddress", "other"})
public class FinancialInstitutionIdentification8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BICFI")
	protected BICFIIdentifier bICFI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.FinancialInstitutionIdentification8
	 * FinancialInstitutionIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BICFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BICFI"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstitutionIdentification8, Optional<BICFIIdentifier>> mmBICFI = new MMMessageAttribute<FinancialInstitutionIdentification8, Optional<BICFIIdentifier>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.FinancialInstitutionIdentification8.mmObject());
			isDerived = false;
			xmlTag = "BICFI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BICFI";
			definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> BICFIIdentifier.mmObject());
		}

		@Override
		public Optional<BICFIIdentifier> getValue(FinancialInstitutionIdentification8 obj) {
			return obj.getBICFI();
		}

		@Override
		public void setValue(FinancialInstitutionIdentification8 obj, Optional<BICFIIdentifier> value) {
			obj.setBICFI(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrSysMmbId")
	protected ClearingSystemMemberIdentification2 clearingSystemMemberIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.ClearingSystemMemberIdentification2
	 * ClearingSystemMemberIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.FinancialInstitutionIdentification8
	 * FinancialInstitutionIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSysMmbId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemMemberIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstitutionIdentification8, Optional<ClearingSystemMemberIdentification2>> mmClearingSystemMemberIdentification = new MMMessageAssociationEnd<FinancialInstitutionIdentification8, Optional<ClearingSystemMemberIdentification2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.FinancialInstitutionIdentification8.mmObject());
			isDerived = false;
			xmlTag = "ClrSysMmbId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystemMemberIdentification";
			definition = "Information used to identify a member within a clearing system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> ClearingSystemMemberIdentification2.mmObject());
		}

		@Override
		public Optional<ClearingSystemMemberIdentification2> getValue(FinancialInstitutionIdentification8 obj) {
			return obj.getClearingSystemMemberIdentification();
		}

		@Override
		public void setValue(FinancialInstitutionIdentification8 obj, Optional<ClearingSystemMemberIdentification2> value) {
			obj.setClearingSystemMemberIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Nm")
	protected Max140Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.FinancialInstitutionIdentification8
	 * FinancialInstitutionIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstitutionIdentification8, Optional<Max140Text>> mmName = new MMMessageAttribute<FinancialInstitutionIdentification8, Optional<Max140Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.FinancialInstitutionIdentification8.mmObject());
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which an agent is known and which is usually used to identify that agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max140Text.mmObject());
		}

		@Override
		public Optional<Max140Text> getValue(FinancialInstitutionIdentification8 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(FinancialInstitutionIdentification8 obj, Optional<Max140Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "PstlAdr")
	protected PostalAddress6 postalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.FinancialInstitutionIdentification8
	 * FinancialInstitutionIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstlAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalAddress"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstitutionIdentification8, Optional<PostalAddress6>> mmPostalAddress = new MMMessageAssociationEnd<FinancialInstitutionIdentification8, Optional<PostalAddress6>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.FinancialInstitutionIdentification8.mmObject());
			isDerived = false;
			xmlTag = "PstlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalAddress";
			definition = "Information that locates and identifies a specific address, as defined by postal services.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PostalAddress6.mmObject());
		}

		@Override
		public Optional<PostalAddress6> getValue(FinancialInstitutionIdentification8 obj) {
			return obj.getPostalAddress();
		}

		@Override
		public void setValue(FinancialInstitutionIdentification8 obj, Optional<PostalAddress6> value) {
			obj.setPostalAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "Othr")
	protected GenericFinancialIdentification1 other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.GenericFinancialIdentification1
	 * GenericFinancialIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.FinancialInstitutionIdentification8
	 * FinancialInstitutionIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstitutionIdentification8, Optional<GenericFinancialIdentification1>> mmOther = new MMMessageAssociationEnd<FinancialInstitutionIdentification8, Optional<GenericFinancialIdentification1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.FinancialInstitutionIdentification8.mmObject());
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Unique identification of an agent, as assigned by an institution, using an identification scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> GenericFinancialIdentification1.mmObject());
		}

		@Override
		public Optional<GenericFinancialIdentification1> getValue(FinancialInstitutionIdentification8 obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(FinancialInstitutionIdentification8 obj, Optional<GenericFinancialIdentification1> value) {
			obj.setOther(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.FinancialInstitutionIdentification8.mmBICFI,
						com.tools20022.repository.msgpart.FinancialInstitutionIdentification8.mmClearingSystemMemberIdentification, com.tools20022.repository.msgpart.FinancialInstitutionIdentification8.mmName,
						com.tools20022.repository.msgpart.FinancialInstitutionIdentification8.mmPostalAddress, com.tools20022.repository.msgpart.FinancialInstitutionIdentification8.mmOther));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstitutionIdentification8";
				definition = "Set of elements used to identify a financial institution.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BICFIIdentifier> getBICFI() {
		return Optional.ofNullable(bICFI);
	}

	public FinancialInstitutionIdentification8 setBICFI(BICFIIdentifier bICFI) {
		this.bICFI = bICFI;
		return this;
	}

	public Optional<ClearingSystemMemberIdentification2> getClearingSystemMemberIdentification() {
		return Optional.ofNullable(clearingSystemMemberIdentification);
	}

	public FinancialInstitutionIdentification8 setClearingSystemMemberIdentification(ClearingSystemMemberIdentification2 clearingSystemMemberIdentification) {
		this.clearingSystemMemberIdentification = clearingSystemMemberIdentification;
		return this;
	}

	public Optional<Max140Text> getName() {
		return Optional.ofNullable(name);
	}

	public FinancialInstitutionIdentification8 setName(Max140Text name) {
		this.name = name;
		return this;
	}

	public Optional<PostalAddress6> getPostalAddress() {
		return Optional.ofNullable(postalAddress);
	}

	public FinancialInstitutionIdentification8 setPostalAddress(PostalAddress6 postalAddress) {
		this.postalAddress = postalAddress;
		return this;
	}

	public Optional<GenericFinancialIdentification1> getOther() {
		return Optional.ofNullable(other);
	}

	public FinancialInstitutionIdentification8 setOther(GenericFinancialIdentification1 other) {
		this.other = other;
		return this;
	}
}