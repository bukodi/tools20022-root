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
	private MMNamespace namespace;
	private Optional<String> namespaceList;
	private MMProcessContent processContents;
	private List<MMMessageBuildingBlock> messageBuildingBlock;
	private boolean isTechnical;
	private Optional<MMBusinessComponent> trace;
	private MMDataDictionary dataDictionary;
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
		return namespaceList;
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