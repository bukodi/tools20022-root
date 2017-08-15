package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMMessageConstruct;
import com.tools20022.metamodel.MMDataType;
import java.util.Optional;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMLogicalType;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.MMSemanticMarkup;
import java.util.List;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * Characteristic of a MessageDefinition, having a unique meaning within the
 * scope of that MessageDefinition.
 */
public class MMMessageBuildingBlock implements MMMessageConstruct {

	private GeneratedMetamodelBean container;
	protected Optional<MMDataType> simpleType;
	protected Optional<MMMessageComponentType> complexType;
	protected Optional<String> xmlTag;
	protected MMLogicalType xmlMemberType;
	protected MMRepositoryType memberType;
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
	protected Optional<Integer> maxOccurs;
	protected Optional<Integer> minOccurs;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMMessageBuildingBlock> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageBuildingBlock> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageBuildingBlock.class);
	}

	/**
	 * The simple content model of a MessageBuildingBlock when it is expressed
	 * using a DataType
	 */
	public Optional<MMDataType> getSimpleType() {
		return simpleType;
	}

	/**
	 * the complex content model of a MessageBuildingBlock when it is expressed
	 * using a MessageComponentType
	 * 
	 * @see MMMessageComponentType#getMessageBuildingBlock()
	 */
	@Opposite(bean = MMMessageComponentType.class, attribute = "messageBuildingBlock")
	public Optional<MMMessageComponentType> getComplexType() {
		return complexType;
	}

	@Override
	public Optional<String> getXmlTag() {
		return xmlTag;
	}

	@Override
	public MMLogicalType getXmlMemberType() {
		return xmlMemberType;
	}

	@Override
	public MMRepositoryType getMemberType() {
		return memberType;
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

	@Override
	public Optional<Integer> getMaxOccurs() {
		return maxOccurs;
	}

	@Override
	public Optional<Integer> getMinOccurs() {
		return minOccurs;
	}
}