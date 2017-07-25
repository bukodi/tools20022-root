package test.gen.mm.struct;

import test.gen.mm.struct.MMTopLevelCatalogueEntry_;
import test.gen.mm.MMBusinessArea;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageDefinition;
import java.util.List;

public interface MMBusinessArea_ extends MMTopLevelCatalogueEntry_ {

	/**
	 * The value of the BusinessArea code.
	 */
	MetamodelAttribute<MMBusinessArea, String> code = newAttribute();
	/**
	 * The MessageDefinition that belongs to the BusinessArea.
	 */
	MetamodelAttribute<MMBusinessArea, List<MMMessageDefinition>> messageDefinition = newAttribute();
}