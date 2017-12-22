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
import com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04;
import com.tools20022.repository.choice.Party12Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Case3", propOrder = {"identification", "creator", "reopenCaseIndication"})
public class Case3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Case3.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies the case.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Party12Choice creator;
	public static final MMMessageAssociationEnd mmCreator = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Case3.mmObject();
			isDerived = false;
			xmlTag = "Cretr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creator";
			definition = "Party that created the investigation case.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party12Choice.mmObject();
		}
	};
	protected YesNoIndicator reopenCaseIndication;
	public static final MMMessageAttribute mmReopenCaseIndication = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Case3.mmObject();
			isDerived = false;
			xmlTag = "ReopCaseIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReopenCaseIndication";
			definition = "Indicates whether or not the case was previously closed and is now re-opened.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Case3.mmIdentification, Case3.mmCreator, Case3.mmReopenCaseIndication);
				messageBuildingBlock_lazy = () -> Arrays.asList(NotificationOfCaseAssignmentV04.mmCase);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Case3";
				definition = "Provides further details to identify an investigation case.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Cretr", required = true)
	public Party12Choice getCreator() {
		return creator;
	}

	public void setCreator(Party12Choice creator) {
		this.creator = creator;
	}

	@XmlElement(name = "ReopCaseIndctn")
	public YesNoIndicator getReopenCaseIndication() {
		return reopenCaseIndication;
	}

	public void setReopenCaseIndication(YesNoIndicator reopenCaseIndication) {
		this.reopenCaseIndication = reopenCaseIndication;
	}
}