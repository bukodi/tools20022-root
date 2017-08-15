package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import java.util.Optional;
import java.util.List;

/**
 * A semantic mark-up element defines a name + value pair for content. E.g. for
 * synonyms, the name will be either "name" or "context" and the value will be
 * the corresponding synonym name or context.
 */
public class MMSemanticMarkupElement implements MMModelEntity {

	private GeneratedMetamodelBean container;
	protected Optional<String> name;
	protected Optional<String> value;
	protected List<MMModelEntity> nextVersions;
	protected Optional<MMModelEntity> previousVersion;
	protected Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMSemanticMarkupElement> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMSemanticMarkupElement> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMSemanticMarkupElement.class);
	}

	/**
	 * Name of the semantic mark-up element.
	 */
	public Optional<String> getName() {
		return name;
	}

	/**
	 * Value of the semantic mark-up element.
	 */
	public Optional<String> getValue() {
		return value;
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