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

package com.tools20022.repository.datatype;

import com.tools20022.core.repo.LazyReference;
import com.tools20022.metamodel.MMAmount;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.constraint.ConstraintCurrencyAmount;
import com.tools20022.repository.GeneratedRepository;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * A number of monetary units specified in an active currency where the unit of
 * currency is explicit and compliant with ISO 4217.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMAmount#getCurrencyIdentifierSet
 * currencyIdentifierSet} =
 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
 * ActiveCurrencyCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMDecimal#getMinInclusive
 * minInclusive} = "0"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraints
 * constraints} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount#CurrencyAmount
 * ActiveCurrencyAndAmount.CurrencyAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExamples
 * examples} =
 * <ul>
 * <li>"6545.56"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ActiveCurrencyAndAmount"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType
public class ActiveCurrencyAndAmount {

	final static private AtomicReference<MMAmount> mmObject_lazy = new AtomicReference<>();
	@XmlValue
	protected BigDecimal amount;
	@XmlAttribute(name = "ccy", required = true)
	protected ActiveCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyAmount"</li>
	 * </ul>
	 */
	public static final MMConstraint<ActiveCurrencyAndAmount> CurrencyAmount = new MMConstraint<ActiveCurrencyAndAmount>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyAmount";
			definition = "The number of fractional digits (or minor unit of currency) must comply with ISO 4217.\nNote: The decimal separator is a dot.";
			owner_lazy = LazyReference.create(() -> ActiveCurrencyAndAmount.mmObject());
		}

		@Override
		public void executeValidator(ActiveCurrencyAndAmount obj) throws Exception {
			ConstraintCurrencyAmount.checkActiveCurrencyAndAmount(obj);
		}
	};

	final static public MMAmount mmObject() {
		mmObject_lazy.compareAndSet(null, new MMAmount() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("6545.56");
				constraints_lazy = LazyReference.create(() -> Arrays.asList(ActiveCurrencyAndAmount.CurrencyAmount));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActiveCurrencyAndAmount";
				definition = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.";
				currencyIdentifierSet_lazy = LazyReference.create(() -> ActiveCurrencyCode.mmObject());
				minInclusive = "0";
				totalDigits = 18;
				fractionDigits = 5;
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount() {
	}

	public ActiveCurrencyAndAmount(BigDecimal amount, ActiveCurrencyCode currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public void setAmountAndCurrency(BigDecimal amount, ActiveCurrencyCode currency) {
		this.amount = amount;
		this.currency = currency;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}