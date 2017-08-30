package com.tools20022.metamodel;


import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMSyntax;
import java.util.List;
import java.util.function.Supplier;
import com.tools20022.metamodel.constraints.DeriveMMMessageSet_generatedSyntax;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMEncoding;
import java.util.Collections;
import com.tools20022.metamodel.MMMessageDefinition;
import java.util.Optional;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;/**
 * A set of MessageDefinitions
 */
public class MMMessageSet implements MMTopLevelCatalogueEntry {

	protected Supplier<List<MMEncoding>> validEncoding_lazy;
	protected Supplier<List<MMMessageDefinition>> messageDefinition_lazy;
	protected Supplier<MMBusinessProcessCatalogue> businessProcessCatalogue_lazy;
	protected String name;
	protected String definition;
	protected Supplier<List<MMSemanticMarkup>> semanticMarkup_lazy;
	protected Supplier<List<MMDoclet>> doclet_lazy;
	protected List<String> example;
	protected Supplier<List<MMConstraint>> constraint_lazy;
	protected MMRegistrationStatus registrationStatus;
	protected Date removalDate;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMBusinessProcessCatalogue getContainer() {
		return getBusinessProcessCatalogue();
	}

	@Override
	public MetamodelType<? extends MMMessageSet> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageSet> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageSet.class);
	}

	/**
	 * identification of the syntax for a specific EncodingScheme
	 * @see MMSyntax#getGeneratedFor()
	 */
	@Derived
	@Opposite(bean = MMSyntax.class, attribute = "generatedFor")
	public List<MMSyntax> getGeneratedSyntax() {
		return (new DeriveMMMessageSet_generatedSyntax()).apply(this);
	}

	/**
	 * the set of encodings considered ISO 20022 valid for this MessageSet
	 * @see MMEncoding#getMessageSet()
	 */
	@Opposite(bean = MMEncoding.class, attribute = "messageSet")
	public List<MMEncoding> getValidEncoding() {
		return validEncoding_lazy == null ? Collections.emptyList()
				: validEncoding_lazy.get();
	}

	/**
	 * the MessageDefinition that belongs to the MessageSet
	 * @see MMMessageDefinition#getMessageSet()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "messageSet")
	public List<MMMessageDefinition> getMessageDefinition() {
		return messageDefinition_lazy == null ? Collections.emptyList()
				: messageDefinition_lazy.get();
	}

	@Override
	public MMBusinessProcessCatalogue getBusinessProcessCatalogue() {
		return businessProcessCatalogue_lazy.get();
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
		return semanticMarkup_lazy == null ? Collections.emptyList()
				: semanticMarkup_lazy.get();
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet_lazy == null ? Collections.emptyList() : doclet_lazy
				.get();
	}

	@Override
	public List<String> getExample() {
		return example == null ? Collections.emptyList() : example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint_lazy == null ? Collections.emptyList()
				: constraint_lazy.get();
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
		return nextVersions_lazy == null ? Collections.emptyList()
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
	} }