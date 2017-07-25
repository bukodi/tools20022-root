package test.gen.mm.struct;

import test.gen.mm.struct.MMBoolean_;
import test.gen.mm.MMIndicator;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMIndicator_ extends MMBoolean_ {

	/**
	 * Provides the semantic meaning when the Indicator is set to true.
	 */
	MetamodelAttribute<MMIndicator, String> meaningWhenTrue = newAttribute();
	/**
	 * Provides the semantic meaning when the Indicator is set to false.
	 */
	MetamodelAttribute<MMIndicator, String> meaningWhenFalse = newAttribute();
}