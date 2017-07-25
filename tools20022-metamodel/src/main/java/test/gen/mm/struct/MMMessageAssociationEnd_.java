package test.gen.mm.struct;

import test.gen.mm.struct.MMMessageElement_;
import test.gen.mm.MMMessageAssociationEnd;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageComponentType;

public interface MMMessageAssociationEnd_ extends MMMessageElement_ {

	/**
	 * Indicates if the message element is a composite.
	 */
	MetamodelAttribute<MMMessageAssociationEnd, Boolean> isComposite = newAttribute();
	/**
	 * The MessageComponentType which specifies the complex content model of a
	 * MessageAssociationEnd.
	 */
	MetamodelAttribute<MMMessageAssociationEnd, MMMessageComponentType> type = newAttribute();
}