package test.gen.mm.struct;

import test.gen.mm.struct.MMRepositoryConcept_;
import test.gen.mm.struct.MMMultiplicityEntity_;
import test.gen.mm.MMParticipant;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMBusinessTransaction;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMReceive;
import java.util.List;
import test.gen.mm.MMSend;
import test.gen.mm.MMBusinessRole;

public interface MMParticipant_
		extends
			MMRepositoryConcept_,
			MMMultiplicityEntity_ {

	/**
	 * the BusinessTransaction in which the Participant plays a role
	 */
	MetamodelAttribute<MMParticipant, MMBusinessTransaction> businessTransaction = newAttribute();
	/**
	 * The handling of a stimulus passed from a sending participant
	 */
	MetamodelAttribute<MMParticipant, List<MMReceive>> receives = newAttribute();
	/**
	 * The passing of information from a sending Participant to a receiving
	 * Participant
	 */
	MetamodelAttribute<MMParticipant, List<MMSend>> sends = newAttribute();
	/**
	 * the BusinessRoleTrace that traces the Participant to its BusinessRole
	 */
	MetamodelAttribute<MMParticipant, MMBusinessRole> businessRoleTrace = newAttribute();
}