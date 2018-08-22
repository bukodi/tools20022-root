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
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMIdentifierSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.constraint.ConstraintIBAN;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * An identifier used internationally by financial institutions to uniquely
 * identify the account of a customer at a financial institution, as described
 * in the latest edition of the international standard ISO 13616:2007 -
 * "Banking and related financial services - International Bank Account Number (IBAN)"
 * .
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMIdentifierSet#getIdentificationScheme
 * identificationScheme} =
 * "National Banking Association; International Bank Account Number (ISO 13616)"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMString#getPattern pattern} =
 * "[A-Z]{2,2}[0-9]{2,2}[a-zA-Z0-9]{1,30}"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.datatype.IBAN2007Identifier#IBAN
 * IBAN2007Identifier.IBAN}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AT611904300234573201"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IBAN2007Identifier"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An identifier used internationally by financial institutions to uniquely identify the account of a customer at a financial institution, as described in the latest edition of the international standard ISO 13616:2007 - \"Banking and related financial services - International Bank Account Number (IBAN)\"."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType
public class IBAN2007Identifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();
	@XmlValue
	protected String value;
	/**
	 * A valid IBAN consists of all three of the following components: Country
	 * Code, check digits and BBAN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.datatype.IBAN2007Identifier
	 * IBAN2007Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A valid IBAN consists of all three of the following components: Country Code, check digits and BBAN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IBAN2007Identifier> IBAN = new MMConstraint<IBAN2007Identifier>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IBAN";
			definition = "A valid IBAN consists of all three of the following components: Country Code, check digits and BBAN.";
			owner_lazy = LazyReference.create(() -> IBAN2007Identifier.mmObject());
		}

		@Override
		public void executeValidator(IBAN2007Identifier obj) throws Exception {
			ConstraintIBAN.checkIBAN2007Identifier(obj);
		}
	};

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				example = Arrays.asList("AT611904300234573201");
				constraint_lazy = LazyReference.create(() -> Arrays.asList(IBAN2007Identifier.IBAN));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IBAN2007Identifier";
				definition = "An identifier used internationally by financial institutions to uniquely identify the account of a customer at a financial institution, as described in the latest edition of the international standard ISO 13616:2007 - \"Banking and related financial services - International Bank Account Number (IBAN)\".";
				identificationScheme = "National Banking Association; International Bank Account Number (ISO 13616)";
				pattern = "[A-Z]{2,2}[0-9]{2,2}[a-zA-Z0-9]{1,30}";
			}
		});
		return mmObject_lazy.get();
	}

	public IBAN2007Identifier() {
	}

	public IBAN2007Identifier(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value == null ? null : value.toString();
	}
}