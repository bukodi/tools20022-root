package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Container;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * involvement of a BusinessRole in a BusinessTransaction
 */
public class MMParticipant implements MMRepositoryConcept, MMMultiplicityEntity {

	protected Supplier<MMBusinessTransaction> businessTransaction_lazy;
	protected Supplier<List<MMReceive>> receives_lazy;
	protected Supplier<List<MMSend>> sends_lazy;
	protected Supplier<MMBusinessRole> businessRoleTrace_lazy;
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
	protected Integer maxOccurs;
	protected Integer minOccurs;

	@Override
	public MMBusinessTransaction getContainer() {
		return getBusinessTransaction();
	}

	@Override
	public MetamodelType<? extends MMParticipant> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMParticipant> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMParticipant.class);
	}

	/**
	 * the BusinessTransaction in which the Participant plays a role
	 * 
	 * @see MMBusinessTransaction#getParticipant()
	 */
	@Opposite(bean = MMBusinessTransaction.class, attribute = "participant")
	@Container
	public MMBusinessTransaction getBusinessTransaction() {
		return businessTransaction_lazy.get();
	}

	/**
	 * The handling of a stimulus passed from a sending participant
	 * 
	 * @see MMReceive#getReceiver()
	 */
	@Opposite(bean = MMReceive.class, attribute = "receiver")
	public List<MMReceive> getReceives() {
		return receives_lazy == null ? Collections.emptyList() : receives_lazy.get();
	}

	/**
	 * The passing of information from a sending Participant to a receiving
	 * Participant
	 * 
	 * @see MMSend#getSender()
	 */
	@Opposite(bean = MMSend.class, attribute = "sender")
	public List<MMSend> getSends() {
		return sends_lazy == null ? Collections.emptyList() : sends_lazy.get();
	}

	/**
	 * the BusinessRoleTrace that traces the Participant to its BusinessRole
	 * 
	 * @see MMBusinessRole#getBusinessRoleTrace()
	 */
	@Opposite(bean = MMBusinessRole.class, attribute = "businessRoleTrace")
	public MMBusinessRole getBusinessRoleTrace() {
		return businessRoleTrace_lazy.get();
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
		return semanticMarkup_lazy == null ? Collections.emptyList() : semanticMarkup_lazy.get();
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet_lazy == null ? Collections.emptyList() : doclet_lazy.get();
	}

	@Override
	public List<String> getExample() {
		return example == null ? Collections.emptyList() : example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint_lazy == null ? Collections.emptyList() : constraint_lazy.get();
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate == null ? Optional.empty() : Optional.of(removalDate);
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null ? Collections.emptyList() : nextVersions_lazy.get();
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion_lazy == null ? Optional.empty() : Optional.of(previousVersion_lazy.get());
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier == null ? Optional.empty() : Optional.of(objectIdentifier);
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