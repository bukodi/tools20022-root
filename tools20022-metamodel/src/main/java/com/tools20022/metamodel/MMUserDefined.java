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
import java.util.function.Supplier;
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
	protected Supplier<List<MMMessageBuildingBlock>> messageBuildingBlock_lazy;
	protected Supplier<MMBusinessComponent> trace_lazy;
	protected Supplier<MMDataDictionary> dataDictionary_lazy;
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
		return namespaceList == null ? Optional.empty() : Optional
				.of(namespaceList);
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
		return messageBuildingBlock_lazy == null
				? Collections.emptyList()
				: messageBuildingBlock_lazy.get();
	}

	@Derived
	@Override
	public boolean isIsTechnical() {
		return (new DeriveMMUserDefined_isTechnical()).apply(this);
	}

	@Override
	public Optional<MMBusinessComponent> getTrace() {
		return trace_lazy == null ? Optional.empty() : Optional.of(trace_lazy
				.get());
	}

	@Override
	public MMDataDictionary getDataDictionary() {
		return dataDictionary_lazy.get();
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