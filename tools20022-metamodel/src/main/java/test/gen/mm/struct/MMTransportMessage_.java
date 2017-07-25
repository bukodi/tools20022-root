package test.gen.mm.struct;

import test.gen.mm.struct.MMModelEntity_;
import test.gen.mm.MMTransportMessage;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessagingEndpoint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageInstance;
import java.util.List;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;

public interface MMTransportMessage_ extends MMModelEntity_ {

	/**
	 * the sending MessagingEndpoint of a TransportMessage
	 */
	MetamodelAttribute<MMTransportMessage, MMMessagingEndpoint> sender = newAttribute();
	/**
	 * the MessageInstance that is part of the TransportMessage
	 */
	MetamodelAttribute<MMTransportMessage, MMMessageInstance> messageInstance = newAttribute();
	/**
	 * the receiving MessagingEndpoint in a TransportMessage
	 */
	MetamodelAttribute<MMTransportMessage, List<MMMessagingEndpoint>> receiver = newAttribute();
	/**
	 * The sender and receiver of a TransportMessage must use the same
	 * MessageTransportSystem receiver-&gt;asBag().transportSystem =
	 * sender.transportSystem-&gt;asBag()
	 */
	MetamodelConstraint<MMTransportMessage> checksameMessageTransportSystem = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}