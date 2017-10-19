package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMessageTransmission;
import com.tools20022.metamodel.MMParticipant;
import com.tools20022.metamodel.MMReceive;
import com.tools20022.metamodel.struct.MMModelEntity_;

public interface MMReceive_ extends MMModelEntity_ {

	/**
	 * the stimulus handled as part of the Receive
	 */
	MetamodelAttribute<MMReceive, MMMessageTransmission> messageTransmission = newAttribute();
	/**
	 * the object handling a stimulus passed from the sender
	 */
	MetamodelAttribute<MMReceive, MMParticipant> receiver = newAttribute();
}