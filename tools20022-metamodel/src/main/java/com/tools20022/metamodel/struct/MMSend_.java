package com.tools20022.metamodel.struct;


import com.tools20022.metamodel.struct.MMModelEntity_;
import com.tools20022.metamodel.MMSend;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMParticipant;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMessageTransmission;public interface MMSend_ extends MMModelEntity_ {

	/**
	 * The object passing a stimulus to a receiver object
	 */
	MetamodelAttribute<MMSend, MMParticipant> sender = newAttribute();
	/**
	 * the stimulus handled as part of the Send
	 */
	MetamodelAttribute<MMSend, MMMessageTransmission> messageTransmission = newAttribute(); }