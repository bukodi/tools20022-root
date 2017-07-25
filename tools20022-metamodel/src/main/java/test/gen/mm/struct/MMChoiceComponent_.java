package test.gen.mm.struct;

import test.gen.mm.struct.MMMessageElementContainer_;
import test.gen.mm.MMChoiceComponent;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;

public interface MMChoiceComponent_ extends MMMessageElementContainer_ {

	/**
	 * A MessageComponent or ChoiceComponent must have at least one
	 * MessageElement messageElement-&gt;notEmpty( )
	 */
	MetamodelConstraint<MMChoiceComponent> checkAtLeastOneProperty = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}