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

package com.tools20022.repository.area.pacs;

import com.tools20022.core.repo.LazyReference;
import com.tools20022.metamodel.*;
import com.tools20022.repository.area.PaymentsClearingandSettlementArchive;
import com.tools20022.repository.constraint.*;
import com.tools20022.repository.msgpart.CreditTransferTransactionInformation11;
import com.tools20022.repository.msgpart.GroupHeader33;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The FinancialInstitutionToFinancialInstitutionCustomerCreditTransfer message
 * is sent by the debtor agent to the creditor agent, directly or through other
 * agents and/or a payment clearing and settlement system. It is used to move
 * funds from a debtor account to a creditor.<br>
 * <b>Usage</b><br>
 * The FIToFICustomerCreditTransfer message is exchanged between agents and can
 * contain one or more customer credit transfer instructions.<br>
 * The FIToFICustomerCreditTransfer message does not allow for grouping: a
 * CreditTransferTransactionInformation block must be present for each credit
 * transfer transaction.<br>
 * The FIToFICustomerCreditTransfer message can be used in different ways:<br>
 * - If the instructing agent and the instructed agent wish to use their direct
 * account relationship in the currency of the transfer then the message
 * contains both the funds for the customer transfer(s) as well as the payment
 * details;<br>
 * - If the instructing agent and the instructed agent have no direct account
 * relationship in the currency of the transfer, or do not wish to use their
 * account relationship, then other (reimbursement) agents will be involved to
 * cover for the customer transfer(s). The FIToFICustomerCreditTransfer contains
 * only the payment details and the instructing agent must cover the customer
 * transfer by sending a FinancialInstitutionCreditTransfer to a reimbursement
 * agent. This payment method is called the Cover method;<br>
 * - If more than two financial institutions are involved in the payment chain
 * and if the FIToFICustomerCreditTransfer is sent from one financial
 * institution to the next financial institution in the payment chain, then the
 * payment method is called the Serial method.<br>
 * The FIToFICustomerCreditTransfer message can be used in domestic and
 * cross-border scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.008.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementArchive
 * PaymentsClearingandSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02#mmGroupHeader
 * FIToFICustomerCreditTransferV02.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02#mmCreditTransferTransactionInformation
 * FIToFICustomerCreditTransferV02.mmCreditTransferTransactionInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FIToFICstmrCdtTrf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02#InstructedAgentRule
 * FIToFICustomerCreditTransferV02.InstructedAgentRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02#InstructingAgentRule
 * FIToFICustomerCreditTransferV02.InstructingAgentRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02#TotalInterbankSettlementAmountRule
 * FIToFICustomerCreditTransferV02.TotalInterbankSettlementAmountRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02#TotalInterbankSettlementAmountAndSumRule
 * FIToFICustomerCreditTransferV02.TotalInterbankSettlementAmountAndSumRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02#GroupHeaderInterbankSettlementDateRule
 * FIToFICustomerCreditTransferV02.GroupHeaderInterbankSettlementDateRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02#TransactionInterbankSettlementDateRule
 * FIToFICustomerCreditTransferV02.TransactionInterbankSettlementDateRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02#PaymentTypeInformationRule
 * FIToFICustomerCreditTransferV02.PaymentTypeInformationRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02#NumberOfTransactionsAndCreditTransfersRule
 * FIToFICustomerCreditTransferV02.NumberOfTransactionsAndCreditTransfersRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFICustomerCreditTransferV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionToFinancialInstitutionCustomerCreditTransfer message is sent by the debtor agent to the creditor agent, directly or through other agents and/or a payment clearing and settlement system. It is used to move funds from a debtor account to a creditor.\r\nUsage\r\nThe FIToFICustomerCreditTransfer message is exchanged between agents and can contain one or more customer credit transfer instructions.\r\nThe FIToFICustomerCreditTransfer message does not allow for grouping: a CreditTransferTransactionInformation block must be present for each credit transfer transaction.\r\nThe FIToFICustomerCreditTransfer message can be used in different ways:\r\n- If the instructing agent and the instructed agent wish to use their direct account relationship in the currency of the transfer then the message contains both the funds for the customer transfer(s) as well as the payment details;\r\n- If the instructing agent and the instructed agent have no direct account relationship in the currency of the transfer, or do not wish to use their account relationship, then other (reimbursement) agents will be involved to cover for the customer transfer(s). The FIToFICustomerCreditTransfer contains only the payment details and the instructing agent must cover the customer transfer by sending a FinancialInstitutionCreditTransfer to a reimbursement agent. This payment method is called the Cover method;\r\n- If more than two financial institutions are involved in the payment chain and if the FIToFICustomerCreditTransfer is sent from one financial institution to the next financial institution in the payment chain, then the payment method is called the Serial method.\r\nThe FIToFICustomerCreditTransfer message can be used in domestic and cross-border scenarios."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FIToFICustomerCreditTransferV02", propOrder = {"groupHeader", "creditTransferTransactionInformation"})
public class FIToFICustomerCreditTransferV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * If GroupHeader/InstructedAgent is present, then
	 * CreditTransferTransactionInformation/InstructedAgent is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InstructedAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InstructedAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02
	 * FIToFICustomerCreditTransferV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InstructedAgent is present, then CreditTransferTransactionInformation/InstructedAgent is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02> InstructedAgentRule = new MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgentRule";
			definition = "If GroupHeader/InstructedAgent is present, then CreditTransferTransactionInformation/InstructedAgent is not allowed.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InstructedAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InstructedAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02 obj) throws Exception {
			ConstraintInstructedAgentRule.checkFIToFICustomerCreditTransferV02(obj);
		}
	};
	/**
	 * If GroupHeader/InstructingAgent is present, then
	 * CreditTransferTransactionInformation/InstructingAgent is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InstructingAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InstructingAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02
	 * FIToFICustomerCreditTransferV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InstructingAgent is present, then CreditTransferTransactionInformation/InstructingAgent is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02> InstructingAgentRule = new MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgentRule";
			definition = "If GroupHeader/InstructingAgent is present, then CreditTransferTransactionInformation/InstructingAgent is not allowed.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InstructingAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InstructingAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02 obj) throws Exception {
			ConstraintInstructingAgentRule.checkFIToFICustomerCreditTransferV02(obj);
		}
	};
	/**
	 * If GroupHeader/TotalInterbankSettlementAmount is present, then all
	 * occurrences of
	 * CreditTransferTransactionInformation/InterbankSettlementAmount must have
	 * the same currency as the currency of
	 * GroupHeader/TotalInterbankSettlementAmount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InterbankSettlementAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/GroupHeader/TotalInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02
	 * FIToFICustomerCreditTransferV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalInterbankSettlementAmount is present, then all occurrences of CreditTransferTransactionInformation/InterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalInterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02> TotalInterbankSettlementAmountRule = new MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementAmountRule";
			definition = "If GroupHeader/TotalInterbankSettlementAmount is present, then all occurrences of CreditTransferTransactionInformation/InterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalInterbankSettlementAmount.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/CreditTransferTransactionInformation[*]/InterbankSettlementAmount/@Currency</leftOperand><rightOperand>/GroupHeader/TotalInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02 obj) throws Exception {
			ConstraintTotalInterbankSettlementAmountRule.checkFIToFICustomerCreditTransferV02(obj);
		}
	};
	/**
	 * If GroupHeader/TotalInterbankSettlementAmount is present, then it must
	 * equal the sum of all occurrences of
	 * CreditTransferTransactionInformation/InterbankSettlementAmount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;rightOperand&gt;sum of /CreditTransferTransactionInformation/InterbankSettlementAmount&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02
	 * FIToFICustomerCreditTransferV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterbankSettlementAmountAndSumRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalInterbankSettlementAmount is present, then it must equal the sum of all occurrences of CreditTransferTransactionInformation/InterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02> TotalInterbankSettlementAmountAndSumRule = new MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementAmountAndSumRule";
			definition = "If GroupHeader/TotalInterbankSettlementAmount is present, then it must equal the sum of all occurrences of CreditTransferTransactionInformation/InterbankSettlementAmount.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/TotalInterbankSettlementAmount</leftOperand><rightOperand>sum of /CreditTransferTransactionInformation/InterbankSettlementAmount</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02 obj) throws Exception {
			ConstraintTotalInterbankSettlementAmountAndSumRule.checkFIToFICustomerCreditTransferV02(obj);
		}
	};
	/**
	 * If GroupHeader/InterbankSettlementDate is present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate is not
	 * allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02
	 * FIToFICustomerCreditTransferV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeaderInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02> GroupHeaderInterbankSettlementDateRule = new MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeaderInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is present, then CreditTransferTransactionInformation/InterbankSettlementDate is not allowed.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02 obj) throws Exception {
			ConstraintGroupHeaderInterbankSettlementDateRule.checkFIToFICustomerCreditTransferV02(obj);
		}
	};
	/**
	 * If GroupHeader/InterbankSettlementDate is not present, then
	 * CreditTransferTransactionInformation/InterbankSettlementDate must be
	 * present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02
	 * FIToFICustomerCreditTransferV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInterbankSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/InterbankSettlementDate is not present, then CreditTransferTransactionInformation/InterbankSettlementDate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02> TransactionInterbankSettlementDateRule = new MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInterbankSettlementDateRule";
			definition = "If GroupHeader/InterbankSettlementDate is not present, then CreditTransferTransactionInformation/InterbankSettlementDate must be present.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CreditTransferTransactionInformation[*]/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/InterbankSettlementDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02 obj) throws Exception {
			ConstraintTransactionInterbankSettlementDateRule.checkFIToFICustomerCreditTransferV02(obj);
		}
	};
	/**
	 * If GroupHeader/PaymentTypeInformation is present, then
	 * CreditTransferTransactionInformation/PaymentTypeInformation is not
	 * allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CreditTransferTransactionInformation[*]/PaymentTypeInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/PaymentTypeInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02
	 * FIToFICustomerCreditTransferV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTypeInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/PaymentTypeInformation is present, then CreditTransferTransactionInformation/PaymentTypeInformation is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02> PaymentTypeInformationRule = new MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeInformationRule";
			definition = "If GroupHeader/PaymentTypeInformation is present, then CreditTransferTransactionInformation/PaymentTypeInformation is not allowed.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CreditTransferTransactionInformation[*]/PaymentTypeInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/PaymentTypeInformation</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02 obj) throws Exception {
			ConstraintPaymentTypeInformationRule.checkFIToFICustomerCreditTransferV02(obj);
		}
	};
	/**
	 * GroupHeader/NumberOfTransactions must equal the number of occurrences of
	 * CreditTransferTransactionInformation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;SimpleRule xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GroupHeader/NumberOfTransactions&lt;/leftOperand&gt;&lt;rightOperand&gt;number of occurrences of CreditTransferTransactionInformation&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02
	 * FIToFICustomerCreditTransferV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsAndCreditTransfersRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GroupHeader/NumberOfTransactions must equal the number of occurrences of CreditTransferTransactionInformation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02> NumberOfTransactionsAndCreditTransfersRule = new MMConstraint<com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsAndCreditTransfersRule";
			definition = "GroupHeader/NumberOfTransactions must equal the number of occurrences of CreditTransferTransactionInformation.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SimpleRule xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GroupHeader/NumberOfTransactions</leftOperand><rightOperand>number of occurrences of CreditTransferTransactionInformation</rightOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02 obj) throws Exception {
			ConstraintNumberOfTransactionsAndCreditTransfersRule.checkFIToFICustomerCreditTransferV02(obj);
		}
	};
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader33 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33
	 * GroupHeader33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics shared by all individual transactions included in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FIToFICustomerCreditTransferV02, GroupHeader33> mmGroupHeader = new MMMessageBuildingBlock<FIToFICustomerCreditTransferV02, GroupHeader33>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = LazyReference.create(() -> GroupHeader33.mmObject());
		}

		@Override
		public GroupHeader33 getValue(FIToFICustomerCreditTransferV02 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(FIToFICustomerCreditTransferV02 obj, GroupHeader33 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "CdtTrfTxInf", required = true)
	protected List<CreditTransferTransactionInformation11> creditTransferTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msgpart.CreditTransferTransactionInformation11
	 * CreditTransferTransactionInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtTrfTxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditTransferTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information specific to the individual credit transfer(s). "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FIToFICustomerCreditTransferV02, List<CreditTransferTransactionInformation11>> mmCreditTransferTransactionInformation = new MMMessageBuildingBlock<FIToFICustomerCreditTransferV02, List<CreditTransferTransactionInformation11>>() {
		{
			xmlTag = "CdtTrfTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferTransactionInformation";
			definition = "Set of elements providing information specific to the individual credit transfer(s). ";
			minOccurs = 1;
			complexType_lazy = LazyReference.create(() -> CreditTransferTransactionInformation11.mmObject());
		}

		@Override
		public List<CreditTransferTransactionInformation11> getValue(FIToFICustomerCreditTransferV02 obj) {
			return obj.getCreditTransferTransactionInformation();
		}

		@Override
		public void setValue(FIToFICustomerCreditTransferV02 obj, List<CreditTransferTransactionInformation11> value) {
			obj.setCreditTransferTransactionInformation(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.InstructedAgentRule,
						com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.InstructingAgentRule, com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.TotalInterbankSettlementAmountRule,
						com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.TotalInterbankSettlementAmountAndSumRule,
						com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.GroupHeaderInterbankSettlementDateRule, com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.TransactionInterbankSettlementDateRule,
						com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.PaymentTypeInformationRule, com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.NumberOfTransactionsAndCreditTransfersRule));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FIToFICustomerCreditTransferV02";
				definition = "Scope\r\nThe FinancialInstitutionToFinancialInstitutionCustomerCreditTransfer message is sent by the debtor agent to the creditor agent, directly or through other agents and/or a payment clearing and settlement system. It is used to move funds from a debtor account to a creditor.\r\nUsage\r\nThe FIToFICustomerCreditTransfer message is exchanged between agents and can contain one or more customer credit transfer instructions.\r\nThe FIToFICustomerCreditTransfer message does not allow for grouping: a CreditTransferTransactionInformation block must be present for each credit transfer transaction.\r\nThe FIToFICustomerCreditTransfer message can be used in different ways:\r\n- If the instructing agent and the instructed agent wish to use their direct account relationship in the currency of the transfer then the message contains both the funds for the customer transfer(s) as well as the payment details;\r\n- If the instructing agent and the instructed agent have no direct account relationship in the currency of the transfer, or do not wish to use their account relationship, then other (reimbursement) agents will be involved to cover for the customer transfer(s). The FIToFICustomerCreditTransfer contains only the payment details and the instructing agent must cover the customer transfer by sending a FinancialInstitutionCreditTransfer to a reimbursement agent. This payment method is called the Cover method;\r\n- If more than two financial institutions are involved in the payment chain and if the FIToFICustomerCreditTransfer is sent from one financial institution to the next financial institution in the payment chain, then the payment method is called the Serial method.\r\nThe FIToFICustomerCreditTransfer message can be used in domestic and cross-border scenarios.";
				rootElement = "Document";
				xmlTag = "FIToFICstmrCdtTrf";
				businessArea_lazy = LazyReference.create(() -> PaymentsClearingandSettlementArchive.mmObject());
				messageBuildingBlock_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.mmGroupHeader,
						com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02.mmCreditTransferTransactionInformation));
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "008";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FIToFICustomerCreditTransferV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader33 getGroupHeader() {
		return groupHeader;
	}

	public FIToFICustomerCreditTransferV02 setGroupHeader(GroupHeader33 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<CreditTransferTransactionInformation11> getCreditTransferTransactionInformation() {
		return creditTransferTransactionInformation == null ? creditTransferTransactionInformation = new ArrayList<>() : creditTransferTransactionInformation;
	}

	public FIToFICustomerCreditTransferV02 setCreditTransferTransactionInformation(List<CreditTransferTransactionInformation11> creditTransferTransactionInformation) {
		this.creditTransferTransactionInformation = Objects.requireNonNull(creditTransferTransactionInformation);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02")
	static public class Document {
		@XmlElement(name = "FIToFICstmrCdtTrf", required = true)
		public FIToFICustomerCreditTransferV02 messageBody;
	}
}