package test.gen.mm.struct;

import test.gen.mm.MMModelEntity;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import java.util.Optional;

public interface MMModelEntity_ {

	/**
	 * List of next versions of a ModelEntity that stem from this ModelEntity.
	 * Allows version control management.
	 */
	MetamodelAttribute<MMModelEntity, List<MMModelEntity>> nextVersions = newAttribute();
	/**
	 * Previous version of a ModelEntity that this ModelEntity stems from.
	 * Allows version control management.
	 */
	MetamodelAttribute<MMModelEntity, Optional<MMModelEntity>> previousVersion = newAttribute();
	/**
	 * Uniquely identifies the RepositoryConcept
	 */
	MetamodelAttribute<MMModelEntity, Optional<String>> objectIdentifier = newAttribute();
}