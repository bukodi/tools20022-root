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
import com.tools20022.repository.area.camt.BankToCustomerStatementV07;
import com.tools20022.repository.msgpart.SupplementaryData1;

/**
 * The SupplementaryData building block at message level must not be used to
 * provide additional information about a transaction. The SupplementaryData
 * element at transaction level should be used for that purpose.
 */
public class ConstraintSupplementaryDataRule {

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 * 
	 * @see Object#class
	 */
	public static void checkBankToCustomerStatementV07(BankToCustomerStatementV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * This component may not be used without the explicit approval of a SEG and
	 * submission to the RA of ISO 20022 compliant structure(s) to be used in
	 * the Envelope element.
	 * 
	 * @see Object#class
	 */
	public static void checkSupplementaryData1(SupplementaryData1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}