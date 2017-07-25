package test.gen.mm.struct;

import test.gen.mm.struct.MMTopLevelCatalogueEntry_;
import test.gen.mm.MMMessageChoreography;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMBusinessTransaction;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageDefinition;
import java.util.List;

public interface MMMessageChoreography_ extends MMTopLevelCatalogueEntry_ {

	/**
	 * the BusinessTransactionTrace from the MessageChoreography to the
	 * BusinessTransaction
	 */
	MetamodelAttribute<MMMessageChoreography, Optional<MMBusinessTransaction>> businessTransactionTrace = newAttribute();
	/**
	 * The MessageDefinition that is used in a MessageChoreography.
	 */
	MetamodelAttribute<MMMessageChoreography, List<MMMessageDefinition>> messageDefinition = newAttribute();
}