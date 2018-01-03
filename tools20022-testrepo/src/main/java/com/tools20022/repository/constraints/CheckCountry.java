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

package com.tools20022.repository.constraints;

import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The code is checked against the list of country names obtained from the
 * United Nations (ISO 3166, Alpha-2 code).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Country"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The code is checked against the list of country names obtained from the United Nations (ISO 3166, Alpha-2 code)."
 * </li>
 * </ul>
 */
public class CheckCountry {

	final static private AtomicReference<MMConstraint> mmObject_lazy = new AtomicReference<>();

	final static public MMConstraint mmObject() {
		mmObject_lazy.compareAndSet(null, new MMConstraint() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Country";
				definition = "The code is checked against the list of country names obtained from the United Nations (ISO 3166, Alpha-2 code).";
			}
		});
		return mmObject_lazy.get();
	}
}