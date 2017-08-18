package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.metamodel.MMNamespace;
import java.util.Optional;
import com.tools20022.metamodel.MMProcessContent;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import java.util.List;
import java.util.Collections;
import com.tools20022.metamodel.constraints.DeriveMMUserDefined_isTechnical;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * A Type which allows referring to a structure defined outside of the ISO20022
 * MessageDefinition.
 */
public class MMUserDefined implements MMMessageComponentType {

	private GeneratedMetamodelBean container;
	protected MMNamespace namespace;
	protected String namespaceList;
	protected MMProcessContent processContents;
	protected List<MMMessageBuildingBlock> messageBuildingBlock;
	protected MMBusinessComponent trace;
	protected MMDataDictionary dataDictionary;
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
	public MetamodelType<? extends MMUserDefined> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMUserDefined> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMUserDefined.class);
	}

	/**
	 * The URN namespace of the referenced external structure definition. The
	 * allowed values are: ##any, ##other or list. When equal to "list", then
	 * the value of the property "namespaceList" must be filled.
	 */
	public MMNamespace getNamespace() {
		return namespace;
	}

	/**
	 * A list of URN namespaces.
	 */
	public Optional<String> getNamespaceList() {
		return Optional.ofNullable(namespaceList);
	}

	/**
	 * Indicates the kind of validation which must be performed on the external
	 * structure.
	 */
	public MMProcessContent getProcessContents() {
		return processContents;
	}

	@Override
	public List<MMMessageBuildingBlock> getMessageBuildingBlock() {
		return messageBuildingBlock == null
				? Collections.emptyList()
				: messageBuildingBlock;
	}

	@Derived
	@Override
	public boolean isIsTechnical() {
		return (new DeriveMMUserDefined_isTechnical()).apply(this);
	}

	@Override
	public Optional<MMBusinessComponent> getTrace() {
		return Optional.ofNullable(trace);
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