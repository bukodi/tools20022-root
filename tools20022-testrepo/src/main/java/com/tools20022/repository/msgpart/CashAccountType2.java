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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.CashAccountType4Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Nature or use of the account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CashAccountType2#CodeOrProprietaryRule
 * CashAccountType2.CodeOrProprietaryRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgpart.CashAccountType2#mmCode
 * CashAccountType2.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CashAccountType2#mmProprietary
 * CashAccountType2.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountType2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Nature or use of the account."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashAccountType2", propOrder = {"code", "proprietary"})
public class CashAccountType2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected CashAccountType4Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CashAccountType2
	 * CashAccountType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account type, in a coded form."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountType2, CashAccountType4Code> mmCode = new MMMessageAttribute<CashAccountType2, CashAccountType4Code>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashAccountType2.mmObject());
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Account type, in a coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> CashAccountType4Code.mmObject());
		}

		@Override
		public CashAccountType4Code getValue(CashAccountType2 obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(CashAccountType2 obj, CashAccountType4Code value) {
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
	 * {@linkplain com.tools20022.repository.msgpart.CashAccountType2
	 * CashAccountType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature or use of the account in a proprietary form."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountType2, Max35Text> mmProprietary = new MMMessageAttribute<CashAccountType2, Max35Text>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashAccountType2.mmObject());
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Nature or use of the account in a proprietary form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Max35Text getValue(CashAccountType2 obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(CashAccountType2 obj, Max35Text value) {
			obj.setProprietary(value);
		}
	};
	/**
	 * Either Code or Proprietary must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msgpart.CashAccountType2
	 * CashAccountType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.CashAccountType2#mmCode
	 * CashAccountType2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgpart.CashAccountType2#mmProprietary
	 * CashAccountType2.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CodeOrProprietaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either Code or Proprietary must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor CodeOrProprietaryRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CodeOrProprietaryRule";
			definition = "Either Code or Proprietary must be present, but not both.";
			messageComponent_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashAccountType2.mmObject());
			impactedElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.CashAccountType2.mmCode, com.tools20022.repository.msgpart.CashAccountType2.mmProprietary));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.CashAccountType2.mmCode, com.tools20022.repository.msgpart.CashAccountType2.mmProprietary));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CashAccountType2";
				definition = "Nature or use of the account.";
				xors_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.CashAccountType2.CodeOrProprietaryRule));
			}
		});
		return mmObject_lazy.get();
	}

	public CashAccountType4Code getCode() {
		return code;
	}

	public CashAccountType2 setCode(CashAccountType4Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public Max35Text getProprietary() {
		return proprietary;
	}

	public CashAccountType2 setProprietary(Max35Text proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}