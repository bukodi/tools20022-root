package test.gen.mm.struct;

import test.gen.mm.struct.MMModelEntity_;
import test.gen.mm.MMAddress;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMBroadcastList;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessagingEndpoint;

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