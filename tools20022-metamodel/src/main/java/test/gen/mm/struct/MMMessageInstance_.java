package test.gen.mm.struct;

import test.gen.mm.struct.MMModelEntity_;
import test.gen.mm.MMMessageInstance;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMSyntaxMessageScheme;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMTransportMessage;
import java.util.List;

public interface MMMessageInstance_ extends MMModelEntity_ {

	/**
	 * the SyntaxScheme instantiated by this MessageInstance
	 */
	MetamodelAttribute<MMMessageInstance, MMSyntaxMessageScheme> specification = newAttribute();
	/**
	 * the TransportMessage that contains the MessageInstance
	 */
	MetamodelAttribute<MMMessageInstance, List<MMTransportMessage>> transportMessage = newAttribute();
}