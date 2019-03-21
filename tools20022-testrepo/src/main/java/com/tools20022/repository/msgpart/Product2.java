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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.UnitOfMeasure1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Product purchased to be paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgpart.Product2#mmProductCode
 * Product2.mmProductCode}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.Product2#mmUnitOfMeasure
 * Product2.mmUnitOfMeasure}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.Product2#mmProductQuantity
 * Product2.mmProductQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.Product2#mmUnitPrice
 * Product2.mmUnitPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.Product2#mmProductAmount
 * Product2.mmProductAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.Product2#mmTaxType
 * Product2.mmTaxType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.Product2#mmAdditionalProductInformation
 * Product2.mmAdditionalProductInformation}</li>
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
 * "Product2"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Product2", propOrder = {"productCode", "unitOfMeasure", "productQuantity", "unitPrice", "productAmount", "taxType", "additionalProductInformation"})
public class Product2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PdctCd", required = true)
	protected Max70Text productCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.Product2 Product2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCode"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Product2, Max70Text> mmProductCode = new MMMessageAttribute<Product2, Max70Text>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.Product2.mmObject());
			isDerived = false;
			xmlTag = "PdctCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCode";
			definition = "Product code of the item purchased.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> Max70Text.mmObject());
		}

		@Override
		public Max70Text getValue(Product2 obj) {
			return obj.getProductCode();
		}

		@Override
		public void setValue(Product2 obj, Max70Text value) {
			obj.setProductCode(value);
		}
	};
	@XmlElement(name = "UnitOfMeasr")
	protected UnitOfMeasure1Code unitOfMeasure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.Product2 Product2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitOfMeasr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitOfMeasure"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Product2, Optional<UnitOfMeasure1Code>> mmUnitOfMeasure = new MMMessageAttribute<Product2, Optional<UnitOfMeasure1Code>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.Product2.mmObject());
			isDerived = false;
			xmlTag = "UnitOfMeasr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitOfMeasure";
			definition = "Unit of measure of the item purchased.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> UnitOfMeasure1Code.mmObject());
		}

		@Override
		public Optional<UnitOfMeasure1Code> getValue(Product2 obj) {
			return obj.getUnitOfMeasure();
		}

		@Override
		public void setValue(Product2 obj, Optional<UnitOfMeasure1Code> value) {
			obj.setUnitOfMeasure(value.orElse(null));
		}
	};
	@XmlElement(name = "PdctQty")
	protected DecimalNumber productQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.Product2 Product2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductQuantity"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Product2, Optional<DecimalNumber>> mmProductQuantity = new MMMessageAttribute<Product2, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.Product2.mmObject());
			isDerived = false;
			xmlTag = "PdctQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductQuantity";
			definition = "Product quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> DecimalNumber.mmObject());
		}

		@Override
		public Optional<DecimalNumber> getValue(Product2 obj) {
			return obj.getProductQuantity();
		}

		@Override
		public void setValue(Product2 obj, Optional<DecimalNumber> value) {
			obj.setProductQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitPric")
	protected ImpliedCurrencyAndAmount unitPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.Product2 Product2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPrice"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Product2, Optional<ImpliedCurrencyAndAmount>> mmUnitPrice = new MMMessageAttribute<Product2, Optional<ImpliedCurrencyAndAmount>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.Product2.mmObject());
			isDerived = false;
			xmlTag = "UnitPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitPrice";
			definition = "Price per unit of product.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ImpliedCurrencyAndAmount.mmObject());
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(Product2 obj) {
			return obj.getUnitPrice();
		}

		@Override
		public void setValue(Product2 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setUnitPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "PdctAmt")
	protected ImpliedCurrencyAndAmount productAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.Product2 Product2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductAmount"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Product2, Optional<ImpliedCurrencyAndAmount>> mmProductAmount = new MMMessageAttribute<Product2, Optional<ImpliedCurrencyAndAmount>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.Product2.mmObject());
			isDerived = false;
			xmlTag = "PdctAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductAmount";
			definition = "Monetary value of purchased product.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ImpliedCurrencyAndAmount.mmObject());
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(Product2 obj) {
			return obj.getProductAmount();
		}

		@Override
		public void setValue(Product2 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setProductAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxTp")
	protected Max35Text taxType;
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
	 * {@linkplain com.tools20022.repository.msgpart.Product2 Product2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxType"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Product2, Optional<Max35Text>> mmTaxType = new MMMessageAttribute<Product2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.Product2.mmObject());
			isDerived = false;
			xmlTag = "TaxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxType";
			definition = "Information on tax paid on the product.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(Product2 obj) {
			return obj.getTaxType();
		}

		@Override
		public void setValue(Product2 obj, Optional<Max35Text> value) {
			obj.setTaxType(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlPdctInf")
	protected Max35Text additionalProductInformation;
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
	 * {@linkplain com.tools20022.repository.msgpart.Product2 Product2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPdctInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalProductInformation"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Product2, Optional<Max35Text>> mmAdditionalProductInformation = new MMMessageAttribute<Product2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.Product2.mmObject());
			isDerived = false;
			xmlTag = "AddtlPdctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalProductInformation";
			definition = "Additional information related to the product.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(Product2 obj) {
			return obj.getAdditionalProductInformation();
		}

		@Override
		public void setValue(Product2 obj, Optional<Max35Text> value) {
			obj.setAdditionalProductInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.Product2.mmProductCode, com.tools20022.repository.msgpart.Product2.mmUnitOfMeasure,
						com.tools20022.repository.msgpart.Product2.mmProductQuantity, com.tools20022.repository.msgpart.Product2.mmUnitPrice, com.tools20022.repository.msgpart.Product2.mmProductAmount,
						com.tools20022.repository.msgpart.Product2.mmTaxType, com.tools20022.repository.msgpart.Product2.mmAdditionalProductInformation));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Product2";
				definition = "Product purchased to be paid.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max70Text getProductCode() {
		return productCode;
	}

	public Product2 setProductCode(Max70Text productCode) {
		this.productCode = Objects.requireNonNull(productCode);
		return this;
	}

	public Optional<UnitOfMeasure1Code> getUnitOfMeasure() {
		return Optional.ofNullable(unitOfMeasure);
	}

	public Product2 setUnitOfMeasure(UnitOfMeasure1Code unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
		return this;
	}

	public Optional<DecimalNumber> getProductQuantity() {
		return Optional.ofNullable(productQuantity);
	}

	public Product2 setProductQuantity(DecimalNumber productQuantity) {
		this.productQuantity = productQuantity;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getUnitPrice() {
		return Optional.ofNullable(unitPrice);
	}

	public Product2 setUnitPrice(ImpliedCurrencyAndAmount unitPrice) {
		this.unitPrice = unitPrice;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getProductAmount() {
		return Optional.ofNullable(productAmount);
	}

	public Product2 setProductAmount(ImpliedCurrencyAndAmount productAmount) {
		this.productAmount = productAmount;
		return this;
	}

	public Optional<Max35Text> getTaxType() {
		return Optional.ofNullable(taxType);
	}

	public Product2 setTaxType(Max35Text taxType) {
		this.taxType = taxType;
		return this;
	}

	public Optional<Max35Text> getAdditionalProductInformation() {
		return Optional.ofNullable(additionalProductInformation);
	}

	public Product2 setAdditionalProductInformation(Max35Text additionalProductInformation) {
		this.additionalProductInformation = additionalProductInformation;
		return this;
	}
}