package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMParticipant;
import java.util.List;
import java.util.Collections;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMBusinessProcess;
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

	private GeneratedMetamodelBean container;
	protected List<MMParticipant> businessRoleTrace;
	protected MMBusinessProcess businessProcess;
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
		return businessRoleTrace == null
				? Collections.emptyList()
				: businessRoleTrace;
	}

	/**
	 * the BusinessProcess that owns the BusinessRole
	 * 
	 * @see MMBusinessProcess#getBusinessRole()
	 */
	@Opposite(bean = MMBusinessProcess.class, attribute = "businessRole")
	@Container
	public MMBusinessProcess getBusinessProcess() {
		return businessProcess;
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