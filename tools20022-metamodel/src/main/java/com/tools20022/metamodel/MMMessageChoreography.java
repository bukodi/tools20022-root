package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMBusinessTransaction;
import java.util.Optional;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMMessageDefinition;
import java.util.List;
import java.util.Collections;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * precise and complete description of a MessageInstance exchange within a
 * BusinessTransaction, describing the sequence and correlation of
 * MessageInstances within a conversation, including the constraints on the
 * interaction between Participants
 */
public class MMMessageChoreography implements MMTopLevelCatalogueEntry {

	private GeneratedMetamodelBean container;
	protected MMBusinessTransaction businessTransactionTrace;
	protected List<MMMessageDefinition> messageDefinition;
	protected MMBusinessProcessCatalogue businessProcessCatalogue;
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
	public MetamodelType<? extends MMMessageChoreography> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageChoreography> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageChoreography.class);
	}

	/**
	 * the BusinessTransactionTrace from the MessageChoreography to the
	 * BusinessTransaction
	 * 
	 * @see MMBusinessTransaction#getTrace()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "trace")
	public Optional<MMBusinessTransaction> getBusinessTransactionTrace() {
		return Optional.ofNullable(businessTransactionTrace);
	}

	/**
	 * The MessageDefinition that is used in a MessageChoreography.
	 * 
	 * @see MMMessageDefinition#getChoreography()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "choreography")
	public List<MMMessageDefinition> getMessageDefinition() {
		return messageDefinition == null
				? Collections.emptyList()
				: messageDefinition;
	}

	@Override
	public MMBusinessProcessCatalogue getBusinessProcessCatalogue() {
		return businessProcessCatalogue;
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