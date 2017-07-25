package test.gen.mm.struct;

import test.gen.mm.struct.MMMessageComponentType_;
import test.gen.mm.MMExternalSchema;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMProcessContent;

public interface MMExternalSchema_ extends MMMessageComponentType_ {

	/**
	 * Identifies the description of the content model of an ExternalSchema,
	 * through (a set of) URI.
	 */
	MetamodelAttribute<MMExternalSchema, List<String>> namespaceList = newAttribute();
	/**
	 * Specifies whether it is required for the content model of the
	 * ExternalSchema to be validated.
	 */
	MetamodelAttribute<MMExternalSchema, MMProcessContent> processContent = newAttribute();
}