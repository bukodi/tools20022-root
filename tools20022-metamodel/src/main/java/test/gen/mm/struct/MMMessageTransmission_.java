package test.gen.mm.struct;

import test.gen.mm.struct.MMRepositoryConcept_;
import test.gen.mm.MMMessageTransmission;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMBusinessTransaction;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMMessageDefinition;
import java.util.List;
import test.gen.mm.MMSend;
import test.gen.mm.MMReceive;

public interface MMMessageTransmission_ extends MMRepositoryConcept_ {

	/**
	 * the BusinessTransaction to which the MessageTransmission belongs
	 */
	MetamodelAttribute<MMMessageTransmission, MMBusinessTransaction> businessTransaction = newAttribute();
	/**
	 * all of the MessagetypeTraces that derive MessageDefinitions from one
	 * MessageTransmission
	 */
	MetamodelAttribute<MMMessageTransmission, List<MMMessageDefinition>> derivation = newAttribute();
	/**
	 * Describes the purpose and scope of the MessageTransmission in the
	 * BusinessTransaction
	 */
	MetamodelAttribute<MMMessageTransmission, String> messageTypeDescription = newAttribute();
	/**
	 * the passing of a MessagTransmission from a sender instance to a receiver
	 * instance
	 */
	MetamodelAttribute<MMMessageTransmission, MMSend> send = newAttribute();
	/**
	 * the handling of a MessageTransmission passed from a sender instance
	 */
	MetamodelAttribute<MMMessageTransmission, List<MMReceive>> receive = newAttribute();
}