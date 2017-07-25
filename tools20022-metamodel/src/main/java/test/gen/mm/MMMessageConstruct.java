package test.gen.mm;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMConstruct;
import java.util.Optional;
import test.gen.mm.MMLogicalType;

/**
 * Abstract layer : Abstract meta class for representing a MessageElement or a
 * MessageBuildingBlock
 */
public interface MMMessageConstruct extends MMConstruct {

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