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

package com.tools20022.repository.choice;

import com.tools20022.core.repo.LazyReference;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.OriginalAndCurrentQuantities1;
import com.tools20022.repository.msgpart.ProprietaryQuantity1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the quantities (such as securities) in the underlying transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice#mmQuantity
 * TransactionQuantities2Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice#mmOriginalAndCurrentFaceAmount
 * TransactionQuantities2Choice.mmOriginalAndCurrentFaceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice#mmProprietary
 * TransactionQuantities2Choice.mmProprietary}</li>
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
 * "TransactionQuantities2Choice"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionQuantities2Choice", propOrder = {"quantity", "originalAndCurrentFaceAmount", "proprietary"})
public class TransactionQuantities2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Qty", required = true)
	protected FinancialInstrumentQuantityChoice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice
	 * TransactionQuantities2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionQuantities2Choice, FinancialInstrumentQuantityChoice> mmQuantity = new MMMessageAssociationEnd<TransactionQuantities2Choice, FinancialInstrumentQuantityChoice>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.choice.TransactionQuantities2Choice.mmObject());
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Specifies the quantity (such as securities) in the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = LazyReference.create(() -> FinancialInstrumentQuantityChoice.mmObject());
		}

		@Override
		public FinancialInstrumentQuantityChoice getValue(TransactionQuantities2Choice obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(TransactionQuantities2Choice obj, FinancialInstrumentQuantityChoice value) {
			obj.setQuantity(value);
		}
	};
	@XmlElement(name = "OrgnlAndCurFaceAmt", required = true)
	protected OriginalAndCurrentQuantities1 originalAndCurrentFaceAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msgpart.OriginalAndCurrentQuantities1
	 * OriginalAndCurrentQuantities1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice
	 * TransactionQuantities2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlAndCurFaceAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalAndCurrentFaceAmount"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionQuantities2Choice, OriginalAndCurrentQuantities1> mmOriginalAndCurrentFaceAmount = new MMMessageAttribute<TransactionQuantities2Choice, OriginalAndCurrentQuantities1>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.choice.TransactionQuantities2Choice.mmObject());
			isDerived = false;
			xmlTag = "OrgnlAndCurFaceAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAndCurrentFaceAmount";
			definition = "Face amount and amortised value of security.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = LazyReference.create(() -> OriginalAndCurrentQuantities1.mmObject());
		}

		@Override
		public OriginalAndCurrentQuantities1 getValue(TransactionQuantities2Choice obj) {
			return obj.getOriginalAndCurrentFaceAmount();
		}

		@Override
		public void setValue(TransactionQuantities2Choice obj, OriginalAndCurrentQuantities1 value) {
			obj.setOriginalAndCurrentFaceAmount(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected ProprietaryQuantity1 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.ProprietaryQuantity1
	 * ProprietaryQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice
	 * TransactionQuantities2Choice}</li>
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
	public static final MMMessageAssociationEnd<TransactionQuantities2Choice, ProprietaryQuantity1> mmProprietary = new MMMessageAssociationEnd<TransactionQuantities2Choice, ProprietaryQuantity1>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.choice.TransactionQuantities2Choice.mmObject());
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary quantities specification defined in the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = LazyReference.create(() -> ProprietaryQuantity1.mmObject());
		}

		@Override
		public ProprietaryQuantity1 getValue(TransactionQuantities2Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(TransactionQuantities2Choice obj, ProprietaryQuantity1 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.choice.TransactionQuantities2Choice.mmQuantity,
						com.tools20022.repository.choice.TransactionQuantities2Choice.mmOriginalAndCurrentFaceAmount, com.tools20022.repository.choice.TransactionQuantities2Choice.mmProprietary));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionQuantities2Choice";
				definition = "Specifies the quantities (such as securities) in the underlying transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentQuantityChoice getQuantity() {
		return quantity;
	}

	public TransactionQuantities2Choice setQuantity(FinancialInstrumentQuantityChoice quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public OriginalAndCurrentQuantities1 getOriginalAndCurrentFaceAmount() {
		return originalAndCurrentFaceAmount;
	}

	public TransactionQuantities2Choice setOriginalAndCurrentFaceAmount(OriginalAndCurrentQuantities1 originalAndCurrentFaceAmount) {
		this.originalAndCurrentFaceAmount = Objects.requireNonNull(originalAndCurrentFaceAmount);
		return this;
	}

	public ProprietaryQuantity1 getProprietary() {
		return proprietary;
	}

	public TransactionQuantities2Choice setProprietary(ProprietaryQuantity1 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}