package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMModelEntity;
import java.util.List;
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