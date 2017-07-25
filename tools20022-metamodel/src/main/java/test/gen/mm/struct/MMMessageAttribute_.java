package test.gen.mm.struct;

import test.gen.mm.struct.MMMessageElement_;
import test.gen.mm.MMMessageAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMDataType;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageComponentType;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;

public interface MMMessageAttribute_ extends MMMessageElement_ {

	/**
	 * the simple content model of a MessageAttribute when it is expressed using
	 * a DataType
	 */
	MetamodelAttribute<MMMessageAttribute, Optional<MMDataType>> simpleType = newAttribute();
	/**
	 * the complex content model of a MessageAttribute when it is expressed
	 * using a MessageComponentType
	 */
	MetamodelAttribute<MMMessageAttribute, Optional<MMMessageComponentType>> complexType = newAttribute();
	/**
	 * A MessageAttribute must have exactly one of the following: simpleType and
	 * complexType complexType-&gt;size() + simpleType-&gt;size() = 1
	 */
	MetamodelConstraint<MMMessageAttribute> checkMessageAttributeHasExactlyOneType = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}