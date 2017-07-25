package test.gen.mm.struct;

import test.gen.mm.struct.MMConstruct_;
import test.gen.mm.MMMessageConstruct;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMLogicalType;

public interface MMMessageConstruct_ extends MMConstruct_ {

	/**
	 * XML schema tag name for the element.
	 */
	MetamodelAttribute<MMMessageConstruct, Optional<String>> xmlTag = newAttribute();
	/**
	 * Direct reference to the type of a MessageElement or MessageBuildingBlock
	 */
	MetamodelAttribute<MMMessageConstruct, MMLogicalType> xmlMemberType = newAttribute();
}