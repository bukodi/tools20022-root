package com.tools20022.metamodel.struct;


import com.tools20022.metamodel.struct.MMRepositoryConcept_;
import com.tools20022.metamodel.struct.MMMultiplicityEntity_;
import com.tools20022.metamodel.MMParticipant;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMBusinessTransaction;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMReceive;
import java.util.List;
import com.tools20022.metamodel.MMSend;
import com.tools20022.metamodel.MMBusinessRole;public interface MMParticipant_ extends MMRepositoryConcept_, MMMultiplicityEntity_ {

	/**
	 * the BusinessTransaction in which the Participant plays a role
	 */
	MetamodelAttribute<MMParticipant, MMBusinessTransaction> businessTransaction = newAttribute();
	/**
	 * The handling of a stimulus passed from a sending participant
	 */
	MetamodelAttribute<MMParticipant, List<MMReceive>> receives = newAttribute();
	/**
	 * The passing of information from a sending Participant to a receiving Participant
	 */
	MetamodelAttribute<MMParticipant, List<MMSend>> sends = newAttribute();
	/**
	 * the BusinessRoleTrace that traces the Participant to its BusinessRole
	 */
	MetamodelAttribute<MMParticipant, MMBusinessRole> businessRoleTrace = newAttribute(); }