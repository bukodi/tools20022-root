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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04;
import com.tools20022.repository.codeset.CaseForwardingNotification3Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CaseForwardingNotification3", propOrder = "justification")
public class CaseForwardingNotification3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CaseForwardingNotification3Code justification;
	public static final MMMessageAttribute mmJustification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CaseForwardingNotification3.mmObject();
			isDerived = false;
			xmlTag = "Justfn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Justification";
			definition = "Justification for the forward action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CaseForwardingNotification3Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CaseForwardingNotification3.mmJustification);
				messageBuildingBlock_lazy = () -> Arrays.asList(NotificationOfCaseAssignmentV04.mmNotification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CaseForwardingNotification3";
				definition = "Status of a case resulting from a case assignment.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Justfn", required = true)
	public CaseForwardingNotification3Code getJustification() {
		return justification;
	}

	public void setJustification(CaseForwardingNotification3Code justification) {
		this.justification = justification;
	}
}