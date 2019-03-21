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
import com.tools20022.repository.msgpart.*;
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
 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15#mmReferredDocumentInformation
 * StructuredRemittanceInformation15.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15#mmReferredDocumentAmount
 * StructuredRemittanceInformation15.mmReferredDocumentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15#mmCreditorReferenceInformation
 * StructuredRemittanceInformation15.mmCreditorReferenceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15#mmInvoicer
 * StructuredRemittanceInformation15.mmInvoicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15#mmInvoicee
 * StructuredRemittanceInformation15.mmInvoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15#mmTaxRemittance
 * StructuredRemittanceInformation15.mmTaxRemittance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15#mmGarnishmentRemittance
 * StructuredRemittanceInformation15.mmGarnishmentRemittance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation15.mmAdditionalRemittanceInformation}</li>
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
 * "StructuredRemittanceInformation15"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StructuredRemittanceInformation15", propOrder = {"referredDocumentInformation", "referredDocumentAmount", "creditorReferenceInformation", "invoicer", "invoicee", "taxRemittance", "garnishmentRemittance",
		"additionalRemittanceInformation"})
public class StructuredRemittanceInformation15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RfrdDocInf")
	protected List<ReferredDocumentInformation7> referredDocumentInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.ReferredDocumentInformation7
	 * ReferredDocumentInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
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
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation15, List<ReferredDocumentInformation7>> mmReferredDocumentInformation = new MMMessageAssociationEnd<StructuredRemittanceInformation15, List<ReferredDocumentInformation7>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmObject());
			isDerived = false;
			xmlTag = "RfrdDocInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentInformation";
			definition = "Provides the identification and the content of the referred document.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> ReferredDocumentInformation7.mmObject());
		}

		@Override
		public List<ReferredDocumentInformation7> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getReferredDocumentInformation();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, List<ReferredDocumentInformation7> value) {
			obj.setReferredDocumentInformation(value);
		}
	};
	@XmlElement(name = "RfrdDocAmt")
	protected RemittanceAmount2 referredDocumentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.RemittanceAmount2
	 * RemittanceAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
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
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<RemittanceAmount2>> mmReferredDocumentAmount = new MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<RemittanceAmount2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmObject());
			isDerived = false;
			xmlTag = "RfrdDocAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentAmount";
			definition = "Provides details on the amounts of the referred document.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> RemittanceAmount2.mmObject());
		}

		@Override
		public Optional<RemittanceAmount2> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getReferredDocumentAmount();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, Optional<RemittanceAmount2> value) {
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
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
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
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<CreditorReferenceInformation2>> mmCreditorReferenceInformation = new MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<CreditorReferenceInformation2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmObject());
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
		public Optional<CreditorReferenceInformation2> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getCreditorReferenceInformation();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, Optional<CreditorReferenceInformation2> value) {
			obj.setCreditorReferenceInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "Invcr")
	protected PartyIdentification125 invoicer;
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
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
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
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<PartyIdentification125>> mmInvoicer = new MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<PartyIdentification125>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmObject());
			isDerived = false;
			xmlTag = "Invcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicer";
			definition = "Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PartyIdentification125.mmObject());
		}

		@Override
		public Optional<PartyIdentification125> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getInvoicer();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, Optional<PartyIdentification125> value) {
			obj.setInvoicer(value.orElse(null));
		}
	};
	@XmlElement(name = "Invcee")
	protected PartyIdentification125 invoicee;
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
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
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
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<PartyIdentification125>> mmInvoicee = new MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<PartyIdentification125>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmObject());
			isDerived = false;
			xmlTag = "Invcee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicee";
			definition = "Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PartyIdentification125.mmObject());
		}

		@Override
		public Optional<PartyIdentification125> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getInvoicee();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, Optional<PartyIdentification125> value) {
			obj.setInvoicee(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxRmt")
	protected TaxInformation7 taxRemittance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.TaxInformation7
	 * TaxInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRemittance"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<TaxInformation7>> mmTaxRemittance = new MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<TaxInformation7>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmObject());
			isDerived = false;
			xmlTag = "TaxRmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRemittance";
			definition = "Provides remittance information about a payment made for tax-related purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TaxInformation7.mmObject());
		}

		@Override
		public Optional<TaxInformation7> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getTaxRemittance();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, Optional<TaxInformation7> value) {
			obj.setTaxRemittance(value.orElse(null));
		}
	};
	@XmlElement(name = "GrnshmtRmt")
	protected Garnishment2 garnishmentRemittance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.Garnishment2
	 * Garnishment2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrnshmtRmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GarnishmentRemittance"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<Garnishment2>> mmGarnishmentRemittance = new MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<Garnishment2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmObject());
			isDerived = false;
			xmlTag = "GrnshmtRmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GarnishmentRemittance";
			definition = "Provides remittance information about a payment for garnishment-related purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> Garnishment2.mmObject());
		}

		@Override
		public Optional<Garnishment2> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getGarnishmentRemittance();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, Optional<Garnishment2> value) {
			obj.setGarnishmentRemittance(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msgpart.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
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
	public static final MMMessageAttribute<StructuredRemittanceInformation15, List<Max140Text>> mmAdditionalRemittanceInformation = new MMMessageAttribute<StructuredRemittanceInformation15, List<Max140Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmObject());
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
		public List<Max140Text> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getAdditionalRemittanceInformation();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, List<Max140Text> value) {
			obj.setAdditionalRemittanceInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmReferredDocumentInformation,
						com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmReferredDocumentAmount, com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmCreditorReferenceInformation,
						com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmInvoicer, com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmInvoicee,
						com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmTaxRemittance, com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmGarnishmentRemittance,
						com.tools20022.repository.msgpart.StructuredRemittanceInformation15.mmAdditionalRemittanceInformation));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StructuredRemittanceInformation15";
				definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<ReferredDocumentInformation7> getReferredDocumentInformation() {
		return referredDocumentInformation == null ? referredDocumentInformation = new ArrayList<>() : referredDocumentInformation;
	}

	public StructuredRemittanceInformation15 setReferredDocumentInformation(List<ReferredDocumentInformation7> referredDocumentInformation) {
		this.referredDocumentInformation = Objects.requireNonNull(referredDocumentInformation);
		return this;
	}

	public Optional<RemittanceAmount2> getReferredDocumentAmount() {
		return Optional.ofNullable(referredDocumentAmount);
	}

	public StructuredRemittanceInformation15 setReferredDocumentAmount(RemittanceAmount2 referredDocumentAmount) {
		this.referredDocumentAmount = referredDocumentAmount;
		return this;
	}

	public Optional<CreditorReferenceInformation2> getCreditorReferenceInformation() {
		return Optional.ofNullable(creditorReferenceInformation);
	}

	public StructuredRemittanceInformation15 setCreditorReferenceInformation(CreditorReferenceInformation2 creditorReferenceInformation) {
		this.creditorReferenceInformation = creditorReferenceInformation;
		return this;
	}

	public Optional<PartyIdentification125> getInvoicer() {
		return Optional.ofNullable(invoicer);
	}

	public StructuredRemittanceInformation15 setInvoicer(PartyIdentification125 invoicer) {
		this.invoicer = invoicer;
		return this;
	}

	public Optional<PartyIdentification125> getInvoicee() {
		return Optional.ofNullable(invoicee);
	}

	public StructuredRemittanceInformation15 setInvoicee(PartyIdentification125 invoicee) {
		this.invoicee = invoicee;
		return this;
	}

	public Optional<TaxInformation7> getTaxRemittance() {
		return Optional.ofNullable(taxRemittance);
	}

	public StructuredRemittanceInformation15 setTaxRemittance(TaxInformation7 taxRemittance) {
		this.taxRemittance = taxRemittance;
		return this;
	}

	public Optional<Garnishment2> getGarnishmentRemittance() {
		return Optional.ofNullable(garnishmentRemittance);
	}

	public StructuredRemittanceInformation15 setGarnishmentRemittance(Garnishment2 garnishmentRemittance) {
		this.garnishmentRemittance = garnishmentRemittance;
		return this;
	}

	public List<Max140Text> getAdditionalRemittanceInformation() {
		return additionalRemittanceInformation == null ? additionalRemittanceInformation = new ArrayList<>() : additionalRemittanceInformation;
	}

	public StructuredRemittanceInformation15 setAdditionalRemittanceInformation(List<Max140Text> additionalRemittanceInformation) {
		this.additionalRemittanceInformation = Objects.requireNonNull(additionalRemittanceInformation);
		return this;
	}
}