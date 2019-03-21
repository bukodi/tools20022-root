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
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.GenericIdentification1;
import com.tools20022.repository.msgpart.PlainCardData1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Electronic money product that provides the cardholder with a portable and
 * specialised computer device, which typically contains a microprocessor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentCard4#mmPlainCardData
 * PaymentCard4.mmPlainCardData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentCard4#mmCardCountryCode
 * PaymentCard4.mmCardCountryCode}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.PaymentCard4#mmCardBrand
 * PaymentCard4.mmCardBrand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentCard4#mmAdditionalCardData
 * PaymentCard4.mmAdditionalCardData}</li>
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
 * "PaymentCard4"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentCard4", propOrder = {"plainCardData", "cardCountryCode", "cardBrand", "additionalCardData"})
public class PaymentCard4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlainCardData")
	protected PlainCardData1 plainCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.PlainCardData1
	 * PlainCardData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PaymentCard4 PaymentCard4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlainCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlainCardData"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentCard4, Optional<PlainCardData1>> mmPlainCardData = new MMMessageAssociationEnd<PaymentCard4, Optional<PlainCardData1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentCard4.mmObject());
			isDerived = false;
			xmlTag = "PlainCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlainCardData";
			definition = "Sensitive data associated with the card performing the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PlainCardData1.mmObject());
		}

		@Override
		public Optional<PlainCardData1> getValue(PaymentCard4 obj) {
			return obj.getPlainCardData();
		}

		@Override
		public void setValue(PaymentCard4 obj, Optional<PlainCardData1> value) {
			obj.setPlainCardData(value.orElse(null));
		}
	};
	@XmlElement(name = "CardCtryCd")
	protected Exact3NumericText cardCountryCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PaymentCard4 PaymentCard4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardCtryCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCountryCode"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard4, Optional<Exact3NumericText>> mmCardCountryCode = new MMMessageAttribute<PaymentCard4, Optional<Exact3NumericText>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentCard4.mmObject());
			isDerived = false;
			xmlTag = "CardCtryCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCountryCode";
			definition = "Country code assigned to the card by the card issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Exact3NumericText.mmObject());
		}

		@Override
		public Optional<Exact3NumericText> getValue(PaymentCard4 obj) {
			return obj.getCardCountryCode();
		}

		@Override
		public void setValue(PaymentCard4 obj, Optional<Exact3NumericText> value) {
			obj.setCardCountryCode(value.orElse(null));
		}
	};
	@XmlElement(name = "CardBrnd")
	protected GenericIdentification1 cardBrand;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msgpart.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PaymentCard4 PaymentCard4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardBrnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardBrand"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard4, Optional<GenericIdentification1>> mmCardBrand = new MMMessageAttribute<PaymentCard4, Optional<GenericIdentification1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentCard4.mmObject());
			isDerived = false;
			xmlTag = "CardBrnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardBrand";
			definition = "Brand name of the card.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = LazyReference.create(() -> GenericIdentification1.mmObject());
		}

		@Override
		public Optional<GenericIdentification1> getValue(PaymentCard4 obj) {
			return obj.getCardBrand();
		}

		@Override
		public void setValue(PaymentCard4 obj, Optional<GenericIdentification1> value) {
			obj.setCardBrand(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlCardData")
	protected Max70Text additionalCardData;
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
	 * {@linkplain com.tools20022.repository.msgpart.PaymentCard4 PaymentCard4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCardData"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard4, Optional<Max70Text>> mmAdditionalCardData = new MMMessageAttribute<PaymentCard4, Optional<Max70Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentCard4.mmObject());
			isDerived = false;
			xmlTag = "AddtlCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCardData";
			definition = "Additional card issuer specific data.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max70Text.mmObject());
		}

		@Override
		public Optional<Max70Text> getValue(PaymentCard4 obj) {
			return obj.getAdditionalCardData();
		}

		@Override
		public void setValue(PaymentCard4 obj, Optional<Max70Text> value) {
			obj.setAdditionalCardData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.PaymentCard4.mmPlainCardData, com.tools20022.repository.msgpart.PaymentCard4.mmCardCountryCode,
						com.tools20022.repository.msgpart.PaymentCard4.mmCardBrand, com.tools20022.repository.msgpart.PaymentCard4.mmAdditionalCardData));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCard4";
				definition = "Electronic money product that provides the cardholder with a portable and specialised computer device, which typically contains a microprocessor.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PlainCardData1> getPlainCardData() {
		return Optional.ofNullable(plainCardData);
	}

	public PaymentCard4 setPlainCardData(PlainCardData1 plainCardData) {
		this.plainCardData = plainCardData;
		return this;
	}

	public Optional<Exact3NumericText> getCardCountryCode() {
		return Optional.ofNullable(cardCountryCode);
	}

	public PaymentCard4 setCardCountryCode(Exact3NumericText cardCountryCode) {
		this.cardCountryCode = cardCountryCode;
		return this;
	}

	public Optional<GenericIdentification1> getCardBrand() {
		return Optional.ofNullable(cardBrand);
	}

	public PaymentCard4 setCardBrand(GenericIdentification1 cardBrand) {
		this.cardBrand = cardBrand;
		return this;
	}

	public Optional<Max70Text> getAdditionalCardData() {
		return Optional.ofNullable(additionalCardData);
	}

	public PaymentCard4 setAdditionalCardData(Max70Text additionalCardData) {
		this.additionalCardData = additionalCardData;
		return this;
	}
}