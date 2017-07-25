package test.gen.mm.struct;

import test.gen.mm.struct.MMTopLevelDictionaryEntry_;
import test.gen.mm.struct.MMLogicalType_;
import test.gen.mm.struct.MMMessageConcept_;
import test.gen.mm.MMMessageComponentType;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessageBuildingBlock;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMBusinessComponent;
import java.util.Optional;

public interface MMMessageComponentType_
		extends
			MMTopLevelDictionaryEntry_,
			MMLogicalType_,
			MMMessageConcept_ {

	/**
	 * The MessageBuildingBlock that is the context for this
	 * MessageComponentType
	 */
	MetamodelAttribute<MMMessageComponentType, List<MMMessageBuildingBlock>> messageBuildingBlock = newAttribute();
	/**
	 * A property indicating the absense of a semantic relationship to a
	 * BusinessComponent, i.e. it is not derived from a BusinessComponent
	 */
	MetamodelAttribute<MMMessageComponentType, Boolean> isTechnical = newAttribute();
	/**
	 * The BusinessComponent that this MessageComponentType is derived from.
	 */
	MetamodelAttribute<MMMessageComponentType, Optional<MMBusinessComponent>> trace = newAttribute();
}