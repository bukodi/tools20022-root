package com.tools20022.metamodel.struct;


import com.tools20022.metamodel.struct.MMDataType_;
import com.tools20022.metamodel.MMSchemaType;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMSchemaTypeKind;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;public interface MMSchemaType_ extends MMDataType_ {

	MetamodelAttribute<MMSchemaType, MMSchemaTypeKind> kind = newAttribute(); }