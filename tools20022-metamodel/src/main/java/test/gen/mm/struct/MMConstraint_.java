package test.gen.mm.struct;

import test.gen.mm.struct.MMRepositoryConcept_;
import test.gen.mm.MMConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMRepositoryConcept;

public interface MMConstraint_ extends MMRepositoryConcept_ {

	/**
	 * The description of a Constraint in a specific language, defined in
	 * expressionLanguage
	 */
	MetamodelAttribute<MMConstraint, Optional<String>> expression = newAttribute();
	/**
	 * The language in which a Constraint in expressed.
	 */
	MetamodelAttribute<MMConstraint, Optional<String>> expressionLanguage = newAttribute();
	/**
	 * The owner of the Rule.
	 */
	MetamodelAttribute<MMConstraint, MMRepositoryConcept> owner = newAttribute();
}