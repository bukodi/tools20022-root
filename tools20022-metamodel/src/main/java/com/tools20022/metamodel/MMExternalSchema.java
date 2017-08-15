package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMMessageComponentType;
import java.util.List;
import com.tools20022.metamodel.MMProcessContent;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Optional;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * Reusable Dictionary Item that allows referring to a structure defined outside
 * of the ISO 20022 MessageDefinition.
 */
public class MMExternalSchema implements MMMessageComponentType {

	private GeneratedMetamodelBean container;
	protected List<String> namespaceList;
	protected MMProcessContent processContent;
	protected List<MMMessageBuildingBlock> messageBuildingBlock;
	protected boolean isTechnical;
	protected Optional<MMBusinessComponent> trace;
	protected MMDataDictionary dataDictionary;
	protected String name;
	protected Optional<String> definition;
	protected List<MMSemanticMarkup> semanticMarkup;
	protected List<MMDoclet> doclet;
	protected List<String> example;
	protected List<MMConstraint> constraint;
	protected MMRegistrationStatus registrationStatus;
	protected Optional<Date> removalDate;
	protected List<MMModelEntity> nextVersions;
	protected Optional<MMModelEntity> previousVersion;
	protected Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMExternalSchema> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMExternalSchema> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMExternalSchema.class);
	}

	/**
	 * Identifies the description of the content model of an ExternalSchema,
	 * through (a set of) URI.
	 */
	public List<String> getNamespaceList() {
		return namespaceList;
	}

	/**
	 * Specifies whether it is required for the content model of the
	 * ExternalSchema to be validated.
	 */
	public MMProcessContent getProcessContent() {
		return processContent;
	}

	@Override
	public List<MMMessageBuildingBlock> getMessageBuildingBlock() {
		return messageBuildingBlock;
	}

	@Override
	public boolean isIsTechnical() {
		return isTechnical;
	}

	@Override
	public Optional<MMBusinessComponent> getTrace() {
		return trace;
	}

	@Override
	public MMDataDictionary getDataDictionary() {
		return dataDictionary;
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