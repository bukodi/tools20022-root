package test.gen.mm.struct;

import test.gen.mm.struct.MMModelEntity_;
import test.gen.mm.MMDoclet;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMDoclet_ extends MMModelEntity_ {

	/**
	 * The type of doclet. The definition of the doclet type is left open so
	 * that new doclet types can be easily added without the need for a change
	 * to the meta-model.
	 */
	MetamodelAttribute<MMDoclet, Optional<String>> type = newAttribute();
	/**
	 * The content for the documentation.
	 */
	MetamodelAttribute<MMDoclet, Optional<String>> content = newAttribute();
}