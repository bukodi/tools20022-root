package test.gen.mm.struct;

import test.gen.mm.struct.MMRepositoryConcept_;
import test.gen.mm.MMBusinessRole;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMParticipant;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMBusinessProcess;

public interface MMBusinessRole_ extends MMRepositoryConcept_ {

	/**
	 * the BusinessRoleTrace for a BusinessRole
	 */
	MetamodelAttribute<MMBusinessRole, List<MMParticipant>> businessRoleTrace = newAttribute();
	/**
	 * the BusinessProcess that owns the BusinessRole
	 */
	MetamodelAttribute<MMBusinessRole, MMBusinessProcess> businessProcess = newAttribute();
}