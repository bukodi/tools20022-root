package test.gen.mm.struct;

import test.gen.mm.struct.MMDecimal_;
import test.gen.mm.MMAmount;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMDataType;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMAmount_ extends MMDecimal_ {

	/**
	 * specifies the allowed currencies that can be used to qualify this amount
	 */
	MetamodelAttribute<MMAmount, Optional<MMDataType>> currencyIdentifierSet = newAttribute();
}