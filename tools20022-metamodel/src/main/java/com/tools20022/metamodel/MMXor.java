package com.tools20022.metamodel;

import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMMessageElement;
import java.util.List;
import java.util.function.Supplier;
import java.util.Collections;
import com.tools20022.metamodel.MMMessageComponent;
import java.util.Optional;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * A rule which enforces a choice amongst a set of Message Elements contained
 * either within a Message Definition or a Message Component.
 */
public class MMXor implements MMRepositoryConcept {

	protected Supplier<List<MMMessageElement>> impactedElements_lazy;
	protected Supplier<MMMessageComponent> messageComponent_lazy;
	protected Supplier<List<MMMessageBuildingBlock>> impactedMessageBuildingBlocks_lazy;
	protected Supplier<MMMessageDefinition> messageDefinition_lazy;
	protected String name;
	protected String definition;
	protected List<MMSemanticMarkup> semanticMarkup;
	protected List<MMDoclet> doclet;
	protected List<String> example;
	protected List<MMConstraint> constraint;
	protected MMRegistrationStatus registrationStatus;
	protected Date removalDate;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMRepositoryType getContainer() {
		if (getMessageComponent().isPresent())
			return getMessageComponent().get();
		if (getMessageDefinition().isPresent())
			return getMessageDefinition().get();
		throw new IllegalStateException("The " + toString()
				+ " hasn't container!");
	}

	@Override
	public MetamodelType<? extends MMXor> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMXor> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMXor.class);
	}

	/**
	 * Message Elements impacted by the XOR.
	 */
	public List<MMMessageElement> getImpactedElements() {
		return impactedElements_lazy == null
				? Collections.emptyList()
				: impactedElements_lazy.get();
	}

	/**
	 * Message Component owning the XOR.
	 * 
	 * @see MMMessageComponent#getXors()
	 */
	@Opposite(bean = MMMessageComponent.class, attribute = "xors")
	@Container
	public Optional<MMMessageComponent> getMessageComponent() {
		return messageComponent_lazy == null ? Optional.empty() : Optional
				.of(messageComponent_lazy.get());
	}

	/**
	 * MessageBuildingBlocks impacted by the XOR.
	 */
	public List<MMMessageBuildingBlock> getImpactedMessageBuildingBlocks() {
		return impactedMessageBuildingBlocks_lazy == null ? Collections
				.emptyList() : impactedMessageBuildingBlocks_lazy.get();
	}

	/**
	 * Message Definition owning the XOR.
	 * 
	 * @see MMMessageDefinition#getXors()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "xors")
	@Container
	public Optional<MMMessageDefinition> getMessageDefinition() {
		return messageDefinition_lazy == null ? Optional.empty() : Optional
				.of(messageDefinition_lazy.get());
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Optional<String> getDefinition() {
		return definition == null ? Optional.empty() : Optional.of(definition);
	}

	@Override
	public List<MMSemanticMarkup> getSemanticMarkup() {
		return semanticMarkup == null
				? Collections.emptyList()
				: semanticMarkup;
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet == null ? Collections.emptyList() : doclet;
	}

	@Override
	public List<String> getExample() {
		return example == null ? Collections.emptyList() : example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint == null ? Collections.emptyList() : constraint;
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate == null ? Optional.empty() : Optional
				.of(removalDate);
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null
				? Collections.emptyList()
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
	}
}