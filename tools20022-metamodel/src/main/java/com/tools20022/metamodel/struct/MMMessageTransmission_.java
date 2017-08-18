package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMRepositoryConcept_;
import com.tools20022.metamodel.MMMessageTransmission;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMBusinessTransaction;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMessageDefinition;
import java.util.List;
import com.tools20022.metamodel.MMSend;
import com.tools20022.metamodel.MMReceive;

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