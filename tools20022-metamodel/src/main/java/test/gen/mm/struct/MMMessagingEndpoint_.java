package test.gen.mm.struct;

import test.gen.mm.struct.MMModelEntity_;
import test.gen.mm.MMMessagingEndpoint;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessageTransportSystem;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMTransportMessage;
import java.util.List;
import test.gen.mm.MMAddress;

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