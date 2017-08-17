package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMMessageElement;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.metamodel.constraints.DeriveMMMessageAssociationEnd_isTechnical;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Optional;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMMessageElementContainer;
import com.tools20022.metamodel.MMLogicalType;
import com.tools20022.metamodel.constraints.DeriveMMMessageAssociationEnd_xmlMemberType;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.constraints.DeriveMMMessageAssociationEnd_memberType;
import com.tools20022.metamodel.MMSemanticMarkup;
import java.util.List;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * Kind of MessageElement that relates two MessageComponentTypes.
 */
public class MMMessageAssociationEnd implements MMMessageElement {

	private GeneratedMetamodelBean container;
	protected boolean isComposite;
	protected MMMessageComponentType type;
	protected Optional<MMBusinessComponent> businessComponentTrace;
	protected Optional<MMBusinessElement> businessElementTrace;
	protected MMMessageElementContainer componentContext;
	protected boolean isDerived;
	protected Optional<String> xmlTag;
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
	public MetamodelType<? extends MMMessageAssociationEnd> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageAssociationEnd> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageAssociationEnd.class);
	}

	/**
	 * Indicates if the message element is a composite.
	 */
	public boolean isIsComposite() {
		return isComposite;
	}

	/**
	 * The MessageComponentType which specifies the complex content model of a
	 * MessageAssociationEnd.
	 */
	public MMMessageComponentType getType() {
		return type;
	}

	@Derived
	@Override
	public boolean isIsTechnical() {
		return (new DeriveMMMessageAssociationEnd_isTechnical()).apply(this);
	}

	@Override
	public Optional<MMBusinessComponent> getBusinessComponentTrace() {
		return businessComponentTrace;
	}

	@Override
	public Optional<MMBusinessElement> getBusinessElementTrace() {
		return businessElementTrace;
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
		return xmlTag;
	}

	@Derived
	@Override
	public MMLogicalType getXmlMemberType() {
		return (new DeriveMMMessageAssociationEnd_xmlMemberType()).apply(this);
	}

	@Derived
	@Override
	public MMRepositoryType getMemberType() {
		return (new DeriveMMMessageAssociationEnd_memberType()).apply(this);
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