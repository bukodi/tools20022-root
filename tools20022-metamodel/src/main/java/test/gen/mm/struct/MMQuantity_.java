package test.gen.mm.struct;

import test.gen.mm.struct.MMDecimal_;
import test.gen.mm.MMQuantity;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMQuantity_ extends MMDecimal_ {

	/**
	 * qualifies the value of a Quantity
	 */
	MetamodelAttribute<MMQuantity, Optional<String>> unitCode = newAttribute();
}