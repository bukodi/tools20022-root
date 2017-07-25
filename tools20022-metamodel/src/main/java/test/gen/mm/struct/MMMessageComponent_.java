package test.gen.mm.struct;

import test.gen.mm.struct.MMMessageElementContainer_;
import test.gen.mm.MMMessageComponent;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMXor;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMMessageComponent_ extends MMMessageElementContainer_ {

	/**
	 * XORs applied to a selection of the elements of the Message Component.
	 */
	MetamodelAttribute<MMMessageComponent, List<MMXor>> xors = newAttribute();
}