package test.gen.mm.struct;

import test.gen.mm.struct.MMTopLevelDictionaryEntry_;
import test.gen.mm.MMEndPointCategory;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessageElementContainer;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMEndPointCategory_ extends MMTopLevelDictionaryEntry_ {

	/**
	 * MessageComponents that are considered to be end points.
	 */
	MetamodelAttribute<MMEndPointCategory, List<MMMessageElementContainer>> endPoints = newAttribute();
}