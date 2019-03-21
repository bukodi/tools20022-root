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
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.constraint.ConstraintDomainOrProprietaryRule;
import com.tools20022.repository.constraint.ConstraintFamilyAndSubFamilyRule;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.BankTransactionCodeStructure5;
import com.tools20022.repository.msgpart.ProprietaryBankTransactionCodeStructure1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to identify the type or operations code of a transaction
 * entry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure4#mmDomain
 * BankTransactionCodeStructure4.mmDomain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure4#mmProprietary
 * BankTransactionCodeStructure4.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraints
 * constraints} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure4#DomainOrProprietaryRule
 * BankTransactionCodeStructure4.DomainOrProprietaryRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure4#FamilyAndSubFamilyRule
 * BankTransactionCodeStructure4.FamilyAndSubFamilyRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BankTransactionCodeStructure4"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BankTransactionCodeStructure4", propOrder = {"domain", "proprietary"})
public class BankTransactionCodeStructure4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Domn")
	protected BankTransactionCodeStructure5 domain;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure5
	 * BankTransactionCodeStructure5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Domn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domain"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BankTransactionCodeStructure4, Optional<BankTransactionCodeStructure5>> mmDomain = new MMMessageAssociationEnd<BankTransactionCodeStructure4, Optional<BankTransactionCodeStructure5>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.BankTransactionCodeStructure4.mmObject());
			isDerived = false;
			xmlTag = "Domn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Domain";
			definition = "Set of elements used to provide the domain, the family and the sub-family of the bank transaction code, in a structured and hierarchical format.\n\nUsage: If a specific family or sub-family code cannot be provided, the generic family code defined for the domain or the generic sub-family code defined for the family should be provided.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BankTransactionCodeStructure5.mmObject());
		}

		@Override
		public Optional<BankTransactionCodeStructure5> getValue(BankTransactionCodeStructure4 obj) {
			return obj.getDomain();
		}

		@Override
		public void setValue(BankTransactionCodeStructure4 obj, Optional<BankTransactionCodeStructure5> value) {
			obj.setDomain(value.orElse(null));
		}
	};
	@XmlElement(name = "Prtry")
	protected ProprietaryBankTransactionCodeStructure1 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.ProprietaryBankTransactionCodeStructure1
	 * ProprietaryBankTransactionCodeStructure1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BankTransactionCodeStructure4, Optional<ProprietaryBankTransactionCodeStructure1>> mmProprietary = new MMMessageAssociationEnd<BankTransactionCodeStructure4, Optional<ProprietaryBankTransactionCodeStructure1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.BankTransactionCodeStructure4.mmObject());
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Bank transaction code in a proprietary form, as defined by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> ProprietaryBankTransactionCodeStructure1.mmObject());
		}

		@Override
		public Optional<ProprietaryBankTransactionCodeStructure1> getValue(BankTransactionCodeStructure4 obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(BankTransactionCodeStructure4 obj, Optional<ProprietaryBankTransactionCodeStructure1> value) {
			obj.setProprietary(value.orElse(null));
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Domain&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Proprietary&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomainOrProprietaryRule"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.msgpart.BankTransactionCodeStructure4> DomainOrProprietaryRule = new MMConstraint<com.tools20022.repository.msgpart.BankTransactionCodeStructure4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomainOrProprietaryRule";
			definition = "Either Proprietary or Domain or both must be present.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.BankTransactionCodeStructure4.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Domain</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Proprietary</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.msgpart.BankTransactionCodeStructure4 obj) throws Exception {
			ConstraintDomainOrProprietaryRule.checkBankTransactionCodeStructure4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FamilyAndSubFamilyRule"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.msgpart.BankTransactionCodeStructure4> FamilyAndSubFamilyRule = new MMConstraint<com.tools20022.repository.msgpart.BankTransactionCodeStructure4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FamilyAndSubFamilyRule";
			definition = "If a specific (non-generic) Family code is not present, then a specific (non-generic) SubFamily code is not allowed.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.BankTransactionCodeStructure4.mmObject());
		}

		@Override
		public void executeValidator(com.tools20022.repository.msgpart.BankTransactionCodeStructure4 obj) throws Exception {
			ConstraintFamilyAndSubFamilyRule.checkBankTransactionCodeStructure4(obj);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.BankTransactionCodeStructure4.mmDomain, com.tools20022.repository.msgpart.BankTransactionCodeStructure4.mmProprietary));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				constraints_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.BankTransactionCodeStructure4.DomainOrProprietaryRule,
						com.tools20022.repository.msgpart.BankTransactionCodeStructure4.FamilyAndSubFamilyRule));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BankTransactionCodeStructure4";
				definition = "Set of elements used to identify the type or operations code of a transaction entry.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BankTransactionCodeStructure5> getDomain() {
		return Optional.ofNullable(domain);
	}

	public BankTransactionCodeStructure4 setDomain(BankTransactionCodeStructure5 domain) {
		this.domain = domain;
		return this;
	}

	public Optional<ProprietaryBankTransactionCodeStructure1> getProprietary() {
		return Optional.ofNullable(proprietary);
	}

	public BankTransactionCodeStructure4 setProprietary(ProprietaryBankTransactionCodeStructure1 proprietary) {
		this.proprietary = proprietary;
		return this;
	}
}