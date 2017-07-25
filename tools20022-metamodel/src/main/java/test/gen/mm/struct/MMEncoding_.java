package test.gen.mm.struct;

import test.gen.mm.struct.MMModelEntity_;
import test.gen.mm.MMEncoding;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessageSet;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMSyntax;

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