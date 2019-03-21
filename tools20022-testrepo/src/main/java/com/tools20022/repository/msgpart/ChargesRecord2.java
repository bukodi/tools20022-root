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
import com.tools20022.repository.choice.ChargeType3Choice;
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ChargeIncludedIndicator;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.msgpart.TaxCharges2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further individual record details on the charges related to the
 * payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgpart.ChargesRecord2#mmAmount
 * ChargesRecord2.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ChargesRecord2#mmCreditDebitIndicator
 * ChargesRecord2.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ChargesRecord2#mmChargeIncludedIndicator
 * ChargesRecord2.mmChargeIncludedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.ChargesRecord2#mmType
 * ChargesRecord2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.ChargesRecord2#mmRate
 * ChargesRecord2.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.ChargesRecord2#mmBearer
 * ChargesRecord2.mmBearer}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.ChargesRecord2#mmAgent
 * ChargesRecord2.mmAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.ChargesRecord2#mmTax
 * ChargesRecord2.mmTax}</li>
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
 * "ChargesRecord2"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ChargesRecord2", propOrder = {"amount", "creditDebitIndicator", "chargeIncludedIndicator", "type", "rate", "bearer", "agent", "tax"})
public class ChargesRecord2 {

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
	 * {@linkplain com.tools20022.repository.msgpart.ChargesRecord2
	 * ChargesRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ChargesRecord2, ActiveOrHistoricCurrencyAndAmount> mmAmount = new MMMessageAttribute<ChargesRecord2, ActiveOrHistoricCurrencyAndAmount>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ChargesRecord2.mmObject());
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Transaction charges to be paid by the charge bearer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyAndAmount.mmObject());
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(ChargesRecord2 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(ChargesRecord2 obj, ActiveOrHistoricCurrencyAndAmount value) {
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
	 * {@linkplain com.tools20022.repository.msgpart.ChargesRecord2
	 * ChargesRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ChargesRecord2, Optional<CreditDebitCode>> mmCreditDebitIndicator = new MMMessageAttribute<ChargesRecord2, Optional<CreditDebitCode>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ChargesRecord2.mmObject());
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the charges amount is a credit or a debit amount. \nUsage: A zero amount is considered to be a credit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> CreditDebitCode.mmObject());
		}

		@Override
		public Optional<CreditDebitCode> getValue(ChargesRecord2 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(ChargesRecord2 obj, Optional<CreditDebitCode> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgInclInd")
	protected ChargeIncludedIndicator chargeIncludedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ChargeIncludedIndicator
	 * ChargeIncludedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ChargesRecord2
	 * ChargesRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgInclInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeIncludedIndicator"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ChargesRecord2, Optional<ChargeIncludedIndicator>> mmChargeIncludedIndicator = new MMMessageAttribute<ChargesRecord2, Optional<ChargeIncludedIndicator>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ChargesRecord2.mmObject());
			isDerived = false;
			xmlTag = "ChrgInclInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeIncludedIndicator";
			definition = "Indicates whether the charge should be included in the amount or is added as pre-advice.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ChargeIncludedIndicator.mmObject());
		}

		@Override
		public Optional<ChargeIncludedIndicator> getValue(ChargesRecord2 obj) {
			return obj.getChargeIncludedIndicator();
		}

		@Override
		public void setValue(ChargesRecord2 obj, Optional<ChargeIncludedIndicator> value) {
			obj.setChargeIncludedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected ChargeType3Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ChargeType3Choice
	 * ChargeType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ChargesRecord2
	 * ChargesRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ChargesRecord2, Optional<ChargeType3Choice>> mmType = new MMMessageAssociationEnd<ChargesRecord2, Optional<ChargeType3Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ChargesRecord2.mmObject());
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of charge.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> ChargeType3Choice.mmObject());
		}

		@Override
		public Optional<ChargeType3Choice> getValue(ChargesRecord2 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(ChargesRecord2 obj, Optional<ChargeType3Choice> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Rate")
	protected PercentageRate rate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ChargesRecord2
	 * ChargesRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ChargesRecord2, Optional<PercentageRate>> mmRate = new MMMessageAttribute<ChargesRecord2, Optional<PercentageRate>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ChargesRecord2.mmObject());
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Rate used to calculate the amount of the charge or fee.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> PercentageRate.mmObject());
		}

		@Override
		public Optional<PercentageRate> getValue(ChargesRecord2 obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(ChargesRecord2 obj, Optional<PercentageRate> value) {
			obj.setRate(value.orElse(null));
		}
	};
	@XmlElement(name = "Br")
	protected ChargeBearerType1Code bearer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ChargesRecord2
	 * ChargesRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Br"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bearer"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ChargesRecord2, Optional<ChargeBearerType1Code>> mmBearer = new MMMessageAttribute<ChargesRecord2, Optional<ChargeBearerType1Code>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ChargesRecord2.mmObject());
			isDerived = false;
			xmlTag = "Br";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bearer";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ChargeBearerType1Code.mmObject());
		}

		@Override
		public Optional<ChargeBearerType1Code> getValue(ChargesRecord2 obj) {
			return obj.getBearer();
		}

		@Override
		public void setValue(ChargesRecord2 obj, Optional<ChargeBearerType1Code> value) {
			obj.setBearer(value.orElse(null));
		}
	};
	@XmlElement(name = "Agt")
	protected BranchAndFinancialInstitutionIdentification5 agent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ChargesRecord2
	 * ChargesRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Agt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agent"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ChargesRecord2, Optional<BranchAndFinancialInstitutionIdentification5>> mmAgent = new MMMessageAssociationEnd<ChargesRecord2, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ChargesRecord2.mmObject());
			isDerived = false;
			xmlTag = "Agt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agent";
			definition = "Agent that takes the transaction charges or to which the transaction charges are due.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BranchAndFinancialInstitutionIdentification5.mmObject());
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(ChargesRecord2 obj) {
			return obj.getAgent();
		}

		@Override
		public void setValue(ChargesRecord2 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "Tax")
	protected TaxCharges2 tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.TaxCharges2
	 * TaxCharges2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ChargesRecord2
	 * ChargesRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ChargesRecord2, Optional<TaxCharges2>> mmTax = new MMMessageAssociationEnd<ChargesRecord2, Optional<TaxCharges2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ChargesRecord2.mmObject());
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Provides details on the tax applied to charges.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TaxCharges2.mmObject());
		}

		@Override
		public Optional<TaxCharges2> getValue(ChargesRecord2 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(ChargesRecord2 obj, Optional<TaxCharges2> value) {
			obj.setTax(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.ChargesRecord2.mmAmount, com.tools20022.repository.msgpart.ChargesRecord2.mmCreditDebitIndicator,
						com.tools20022.repository.msgpart.ChargesRecord2.mmChargeIncludedIndicator, com.tools20022.repository.msgpart.ChargesRecord2.mmType, com.tools20022.repository.msgpart.ChargesRecord2.mmRate,
						com.tools20022.repository.msgpart.ChargesRecord2.mmBearer, com.tools20022.repository.msgpart.ChargesRecord2.mmAgent, com.tools20022.repository.msgpart.ChargesRecord2.mmTax));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargesRecord2";
				definition = "Provides further individual record details on the charges related to the payment transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getAmount() {
		return amount;
	}

	public ChargesRecord2 setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return Optional.ofNullable(creditDebitIndicator);
	}

	public ChargesRecord2 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public Optional<ChargeIncludedIndicator> getChargeIncludedIndicator() {
		return Optional.ofNullable(chargeIncludedIndicator);
	}

	public ChargesRecord2 setChargeIncludedIndicator(ChargeIncludedIndicator chargeIncludedIndicator) {
		this.chargeIncludedIndicator = chargeIncludedIndicator;
		return this;
	}

	public Optional<ChargeType3Choice> getType() {
		return Optional.ofNullable(type);
	}

	public ChargesRecord2 setType(ChargeType3Choice type) {
		this.type = type;
		return this;
	}

	public Optional<PercentageRate> getRate() {
		return Optional.ofNullable(rate);
	}

	public ChargesRecord2 setRate(PercentageRate rate) {
		this.rate = rate;
		return this;
	}

	public Optional<ChargeBearerType1Code> getBearer() {
		return Optional.ofNullable(bearer);
	}

	public ChargesRecord2 setBearer(ChargeBearerType1Code bearer) {
		this.bearer = bearer;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getAgent() {
		return Optional.ofNullable(agent);
	}

	public ChargesRecord2 setAgent(BranchAndFinancialInstitutionIdentification5 agent) {
		this.agent = agent;
		return this;
	}

	public Optional<TaxCharges2> getTax() {
		return Optional.ofNullable(tax);
	}

	public ChargesRecord2 setTax(TaxCharges2 tax) {
		this.tax = tax;
		return this;
	}
}