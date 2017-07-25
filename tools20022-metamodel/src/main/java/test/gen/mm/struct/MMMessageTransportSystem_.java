package test.gen.mm.struct;

import test.gen.mm.struct.MMModelEntity_;
import test.gen.mm.MMMessageTransportSystem;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessagingEndpoint;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMMessageTransportSystem_ extends MMModelEntity_ {

	/**
	 * a MessagingEndpoint owned by a single MessageTransportSystem
	 */
	MetamodelAttribute<MMMessageTransportSystem, List<MMMessagingEndpoint>> endpoint = newAttribute();
}