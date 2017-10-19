package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMAddress;
import com.tools20022.metamodel.MMBroadcastList;
import com.tools20022.metamodel.struct.MMModelEntity_;
import java.util.List;

public interface MMBroadcastList_ extends MMModelEntity_ {

	/**
	 * a BroadCastList entry using an Address
	 */
	MetamodelAttribute<MMBroadcastList, List<MMAddress>> address = newAttribute();
}