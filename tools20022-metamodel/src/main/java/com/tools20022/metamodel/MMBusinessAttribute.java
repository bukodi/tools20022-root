package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMDataType;
import java.util.Optional;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMMessageElement;
import java.util.List;
import com.tools20022.metamodel.MMBusinessElementType;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * A BusinessElement, typed by a BusinessComponent or a DataType (contrary to a
 * BusinessAssociationEnd, which is always typed by another BusinessComponent)
 */
public class MMBusinessAttribute implements MMBusinessElement {

	private GeneratedMetamodelBean container;
	protected Optional<MMDataType> simpleType;
	protected Optional<MMBusinessComponent> complexType;
	protected boolean isDerived;
	protected List<MMMessageElement> derivation;
	protected MMBusinessElementType businessElementType;
	protected MMBusinessComponent elementContext;
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
	public MetamodelType<? extends MMBusinessAttribute> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessAttribute> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessAttribute.class);
	}

	/**
	 * Expresses that the content model of a BusinessAttribute may be specified
	 * by a type from the XSD type library or a derived datatype.
	 */
	public Optional<MMDataType> getSimpleType() {
		return simpleType;
	}

	/**
	 * The BusinessComponent that describes the complex content model of the
	 * BusinessAttrribute.
	 */
	public Optional<MMBusinessComponent> getComplexType() {
		return complexType;
	}

	@Override
	public boolean isIsDerived() {
		return isDerived;
	}

	@Override
	public List<MMMessageElement> getDerivation() {
		return derivation;
	}

	@Override
	public MMBusinessElementType getBusinessElementType() {
		return businessElementType;
	}

	@Override
	public MMBusinessComponent getElementContext() {
		return elementContext;
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