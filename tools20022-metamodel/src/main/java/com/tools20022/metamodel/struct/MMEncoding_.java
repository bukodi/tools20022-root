package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMEncoding;
import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMSyntax;
import com.tools20022.metamodel.struct.MMModelEntity_;
import java.util.List;

public interface MMEncoding_ extends MMModelEntity_ {

	/**
	 * The MessageSets for which this Encoding is a valid ISO 20022 encoding
	 */
	MetamodelAttribute<MMEncoding, List<MMMessageSet>> messageSet = newAttribute();
	/**
	 * The source syntax on which an encoding applies
	 */
	MetamodelAttribute<MMEncoding, MMSyntax> syntax = newAttribute();
}