package test.gen.mm.struct;

import test.gen.mm.struct.MMModelEntity_;
import test.gen.mm.MMBroadcastList;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMAddress;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMBroadcastList_ extends MMModelEntity_ {

	/**
	 * a BroadCastList entry using an Address
	 */
	MetamodelAttribute<MMBroadcastList, List<MMAddress>> address = newAttribute();
}