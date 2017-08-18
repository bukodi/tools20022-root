package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMSyntax;
import java.util.List;
import com.tools20022.metamodel.constraints.DeriveMMMessageSet_generatedSyntax;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMEncoding;
import java.util.Collections;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import java.util.Optional;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * A set of MessageDefinitions
 */
public class MMMessageSet implements MMTopLevelCatalogueEntry {

	private GeneratedMetamodelBean container;
	protected List<MMEncoding> validEncoding;
	protected List<MMMessageDefinition> messageDefinition;
	protected MMBusinessProcessCatalogue businessProcessCatalogue;
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

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
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
	 * 
	 * @see MMSyntax#getGeneratedFor()
	 */
	@Derived
	@Opposite(bean = MMSyntax.class, attribute = "generatedFor")
	public List<MMSyntax> getGeneratedSyntax() {
		return (new DeriveMMMessageSet_generatedSyntax()).apply(this);
	}

	/**
	 * the set of encodings considered ISO 20022 valid for this MessageSet
	 * 
	 * @see MMEncoding#getMessageSet()
	 */
	@Opposite(bean = MMEncoding.class, attribute = "messageSet")
	public List<MMEncoding> getValidEncoding() {
		return validEncoding == null ? Collections.emptyList() : validEncoding;
	}

	/**
	 * the MessageDefinition that belongs to the MessageSet
	 * 
	 * @see MMMessageDefinition#getMessageSet()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "messageSet")
	public List<MMMessageDefinition> getMessageDefinition() {
		return messageDefinition == null
				? Collections.emptyList()
				: messageDefinition;
	}

	@Override
	public MMBusinessProcessCatalogue getBusinessProcessCatalogue() {
		return businessProcessCatalogue;
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
}