package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMBusinessProcess;
import java.util.List;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMBusinessRole;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.metamodel.MMBusinessTransaction;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import java.util.Optional;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * unrealized definition of the business activities undertaken by BusinessRoles
 * within a BusinessArea whereby each BusinessProcess fulfils one type of
 * business activity and whereby a BusinessProcess may include and extend other
 * BusinessProcesses
 */
public class MMBusinessProcess implements MMTopLevelCatalogueEntry {

	private GeneratedMetamodelBean container;
	protected List<MMBusinessProcess> extender;
	protected List<MMBusinessProcess> extended;
	protected List<MMBusinessProcess> included;
	protected List<MMBusinessProcess> includer;
	protected List<MMBusinessRole> businessRole;
	protected List<MMBusinessTransaction> businessProcessTrace;
	protected MMBusinessProcessCatalogue businessProcessCatalogue;
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

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMBusinessProcess> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessProcess> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessProcess.class);
	}

	/**
	 * specifies the BusinessProcess that is extending another BusinessProcess
	 * 
	 * @see MMBusinessProcess#getExtended()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "extended")
	public List<MMBusinessProcess> getExtender() {
		return extender;
	}

	/**
	 * specifies the BusinessProcess that is extended by another BusinessProcess
	 * 
	 * @see MMBusinessProcess#getExtender()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "extender")
	public List<MMBusinessProcess> getExtended() {
		return extended;
	}

	/**
	 * specifies the BusinessProcess that is included by another BusinessProcess
	 * 
	 * @see MMBusinessProcess#getIncluder()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "includer")
	public List<MMBusinessProcess> getIncluded() {
		return included;
	}

	/**
	 * specifies the BusinessProcess that is incuding another BusinessProcess
	 * 
	 * @see MMBusinessProcess#getIncluded()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "included")
	public List<MMBusinessProcess> getIncluder() {
		return includer;
	}

	/**
	 * the BusinessRole that plays a role in BusinessProcess that owns it.
	 * 
	 * @see MMBusinessRole#getBusinessProcess()
	 */
	@Opposite(bean = MMBusinessRole.class, attribute = "businessProcess")
	@Containment
	public List<MMBusinessRole> getBusinessRole() {
		return businessRole;
	}

	/**
	 * @see MMBusinessTransaction#getBusinessProcessTrace()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "businessProcessTrace")
	public List<MMBusinessTransaction> getBusinessProcessTrace() {
		return businessProcessTrace;
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