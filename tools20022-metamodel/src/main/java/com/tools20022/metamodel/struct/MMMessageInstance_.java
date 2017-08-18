package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMModelEntity_;
import com.tools20022.metamodel.MMMessageInstance;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMSyntaxMessageScheme;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMTransportMessage;
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