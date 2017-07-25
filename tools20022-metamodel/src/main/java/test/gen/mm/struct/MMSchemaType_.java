package test.gen.mm.struct;

import test.gen.mm.struct.MMDataType_;
import test.gen.mm.MMSchemaType;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMSchemaTypeKind;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMSchemaType_ extends MMDataType_ {

	MetamodelAttribute<MMSchemaType, MMSchemaTypeKind> kind = newAttribute();
}