package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import java.util.Optional;
import java.util.List;

/**
 * A Doclet provides a way of adding categorised documentation to an model
 * entity.
 */
public class MMDoclet implements MMModelEntity {

	private GeneratedMetamodelBean container;
	protected Optional<String> type;
	protected Optional<String> content;
	protected List<MMModelEntity> nextVersions;
	protected Optional<MMModelEntity> previousVersion;
	protected Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMDoclet> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMDoclet> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMDoclet.class);
	}

	/**
	 * The type of doclet. The definition of the doclet type is left open so
	 * that new doclet types can be easily added without the need for a change
	 * to the meta-model.
	 */
	public Optional<String> getType() {
		return type;
	}

	/**
	 * The content for the documentation.
	 */
	public Optional<String> getContent() {
		return content;
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions;
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion;
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier;
	}
}