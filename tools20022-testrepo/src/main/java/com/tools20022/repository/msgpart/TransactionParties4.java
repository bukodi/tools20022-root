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
import com.tools20022.repository.choice.Party35Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.CashAccount24;
import com.tools20022.repository.msgpart.ProprietaryParty4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on the parties specific to the individual
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4#mmInitiatingParty
 * TransactionParties4.mmInitiatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4#mmDebtor
 * TransactionParties4.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4#mmDebtorAccount
 * TransactionParties4.mmDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4#mmUltimateDebtor
 * TransactionParties4.mmUltimateDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4#mmCreditor
 * TransactionParties4.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4#mmCreditorAccount
 * TransactionParties4.mmCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4#mmUltimateCreditor
 * TransactionParties4.mmUltimateCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4#mmTradingParty
 * TransactionParties4.mmTradingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4#mmProprietary
 * TransactionParties4.mmProprietary}</li>
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
 * "TransactionParties4"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionParties4", propOrder = {"initiatingParty", "debtor", "debtorAccount", "ultimateDebtor", "creditor", "creditorAccount", "ultimateCreditor", "tradingParty", "proprietary"})
public class TransactionParties4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InitgPty")
	protected Party35Choice initiatingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party35Choice
	 * Party35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4
	 * TransactionParties4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingParty"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionParties4, Optional<Party35Choice>> mmInitiatingParty = new MMMessageAssociationEnd<TransactionParties4, Optional<Party35Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionParties4.mmObject());
			isDerived = false;
			xmlTag = "InitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			definition = "Party that initiated the payment that is reported in the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> Party35Choice.mmObject());
		}

		@Override
		public Optional<Party35Choice> getValue(TransactionParties4 obj) {
			return obj.getInitiatingParty();
		}

		@Override
		public void setValue(TransactionParties4 obj, Optional<Party35Choice> value) {
			obj.setInitiatingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "Dbtr")
	protected Party35Choice debtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party35Choice
	 * Party35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4
	 * TransactionParties4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionParties4, Optional<Party35Choice>> mmDebtor = new MMMessageAssociationEnd<TransactionParties4, Optional<Party35Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionParties4.mmObject());
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> Party35Choice.mmObject());
		}

		@Override
		public Optional<Party35Choice> getValue(TransactionParties4 obj) {
			return obj.getDebtor();
		}

		@Override
		public void setValue(TransactionParties4 obj, Optional<Party35Choice> value) {
			obj.setDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAcct")
	protected CashAccount24 debtorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4
	 * TransactionParties4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionParties4, Optional<CashAccount24>> mmDebtorAccount = new MMMessageAssociationEnd<TransactionParties4, Optional<CashAccount24>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionParties4.mmObject());
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Unambiguous identification of the account of the debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CashAccount24.mmObject());
		}

		@Override
		public Optional<CashAccount24> getValue(TransactionParties4 obj) {
			return obj.getDebtorAccount();
		}

		@Override
		public void setValue(TransactionParties4 obj, Optional<CashAccount24> value) {
			obj.setDebtorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "UltmtDbtr")
	protected Party35Choice ultimateDebtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party35Choice
	 * Party35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4
	 * TransactionParties4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtDbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtor"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionParties4, Optional<Party35Choice>> mmUltimateDebtor = new MMMessageAssociationEnd<TransactionParties4, Optional<Party35Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionParties4.mmObject());
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> Party35Choice.mmObject());
		}

		@Override
		public Optional<Party35Choice> getValue(TransactionParties4 obj) {
			return obj.getUltimateDebtor();
		}

		@Override
		public void setValue(TransactionParties4 obj, Optional<Party35Choice> value) {
			obj.setUltimateDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "Cdtr")
	protected Party35Choice creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party35Choice
	 * Party35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4
	 * TransactionParties4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionParties4, Optional<Party35Choice>> mmCreditor = new MMMessageAssociationEnd<TransactionParties4, Optional<Party35Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionParties4.mmObject());
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party to which an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> Party35Choice.mmObject());
		}

		@Override
		public Optional<Party35Choice> getValue(TransactionParties4 obj) {
			return obj.getCreditor();
		}

		@Override
		public void setValue(TransactionParties4 obj, Optional<Party35Choice> value) {
			obj.setCreditor(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAcct")
	protected CashAccount24 creditorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4
	 * TransactionParties4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccount"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionParties4, Optional<CashAccount24>> mmCreditorAccount = new MMMessageAssociationEnd<TransactionParties4, Optional<CashAccount24>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionParties4.mmObject());
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Unambiguous identification of the account of the creditor to which a credit entry has been posted as a result of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CashAccount24.mmObject());
		}

		@Override
		public Optional<CashAccount24> getValue(TransactionParties4 obj) {
			return obj.getCreditorAccount();
		}

		@Override
		public void setValue(TransactionParties4 obj, Optional<CashAccount24> value) {
			obj.setCreditorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "UltmtCdtr")
	protected Party35Choice ultimateCreditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party35Choice
	 * Party35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4
	 * TransactionParties4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtCdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditor"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionParties4, Optional<Party35Choice>> mmUltimateCreditor = new MMMessageAssociationEnd<TransactionParties4, Optional<Party35Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionParties4.mmObject());
			isDerived = false;
			xmlTag = "UltmtCdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditor";
			definition = "Ultimate party to which an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> Party35Choice.mmObject());
		}

		@Override
		public Optional<Party35Choice> getValue(TransactionParties4 obj) {
			return obj.getUltimateCreditor();
		}

		@Override
		public void setValue(TransactionParties4 obj, Optional<Party35Choice> value) {
			obj.setUltimateCreditor(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgPty")
	protected Party35Choice tradingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party35Choice
	 * Party35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4
	 * TransactionParties4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingParty"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionParties4, Optional<Party35Choice>> mmTradingParty = new MMMessageAssociationEnd<TransactionParties4, Optional<Party35Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionParties4.mmObject());
			isDerived = false;
			xmlTag = "TradgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingParty";
			definition = "Party that plays an active role in planning and executing the transactions that create or liquidate investments of the investors assets, or that move the investor's assets from one investment to another. A trading party is a trade instructor, an investment decision-maker, a post trade administrator, or a trader. In the context of treasury, it is the party that negotiates and executes the treasury transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> Party35Choice.mmObject());
		}

		@Override
		public Optional<Party35Choice> getValue(TransactionParties4 obj) {
			return obj.getTradingParty();
		}

		@Override
		public void setValue(TransactionParties4 obj, Optional<Party35Choice> value) {
			obj.setTradingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "Prtry")
	protected List<ProprietaryParty4> proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.ProprietaryParty4
	 * ProprietaryParty4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionParties4
	 * TransactionParties4}</li>
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
	public static final MMMessageAssociationEnd<TransactionParties4, List<ProprietaryParty4>> mmProprietary = new MMMessageAssociationEnd<TransactionParties4, List<ProprietaryParty4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionParties4.mmObject());
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary party related to the underlying transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> ProprietaryParty4.mmObject());
		}

		@Override
		public List<ProprietaryParty4> getValue(TransactionParties4 obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(TransactionParties4 obj, List<ProprietaryParty4> value) {
			obj.setProprietary(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.TransactionParties4.mmInitiatingParty, com.tools20022.repository.msgpart.TransactionParties4.mmDebtor,
						com.tools20022.repository.msgpart.TransactionParties4.mmDebtorAccount, com.tools20022.repository.msgpart.TransactionParties4.mmUltimateDebtor, com.tools20022.repository.msgpart.TransactionParties4.mmCreditor,
						com.tools20022.repository.msgpart.TransactionParties4.mmCreditorAccount, com.tools20022.repository.msgpart.TransactionParties4.mmUltimateCreditor,
						com.tools20022.repository.msgpart.TransactionParties4.mmTradingParty, com.tools20022.repository.msgpart.TransactionParties4.mmProprietary));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionParties4";
				definition = "Provides further details on the parties specific to the individual transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Party35Choice> getInitiatingParty() {
		return Optional.ofNullable(initiatingParty);
	}

	public TransactionParties4 setInitiatingParty(Party35Choice initiatingParty) {
		this.initiatingParty = initiatingParty;
		return this;
	}

	public Optional<Party35Choice> getDebtor() {
		return Optional.ofNullable(debtor);
	}

	public TransactionParties4 setDebtor(Party35Choice debtor) {
		this.debtor = debtor;
		return this;
	}

	public Optional<CashAccount24> getDebtorAccount() {
		return Optional.ofNullable(debtorAccount);
	}

	public TransactionParties4 setDebtorAccount(CashAccount24 debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	public Optional<Party35Choice> getUltimateDebtor() {
		return Optional.ofNullable(ultimateDebtor);
	}

	public TransactionParties4 setUltimateDebtor(Party35Choice ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
		return this;
	}

	public Optional<Party35Choice> getCreditor() {
		return Optional.ofNullable(creditor);
	}

	public TransactionParties4 setCreditor(Party35Choice creditor) {
		this.creditor = creditor;
		return this;
	}

	public Optional<CashAccount24> getCreditorAccount() {
		return Optional.ofNullable(creditorAccount);
	}

	public TransactionParties4 setCreditorAccount(CashAccount24 creditorAccount) {
		this.creditorAccount = creditorAccount;
		return this;
	}

	public Optional<Party35Choice> getUltimateCreditor() {
		return Optional.ofNullable(ultimateCreditor);
	}

	public TransactionParties4 setUltimateCreditor(Party35Choice ultimateCreditor) {
		this.ultimateCreditor = ultimateCreditor;
		return this;
	}

	public Optional<Party35Choice> getTradingParty() {
		return Optional.ofNullable(tradingParty);
	}

	public TransactionParties4 setTradingParty(Party35Choice tradingParty) {
		this.tradingParty = tradingParty;
		return this;
	}

	public List<ProprietaryParty4> getProprietary() {
		return proprietary == null ? proprietary = new ArrayList<>() : proprietary;
	}

	public TransactionParties4 setProprietary(List<ProprietaryParty4> proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}