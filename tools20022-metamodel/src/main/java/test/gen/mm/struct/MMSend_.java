package test.gen.mm.struct;

import test.gen.mm.struct.MMModelEntity_;
import test.gen.mm.MMSend;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMParticipant;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageTransmission;

public interface MMSend_ extends MMModelEntity_ {

	/**
	 * The object passing a stimulus to a receiver object
	 */
	MetamodelAttribute<MMSend, MMParticipant> sender = newAttribute();
	/**
	 * the stimulus handled as part of the Send
	 */
	MetamodelAttribute<MMSend, MMMessageTransmission> messageTransmission = newAttribute();
}