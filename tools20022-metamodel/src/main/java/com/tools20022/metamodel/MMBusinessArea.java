package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMMessageDefinition;
import java.util.List;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import java.util.Optional;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * Set of strongly related business activities, that provide a self-standing
 * business value to a set of BusinessRoles.
 */
public class MMBusinessArea implements MMTopLevelCatalogueEntry {

	private GeneratedMetamodelBean container;
	private String code;
	private List<MMMessageDefinition> messageDefinition;
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
	public MetamodelType<? extends MMBusinessArea> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessArea> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessArea.class);
	}

	/**
	 * The value of the BusinessArea code.
	 */
	public String getCode() {
		return code;
	}

	/**
	 * The MessageDefinition that belongs to the BusinessArea.
	 * 
	 * @see MMMessageDefinition#getBusinessArea()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "businessArea")
	@Containment
	public List<MMMessageDefinition> getMessageDefinition() {
		return messageDefinition;
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