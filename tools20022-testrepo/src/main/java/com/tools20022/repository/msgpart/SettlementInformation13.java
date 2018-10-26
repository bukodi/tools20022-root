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
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.ClearingSystemIdentification3Choice;
import com.tools20022.repository.codeset.SettlementMethod1Code;
import com.tools20022.repository.constraint.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.msgpart.CashAccount16;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide information on the settlement of the
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#mmSettlementMethod
 * SettlementInformation13.mmSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#mmSettlementAccount
 * SettlementInformation13.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#mmClearingSystem
 * SettlementInformation13.mmClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#mmInstructingReimbursementAgent
 * SettlementInformation13.mmInstructingReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#mmInstructingReimbursementAgentAccount
 * SettlementInformation13.mmInstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#mmInstructedReimbursementAgent
 * SettlementInformation13.mmInstructedReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#mmInstructedReimbursementAgentAccount
 * SettlementInformation13.mmInstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#mmThirdReimbursementAgent
 * SettlementInformation13.mmThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#mmThirdReimbursementAgentAccount
 * SettlementInformation13.mmThirdReimbursementAgentAccount}</li>
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
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#ThirdReimbursementAgentRule
 * SettlementInformation13.ThirdReimbursementAgentRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#SettlementMethodAgentRule
 * SettlementInformation13.SettlementMethodAgentRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#SettlementMethodCoverRule
 * SettlementInformation13.SettlementMethodCoverRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#SettlementMethodCoverAgentRule
 * SettlementInformation13.SettlementMethodCoverAgentRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#SettlementMethodClearingRule
 * SettlementInformation13.SettlementMethodClearingRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#InstructingReimbursementAgentAccountRule
 * SettlementInformation13.InstructingReimbursementAgentAccountRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#InstructedReimbursementAgentAccountRule
 * SettlementInformation13.InstructedReimbursementAgentAccountRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13#ThirdReimbursementAgentAccountRule
 * SettlementInformation13.ThirdReimbursementAgentAccountRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementInformation13"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementInformation13", propOrder = {"settlementMethod", "settlementAccount", "clearingSystem", "instructingReimbursementAgent", "instructingReimbursementAgentAccount", "instructedReimbursementAgent",
		"instructedReimbursementAgentAccount", "thirdReimbursementAgent", "thirdReimbursementAgentAccount"})
public class SettlementInformation13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttlmMtd", required = true)
	protected SettlementMethod1Code settlementMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethod1Code
	 * SettlementMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInformation13, SettlementMethod1Code> mmSettlementMethod = new MMMessageAttribute<SettlementInformation13, SettlementMethod1Code>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			isDerived = false;
			xmlTag = "SttlmMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod";
			definition = "Method used to settle the (batch of) payment instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> SettlementMethod1Code.mmObject());
		}

		@Override
		public SettlementMethod1Code getValue(SettlementInformation13 obj) {
			return obj.getSettlementMethod();
		}

		@Override
		public void setValue(SettlementInformation13 obj, SettlementMethod1Code value) {
			obj.setSettlementMethod(value);
		}
	};
	@XmlElement(name = "SttlmAcct")
	protected CashAccount16 settlementAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation13, Optional<CashAccount16>> mmSettlementAccount = new MMMessageAssociationEnd<SettlementInformation13, Optional<CashAccount16>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			isDerived = false;
			xmlTag = "SttlmAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAccount";
			definition = "A specific purpose account used to post debit and credit entries as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CashAccount16.mmObject());
		}

		@Override
		public Optional<CashAccount16> getValue(SettlementInformation13 obj) {
			return obj.getSettlementAccount();
		}

		@Override
		public void setValue(SettlementInformation13 obj, Optional<CashAccount16> value) {
			obj.setSettlementAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrSys")
	protected ClearingSystemIdentification3Choice clearingSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification3Choice
	 * ClearingSystemIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystem"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation13, Optional<ClearingSystemIdentification3Choice>> mmClearingSystem = new MMMessageAssociationEnd<SettlementInformation13, Optional<ClearingSystemIdentification3Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			isDerived = false;
			xmlTag = "ClrSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystem";
			definition = "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> ClearingSystemIdentification3Choice.mmObject());
		}

		@Override
		public Optional<ClearingSystemIdentification3Choice> getValue(SettlementInformation13 obj) {
			return obj.getClearingSystem();
		}

		@Override
		public void setValue(SettlementInformation13 obj, Optional<ClearingSystemIdentification3Choice> value) {
			obj.setClearingSystem(value.orElse(null));
		}
	};
	@XmlElement(name = "InstgRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification4 instructingReimbursementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgRmbrsmntAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingReimbursementAgent"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation13, Optional<BranchAndFinancialInstitutionIdentification4>> mmInstructingReimbursementAgent = new MMMessageAssociationEnd<SettlementInformation13, Optional<BranchAndFinancialInstitutionIdentification4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			isDerived = false;
			xmlTag = "InstgRmbrsmntAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingReimbursementAgent";
			definition = "Agent through which the instructing agent will reimburse the instructed agent.\n\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BranchAndFinancialInstitutionIdentification4.mmObject());
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification4> getValue(SettlementInformation13 obj) {
			return obj.getInstructingReimbursementAgent();
		}

		@Override
		public void setValue(SettlementInformation13 obj, Optional<BranchAndFinancialInstitutionIdentification4> value) {
			obj.setInstructingReimbursementAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "InstgRmbrsmntAgtAcct")
	protected CashAccount16 instructingReimbursementAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgRmbrsmntAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingReimbursementAgentAccount"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation13, Optional<CashAccount16>> mmInstructingReimbursementAgentAccount = new MMMessageAssociationEnd<SettlementInformation13, Optional<CashAccount16>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			isDerived = false;
			xmlTag = "InstgRmbrsmntAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the instructing reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CashAccount16.mmObject());
		}

		@Override
		public Optional<CashAccount16> getValue(SettlementInformation13 obj) {
			return obj.getInstructingReimbursementAgentAccount();
		}

		@Override
		public void setValue(SettlementInformation13 obj, Optional<CashAccount16> value) {
			obj.setInstructingReimbursementAgentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification4 instructedReimbursementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdRmbrsmntAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedReimbursementAgent"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation13, Optional<BranchAndFinancialInstitutionIdentification4>> mmInstructedReimbursementAgent = new MMMessageAssociationEnd<SettlementInformation13, Optional<BranchAndFinancialInstitutionIdentification4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			isDerived = false;
			xmlTag = "InstdRmbrsmntAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedReimbursementAgent";
			definition = "Agent at which the instructed agent will be reimbursed.\nUsage: If InstructedReimbursementAgent contains a branch of the InstructedAgent, then the party in InstructedAgent will claim reimbursement from that branch/will be paid by that branch.\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BranchAndFinancialInstitutionIdentification4.mmObject());
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification4> getValue(SettlementInformation13 obj) {
			return obj.getInstructedReimbursementAgent();
		}

		@Override
		public void setValue(SettlementInformation13 obj, Optional<BranchAndFinancialInstitutionIdentification4> value) {
			obj.setInstructedReimbursementAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdRmbrsmntAgtAcct")
	protected CashAccount16 instructedReimbursementAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdRmbrsmntAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedReimbursementAgentAccount"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation13, Optional<CashAccount16>> mmInstructedReimbursementAgentAccount = new MMMessageAssociationEnd<SettlementInformation13, Optional<CashAccount16>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			isDerived = false;
			xmlTag = "InstdRmbrsmntAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the instructed reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CashAccount16.mmObject());
		}

		@Override
		public Optional<CashAccount16> getValue(SettlementInformation13 obj) {
			return obj.getInstructedReimbursementAgentAccount();
		}

		@Override
		public void setValue(SettlementInformation13 obj, Optional<CashAccount16> value) {
			obj.setInstructedReimbursementAgentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "ThrdRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification4 thirdReimbursementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrdRmbrsmntAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdReimbursementAgent"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation13, Optional<BranchAndFinancialInstitutionIdentification4>> mmThirdReimbursementAgent = new MMMessageAssociationEnd<SettlementInformation13, Optional<BranchAndFinancialInstitutionIdentification4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			isDerived = false;
			xmlTag = "ThrdRmbrsmntAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdReimbursementAgent";
			definition = "Agent at which the instructed agent will be reimbursed.\nUsage: If ThirdReimbursementAgent contains a branch of the InstructedAgent, then the party in InstructedAgent will claim reimbursement from that branch/will be paid by that branch.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BranchAndFinancialInstitutionIdentification4.mmObject());
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification4> getValue(SettlementInformation13 obj) {
			return obj.getThirdReimbursementAgent();
		}

		@Override
		public void setValue(SettlementInformation13 obj, Optional<BranchAndFinancialInstitutionIdentification4> value) {
			obj.setThirdReimbursementAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "ThrdRmbrsmntAgtAcct")
	protected CashAccount16 thirdReimbursementAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrdRmbrsmntAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdReimbursementAgentAccount"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation13, Optional<CashAccount16>> mmThirdReimbursementAgentAccount = new MMMessageAssociationEnd<SettlementInformation13, Optional<CashAccount16>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			isDerived = false;
			xmlTag = "ThrdRmbrsmntAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the third reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CashAccount16.mmObject());
		}

		@Override
		public Optional<CashAccount16> getValue(SettlementInformation13 obj) {
			return obj.getThirdReimbursementAgentAccount();
		}

		@Override
		public void setValue(SettlementInformation13 obj, Optional<CashAccount16> value) {
			obj.setThirdReimbursementAgentAccount(value.orElse(null));
		}
	};
	/**
	 * If ThirdReimbursementAgent is present, then InstructingReimbursementAgent
	 * and InstructedReimbursementAgent must both be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructingReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructedReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ThirdReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdReimbursementAgentRule"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13> ThirdReimbursementAgentRule = new MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdReimbursementAgentRule";
			definition = "If ThirdReimbursementAgent is present, then InstructingReimbursementAgent and InstructedReimbursementAgent must both be present.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructingReimbursementAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructedReimbursementAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ThirdReimbursementAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.msgpart.SettlementInformation13 obj) throws Exception {
			ConstraintThirdReimbursementAgentRule.checkSettlementInformation13(obj);
		}
	};
	/**
	 * If SettlementMethod is equal to INDA or INGA, then ReimbursementAgent(s)
	 * and ClearingSystem are not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ClearingSystem&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructingReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructedReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ThirdReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructingAgent&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;InstructedAgent&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethodAgentRule"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13> SettlementMethodAgentRule = new MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethodAgentRule";
			definition = "If SettlementMethod is equal to INDA or INGA, then ReimbursementAgent(s) and ClearingSystem are not allowed.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ClearingSystem</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructingReimbursementAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructedReimbursementAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/ThirdReimbursementAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>InstructingAgent</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>InstructedAgent</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.msgpart.SettlementInformation13 obj) throws Exception {
			ConstraintSettlementMethodAgentRule.checkSettlementInformation13(obj);
		}
	};
	/**
	 * If SettlementMethod is equal to COVE, then SettlementAccount and
	 * ClearingSystem are not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementAccount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ClearingSystem&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethodCoverRule"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13> SettlementMethodCoverRule = new MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethodCoverRule";
			definition = "If SettlementMethod is equal to COVE, then SettlementAccount and ClearingSystem are not allowed.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementAccount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/ClearingSystem</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.msgpart.SettlementInformation13 obj) throws Exception {
			ConstraintSettlementMethodCoverRule.checkSettlementInformation13(obj);
		}
	};
	/**
	 * If SettlementMethod is equal to COVE, then InstructedReimbursementAgent
	 * or InstructingReimbursementAgent must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructingReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InstructedReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;CoverMethod&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethodCoverAgentRule"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13> SettlementMethodCoverAgentRule = new MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethodCoverAgentRule";
			definition = "If SettlementMethod is equal to COVE, then InstructedReimbursementAgent or InstructingReimbursementAgent must be present.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructingReimbursementAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/InstructedReimbursementAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>CoverMethod</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.msgpart.SettlementInformation13 obj) throws Exception {
			ConstraintSettlementMethodCoverAgentRule.checkSettlementInformation13(obj);
		}
	};
	/**
	 * If SettlementMethod is equal to CLRG, then SettlementAccount and
	 * ReimbursementAgent(s) are not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementAccount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructingReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructedReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ThirdReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementMethod&lt;/leftOperand&gt;&lt;rightOperand&gt;ClearingSystem&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethodClearingRule"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13> SettlementMethodClearingRule = new MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethodClearingRule";
			definition = "If SettlementMethod is equal to CLRG, then SettlementAccount and ReimbursementAgent(s) are not allowed.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementAccount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructingReimbursementAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructedReimbursementAgent</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/ThirdReimbursementAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementMethod</leftOperand><rightOperand>ClearingSystem</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.msgpart.SettlementInformation13 obj) throws Exception {
			ConstraintSettlementMethodClearingRule.checkSettlementInformation13(obj);
		}
	};
	/**
	 * If InstructingReimbursementAgentAccount is present, then
	 * InstructingReimbursementAgent must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructingReimbursementAgentAccount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructingReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingReimbursementAgentAccountRule"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13> InstructingReimbursementAgentAccountRule = new MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingReimbursementAgentAccountRule";
			definition = "If InstructingReimbursementAgentAccount is present, then InstructingReimbursementAgent must be present.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructingReimbursementAgentAccount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructingReimbursementAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.msgpart.SettlementInformation13 obj) throws Exception {
			ConstraintInstructingReimbursementAgentAccountRule.checkSettlementInformation13(obj);
		}
	};
	/**
	 * If InstructedReimbursementAgentAccount is present, then
	 * InstructedReimbursementAgent must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructedReimbursementAgentAccount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InstructedReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedReimbursementAgentAccountRule"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13> InstructedReimbursementAgentAccountRule = new MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedReimbursementAgentAccountRule";
			definition = "If InstructedReimbursementAgentAccount is present, then InstructedReimbursementAgent must be present.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructedReimbursementAgentAccount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/InstructedReimbursementAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.msgpart.SettlementInformation13 obj) throws Exception {
			ConstraintInstructedReimbursementAgentAccountRule.checkSettlementInformation13(obj);
		}
	};
	/**
	 * If ThirdReimbursementAgentAccount is present, then
	 * ThirdReimbursementAgent must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ThirdReimbursementAgentAccount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ThirdReimbursementAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdReimbursementAgentAccountRule"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13> ThirdReimbursementAgentAccountRule = new MMConstraint<com.tools20022.repository.msgpart.SettlementInformation13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdReimbursementAgentAccountRule";
			definition = "If ThirdReimbursementAgentAccount is present, then ThirdReimbursementAgent must be present.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.SettlementInformation13.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ThirdReimbursementAgentAccount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ThirdReimbursementAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.msgpart.SettlementInformation13 obj) throws Exception {
			ConstraintThirdReimbursementAgentAccountRule.checkSettlementInformation13(obj);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.SettlementInformation13.mmSettlementMethod, com.tools20022.repository.msgpart.SettlementInformation13.mmSettlementAccount,
						com.tools20022.repository.msgpart.SettlementInformation13.mmClearingSystem, com.tools20022.repository.msgpart.SettlementInformation13.mmInstructingReimbursementAgent,
						com.tools20022.repository.msgpart.SettlementInformation13.mmInstructingReimbursementAgentAccount, com.tools20022.repository.msgpart.SettlementInformation13.mmInstructedReimbursementAgent,
						com.tools20022.repository.msgpart.SettlementInformation13.mmInstructedReimbursementAgentAccount, com.tools20022.repository.msgpart.SettlementInformation13.mmThirdReimbursementAgent,
						com.tools20022.repository.msgpart.SettlementInformation13.mmThirdReimbursementAgentAccount));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				constraints_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.SettlementInformation13.ThirdReimbursementAgentRule,
						com.tools20022.repository.msgpart.SettlementInformation13.SettlementMethodAgentRule, com.tools20022.repository.msgpart.SettlementInformation13.SettlementMethodCoverRule,
						com.tools20022.repository.msgpart.SettlementInformation13.SettlementMethodCoverAgentRule, com.tools20022.repository.msgpart.SettlementInformation13.SettlementMethodClearingRule,
						com.tools20022.repository.msgpart.SettlementInformation13.InstructingReimbursementAgentAccountRule, com.tools20022.repository.msgpart.SettlementInformation13.InstructedReimbursementAgentAccountRule,
						com.tools20022.repository.msgpart.SettlementInformation13.ThirdReimbursementAgentAccountRule));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementInformation13";
				definition = "Set of elements used to provide information on the settlement of the instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementMethod1Code getSettlementMethod() {
		return settlementMethod;
	}

	public SettlementInformation13 setSettlementMethod(SettlementMethod1Code settlementMethod) {
		this.settlementMethod = Objects.requireNonNull(settlementMethod);
		return this;
	}

	public Optional<CashAccount16> getSettlementAccount() {
		return Optional.ofNullable(settlementAccount);
	}

	public SettlementInformation13 setSettlementAccount(CashAccount16 settlementAccount) {
		this.settlementAccount = settlementAccount;
		return this;
	}

	public Optional<ClearingSystemIdentification3Choice> getClearingSystem() {
		return Optional.ofNullable(clearingSystem);
	}

	public SettlementInformation13 setClearingSystem(ClearingSystemIdentification3Choice clearingSystem) {
		this.clearingSystem = clearingSystem;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getInstructingReimbursementAgent() {
		return Optional.ofNullable(instructingReimbursementAgent);
	}

	public SettlementInformation13 setInstructingReimbursementAgent(BranchAndFinancialInstitutionIdentification4 instructingReimbursementAgent) {
		this.instructingReimbursementAgent = instructingReimbursementAgent;
		return this;
	}

	public Optional<CashAccount16> getInstructingReimbursementAgentAccount() {
		return Optional.ofNullable(instructingReimbursementAgentAccount);
	}

	public SettlementInformation13 setInstructingReimbursementAgentAccount(CashAccount16 instructingReimbursementAgentAccount) {
		this.instructingReimbursementAgentAccount = instructingReimbursementAgentAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getInstructedReimbursementAgent() {
		return Optional.ofNullable(instructedReimbursementAgent);
	}

	public SettlementInformation13 setInstructedReimbursementAgent(BranchAndFinancialInstitutionIdentification4 instructedReimbursementAgent) {
		this.instructedReimbursementAgent = instructedReimbursementAgent;
		return this;
	}

	public Optional<CashAccount16> getInstructedReimbursementAgentAccount() {
		return Optional.ofNullable(instructedReimbursementAgentAccount);
	}

	public SettlementInformation13 setInstructedReimbursementAgentAccount(CashAccount16 instructedReimbursementAgentAccount) {
		this.instructedReimbursementAgentAccount = instructedReimbursementAgentAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getThirdReimbursementAgent() {
		return Optional.ofNullable(thirdReimbursementAgent);
	}

	public SettlementInformation13 setThirdReimbursementAgent(BranchAndFinancialInstitutionIdentification4 thirdReimbursementAgent) {
		this.thirdReimbursementAgent = thirdReimbursementAgent;
		return this;
	}

	public Optional<CashAccount16> getThirdReimbursementAgentAccount() {
		return Optional.ofNullable(thirdReimbursementAgentAccount);
	}

	public SettlementInformation13 setThirdReimbursementAgentAccount(CashAccount16 thirdReimbursementAgentAccount) {
		this.thirdReimbursementAgentAccount = thirdReimbursementAgentAccount;
		return this;
	}
}