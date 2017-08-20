package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.MMModelEntity;
import java.util.List;
import java.util.function.Supplier;
import com.tools20022.core.metamodel.Opposite;
import java.util.Optional;

/**
 * Abstract definition of a model entity. The common meta class which is the
 * generalisation of all Meta Classes.
 */
public interface MMModelEntity extends GeneratedMetamodelBean {

	public static MetamodelType<MMModelEntity> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMModelEntity.class);
	}

	/**
	 * List of next versions of a ModelEntity that stem from this ModelEntity.
	 * Allows version control management.
	 * 
	 * @see MMModelEntity#getPreviousVersion()
	 */
	@Opposite(bean = MMModelEntity.class, attribute = "previousVersion")
	public List<MMModelEntity> getNextVersions();

	/**
	 * Previous version of a ModelEntity that this ModelEntity stems from.
	 * Allows version control management.
	 * 
	 * @see MMModelEntity#getNextVersions()
	 */
	@Opposite(bean = MMModelEntity.class, attribute = "nextVersions")
	public Optional<MMModelEntity> getPreviousVersion();

	/**
	 * Uniquely identifies the RepositoryConcept
	 */
	public Optional<String> getObjectIdentifier();
}