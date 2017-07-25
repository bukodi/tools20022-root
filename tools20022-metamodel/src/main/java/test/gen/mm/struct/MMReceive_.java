package test.gen.mm.struct;

import test.gen.mm.struct.MMModelEntity_;
import test.gen.mm.MMReceive;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMMessageTransmission;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMParticipant;

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