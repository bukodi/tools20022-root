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
import com.tools20022.repository.codeset.RegulatoryReportingType1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RegulatoryAuthority2;
import com.tools20022.repository.msg.StructuredRegulatoryReporting3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information needed due to regulatory and/or statutory requirements.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting3#mmDebitCreditReportingIndicator
 * RegulatoryReporting3.mmDebitCreditReportingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting3#mmAuthority
 * RegulatoryReporting3.mmAuthority}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegulatoryReporting3#mmDetails
 * RegulatoryReporting3.mmDetails}</li>
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
 * "RegulatoryReporting3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information needed due to regulatory and/or statutory requirements."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RegulatoryReporting3", propOrder = {"debitCreditReportingIndicator", "authority", "details"})
public class RegulatoryReporting3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DbtCdtRptgInd")
	protected RegulatoryReportingType1Code debitCreditReportingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingType1Code
	 * RegulatoryReportingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting3
	 * RegulatoryReporting3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtCdtRptgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCreditReportingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting3, Optional<RegulatoryReportingType1Code>> mmDebitCreditReportingIndicator = new MMMessageAttribute<RegulatoryReporting3, Optional<RegulatoryReportingType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting3.mmObject();
			isDerived = false;
			xmlTag = "DbtCdtRptgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCreditReportingIndicator";
			definition = "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RegulatoryReportingType1Code.mmObject();
		}

		@Override
		public Optional<RegulatoryReportingType1Code> getValue(RegulatoryReporting3 obj) {
			return obj.getDebitCreditReportingIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting3 obj, Optional<RegulatoryReportingType1Code> value) {
			obj.setDebitCreditReportingIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Authrty")
	protected RegulatoryAuthority2 authority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RegulatoryAuthority2
	 * RegulatoryAuthority2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting3
	 * RegulatoryReporting3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Authrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity requiring the regulatory reporting information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RegulatoryReporting3, Optional<RegulatoryAuthority2>> mmAuthority = new MMMessageAssociationEnd<RegulatoryReporting3, Optional<RegulatoryAuthority2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting3.mmObject();
			isDerived = false;
			xmlTag = "Authrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authority";
			definition = "Entity requiring the regulatory reporting information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RegulatoryAuthority2.mmObject();
		}

		@Override
		public Optional<RegulatoryAuthority2> getValue(RegulatoryReporting3 obj) {
			return obj.getAuthority();
		}

		@Override
		public void setValue(RegulatoryReporting3 obj, Optional<RegulatoryAuthority2> value) {
			obj.setAuthority(value.orElse(null));
		}
	};
	@XmlElement(name = "Dtls")
	protected List<StructuredRegulatoryReporting3> details;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3
	 * StructuredRegulatoryReporting3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting3
	 * RegulatoryReporting3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Details"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide details on the regulatory reporting information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RegulatoryReporting3, List<StructuredRegulatoryReporting3>> mmDetails = new MMMessageAssociationEnd<RegulatoryReporting3, List<StructuredRegulatoryReporting3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting3.mmObject();
			isDerived = false;
			xmlTag = "Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Details";
			definition = "Set of elements used to provide details on the regulatory reporting information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StructuredRegulatoryReporting3.mmObject();
		}

		@Override
		public List<StructuredRegulatoryReporting3> getValue(RegulatoryReporting3 obj) {
			return obj.getDetails();
		}

		@Override
		public void setValue(RegulatoryReporting3 obj, List<StructuredRegulatoryReporting3> value) {
			obj.setDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting3.mmDebitCreditReportingIndicator, com.tools20022.repository.msg.RegulatoryReporting3.mmAuthority,
						com.tools20022.repository.msg.RegulatoryReporting3.mmDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReporting3";
				definition = "Information needed due to regulatory and/or statutory requirements.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RegulatoryReportingType1Code> getDebitCreditReportingIndicator() {
		return debitCreditReportingIndicator == null ? Optional.empty() : Optional.of(debitCreditReportingIndicator);
	}

	public RegulatoryReporting3 setDebitCreditReportingIndicator(RegulatoryReportingType1Code debitCreditReportingIndicator) {
		this.debitCreditReportingIndicator = debitCreditReportingIndicator;
		return this;
	}

	public Optional<RegulatoryAuthority2> getAuthority() {
		return authority == null ? Optional.empty() : Optional.of(authority);
	}

	public RegulatoryReporting3 setAuthority(RegulatoryAuthority2 authority) {
		this.authority = authority;
		return this;
	}

	public List<StructuredRegulatoryReporting3> getDetails() {
		return details == null ? details = new ArrayList<>() : details;
	}

	public RegulatoryReporting3 setDetails(List<StructuredRegulatoryReporting3> details) {
		this.details = Objects.requireNonNull(details);
		return this;
	}
}