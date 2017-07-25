package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import java.util.Optional;
import com.tools20022.metamodel.MMSemanticMarkupElement;
import java.util.List;
import com.tools20022.core.metamodel.Containment;

/**
 * Enables modelers to markup elements of the Repository with semantic metadata.
 * Each semanticMarkup string is a TupleValue.
 */
public class MMSemanticMarkup implements MMModelEntity {

	private GeneratedMetamodelBean container;
	private Optional<String> type;
	private List<MMSemanticMarkupElement> elements;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMSemanticMarkup> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMSemanticMarkup> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMSemanticMarkup.class);
	}

	/**
	 * The type of semantic mark-up e.g. "synonym".
	 */
	public Optional<String> getType() {
		return type;
	}

	/**
	 * The elements of semantic markup.
	 */
	@Containment
	public List<MMSemanticMarkupElement> getElements() {
		return elements;
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