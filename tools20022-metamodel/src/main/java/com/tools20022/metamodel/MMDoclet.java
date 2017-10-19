package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.StandardMetamodel2013;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * A Doclet provides a way of adding categorised documentation to an model
 * entity.
 */
public class MMDoclet implements MMModelEntity {

	protected MMRepositoryConcept container;
	protected String type;
	protected String content;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMRepositoryConcept getContainer() {
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
		return type == null ? Optional.empty() : Optional.of(type);
	}

	/**
	 * The content for the documentation.
	 */
	public Optional<String> getContent() {
		return content == null ? Optional.empty() : Optional.of(content);
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