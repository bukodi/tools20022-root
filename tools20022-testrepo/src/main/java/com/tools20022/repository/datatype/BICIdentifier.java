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
import com.tools20022.repository.constraint.ConstraintBIC;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Code allocated to a financial institution by the ISO 9362 Registration
 * Authority as described in ISO 9362
 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
 * .
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMIdentifierSet#getIdentificationScheme
 * identificationScheme} = "SWIFT; BICIdentifier"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMString#getPattern pattern} =
 * "[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.datatype.BICIdentifier#BIC
 * BICIdentifier.BIC}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CHASUS33"</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BICIdentifier"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType
public class BICIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();
	@XmlValue
	protected String value;
	/**
	 * Valid BICs for financial institutions are registered by the ISO 9362
	 * Registration Authority in the BIC directory, and consist of eight (8) or
	 * eleven (11) contiguous characters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valid BICs for financial institutions are registered by the ISO 9362 Registration Authority in the BIC directory, and consist of eight (8) or eleven (11) contiguous characters."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BICIdentifier> BIC = new MMConstraint<BICIdentifier>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BIC";
			definition = "Valid BICs for financial institutions are registered by the ISO 9362 Registration Authority in the BIC directory, and consist of eight (8) or eleven (11) contiguous characters.";
			owner_lazy = LazyReference.create(() -> BICIdentifier.mmObject());
		}

		@Override
		public void executeValidator(BICIdentifier obj) throws Exception {
			ConstraintBIC.checkBICIdentifier(obj);
		}
	};

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				example = Arrays.asList("CHASUS33");
				constraint_lazy = LazyReference.create(() -> Arrays.asList(BICIdentifier.BIC));
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "BICIdentifier";
				definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
				identificationScheme = "SWIFT; BICIdentifier";
				pattern = "[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}";
			}
		});
		return mmObject_lazy.get();
	}

	public BICIdentifier() {
	}

	public BICIdentifier(String value) {
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