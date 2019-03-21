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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.AmountAndDirection35;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements providing the total sum of entries.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.NumberAndSumOfTransactions4#mmNumberOfEntries
 * NumberAndSumOfTransactions4.mmNumberOfEntries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.NumberAndSumOfTransactions4#mmSum
 * NumberAndSumOfTransactions4.mmSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.NumberAndSumOfTransactions4#mmTotalNetEntry
 * NumberAndSumOfTransactions4.mmTotalNetEntry}</li>
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
 * "NumberAndSumOfTransactions4"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NumberAndSumOfTransactions4", propOrder = {"numberOfEntries", "sum", "totalNetEntry"})
public class NumberAndSumOfTransactions4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NbOfNtries")
	protected Max15NumericText numberOfEntries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.NumberAndSumOfTransactions4
	 * NumberAndSumOfTransactions4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfNtries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfEntries"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NumberAndSumOfTransactions4, Optional<Max15NumericText>> mmNumberOfEntries = new MMMessageAttribute<NumberAndSumOfTransactions4, Optional<Max15NumericText>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.NumberAndSumOfTransactions4.mmObject());
			isDerived = false;
			xmlTag = "NbOfNtries";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfEntries";
			definition = "Number of individual entries included in the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max15NumericText.mmObject());
		}

		@Override
		public Optional<Max15NumericText> getValue(NumberAndSumOfTransactions4 obj) {
			return obj.getNumberOfEntries();
		}

		@Override
		public void setValue(NumberAndSumOfTransactions4 obj, Optional<Max15NumericText> value) {
			obj.setNumberOfEntries(value.orElse(null));
		}
	};
	@XmlElement(name = "Sum")
	protected DecimalNumber sum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.NumberAndSumOfTransactions4
	 * NumberAndSumOfTransactions4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sum"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NumberAndSumOfTransactions4, Optional<DecimalNumber>> mmSum = new MMMessageAttribute<NumberAndSumOfTransactions4, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.NumberAndSumOfTransactions4.mmObject());
			isDerived = false;
			xmlTag = "Sum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sum";
			definition = "Total of all individual entries included in the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> DecimalNumber.mmObject());
		}

		@Override
		public Optional<DecimalNumber> getValue(NumberAndSumOfTransactions4 obj) {
			return obj.getSum();
		}

		@Override
		public void setValue(NumberAndSumOfTransactions4 obj, Optional<DecimalNumber> value) {
			obj.setSum(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNetNtry")
	protected AmountAndDirection35 totalNetEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msgpart.AmountAndDirection35
	 * AmountAndDirection35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.NumberAndSumOfTransactions4
	 * NumberAndSumOfTransactions4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNetNtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNetEntry"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NumberAndSumOfTransactions4, Optional<AmountAndDirection35>> mmTotalNetEntry = new MMMessageAttribute<NumberAndSumOfTransactions4, Optional<AmountAndDirection35>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.NumberAndSumOfTransactions4.mmObject());
			isDerived = false;
			xmlTag = "TtlNetNtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNetEntry";
			definition = "Resulting debit or credit amount of the netted amounts for all debit and credit entries.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = LazyReference.create(() -> AmountAndDirection35.mmObject());
		}

		@Override
		public Optional<AmountAndDirection35> getValue(NumberAndSumOfTransactions4 obj) {
			return obj.getTotalNetEntry();
		}

		@Override
		public void setValue(NumberAndSumOfTransactions4 obj, Optional<AmountAndDirection35> value) {
			obj.setTotalNetEntry(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.NumberAndSumOfTransactions4.mmNumberOfEntries, com.tools20022.repository.msgpart.NumberAndSumOfTransactions4.mmSum,
						com.tools20022.repository.msgpart.NumberAndSumOfTransactions4.mmTotalNetEntry));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NumberAndSumOfTransactions4";
				definition = "Set of elements providing the total sum of entries.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max15NumericText> getNumberOfEntries() {
		return Optional.ofNullable(numberOfEntries);
	}

	public NumberAndSumOfTransactions4 setNumberOfEntries(Max15NumericText numberOfEntries) {
		this.numberOfEntries = numberOfEntries;
		return this;
	}

	public Optional<DecimalNumber> getSum() {
		return Optional.ofNullable(sum);
	}

	public NumberAndSumOfTransactions4 setSum(DecimalNumber sum) {
		this.sum = sum;
		return this;
	}

	public Optional<AmountAndDirection35> getTotalNetEntry() {
		return Optional.ofNullable(totalNetEntry);
	}

	public NumberAndSumOfTransactions4 setTotalNetEntry(AmountAndDirection35 totalNetEntry) {
		this.totalNetEntry = totalNetEntry;
		return this;
	}
}