package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMMessageDefinition;
import java.util.Optional;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMSemanticMarkup;
import java.util.List;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * syntax processable notation used to define the structure of a MessageInstance
 * in a particular syntax
 */
public class MMSyntaxMessageScheme implements MMTopLevelCatalogueEntry {

	private GeneratedMetamodelBean container;
	private Optional<MMMessageDefinition> messageDefinitionTrace;
	private MMBusinessProcessCatalogue businessProcessCatalogue;
	private String name;
	private Optional<String> definition;
	private List<MMSemanticMarkup> semanticMarkup;
	private List<MMDoclet> doclet;
	private List<String> example;
	private List<MMConstraint> constraint;
	private MMRegistrationStatus registrationStatus;
	private Optional<Date> removalDate;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMSyntaxMessageScheme> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMSyntaxMessageScheme> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMSyntaxMessageScheme.class);
	}

	/**
	 * the MessageDefinitionTrace from the SyntaxMessageScheme to the
	 * MessageDefinition
	 * 
	 * @see MMMessageDefinition#getDerivation()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "derivation")
	public Optional<MMMessageDefinition> getMessageDefinitionTrace() {
		return messageDefinitionTrace;
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
}