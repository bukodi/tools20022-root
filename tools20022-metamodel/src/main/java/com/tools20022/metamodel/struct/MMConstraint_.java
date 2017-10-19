package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.struct.MMRepositoryConcept_;
import java.util.Optional;

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