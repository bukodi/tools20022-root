package test.gen.mm.struct;

import test.gen.mm.struct.MMTopLevelCatalogueEntry_;
import test.gen.mm.MMMessageSet;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMSyntax;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMEncoding;
import test.gen.mm.MMMessageDefinition;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;

public interface MMMessageSet_ extends MMTopLevelCatalogueEntry_ {

	/**
	 * identification of the syntax for a specific EncodingScheme
	 */
	MetamodelAttribute<MMMessageSet, List<MMSyntax>> generatedSyntax = newAttribute();
	/**
	 * the set of encodings considered ISO 20022 valid for this MessageSet
	 */
	MetamodelAttribute<MMMessageSet, List<MMEncoding>> validEncoding = newAttribute();
	/**
	 * the MessageDefinition that belongs to the MessageSet
	 */
	MetamodelAttribute<MMMessageSet, List<MMMessageDefinition>> messageDefinition = newAttribute();
	/**
	 * the generated syntax is derived from the syntax for a validEncoding
	 * generatedSyntax-&gt;asBag() = validEncoding.syntax
	 */
	MetamodelConstraint<MMMessageSet> checkGeneratedSyntaxDerivation = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}