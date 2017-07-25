package test.gen.mm.struct;

import test.gen.mm.struct.MMDecimal_;
import test.gen.mm.MMRate;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import java.util.Optional;

public interface MMRate_ extends MMDecimal_ {

	/**
	 * specifies the ratio between the base value and the actual value
	 */
	MetamodelAttribute<MMRate, Double> baseValue = newAttribute();
	/**
	 * specifies unit code required to qualify this rate
	 */
	MetamodelAttribute<MMRate, Optional<String>> baseUnitCode = newAttribute();
}