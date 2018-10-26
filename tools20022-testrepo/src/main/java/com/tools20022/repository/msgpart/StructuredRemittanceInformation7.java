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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.CreditorReferenceInformation2;
import com.tools20022.repository.msgpart.PartyIdentification32;
import com.tools20022.repository.msgpart.ReferredDocumentInformation3;
import com.tools20022.repository.msgpart.RemittanceAmount1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information supplied to enable the matching/reconciliation of an entry with
 * the items that the payment is intended to settle, such as commercial invoices
 * in an accounts' receivable system, in a structured form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation7#mmReferredDocumentInformation
 * StructuredRemittanceInformation7.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation7#mmReferredDocumentAmount
 * StructuredRemittanceInformation7.mmReferredDocumentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation7#mmCreditorReferenceInformation
 * StructuredRemittanceInformation7.mmCreditorReferenceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation7#mmInvoicer
 * StructuredRemittanceInformation7.mmInvoicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation7#mmInvoicee
 * StructuredRemittanceInformation7.mmInvoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation7#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation7.mmAdditionalRemittanceInformation}</li>
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
 * "StructuredRemittanceInformation7"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StructuredRemittanceInformation7", propOrder = {"referredDocumentInformation", "referredDocumentAmount", "creditorReferenceInformation", "invoicer", "invoicee", "additionalRemittanceInformation"})
public class StructuredRemittanceInformation7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RfrdDocInf")
	protected List<ReferredDocumentInformation3> referredDocumentInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.ReferredDocumentInformation3
	 * ReferredDocumentInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation7
	 * StructuredRemittanceInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrdDocInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredDocumentInformation"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation7, List<ReferredDocumentInformation3>> mmReferredDocumentInformation = new MMMessageAssociationEnd<StructuredRemittanceInformation7, List<ReferredDocumentInformation3>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.StructuredRemittanceInformation7.mmObject());
			isDerived = false;
			xmlTag = "RfrdDocInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentInformation";
			definition = "Set of elements used to identify the documents referred to in the remittance information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> ReferredDocumentInformation3.mmObject());
		}

		@Override
		public List<ReferredDocumentInformation3> getValue(StructuredRemittanceInformation7 obj) {
			return obj.getReferredDocumentInformation();
		}

		@Override
		public void setValue(StructuredRemittanceInformation7 obj, List<ReferredDocumentInformation3> value) {
			obj.setReferredDocumentInformation(value);
		}
	};
	@XmlElement(name = "RfrdDocAmt")
	protected RemittanceAmount1 referredDocumentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.RemittanceAmount1
	 * RemittanceAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation7
	 * StructuredRemittanceInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrdDocAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredDocumentAmount"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation7, Optional<RemittanceAmount1>> mmReferredDocumentAmount = new MMMessageAssociationEnd<StructuredRemittanceInformation7, Optional<RemittanceAmount1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.StructuredRemittanceInformation7.mmObject());
			isDerived = false;
			xmlTag = "RfrdDocAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentAmount";
			definition = "Set of elements used to provide details on the amounts of the referred document.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> RemittanceAmount1.mmObject());
		}

		@Override
		public Optional<RemittanceAmount1> getValue(StructuredRemittanceInformation7 obj) {
			return obj.getReferredDocumentAmount();
		}

		@Override
		public void setValue(StructuredRemittanceInformation7 obj, Optional<RemittanceAmount1> value) {
			obj.setReferredDocumentAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrRefInf")
	protected CreditorReferenceInformation2 creditorReferenceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.CreditorReferenceInformation2
	 * CreditorReferenceInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation7
	 * StructuredRemittanceInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrRefInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorReferenceInformation"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation7, Optional<CreditorReferenceInformation2>> mmCreditorReferenceInformation = new MMMessageAssociationEnd<StructuredRemittanceInformation7, Optional<CreditorReferenceInformation2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.StructuredRemittanceInformation7.mmObject());
			isDerived = false;
			xmlTag = "CdtrRefInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorReferenceInformation";
			definition = "Reference information provided by the creditor to allow the identification of the underlying documents.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CreditorReferenceInformation2.mmObject());
		}

		@Override
		public Optional<CreditorReferenceInformation2> getValue(StructuredRemittanceInformation7 obj) {
			return obj.getCreditorReferenceInformation();
		}

		@Override
		public void setValue(StructuredRemittanceInformation7 obj, Optional<CreditorReferenceInformation2> value) {
			obj.setCreditorReferenceInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "Invcr")
	protected PartyIdentification32 invoicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.PartyIdentification32
	 * PartyIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation7
	 * StructuredRemittanceInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoicer"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation7, Optional<PartyIdentification32>> mmInvoicer = new MMMessageAssociationEnd<StructuredRemittanceInformation7, Optional<PartyIdentification32>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.StructuredRemittanceInformation7.mmObject());
			isDerived = false;
			xmlTag = "Invcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicer";
			definition = "Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PartyIdentification32.mmObject());
		}

		@Override
		public Optional<PartyIdentification32> getValue(StructuredRemittanceInformation7 obj) {
			return obj.getInvoicer();
		}

		@Override
		public void setValue(StructuredRemittanceInformation7 obj, Optional<PartyIdentification32> value) {
			obj.setInvoicer(value.orElse(null));
		}
	};
	@XmlElement(name = "Invcee")
	protected PartyIdentification32 invoicee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.PartyIdentification32
	 * PartyIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation7
	 * StructuredRemittanceInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invcee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoicee"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation7, Optional<PartyIdentification32>> mmInvoicee = new MMMessageAssociationEnd<StructuredRemittanceInformation7, Optional<PartyIdentification32>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.StructuredRemittanceInformation7.mmObject());
			isDerived = false;
			xmlTag = "Invcee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicee";
			definition = "Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PartyIdentification32.mmObject());
		}

		@Override
		public Optional<PartyIdentification32> getValue(StructuredRemittanceInformation7 obj) {
			return obj.getInvoicee();
		}

		@Override
		public void setValue(StructuredRemittanceInformation7 obj, Optional<PartyIdentification32> value) {
			obj.setInvoicee(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlRmtInf")
	protected List<Max140Text> additionalRemittanceInformation;
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
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation7
	 * StructuredRemittanceInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRemittanceInformation"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredRemittanceInformation7, List<Max140Text>> mmAdditionalRemittanceInformation = new MMMessageAttribute<StructuredRemittanceInformation7, List<Max140Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.StructuredRemittanceInformation7.mmObject());
			isDerived = false;
			xmlTag = "AddtlRmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRemittanceInformation";
			definition = "Additional information, in free text form, to complement the structured remittance information.";
			maxOccurs = 3;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max140Text.mmObject());
		}

		@Override
		public List<Max140Text> getValue(StructuredRemittanceInformation7 obj) {
			return obj.getAdditionalRemittanceInformation();
		}

		@Override
		public void setValue(StructuredRemittanceInformation7 obj, List<Max140Text> value) {
			obj.setAdditionalRemittanceInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.StructuredRemittanceInformation7.mmReferredDocumentInformation,
						com.tools20022.repository.msgpart.StructuredRemittanceInformation7.mmReferredDocumentAmount, com.tools20022.repository.msgpart.StructuredRemittanceInformation7.mmCreditorReferenceInformation,
						com.tools20022.repository.msgpart.StructuredRemittanceInformation7.mmInvoicer, com.tools20022.repository.msgpart.StructuredRemittanceInformation7.mmInvoicee,
						com.tools20022.repository.msgpart.StructuredRemittanceInformation7.mmAdditionalRemittanceInformation));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StructuredRemittanceInformation7";
				definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<ReferredDocumentInformation3> getReferredDocumentInformation() {
		return referredDocumentInformation == null ? referredDocumentInformation = new ArrayList<>() : referredDocumentInformation;
	}

	public StructuredRemittanceInformation7 setReferredDocumentInformation(List<ReferredDocumentInformation3> referredDocumentInformation) {
		this.referredDocumentInformation = Objects.requireNonNull(referredDocumentInformation);
		return this;
	}

	public Optional<RemittanceAmount1> getReferredDocumentAmount() {
		return Optional.ofNullable(referredDocumentAmount);
	}

	public StructuredRemittanceInformation7 setReferredDocumentAmount(RemittanceAmount1 referredDocumentAmount) {
		this.referredDocumentAmount = referredDocumentAmount;
		return this;
	}

	public Optional<CreditorReferenceInformation2> getCreditorReferenceInformation() {
		return Optional.ofNullable(creditorReferenceInformation);
	}

	public StructuredRemittanceInformation7 setCreditorReferenceInformation(CreditorReferenceInformation2 creditorReferenceInformation) {
		this.creditorReferenceInformation = creditorReferenceInformation;
		return this;
	}

	public Optional<PartyIdentification32> getInvoicer() {
		return Optional.ofNullable(invoicer);
	}

	public StructuredRemittanceInformation7 setInvoicer(PartyIdentification32 invoicer) {
		this.invoicer = invoicer;
		return this;
	}

	public Optional<PartyIdentification32> getInvoicee() {
		return Optional.ofNullable(invoicee);
	}

	public StructuredRemittanceInformation7 setInvoicee(PartyIdentification32 invoicee) {
		this.invoicee = invoicee;
		return this;
	}

	public List<Max140Text> getAdditionalRemittanceInformation() {
		return additionalRemittanceInformation == null ? additionalRemittanceInformation = new ArrayList<>() : additionalRemittanceInformation;
	}

	public StructuredRemittanceInformation7 setAdditionalRemittanceInformation(List<Max140Text> additionalRemittanceInformation) {
		this.additionalRemittanceInformation = Objects.requireNonNull(additionalRemittanceInformation);
		return this;
	}
}