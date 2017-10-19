package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMSchemaType;
import com.tools20022.metamodel.MMSchemaTypeKind;
import com.tools20022.metamodel.struct.MMDataType_;

public interface MMSchemaType_ extends MMDataType_ {

	MetamodelAttribute<MMSchemaType, MMSchemaTypeKind> kind = newAttribute();
}