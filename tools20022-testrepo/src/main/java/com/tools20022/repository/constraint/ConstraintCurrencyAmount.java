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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;

/**
 * The number of fractional digits (or minor unit of currency) must comply with
 * ISO 4217. Note: The decimal separator is a dot.
 */
public class ConstraintCurrencyAmount {

	/**
	 * The number of fractional digits (or minor unit of currency) must comply
	 * with ISO 4217. Note: The decimal separator is a dot.
	 * 
	 * @see Object#class
	 */
	public static void checkActiveOrHistoricCurrencyAndAmount(ActiveOrHistoricCurrencyAndAmount obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The number of fractional digits (or minor unit of currency) must comply
	 * with ISO 4217. Note: The decimal separator is a dot.
	 * 
	 * @see Object#class
	 */
	public static void checkActiveCurrencyAndAmount(ActiveCurrencyAndAmount obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}