package test.gen.mm.struct;

import test.gen.mm.struct.MMRepositoryConcept_;
import test.gen.mm.MMXor;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessageElement;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageComponent;
import java.util.Optional;
import test.gen.mm.MMMessageBuildingBlock;
import test.gen.mm.MMMessageDefinition;

public interface MMXor_ extends MMRepositoryConcept_ {

	/**
	 * Message Elements impacted by the XOR.
	 */
	MetamodelAttribute<MMXor, List<MMMessageElement>> impactedElements = newAttribute();
	/**
	 * Message Component owning the XOR.
	 */
	MetamodelAttribute<MMXor, Optional<MMMessageComponent>> messageComponent = newAttribute();
	/**
	 * MessageBuildingBlocks impacted by the XOR.
	 */
	MetamodelAttribute<MMXor, List<MMMessageBuildingBlock>> impactedMessageBuildingBlocks = newAttribute();
	/**
	 * Message Definition owning the XOR.
	 */
	MetamodelAttribute<MMXor, Optional<MMMessageDefinition>> messageDefinition = newAttribute();
}