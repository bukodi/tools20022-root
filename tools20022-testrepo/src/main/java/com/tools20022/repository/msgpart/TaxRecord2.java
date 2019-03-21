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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.TaxAmount2;
import com.tools20022.repository.msgpart.TaxPeriod2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to define the tax record.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxRecord2#mmType
 * TaxRecord2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxRecord2#mmCategory
 * TaxRecord2.mmCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TaxRecord2#mmCategoryDetails
 * TaxRecord2.mmCategoryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxRecord2#mmDebtorStatus
 * TaxRecord2.mmDebtorStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TaxRecord2#mmCertificateIdentification
 * TaxRecord2.mmCertificateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxRecord2#mmFormsCode
 * TaxRecord2.mmFormsCode}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxRecord2#mmPeriod
 * TaxRecord2.mmPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxRecord2#mmTaxAmount
 * TaxRecord2.mmTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TaxRecord2#mmAdditionalInformation
 * TaxRecord2.mmAdditionalInformation}</li>
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
 * "TaxRecord2"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TaxRecord2", propOrder = {"type", "category", "categoryDetails", "debtorStatus", "certificateIdentification", "formsCode", "period", "taxAmount", "additionalInformation"})
public class TaxRecord2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp")
	protected Max35Text type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxRecord2 TaxRecord2}</li>
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
	public static final MMMessageAttribute<TaxRecord2, Optional<Max35Text>> mmType = new MMMessageAttribute<TaxRecord2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxRecord2.mmObject());
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "High level code to identify the type of tax details.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TaxRecord2 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(TaxRecord2 obj, Optional<Max35Text> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Ctgy")
	protected Max35Text category;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxRecord2 TaxRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Category"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxRecord2, Optional<Max35Text>> mmCategory = new MMMessageAttribute<TaxRecord2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxRecord2.mmObject());
			isDerived = false;
			xmlTag = "Ctgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Category";
			definition = "Specifies the tax code as published by the tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TaxRecord2 obj) {
			return obj.getCategory();
		}

		@Override
		public void setValue(TaxRecord2 obj, Optional<Max35Text> value) {
			obj.setCategory(value.orElse(null));
		}
	};
	@XmlElement(name = "CtgyDtls")
	protected Max35Text categoryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxRecord2 TaxRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtgyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryDetails"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxRecord2, Optional<Max35Text>> mmCategoryDetails = new MMMessageAttribute<TaxRecord2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxRecord2.mmObject());
			isDerived = false;
			xmlTag = "CtgyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryDetails";
			definition = "Provides further details of the category tax code.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TaxRecord2 obj) {
			return obj.getCategoryDetails();
		}

		@Override
		public void setValue(TaxRecord2 obj, Optional<Max35Text> value) {
			obj.setCategoryDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrSts")
	protected Max35Text debtorStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxRecord2 TaxRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorStatus"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxRecord2, Optional<Max35Text>> mmDebtorStatus = new MMMessageAttribute<TaxRecord2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxRecord2.mmObject());
			isDerived = false;
			xmlTag = "DbtrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorStatus";
			definition = "Code provided by local authority to identify the status of the party that has drawn up the settlement document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TaxRecord2 obj) {
			return obj.getDebtorStatus();
		}

		@Override
		public void setValue(TaxRecord2 obj, Optional<Max35Text> value) {
			obj.setDebtorStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "CertId")
	protected Max35Text certificateIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxRecord2 TaxRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxRecord2, Optional<Max35Text>> mmCertificateIdentification = new MMMessageAttribute<TaxRecord2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxRecord2.mmObject());
			isDerived = false;
			xmlTag = "CertId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateIdentification";
			definition = "Identification number of the tax report as assigned by the taxing authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TaxRecord2 obj) {
			return obj.getCertificateIdentification();
		}

		@Override
		public void setValue(TaxRecord2 obj, Optional<Max35Text> value) {
			obj.setCertificateIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "FrmsCd")
	protected Max35Text formsCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxRecord2 TaxRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrmsCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormsCode"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxRecord2, Optional<Max35Text>> mmFormsCode = new MMMessageAttribute<TaxRecord2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxRecord2.mmObject());
			isDerived = false;
			xmlTag = "FrmsCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormsCode";
			definition = "Identifies, in a coded form, on which template the tax report is to be provided.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TaxRecord2 obj) {
			return obj.getFormsCode();
		}

		@Override
		public void setValue(TaxRecord2 obj, Optional<Max35Text> value) {
			obj.setFormsCode(value.orElse(null));
		}
	};
	@XmlElement(name = "Prd")
	protected TaxPeriod2 period;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.TaxPeriod2
	 * TaxPeriod2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxRecord2 TaxRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Period"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxRecord2, Optional<TaxPeriod2>> mmPeriod = new MMMessageAssociationEnd<TaxRecord2, Optional<TaxPeriod2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxRecord2.mmObject());
			isDerived = false;
			xmlTag = "Prd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Period";
			definition = "Set of elements used to provide details on the period of time related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TaxPeriod2.mmObject());
		}

		@Override
		public Optional<TaxPeriod2> getValue(TaxRecord2 obj) {
			return obj.getPeriod();
		}

		@Override
		public void setValue(TaxRecord2 obj, Optional<TaxPeriod2> value) {
			obj.setPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxAmt")
	protected TaxAmount2 taxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.TaxAmount2
	 * TaxAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxRecord2 TaxRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAmount"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxRecord2, Optional<TaxAmount2>> mmTaxAmount = new MMMessageAssociationEnd<TaxRecord2, Optional<TaxAmount2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxRecord2.mmObject());
			isDerived = false;
			xmlTag = "TaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAmount";
			definition = "Set of elements used to provide information on the amount of the tax record.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TaxAmount2.mmObject());
		}

		@Override
		public Optional<TaxAmount2> getValue(TaxRecord2 obj) {
			return obj.getTaxAmount();
		}

		@Override
		public void setValue(TaxRecord2 obj, Optional<TaxAmount2> value) {
			obj.setTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max140Text additionalInformation;
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
	 * {@linkplain com.tools20022.repository.msgpart.TaxRecord2 TaxRecord2}</li>
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
	public static final MMMessageAttribute<TaxRecord2, Optional<Max140Text>> mmAdditionalInformation = new MMMessageAttribute<TaxRecord2, Optional<Max140Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxRecord2.mmObject());
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further details of the tax record.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max140Text.mmObject());
		}

		@Override
		public Optional<Max140Text> getValue(TaxRecord2 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(TaxRecord2 obj, Optional<Max140Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.TaxRecord2.mmType, com.tools20022.repository.msgpart.TaxRecord2.mmCategory,
						com.tools20022.repository.msgpart.TaxRecord2.mmCategoryDetails, com.tools20022.repository.msgpart.TaxRecord2.mmDebtorStatus, com.tools20022.repository.msgpart.TaxRecord2.mmCertificateIdentification,
						com.tools20022.repository.msgpart.TaxRecord2.mmFormsCode, com.tools20022.repository.msgpart.TaxRecord2.mmPeriod, com.tools20022.repository.msgpart.TaxRecord2.mmTaxAmount,
						com.tools20022.repository.msgpart.TaxRecord2.mmAdditionalInformation));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxRecord2";
				definition = "Set of elements used to define the tax record.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getType() {
		return Optional.ofNullable(type);
	}

	public TaxRecord2 setType(Max35Text type) {
		this.type = type;
		return this;
	}

	public Optional<Max35Text> getCategory() {
		return Optional.ofNullable(category);
	}

	public TaxRecord2 setCategory(Max35Text category) {
		this.category = category;
		return this;
	}

	public Optional<Max35Text> getCategoryDetails() {
		return Optional.ofNullable(categoryDetails);
	}

	public TaxRecord2 setCategoryDetails(Max35Text categoryDetails) {
		this.categoryDetails = categoryDetails;
		return this;
	}

	public Optional<Max35Text> getDebtorStatus() {
		return Optional.ofNullable(debtorStatus);
	}

	public TaxRecord2 setDebtorStatus(Max35Text debtorStatus) {
		this.debtorStatus = debtorStatus;
		return this;
	}

	public Optional<Max35Text> getCertificateIdentification() {
		return Optional.ofNullable(certificateIdentification);
	}

	public TaxRecord2 setCertificateIdentification(Max35Text certificateIdentification) {
		this.certificateIdentification = certificateIdentification;
		return this;
	}

	public Optional<Max35Text> getFormsCode() {
		return Optional.ofNullable(formsCode);
	}

	public TaxRecord2 setFormsCode(Max35Text formsCode) {
		this.formsCode = formsCode;
		return this;
	}

	public Optional<TaxPeriod2> getPeriod() {
		return Optional.ofNullable(period);
	}

	public TaxRecord2 setPeriod(TaxPeriod2 period) {
		this.period = period;
		return this;
	}

	public Optional<TaxAmount2> getTaxAmount() {
		return Optional.ofNullable(taxAmount);
	}

	public TaxRecord2 setTaxAmount(TaxAmount2 taxAmount) {
		this.taxAmount = taxAmount;
		return this;
	}

	public Optional<Max140Text> getAdditionalInformation() {
		return Optional.ofNullable(additionalInformation);
	}

	public TaxRecord2 setAdditionalInformation(Max140Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}