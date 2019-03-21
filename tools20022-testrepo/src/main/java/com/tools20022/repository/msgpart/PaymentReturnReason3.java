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
import com.tools20022.repository.choice.ReturnReason5Choice;
import com.tools20022.repository.constraint.ConstraintReturnReasonRule;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.BankTransactionCodeStructure4;
import com.tools20022.repository.msgpart.PartyIdentification125;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on the reason of the return of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentReturnReason3#mmOriginalBankTransactionCode
 * PaymentReturnReason3.mmOriginalBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentReturnReason3#mmOriginator
 * PaymentReturnReason3.mmOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentReturnReason3#mmReason
 * PaymentReturnReason3.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentReturnReason3#mmAdditionalInformation
 * PaymentReturnReason3.mmAdditionalInformation}</li>
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
 * {@linkplain com.tools20022.repository.msgpart.PaymentReturnReason3#ReturnReasonRule
 * PaymentReturnReason3.ReturnReasonRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentReturnReason3"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentReturnReason3", propOrder = {"originalBankTransactionCode", "originator", "reason", "additionalInformation"})
public class PaymentReturnReason3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlBkTxCd")
	protected BankTransactionCodeStructure4 originalBankTransactionCode;
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
	 * {@linkplain com.tools20022.repository.msgpart.PaymentReturnReason3
	 * PaymentReturnReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlBkTxCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalBankTransactionCode"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentReturnReason3, Optional<BankTransactionCodeStructure4>> mmOriginalBankTransactionCode = new MMMessageAssociationEnd<PaymentReturnReason3, Optional<BankTransactionCodeStructure4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentReturnReason3.mmObject());
			isDerived = false;
			xmlTag = "OrgnlBkTxCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalBankTransactionCode";
			definition = "Bank transaction code included in the original entry for the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BankTransactionCodeStructure4.mmObject());
		}

		@Override
		public Optional<BankTransactionCodeStructure4> getValue(PaymentReturnReason3 obj) {
			return obj.getOriginalBankTransactionCode();
		}

		@Override
		public void setValue(PaymentReturnReason3 obj, Optional<BankTransactionCodeStructure4> value) {
			obj.setOriginalBankTransactionCode(value.orElse(null));
		}
	};
	@XmlElement(name = "Orgtr")
	protected PartyIdentification125 originator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PaymentReturnReason3
	 * PaymentReturnReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Orgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Originator"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentReturnReason3, Optional<PartyIdentification125>> mmOriginator = new MMMessageAssociationEnd<PaymentReturnReason3, Optional<PartyIdentification125>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentReturnReason3.mmObject());
			isDerived = false;
			xmlTag = "Orgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Originator";
			definition = "Party that issues the return.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PartyIdentification125.mmObject());
		}

		@Override
		public Optional<PartyIdentification125> getValue(PaymentReturnReason3 obj) {
			return obj.getOriginator();
		}

		@Override
		public void setValue(PaymentReturnReason3 obj, Optional<PartyIdentification125> value) {
			obj.setOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "Rsn")
	protected ReturnReason5Choice reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ReturnReason5Choice
	 * ReturnReason5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PaymentReturnReason3
	 * PaymentReturnReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentReturnReason3, Optional<ReturnReason5Choice>> mmReason = new MMMessageAssociationEnd<PaymentReturnReason3, Optional<ReturnReason5Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentReturnReason3.mmObject());
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Specifies the reason for the return.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> ReturnReason5Choice.mmObject());
		}

		@Override
		public Optional<ReturnReason5Choice> getValue(PaymentReturnReason3 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(PaymentReturnReason3 obj, Optional<ReturnReason5Choice> value) {
			obj.setReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<Max105Text> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PaymentReturnReason3
	 * PaymentReturnReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnReason3, List<Max105Text>> mmAdditionalInformation = new MMMessageAttribute<PaymentReturnReason3, List<Max105Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentReturnReason3.mmObject());
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further details on the return reason.";
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max105Text.mmObject());
		}

		@Override
		public List<Max105Text> getValue(PaymentReturnReason3 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(PaymentReturnReason3 obj, List<Max105Text> value) {
			obj.setAdditionalInformation(value);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;NARR&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msgpart.PaymentReturnReason3
	 * PaymentReturnReason3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnReasonRule"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.msgpart.PaymentReturnReason3> ReturnReasonRule = new MMConstraint<com.tools20022.repository.msgpart.PaymentReturnReason3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnReasonRule";
			definition = "If Reason/Code is equal to NARR, then AdditionalInformation must be present.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentReturnReason3.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/Reason/Code</leftOperand><rightOperand>NARR</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.msgpart.PaymentReturnReason3 obj) throws Exception {
			ConstraintReturnReasonRule.checkPaymentReturnReason3(obj);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.PaymentReturnReason3.mmOriginalBankTransactionCode, com.tools20022.repository.msgpart.PaymentReturnReason3.mmOriginator,
						com.tools20022.repository.msgpart.PaymentReturnReason3.mmReason, com.tools20022.repository.msgpart.PaymentReturnReason3.mmAdditionalInformation));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				constraints_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.PaymentReturnReason3.ReturnReasonRule));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentReturnReason3";
				definition = "Provides further details on the reason of the return of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BankTransactionCodeStructure4> getOriginalBankTransactionCode() {
		return Optional.ofNullable(originalBankTransactionCode);
	}

	public PaymentReturnReason3 setOriginalBankTransactionCode(BankTransactionCodeStructure4 originalBankTransactionCode) {
		this.originalBankTransactionCode = originalBankTransactionCode;
		return this;
	}

	public Optional<PartyIdentification125> getOriginator() {
		return Optional.ofNullable(originator);
	}

	public PaymentReturnReason3 setOriginator(PartyIdentification125 originator) {
		this.originator = originator;
		return this;
	}

	public Optional<ReturnReason5Choice> getReason() {
		return Optional.ofNullable(reason);
	}

	public PaymentReturnReason3 setReason(ReturnReason5Choice reason) {
		this.reason = reason;
		return this;
	}

	public List<Max105Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public PaymentReturnReason3 setAdditionalInformation(List<Max105Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}