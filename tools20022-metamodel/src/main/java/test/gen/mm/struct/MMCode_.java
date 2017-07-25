package test.gen.mm.struct;

import test.gen.mm.struct.MMRepositoryConcept_;
import test.gen.mm.MMCode;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMCodeSet;

public interface MMCode_ extends MMRepositoryConcept_ {

	/**
	 * Provides the full, non-abbreviated name of the Code
	 */
	MetamodelAttribute<MMCode, Optional<String>> codeName = newAttribute();
	/**
	 * Direct reference to the CodeSet owning this Code.
	 */
	MetamodelAttribute<MMCode, MMCodeSet> owner = newAttribute();
}