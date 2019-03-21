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

package com.tools20022.repository.choice;

import com.tools20022.core.repo.LazyReference;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ExternalTaxAmountType1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the amount type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.TaxAmountType1Choice#mmCode
 * TaxAmountType1Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxAmountType1Choice#mmProprietary
 * TaxAmountType1Choice.mmProprietary}</li>
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
 * "TaxAmountType1Choice"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TaxAmountType1Choice", propOrder = {"code", "proprietary"})
public class TaxAmountType1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected ExternalTaxAmountType1Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalTaxAmountType1Code
	 * ExternalTaxAmountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TaxAmountType1Choice
	 * TaxAmountType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxAmountType1Choice, ExternalTaxAmountType1Code> mmCode = new MMMessageAttribute<TaxAmountType1Choice, ExternalTaxAmountType1Code>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.choice.TaxAmountType1Choice.mmObject());
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Specifies the amount type, in a coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ExternalTaxAmountType1Code.mmObject());
		}

		@Override
		public ExternalTaxAmountType1Code getValue(TaxAmountType1Choice obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(TaxAmountType1Choice obj, ExternalTaxAmountType1Code value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected Max35Text proprietary;
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
	 * {@linkplain com.tools20022.repository.choice.TaxAmountType1Choice
	 * TaxAmountType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxAmountType1Choice, Max35Text> mmProprietary = new MMMessageAttribute<TaxAmountType1Choice, Max35Text>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.choice.TaxAmountType1Choice.mmObject());
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Specifies the amount type, in a free-text form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Max35Text getValue(TaxAmountType1Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(TaxAmountType1Choice obj, Max35Text value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.choice.TaxAmountType1Choice.mmCode, com.tools20022.repository.choice.TaxAmountType1Choice.mmProprietary));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxAmountType1Choice";
				definition = "Specifies the amount type.";
			}
		});
		return mmObject_lazy.get();
	}

	public ExternalTaxAmountType1Code getCode() {
		return code;
	}

	public TaxAmountType1Choice setCode(ExternalTaxAmountType1Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public Max35Text getProprietary() {
		return proprietary;
	}

	public TaxAmountType1Choice setProprietary(Max35Text proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}