package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import java.util.Optional;
import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMMessageElement;
import java.util.List;
import java.util.Collections;
import com.tools20022.metamodel.MMBusinessElementType;
import com.tools20022.metamodel.constraints.DeriveMMBusinessAssociationEnd_businessElementType;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.constraints.DeriveMMBusinessAssociationEnd_memberType;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * The context of a BusinessAssociation must be the type of its opposite and
 * vice-versa
 */
public class MMBusinessAssociationEnd implements MMBusinessElement {

	private GeneratedMetamodelBean container;
	protected MMBusinessAssociationEnd opposite;
	protected MMAggregation aggregation;
	protected MMBusinessComponent type;
	protected boolean isDerived;
	protected List<MMMessageElement> derivation;
	protected MMBusinessComponent elementContext;
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
	public MetamodelType<? extends MMBusinessAssociationEnd> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessAssociationEnd> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessAssociationEnd.class);
	}

	/**
	 * Opposite end of a bi-directional relationship between 2
	 * BusinessComponents.
	 */
	public Optional<MMBusinessAssociationEnd> getOpposite() {
		return Optional.ofNullable(opposite);
	}

	/**
	 * Expresses the strength of the semantic relationship between two
	 * BusinessComponents.
	 */
	public MMAggregation getAggregation() {
		return aggregation;
	}

	/**
	 * Specifies that a BusinessAssociationEnd always has a complex content
	 * model and is therefore always typed by a BusinessComponent, contrarily to
	 * a BusinessAttribute which may be typed by a data type.
	 * 
	 * @see MMBusinessComponent#getAssociationDomain()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "associationDomain")
	public MMBusinessComponent getType() {
		return type;
	}

	@Override
	public boolean isIsDerived() {
		return isDerived;
	}

	@Override
	public List<MMMessageElement> getDerivation() {
		return derivation == null ? Collections.emptyList() : derivation;
	}

	@Derived
	@Override
	public MMBusinessElementType getBusinessElementType() {
		return (new DeriveMMBusinessAssociationEnd_businessElementType())
				.apply(this);
	}

	@Override
	public MMBusinessComponent getElementContext() {
		return elementContext;
	}

	@Derived
	@Override
	public MMRepositoryType getMemberType() {
		return (new DeriveMMBusinessAssociationEnd_memberType()).apply(this);
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