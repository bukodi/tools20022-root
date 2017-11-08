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

package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.metamodel.struct.MMLogicalType_;
import com.tools20022.metamodel.struct.MMMessageConcept_;
import com.tools20022.metamodel.struct.MMTopLevelDictionaryEntry_;
import java.util.List;
import java.util.Optional;

public interface MMMessageComponentType_ extends MMTopLevelDictionaryEntry_, MMLogicalType_, MMMessageConcept_ {

	/**
	 * The MessageBuildingBlock that is the context for this
	 * MessageComponentType
	 */
	MetamodelAttribute<MMMessageComponentType, List<MMMessageBuildingBlock>> messageBuildingBlock = newAttribute();
	/**
	 * A property indicating the absense of a semantic relationship to a
	 * BusinessComponent, i.e. it is not derived from a BusinessComponent
	 */
	MetamodelAttribute<MMMessageComponentType, Boolean> isTechnical = newAttribute();
	/**
	 * The BusinessComponent that this MessageComponentType is derived from.
	 */
	MetamodelAttribute<MMMessageComponentType, Optional<MMBusinessComponent>> trace = newAttribute();
}