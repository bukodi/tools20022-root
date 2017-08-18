package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMMessageElement;
import java.util.List;
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

	private GeneratedMetamodelBean container;
	protected List<MMMessageElement> impactedElements;
	protected MMMessageComponent messageComponent;
	protected List<MMMessageBuildingBlock> impactedMessageBuildingBlocks;
	protected MMMessageDefinition messageDefinition;
	protected String name;
	protected String definition;
	protected List<MMSemanticMarkup> semanticMarkup;
	protected List<MMDoclet> doclet;
	protected List<String> example;
	protected List<MMConstraint> constraint;
	protected MMRegistrationStatus registrationStatus;
	protected Date removalDate;
	protected List<MMModelEntity> nextVersions;
	protected MMModelEntity previousVersion;
	protected String objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
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
		return impactedElements == null
				? Collections.emptyList()
				: impactedElements;
	}

	/**
	 * Message Component owning the XOR.
	 * 
	 * @see MMMessageComponent#getXors()
	 */
	@Opposite(bean = MMMessageComponent.class, attribute = "xors")
	@Container
	public Optional<MMMessageComponent> getMessageComponent() {
		return Optional.ofNullable(messageComponent);
	}

	/**
	 * MessageBuildingBlocks impacted by the XOR.
	 */
	public List<MMMessageBuildingBlock> getImpactedMessageBuildingBlocks() {
		return impactedMessageBuildingBlocks == null
				? Collections.emptyList()
				: impactedMessageBuildingBlocks;
	}

	/**
	 * Message Definition owning the XOR.
	 * 
	 * @see MMMessageDefinition#getXors()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "xors")
	@Container
	public Optional<MMMessageDefinition> getMessageDefinition() {
		return Optional.ofNullable(messageDefinition);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Optional<String> getDefinition() {
		return Optional.ofNullable(definition);
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
		return Optional.ofNullable(removalDate);
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions == null ? Collections.emptyList() : nextVersions;
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return Optional.ofNullable(previousVersion);
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return Optional.ofNullable(objectIdentifier);
	}
}