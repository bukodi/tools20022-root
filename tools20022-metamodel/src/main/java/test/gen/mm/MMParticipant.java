package test.gen.mm;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMRepositoryConcept;
import test.gen.mm.MMMultiplicityEntity;
import test.gen.mm.MMBusinessTransaction;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import test.gen.mm.MMReceive;
import java.util.List;
import test.gen.mm.MMSend;
import test.gen.mm.MMBusinessRole;
import java.util.Optional;
import test.gen.mm.MMSemanticMarkup;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

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