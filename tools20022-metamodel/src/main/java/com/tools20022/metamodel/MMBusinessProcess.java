package com.tools20022.metamodel;


import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMBusinessProcess;
import java.util.List;
import java.util.function.Supplier;
import java.util.Collections;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMBusinessRole;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.metamodel.MMBusinessTransaction;
import java.util.Optional;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;/**
 * unrealized definition of the business activities undertaken by BusinessRoles within a BusinessArea whereby each BusinessProcess fulfils one type of business activity and whereby a BusinessProcess may include and extend other BusinessProcesses
 */
public class MMBusinessProcess implements MMTopLevelCatalogueEntry {

	protected Supplier<List<MMBusinessProcess>> extender_lazy;
	protected Supplier<List<MMBusinessProcess>> extended_lazy;
	protected Supplier<List<MMBusinessProcess>> included_lazy;
	protected Supplier<List<MMBusinessProcess>> includer_lazy;
	protected Supplier<List<MMBusinessRole>> businessRole_lazy;
	protected Supplier<List<MMBusinessTransaction>> businessProcessTrace_lazy;
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
	public MetamodelType<? extends MMBusinessProcess> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessProcess> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessProcess.class);
	}

	/**
	 * specifies the BusinessProcess that is extending another BusinessProcess
	 * @see MMBusinessProcess#getExtended()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "extended")
	public List<MMBusinessProcess> getExtender() {
		return extender_lazy == null ? Collections.emptyList() : extender_lazy
				.get();
	}

	/**
	 * specifies the BusinessProcess that is extended by another BusinessProcess
	 * @see MMBusinessProcess#getExtender()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "extender")
	public List<MMBusinessProcess> getExtended() {
		return extended_lazy == null ? Collections.emptyList() : extended_lazy
				.get();
	}

	/**
	 * specifies the BusinessProcess that is included by another BusinessProcess
	 * @see MMBusinessProcess#getIncluder()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "includer")
	public List<MMBusinessProcess> getIncluded() {
		return included_lazy == null ? Collections.emptyList() : included_lazy
				.get();
	}

	/**
	 * specifies the BusinessProcess that is incuding another BusinessProcess
	 * @see MMBusinessProcess#getIncluded()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "included")
	public List<MMBusinessProcess> getIncluder() {
		return includer_lazy == null ? Collections.emptyList() : includer_lazy
				.get();
	}

	/**
	 * the BusinessRole that plays a role in BusinessProcess that owns it.
	 * @see MMBusinessRole#getBusinessProcess()
	 */
	@Opposite(bean = MMBusinessRole.class, attribute = "businessProcess")
	@Containment
	public List<MMBusinessRole> getBusinessRole() {
		return businessRole_lazy == null ? Collections.emptyList()
				: businessRole_lazy.get();
	}

	/**
	 * @see MMBusinessTransaction#getBusinessProcessTrace()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "businessProcessTrace")
	public List<MMBusinessTransaction> getBusinessProcessTrace() {
		return businessProcessTrace_lazy == null ? Collections.emptyList()
				: businessProcessTrace_lazy.get();
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