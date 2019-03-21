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

package com.tools20022.repository.area.camt;

import com.tools20022.core.repo.LazyReference;
import com.tools20022.metamodel.*;
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.constraint.ConstraintMessageOrStatementPaginationRule;
import com.tools20022.repository.constraint.ConstraintSupplementaryDataRule;
import com.tools20022.repository.msgpart.AccountStatement8;
import com.tools20022.repository.msgpart.GroupHeader73;
import com.tools20022.repository.msgpart.SupplementaryData1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The BankToCustomerStatement message is sent by the account servicer to an
 * account owner or to a party authorised by the account owner to receive the
 * message. It is used to inform the account owner, or authorised party, of the
 * entries booked to the account, and to provide the owner with balance
 * information on the account at a given point in time.<br>
 * <b>Usage</b><br>
 * The BankToCustomerStatement message can contain reports for more than one
 * account. It provides information for cash management and/or reconciliation.<br>
 * It contains information on booked entries only.<br>
 * It can include underlying details of transactions that have been included in
 * the entry.<br>
 * The message is exchanged as defined between the account servicer and the
 * account owner. It provides information on items that have been booked to the
 * account and also balance information. Depending on services and schedule
 * agreed between banks and their customers, statements may be generated and
 * exchanged accordingly, for example for intraday or prior day periods.<br>
 * It is possible that the receiver of the message is not the account owner, but
 * a party entitled through arrangement with the account owner to receive the
 * account information (also known as recipient).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlocks
 * messageBuildingBlocks} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07#mmGroupHeader
 * BankToCustomerStatementV07.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07#mmStatement
 * BankToCustomerStatementV07.mmStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07#mmSupplementaryData
 * BankToCustomerStatementV07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BkToCstmrStmt"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.053.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraints
 * constraints} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07#MessageOrStatementPaginationRule
 * BankToCustomerStatementV07.MessageOrStatementPaginationRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07#SupplementaryDataRule
 * BankToCustomerStatementV07.SupplementaryDataRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BankToCustomerStatementV07"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BankToCustomerStatementV07", propOrder = {"groupHeader", "statement", "supplementaryData"})
public class BankToCustomerStatementV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/MessagePagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Statement[*]/StatementPagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07
	 * BankToCustomerStatementV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrStatementPaginationRule"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.area.camt.BankToCustomerStatementV07> MessageOrStatementPaginationRule = new MMConstraint<com.tools20022.repository.area.camt.BankToCustomerStatementV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrStatementPaginationRule";
			definition = "MessagePagination may be present or StatementPagination may be present, but not both.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.area.camt.BankToCustomerStatementV07.mmObject());
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/MessagePagination</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/Statement[*]/StatementPagination</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(com.tools20022.repository.area.camt.BankToCustomerStatementV07 obj) throws Exception {
			ConstraintMessageOrStatementPaginationRule.checkBankToCustomerStatementV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07
	 * BankToCustomerStatementV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.area.camt.BankToCustomerStatementV07> SupplementaryDataRule = new MMConstraint<com.tools20022.repository.area.camt.BankToCustomerStatementV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.area.camt.BankToCustomerStatementV07.mmObject());
		}

		@Override
		public void executeValidator(com.tools20022.repository.area.camt.BankToCustomerStatementV07 obj) throws Exception {
			ConstraintSupplementaryDataRule.checkBankToCustomerStatementV07(obj);
		}
	};
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader73 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader73
	 * GroupHeader73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BankToCustomerStatementV07, GroupHeader73> mmGroupHeader = new MMMessageBuildingBlock<BankToCustomerStatementV07, GroupHeader73>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Common information for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = LazyReference.create(() -> GroupHeader73.mmObject());
		}

		@Override
		public GroupHeader73 getValue(BankToCustomerStatementV07 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(BankToCustomerStatementV07 obj, GroupHeader73 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "Stmt", required = true)
	protected List<AccountStatement8> statement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msgpart.AccountStatement8
	 * AccountStatement8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Stmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Statement"</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BankToCustomerStatementV07, List<AccountStatement8>> mmStatement = new MMMessageBuildingBlock<BankToCustomerStatementV07, List<AccountStatement8>>() {
		{
			xmlTag = "Stmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Statement";
			definition = "Reports on booked entries and balances for a cash account.";
			minOccurs = 1;
			complexType_lazy = LazyReference.create(() -> AccountStatement8.mmObject());
		}

		@Override
		public List<AccountStatement8> getValue(BankToCustomerStatementV07 obj) {
			return obj.getStatement();
		}

		@Override
		public void setValue(BankToCustomerStatementV07 obj, List<AccountStatement8> value) {
			obj.setStatement(value);
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
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msgpart.SupplementaryData1
	 * SupplementaryData1}</li>
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
	public static final MMMessageBuildingBlock<BankToCustomerStatementV07, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<BankToCustomerStatementV07, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = LazyReference.create(() -> SupplementaryData1.mmObject());
		}

		@Override
		public List<SupplementaryData1> getValue(BankToCustomerStatementV07 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(BankToCustomerStatementV07 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraints_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.area.camt.BankToCustomerStatementV07.MessageOrStatementPaginationRule,
						com.tools20022.repository.area.camt.BankToCustomerStatementV07.SupplementaryDataRule));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BankToCustomerStatementV07";
				definition = "Scope\r\nThe BankToCustomerStatement message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It is used to inform the account owner, or authorised party, of the entries booked to the account, and to provide the owner with balance information on the account at a given point in time.\r\nUsage\r\nThe BankToCustomerStatement message can contain reports for more than one account. It provides information for cash management and/or reconciliation.\r\nIt contains information on booked entries only.\r\nIt can include underlying details of transactions that have been included in the entry.\r\nThe message is exchanged as defined between the account servicer and the account owner. It provides information on items that have been booked to the account and also balance information. Depending on services and schedule agreed between banks and their customers, statements may be generated and exchanged accordingly, for example for intraday or prior day periods.\r\nIt is possible that the receiver of the message is not the account owner, but a party entitled through arrangement with the account owner to receive the account information (also known as recipient).";
				rootElement = "Document";
				xmlTag = "BkToCstmrStmt";
				businessArea_lazy = LazyReference.create(() -> CashManagementLatestVersion.mmObject());
				messageBuildingBlocks_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.area.camt.BankToCustomerStatementV07.mmGroupHeader, com.tools20022.repository.area.camt.BankToCustomerStatementV07.mmStatement,
						com.tools20022.repository.area.camt.BankToCustomerStatementV07.mmSupplementaryData));
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "053";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return BankToCustomerStatementV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader73 getGroupHeader() {
		return groupHeader;
	}

	public BankToCustomerStatementV07 setGroupHeader(GroupHeader73 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<AccountStatement8> getStatement() {
		return statement == null ? statement = new ArrayList<>() : statement;
	}

	public BankToCustomerStatementV07 setStatement(List<AccountStatement8> statement) {
		this.statement = Objects.requireNonNull(statement);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public BankToCustomerStatementV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.07")
	static public class Document {
		@XmlElement(name = "BkToCstmrStmt", required = true)
		public BankToCustomerStatementV07 messageBody;
	}
}