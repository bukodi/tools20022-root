package test.gen.mm.struct;

import test.gen.mm.struct.MMMessageComponentType_;
import test.gen.mm.MMMessageElementContainer;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessageElement;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;

public interface MMMessageElementContainer_ extends MMMessageComponentType_ {

	/**
	 * a semantic property of a MessageComponentType
	 */
	MetamodelAttribute<MMMessageElementContainer, List<MMMessageElement>> messageElement = newAttribute();
	/**
	 * All MessageElements contained in this MessageComponentContainer must have
	 * different names. messageElement-&gt;forAll(el1,el2 | el1 &lt;&gt; el2
	 * implies el1.name &lt;&gt; el2.name)
	 */
	MetamodelConstraint<MMMessageElementContainer> checkMessageElementsHaveUniqueNames = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
	/**
	 * All the elements belonging to a technical MessageComponentContainer must
	 * be technical. self.isTechnical implies messageElement -&gt;
	 * forAll(messageElement|messageElement.isTechnical)
	 */
	MetamodelConstraint<MMMessageElementContainer> checktechnicalElement = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}