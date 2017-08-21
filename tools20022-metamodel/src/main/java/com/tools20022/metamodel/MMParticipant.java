package com.tools20022.metamodel;

import com.tools20022.metamodel.MMBusinessTransaction;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMMultiplicityEntity;
import java.util.function.Supplier;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import com.tools20022.metamodel.MMReceive;
import java.util.List;
import java.util.Collections;
import com.tools20022.metamodel.MMSend;
import com.tools20022.metamodel.MMBusinessRole;
import java.util.Optional;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

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
	public MMBusinessTransaction getContainer() {
		return getBusinessTransaction();
	}

	@Override
	public MetamodelType<? extends MMParticipant> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMParticipant> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMParticipant.class);
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
		return receives_lazy == null ? Collections.emptyList() : receives_lazy
				.get();
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