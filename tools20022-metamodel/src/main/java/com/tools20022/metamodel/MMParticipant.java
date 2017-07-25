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
	private MMBusinessTransaction businessTransaction;
	private List<MMReceive> receives;
	private List<MMSend> sends;
	private MMBusinessRole businessRoleTrace;
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
	private Optional<Integer> maxOccurs;
	private Optional<Integer> minOccurs;

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
		return receives;
	}

	/**
	 * The passing of information from a sending Participant to a receiving
	 * Participant
	 * 
	 * @see MMSend#getSender()
	 */
	@Opposite(bean = MMSend.class, attribute = "sender")
	public List<MMSend> getSends() {
		return sends;
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

	@Override
	public Optional<Integer> getMaxOccurs() {
		return maxOccurs;
	}

	@Override
	public Optional<Integer> getMinOccurs() {
		return minOccurs;
	}
}