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
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsClearingandSettlementArchive;
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
 * {@linkplain com.tools20022.repository.constraint.ConstraintInstructedAgentRule#for_pacs_FIToFICustomerCreditTransferV02
 * ConstraintInstructedAgentRule.for_pacs_FIToFICustomerCreditTransferV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraint.ConstraintInstructingAgentRule#for_pacs_FIToFICustomerCreditTransferV02
 * ConstraintInstructingAgentRule.for_pacs_FIToFICustomerCreditTransferV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraint.ConstraintTotalInterbankSettlementAmountRule#for_pacs_FIToFICustomerCreditTransferV02
 * ConstraintTotalInterbankSettlementAmountRule.
 * for_pacs_FIToFICustomerCreditTransferV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraint.ConstraintTotalInterbankSettlementAmountAndSumRule#for_pacs_FIToFICustomerCreditTransferV02
 * ConstraintTotalInterbankSettlementAmountAndSumRule.
 * for_pacs_FIToFICustomerCreditTransferV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraint.ConstraintGroupHeaderInterbankSettlementDateRule#for_pacs_FIToFICustomerCreditTransferV02
 * ConstraintGroupHeaderInterbankSettlementDateRule.
 * for_pacs_FIToFICustomerCreditTransferV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraint.ConstraintTransactionInterbankSettlementDateRule#for_pacs_FIToFICustomerCreditTransferV02
 * ConstraintTransactionInterbankSettlementDateRule.
 * for_pacs_FIToFICustomerCreditTransferV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraint.ConstraintPaymentTypeInformationRule#for_pacs_FIToFICustomerCreditTransferV02
 * ConstraintPaymentTypeInformationRule.for_pacs_FIToFICustomerCreditTransferV02
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraint.ConstraintNumberOfTransactionsAndCreditTransfersRule#for_pacs_FIToFICustomerCreditTransferV02
 * ConstraintNumberOfTransactionsAndCreditTransfersRule.
 * for_pacs_FIToFICustomerCreditTransferV02}</li>
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
				constraint_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.constraint.ConstraintInstructedAgentRule.for_pacs_FIToFICustomerCreditTransferV02,
						com.tools20022.repository.constraint.ConstraintInstructingAgentRule.for_pacs_FIToFICustomerCreditTransferV02,
						com.tools20022.repository.constraint.ConstraintTotalInterbankSettlementAmountRule.for_pacs_FIToFICustomerCreditTransferV02,
						com.tools20022.repository.constraint.ConstraintTotalInterbankSettlementAmountAndSumRule.for_pacs_FIToFICustomerCreditTransferV02,
						com.tools20022.repository.constraint.ConstraintGroupHeaderInterbankSettlementDateRule.for_pacs_FIToFICustomerCreditTransferV02,
						com.tools20022.repository.constraint.ConstraintTransactionInterbankSettlementDateRule.for_pacs_FIToFICustomerCreditTransferV02,
						com.tools20022.repository.constraint.ConstraintPaymentTypeInformationRule.for_pacs_FIToFICustomerCreditTransferV02,
						com.tools20022.repository.constraint.ConstraintNumberOfTransactionsAndCreditTransfersRule.for_pacs_FIToFICustomerCreditTransferV02));
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