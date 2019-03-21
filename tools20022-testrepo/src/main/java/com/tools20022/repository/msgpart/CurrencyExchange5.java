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
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
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
 * Set of elements used to provide details of the currency exchange.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CurrencyExchange5#mmSourceCurrency
 * CurrencyExchange5.mmSourceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CurrencyExchange5#mmTargetCurrency
 * CurrencyExchange5.mmTargetCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CurrencyExchange5#mmUnitCurrency
 * CurrencyExchange5.mmUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CurrencyExchange5#mmExchangeRate
 * CurrencyExchange5.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CurrencyExchange5#mmContractIdentification
 * CurrencyExchange5.mmContractIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CurrencyExchange5#mmQuotationDate
 * CurrencyExchange5.mmQuotationDate}</li>
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
 * "CurrencyExchange5"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyExchange5", propOrder = {"sourceCurrency", "targetCurrency", "unitCurrency", "exchangeRate", "contractIdentification", "quotationDate"})
public class CurrencyExchange5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SrcCcy", required = true)
	protected ActiveOrHistoricCurrencyCode sourceCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CurrencyExchange5
	 * CurrencyExchange5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceCurrency"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyExchange5, ActiveOrHistoricCurrencyCode> mmSourceCurrency = new MMMessageAttribute<CurrencyExchange5, ActiveOrHistoricCurrencyCode>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CurrencyExchange5.mmObject());
			isDerived = false;
			xmlTag = "SrcCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceCurrency";
			definition = "Currency from which an amount is to be converted in a currency conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyCode.mmObject());
		}

		@Override
		public ActiveOrHistoricCurrencyCode getValue(CurrencyExchange5 obj) {
			return obj.getSourceCurrency();
		}

		@Override
		public void setValue(CurrencyExchange5 obj, ActiveOrHistoricCurrencyCode value) {
			obj.setSourceCurrency(value);
		}
	};
	@XmlElement(name = "TrgtCcy")
	protected ActiveOrHistoricCurrencyCode targetCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CurrencyExchange5
	 * CurrencyExchange5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetCurrency"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyExchange5, Optional<ActiveOrHistoricCurrencyCode>> mmTargetCurrency = new MMMessageAttribute<CurrencyExchange5, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CurrencyExchange5.mmObject());
			isDerived = false;
			xmlTag = "TrgtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetCurrency";
			definition = "Currency into which an amount is to be converted in a currency conversion.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyCode.mmObject());
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(CurrencyExchange5 obj) {
			return obj.getTargetCurrency();
		}

		@Override
		public void setValue(CurrencyExchange5 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setTargetCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitCcy")
	protected ActiveOrHistoricCurrencyCode unitCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CurrencyExchange5
	 * CurrencyExchange5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitCurrency"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyExchange5, Optional<ActiveOrHistoricCurrencyCode>> mmUnitCurrency = new MMMessageAttribute<CurrencyExchange5, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CurrencyExchange5.mmObject());
			isDerived = false;
			xmlTag = "UnitCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyCode.mmObject());
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(CurrencyExchange5 obj) {
			return obj.getUnitCurrency();
		}

		@Override
		public void setValue(CurrencyExchange5 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setUnitCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "XchgRate", required = true)
	protected BaseOneRate exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CurrencyExchange5
	 * CurrencyExchange5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkups
	 * semanticMarkups} = ISO15022Synonym: :92A::EXCH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyExchange5, BaseOneRate> mmExchangeRate = new MMMessageAttribute<CurrencyExchange5, BaseOneRate>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CurrencyExchange5.mmObject());
			isDerived = false;
			xmlTag = "XchgRate";
			semanticMarkups_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::EXCH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency.\n\nUsage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> BaseOneRate.mmObject());
		}

		@Override
		public BaseOneRate getValue(CurrencyExchange5 obj) {
			return obj.getExchangeRate();
		}

		@Override
		public void setValue(CurrencyExchange5 obj, BaseOneRate value) {
			obj.setExchangeRate(value);
		}
	};
	@XmlElement(name = "CtrctId")
	protected Max35Text contractIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.CurrencyExchange5
	 * CurrencyExchange5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyExchange5, Optional<Max35Text>> mmContractIdentification = new MMMessageAttribute<CurrencyExchange5, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CurrencyExchange5.mmObject());
			isDerived = false;
			xmlTag = "CtrctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractIdentification";
			definition = "Unique identification to unambiguously identify the foreign exchange contract.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(CurrencyExchange5 obj) {
			return obj.getContractIdentification();
		}

		@Override
		public void setValue(CurrencyExchange5 obj, Optional<Max35Text> value) {
			obj.setContractIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "QtnDt")
	protected ISODateTime quotationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CurrencyExchange5
	 * CurrencyExchange5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDate"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyExchange5, Optional<ISODateTime>> mmQuotationDate = new MMMessageAttribute<CurrencyExchange5, Optional<ISODateTime>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CurrencyExchange5.mmObject());
			isDerived = false;
			xmlTag = "QtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationDate";
			definition = "Date and time at which an exchange rate is quoted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISODateTime.mmObject());
		}

		@Override
		public Optional<ISODateTime> getValue(CurrencyExchange5 obj) {
			return obj.getQuotationDate();
		}

		@Override
		public void setValue(CurrencyExchange5 obj, Optional<ISODateTime> value) {
			obj.setQuotationDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.CurrencyExchange5.mmSourceCurrency, com.tools20022.repository.msgpart.CurrencyExchange5.mmTargetCurrency,
						com.tools20022.repository.msgpart.CurrencyExchange5.mmUnitCurrency, com.tools20022.repository.msgpart.CurrencyExchange5.mmExchangeRate, com.tools20022.repository.msgpart.CurrencyExchange5.mmContractIdentification,
						com.tools20022.repository.msgpart.CurrencyExchange5.mmQuotationDate));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyExchange5";
				definition = "Set of elements used to provide details of the currency exchange.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyCode getSourceCurrency() {
		return sourceCurrency;
	}

	public CurrencyExchange5 setSourceCurrency(ActiveOrHistoricCurrencyCode sourceCurrency) {
		this.sourceCurrency = Objects.requireNonNull(sourceCurrency);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getTargetCurrency() {
		return Optional.ofNullable(targetCurrency);
	}

	public CurrencyExchange5 setTargetCurrency(ActiveOrHistoricCurrencyCode targetCurrency) {
		this.targetCurrency = targetCurrency;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getUnitCurrency() {
		return Optional.ofNullable(unitCurrency);
	}

	public CurrencyExchange5 setUnitCurrency(ActiveOrHistoricCurrencyCode unitCurrency) {
		this.unitCurrency = unitCurrency;
		return this;
	}

	public BaseOneRate getExchangeRate() {
		return exchangeRate;
	}

	public CurrencyExchange5 setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = Objects.requireNonNull(exchangeRate);
		return this;
	}

	public Optional<Max35Text> getContractIdentification() {
		return Optional.ofNullable(contractIdentification);
	}

	public CurrencyExchange5 setContractIdentification(Max35Text contractIdentification) {
		this.contractIdentification = contractIdentification;
		return this;
	}

	public Optional<ISODateTime> getQuotationDate() {
		return Optional.ofNullable(quotationDate);
	}

	public CurrencyExchange5 setQuotationDate(ISODateTime quotationDate) {
		this.quotationDate = quotationDate;
		return this;
	}
}