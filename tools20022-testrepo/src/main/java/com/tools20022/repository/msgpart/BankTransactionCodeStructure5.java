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
import com.tools20022.repository.codeset.ExternalBankTransactionDomain1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.BankTransactionCodeStructure6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure5#mmCode
 * BankTransactionCodeStructure5.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure5#mmFamily
 * BankTransactionCodeStructure5.mmFamily}</li>
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
 * "BankTransactionCodeStructure5"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BankTransactionCodeStructure5", propOrder = {"code", "family"})
public class BankTransactionCodeStructure5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected ExternalBankTransactionDomain1Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalBankTransactionDomain1Code
	 * ExternalBankTransactionDomain1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure5
	 * BankTransactionCodeStructure5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BankTransactionCodeStructure5, ExternalBankTransactionDomain1Code> mmCode = new MMMessageAttribute<BankTransactionCodeStructure5, ExternalBankTransactionDomain1Code>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.BankTransactionCodeStructure5.mmObject());
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Specifies the business area of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ExternalBankTransactionDomain1Code.mmObject());
		}

		@Override
		public ExternalBankTransactionDomain1Code getValue(BankTransactionCodeStructure5 obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(BankTransactionCodeStructure5 obj, ExternalBankTransactionDomain1Code value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "Fmly", required = true)
	protected BankTransactionCodeStructure6 family;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure6
	 * BankTransactionCodeStructure6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure5
	 * BankTransactionCodeStructure5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fmly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Family"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BankTransactionCodeStructure5, BankTransactionCodeStructure6> mmFamily = new MMMessageAssociationEnd<BankTransactionCodeStructure5, BankTransactionCodeStructure6>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.BankTransactionCodeStructure5.mmObject());
			isDerived = false;
			xmlTag = "Fmly";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Family";
			definition = "Specifies the family and the sub-family of the bank transaction code, within a specific domain, in a structured and hierarchical format.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BankTransactionCodeStructure6.mmObject());
		}

		@Override
		public BankTransactionCodeStructure6 getValue(BankTransactionCodeStructure5 obj) {
			return obj.getFamily();
		}

		@Override
		public void setValue(BankTransactionCodeStructure5 obj, BankTransactionCodeStructure6 value) {
			obj.setFamily(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.BankTransactionCodeStructure5.mmCode, com.tools20022.repository.msgpart.BankTransactionCodeStructure5.mmFamily));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BankTransactionCodeStructure5";
				definition = "Set of elements used to identify the type or operations code of a transaction entry.";
			}
		});
		return mmObject_lazy.get();
	}

	public ExternalBankTransactionDomain1Code getCode() {
		return code;
	}

	public BankTransactionCodeStructure5 setCode(ExternalBankTransactionDomain1Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public BankTransactionCodeStructure6 getFamily() {
		return family;
	}

	public BankTransactionCodeStructure5 setFamily(BankTransactionCodeStructure6 family) {
		this.family = Objects.requireNonNull(family);
		return this;
	}
}