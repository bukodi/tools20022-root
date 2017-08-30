package com.tools20022.metamodel;


import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import java.util.Optional;
import java.util.List;
import java.util.function.Supplier;
import java.util.Collections;/**
 * A semantic mark-up element defines a name + value pair for content. E.g. for synonyms, the name will be either "name" or "context" and the value will be the corresponding synonym name or context.
 */
public class MMSemanticMarkupElement implements MMModelEntity {

	protected MMSemanticMarkup container;
	protected String name;
	protected String value;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMSemanticMarkup getContainer() {
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
		return name == null ? Optional.empty() : Optional.of(name);
	}

	/**
	 * Value of the semantic mark-up element.
	 */
	public Optional<String> getValue() {
		return value == null ? Optional.empty() : Optional.of(value);
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null ? Collections.emptyList()
				: nextVersions_lazy.get();
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion_lazy == null ? Optional.empty() : Optional
				.of(previousVersion_lazy.get());
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier == null ? Optional.empty() : Optional
				.of(objectIdentifier);
	} }