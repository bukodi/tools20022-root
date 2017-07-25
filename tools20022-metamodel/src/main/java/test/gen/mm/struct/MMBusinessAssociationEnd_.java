package test.gen.mm.struct;

import test.gen.mm.struct.MMBusinessElement_;
import test.gen.mm.MMBusinessAssociationEnd;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMAggregation;
import test.gen.mm.MMBusinessComponent;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;

public interface MMBusinessAssociationEnd_ extends MMBusinessElement_ {

	/**
	 * Opposite end of a bi-directional relationship between 2
	 * BusinessComponents.
	 */
	MetamodelAttribute<MMBusinessAssociationEnd, Optional<MMBusinessAssociationEnd>> opposite = newAttribute();
	/**
	 * Expresses the strength of the semantic relationship between two
	 * BusinessComponents.
	 */
	MetamodelAttribute<MMBusinessAssociationEnd, MMAggregation> aggregation = newAttribute();
	/**
	 * Specifies that a BusinessAssociationEnd always has a complex content
	 * model and is therefore always typed by a BusinessComponent, contrarily to
	 * a BusinessAttribute which may be typed by a data type.
	 */
	MetamodelAttribute<MMBusinessAssociationEnd, MMBusinessComponent> type = newAttribute();
	/**
	 * Two opposite association ends may not have composite or shared
	 * aggregation at the same time not(aggregation &lt;&gt; Aggregation::NONE
	 * and opposite.aggregation &lt;&gt; Aggregation::NONE)
	 */
	MetamodelConstraint<MMBusinessAssociationEnd> checkAtMostOneAggregatedEnd = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
	/**
	 * The context of this end must be the type of the opposite and vice-versa
	 * opposite.elementContext = type and elementContext = opposite.type
	 */
	MetamodelConstraint<MMBusinessAssociationEnd> checkContextConsistentWithType = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}