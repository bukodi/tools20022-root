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
import com.tools20022.metamodel.MMIndicator;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Indicates whether charges have already been included.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMIndicator#getMeaningWhenTrue
 * meaningWhenTrue} = "Included "</li>
 * <li>{@linkplain com.tools20022.metamodel.MMIndicator#getMeaningWhenFalse
 * meaningWhenFalse} = "Pre-advised"</li>
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
 * "ChargeIncludedIndicator"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType
public class ChargeIncludedIndicator {

	final static private AtomicReference<MMIndicator> mmObject_lazy = new AtomicReference<>();
	@XmlValue
	protected Boolean value;

	final static public MMIndicator mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIndicator() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeIncludedIndicator";
				definition = "Indicates whether charges have already been included.";
				meaningWhenTrue = "Included ";
				meaningWhenFalse = "Pre-advised";
			}
		});
		return mmObject_lazy.get();
	}

	public ChargeIncludedIndicator() {
	}

	public ChargeIncludedIndicator(Boolean value) {
		this.value = value;
	}

	public Boolean getValue() {
		return value;
	}

	public void setValue(Boolean value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value == null ? null : value.toString();
	}
}