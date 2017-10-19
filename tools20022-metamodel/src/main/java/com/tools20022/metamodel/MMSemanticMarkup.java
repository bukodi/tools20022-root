package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Containment;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMSemanticMarkupElement;
import com.tools20022.metamodel.StandardMetamodel2013;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * Enables modelers to markup elements of the Repository with semantic metadata.
 * Each semanticMarkup string is a TupleValue.
 */
public class MMSemanticMarkup implements MMModelEntity {

	protected MMRepositoryConcept container;
	protected String type;
	protected Supplier<List<MMSemanticMarkupElement>> elements_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMRepositoryConcept getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMSemanticMarkup> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMSemanticMarkup> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMSemanticMarkup.class);
	}

	/**
	 * The type of semantic mark-up e.g. "synonym".
	 */
	public Optional<String> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	/**
	 * The elements of semantic markup.
	 */
	@Containment
	public List<MMSemanticMarkupElement> getElements() {
		return elements_lazy == null ? Collections.emptyList() : elements_lazy.get();
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null ? Collections.emptyList() : nextVersions_lazy.get();
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion_lazy == null ? Optional.empty() : Optional.of(previousVersion_lazy.get());
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier == null ? Optional.empty() : Optional.of(objectIdentifier);
	}
}