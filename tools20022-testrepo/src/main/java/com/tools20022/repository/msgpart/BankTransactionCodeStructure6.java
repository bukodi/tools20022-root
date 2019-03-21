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
import com.tools20022.repository.codeset.ExternalBankTransactionFamily1Code;
import com.tools20022.repository.codeset.ExternalBankTransactionSubFamily1Code;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure6#mmCode
 * BankTransactionCodeStructure6.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure6#mmSubFamilyCode
 * BankTransactionCodeStructure6.mmSubFamilyCode}</li>
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
 * "BankTransactionCodeStructure6"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BankTransactionCodeStructure6", propOrder = {"code", "subFamilyCode"})
public class BankTransactionCodeStructure6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected ExternalBankTransactionFamily1Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalBankTransactionFamily1Code
	 * ExternalBankTransactionFamily1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure6
	 * BankTransactionCodeStructure6}</li>
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
	public static final MMMessageAttribute<BankTransactionCodeStructure6, ExternalBankTransactionFamily1Code> mmCode = new MMMessageAttribute<BankTransactionCodeStructure6, ExternalBankTransactionFamily1Code>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.BankTransactionCodeStructure6.mmObject());
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Specifies the family within a domain.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ExternalBankTransactionFamily1Code.mmObject());
		}

		@Override
		public ExternalBankTransactionFamily1Code getValue(BankTransactionCodeStructure6 obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(BankTransactionCodeStructure6 obj, ExternalBankTransactionFamily1Code value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "SubFmlyCd", required = true)
	protected ExternalBankTransactionSubFamily1Code subFamilyCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalBankTransactionSubFamily1Code
	 * ExternalBankTransactionSubFamily1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure6
	 * BankTransactionCodeStructure6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubFmlyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubFamilyCode"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BankTransactionCodeStructure6, ExternalBankTransactionSubFamily1Code> mmSubFamilyCode = new MMMessageAttribute<BankTransactionCodeStructure6, ExternalBankTransactionSubFamily1Code>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.BankTransactionCodeStructure6.mmObject());
			isDerived = false;
			xmlTag = "SubFmlyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubFamilyCode";
			definition = "Specifies the sub-product family within a specific family.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ExternalBankTransactionSubFamily1Code.mmObject());
		}

		@Override
		public ExternalBankTransactionSubFamily1Code getValue(BankTransactionCodeStructure6 obj) {
			return obj.getSubFamilyCode();
		}

		@Override
		public void setValue(BankTransactionCodeStructure6 obj, ExternalBankTransactionSubFamily1Code value) {
			obj.setSubFamilyCode(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.BankTransactionCodeStructure6.mmCode, com.tools20022.repository.msgpart.BankTransactionCodeStructure6.mmSubFamilyCode));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BankTransactionCodeStructure6";
				definition = "Set of elements used to identify the type or operations code of a transaction entry.";
			}
		});
		return mmObject_lazy.get();
	}

	public ExternalBankTransactionFamily1Code getCode() {
		return code;
	}

	public BankTransactionCodeStructure6 setCode(ExternalBankTransactionFamily1Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public ExternalBankTransactionSubFamily1Code getSubFamilyCode() {
		return subFamilyCode;
	}

	public BankTransactionCodeStructure6 setSubFamilyCode(ExternalBankTransactionSubFamily1Code subFamilyCode) {
		this.subFamilyCode = Objects.requireNonNull(subFamilyCode);
		return this;
	}
}