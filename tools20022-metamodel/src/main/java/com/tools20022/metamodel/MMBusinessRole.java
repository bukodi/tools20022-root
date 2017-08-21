package com.tools20022.metamodel;

import com.tools20022.metamodel.MMBusinessProcess;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMParticipant;
import java.util.List;
import java.util.function.Supplier;
import java.util.Collections;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import java.util.Optional;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * Functional role played by a business actor in a particular BusinessProcess or
 * BusinessTransaction.
 */
public class MMBusinessRole implements MMRepositoryConcept {

	protected Supplier<List<MMParticipant>> businessRoleTrace_lazy;
	protected Supplier<MMBusinessProcess> businessProcess_lazy;
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

	@Override
	public MMBusinessProcess getContainer() {
		return getBusinessProcess();
	}

	@Override
	public MetamodelType<? extends MMBusinessRole> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessRole> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessRole.class);
	}

	/**
	 * the BusinessRoleTrace for a BusinessRole
	 * 
	 * @see MMParticipant#getBusinessRoleTrace()
	 */
	@Opposite(bean = MMParticipant.class, attribute = "businessRoleTrace")
	public List<MMParticipant> getBusinessRoleTrace() {
		return businessRoleTrace_lazy == null
				? Collections.emptyList()
				: businessRoleTrace_lazy.get();
	}

	/**
	 * the BusinessProcess that owns the BusinessRole
	 * 
	 * @see MMBusinessProcess#getBusinessRole()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "businessRole")
	@Container
	public MMBusinessProcess getBusinessProcess() {
		return businessProcess_lazy.get();
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
}