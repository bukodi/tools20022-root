package com.tools20022.metamodel;

import com.tools20022.metamodel.MMMessageElementContainer;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMMessageElement;
import com.tools20022.metamodel.MMDataType;
import java.util.Optional;
import java.util.function.Supplier;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.metamodel.constraints.DeriveMMMessageAttribute_isTechnical;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessElement;
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

	protected Supplier<MMDataType> simpleType_lazy;
	protected Supplier<MMMessageComponentType> complexType_lazy;
	protected Supplier<MMBusinessComponent> businessComponentTrace_lazy;
	protected Supplier<MMBusinessElement> businessElementTrace_lazy;
	protected Supplier<MMMessageElementContainer> componentContext_lazy;
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
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;
	protected Integer maxOccurs;
	protected Integer minOccurs;

	@Override
	public MMMessageElementContainer getContainer() {
		return getComponentContext();
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
		return simpleType_lazy == null ? Optional.empty() : Optional
				.of(simpleType_lazy.get());
	}

	/**
	 * the complex content model of a MessageAttribute when it is expressed
	 * using a MessageComponentType
	 */
	public Optional<MMMessageComponentType> getComplexType() {
		return complexType_lazy == null ? Optional.empty() : Optional
				.of(complexType_lazy.get());
	}

	@Derived
	@Override
	public boolean isIsTechnical() {
		return (new DeriveMMMessageAttribute_isTechnical()).apply(this);
	}

	@Override
	public Optional<MMBusinessComponent> getBusinessComponentTrace() {
		return businessComponentTrace_lazy == null
				? Optional.empty()
				: Optional.of(businessComponentTrace_lazy.get());
	}

	@Override
	public Optional<MMBusinessElement> getBusinessElementTrace() {
		return businessElementTrace_lazy == null ? Optional.empty() : Optional
				.of(businessElementTrace_lazy.get());
	}

	@Override
	public MMMessageElementContainer getComponentContext() {
		return componentContext_lazy.get();
	}

	@Override
	public boolean isIsDerived() {
		return isDerived;
	}

	@Override
	public Optional<String> getXmlTag() {
		return xmlTag == null ? Optional.empty() : Optional.of(xmlTag);
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

	@Override
	public Optional<Integer> getMaxOccurs() {
		return maxOccurs == null ? Optional.empty() : Optional.of(maxOccurs);
	}

	@Override
	public Optional<Integer> getMinOccurs() {
		return minOccurs == null ? Optional.empty() : Optional.of(minOccurs);
	}
}