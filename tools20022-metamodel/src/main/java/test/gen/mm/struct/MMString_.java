package test.gen.mm.struct;

import test.gen.mm.struct.MMDataType_;
import test.gen.mm.MMString;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMString_ extends MMDataType_ {

	/**
	 * The minimum number of units of characters.
	 */
	MetamodelAttribute<MMString, Optional<Integer>> minLength = newAttribute();
	/**
	 * The number of units of characters.
	 */
	MetamodelAttribute<MMString, Optional<Integer>> maxLength = newAttribute();
	/**
	 * The number of units of characters.
	 */
	MetamodelAttribute<MMString, Optional<Integer>> length = newAttribute();
	/**
	 * A constraint on the value space of a datatype which is achieved by
	 * constraining the lexical space to literals which match a specific
	 * pattern.
	 */
	MetamodelAttribute<MMString, Optional<String>> pattern = newAttribute();
}