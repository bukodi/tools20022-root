package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMModelEntity_;
import com.tools20022.metamodel.MMAddress;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMBroadcastList;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMessagingEndpoint;

public interface MMAddress_ extends MMModelEntity_ {

	/**
	 * a BroadCastList to which this Address belongs
	 */
	MetamodelAttribute<MMAddress, List<MMBroadcastList>> broadCastList = newAttribute();
	/**
	 * specifies the MessagingEndpoint for the Address
	 */
	MetamodelAttribute<MMAddress, MMMessagingEndpoint> endpoint = newAttribute();
}