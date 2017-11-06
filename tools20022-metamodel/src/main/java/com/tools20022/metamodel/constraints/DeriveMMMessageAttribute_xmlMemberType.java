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

package com.tools20022.metamodel.constraints;

import java.util.function.Function;

import com.tools20022.metamodel.MMLogicalType;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.struct.MMMessageAttribute_;

/**
 * Calculate derived attribute {@link MMMessageAttribute#getXmlMemberType()}
 * 
 * @see MMMessageAttribute_#checkMessageAttributeHasExactlyOneType
 */
public class DeriveMMMessageAttribute_xmlMemberType implements Function<MMMessageAttribute, MMLogicalType> {

	/**
	 * Direct reference to the type of a MessageElement or MessageBuildingBlock
	 */
	@Override
	public MMLogicalType apply(MMMessageAttribute mmBean) {
		if (mmBean.getSimpleType().isPresent())
			return mmBean.getSimpleType().get();
		else if (mmBean.getComplexType().isPresent())
			return mmBean.getComplexType().get();
		else
			throw new RuntimeException(
					"A MessageAttribute must have exactly one of the following: simpleType or complexType.");
	}
}