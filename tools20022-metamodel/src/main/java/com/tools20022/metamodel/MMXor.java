package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMMessageElement;
import java.util.List;
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
	private List<MMMessageElement> impactedElements;
	private Optional<MMMessageComponent> messageComponent;
	private List<MMMessageBuildingBlock> impactedMessageBuildingBlocks;
	private Optional<MMMessageDefinition> messageDefinition;
	private String name;
	private Optional<String> definition;
	private List<MMSemanticMarkup> semanticMarkup;
	private List<MMDoclet> doclet;
	private List<String> example;
	private List<MMConstraint> constraint;
	private MMRegistrationStatus registrationStatus;
	private Optional<Date> removalDate;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

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
		return impactedElements;
	}

	/**
	 * Message Component owning the XOR.
	 * 
	 * @see MMMessageComponent#getXors()
	 */
	@Opposite(bean = MMMessageComponent.class, attribute = "xors")
	@Container
	public Optional<MMMessageComponent> getMessageComponent() {
		return messageComponent;
	}

	/**
	 * MessageBuildingBlocks impacted by the XOR.
	 */
	public List<MMMessageBuildingBlock> getImpactedMessageBuildingBlocks() {
		return impactedMessageBuildingBlocks;
	}

	/**
	 * Message Definition owning the XOR.
	 * 
	 * @see MMMessageDefinition#getXors()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "xors")
	@Container
	public Optional<MMMessageDefinition> getMessageDefinition() {
		return messageDefinition;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Optional<String> getDefinition() {
		return definition;
	}

	@Override
	public List<MMSemanticMarkup> getSemanticMarkup() {
		return semanticMarkup;
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet;
	}

	@Override
	public List<String> getExample() {
		return example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint;
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate;
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