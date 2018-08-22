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

package com.tools20022.repository.constraint;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;

/**
 * The Currency Code must be registered, or have already been registered. Valid
 * active or historic currency codes are registered with the ISO 4217
 * Maintenance Agency, consist of three (3) contiguous letters, and may be or
 * not be withdrawn on the day the message containing the Currency is exchanged.
 */
public class ConstraintActiveOrHistoricCurrency {

	/**
	 * The Currency Code must be registered, or have already been registered.
	 * Valid active or historic currency codes are registered with the ISO 4217
	 * Maintenance Agency, consist of three (3) contiguous letters, and may be
	 * or not be withdrawn on the day the message containing the Currency is
	 * exchanged.
	 * 
	 * @see Object#class
	 */
	public static void checkActiveOrHistoricCurrencyCode(ActiveOrHistoricCurrencyCode obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}