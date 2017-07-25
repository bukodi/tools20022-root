package test.gen.mm.struct;

import test.gen.mm.struct.MMModelEntity_;
import test.gen.mm.MMSyntax;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMEncoding;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageSet;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;

public interface MMSyntax_ extends MMModelEntity_ {

	/**
	 * the set of possible encodings for a given Syntax
	 */
	MetamodelAttribute<MMSyntax, List<MMEncoding>> possibleEncodings = newAttribute();
	/**
	 * the scheme in which a syntax is encoded
	 */
	MetamodelAttribute<MMSyntax, List<MMMessageSet>> generatedFor = newAttribute();
	/**
	 * the syntax that is valid for a MessageSet, based on the Encoding used
	 * generatedFor-&gt; asBag()=possibleEncodings.messageSet
	 */
	MetamodelConstraint<MMSyntax> checkGeneratedForDerivation = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}