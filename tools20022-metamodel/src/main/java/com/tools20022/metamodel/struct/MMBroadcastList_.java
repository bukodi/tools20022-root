package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMModelEntity_;
import com.tools20022.metamodel.MMBroadcastList;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMAddress;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMBroadcastList_ extends MMModelEntity_ {

	/**
	 * a BroadCastList entry using an Address
	 */
	MetamodelAttribute<MMBroadcastList, List<MMAddress>> address = newAttribute();
}