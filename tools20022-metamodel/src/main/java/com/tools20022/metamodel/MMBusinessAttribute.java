package com.tools20022.metamodel;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMDataType;
import java.util.Optional;
import java.util.function.Supplier;
import com.tools20022.metamodel.MMMessageElement;
import java.util.List;
import java.util.Collections;
import com.tools20022.metamodel.MMBusinessElementType;
import com.tools20022.metamodel.constraints.DeriveMMBusinessAttribute_businessElementType;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.constraints.DeriveMMBusinessAttribute_memberType;
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

	protected Supplier<MMDataType> simpleType_lazy;
	protected Supplier<MMBusinessComponent> complexType_lazy;
	protected boolean isDerived;
	protected Supplier<List<MMMessageElement>> derivation_lazy;
	protected Supplier<MMBusinessComponent> elementContext_lazy;
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
	public MMBusinessComponent getContainer() {
		return getElementContext();
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
		return simpleType_lazy == null ? Optional.empty() : Optional
				.of(simpleType_lazy.get());
	}

	/**
	 * The BusinessComponent that describes the complex content model of the
	 * BusinessAttrribute.
	 */
	public Optional<MMBusinessComponent> getComplexType() {
		return complexType_lazy == null ? Optional.empty() : Optional
				.of(complexType_lazy.get());
	}

	@Override
	public boolean isIsDerived() {
		return isDerived;
	}

	@Override
	public List<MMMessageElement> getDerivation() {
		return derivation_lazy == null
				? Collections.emptyList()
				: derivation_lazy.get();
	}

	@Derived
	@Override
	public MMBusinessElementType getBusinessElementType() {
		return (new DeriveMMBusinessAttribute_businessElementType())
				.apply(this);
	}

	@Override
	public MMBusinessComponent getElementContext() {
		return elementContext_lazy.get();
	}

	@Derived
	@Override
	public MMRepositoryType getMemberType() {
		return (new DeriveMMBusinessAttribute_memberType()).apply(this);
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