package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMEndPointCategory;
import com.tools20022.metamodel.MMMessageElementContainer;
import com.tools20022.metamodel.struct.MMTopLevelDictionaryEntry_;
import java.util.List;

public interface MMEndPointCategory_ extends MMTopLevelDictionaryEntry_ {

	/**
	 * MessageComponents that are considered to be end points.
	 */
	MetamodelAttribute<MMEndPointCategory, List<MMMessageElementContainer>> endPoints = newAttribute();
}