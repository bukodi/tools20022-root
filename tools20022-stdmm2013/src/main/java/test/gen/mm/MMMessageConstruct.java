package test.gen.mm;

import test.gen.mm.MMConstruct;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMLogicalType;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;

/**
 * Abstract layer : Abstract meta class for representing a MessageElement or a
 * MessageBuildingBlock
 */
public interface MMMessageConstruct extends MMConstruct {

	public static interface Members extends MMConstruct.Members {
		/**
		 * XML schema tag name for the element.
		 */
		MetamodelAttribute<MMMessageConstruct, Optional<String>> xmlTag = newAttribute();
		/**
		 * Direct reference to the type of a MessageElement or
		 * MessageBuildingBlock
		 */
		MetamodelAttribute<MMMessageConstruct, MMLogicalType> xmlMemberType = newAttribute();
	}

	public static MetamodelType<MMMessageConstruct> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageConstruct.class);
	}

	/**
	 * XML schema tag name for the element.
	 */
	Optional<String> getXmlTag();

	/**
	 * Direct reference to the type of a MessageElement or MessageBuildingBlock
	 */
	MMLogicalType getXmlMemberType();
}