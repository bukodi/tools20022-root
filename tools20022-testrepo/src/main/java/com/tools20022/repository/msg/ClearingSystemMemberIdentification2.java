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
import com.tools20022.repository.choice.ClearingSystemIdentification2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ClearingSystemMemberIdentification2", propOrder = {"clearingSystemIdentification", "memberIdentification"})
public class ClearingSystemMemberIdentification2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ClearingSystemIdentification2Choice clearingSystemIdentification;
	public static final MMMessageAssociationEnd mmClearingSystemIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentification2.mmObject();
			isDerived = false;
			xmlTag = "ClrSysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystemIdentification";
			definition = "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClearingSystemIdentification2Choice.mmObject();
		}
	};
	protected Max35Text memberIdentification;
	public static final MMMessageAttribute mmMemberIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentification2.mmObject();
			isDerived = false;
			xmlTag = "MmbId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberIdentification";
			definition = "Identification of a member of a clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ClearingSystemMemberIdentification2.mmClearingSystemIdentification, ClearingSystemMemberIdentification2.mmMemberIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingSystemMemberIdentification2";
				definition = "Unique identification, as assigned by a clearing system, to unambiguously identify a member of the clearing system.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ClrSysId")
	public ClearingSystemIdentification2Choice getClearingSystemIdentification() {
		return clearingSystemIdentification;
	}

	public void setClearingSystemIdentification(ClearingSystemIdentification2Choice clearingSystemIdentification) {
		this.clearingSystemIdentification = clearingSystemIdentification;
	}

	@XmlElement(name = "MmbId", required = true)
	public Max35Text getMemberIdentification() {
		return memberIdentification;
	}

	public void setMemberIdentification(Max35Text memberIdentification) {
		this.memberIdentification = memberIdentification;
	}
}