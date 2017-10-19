package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMessageTransportSystem;
import com.tools20022.metamodel.MMMessagingEndpoint;
import com.tools20022.metamodel.struct.MMModelEntity_;
import java.util.List;

public interface MMMessageTransportSystem_ extends MMModelEntity_ {

	/**
	 * a MessagingEndpoint owned by a single MessageTransportSystem
	 */
	MetamodelAttribute<MMMessageTransportSystem, List<MMMessagingEndpoint>> endpoint = newAttribute();
}