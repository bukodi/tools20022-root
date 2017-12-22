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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.BICFIIdentifier;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstitutionIdentification8", propOrder = {"BICFI", "clearingSystemMemberIdentification", "name", "postalAddress", "other"})
public class FinancialInstitutionIdentification8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BICFIIdentifier bICFI;
	public static final MMMessageAttribute mmBICFI = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstitutionIdentification8.mmObject();
			isDerived = false;
			xmlTag = "BICFI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BICFI";
			definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}
	};
	protected ClearingSystemMemberIdentification2 clearingSystemMemberIdentification;
	public static final MMMessageAssociationEnd mmClearingSystemMemberIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstitutionIdentification8.mmObject();
			isDerived = false;
			xmlTag = "ClrSysMmbId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystemMemberIdentification";
			definition = "Information used to identify a member within a clearing system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ClearingSystemMemberIdentification2.mmObject();
		}
	};
	protected Max140Text name;
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstitutionIdentification8.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which an agent is known and which is usually used to identify that agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected PostalAddress6 postalAddress;
	public static final MMMessageAssociationEnd mmPostalAddress = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstitutionIdentification8.mmObject();
			isDerived = false;
			xmlTag = "PstlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalAddress";
			definition = "Information that locates and identifies a specific address, as defined by postal services.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
		}
	};
	protected GenericFinancialIdentification1 other;
	public static final MMMessageAssociationEnd mmOther = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstitutionIdentification8.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Unique identification of an agent, as assigned by an institution, using an identification scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericFinancialIdentification1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstitutionIdentification8.mmBICFI, FinancialInstitutionIdentification8.mmClearingSystemMemberIdentification, FinancialInstitutionIdentification8.mmName,
						FinancialInstitutionIdentification8.mmPostalAddress, FinancialInstitutionIdentification8.mmOther);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstitutionIdentification8";
				definition = "Set of elements used to identify a financial institution.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BICFI")
	public BICFIIdentifier getBICFI() {
		return bICFI;
	}

	public void setBICFI(BICFIIdentifier bICFI) {
		this.bICFI = bICFI;
	}

	@XmlElement(name = "ClrSysMmbId")
	public ClearingSystemMemberIdentification2 getClearingSystemMemberIdentification() {
		return clearingSystemMemberIdentification;
	}

	public void setClearingSystemMemberIdentification(com.tools20022.repository.msg.ClearingSystemMemberIdentification2 clearingSystemMemberIdentification) {
		this.clearingSystemMemberIdentification = clearingSystemMemberIdentification;
	}

	@XmlElement(name = "Nm")
	public Max140Text getName() {
		return name;
	}

	public void setName(Max140Text name) {
		this.name = name;
	}

	@XmlElement(name = "PstlAdr")
	public PostalAddress6 getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(com.tools20022.repository.msg.PostalAddress6 postalAddress) {
		this.postalAddress = postalAddress;
	}

	@XmlElement(name = "Othr")
	public GenericFinancialIdentification1 getOther() {
		return other;
	}

	public void setOther(com.tools20022.repository.msg.GenericFinancialIdentification1 other) {
		this.other = other;
	}
}