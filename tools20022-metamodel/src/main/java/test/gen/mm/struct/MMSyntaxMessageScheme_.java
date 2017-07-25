package test.gen.mm.struct;

import test.gen.mm.struct.MMTopLevelCatalogueEntry_;
import test.gen.mm.MMSyntaxMessageScheme;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessageDefinition;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMSyntaxMessageScheme_ extends MMTopLevelCatalogueEntry_ {

	/**
	 * the MessageDefinitionTrace from the SyntaxMessageScheme to the
	 * MessageDefinition
	 */
	MetamodelAttribute<MMSyntaxMessageScheme, Optional<MMMessageDefinition>> messageDefinitionTrace = newAttribute();
}