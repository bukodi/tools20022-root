package test.gen.mm;

import test.gen.mm.MMRepositoryConcept;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMParticipant;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMBusinessProcess;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import java.util.Optional;
import test.gen.mm.MMSemanticMarkup;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * Functional role played by a business actor in a particular BusinessProcess or
 * BusinessTransaction.
 */
public class MMBusinessRole implements MMRepositoryConcept {

	private GeneratedMetamodelBean container;
	private List<MMParticipant> businessRoleTrace;
	private MMBusinessProcess businessProcess;
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

	public static interface Members extends MMRepositoryConcept.Members {
		/**
		 * the BusinessRoleTrace for a BusinessRole
		 */
		MetamodelAttribute<MMBusinessRole, List<MMParticipant>> businessRoleTrace = newAttribute();
		/**
		 * the BusinessProcess that owns the BusinessRole
		 */
		MetamodelAttribute<MMBusinessRole, MMBusinessProcess> businessProcess = newAttribute();
	}

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
		return businessRoleTrace;
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