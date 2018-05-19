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
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max4Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide information on the amount and reason of the
 * document adjustment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.DocumentAdjustment1#mmAmount
 * DocumentAdjustment1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.DocumentAdjustment1#mmCreditDebitIndicator
 * DocumentAdjustment1.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.DocumentAdjustment1#mmReason
 * DocumentAdjustment1.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.DocumentAdjustment1#mmAdditionalInformation
 * DocumentAdjustment1.mmAdditionalInformation}</li>
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
 * "DocumentAdjustment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide information on the amount and reason of the document adjustment."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DocumentAdjustment1", propOrder = {"amount", "creditDebitIndicator", "reason", "additionalInformation"})
public class DocumentAdjustment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.DocumentAdjustment1
	 * DocumentAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money of the document adjustment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DocumentAdjustment1, ActiveOrHistoricCurrencyAndAmount> mmAmount = new MMMessageAttribute<DocumentAdjustment1, ActiveOrHistoricCurrencyAndAmount>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.DocumentAdjustment1.mmObject());
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money of the document adjustment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyAndAmount.mmObject());
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(DocumentAdjustment1 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(DocumentAdjustment1 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "CdtDbtInd")
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.DocumentAdjustment1
	 * DocumentAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the adjustment must be substracted or added to the total amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DocumentAdjustment1, Optional<CreditDebitCode>> mmCreditDebitIndicator = new MMMessageAttribute<DocumentAdjustment1, Optional<CreditDebitCode>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.DocumentAdjustment1.mmObject());
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies whether the adjustment must be substracted or added to the total amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> CreditDebitCode.mmObject());
		}

		@Override
		public Optional<CreditDebitCode> getValue(DocumentAdjustment1 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(DocumentAdjustment1 obj, Optional<CreditDebitCode> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Rsn")
	protected Max4Text reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.DocumentAdjustment1
	 * DocumentAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the adjustment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DocumentAdjustment1, Optional<Max4Text>> mmReason = new MMMessageAttribute<DocumentAdjustment1, Optional<Max4Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.DocumentAdjustment1.mmObject());
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Specifies the reason for the adjustment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max4Text.mmObject());
		}

		@Override
		public Optional<Max4Text> getValue(DocumentAdjustment1 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(DocumentAdjustment1 obj, Optional<Max4Text> value) {
			obj.setReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max140Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.DocumentAdjustment1
	 * DocumentAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides further details on the document adjustment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DocumentAdjustment1, Optional<Max140Text>> mmAdditionalInformation = new MMMessageAttribute<DocumentAdjustment1, Optional<Max140Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.DocumentAdjustment1.mmObject());
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides further details on the document adjustment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max140Text.mmObject());
		}

		@Override
		public Optional<Max140Text> getValue(DocumentAdjustment1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(DocumentAdjustment1 obj, Optional<Max140Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.DocumentAdjustment1.mmAmount, com.tools20022.repository.msgpart.DocumentAdjustment1.mmCreditDebitIndicator,
						com.tools20022.repository.msgpart.DocumentAdjustment1.mmReason, com.tools20022.repository.msgpart.DocumentAdjustment1.mmAdditionalInformation));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentAdjustment1";
				definition = "Set of elements used to provide information on the amount and reason of the document adjustment.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getAmount() {
		return amount;
	}

	public DocumentAdjustment1 setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return Optional.ofNullable(creditDebitIndicator);
	}

	public DocumentAdjustment1 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public Optional<Max4Text> getReason() {
		return Optional.ofNullable(reason);
	}

	public DocumentAdjustment1 setReason(Max4Text reason) {
		this.reason = reason;
		return this;
	}

	public Optional<Max140Text> getAdditionalInformation() {
		return Optional.ofNullable(additionalInformation);
	}

	public DocumentAdjustment1 setAdditionalInformation(Max140Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}