package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMMultiplicityEntity;
import com.tools20022.metamodel.MMBusinessTransaction;
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

	private GeneratedMetamodelBean container;
	protected MMBusinessTransaction businessTransaction;
	protected List<MMReceive> receives;
	protected List<MMSend> sends;
	protected MMBusinessRole businessRoleTrace;
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
	protected Integer maxOccurs;
	protected Integer minOccurs;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
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
		return businessTransaction;
	}

	/**
	 * The handling of a stimulus passed from a sending participant
	 * 
	 * @see MMReceive#getReceiver()
	 */
	@Opposite(bean = MMReceive.class, attribute = "receiver")
	public List<MMReceive> getReceives() {
		return receives == null ? Collections.emptyList() : receives;
	}

	/**
	 * The passing of information from a sending Participant to a receiving
	 * Participant
	 * 
	 * @see MMSend#getSender()
	 */
	@Opposite(bean = MMSend.class, attribute = "sender")
	public List<MMSend> getSends() {
		return sends == null ? Collections.emptyList() : sends;
	}

	/**
	 * the BusinessRoleTrace that traces the Participant to its BusinessRole
	 * 
	 * @see MMBusinessRole#getBusinessRoleTrace()
	 */
	@Opposite(bean = MMBusinessRole.class, attribute = "businessRoleTrace")
	public MMBusinessRole getBusinessRoleTrace() {
		return businessRoleTrace;
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

	@Override
	public Optional<Integer> getMaxOccurs() {
		return Optional.ofNullable(maxOccurs);
	}

	@Override
	public Optional<Integer> getMinOccurs() {
		return Optional.ofNullable(minOccurs);
	}
}