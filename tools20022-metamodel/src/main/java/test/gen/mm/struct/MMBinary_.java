package test.gen.mm.struct;

import test.gen.mm.struct.MMDataType_;
import test.gen.mm.MMBinary;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMBinary_ extends MMDataType_ {

	/**
	 * the minimum number of units of characters
	 */
	MetamodelAttribute<MMBinary, Optional<Integer>> minLength = newAttribute();
	/**
	 * the maximum number of units of characters
	 */
	MetamodelAttribute<MMBinary, Optional<Integer>> maxLength = newAttribute();
	/**
	 * the number of units of characters
	 */
	MetamodelAttribute<MMBinary, Optional<Integer>> length = newAttribute();
	/**
	 * A constraint on the value space of a datatype which is achieved by
	 * constraining the lexical space to literals which match a specific
	 * pattern.
	 */
	MetamodelAttribute<MMBinary, Optional<String>> pattern = newAttribute();
}