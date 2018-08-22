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
import com.tools20022.repository.msgpart.SettlementInformation13;

/**
 * If SettlementMethod is equal to CLRG, then SettlementAccount and
 * ReimbursementAgent(s) are not allowed.
 */
public class ConstraintSettlementMethodClearingRule {

	/**
	 * If SettlementMethod is equal to CLRG, then SettlementAccount and
	 * ReimbursementAgent(s) are not allowed.
	 * 
	 * @see Object#class
	 */
	public static void checkSettlementInformation13(SettlementInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}