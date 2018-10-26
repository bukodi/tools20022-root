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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.BranchData2;
import com.tools20022.repository.msgpart.FinancialInstitutionIdentification7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to uniquely and unambiguously identify a financial
 * institution or a branch of a financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4#mmFinancialInstitutionIdentification
 * BranchAndFinancialInstitutionIdentification4.
 * mmFinancialInstitutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4#mmBranchIdentification
 * BranchAndFinancialInstitutionIdentification4.mmBranchIdentification}</li>
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
 * "BranchAndFinancialInstitutionIdentification4"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BranchAndFinancialInstitutionIdentification4", propOrder = {"financialInstitutionIdentification", "branchIdentification"})
public class BranchAndFinancialInstitutionIdentification4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstnId", required = true)
	protected FinancialInstitutionIdentification7 financialInstitutionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.FinancialInstitutionIdentification7
	 * FinancialInstitutionIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstitutionIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BranchAndFinancialInstitutionIdentification4, FinancialInstitutionIdentification7> mmFinancialInstitutionIdentification = new MMMessageAssociationEnd<BranchAndFinancialInstitutionIdentification4, FinancialInstitutionIdentification7>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4.mmObject());
			isDerived = false;
			xmlTag = "FinInstnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstitutionIdentification";
			definition = "Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = LazyReference.create(() -> FinancialInstitutionIdentification7.mmObject());
		}

		@Override
		public FinancialInstitutionIdentification7 getValue(BranchAndFinancialInstitutionIdentification4 obj) {
			return obj.getFinancialInstitutionIdentification();
		}

		@Override
		public void setValue(BranchAndFinancialInstitutionIdentification4 obj, FinancialInstitutionIdentification7 value) {
			obj.setFinancialInstitutionIdentification(value);
		}
	};
	@XmlElement(name = "BrnchId")
	protected BranchData2 branchIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.BranchData2
	 * BranchData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrnchId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BranchIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BranchAndFinancialInstitutionIdentification4, Optional<BranchData2>> mmBranchIdentification = new MMMessageAssociationEnd<BranchAndFinancialInstitutionIdentification4, Optional<BranchData2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4.mmObject());
			isDerived = false;
			xmlTag = "BrnchId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BranchIdentification";
			definition = "Identifies a specific branch of a financial institution.\n\nUsage: This component should be used in case the identification information in the financial institution component does not provide identification up to branch level.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BranchData2.mmObject());
		}

		@Override
		public Optional<BranchData2> getValue(BranchAndFinancialInstitutionIdentification4 obj) {
			return obj.getBranchIdentification();
		}

		@Override
		public void setValue(BranchAndFinancialInstitutionIdentification4 obj, Optional<BranchData2> value) {
			obj.setBranchIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4.mmFinancialInstitutionIdentification,
						com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4.mmBranchIdentification));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BranchAndFinancialInstitutionIdentification4";
				definition = "Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstitutionIdentification7 getFinancialInstitutionIdentification() {
		return financialInstitutionIdentification;
	}

	public BranchAndFinancialInstitutionIdentification4 setFinancialInstitutionIdentification(FinancialInstitutionIdentification7 financialInstitutionIdentification) {
		this.financialInstitutionIdentification = Objects.requireNonNull(financialInstitutionIdentification);
		return this;
	}

	public Optional<BranchData2> getBranchIdentification() {
		return Optional.ofNullable(branchIdentification);
	}

	public BranchAndFinancialInstitutionIdentification4 setBranchIdentification(BranchData2 branchIdentification) {
		this.branchIdentification = branchIdentification;
		return this;
	}
}