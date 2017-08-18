package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMMessageElement;
import com.tools20022.metamodel.MMDataType;
import java.util.Optional;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.metamodel.constraints.DeriveMMMessageAttribute_isTechnical;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMMessageElementContainer;
import com.tools20022.metamodel.MMLogicalType;
import com.tools20022.metamodel.constraints.DeriveMMMessageAttribute_xmlMemberType;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.constraints.DeriveMMMessageAttribute_memberType;
import com.tools20022.metamodel.MMSemanticMarkup;
import java.util.List;
import java.util.Collections;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * Kind of MessageElement whose type is a DataType or a MessageComponentType
 */
public class MMMessageAttribute implements MMMessageElement {

	private GeneratedMetamodelBean container;
	protected MMDataType simpleType;
	protected MMMessageComponentType complexType;
	protected MMBusinessComponent businessComponentTrace;
	protected MMBusinessElement businessElementTrace;
	protected MMMessageElementContainer componentContext;
	protected boolean isDerived;
	protected String xmlTag;
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
	protected Integer maxOccurs;
	protected Integer minOccurs;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMMessageAttribute> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageAttribute> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageAttribute.class);
	}

	/**
	 * the simple content model of a MessageAttribute when it is expressed using
	 * a DataType
	 */
	public Optional<MMDataType> getSimpleType() {
		return Optional.ofNullable(simpleType);
	}

	/**
	 * the complex content model of a MessageAttribute when it is expressed
	 * using a MessageComponentType
	 */
	public Optional<MMMessageComponentType> getComplexType() {
		return Optional.ofNullable(complexType);
	}

	@Derived
	@Override
	public boolean isIsTechnical() {
		return (new DeriveMMMessageAttribute_isTechnical()).apply(this);
	}

	@Override
	public Optional<MMBusinessComponent> getBusinessComponentTrace() {
		return Optional.ofNullable(businessComponentTrace);
	}

	@Override
	public Optional<MMBusinessElement> getBusinessElementTrace() {
		return Optional.ofNullable(businessElementTrace);
	}

	@Override
	public MMMessageElementContainer getComponentContext() {
		return componentContext;
	}

	@Override
	public boolean isIsDerived() {
		return isDerived;
	}

	@Override
	public Optional<String> getXmlTag() {
		return Optional.ofNullable(xmlTag);
	}

	@Derived
	@Override
	public MMLogicalType getXmlMemberType() {
		return (new DeriveMMMessageAttribute_xmlMemberType()).apply(this);
	}

	@Derived
	@Override
	public MMRepositoryType getMemberType() {
		return (new DeriveMMMessageAttribute_memberType()).apply(this);
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

	@Override
	public Optional<Integer> getMaxOccurs() {
		return Optional.ofNullable(maxOccurs);
	}

	@Override
	public Optional<Integer> getMinOccurs() {
		return Optional.ofNullable(minOccurs);
	}
}