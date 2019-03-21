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
import com.tools20022.repository.choice.LocalInstrument2Choice;
import com.tools20022.repository.choice.Purpose2Choice;
import com.tools20022.repository.choice.TransactionPrice4Choice;
import com.tools20022.repository.choice.TransactionQuantities2Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the underlying transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmReferences
 * EntryTransaction9.mmReferences}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmAmount
 * EntryTransaction9.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmCreditDebitIndicator
 * EntryTransaction9.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmAmountDetails
 * EntryTransaction9.mmAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmAvailability
 * EntryTransaction9.mmAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmBankTransactionCode
 * EntryTransaction9.mmBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmCharges
 * EntryTransaction9.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmInterest
 * EntryTransaction9.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmRelatedParties
 * EntryTransaction9.mmRelatedParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmRelatedAgents
 * EntryTransaction9.mmRelatedAgents}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmLocalInstrument
 * EntryTransaction9.mmLocalInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmPurpose
 * EntryTransaction9.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmRelatedRemittanceInformation
 * EntryTransaction9.mmRelatedRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmRemittanceInformation
 * EntryTransaction9.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmRelatedDates
 * EntryTransaction9.mmRelatedDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmRelatedPrice
 * EntryTransaction9.mmRelatedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmRelatedQuantities
 * EntryTransaction9.mmRelatedQuantities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmFinancialInstrumentIdentification
 * EntryTransaction9.mmFinancialInstrumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmTax
 * EntryTransaction9.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmReturnInformation
 * EntryTransaction9.mmReturnInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmCorporateAction
 * EntryTransaction9.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmSafekeepingAccount
 * EntryTransaction9.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmCashDeposit
 * EntryTransaction9.mmCashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmCardTransaction
 * EntryTransaction9.mmCardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmAdditionalTransactionInformation
 * EntryTransaction9.mmAdditionalTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9#mmSupplementaryData
 * EntryTransaction9.mmSupplementaryData}</li>
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
 * "EntryTransaction9"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EntryTransaction9", propOrder = {"references", "amount", "creditDebitIndicator", "amountDetails", "availability", "bankTransactionCode", "charges", "interest", "relatedParties", "relatedAgents", "localInstrument",
		"purpose", "relatedRemittanceInformation", "remittanceInformation", "relatedDates", "relatedPrice", "relatedQuantities", "financialInstrumentIdentification", "tax", "returnInformation", "corporateAction", "safekeepingAccount",
		"cashDeposit", "cardTransaction", "additionalTransactionInformation", "supplementaryData"})
public class EntryTransaction9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Refs")
	protected TransactionReferences3 references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<TransactionReferences3>> mmReferences = new MMMessageAssociationEnd<EntryTransaction9, Optional<TransactionReferences3>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Provides the identification of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TransactionReferences3.mmObject());
		}

		@Override
		public Optional<TransactionReferences3> getValue(EntryTransaction9 obj) {
			return obj.getReferences();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<TransactionReferences3> value) {
			obj.setReferences(value.orElse(null));
		}
	};
	@XmlElement(name = "Amt")
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
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
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
	public static final MMMessageAttribute<EntryTransaction9, Optional<ActiveOrHistoricCurrencyAndAmount>> mmAmount = new MMMessageAttribute<EntryTransaction9, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money in the cash transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyAndAmount.mmObject());
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(EntryTransaction9 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setAmount(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
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
	public static final MMMessageAttribute<EntryTransaction9, Optional<CreditDebitCode>> mmCreditDebitIndicator = new MMMessageAttribute<EntryTransaction9, Optional<CreditDebitCode>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the transaction is a credit or a debit transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> CreditDebitCode.mmObject());
		}

		@Override
		public Optional<CreditDebitCode> getValue(EntryTransaction9 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<CreditDebitCode> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AmtDtls")
	protected AmountAndCurrencyExchange3 amountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.AmountAndCurrencyExchange3
	 * AmountAndCurrencyExchange3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDetails"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<AmountAndCurrencyExchange3>> mmAmountDetails = new MMMessageAssociationEnd<EntryTransaction9, Optional<AmountAndCurrencyExchange3>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "AmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDetails";
			definition = "Provides detailed information on the original amount.\n\nUsage: This component (on transaction level) should be used in case booking is for a single transaction and the original amount is different from the entry amount. It can also be used in case individual original amounts are provided in case of a batch or aggregate booking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> AmountAndCurrencyExchange3.mmObject());
		}

		@Override
		public Optional<AmountAndCurrencyExchange3> getValue(EntryTransaction9 obj) {
			return obj.getAmountDetails();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<AmountAndCurrencyExchange3> value) {
			obj.setAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "Avlbty")
	protected List<CashAvailability1> availability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.CashAvailability1
	 * CashAvailability1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Avlbty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, List<CashAvailability1>> mmAvailability = new MMMessageAssociationEnd<EntryTransaction9, List<CashAvailability1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "Avlbty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Availability";
			definition = "Indicates when the booked amount of money will become available, that is can be accessed and starts generating interest. \n\nUsage: This type of information is used in the US and is linked to particular instruments such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the amount of money will only be accessible as of the indicated availability day (according to national banking regulations).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CashAvailability1.mmObject());
		}

		@Override
		public List<CashAvailability1> getValue(EntryTransaction9 obj) {
			return obj.getAvailability();
		}

		@Override
		public void setValue(EntryTransaction9 obj, List<CashAvailability1> value) {
			obj.setAvailability(value);
		}
	};
	@XmlElement(name = "BkTxCd")
	protected BankTransactionCodeStructure4 bankTransactionCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkTxCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransactionCode"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<BankTransactionCodeStructure4>> mmBankTransactionCode = new MMMessageAssociationEnd<EntryTransaction9, Optional<BankTransactionCodeStructure4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "BkTxCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankTransactionCode";
			definition = "Set of elements used to fully identify the type of underlying transaction resulting in an entry.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BankTransactionCodeStructure4.mmObject());
		}

		@Override
		public Optional<BankTransactionCodeStructure4> getValue(EntryTransaction9 obj) {
			return obj.getBankTransactionCode();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<BankTransactionCodeStructure4> value) {
			obj.setBankTransactionCode(value.orElse(null));
		}
	};
	@XmlElement(name = "Chrgs")
	protected Charges4 charges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.Charges4 Charges4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chrgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<Charges4>> mmCharges = new MMMessageAssociationEnd<EntryTransaction9, Optional<Charges4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "Chrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Provides information on the charges, pre-advised or included in the entry amount.\r\n\r\nUsage: This component (on transaction level) can be used in case the booking is for a single transaction, and charges are included in the entry amount. It can also be used in case individual charge amounts are applied to individual transactions in case of a batch or aggregate amount booking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> Charges4.mmObject());
		}

		@Override
		public Optional<Charges4> getValue(EntryTransaction9 obj) {
			return obj.getCharges();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<Charges4> value) {
			obj.setCharges(value.orElse(null));
		}
	};
	@XmlElement(name = "Intrst")
	protected TransactionInterest4 interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionInterest4
	 * TransactionInterest4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<TransactionInterest4>> mmInterest = new MMMessageAssociationEnd<EntryTransaction9, Optional<TransactionInterest4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Provides details of the interest amount included in the entry amount.\n\nUsage: This component (on transaction level) can be used if the booking is for a single transaction, and interest amount is included in the entry amount. It can also be used if individual interest amounts are applied to individual transactions in the case of a batch or aggregate amount booking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TransactionInterest4.mmObject());
		}

		@Override
		public Optional<TransactionInterest4> getValue(EntryTransaction9 obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<TransactionInterest4> value) {
			obj.setInterest(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdPties")
	protected TransactionParties4 relatedParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4
	 * TransactionParties4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedParties"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<TransactionParties4>> mmRelatedParties = new MMMessageAssociationEnd<EntryTransaction9, Optional<TransactionParties4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "RltdPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedParties";
			definition = "Set of elements used to identify the parties related to the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TransactionParties4.mmObject());
		}

		@Override
		public Optional<TransactionParties4> getValue(EntryTransaction9 obj) {
			return obj.getRelatedParties();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<TransactionParties4> value) {
			obj.setRelatedParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdAgts")
	protected TransactionAgents4 relatedAgents;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.TransactionAgents4
	 * TransactionAgents4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdAgts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAgents"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<TransactionAgents4>> mmRelatedAgents = new MMMessageAssociationEnd<EntryTransaction9, Optional<TransactionAgents4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "RltdAgts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedAgents";
			definition = "Set of elements used to identify the agents related to the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TransactionAgents4.mmObject());
		}

		@Override
		public Optional<TransactionAgents4> getValue(EntryTransaction9 obj) {
			return obj.getRelatedAgents();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<TransactionAgents4> value) {
			obj.setRelatedAgents(value.orElse(null));
		}
	};
	@XmlElement(name = "LclInstrm")
	protected LocalInstrument2Choice localInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument2Choice
	 * LocalInstrument2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalInstrument"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<LocalInstrument2Choice>> mmLocalInstrument = new MMMessageAssociationEnd<EntryTransaction9, Optional<LocalInstrument2Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "LclInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument.\nUsage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> LocalInstrument2Choice.mmObject());
		}

		@Override
		public Optional<LocalInstrument2Choice> getValue(EntryTransaction9 obj) {
			return obj.getLocalInstrument();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<LocalInstrument2Choice> value) {
			obj.setLocalInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "Purp")
	protected Purpose2Choice purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Purpose2Choice
	 * Purpose2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<Purpose2Choice>> mmPurpose = new MMMessageAssociationEnd<EntryTransaction9, Optional<Purpose2Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment transaction.\nUsage: Purpose is used by the end-customers, that is initiating party, (ultimate) debtor, (ultimate) creditor to provide information concerning the nature of the payment. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> Purpose2Choice.mmObject());
		}

		@Override
		public Optional<Purpose2Choice> getValue(EntryTransaction9 obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<Purpose2Choice> value) {
			obj.setPurpose(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRmtInf")
	protected List<RemittanceLocation4> relatedRemittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocation4
	 * RemittanceLocation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRemittanceInformation"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, List<RemittanceLocation4>> mmRelatedRemittanceInformation = new MMMessageAssociationEnd<EntryTransaction9, List<RemittanceLocation4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "RltdRmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedRemittanceInformation";
			definition = "Provides information related to the handling of the remittance information by any of the agents in the transaction processing chain.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> RemittanceLocation4.mmObject());
		}

		@Override
		public List<RemittanceLocation4> getValue(EntryTransaction9 obj) {
			return obj.getRelatedRemittanceInformation();
		}

		@Override
		public void setValue(EntryTransaction9 obj, List<RemittanceLocation4> value) {
			obj.setRelatedRemittanceInformation(value);
		}
	};
	@XmlElement(name = "RmtInf")
	protected RemittanceInformation15 remittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceInformation15
	 * RemittanceInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceInformation"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<RemittanceInformation15>> mmRemittanceInformation = new MMMessageAssociationEnd<EntryTransaction9, Optional<RemittanceInformation15>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "RmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceInformation";
			definition = "Structured information that enables the matching, that is reconciliation, of a payment with the items that the payment is intended to settle, such as commercial invoices in an account receivable system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> RemittanceInformation15.mmObject());
		}

		@Override
		public Optional<RemittanceInformation15> getValue(EntryTransaction9 obj) {
			return obj.getRemittanceInformation();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<RemittanceInformation15> value) {
			obj.setRemittanceInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdDts")
	protected TransactionDates3 relatedDates;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.TransactionDates3
	 * TransactionDates3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdDts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDates"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<TransactionDates3>> mmRelatedDates = new MMMessageAssociationEnd<EntryTransaction9, Optional<TransactionDates3>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "RltdDts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDates";
			definition = "Set of elements used to identify the dates related to the underlying transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TransactionDates3.mmObject());
		}

		@Override
		public Optional<TransactionDates3> getValue(EntryTransaction9 obj) {
			return obj.getRelatedDates();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<TransactionDates3> value) {
			obj.setRelatedDates(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdPric")
	protected TransactionPrice4Choice relatedPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionPrice4Choice
	 * TransactionPrice4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPrice"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<TransactionPrice4Choice>> mmRelatedPrice = new MMMessageAssociationEnd<EntryTransaction9, Optional<TransactionPrice4Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "RltdPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPrice";
			definition = "Set of elements used to identify the price information related to the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TransactionPrice4Choice.mmObject());
		}

		@Override
		public Optional<TransactionPrice4Choice> getValue(EntryTransaction9 obj) {
			return obj.getRelatedPrice();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<TransactionPrice4Choice> value) {
			obj.setRelatedPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdQties")
	protected List<TransactionQuantities2Choice> relatedQuantities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice
	 * TransactionQuantities2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdQties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedQuantities"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, List<TransactionQuantities2Choice>> mmRelatedQuantities = new MMMessageAssociationEnd<EntryTransaction9, List<TransactionQuantities2Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "RltdQties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedQuantities";
			definition = "Set of elements used to identify the related quantities, such as securities, in the underlying transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TransactionQuantities2Choice.mmObject());
		}

		@Override
		public List<TransactionQuantities2Choice> getValue(EntryTransaction9 obj) {
			return obj.getRelatedQuantities();
		}

		@Override
		public void setValue(EntryTransaction9 obj, List<TransactionQuantities2Choice> value) {
			obj.setRelatedQuantities(value);
		}
	};
	@XmlElement(name = "FinInstrmId")
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<SecurityIdentification19>> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<EntryTransaction9, Optional<SecurityIdentification19>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of a security, as assigned under a formal or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> SecurityIdentification19.mmObject());
		}

		@Override
		public Optional<SecurityIdentification19> getValue(EntryTransaction9 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<SecurityIdentification19> value) {
			obj.setFinancialInstrumentIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Tax")
	protected TaxInformation6 tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.TaxInformation6
	 * TaxInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
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
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<TaxInformation6>> mmTax = new MMMessageAssociationEnd<EntryTransaction9, Optional<TaxInformation6>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Provides details on the tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TaxInformation6.mmObject());
		}

		@Override
		public Optional<TaxInformation6> getValue(EntryTransaction9 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<TaxInformation6> value) {
			obj.setTax(value.orElse(null));
		}
	};
	@XmlElement(name = "RtrInf")
	protected PaymentReturnReason3 returnInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.PaymentReturnReason3
	 * PaymentReturnReason3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnInformation"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<PaymentReturnReason3>> mmReturnInformation = new MMMessageAssociationEnd<EntryTransaction9, Optional<PaymentReturnReason3>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "RtrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnInformation";
			definition = "Provides the return information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PaymentReturnReason3.mmObject());
		}

		@Override
		public Optional<PaymentReturnReason3> getValue(EntryTransaction9 obj) {
			return obj.getReturnInformation();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<PaymentReturnReason3> value) {
			obj.setReturnInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActn")
	protected CorporateAction9 corporateAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.CorporateAction9
	 * CorporateAction9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<CorporateAction9>> mmCorporateAction = new MMMessageAssociationEnd<EntryTransaction9, Optional<CorporateAction9>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "CorpActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			definition = "Set of elements used to identify the underlying corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CorporateAction9.mmObject());
		}

		@Override
		public Optional<CorporateAction9> getValue(EntryTransaction9 obj) {
			return obj.getCorporateAction();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<CorporateAction9> value) {
			obj.setCorporateAction(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct")
	protected SecuritiesAccount19 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, Optional<SecuritiesAccount19>> mmSafekeepingAccount = new MMMessageAssociationEnd<EntryTransaction9, Optional<SecuritiesAccount19>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Safekeeping or investment account. A safekeeping account is an account on which a securities entry is made. An investment account is an account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> SecuritiesAccount19.mmObject());
		}

		@Override
		public Optional<SecuritiesAccount19> getValue(EntryTransaction9 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<SecuritiesAccount19> value) {
			obj.setSafekeepingAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "CshDpst")
	protected List<CashDeposit1> cashDeposit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.CashDeposit1
	 * CashDeposit1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshDpst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDeposit"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction9, List<CashDeposit1>> mmCashDeposit = new MMMessageAssociationEnd<EntryTransaction9, List<CashDeposit1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "CshDpst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDeposit";
			definition = "Provides the details of a cash deposit for an amount of money in cash notes and/or coins.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CashDeposit1.mmObject());
		}

		@Override
		public List<CashDeposit1> getValue(EntryTransaction9 obj) {
			return obj.getCashDeposit();
		}

		@Override
		public void setValue(EntryTransaction9 obj, List<CashDeposit1> value) {
			obj.setCashDeposit(value);
		}
	};
	@XmlElement(name = "CardTx")
	protected CardTransaction16 cardTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msgpart.CardTransaction16
	 * CardTransaction16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardTransaction"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EntryTransaction9, Optional<CardTransaction16>> mmCardTransaction = new MMMessageAttribute<EntryTransaction9, Optional<CardTransaction16>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "CardTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardTransaction";
			definition = "Provides the data related to the card (number, scheme), terminal (number, identification) and transactional data used to uniquely identify a card transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = LazyReference.create(() -> CardTransaction16.mmObject());
		}

		@Override
		public Optional<CardTransaction16> getValue(EntryTransaction9 obj) {
			return obj.getCardTransaction();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<CardTransaction16> value) {
			obj.setCardTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlTxInf")
	protected Max500Text additionalTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTransactionInformation"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EntryTransaction9, Optional<Max500Text>> mmAdditionalTransactionInformation = new MMMessageAttribute<EntryTransaction9, Optional<Max500Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "AddtlTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTransactionInformation";
			definition = "Further details of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max500Text.mmObject());
		}

		@Override
		public Optional<Max500Text> getValue(EntryTransaction9 obj) {
			return obj.getAdditionalTransactionInformation();
		}

		@Override
		public void setValue(EntryTransaction9 obj, Optional<Max500Text> value) {
			obj.setAdditionalTransactionInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msgpart.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.EntryTransaction9
	 * EntryTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EntryTransaction9, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAttribute<EntryTransaction9, List<SupplementaryData1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.EntryTransaction9.mmObject());
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = LazyReference.create(() -> SupplementaryData1.mmObject());
		}

		@Override
		public List<SupplementaryData1> getValue(EntryTransaction9 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(EntryTransaction9 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.EntryTransaction9.mmReferences, com.tools20022.repository.msgpart.EntryTransaction9.mmAmount,
						com.tools20022.repository.msgpart.EntryTransaction9.mmCreditDebitIndicator, com.tools20022.repository.msgpart.EntryTransaction9.mmAmountDetails, com.tools20022.repository.msgpart.EntryTransaction9.mmAvailability,
						com.tools20022.repository.msgpart.EntryTransaction9.mmBankTransactionCode, com.tools20022.repository.msgpart.EntryTransaction9.mmCharges, com.tools20022.repository.msgpart.EntryTransaction9.mmInterest,
						com.tools20022.repository.msgpart.EntryTransaction9.mmRelatedParties, com.tools20022.repository.msgpart.EntryTransaction9.mmRelatedAgents, com.tools20022.repository.msgpart.EntryTransaction9.mmLocalInstrument,
						com.tools20022.repository.msgpart.EntryTransaction9.mmPurpose, com.tools20022.repository.msgpart.EntryTransaction9.mmRelatedRemittanceInformation,
						com.tools20022.repository.msgpart.EntryTransaction9.mmRemittanceInformation, com.tools20022.repository.msgpart.EntryTransaction9.mmRelatedDates, com.tools20022.repository.msgpart.EntryTransaction9.mmRelatedPrice,
						com.tools20022.repository.msgpart.EntryTransaction9.mmRelatedQuantities, com.tools20022.repository.msgpart.EntryTransaction9.mmFinancialInstrumentIdentification,
						com.tools20022.repository.msgpart.EntryTransaction9.mmTax, com.tools20022.repository.msgpart.EntryTransaction9.mmReturnInformation, com.tools20022.repository.msgpart.EntryTransaction9.mmCorporateAction,
						com.tools20022.repository.msgpart.EntryTransaction9.mmSafekeepingAccount, com.tools20022.repository.msgpart.EntryTransaction9.mmCashDeposit, com.tools20022.repository.msgpart.EntryTransaction9.mmCardTransaction,
						com.tools20022.repository.msgpart.EntryTransaction9.mmAdditionalTransactionInformation, com.tools20022.repository.msgpart.EntryTransaction9.mmSupplementaryData));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EntryTransaction9";
				definition = "Identifies the underlying transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TransactionReferences3> getReferences() {
		return Optional.ofNullable(references);
	}

	public EntryTransaction9 setReferences(TransactionReferences3 references) {
		this.references = references;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getAmount() {
		return Optional.ofNullable(amount);
	}

	public EntryTransaction9 setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = amount;
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return Optional.ofNullable(creditDebitIndicator);
	}

	public EntryTransaction9 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public Optional<AmountAndCurrencyExchange3> getAmountDetails() {
		return Optional.ofNullable(amountDetails);
	}

	public EntryTransaction9 setAmountDetails(AmountAndCurrencyExchange3 amountDetails) {
		this.amountDetails = amountDetails;
		return this;
	}

	public List<CashAvailability1> getAvailability() {
		return availability == null ? availability = new ArrayList<>() : availability;
	}

	public EntryTransaction9 setAvailability(List<CashAvailability1> availability) {
		this.availability = Objects.requireNonNull(availability);
		return this;
	}

	public Optional<BankTransactionCodeStructure4> getBankTransactionCode() {
		return Optional.ofNullable(bankTransactionCode);
	}

	public EntryTransaction9 setBankTransactionCode(BankTransactionCodeStructure4 bankTransactionCode) {
		this.bankTransactionCode = bankTransactionCode;
		return this;
	}

	public Optional<Charges4> getCharges() {
		return Optional.ofNullable(charges);
	}

	public EntryTransaction9 setCharges(Charges4 charges) {
		this.charges = charges;
		return this;
	}

	public Optional<TransactionInterest4> getInterest() {
		return Optional.ofNullable(interest);
	}

	public EntryTransaction9 setInterest(TransactionInterest4 interest) {
		this.interest = interest;
		return this;
	}

	public Optional<TransactionParties4> getRelatedParties() {
		return Optional.ofNullable(relatedParties);
	}

	public EntryTransaction9 setRelatedParties(TransactionParties4 relatedParties) {
		this.relatedParties = relatedParties;
		return this;
	}

	public Optional<TransactionAgents4> getRelatedAgents() {
		return Optional.ofNullable(relatedAgents);
	}

	public EntryTransaction9 setRelatedAgents(TransactionAgents4 relatedAgents) {
		this.relatedAgents = relatedAgents;
		return this;
	}

	public Optional<LocalInstrument2Choice> getLocalInstrument() {
		return Optional.ofNullable(localInstrument);
	}

	public EntryTransaction9 setLocalInstrument(LocalInstrument2Choice localInstrument) {
		this.localInstrument = localInstrument;
		return this;
	}

	public Optional<Purpose2Choice> getPurpose() {
		return Optional.ofNullable(purpose);
	}

	public EntryTransaction9 setPurpose(Purpose2Choice purpose) {
		this.purpose = purpose;
		return this;
	}

	public List<RemittanceLocation4> getRelatedRemittanceInformation() {
		return relatedRemittanceInformation == null ? relatedRemittanceInformation = new ArrayList<>() : relatedRemittanceInformation;
	}

	public EntryTransaction9 setRelatedRemittanceInformation(List<RemittanceLocation4> relatedRemittanceInformation) {
		this.relatedRemittanceInformation = Objects.requireNonNull(relatedRemittanceInformation);
		return this;
	}

	public Optional<RemittanceInformation15> getRemittanceInformation() {
		return Optional.ofNullable(remittanceInformation);
	}

	public EntryTransaction9 setRemittanceInformation(RemittanceInformation15 remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}

	public Optional<TransactionDates3> getRelatedDates() {
		return Optional.ofNullable(relatedDates);
	}

	public EntryTransaction9 setRelatedDates(TransactionDates3 relatedDates) {
		this.relatedDates = relatedDates;
		return this;
	}

	public Optional<TransactionPrice4Choice> getRelatedPrice() {
		return Optional.ofNullable(relatedPrice);
	}

	public EntryTransaction9 setRelatedPrice(TransactionPrice4Choice relatedPrice) {
		this.relatedPrice = relatedPrice;
		return this;
	}

	public List<TransactionQuantities2Choice> getRelatedQuantities() {
		return relatedQuantities == null ? relatedQuantities = new ArrayList<>() : relatedQuantities;
	}

	public EntryTransaction9 setRelatedQuantities(List<TransactionQuantities2Choice> relatedQuantities) {
		this.relatedQuantities = Objects.requireNonNull(relatedQuantities);
		return this;
	}

	public Optional<SecurityIdentification19> getFinancialInstrumentIdentification() {
		return Optional.ofNullable(financialInstrumentIdentification);
	}

	public EntryTransaction9 setFinancialInstrumentIdentification(SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
		return this;
	}

	public Optional<TaxInformation6> getTax() {
		return Optional.ofNullable(tax);
	}

	public EntryTransaction9 setTax(TaxInformation6 tax) {
		this.tax = tax;
		return this;
	}

	public Optional<PaymentReturnReason3> getReturnInformation() {
		return Optional.ofNullable(returnInformation);
	}

	public EntryTransaction9 setReturnInformation(PaymentReturnReason3 returnInformation) {
		this.returnInformation = returnInformation;
		return this;
	}

	public Optional<CorporateAction9> getCorporateAction() {
		return Optional.ofNullable(corporateAction);
	}

	public EntryTransaction9 setCorporateAction(CorporateAction9 corporateAction) {
		this.corporateAction = corporateAction;
		return this;
	}

	public Optional<SecuritiesAccount19> getSafekeepingAccount() {
		return Optional.ofNullable(safekeepingAccount);
	}

	public EntryTransaction9 setSafekeepingAccount(SecuritiesAccount19 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
		return this;
	}

	public List<CashDeposit1> getCashDeposit() {
		return cashDeposit == null ? cashDeposit = new ArrayList<>() : cashDeposit;
	}

	public EntryTransaction9 setCashDeposit(List<CashDeposit1> cashDeposit) {
		this.cashDeposit = Objects.requireNonNull(cashDeposit);
		return this;
	}

	public Optional<CardTransaction16> getCardTransaction() {
		return Optional.ofNullable(cardTransaction);
	}

	public EntryTransaction9 setCardTransaction(CardTransaction16 cardTransaction) {
		this.cardTransaction = cardTransaction;
		return this;
	}

	public Optional<Max500Text> getAdditionalTransactionInformation() {
		return Optional.ofNullable(additionalTransactionInformation);
	}

	public EntryTransaction9 setAdditionalTransactionInformation(Max500Text additionalTransactionInformation) {
		this.additionalTransactionInformation = additionalTransactionInformation;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public EntryTransaction9 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}