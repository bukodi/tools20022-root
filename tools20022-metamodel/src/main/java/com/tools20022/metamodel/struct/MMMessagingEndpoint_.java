package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMAddress;
import com.tools20022.metamodel.MMMessageTransportSystem;
import com.tools20022.metamodel.MMMessagingEndpoint;
import com.tools20022.metamodel.MMTransportMessage;
import com.tools20022.metamodel.struct.MMModelEntity_;
import java.util.List;

public interface MMMessagingEndpoint_ extends MMModelEntity_ {

	/**
	 * the MessageTransportSystem that owns and uses this MessagingEndpoint
	 */
	MetamodelAttribute<MMMessagingEndpoint, MMMessageTransportSystem> transportSystem = newAttribute();
	/**
	 * the TransportMessage that is received by the receiving MessagingEndpoint
	 */
	MetamodelAttribute<MMMessagingEndpoint, List<MMTransportMessage>> receivedMessage = newAttribute();
	/**
	 * the TransportMessage that is sent by the sending MessagingEndpoint
	 */
	MetamodelAttribute<MMMessagingEndpoint, List<MMTransportMessage>> sentMessage = newAttribute();
	/**
	 * an Address used to identify the MessagingEndpoint
	 */
	MetamodelAttribute<MMMessagingEndpoint, List<MMAddress>> location = newAttribute();
}